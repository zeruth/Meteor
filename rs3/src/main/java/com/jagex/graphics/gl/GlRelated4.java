package com.jagex.graphics.gl;

import deob.ObfuscatedName;
import jaggl.OpenGL;

public class GlRelated4 implements GlPostProcessingRelated {

    public final int field1203;

    public final GlTexture_Sub1 field1202;

	public GlRelated4(GlTexture_Sub1 arg0, int arg1) {
		this.field1203 = arg1;
		this.field1202 = arg0;
	}

    public int method1015() {
		return this.field1202.field9272;
	}

    public int method1009() {
		return this.field1202.field9271;
	}

    public void method1318(int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field1202.field1009, this.field1202.field1007, this.field1203);
	}

    public void delete() {
	}
}
