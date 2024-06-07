package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;


public class MaterialAlphaMode implements SerializableEnum {

    public static final MaterialAlphaMode NONE = new MaterialAlphaMode(0);

    public static final MaterialAlphaMode TEST = new MaterialAlphaMode(1);

    public static final MaterialAlphaMode MULTIPLY = new MaterialAlphaMode(2);

    public final int field7576;

	public MaterialAlphaMode(int arg0) {
		this.field7576 = arg0;
	}

    public static MaterialAlphaMode[] method8501() {
        return new MaterialAlphaMode[] { MULTIPLY, NONE, TEST};
    }

    public int getId() {
		return this.field7576;
	}
}
