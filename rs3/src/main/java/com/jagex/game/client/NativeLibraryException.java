package com.jagex.game.client;

import deob.ObfuscatedName;

public class NativeLibraryException extends Exception {

    public final String field11894;

    public final int field11895;

	public NativeLibraryException(int arg0, String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	public NativeLibraryException(int arg0, String arg1, Throwable arg2) {
		super(arg2);
		this.field11894 = arg1;
		this.field11895 = arg0;
	}
}
