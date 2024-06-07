package com.jagex.core.utils;



import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class CacheUtil {

    public static boolean field6627 = false;

    public static File field6626;

    public static Hashtable field6628 = new Hashtable(16);

	public CacheUtil() throws Throwable {
		throw new Error();
	}

    public static void method3546(File arg0) {
		field6626 = arg0;
		if (!field6626.exists()) {
			throw new RuntimeException("");
		}
		field6627 = true;
	}

    public static String method9844() {
		return field6626.getAbsolutePath();
	}

    public static File method18852(String arg0) {
		if (!field6627) {
			throw new RuntimeException("");
		}
		File var1 = (File) field6628.get(arg0);
		if (var1 != null) {
			return var1;
		}
		File var2 = new File(field6626, arg0);
		RandomAccessFile var3 = null;
		try {
			File var4 = new File(var2.getParent());
			if (!var4.exists()) {
				throw new RuntimeException("");
			}
			var3 = new RandomAccessFile(var2, "rw");
			int var5 = var3.read();
			var3.seek(0L);
			var3.write(var5);
			var3.seek(0L);
			var3.close();
			field6628.put(arg0, var2);
			return var2;
		} catch (Exception var10) {
			try {
				if (var3 != null) {
					var3.close();
					Object var7 = null;
				}
			} catch (Exception var9) {
			}
			throw new RuntimeException();
		}
	}
}
