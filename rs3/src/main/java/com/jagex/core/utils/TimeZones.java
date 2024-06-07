package com.jagex.core.utils;

import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class TimeZones {

    public static final HashMap field2008 = new HashMap();

    public static final Calendar field2009 = Calendar.getInstance(method3626("Europe/London"));

    public static Map field2010;

	public TimeZones() throws Throwable {
		throw new Error();
	}

    public static String method3647(Date arg0, String arg1) {
		return method3624(arg0, arg1, method3625(), Language.EN);
	}

    public static String method3624(Date arg0, String arg1, TimeZone arg2, Language arg3) {
		if (field2010 == null) {
			field2010 = new HashMap(7);
			Language[] var4 = Language.values();
			for (int var5 = 0; var5 < var4.length; var5++) {
				Language var6 = var4[var5];
				field2010.put(var6, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue var7 = (ConcurrentLinkedQueue) field2010.get(arg3);
		SimpleDateFormat var8 = (SimpleDateFormat) var7.poll();
		if (var8 == null) {
			var8 = new SimpleDateFormat(arg1, arg3.getLocale());
		} else {
			var8.applyPattern(arg1);
		}
		var8.setTimeZone(arg2);
		String var9 = var8.format(arg0);
		var7.add(var8);
		return var9;
	}

    public static TimeZone method3625() {
		return method3626("Europe/London");
	}

    public static TimeZone method3626(String arg0) {
		HashMap var1 = field2008;
		synchronized (field2008) {
			TimeZone var2 = (TimeZone) field2008.get(arg0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(arg0);
				field2008.put(arg0, var2);
			}
			return var2;
		}
	}

    public static int method3627(Date arg0, TimeZone arg1) {
		Calendar var2 = field2009;
		synchronized (field2009) {
			field2009.setTimeZone(arg1);
			field2009.setTime(arg0);
			return field2009.get(1);
		}
	}

    public static int method3623(Date arg0, TimeZone arg1) {
		Calendar var2 = field2009;
		synchronized (field2009) {
			field2009.setTimeZone(arg1);
			field2009.setTime(arg0);
			return field2009.get(2) + 1;
		}
	}

    public static int method3628(Date arg0, TimeZone arg1) {
		Calendar var2 = field2009;
		synchronized (field2009) {
			field2009.setTimeZone(arg1);
			field2009.setTime(arg0);
			return field2009.get(5);
		}
	}

    public static Date getRuneDay(int arg0) {
		return new Date((long) (arg0 + 11745) * 86400000L);
	}
}
