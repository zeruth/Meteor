package com.jagex.graphics.dx;

import com.jagex.graphics.EffectInterface;
import com.jagex.graphics.FrameBufferInterface;
import com.jagex.graphics.GpuFrameBuffer;
import com.jagex.graphics.GraphicsDeletable;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.HRESULT;

public class DxFrameBuffer extends GpuFrameBuffer {

    public final DxToolkit field12499;

    public int width;

    public int height;

    public int field12502;

    public boolean field12504;

    public FrameBufferInterface field12498 = null;

    public final DxGraphicsDeletable[] field12505 = new DxGraphicsDeletable[4];

	public DxFrameBuffer(DxToolkit arg0) {
		super(arg0);
		this.field12499 = arg0;
	}

    public int getWidth() {
		return this.width;
	}

    public int getHeight() {
		return this.height;
	}

    public void method15441(EffectInterface arg0) {
		FrameBufferInterface var2 = (FrameBufferInterface) arg0;
		if (arg0 == null) {
			this.field12502 &= 0xFFFFFFEF;
			this.field12498 = null;
			if (this.field12504) {
				this.method19645(0L);
			}
			if (this.field12502 == 0) {
				this.height = 0;
				this.width = 0;
			}
			return;
		}

		if (this.field12502 == 0) {
			this.height = var2.method1009();
			this.width = var2.method1015();
			this.method18969();
		} else if (this.width != var2.method1015() || this.height != var2.method1009()) {
			throw new RuntimeException();
		}

		this.field12502 |= 0x10;
		this.field12498 = var2;
		if (this.field12504) {
			this.method19645(var2.method6216());
		}
	}

    public void method15439(int arg0, GraphicsDeletable arg1) {
		int var3 = 0x1 << arg0;
		DxGraphicsDeletable var4 = (DxGraphicsDeletable) arg1;
		if (arg1 == null) {
			this.field12502 &= ~var3;
			this.field12505[arg0] = null;
			if (this.field12504) {
				this.method19644(arg0, 0L);
			}
			if (this.field12502 == 0) {
				this.height = 0;
				this.width = 0;
			}
			return;
		}

		if (this.field12502 == 0) {
			this.height = var4.method1009();
			this.width = var4.method1015();
			this.method18969();
		} else if (this.width != var4.method1015() || this.height != var4.method1009()) {
			throw new RuntimeException();
		}

		this.field12502 |= var3;
		this.field12505[arg0] = var4;
		if (this.field12504) {
			this.method19644(arg0, var4.method6216());
		}
	}

    public boolean method19644(int arg0, long arg1) {
		return HRESULT.SUCCEEDED(IDirect3DDevice.SetRenderTarget(this.field12499.device, arg0, arg1));
	}

    public boolean method19645(long arg0) {
		return HRESULT.SUCCEEDED(IDirect3DDevice.SetDepthStencilSurface(this.field12499.device, arg0));
	}

    public boolean method15446() {
		return this.field12505[0] != null;
	}

    public boolean method1630() {
		for (int var1 = 0; var1 < 4; var1++) {
			DxGraphicsDeletable var2 = this.field12505[var1];
			if (var2 != null) {
				long var3 = var2.method6216();
				this.method19644(var1, var3);
			}
		}
		if (this.field12498 != null) {
			this.method19645(this.field12498.method6216());
		}
		this.field12504 = true;
		return super.method1630();
	}

    public boolean method1631() {
		for (int var1 = 1; var1 < 4; var1++) {
			DxGraphicsDeletable var2 = this.field12505[var1];
			if (var2 != null) {
				this.method19644(var1, 0L);
			}
		}
		if (this.field12498 != null) {
			this.method19645(0L);
		}
		this.field12504 = false;
		return true;
	}

    public void method15440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (arg6) {
			long var9 = IDirect3DDevice.GetRenderTarget(this.field12499.device, 0);
			IDirect3DDevice.StretchRect(this.field12499.device, this.field12505[0].method6216(), arg0, arg1, arg2, arg3, var9, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(var9);
		}
	}

    public void method1629() {
		if (this.field12498 != null) {
			this.field12498.delete();
		}
		for (int var1 = 0; var1 < this.field12505.length; var1++) {
			if (this.field12505[var1] != null) {
				this.field12505[var1].delete();
			}
		}
	}

    public void method19646() {
		if (this.field12498 != null) {
			this.field12498.method6215();
		}
		for (int var1 = 0; var1 < this.field12505.length; var1++) {
			if (this.field12505[var1] != null) {
				this.field12505[var1].method6215();
			}
		}
	}

	public void finalize() throws Throwable {
		this.method19646();
		super.finalize();
	}
}
