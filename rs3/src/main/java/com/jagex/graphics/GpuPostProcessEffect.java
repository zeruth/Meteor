package com.jagex.graphics;

import deob.ObfuscatedName;

public abstract class GpuPostProcessEffect {

    public final GpuToolkit gpuRenderer;

    public boolean field3243;

	public GpuPostProcessEffect(GpuToolkit gpuRenderer) {
		this.gpuRenderer = gpuRenderer;
	}

    public boolean method5561() {
		return this.method5572();
	}

    public int method5566() {
		return 1;
	}

    public int method5568() {
		return 0;
	}

    public boolean method5593() {
		return this.field3243;
	}

    public void method5570() {
	}

    public abstract boolean method5558();

    public abstract boolean method5559();

    public abstract void method5562();

    public abstract void method5564(int arg0, FrameBuffer arg1, GpuTexture arg2, EffectInterface arg3, GpuTexture arg4, boolean arg5);

    public abstract void method5565(int arg0);

    public abstract int method5567();

    public abstract boolean method5571();

    public abstract boolean method5572();

    public abstract void method5574(int arg0, int arg1);
}
