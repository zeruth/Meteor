package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;


public class MaterialQualityMode implements SerializableEnum {

    public static final MaterialQualityMode field7590 = new MaterialQualityMode(0);

    public static final MaterialQualityMode HD = new MaterialQualityMode(1);

    public static final MaterialQualityMode LD = new MaterialQualityMode(2);

    public final int field7591;

    public static MaterialQualityMode[] method745() {
		return new MaterialQualityMode[] { field7590, HD, LD };
	}

	public MaterialQualityMode(int arg0) {
		this.field7591 = arg0;
	}

    public int getId() {
		return this.field7591;
	}
}
