package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuIndexBuffer;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.HRESULT;

public class DxIndexBuffer implements GpuIndexBuffer {

    public final DxToolkit renderer;

    public int field4208;

    public int field4210;

    public final boolean field4209;

    public final DataType dataType;

    public long field4213 = 0L;

	public DxIndexBuffer(DxToolkit renderer, DataType dataType, boolean arg2) {
		this.renderer = renderer;
		this.dataType = dataType;
		this.field4209 = arg2;
		this.renderer.method15985(this);
	}

    public int method5743() {
		return this.field4208;
	}

    public DataType getDataType() {
		return this.dataType;
	}

    public void method5831(int arg0) {
		this.field4208 = this.dataType.field1652 * arg0;
		if (this.field4208 <= this.field4210) {
			return;
		}
		if (this.field4213 != 0L) {
			IUnknown.Release(this.field4213);
		}
		int var2 = 8;
		byte var3;
		if (this.field4209) {
			var3 = 0;
			var2 |= 0x200;
		} else {
			var3 = 1;
		}
		this.field4213 = IDirect3DDevice.CreateIndexBuffer(this.renderer.device, this.field4208, var2, DataType.UNSIGNED_INT_16 == this.dataType ? 101 : 102, var3);
		this.field4210 = this.field4208;
	}

    public long lock(int arg0, int arg1) {
		return jagdx.IDirect3DIndexBuffer.Lock(this.field4213, arg0, arg1, this.field4209 ? 8192 : 0);
	}

    public void unlock() {
		jagdx.IDirect3DIndexBuffer.Unlock(this.field4213);
	}

    public boolean upload(int arg0, int arg1, long arg2) {
		return HRESULT.SUCCEEDED(jagdx.IDirect3DIndexBuffer.Upload(this.field4213, arg0, arg1, this.field4209 ? 8192 : 0, arg2));
	}

    public void delete() {
		if (this.field4213 != 0L) {
			IUnknown.Release(this.field4213);
			this.field4213 = 0L;
		}
		this.field4210 = 0;
		this.field4208 = 0;
		this.renderer.method16198(this);
	}

    public void method6209() {
		if (this.field4213 != 0L) {
			this.renderer.method19023(this.field4213);
			this.field4213 = 0L;
		}
		this.field4210 = 0;
		this.field4208 = 0;
	}

	public void finalize() {
		this.method6209();
	}
}
