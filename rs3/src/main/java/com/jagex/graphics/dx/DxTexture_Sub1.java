package com.jagex.graphics.dx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.GraphicsDeletable;
import com.jagex.graphics.Texture2;
import com.jagex.graphics.TextureFormat;

import jagdx.*;

public class DxTexture_Sub1 extends DxTexture implements Texture2 {

	public DxTexture_Sub1(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

    public GraphicsDeletable method5828(int arg0) {
		return new DxRelated1(this, arg0);
	}

    public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		long var7 = IDirect3DTexture.GetSurfaceLevel(this.field4217, 0);
		long var9 = IDirect3DDevice.CreateRenderTarget(this.renderer.device, arg2, arg3, 21, 0, 0, true);
		this.renderer.ensureTemporaryBufferCapacity(arg2 * arg3 * 4);
		if (HRESULT.SUCCEEDED(IDirect3DDevice.StretchRect(this.renderer.device, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.renderer.temporaryBufferAddress);
			this.renderer.temporaryBuffer.clear();
			this.renderer.temporaryBuffer.asIntBuffer().get(arg4);
		}
		IUnknown.Release(var7);
		IUnknown.Release(var9);
	}

    public void delete() {
		super.delete();
	}

    public int getWidth() {
		return super.getWidth();
	}

    public int getHeight() {
		return super.getHeight();
	}

    public float getU(float arg0) {
		return super.getU(arg0);
	}

    public float getV(float arg0) {
		return super.getV(arg0);
	}

    public boolean method5732() {
		return super.method5732();
	}

    public void setWarp(boolean arg0, boolean arg1) {
		super.setWarp(arg0, arg1);
	}

    public void upload(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		super.upload(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

    public void upload(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
		super.upload(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

    public void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		super.download(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

    public void upload(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super.upload(arg0, arg1, arg2, arg3, arg4, arg5);
	}

    public float method5734() {
		return super.method5734();
	}

    public float method5707() {
		return super.method5707();
	}

    public boolean method5708() {
		return super.method5708();
	}

    public void method5823() {
		super.method5823();
	}

    public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}
}
