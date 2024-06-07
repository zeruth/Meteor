package com.jagex.graphics;



public abstract class GpuSurface extends Surface {

    public GpuToolkit field11940;

	public GpuSurface(GpuToolkit arg0) {
		this.field11940 = arg0;
	}

    public boolean method1630() {
		this.field11940.method15989();
		return true;
	}

    public void onResize(int arg0, int arg1) {
		if (this.field11940.getRenderTarget() == this) {
			this.field11940.method15982();
		}
	}
}
