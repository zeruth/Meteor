package com.jagex.graphics.gl;

import com.jagex.core.datastruct.Heap;

import jaclib.memory.heap.NativeHeap;

public class GlHeap extends Heap {

    public NativeHeap field12207;

	public GlHeap(int arg0) {
		this.field12207 = new NativeHeap(arg0);
	}

    public void method19237() {
		this.field12207.method93();
	}
}
