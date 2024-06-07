package com.jagex.graphics.glx;

import com.jagex.graphics.GpuBuffer;
import deob.ObfuscatedName;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class GlxBuffer implements GpuBuffer {

    public final GlxToolkit field4988;

    public final int field4989;

    public final boolean field4990;

    public int field4987 = -1;

    public int field4992;

    public int field4991;

    public NativeHeapBuffer field4986;

    public static final int[] field4995 = new int[1];

	public GlxBuffer(GlxToolkit arg0, int arg1, boolean arg2) {
		this.field4988 = arg0;
		this.field4989 = arg1;
		this.field4990 = arg2;
	}

    public void method7654() {
		if (this.field4987 >= 0) {
			return;
		}
		if (this.field4988.hasVertexBufferObject) {
			OpenGL.glGenBuffersARB(1, field4995, 0);
			this.field4987 = field4995[0];
			OpenGL.glBindBufferARB(this.field4989, this.field4987);
		} else {
			this.field4987 = 0;
		}
	}

    public int method5743() {
		return this.field4992;
	}

    public long getAddress() {
		return this.field4987 == 0 ? this.field4986.getAddress() : 0L;
	}

    public void method7658() {
		if (this.field4988.hasVertexBufferObject) {
			OpenGL.glBindBufferARB(this.field4989, this.field4987);
		}
	}

    public void method5831(int arg0) {
		if (arg0 > this.field4991) {
			this.method7654();
			if (this.field4987 > 0) {
				OpenGL.glBindBufferARB(this.field4989, this.field4987);
				OpenGL.glBufferDataARBub(this.field4989, arg0, null, 0, this.field4990 ? 35040 : 35044);
				this.field4988.field10053 += arg0 - this.field4991;
			} else {
				this.field4986 = this.field4988.createHeapBuffer(arg0, false);
			}
			this.field4991 = arg0;
		}
		this.field4992 = arg0;
	}

    public long lock(int arg0, int arg1) {
		OpenGL.glBindBufferARB(this.field4989, this.field4987);
		return OpenGL.glMapBufferARB(this.field4989, 35001) + (long) arg0;
	}

    public void unlock() {
		OpenGL.glUnmapBufferARB(this.field4989);
	}

    public boolean upload(int arg0, int arg1, long arg2) {
		this.method7654();
		if (this.field4987 > 0) {
			OpenGL.glBindBufferARB(this.field4989, this.field4987);
			OpenGL.glBufferSubDataARBa(this.field4989, arg0, arg1, arg2);
		} else {
			this.field4986.field412.copy(this.field4986.getAddress() + (long) arg0, arg2, arg1);
		}
		return true;
	}

    public void delete() {
		if (this.field4987 > 0) {
			this.field4988.method19072(this.field4987, this.field4992);
			this.field4987 = -1;
		}
	}

	public void finalize() throws Throwable {
		this.delete();
		super.finalize();
	}
}
