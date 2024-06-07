package com.jagex.graphics.gl;

import com.jagex.graphics.Surface;

import jaggl.OpenGL;

import java.awt.*;

public class GlSurface extends Surface {

    public final GlToolkit field11934;

    public final Canvas field11938;

    public final OpenGL field11933;

    public final long field11935;

    public int field11936;

    public int field11937;

    public boolean field11932;

    public boolean field11939;

	public GlSurface(GlToolkit arg0, Canvas arg1) {
		this(arg0, arg1, arg0.field10022.prepareSurface(arg1));
	}

	public GlSurface(GlToolkit arg0, Canvas arg1, long arg2) {
		this.field11932 = false;
		this.field11939 = false;
		this.field11934 = arg0;
		this.field11938 = arg1;
		this.field11933 = arg0.field10022;
		this.field11935 = arg2;
		this.method18976();
	}

    public int getWidth() {
		return this.field11936;
	}

    public int getHeight() {
		return this.field11937;
	}

    public void onResize(int arg0, int arg1) {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		this.field11933.surfaceResized(this.field11935);
		this.method18976();
		if (this.field11934.getRenderTarget() == this) {
			this.field11934.method15757();
		}
	}

    public void method18976() {
		Dimension var1 = this.field11938.getSize();
		this.field11937 = var1.height;
		this.field11936 = var1.width;
	}

    public int method15451() {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		this.field11933.swapBuffers(this.field11935);
		return 0;
	}

    public int method15450(int arg0, int arg1) {
		return 0;
	}

    public boolean method1630() {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		if (!this.field11939) {
			this.field11933.setSurface(this.field11935);
			this.field11939 = true;
		}
		this.field11934.method15883();
		return true;
	}

    public boolean method1631() {
		return true;
	}

    public void method1629() {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		this.field11933.releaseSurface(this.field11938, this.field11935);
		this.field11932 = true;
		this.field11939 = false;
	}
}
