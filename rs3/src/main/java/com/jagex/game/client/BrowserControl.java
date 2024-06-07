package com.jagex.game.client;

import deob.ObfuscatedName;

import java.applet.Applet;

import netscape.javascript.JSObject;

public class BrowserControl {

	public BrowserControl() throws Throwable {
		throw new Error();
	}

    public static void eval(Applet arg0, String arg1) throws Throwable {
		//TODO: Fix
		//JSObject.getWindow(arg0).eval(arg1);
	}

    public static Object call(Applet arg0, String arg1) throws Throwable {
		//TODO: Fix
		return null; // JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

    public static Object call(Applet arg0, String arg1, Object[] arg2) throws Throwable {
		//TODO: Fix
		return null; // JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
