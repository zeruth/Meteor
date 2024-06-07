package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

public abstract class Lookat {

    public final Camera camera;

	public Lookat(Camera camera) {
		this.camera = camera;
	}

    public abstract void method14131(float arg0);

    public abstract void decode(Packet buf);

    public abstract Vector3 method14133();

    public abstract Vector3 method14135();

    public abstract void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4);

    public abstract boolean method14145();
}
