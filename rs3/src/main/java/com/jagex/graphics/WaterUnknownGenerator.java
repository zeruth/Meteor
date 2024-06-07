package com.jagex.graphics;

import com.jagex.game.client.NoiseGenerator3D_Sub2;


public class WaterUnknownGenerator extends NoiseGenerator3D_Sub2 {

    public byte[] field12155;

	public WaterUnknownGenerator() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

    public byte[] method19228(int arg0, int arg1, int arg2) {
		this.field12155 = new byte[arg0 * arg1 * arg2 * 2];
		this.method6134(arg0, arg1, arg2);
		return this.field12155;
	}

    public void method16813(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		int var4 = arg1 & 0xFF;
		int var10001 = var3;
		int var5 = var3 + 1;
		this.field12155[var10001] = -1;
		this.field12155[var5] = (byte) (var4 * 3 >> 5);
	}
}
