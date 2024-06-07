package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;


public class SkyBoxFillMode implements SerializableEnum {

    public static final SkyBoxFillMode field7239 = new SkyBoxFillMode(0);

    public static final SkyBoxFillMode field7237 = new SkyBoxFillMode(1);

    public int field7238;

    public static SkyBoxFillMode[] method8341() {
		return new SkyBoxFillMode[] { field7239, field7237 };
	}

	public SkyBoxFillMode(int arg0) {
		this.field7238 = arg0;
	}

    public int getId() {
		return this.field7238;
	}
}
