package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

public class PositionSpline_Sub2 extends PositionSpline {

    public float[] field12094;

    public float[] field12093;

    public int field12095 = 0;

	public PositionSpline_Sub2(Camera arg0) {
		super(arg0);
	}

    public void method16723() {
		this.field12095++;
	}

    public float method16722(float arg0, float arg1, float arg2) {
		float var4 = this.field10563 / (float) this.field10565[this.field12095].method6763();
		return (this.field12093[this.field12095] - this.field12094[this.field12095]) * var4 + this.field12094[this.field12095];
	}

    public void method16721(float arg0, float arg1) {
		this.field10563 += arg0;
		if (this.field10563 > (float) this.field10565[this.field12095].method6763()) {
			this.field10563 = this.field10565[this.field12095].method6763();
		}
	}

    public Vector3 method5219() {
		Vector3 var1 = Vector3.create();
		double[] var2 = this.field10565[this.field12095].method6767(this.field10563);
		var1.x = (float) var2[0];
		var1.y = (float) var2[1];
		var1.z = (float) var2[2];
		return var1;
	}

    public double[] method5230() {
		return this.field10565[this.field12095].method6767(this.field10563);
	}

    public float method16733() {
		return this.field10563;
	}

    public float method5222() {
		return this.field10565[this.field12095].method6769(this.field10563);
	}

    public void method16724(Packet arg0, int arg1) {
		this.field12094 = new float[arg1];
		this.field12093 = new float[arg1];
		this.field12095 = 0;
		for (int var3 = 0; var3 < arg1; var3++) {
			this.field12094[var3] = arg0.gFloat();
			this.field12093[var3] = arg0.gFloat();
		}
	}
}
