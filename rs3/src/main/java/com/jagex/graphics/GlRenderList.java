package com.jagex.graphics;

import com.jagex.graphics.gl.GlToolkit;

import jaggl.OpenGL;

public class GlRenderList {

    public final int field1020;

	public GlRenderList(GlToolkit arg0, int arg1) {
		this.field1020 = OpenGL.glGenLists(arg1);
	}

    public void method1245(int arg0) {
		OpenGL.glNewList(this.field1020 + arg0, 4864);
	}

    public void method1243() {
		OpenGL.glEndList();
	}

    public void method1246(char arg0) {
		OpenGL.glCallList(this.field1020 + arg0);
	}
}
