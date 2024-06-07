package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

public abstract class ModelShader {

    public GpuToolkit field2963;

    public float[] field2964 = new float[16];

    public float[] field2965 = new float[16];

    public GpuTexture field2966;

    public GpuCubeTexture field2967;

    public final Matrix4x4 field2982 = new Matrix4x4();

    public final Vector3 field2969 = new Vector3();

    public float field2970;

    public float field2971;

    public final Vector4 field2979 = new Vector4();

    public final Vector3 field2973 = new Vector3();

    public final Vector4 field2984 = new Vector4();

    public final Vector3 field2975 = new Vector3();

    public final Vector3 field2976 = new Vector3();

    public final Vector3 field2977 = new Vector3();

    public final Vector3 field2978 = new Vector3();

    public final Vector3 field2968 = new Vector3();

    public final Matrix4x4 field2980 = new Matrix4x4();

    public int field2981;

    public int field2983;

    public int field2972;

    public int field2962;

	public ModelShader(GpuToolkit arg0) {
		this.field2963 = arg0;
	}

    public void method5036(byte arg0) {
		switch(arg0) {
			case 1:
				this.field2970 = 32.0F;
				this.field2971 = 0.0F;
				break;
			case 2:
				this.field2970 = 4.0F;
				this.field2971 = 0.0F;
				break;
			case 3:
				this.field2970 = 1.0F;
				this.field2971 = 0.0F;
		}
	}

    public abstract void method5018(Matrix4x4 arg0);

    public abstract void method5019(boolean arg0);

    public abstract void method5020(int arg0);

    public abstract void method5023();

    public abstract void method5024();

    public abstract void method5026(int arg0);

    public abstract void method5031(int arg0);
}
