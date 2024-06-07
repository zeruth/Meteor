package com.jagex.graphics;



public class GpuModelRelated5 {

    public int field3297;

    public int field3294 = 128;

    public int field3296 = 128;

    public int field3299;

    public int field3298;

    public int field3295;

	public GpuModelRelated5(int arg0) {
		this.field3297 = arg0;
	}

	public GpuModelRelated5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field3297 = arg0;
		this.field3294 = arg1;
		this.field3296 = arg2;
		this.field3299 = arg3;
		this.field3298 = arg4;
		this.field3295 = arg5;
	}

    public GpuModelRelated5 method5688() {
		return new GpuModelRelated5(this.field3297, this.field3294, this.field3296, this.field3299, this.field3298, this.field3295);
	}

    public void method5687(GpuModelRelated5 arg0) {
		this.field3294 = arg0.field3294;
		this.field3296 = arg0.field3296;
		this.field3299 = arg0.field3299;
		this.field3298 = arg0.field3298;
		this.field3297 = arg0.field3297;
		this.field3295 = arg0.field3295;
	}
}
