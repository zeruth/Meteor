package com.jagex.core.utils;

import deob.ObfuscatedName;

public class NanoTimer extends Timer {

    public long field11119 = 0L;

    public long field11115 = 0L;

    public long field11116 = 0L;

    public long[] field11118 = new long[10];

    public int field11120 = 0;

    public int field11117 = 1;

	public NanoTimer() {
		this.field11119 = System.nanoTime();
		this.field11115 = System.nanoTime();
	}

    public void method8156() {
		this.field11116 = 0L;
		if (this.field11115 > this.field11119) {
			this.field11119 += this.field11115 - this.field11119;
		}
	}

    public long method8159() {
		this.field11119 += this.method17363();
		return this.field11115 > this.field11119 ? (this.field11115 - this.field11119) / 1000000L : 0L;
	}

    public int method8160(long arg0) {
		if (this.field11115 > this.field11119) {
			this.field11116 += this.field11115 - this.field11119;
			this.field11119 += this.field11115 - this.field11119;
			this.field11115 += arg0;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.field11115 += arg0;
		} while (var3 < 10 && this.field11115 < this.field11119);
		if (this.field11115 < this.field11119) {
			this.field11115 = this.field11119;
		}
		return var3;
	}

    public long method8173() {
		return this.field11119;
	}

    public long method17363() {
		long var1 = System.nanoTime();
		long var3 = var1 - this.field11116;
		this.field11116 = var1;
		if (var3 > -5000000000L && var3 < 5000000000L) {
			this.field11118[this.field11120] = var3;
			this.field11120 = (this.field11120 + 1) % 10;
			if (this.field11117 < 1) {
				this.field11117++;
			}
		}
		long var5 = 0L;
		for (int var7 = 1; var7 <= this.field11117; var7++) {
			var5 += this.field11118[(this.field11120 - var7 + 10) % 10];
		}
		return var5 / (long) this.field11117;
	}
}
