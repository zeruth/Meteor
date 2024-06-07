package com.jagex.graphics;

import com.jagex.math.Matrix4x4;


public abstract class SpriteShader {

    public GpuToolkit field3002;

    public GpuTexture field2997;

    public GpuTexture field2996;

    public final Matrix4x4 field2995 = new Matrix4x4();

    public final Matrix4x4 field2998 = new Matrix4x4();

    public final Matrix4x4 field2999 = new Matrix4x4();

    public VertexBuffer field3000;

    public int field3001;

    public VertexDeclaration field2994;

	public SpriteShader(GpuToolkit arg0) {
		this.field3002 = arg0;
	}

    public abstract void method5050(int arg0, int arg1);

    public abstract void method5051();

    public abstract void method5054();
}
