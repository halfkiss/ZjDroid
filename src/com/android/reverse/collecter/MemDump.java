package com.android.reverse.collecter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.android.reverse.util.NativeFunction;

public class MemDump {

	private static void saveByteBuffer(OutputStream out, ByteBuffer data) {
		data.order(ByteOrder.LITTLE_ENDIAN);
		byte[] buffer = new byte[8192];
		data.clear();
		while (data.hasRemaining()) {
			int count = Math.min(buffer.length, data.remaining());
			data.get(buffer, 0, count);
			try {
				out.write(buffer, 0, count);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public static void dumpMem(String filepath, int start, int length) {
		ByteBuffer buffer = NativeFunction.dumpMemory(start, length);
		File file = new File(filepath);
		if (!file.exists()) {
			try {
				file.createNewFile();
				file.setWritable(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			saveByteBuffer(new FileOutputStream(file), buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void dumpMem(OutputStream outstream, int start, int length) {
		ByteBuffer buffer = NativeFunction.dumpMemory(start, length);
		saveByteBuffer(outstream, buffer);

	}

}
