package com.jagex.graphics.gl;



public class GlModelRelated3 {

    public int field1054;

    public int field1050 = 128;

    public int field1051 = 128;

    public int field1049;

    public int field1052;

    public int field1053;

	public GlModelRelated3(int arg0) {
		this.field1054 = arg0;
	}

	public GlModelRelated3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field1054 = arg0;
		this.field1050 = arg1;
		this.field1051 = arg2;
		this.field1049 = arg3;
		this.field1052 = arg4;
		this.field1053 = arg5;
	}

    public GlModelRelated3 method1299() {
		return new GlModelRelated3(this.field1054, this.field1050, this.field1051, this.field1049, this.field1052, this.field1053);
	}

    public void method1298(GlModelRelated3 arg0) {
		this.field1050 = arg0.field1050;
		this.field1051 = arg0.field1051;
		this.field1049 = arg0.field1049;
		this.field1052 = arg0.field1052;
		this.field1054 = arg0.field1054;
		this.field1053 = arg0.field1053;
	}
}
