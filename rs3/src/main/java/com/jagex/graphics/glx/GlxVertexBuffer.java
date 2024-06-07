package com.jagex.graphics.glx;

import com.jagex.graphics.VertexBuffer;
import deob.ObfuscatedName;

public class GlxVertexBuffer extends GlxBuffer implements VertexBuffer {

    public byte field10619;

	public GlxVertexBuffer(GlxToolkit arg0, boolean arg1) {
		super(arg0, 34962, arg1);
	}

    public int method5743() {
		return super.method5743();
	}

    public int method16793() {
		return this.field10619;
	}

    public boolean allocate(int arg0, int arg1) {
		this.field10619 = (byte) arg1;
		super.method5831(arg0);
		return true;
	}

    public void delete() {
		super.delete();
	}

    public boolean upload(int arg0, int arg1, long arg2) {
		return super.upload(arg0, arg1, arg2);
	}

    public long lock(int arg0, int arg1) {
		return super.lock(arg0, arg1);
	}

    public void unlock() {
		super.unlock();
	}
}
