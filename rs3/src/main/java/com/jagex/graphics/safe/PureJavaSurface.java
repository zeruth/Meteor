package com.jagex.graphics.safe;

import com.jagex.graphics.Surface;


import java.awt.*;

public abstract class PureJavaSurface extends Surface {

    public final PureJavaToolkit field11930;

    public final Canvas field11926;

    public int field11925;

    public int field11927;

    public int[] field11928;

    public float[] field11929;

    public boolean field11924;

    public static PureJavaSurface method18912(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
		return new DefaultPureJavaSurface(arg0, arg1, arg2, arg3);
	}

	public PureJavaSurface(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
		this.field11926 = arg1;
		this.field11930 = arg0;
		this.field11925 = arg2;
		this.field11927 = arg3;
	}

    public void method18971() {
		this.field11928 = new int[this.field11927 * this.field11925];
		this.field11929 = new float[this.field11927 * this.field11925];
		if (this.field11924) {
			this.field11930.method15662(this.field11925, this.field11927, this.field11928, this.field11929);
		}
	}

    public final void onResize(int arg0, int arg1) {
		if (this.field11925 != arg0 || this.field11927 != arg1) {
			this.field11925 = arg0;
			this.field11927 = arg1;
			this.method18971();
		}
	}

    public int getWidth() {
		return this.field11925;
	}

    public int getHeight() {
		return this.field11927;
	}

    public final boolean method1630() {
		this.field11930.method15662(this.field11925, this.field11927, this.field11928, this.field11929);
		this.field11924 = true;
		return true;
	}

    public final boolean method1631() {
		this.field11924 = false;
		return true;
	}
}
