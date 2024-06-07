package com.jagex.graphics;

import deob.ObfuscatedName;

public class GpuModelRelated4 {

    public boolean field3358;

    public boolean field3357;

    public VertexBuffer field3359;

    public VertexBuffer field3356;

	public GpuModelRelated4(boolean arg0) {
		this.field3357 = arg0;
	}

    public boolean method5787() {
		return this.field3358 && !this.field3357;
	}

    public void method5788() {
		if (this.field3356 != null) {
			this.field3356.delete();
		}
		this.field3358 = false;
	}
}
