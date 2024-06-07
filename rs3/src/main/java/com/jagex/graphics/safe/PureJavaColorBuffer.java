package com.jagex.graphics.safe;

import com.jagex.graphics.GraphicsDeletable;


public class PureJavaColorBuffer implements GraphicsDeletable {

    public final int field893;

    public final int field892;

    public final int[] field891;

	public PureJavaColorBuffer(int arg0, int arg1) {
		this(arg0, arg1, new int[arg0 * arg1]);
	}

	public PureJavaColorBuffer(int arg0, int arg1, int[] arg2) {
		this.field893 = arg0;
		this.field892 = arg1;
		this.field891 = arg2;
	}

    public int method1015() {
		return this.field893;
	}

    public int method1009() {
		return this.field892;
	}

    public void delete() {
	}
}
