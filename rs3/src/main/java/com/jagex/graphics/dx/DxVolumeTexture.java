package com.jagex.graphics.dx;

import com.jagex.graphics.GpuVolumeTexture;
import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

import java.nio.ByteBuffer;

public class DxVolumeTexture extends DxBaseTexture implements GpuVolumeTexture {

    public final int field10613;

    public final int field10614;

    public final int field10615;

	public DxVolumeTexture(DxToolkit arg0, TextureFormat arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, arg1, DataType.UNSIGNED_INT_8, false, arg2 * arg3 * arg4);
		this.field10613 = arg2;
		this.field10614 = arg3;
		this.field10615 = arg4;
		this.field4217 = IDirect3DDevice.CreateVolumeTexture(this.renderer.device, arg2, arg3, arg4, 1, 0, DxToolkit.getD3DFormat(arg1, this.field4218), 1);
		this.renderer.ensureTemporaryBufferCapacity(this.field10614 * this.field10613 * arg1.id);
		ByteBuffer var8 = this.renderer.temporaryBuffer;
		var8.clear();
		var8.put(arg6);
		IDirect3DVolumeTexture.Upload(this.field4217, 0, 0, 0, 0, this.field10613, this.field10614, this.field10615, arg1.id * this.field10613, 0, this.renderer.temporaryBufferAddress);
	}

    public long method6225() {
		return this.field4217;
	}

    public void method5823() {
		this.renderer.method19003(this);
	}

    public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}

    public void delete() {
		super.delete();
	}
}
