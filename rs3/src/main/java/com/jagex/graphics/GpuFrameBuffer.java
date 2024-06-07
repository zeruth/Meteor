package com.jagex.graphics;



public abstract class GpuFrameBuffer extends FrameBuffer {

    public GpuToolkit field11923;

	public GpuFrameBuffer(GpuToolkit arg0) {
		this.field11923 = arg0;
	}

    public boolean method1630() {
		this.field11923.method15989();
		return true;
	}

    public void method18969() {
		if (this.field11923.getRenderTarget() == this) {
			this.field11923.method15982();
		}
	}
}
