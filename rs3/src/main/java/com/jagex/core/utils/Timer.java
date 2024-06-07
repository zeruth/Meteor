package com.jagex.core.utils;

import deob.ObfuscatedName;

public abstract class Timer {

    public static Timer method6109() {
		try {
			return new MillisTimer();
		} catch (Throwable var1) {
			return new NanoTimer();
		}
	}

    public final int method8158(long arg0) {
		long var3 = this.method8159();
		if (var3 > 0L) {
			PreciseSleep.sleep(var3);
		}
		return this.method8160(arg0);
	}

    public abstract void method8156();

    public abstract long method8159();

    public abstract int method8160(long arg0);

    public abstract long method8173();
}
