package com.jagex.game.world;

import com.jagex.core.constants.SerializableEnum;


public class BuildAreaRelated implements SerializableEnum {

    public static final BuildAreaRelated field2669 = new BuildAreaRelated(0);

    public static final BuildAreaRelated field2667 = new BuildAreaRelated(1);

    public static final BuildAreaRelated field2668 = new BuildAreaRelated(2);

    public static final BuildAreaRelated field2670 = new BuildAreaRelated(3);

    public final int field2666;

	public BuildAreaRelated(int arg0) {
		this.field2666 = arg0;
	}

    public int getId() {
		return this.field2666;
	}
}
