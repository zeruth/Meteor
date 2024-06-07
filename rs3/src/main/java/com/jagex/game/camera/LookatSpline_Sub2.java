package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Vector3;


public class LookatSpline_Sub2 extends LookatSpline {

    public float[] field12475;

    public float[] field12474;

    public int field12476 = 0;

	public LookatSpline_Sub2(Camera arg0) {
		super(arg0);
	}

    public void method18836() {
		this.field12476++;
	}

    public float method18835(float arg0, float arg1, float arg2) {
		float var4 = this.field11873 / (float) this.field11872[this.field12476].method6763();
		return (this.field12474[this.field12476] - this.field12475[this.field12476]) * var4 + this.field12475[this.field12476];
	}

    public void method18834(float arg0, float arg1) {
		this.field11873 += arg0;
		if (this.field11873 > (float) this.field11872[this.field12476].method6763()) {
			this.field11873 = this.field11872[this.field12476].method6763();
		}
	}

    public Vector3 method14133() {
		Vector3 var1 = Vector3.create();
		double[] var2 = this.field11872[this.field12476].method6767(this.field11873);
		var1.x = (float) var2[0];
		var1.y = (float) var2[1];
		var1.z = (float) var2[2];
		return var1;
	}

    public double[] method18837() {
		return this.field11872[this.field12476].method6767(this.field11873);
	}

    public Vector3 method14135() {
		return this.method14133();
	}

    public void method18839(Packet arg0, int arg1) {
		this.field12475 = new float[arg1];
		this.field12474 = new float[arg1];
		this.field12476 = 0;
		for (int var3 = 0; var3 < arg1; var3++) {
			this.field12475[var3] = arg0.gFloat();
			this.field12474[var3] = arg0.gFloat();
		}
	}
}
