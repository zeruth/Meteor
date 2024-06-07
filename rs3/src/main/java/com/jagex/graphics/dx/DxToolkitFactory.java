package com.jagex.graphics.dx;

import com.jagex.game.client.NativeLibraries;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.GpuToolkit;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.TextureList;
import com.jagex.js5.Js5;


import java.awt.*;

public class DxToolkitFactory {

	public DxToolkitFactory() throws Throwable {
		throw new Error();
	}

    public static Toolkit create(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, Js5 arg6, int arg7) {
		try {
			GpuToolkit.method15968();
			NativeLibraries.getLoader().load("jagdx");
			return DxToolkit.method19043(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new RuntimeException("");
		}
	}
}
