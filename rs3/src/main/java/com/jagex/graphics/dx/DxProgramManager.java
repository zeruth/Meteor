package com.jagex.graphics.dx;

import com.jagex.graphics.*;
import deob.ObfuscatedName;

public final class DxProgramManager extends GpuShader {

    public final DxToolkit field10388;

    public DxProgram field10389;

    public boolean field10387;

	public DxProgramManager(DxToolkit arg0, ShaderData arg1) {
		super(arg0, arg1);
		this.field10388 = arg0;
		this.field10387 = false;
	}

    public GpuProgram createProgram(GpuToolkit arg0, ProgramData arg1) {
		return new DxProgram((DxToolkit) arg0, this, arg1);
	}

    public boolean setCurrentProgram(GpuProgram arg0) {
		if (this.field10389 == arg0) {
			return true;
		} else if (arg0.compile()) {
			this.field10389 = (DxProgram) arg0;
			this.currentProgramIndex = this.getProgramIndex(arg0);
			if (this.currentProgramIndex == -1) {
				throw new IllegalArgumentException();
			}
			if (this.field10387) {
				this.field10388.setVertexShader(this.field10389.vertexShader3d);
				this.field10388.setPixelShader(this.field10389.pixelShader3d);
				this.field10388.program = this.field10389;
			}
			return true;
		} else {
			return false;
		}
	}

    public ProgramUniform method4165(ProgramUniformData arg0) {
		return new DxProgramUniform(this, arg0);
	}

    public void enable() {
		if (this.field10389 == null) {
			throw new ProgramManagerException();
		}
		this.field10388.setVertexShader(this.field10389.vertexShader3d);
		this.field10388.setPixelShader(this.field10389.pixelShader3d);
		this.field10388.program = this.field10389;
		this.field10387 = true;
	}

    public void method4214() {
		this.field10388.setVertexShader(0L);
		this.field10388.setPixelShader(0L);
		this.field10387 = false;
		this.field10388.program = null;
		this.field10388.setActiveTexture(1);
		this.field10388.setTexture(null);
		this.field10388.setActiveTexture(0);
		this.field10388.setTexture(null);
	}

    public boolean method4184() {
		return this.field10388.program == this.field10389;
	}
}
