package com.jagex.graphics.safe;

import com.jagex.graphics.safe.PureJavaToolkit;
import com.jagex.graphics.safe.PureJavaSurface;
import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class DefaultPureJavaSurface extends PureJavaSurface {

    public Image field12515;

	public DefaultPureJavaSurface(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		new Rectangle();
		this.method18971();
	}

    public void method18971() {
		super.method18971();
		DataBufferInt var1 = new DataBufferInt(this.field11928, this.field11928.length);
		DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field11925, this.field11927), var1, null);
		this.field12515 = new BufferedImage(var2, var3, false, new Hashtable());
	}

    public int method15451() {
		return this.method15450(0, 0);
	}

    public final int method15450(int arg0, int arg1) {
		Graphics var3 = this.field11926.getGraphics();
		if (var3 == null) {
			return 0;
		} else {
			var3.drawImage(this.field12515, arg0, arg1, this.field11926);
			return 0;
		}
	}

    public void method1629() {
	}
}
