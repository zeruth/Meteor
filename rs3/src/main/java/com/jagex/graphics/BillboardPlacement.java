package com.jagex.graphics;



public class BillboardPlacement {

    public int field819;

    public float field813 = 1.0F;

    public float field814 = 1.0F;

    public int field822;

    public int field816;

    public int field817;

    public int field818;

    public int field812;

    public int field820;

    public int field821;

    public float field815;

	public BillboardPlacement(int arg0) {
		this.field819 = arg0;
	}

	public BillboardPlacement(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5) {
		this.field819 = arg0;
		this.field813 = arg1;
		this.field814 = arg2;
		this.field822 = arg3;
		this.field816 = arg4;
		this.field817 = arg5;
	}

    public BillboardPlacement method984() {
		return new BillboardPlacement(this.field819, this.field813, this.field814, this.field822, this.field816, this.field817);
	}

    public void method985(BillboardPlacement arg0) {
		this.field813 = arg0.field813;
		this.field814 = arg0.field814;
		this.field822 = arg0.field822;
		this.field816 = arg0.field816;
		this.field819 = arg0.field819;
		this.field817 = arg0.field817;
	}
}
