package com.jagex.graphics;

import deob.ObfuscatedName;

public class WaterFogData {

    public int colour;

    public int scale;

    public int offset;

    public int field1574;

    public int field1576;

    public int field1578;

    public int field1579;

	public WaterFogData() {
	}

	public WaterFogData(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.colour = arg0;
		this.scale = arg1;
		this.offset = arg2;
		this.field1574 = arg3;
		this.field1576 = arg4;
		this.field1578 = arg5;
		this.field1579 = arg6;
	}

    public boolean method2096(WaterFogData arg0) {
		return this.colour == arg0.colour && this.scale == arg0.scale && this.offset == arg0.offset && this.field1574 == arg0.field1574 && this.field1576 == arg0.field1576 && this.field1578 == arg0.field1578 && this.field1579 == arg0.field1579;
	}
}
