package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;


public class GroupUserKind implements SerializableEnum {

    public static final GroupUserKind field2136 = new GroupUserKind(2, 0);

    public static final GroupUserKind field2138 = new GroupUserKind(0, 1);

    public static final GroupUserKind field2137 = new GroupUserKind(3, 2);

    public static final GroupUserKind field2139 = new GroupUserKind(1, 3);

    public static final GroupUserKind field2135 = new GroupUserKind(4, 4);

    public static final GroupUserKind field2140 = new GroupUserKind(5, 5);

    public final int index;

    public final int serialID;

	public GroupUserKind(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
