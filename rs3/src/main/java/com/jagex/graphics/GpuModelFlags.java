package com.jagex.graphics;

import deob.ObfuscatedName;

public class GpuModelFlags {

	public GpuModelFlags() throws Throwable {
		throw new Error();
	}

    public static final boolean method5435(int arg0, int arg1) {
		return (arg0 & 0x21) != 0;
	}

    public static final boolean method5436(int arg0, int arg1) {
		return (arg0 & 0x22) != 0;
	}

    public static final boolean method5437(int arg0, int arg1) {
		return (arg0 & 0x34) != 0;
	}

    public static final boolean method5530(int arg0, int arg1) {
		return (arg0 & 0x37) != 0;
	}

    public static final boolean method5439(int arg0, int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

    public static final boolean method5471(int arg0, int arg1) {
		return (arg0 & 0x84080) != 0;
	}

    public static final boolean method5458(int arg0, int arg1) {
		return (arg0 & 0x100) != 0;
	}

    public static final boolean method5514(int arg0, int arg1) {
		return false;
	}

    public static final boolean method5443(int arg0, int arg1) {
		return (arg0 & 0x10) != 0;
	}

    public static final boolean method5434(int arg0, int arg1) {
		return (arg0 & 0x8000) != 0;
	}

    public static final boolean method5445(int arg0, int arg1) {
		return (arg0 & 0xC580) != 0;
	}

    public static final boolean method5455(int arg0, int arg1) {
		return (arg0 & 0x10000) != 0;
	}

    public static final boolean method5438(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

    public static final boolean method5448(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

    public static final boolean method5449(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

    public static final boolean method5450(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

    public static final boolean method5451(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

    public static final boolean method5452(int arg0, int arg1) {
		return (method5435(arg0, arg1) | method5436(arg0, arg1) | method5437(arg0, arg1)) & method5438(arg0, arg1);
	}

    public static final boolean method5527(int arg0, int arg1) {
		return method5448(arg0, arg1) & ((arg0 & 0x2000) != 0 | method5439(arg0, arg1) | method5455(arg0, arg1));
	}

    public static final boolean method5454(int arg0, int arg1) {
		if (method5449(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method5471(arg0, arg1) | method5458(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method5439(arg0, arg1) | method5455(arg0, arg1));
		} else {
			return false;
		}
	}

    public static final boolean method5491(int arg0, int arg1) {
		return method5514(arg0, arg1) & method5450(arg0, arg1);
	}

    public static final boolean method5456(int arg0, int arg1) {
		return method5443(arg0, arg1) & method5451(arg0, arg1);
	}

    public static final boolean method5529(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method5435(arg0, arg1) || method5452(arg0, arg1);
	}

    public static final boolean method5532(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method5436(arg0, arg1) || method5452(arg0, arg1);
	}

    public static final boolean method5459(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method5437(arg0, arg1) || method5452(arg0, arg1);
	}

    public static final boolean method5460(int arg0, int arg1) {
		boolean var2 = (arg1 & 0x37) == 0 ? method5454(arg0, arg1) : method5527(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method5439(arg0, arg1) | var2;
	}

    public static final boolean method5461(int arg0, int arg1) {
		return method5471(arg0, arg1) || method5454(arg0, arg1);
	}

    public static final boolean method5462(int arg0, int arg1) {
		return (arg0 & 0x40000) != 0 | method5458(arg0, arg1) || method5454(arg0, arg1);
	}

    public static final boolean method5463(int arg0, int arg1) {
		return method5514(arg0, arg1) || method5491(arg0, arg1);
	}

    public static final boolean method5496(int arg0, int arg1) {
		return (arg0 & 0x180) != 0;
	}

    public static final boolean method5465(int arg0, int arg1) {
		return (arg0 & 0x20) != 0;
	}

    public static final boolean method5466(int arg0, int arg1) {
		return (arg0 & 0x400) != 0;
	}

    public static final boolean method5486(int arg0, int arg1) {
		return (arg0 & 0x60000) != 0 | method5443(arg0, arg1) || method5456(arg0, arg1);
	}

    public static final boolean method5468(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 | method5434(arg0, arg1) || method5454(arg0, arg1);
	}
}
