package com.jagex.core.utils;



import java.io.*;

public final class FileUtil {

	public FileUtil() throws Throwable {
		throw new Error();
	}

    public static void method3662(File arg0, byte[] arg1, int arg2) throws IOException {
		DataInputStream var3 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			var3.readFully(arg1, 0, arg2);
		} catch (EOFException var5) {
		}
		var3.close();
	}

    public static byte[] method993(File arg0, int arg1) {
		try {
			byte[] var2 = new byte[arg1];
			method3662(arg0, var2, arg1);
			return var2;
		} catch (IOException var4) {
			return null;
		}
	}

    public static byte[] method3587(File arg0) {
		return method993(arg0, (int) arg0.length());
	}
}
