package com.jagex.game.client;



public class NativeLibraries {

	public static NativeLibraryLoader field5077;

	public NativeLibraries() throws Throwable {
		throw new Error();
	}

	public static void method14694(NativeLibraryLoader arg0) {
		if (field5077 != null) {
			throw new IllegalStateException("");
		}
		field5077 = arg0;
	}

	public static NativeLibraryLoader getLoader() {
		if (field5077 == null) {
			throw new IllegalStateException("");
		}
		return field5077;
	}

	public static boolean method14526() {
		return field5077 != null;
	}
}
