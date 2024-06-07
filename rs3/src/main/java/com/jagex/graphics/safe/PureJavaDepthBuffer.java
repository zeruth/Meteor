package com.jagex.graphics.safe;

import com.jagex.graphics.EffectInterface;


public class PureJavaDepthBuffer implements EffectInterface {

    public int field971;

    public int field972;

    public float[] field973;

	public PureJavaDepthBuffer(int arg0, int arg1) {
		this.field971 = arg0;
		this.field972 = arg1;
		this.field973 = new float[this.field972 * this.field971];
	}

    public int method1015() {
		return this.field971;
	}

    public int method1009() {
		return this.field972;
	}

    public void delete() {
	}
}
