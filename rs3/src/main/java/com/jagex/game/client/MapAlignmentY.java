package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class MapAlignmentY implements SerializableEnum {

    public static final MapAlignmentY field2426 = new MapAlignmentY(1, 0);

    public static final MapAlignmentY field2424 = new MapAlignmentY(2, 1);

    public static final MapAlignmentY field2422 = new MapAlignmentY(0, 2);

    public final int index;

    public final int serialID;

	public MapAlignmentY(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public static MapAlignmentY[] values() {
        return new MapAlignmentY[] {field2422, field2426, field2424};
    }

    public int getId() {
		return this.serialID;
	}
}
