package com.jagex.graphics.gl.effects;

import com.jagex.graphics.gl.GlToolkit;
import com.jagex.graphics.gl.GlTexture;


public class GlLightAbsorbEffect extends GlEffect {

	public GlLightAbsorbEffect(GlToolkit arg0) {
		super(arg0);
	}

    public boolean method1252() {
		return true;
	}

    public void method1263(boolean arg0) {
		this.field1021.method15840(true);
	}

    public void method1254(boolean arg0) {
	}

    public void method1255() {
		this.field1021.method15840(false);
	}

    public void method1256(int arg0, int arg1) {
	}

    public void method1251(GlTexture arg0, int arg1) {
		this.field1021.method15777(arg0);
		this.field1021.method15778(arg1);
	}
}
