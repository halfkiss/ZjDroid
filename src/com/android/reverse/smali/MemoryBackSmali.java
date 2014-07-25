package com.android.reverse.smali;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.jf.baksmali.baksmaliOptions;
import org.jf.baksmali.Adaptors.ClassDefinition;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.analysis.ClassPath;
import org.jf.dexlib2.analysis.CustomInlineMethodResolver;
import org.jf.dexlib2.dexbacked.DexBackedClassDef;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.MemoryDexFileItemPointer;
import org.jf.dexlib2.dexbacked.MemoryReader;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.util.SyntheticAccessorResolver;
import org.jf.util.ClassFileNameHandler;
import org.jf.util.IndentingWriter;

import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.util.Logger;
import com.android.reverse.util.NativeFunction;
import com.google.common.collect.Ordering;

public class MemoryBackSmali {

	private static baksmaliOptions configOptions() {

		baksmaliOptions options = new baksmaliOptions();
		options.apiLevel = ModuleContext.getInstance().getApiLevel();
		options.outputDirectory = ModuleContext.getInstance().getAppContext().getFilesDir().getAbsolutePath()+"/smali";
		options.allowOdex = true;
		options.deodex = true;
		options.jobs = 8;
		options.bootClassPathDirs.add("/system/framework/");
		if (options.apiLevel >= 17) {
			options.checkPackagePrivateAccess = true;
		}
		options.registerInfo = 128;
		options.noAccessorComments = false;
		options.useLocalsDirective = true;
		options.noParameterRegisters = false;
		options.useSequentialLabels = true;
		options.outputDebugInfo = true;
		options.addCodeOffsets = false;
		return options;
	}

