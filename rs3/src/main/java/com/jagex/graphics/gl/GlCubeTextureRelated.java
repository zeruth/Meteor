package com.jagex.graphics.gl;


import jaggl.OpenGL;

public class GlCubeTextureRelated implements GlPostProcessingRelated {

    public final int field1131;

    public final int field1130;

    public final GlCubeTexture field1129;

	public GlCubeTextureRelated(GlCubeTexture arg0, int arg1, int arg2) {
		this.field1130 = arg2;
		this.field1129 = arg0;
		this.field1131 = arg1;
	}

    public int method1015() {
		return this.field1129.field9279;
	}

    public int method1009() {
		return this.field1129.field9279;
	}

    public void method1318(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field1131, this.field1129.field1007, this.field1130);
	}

    public void delete() {
	}
}
