package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;


public class AmbientOcclusionValue implements SerializableEnum {

    public static final AmbientOcclusionValue field2680 = new AmbientOcclusionValue(0);

    public static final AmbientOcclusionValue field2677 = new AmbientOcclusionValue(1);

    public static final AmbientOcclusionValue field2679 = new AmbientOcclusionValue(2);

    public final int field2678;

	public AmbientOcclusionValue(int arg0) {
		this.field2678 = arg0;
	}

    public int getId() {
		return this.field2678;
	}
}