	public static boolean disassembleDexFile(int mCookie, String outDexName) {

		long startTime = System.currentTimeMillis();
		Logger.log("start disassemble the mCookie " + mCookie);
		final baksmaliOptions options = configOptions();

		File outputDirectoryFile = new File(options.outputDirectory);
		if (!outputDirectoryFile.exists()) {
			if (!outputDirectoryFile.mkdirs()) {
				Logger.log("Can't create the output directory "
						+ options.outputDirectory);
				return false;
			}
		}

		Opcodes opcodes = new Opcodes(ModuleContext.getInstance().getApiLevel());

		MemoryReader reader = new NativeFunction();
		MemoryDexFileItemPointer pointer = NativeFunction
				.queryDexFileItemPointer(mCookie);
		DexBackedDexFile mmDexFile = new DexBackedDexFile(opcodes, pointer,
				reader);

		options.bootClassPathEntries = getDefaultBootClassPathForApi(options.apiLevel);
		options.classPath = ClassPath.fromClassPath(options.bootClassPathDirs,
				options.bootClassPathEntries, mmDexFile, options.apiLevel);
		String inlineString = NativeFunction.getInlineOperation();
		options.inlineResolver = new CustomInlineMethodResolver(
				options.classPath, inlineString);

		List<? extends ClassDef> classDefs = Ordering.natural().sortedCopy(
				mmDexFile.getClasses());

		if (!options.noAccessorComments) {
			options.syntheticAccessorResolver = new SyntheticAccessorResolver(
					classDefs);
		}

		final ClassFileNameHandler fileNameHandler = new ClassFileNameHandler(
				outputDirectoryFile, ".smali");

		ExecutorService executor = Executors.newFixedThreadPool(options.jobs);
		List<Future<Boolean>> tasks = new ArrayList<Future<Boolean>>();

		for (final ClassDef classDef : classDefs) {
			tasks.add(executor.submit(new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					return disassembleClass(classDef, fileNameHandler, options);
				}
			}));
		}

		boolean errorOccurred = false;
		try {
			for (Future<Boolean> task : tasks) {
				while (true) {
					try {
						if (!task.get()) {
							errorOccurred = true;
						}
					} catch (InterruptedException ex) {
						continue;
					} catch (ExecutionException ex) {
						throw new RuntimeException(ex);
					}
					break;
				}
			}
		} finally {
			executor.shutdown();
		}

		Logger.log("end disassemble the mCookie: cost time = "
				+ ((System.currentTimeMillis() - startTime) / 1000) +"s");
		startTime = System.currentTimeMillis();
		Logger.log("start build the smali files to dex");
		boolean result = DexFileBuilder.buildDexFile(options.outputDirectory,outDexName);
		Logger.log("end build the smali files to dex: cost time = "
				+ ((System.currentTimeMillis() - startTime) / 1000)+"s");
		if (result) {
			try {
				Runtime.getRuntime().exec("rm -rf " + options.outputDirectory);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return !errorOccurred;

	}

	private static boolean disassembleClass(ClassDef classDef,
			ClassFileNameHandler fileNameHandler, baksmaliOptions options) {

		DexBackedClassDef classdf = (DexBackedClassDef) classDef;
		if (!classdf.isValid())
			return false;
		String classDescriptor = classDef.getType();
		//Logger.log("start backsmali the class = " + classDescriptor);
		// validate that the descriptor is formatted like we expect
		if (classDescriptor.charAt(0) != 'L'
				|| classDescriptor.charAt(classDescriptor.length() - 1) != ';') {
			Logger.log("Unrecognized class descriptor - " + classDescriptor
					+ " - skipping class");
			return false;
		}

		File smaliFile = fileNameHandler
				.getUniqueFilenameForClass(classDescriptor);

		// create and initialize the top level string template
		ClassDefinition classDefinition = new ClassDefinition(options, classDef);

		// write the disassembly
		Writer writer = null;
		try {
			File smaliParent = smaliFile.getParentFile();
			if (!smaliParent.exists()) {
				if (!smaliParent.mkdirs()) {
					// check again, it's likely it was created in a different
					// thread
					if (!smaliParent.exists()) {
						Logger.log("Unable to create directory "
								+ smaliParent.toString() + " - skipping class");
						return false;
					}
				}
			}

			if (!smaliFile.exists()) {
				if (!smaliFile.createNewFile()) {
					Logger.log("Unable to create file " + smaliFile.toString()
							+ " - skipping class");
					return false;
				}
			}

			BufferedWriter bufWriter = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(smaliFile),
							"UTF8"));

			writer = new IndentingWriter(bufWriter);
			classDefinition.writeTo((IndentingWriter) writer);
		} catch (Exception ex) {
			Logger.log("\n\nError occurred while disassembling class "
					+ classDescriptor.replace('/', '.') + " - skipping class");
			ex.printStackTrace();
			// noinspection ResultOfMethodCallIgnored
			smaliFile.delete();
			return false;
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (Throwable ex) {
					Logger.log("\n\nError occurred while closing file "
							+ smaliFile.toString());
					ex.printStackTrace();
				}
			}
		}
		return true;
	}

	private static List<String> getDefaultBootClassPathForApi(int apiLevel) {
		List<String> list = new ArrayList<String>();
		if (apiLevel < 9) {
			list.add("/system/framework/core.jar");
			list.add("/system/framework/ext.jar");
			list.add("/system/framework/framework.jar");
			list.add("/system/framework/android.policy.jar");
			list.add("/system/framework/services.jar");
		} else if (apiLevel < 12) {

			list.add("/system/framework/core.jar");
			list.add("/system/framework/bouncycastle.jar");
			list.add("/system/framework/ext.jar");
			list.add("/system/framework/framework.jar");
			list.add("/system/framework/android.policy.jar");
			list.add("/system/framework/services.jar");
			list.add("/system/framework/core-junit.jar");
		} else if (apiLevel < 14) {

			list.add("/system/framework/core.jar");
			list.add("/system/framework/apache-xml.jar");
			list.add("/system/framework/bouncycastle.jar");
			list.add("/system/framework/ext.jar");
			list.add("/system/framework/framework.jar");
			list.add("/system/framework/android.policy.jar");
			list.add("/system/framework/services.jar");
			list.add("/system/framework/core-junit.jar");
		} else if (apiLevel < 16) {

			list.add("/system/framework/core.jar");
			list.add("/system/framework/core-junit.jar");
			list.add("/system/framework/bouncycastle.jar");
			list.add("/system/framework/ext.jar");
			list.add("/system/framework/framework.jar");
			list.add("/system/framework/android.policy.jar");
			list.add("/system/framework/services.jar");
			list.add("/system/framework/apache-xml.jar");
			list.add("/system/framework/filterfw.jar");

		} else {
			// this is correct as of api 17/4.2.2

			list.add("/system/framework/core.jar");
			list.add("/system/framework/core-junit.jar");
			list.add("/system/framework/bouncycastle.jar");
			list.add("/system/framework/ext.jar");
			list.add("/system/framework/framework.jar");
			list.add("/system/framework/telephony-common.jar");
			list.add("/system/framework/mms-common.jar");
			list.add("/system/framework/android.policy.jar");
			list.add("/system/framework/services.jar");
			list.add("/system/framework/apache-xml.jar");
		}
		return list;
	}

}
