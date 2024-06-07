package com.jagex.graphics;

import com.jagex.core.datastruct.Node;
import com.jagex.game.client.DataType;
import com.jagex.graphics.gl.GlTexture_Sub1;
import com.jagex.graphics.gl.GlToolkit;
import deob.ObfuscatedName;

public abstract class PostProcessingFilter extends Node {

    public final GlToolkit field11270;

    public boolean field11271;

	public PostProcessingFilter(GlToolkit arg0) {
		this.field11270 = arg0;
	}

    public int method17569() {
		return 1;
	}

    public boolean method17541() {
		return false;
	}

    public DataType method17542() {
		return DataType.UNSIGNED_INT_8;
	}

    public boolean method17543() {
		return this.field11271;
	}

    public abstract boolean method17534();

    public abstract void method17537(int arg0, GlTexture_Sub1 arg1, GlTexture_Sub1 arg2, int arg3, int arg4);

    public abstract void method17538(int arg0);

    public abstract boolean method17539();

    public abstract void method17540(int arg0, int arg1);

    public abstract int method17546();

    public abstract boolean method17551();

    public abstract void method17570();
}
