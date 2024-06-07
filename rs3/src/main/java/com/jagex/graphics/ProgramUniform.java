package com.jagex.graphics;

import com.jagex.core.datastruct.HashMapValue;
import com.jagex.graphics.glx.GlxError;
import deob.ObfuscatedName;

public abstract class ProgramUniform extends HashMapValue {

    public UniformType field12211;

    public String field12210;

    public String field12209;

    public int field12212;

    public UniformType field12213;

	public ProgramUniform(ProgramUniformData arg0) {
		this.field12211 = arg0.uniformType;
		this.field12210 = arg0.field2586;
		this.field12209 = arg0.field2590;
		this.field12212 = arg0.field2588;
		this.field12213 = arg0.field2587;
	}

	public String toString() {
		String var1 = this.field12211.toString() + " " + this.field12210;
		if (this.field12209 != null && !"".equals(this.field12209)) {
			var1 = var1 + " : " + this.field12209;
		}
		return var1;
	}

    public String method19257() {
		return this.field12210;
	}

    public UniformType getType() {
		return this.field12211;
	}

    public UniformType getElementType() {
		return this.field12213;
	}

    public int getElementCount() {
		if (UniformType.ARRAY != this.field12211) {
			throw new GlxError(this, this.field12211.toString().toLowerCase());
		}
		return this.field12212;
	}

    public abstract boolean method19245(int arg0);

    public abstract int getLocation(int arg0);
}
