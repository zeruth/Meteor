package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.FrameBufferInterface;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class DxFrameBufferInterface_Sub1 implements FrameBufferInterface {

    public final DxToolkit field4238;

    public final DataType field4234;

    public final int field4236;

    public final int field4235;

    public long field4237;

	public DxFrameBufferInterface_Sub1(DxToolkit arg0, DataType arg1, int arg2, int arg3, int arg4) {
		this.field4238 = arg0;
		this.field4236 = arg2;
		this.field4235 = arg3;
		this.field4234 = arg1;
		this.field4237 = IDirect3DDevice.CreateDepthStencilSurface(this.field4238.device, arg2, arg3, DxToolkit.getD3DFormatForDataType(this.field4234), arg4, 0, false);
		this.field4238.method15985(this);
	}

    public int method1015() {
		return this.field4236;
	}

    public int method1009() {
		return this.field4235;
	}

    public long method6216() {
		return this.field4237;
	}

    public void delete() {
		if (this.field4237 != 0L) {
			IUnknown.Release(this.field4237);
			this.field4237 = 0L;
		}
		this.field4238.method16198(this);
	}

    public void method6215() {
		if (this.field4237 != 0L) {
			this.field4238.method19023(this.field4237);
			this.field4237 = 0L;
		}
	}

	public void finalize() {
		this.method6215();
	}
}
