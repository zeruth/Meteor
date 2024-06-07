package com.jagex.game.client;

import deob.ObfuscatedName;

public class JavascriptFunction {

    public static final JavascriptFunction field4036 = new JavascriptFunction(3);

    public static final JavascriptFunction field4024 = new JavascriptFunction(7);

    public static final JavascriptFunction ACCOUNT_CREATED = new JavascriptFunction(9);

    public static final JavascriptFunction ACCOUNT_CREATE_STARTED = new JavascriptFunction(11);

    public static final JavascriptFunction field4027 = new JavascriptFunction(1);

    public static final JavascriptFunction ADVERT_PLAY = new JavascriptFunction(6);

    public static final JavascriptFunction ADVERT_FORCE_REMOVE = new JavascriptFunction(5);

    public static final JavascriptFunction ADVERT_ALLOW_SKIP = new JavascriptFunction(2);

    public static final JavascriptFunction ADVERT_FINISHED = new JavascriptFunction(4);

    public static final JavascriptFunction field4032 = new JavascriptFunction(8);

    public static final JavascriptFunction field4033 = new JavascriptFunction(13);

    public static final JavascriptFunction field4034 = new JavascriptFunction(10);

    public static final JavascriptFunction field4035 = new JavascriptFunction(12);

    public final int field4025;

	public JavascriptFunction(int arg0) {
		this.field4025 = arg0;
	}

    public String method6087() {
		return "_" + this.field4025;
	}

    public Object method6097(Object[] arg0) throws Throwable {
		return BrowserControl.call(GameShell.field11885, this.method6087(), arg0);
	}

    public Object method6088() throws Throwable {
		return BrowserControl.call(GameShell.field11885, this.method6087());
	}

    public void method6089(Object[] arg0) {
		try {
			this.method6097(arg0);
		} catch (Throwable var3) {
		}
	}

    public void method6090() {
		try {
			this.method6088();
		} catch (Throwable var2) {
		}
	}
}
