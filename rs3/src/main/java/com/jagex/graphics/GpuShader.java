package com.jagex.graphics;

import com.jagex.core.datastruct.HashMap;
import com.jagex.core.datastruct.HashMapKey;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import com.jagex.math.Vector4;


public abstract class GpuShader {

    public String name;

    public GpuProgram[] programs;

    public HashMap uniforms;

    public HashMap uniforms2;

    public int uniformsCount;

    public int uniforms2Count;

    public int currentProgramIndex = -1;

    public static final HashMapKey field2571 = new ShaderRelated();

	public GpuShader(GpuToolkit renderer, ShaderData shader) {
		this.name = shader.name;

		this.uniformsCount = shader.vertexUniforms.length;
		this.uniforms = new HashMap(this.uniformsCount, field2571);
		for (int i = 0; i < this.uniformsCount; i++) {
			this.uniforms.put(i, shader.vertexUniforms[i].field2586, this.method4165(shader.vertexUniforms[i]));
		}

		this.uniforms2Count = shader.fragmentUniforms.length;
		this.uniforms2 = new HashMap(this.uniforms2Count, field2571);
		for (int i = 0; i < this.uniforms2Count; i++) {
			this.uniforms2.put(i, shader.fragmentUniforms[i].field2586, this.method4165(shader.fragmentUniforms[i]));
		}

		this.programs = new GpuProgram[shader.programs.length];
		for (int i = 0; i < shader.programs.length; i++) {
			this.programs[i] = this.createProgram(renderer, shader.programs[i]);
		}
	}

    public String getName() {
		return this.name;
	}

    public GpuProgram getProgram(String name) throws ProgramNotFoundException {
		GpuProgram[] programs = this.programs;

		for (int i = 0; i < programs.length; i++) {
			GpuProgram prg = programs[i];
			String prgName = prg.getName();
			if (prgName != null && prgName.equals(name)) {
				if (!prg.compile()) {
					throw new ProgramNotFoundException(name);
				}

				return prg;
			}
		}

		throw new ProgramNotFoundException(name);
	}

    public final int getProgramCount() {
		return this.programs.length;
	}

    public final GpuProgram getProgram(int index) {
		return this.programs[index];
	}

    public int getProgramIndex(GpuProgram prg) {
		for (int i = 0; i < this.programs.length; i++) {
			if (this.programs[i] == prg) {
				return i;
			}
		}

		return -1;
	}

    public GpuProgram compilePrograms() {
		GpuProgram[] programs = this.programs;
		for (int i = 0; i < programs.length; i++) {
			GpuProgram prg = programs[i];
			if (prg.compile()) {
				return prg;
			}
		}
		return null;
	}

    public final GpuProgram getCurrentProgram() {
		return this.currentProgramIndex >= 0 ? this.programs[this.currentProgramIndex] : null;
	}

    public final int getCurrentProgramIndex() {
		return this.currentProgramIndex;
	}

    public final void setUniform1f(ProgramUniform arg0, float arg1) {
		this.programs[this.currentProgramIndex].setUniform1f(arg0, arg1);
	}

    public final void setUniform2f(ProgramUniform arg0, float arg1, float arg2) {
		this.programs[this.currentProgramIndex].setUniform2f(arg0, arg1, arg2);
	}

    public final void setUniform3f(ProgramUniform arg0, float arg1, float arg2, float arg3) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1, arg2, arg3);
	}

    public final void setUniform4f(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
		this.programs[this.currentProgramIndex].setUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

    public final void setUniform3fv(ProgramUniform arg0, Vector3 arg1) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1.x, arg1.y, arg1.z);
	}

    public final void setUniform4fv(ProgramUniform arg0, Vector4 arg1) {
		this.programs[this.currentProgramIndex].setUniform4f(arg0, arg1.field4244, arg1.field4243, arg1.field4242, arg1.field4245);
	}

    public final void setUniformFloatv(ProgramUniform arg0, float[] arg1) {
		this.programs[this.currentProgramIndex].setUniformFloatv(arg0, arg1, arg1.length);
	}

    public final void setFloatColour(ProgramUniform arg0, int arg1) {
		float var3 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		float var4 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		float var5 = (float) (arg1 & 0xFF) / 255.0F;
		float var6 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.setUniform4f(arg0, var3, var4, var5, var6);
	}

    public final void setUniform2fv(ProgramUniform arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform2fv(arg0, arg1);
	}

    public final void setUniform4fv(ProgramUniform arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform4fv(arg0, arg1);
	}

    public final void setUniform1i(ProgramUniform arg0, int arg1, BaseTexture arg2) {
		this.programs[this.currentProgramIndex].setUniform1i(arg0, arg1, arg2);
	}

    public final void setUniform3f(int arg0, float arg1, float arg2, float arg3) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1, arg2, arg3);
	}

    public final void setUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
		this.programs[this.currentProgramIndex].setUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

    public final void setUniform3fv(int arg0, Vector3 arg1) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1.x, arg1.y, arg1.z);
	}

    public final void setUniformFloatv(int arg0, float[] arg1, int arg2) {
		this.programs[this.currentProgramIndex].setUniformFloatv(arg0, arg1, arg2);
	}

    public final void setUniform3fv(int arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform3fv(arg0, arg1);
	}

    public final void setUniform2fv(int arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform2fv(arg0, arg1);
	}

    public final void setUniform4fv(int arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform4fv(arg0, arg1);
	}

    public final void setUniform1i(int arg0, int arg1, BaseTexture arg2) {
		this.programs[this.currentProgramIndex].setUniform1i(arg0, arg1, arg2);
	}

    public ProgramUniform getUniform(String name) throws UniformNotFoundException {
		ProgramUniform var2 = (ProgramUniform) this.uniforms.get(name);
		if (var2 == null) {
			throw new UniformNotFoundException(name);
		}
		return var2;
	}

    public int getUniform2Count() {
		return this.uniforms2Count;
	}

    public ProgramUniform getUniform2(int id) {
		return (ProgramUniform) this.uniforms2.get(id);
	}

    public ProgramUniform getUniform2(String name) {
		return (ProgramUniform) this.uniforms2.get(name);
	}

    public int getUniformCount() {
		return this.uniformsCount;
	}

    public ProgramUniform getUniform(int arg0) {
		return (ProgramUniform) this.uniforms.get(arg0);
	}

    public void method4191() {
	}

    public abstract GpuProgram createProgram(GpuToolkit arg0, ProgramData arg1);

    public abstract boolean setCurrentProgram(GpuProgram arg0);

    public abstract ProgramUniform method4165(ProgramUniformData arg0);

    public abstract boolean method4184();

    public abstract void method4214();

    public abstract void enable();
}
