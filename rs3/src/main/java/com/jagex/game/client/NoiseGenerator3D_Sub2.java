package com.jagex.game.client;

import deob.ObfuscatedName;

public class NoiseGenerator3D_Sub2 extends NoiseGenerator3D {

    public byte[] field10705;

    public int field10704;

    public int field10702;

    public int field10703;

    public int field10701;

    public int field10700;

    public final int field10706;

    public final int field10707;

    public final int field10708;

	public NoiseGenerator3D_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field10706 = (int) (arg7 * 4096.0F);
		this.field10707 = (int) (arg6 * 4096.0F);
		this.field10704 = this.field10708 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

    public void method6147() {
		this.field10701 = 0;
		this.field10700 = 0;
	}

    public void method6138(int arg0, int arg1) {
		if (arg0 == 0) {
			this.field10703 = this.field10707 - (arg1 < 0 ? -arg1 : arg1);
			this.field10703 = this.field10703 * this.field10703 >> 12;
			this.field10702 = 4096;
			this.field10700 = this.field10703;
			return;
		}
		this.field10702 = this.field10706 * this.field10703 >> 12;
		if (this.field10702 < 0) {
			this.field10702 = 0;
		} else if (this.field10702 > 4096) {
			this.field10702 = 4096;
		}
		this.field10703 = this.field10707 - (arg1 < 0 ? -arg1 : arg1);
		this.field10703 = this.field10703 * this.field10703 >> 12;
		this.field10703 = this.field10703 * this.field10702 >> 12;
		this.field10700 += this.field10704 * this.field10703 >> 12;
		this.field10704 = this.field10708 * this.field10704 >> 12;
	}

    public void method6143() {
		this.field10704 = this.field10708;
		this.field10700 >>= 0x4;
		if (this.field10700 < 0) {
			this.field10700 = 0;
		} else if (this.field10700 > 255) {
			this.field10700 = 255;
		}
		this.method16813(this.field10701++, (byte) this.field10700);
		this.field10700 = 0;
	}

    public void method16813(int arg0, byte arg1) {
		this.field10705[arg0] = arg1;
	}
}
