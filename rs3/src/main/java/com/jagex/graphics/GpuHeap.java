package com.jagex.graphics;

import com.jagex.core.datastruct.Heap;

import jaclib.memory.heap.NativeHeap;

public class GpuHeap extends Heap {

	public NativeHeap field12208;

	public GpuHeap(int arg0) {
		this.field12208 = new NativeHeap(arg0);
	}

	public void method19240() {
		this.field12208.method93();
	}
}
