package com.jagex.graphics;

import deob.ObfuscatedName;

public class ProgrammableBatchedSpriteShader extends BatchedSpriteShader {

    public GpuShader field10515;

    public ProgramUniform field10516;

    public GpuProgram field10517;

	public ProgrammableBatchedSpriteShader(GpuToolkit arg0) throws ShaderException {
		super(arg0);
		this.method16642();
	}

    public boolean method16642() throws ShaderException {
		this.field10515 = this.field2993.createShader("BatchedSprite");
		this.field10516 = this.field10515.getUniform("SpriteSampler");
		this.field10517 = this.field10515.getProgram("Normal");
		this.field10515.setCurrentProgram(this.field10517);
		return true;
	}

    public void method5047() {
		this.field10515.enable();
		this.field10515.setUniform1i(this.field10516, 0, this.field2992);
	}
}
