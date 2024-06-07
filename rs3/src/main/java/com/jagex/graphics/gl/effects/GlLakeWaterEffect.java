package com.jagex.graphics.gl.effects;

import com.jagex.graphics.GlRenderList;
import com.jagex.graphics.gl.GlWaterRelated;
import com.jagex.graphics.gl.GlToolkit;
import com.jagex.graphics.gl.GlTexture;
import deob.ObfuscatedName;
import jaggl.OpenGL;

public class GlLakeWaterEffect extends GlEffect {

    public GlRenderList field9297;

    public GlWaterRelated field9295;

    public static final float[] field9296 = new float[4];

	public GlLakeWaterEffect(GlToolkit arg0, GlWaterRelated arg1) {
		super(arg0);
		this.field9295 = arg1;
		this.field9297 = new GlRenderList(arg0, 2);
		this.field9297.method1245(0);
		this.field1021.method15776(1);
		if (this.field9295.field1040) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.field1021.method15776(0);
		this.field9297.method1243();
		this.field9297.method1245(1);
		this.field1021.method15776(1);
		if (this.field9295.field1040) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.field1021.method15776(0);
		this.field9297.method1243();
	}

    public boolean method1252() {
		return true;
	}

    public void method1263(boolean arg0) {
		this.field9297.method1246('\u0000');
		if (this.field9295.field1040) {
			this.field1021.method15776(1);
			this.field1021.method15777(this.field9295.field1044);
			this.field1021.method15776(0);
		}
	}

    public void method1254(boolean arg0) {
	}

    public void method1255() {
		this.field9297.method1246('\u0001');
		this.field1021.method15776(1);
		this.field1021.method15777(null);
		this.field1021.method15776(0);
	}

    public void method1256(int arg0, int arg1) {
		float var3 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.field1021.method15776(1);
		if (var6) {
			field9296[0] = var5;
			field9296[1] = 0.0F;
			field9296[2] = 0.0F;
			field9296[3] = 0.0F;
		} else {
			field9296[0] = 0.0F;
			field9296[1] = 0.0F;
			field9296[2] = var5;
			field9296[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, field9296, 0);
		field9296[0] = 0.0F;
		field9296[1] = var5;
		field9296[2] = 0.0F;
		field9296[3] = (float) this.field1021.field9872 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, field9296, 0);
		if (this.field9295.field1040) {
			field9296[0] = 0.0F;
			field9296[1] = 0.0F;
			field9296[2] = 0.0F;
			field9296[3] = (float) this.field1021.field9872 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, field9296, 0);
		} else {
			int var7 = (int) ((float) this.field1021.field9872 * var4 * 16.0F);
			this.field1021.method15777(this.field9295.field1043[var7 % 16]);
		}
		this.field1021.method15776(0);
	}

    public void method1251(GlTexture arg0, int arg1) {
		this.field1021.method15777(arg0);
		this.field1021.method15778(arg1);
	}
}
