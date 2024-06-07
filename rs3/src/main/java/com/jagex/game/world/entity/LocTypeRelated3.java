package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class LocTypeRelated3 implements SerializableEnum {

    public static final LocTypeRelated3 field7601 = new LocTypeRelated3(0);

    public static final LocTypeRelated3 field7597 = new LocTypeRelated3(1);

    public static final LocTypeRelated3 field7598 = new LocTypeRelated3(2);

    public static final LocTypeRelated3 field7599 = new LocTypeRelated3(3);

    public static final LocTypeRelated3 field7600 = new LocTypeRelated3(4);

    public static final LocTypeRelated3 field7596 = new LocTypeRelated3(5);

    public final int field7602;

    public static LocTypeRelated3[] method208() {
		return new LocTypeRelated3[] { field7597, field7601, field7600, field7599, field7596, field7598 };
	}

	public LocTypeRelated3(int arg0) {
		this.field7602 = arg0;
	}

    public int getId() {
		return this.field7602;
	}
}
