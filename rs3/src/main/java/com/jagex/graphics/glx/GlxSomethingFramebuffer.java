package com.jagex.graphics.glx;


import jaggl.OpenGL;

public class GlxSomethingFramebuffer implements GlxRelated2 {

    public final int field4972;

    public final GlxTexture field4971;

	public GlxSomethingFramebuffer(GlxTexture arg0, int arg1) {
		this.field4972 = arg1;
		this.field4971 = arg0;
	}

    public int method1015() {
		return this.field4971.getWidth();
	}

    public int method1009() {
		return this.field4971.getHeight();
	}

    public void method7627(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field4971.field4979, this.field4971.field4974, this.field4972);
	}

    public void delete() {
	}
}
