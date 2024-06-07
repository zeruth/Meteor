package com.jagex.graphics;

import deob.ObfuscatedName;

public class RendererException extends Exception {

    public final int field11892;

	public RendererException() throws Throwable {
		throw new Error();
	}

    public int getErrorCode() {
		return this.field11892;
	}
}
