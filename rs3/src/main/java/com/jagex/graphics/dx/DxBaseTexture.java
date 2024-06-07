package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.DeletableResource;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.TextureFormat;

import jagdx.IUnknown;

public abstract class DxBaseTexture implements DeletableResource {

    public final DxToolkit renderer;

    public final TextureFormat format;

    public final DataType field4218;

    public boolean field4220;

    public long field4217 = 0L;

	public DxBaseTexture(DxToolkit arg0, TextureFormat arg1, DataType arg2, boolean arg3, int arg4) {
		this.renderer = arg0;
		this.format = arg1;
		this.field4218 = arg2;
		this.field4220 = arg3;
		this.renderer.method15985(this);
	}

    public long method6225() {
		return this.field4217;
	}

    public void method5824(GpuTextureRelated arg0) {
	}

    public void delete() {
		if (this.field4217 != 0L) {
			IUnknown.Release(this.field4217);
			this.field4217 = 0L;
		}
		this.renderer.method16198(this);
	}

    public void method6226() {
		if (this.field4217 != 0L) {
			this.renderer.method19023(this.field4217);
			this.field4217 = 0L;
		}
	}

	public void finalize() {
		this.method6226();
	}
}
