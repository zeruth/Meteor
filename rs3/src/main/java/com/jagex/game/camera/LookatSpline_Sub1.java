package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import deob.ObfuscatedName;

public class LookatSpline_Sub1 extends LookatSpline {

	public LookatSpline_Sub1(Camera arg0) {
		super(arg0);
	}

    public float method18835(float arg0, float arg1, float arg2) {
		float var4 = arg0 - this.field11873;
		if (this.camera.getLookatAcceleration().x == Float.POSITIVE_INFINITY) {
			arg1 = this.camera.getLookatMaxSpeed().length();
		} else {
			float var5 = arg1 / this.camera.getLookatAcceleration().length();
			float var6 = arg1 / 2.0F * var5;
			if (var6 > var4) {
				arg1 -= this.camera.getLookatAcceleration().length() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.camera.getLookatMaxSpeed().length()) {
				arg1 += this.camera.getLookatAcceleration().length() * arg2;
				if (arg1 > this.camera.getLookatMaxSpeed().length()) {
					arg1 = this.camera.getLookatMaxSpeed().length();
				}
			}
		}
		return arg1;
	}

    public void method18836() {
	}

    public void method18839(Packet arg0, int arg1) {
	}
}
