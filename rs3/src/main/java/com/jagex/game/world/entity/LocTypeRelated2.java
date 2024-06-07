package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class LocTypeRelated2 implements SerializableEnum {

    public static final LocTypeRelated2 field7594 = new LocTypeRelated2(0);

    public static final LocTypeRelated2 field7595 = new LocTypeRelated2(1);

    public static final LocTypeRelated2 field7593 = new LocTypeRelated2(2);

    public final int field7592;

    public static LocTypeRelated2[] method10203() {
		return new LocTypeRelated2[] { field7593, field7594, field7595 };
	}

	public LocTypeRelated2(int arg0) {
		this.field7592 = arg0;
	}

    public int getId() {
		return this.field7592;
	}
}
