package com.jagex.graphics.gl;

import deob.ObfuscatedName;
import jaggl.OpenGL;

public class GlShader {

    public static final int[] field1017 = new int[2];

    public final GlToolkit field1018;

    public final int field1019;

    public static GlShader method1120(GlToolkit arg0, int arg1, String arg2) {
		int var3 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(var3, arg2);
		OpenGL.glCompileShader(var3);
		OpenGL.glGetShaderiv(var3, 35713, field1017, 0);
		if (field1017[0] == 0) {
			boolean var4 = false;
			if (field1017[0] == 0) {
				var4 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(var3, 35716, field1017, 1);
			if (field1017[1] > 1) {
				byte[] var5 = new byte[field1017[1]];
				OpenGL.glGetShaderInfoLog(var3, field1017[1], field1017, 0, var5, 0);
				System.out.println(new String(var5));
			}
			if (var4) {
				OpenGL.glDeleteShader(var3);
				return null;
			}
		}
		return new GlShader(arg0, var3, arg1);
	}

	public GlShader(GlToolkit arg0, int arg1, int arg2) {
		this.field1018 = arg0;
		this.field1019 = arg1;
	}

	public void finalize() throws Throwable {
		this.field1018.method15816((long) this.field1019);
		super.finalize();
	}
}
