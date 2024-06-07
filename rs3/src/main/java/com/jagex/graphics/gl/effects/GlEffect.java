package com.jagex.graphics.gl.effects;

import com.jagex.graphics.gl.GlToolkit;
import com.jagex.graphics.gl.GlTexture;


public abstract class GlEffect {

    public final GlToolkit field1021;

	public GlEffect(GlToolkit arg0) {
		this.field1021 = arg0;
	}

    public abstract void method1251(GlTexture arg0, int arg1);

    public abstract boolean method1252();

    public abstract void method1254(boolean arg0);

    public abstract void method1255();

    public abstract void method1256(int arg0, int arg1);

    public abstract void method1263(boolean arg0);
}
