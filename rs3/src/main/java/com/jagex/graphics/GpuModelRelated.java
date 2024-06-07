package com.jagex.graphics;



public class GpuModelRelated {

    public boolean field3238;

    public boolean field3240;

    public GpuIndexBuffer field3239;

    public GpuIndexBuffer field3237;

	public GpuModelRelated(boolean arg0) {
		this.field3240 = arg0;
	}

    public boolean method5544() {
		return this.field3238 && !this.field3240;
	}

    public void method5551() {
		if (this.field3237 != null) {
			this.field3237.delete();
		}
		this.field3238 = false;
	}
}
