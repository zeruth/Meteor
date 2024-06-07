package com.jagex.game.client;

import deob.ObfuscatedName;

public class NoiseGenerator3D_Sub1 extends NoiseGenerator3D {

    public byte[] field10698;

    public int field10697;

    public int field10699;

    public final int[] field10696 = new int[this.field4198];

	public NoiseGenerator3D_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (int var7 = 0; var7 < this.field4198; var7++) {
			this.field10696[var7] = (short) (Math.pow((double) arg5, (double) var7) * 4096.0D);
		}
	}

    public void method6147() {
		this.field10697 = 0;
		this.field10699 = 0;
	}

    public void method6138(int arg0, int arg1) {
		this.field10699 += this.field10696[arg0] * arg1 >> 12;
	}

    public void method6143() {
		this.field10699 = Math.abs(this.field10699);
		if (this.field10699 >= 4096) {
			this.field10699 = 4095;
		}
		this.method16809(this.field10697++, (byte) (this.field10699 >> 4));
		this.field10699 = 0;
	}

    public void method16809(int arg0, byte arg1) {
		this.field10698[this.field10697++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
