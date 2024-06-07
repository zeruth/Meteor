package com.jagex.graphics.glx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuIndexBuffer;
import deob.ObfuscatedName;

public class GlxIndexBuffer extends GlxBuffer implements GpuIndexBuffer {

    public DataType field10675;

	public GlxIndexBuffer(GlxToolkit arg0, DataType arg1, boolean arg2) {
		super(arg0, 34963, arg2);
		this.field10675 = arg1;
	}

    public int method5743() {
		return super.method5743();
	}

    public DataType getDataType() {
		return this.field10675;
	}

    public void method5831(int arg0) {
		super.method5831(this.field10675.field1652 * arg0);
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
