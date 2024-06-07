package com.jagex.js5;

import com.jagex.core.constants.SerializableEnum;


public class Js5WorldMapGroup implements SerializableEnum {

    public static final Js5WorldMapGroup field7968 = new Js5WorldMapGroup(0);

    public static final Js5WorldMapGroup field7970 = new Js5WorldMapGroup(1);

    public static final Js5WorldMapGroup field7967 = new Js5WorldMapGroup(2);

    public static final Js5WorldMapGroup field7969 = new Js5WorldMapGroup(3);

    public static final Js5WorldMapGroup field7971 = new Js5WorldMapGroup(4);

    public int field7972;

	public Js5WorldMapGroup(int arg0) {
		this.field7972 = arg0;
	}

    public int getId() {
		return this.field7972;
	}
}
