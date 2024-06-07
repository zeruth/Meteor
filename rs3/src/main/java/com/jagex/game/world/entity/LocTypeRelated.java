package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;


public class LocTypeRelated implements SerializableEnum {

    public static final LocTypeRelated field7438 = new LocTypeRelated(0);

    public static final LocTypeRelated field7439 = new LocTypeRelated(1);

    public static final LocTypeRelated field7440 = new LocTypeRelated(2);

    public final int field7441;

	public LocTypeRelated(int arg0) {
		this.field7441 = arg0;
	}

    public static LocTypeRelated[] method9002() {
        return new LocTypeRelated[] {field7440, field7439, field7438};
    }

    public int getId() {
		return this.field7441;
	}
}
