package com.jagex.graphics.dx;

import com.jagex.graphics.FrameBufferInterface;
import deob.ObfuscatedName;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class DxRelated1 implements DxGraphicsDeletable, FrameBufferInterface {

    public final int field4216;

    public final DxTexture_Sub1 field4215;

    public long field4214;

	public DxRelated1(DxTexture_Sub1 arg0, int arg1) {
		this.field4216 = arg1;
		this.field4215 = arg0;
		this.field4215.renderer.method15985(this);
	}

    public int method1015() {
		return this.field4215.getWidth();
	}

    public int method1009() {
		return this.field4215.getHeight();
	}

    public long method6216() {
		if (this.field4214 == 0L) {
			this.field4214 = IDirect3DTexture.GetSurfaceLevel(this.field4215.field4217, this.field4216);
		}
		return this.field4214;
	}

    public void delete() {
		if (this.field4214 != 0L) {
			IUnknown.Release(this.field4214);
			this.field4214 = 0L;
		}
		this.field4215.renderer.method16198(this);
	}

    public void method6215() {
		if (this.field4214 != 0L) {
			this.field4215.renderer.method19023(this.field4214);
			this.field4214 = 0L;
		}
	}

	public void finalize() {
		this.method6215();
	}
}
