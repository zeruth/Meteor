package com.jagex.graphics.glx;

import com.jagex.graphics.ProgramUniform;
import com.jagex.graphics.ProgramUniformData;

import jaggl.OpenGL;

public class GlxProgramUniform extends ProgramUniform {

    public GlxProgramManager field12535;

    public int[] field12536 = null;

	public GlxProgramUniform(GlxProgramManager arg0, ProgramUniformData arg1) {
		super(arg1);
		this.field12535 = arg0;
	}

    public final int method19681() {
		return this.field12536[this.field12535.getCurrentProgramIndex()];
	}

    public boolean method19245(int arg0) {
		if (this.field12536 == null) {
			this.field12536 = new int[this.field12535.getProgramCount()];
		}
		GlxProgram var2 = (GlxProgram) this.field12535.getProgram(arg0);
		this.field12536[arg0] = OpenGL.glGetUniformLocation(var2.field10373, this.method19257());
		return this.field12536[arg0] != -1;
	}

    public final int getLocation(int arg0) {
		return this.field12536[arg0];
	}
}
