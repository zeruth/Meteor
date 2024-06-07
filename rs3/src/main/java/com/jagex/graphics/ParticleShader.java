package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

public abstract class ParticleShader {

    public GpuToolkit field2986;

    public GpuTexture field2991;

    public final Matrix4x4 field2987 = new Matrix4x4();

    public int field2988;

    public final Vector4 field2989 = new Vector4();

    public final Vector3 field2990 = new Vector3();

    public float field2985 = 0.0F;

	public ParticleShader(GpuToolkit arg0) {
		this.field2986 = arg0;
	}

    public abstract void method5038(Matrix4x4 arg0);

    public abstract void method5039(int arg0, boolean arg1);

    public abstract void method5040(boolean arg0);
}
