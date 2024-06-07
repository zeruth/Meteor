package com.jagex.graphics.glx;

import com.jagex.graphics.*;
import deob.ObfuscatedName;
import jaggl.OpenGL;

public class GlxProgramManager extends GpuShader {

    public final GlxToolkit field10390;

    public GlxProgram field10391;

    public int field10392;

	public GlxProgramManager(GlxToolkit arg0, ShaderData arg1) {
		super(arg0, arg1);
		this.field10390 = arg0;
	}

    public GpuProgram createProgram(GpuToolkit arg0, ProgramData arg1) {
		return new GlxProgram((GlxToolkit) arg0, this, arg1);
	}

    public boolean setCurrentProgram(GpuProgram arg0) {
		if (this.field10391 == arg0) {
			return true;
		} else if (arg0.compile()) {
			boolean var2 = this.method4184();
			this.field10391 = (GlxProgram) arg0;
			this.currentProgramIndex = this.getProgramIndex(arg0);
			if (this.currentProgramIndex == -1) {
				throw new IllegalArgumentException();
			}
			this.field10392 = this.field10391.field10373;
			if (var2) {
				OpenGL.glUseProgram(this.field10392);
				this.field10390.field12015 = this.field10391;
			}
			return true;
		} else {
			return false;
		}
	}

    public ProgramUniform method4165(ProgramUniformData arg0) {
		return new GlxProgramUniform(this, arg0);
	}

    public void enable() {
		if (this.field10390.field12015 == this.field10391) {
			return;
		}
		if (this.field10391 == null) {
			throw new ProgramManagerException();
		}
		OpenGL.glUseProgram(this.field10392);
		this.field10390.field12015 = this.field10391;
	}

    public void method4214() {
	}

    public boolean method4184() {
		return this.field10390.field12015 == this.field10391;
	}

    public void method4191() {
		for (int var1 = 0; var1 < this.getProgramCount(); var1++) {
			((GlxProgram) this.getProgram(var1)).delete();
		}
		super.method4191();
	}

	public void finalize() throws Throwable {
		this.method4191();
		super.finalize();
	}
}
