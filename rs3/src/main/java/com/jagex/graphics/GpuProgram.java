package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

public abstract class GpuProgram implements DeletableResource {

    public String name = null;

    public String vertexShaderFile;

    public String fragmentShaderFile;

    public String getName() {
		return this.name;
	}

    public abstract void setUniform1i(ProgramUniform arg0, int arg1, BaseTexture arg2);

    public abstract boolean compile();

    public abstract void setUniform1f(ProgramUniform arg0, float arg1);

    public abstract void setUniform2f(ProgramUniform arg0, float arg1, float arg2);

    public abstract void setUniformFloatv(ProgramUniform arg0, float[] arg1, int arg2);

    public abstract void setUniform4f(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4);

    public abstract void setUniform3f(int arg0, float arg1, float arg2, float arg3);

    public abstract void setUniform2fv(ProgramUniform arg0, Matrix4x4 arg1);

    public abstract void setUniformFloatv(int arg0, float[] arg1, int arg2);

    public abstract void setUniform3fv(int arg0, Matrix4x4 arg1);

    public abstract void setUniform2fv(int arg0, Matrix4x4 arg1);

    public abstract void setUniform4fv(int arg0, Matrix4x4 arg1);

    public abstract void setUniform1i(int arg0, int arg1, BaseTexture arg2);

    public abstract void setUniform4fv(ProgramUniform arg0, Matrix4x4 arg1);

    public abstract void setUniform3f(ProgramUniform arg0, float arg1, float arg2, float arg3);

    public abstract void setUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4);
}
