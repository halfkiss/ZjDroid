package com.android.reverse.smali;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.annotation.Nonnull;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.jf.dexlib2.writer.builder.DexBuilder;
import org.jf.dexlib2.writer.io.FileDataStore;
import org.jf.smali.LexerErrorInterface;
import org.jf.smali.smaliFlexLexer;
import org.jf.smali.smaliParser;
import org.jf.smali.smaliTreeWalker;

import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.util.Logger;
import com.google.common.collect.Lists;

public class DexFileBuilder {

	public static boolean buildDexFile(String smaliPath,String dexFileName) {

		int jobs = 8;
		boolean allowOdex = false;
		boolean verboseErrors = false;
		boolean printTokens = false;

		int apiLevel = ModuleContext.getInstance().getApiLevel();

		try {
			LinkedHashSet<File> filesToProcess = new LinkedHashSet<File>();

			File argFile = new File(smaliPath);

			if (!argFile.exists()) {
				throw new RuntimeException("Cannot find file or directory \""
						+ smaliPath + "\"");
			}

			if (argFile.isDirectory()) {
				getSmaliFilesInDir(argFile, filesToProcess);
			}

			boolean errors = false;

			final DexBuilder dexBuilder = DexBuilder.makeDexBuilder(apiLevel);
			ExecutorService executor = Executors.newFixedThreadPool(jobs);
			List<Future<Boolean>> tasks = Lists.newArrayList();

			final boolean finalVerboseErrors = verboseErrors;
			final boolean finalPrintTokens = printTokens;
			final boolean finalAllowOdex = allowOdex;
			final int finalApiLevel = apiLevel;
			for (final File file : filesToProcess) {
				tasks.add(executor.submit(new Callable<Boolean>() {
					@Override
					public Boolean call() throws Exception {
						return assembleSmaliFile(file, dexBuilder,
								finalVerboseErrors, finalPrintTokens,
								finalAllowOdex, finalApiLevel);
					}
				}));
			}

			for (Future<Boolean> task : tasks) {
				while (true) {
					try {
						if (!task.get()) {
							errors = true;
						}
					} catch (InterruptedException ex) {
						continue;
					}
					break;
				}
			}

			executor.shutdown();

			if (errors) {
				Logger.log("build the dexfile error0");
				return false;
			}

			dexBuilder.writeTo(new FileDataStore(new File(dexFileName)));
			Logger.log("build the dexfile ok");
			return true;
		} catch (RuntimeException ex) {
			Logger.log("build the dexfile error1");
			return false;
		} catch (Throwable ex) {
			Logger.log("build the dexfile error2");
			return false;
		}
	}

	private static void getSmaliFilesInDir(@Nonnull File dir,
			@Nonnull Set<File> smaliFiles) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					getSmaliFilesInDir(file, smaliFiles);
				} else if (file.getName().endsWith(".smali")) {
					smaliFiles.add(file);
				}
			}
		}
	}

	private static boolean assembleSmaliFile(File smaliFile,
			DexBuilder dexBuilder, boolean verboseErrors, boolean printTokens,
			boolean allowOdex, int apiLevel) throws Exception {
		CommonTokenStream tokens;

		LexerErrorInterface lexer;

		FileInputStream fis = new FileInputStream(smaliFile.getAbsolutePath());
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

		lexer = new smaliFlexLexer(reader);
		((smaliFlexLexer) lexer).setSourceFile(smaliFile);
		tokens = new CommonTokenStream((TokenSource) lexer);

		if (printTokens) {
			tokens.getTokens();

			for (int i = 0; i < tokens.size(); i++) {
				Token token = tokens.get(i);
				if (token.getChannel() == smaliParser.HIDDEN) {
					continue;
				}

				System.out.println(smaliParser.tokenNames[token.getType()]
						+ ": " + token.getText());
			}
		}

		smaliParser parser = new smaliParser(tokens);
		parser.setVerboseErrors(verboseErrors);
		parser.setAllowOdex(allowOdex);
		parser.setApiLevel(apiLevel);

		smaliParser.smali_file_return result = parser.smali_file();

		if (parser.getNumberOfSyntaxErrors() > 0
				|| lexer.getNumberOfSyntaxErrors() > 0) {
			return false;
		}

		CommonTree t = result.getTree();

		CommonTreeNodeStream treeStream = new CommonTreeNodeStream(t);
		treeStream.setTokenStream(tokens);

		smaliTreeWalker dexGen = new smaliTreeWalker(treeStream);
		dexGen.setVerboseErrors(verboseErrors);
		dexGen.setDexBuilder(dexBuilder);
		dexGen.smali_file();

		return dexGen.getNumberOfSyntaxErrors() == 0;
	}

}
