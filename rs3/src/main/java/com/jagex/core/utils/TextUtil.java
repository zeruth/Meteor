package com.jagex.core.utils;

import deob.ObfuscatedName;

public class TextUtil {

    public static String TRUE = "true";

    public static String COMMA = ",";

    public static String OPEN_PARENTHESIS = " (";

    public static String CLOSE_PARENTHESIS = ")";

    public static String ARROW = "->";

    public static String BR = "<br>";

    public static String ENDCOL = "</col>";

    public static String NAME = "<name>";

	public TextUtil() throws Throwable {
		throw new Error();
	}

    public static String imgTag(int arg0) {
		return "<img=" + arg0 + ">";
	}

    public static String colTag(int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}
}
