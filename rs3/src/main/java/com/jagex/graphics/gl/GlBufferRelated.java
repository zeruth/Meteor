package com.jagex.graphics.gl;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class GlBufferRelated {

    public final GlToolkit field1123;

    public final int field1120;

    public final int field1122;

    public int field1118;

    public boolean field1124;

    public boolean field1125 = false;

    public static final int[] field1126 = new int[1];

	public GlBufferRelated(GlToolkit arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
		this.field1123 = arg0;
		this.field1120 = arg1;
		this.field1118 = arg3;
		this.field1124 = arg4;
		OpenGL.glGenBuffersARB(1, field1126, 0);
		this.field1122 = field1126[0];
		this.method1311();
		OpenGL.glBufferDataARBub(arg1, this.field1118, arg2, 0, this.field1124 ? 35040 : 35044);
		this.field1123.field9880 += this.field1118;
	}

	public GlBufferRelated(GlToolkit arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
		this.field1123 = arg0;
		this.field1120 = arg1;
		this.field1118 = arg3;
		this.field1124 = arg4;
		OpenGL.glGenBuffersARB(1, field1126, 0);
		this.field1122 = field1126[0];
		this.method1311();
		OpenGL.glBufferDataARBa(arg1, this.field1118, arg2.getAddress(), this.field1124 ? 35040 : 35044);
		this.field1123.field9880 += this.field1118;
	}

    public void method1309(byte[] arg0, int arg1) {
		this.method1311();
		if (arg1 > this.field1118) {
			OpenGL.glBufferDataARBub(this.field1120, arg1, arg0, 0, this.field1124 ? 35040 : 35044);
			this.field1123.field9880 += arg1 - this.field1118;
			this.field1118 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.field1120, 0, arg1, arg0, 0);
		}
	}

	public void finalize() throws Throwable {
		if (!this.field1125) {
			this.field1123.method15870(this.field1122, this.field1118);
			this.field1125 = true;
		}
		super.finalize();
	}

    public abstract void method1311();
}
