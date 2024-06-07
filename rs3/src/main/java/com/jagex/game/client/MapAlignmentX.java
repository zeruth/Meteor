package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;


public class MapAlignmentX implements SerializableEnum {

    public static final MapAlignmentX field2420 = new MapAlignmentX(1, 0);

    public static final MapAlignmentX field2417 = new MapAlignmentX(2, 1);

    public static final MapAlignmentX field2418 = new MapAlignmentX(0, 2);

    public final int index;

    public final int serialID;

    public static MapAlignmentX[] values() {
		return new MapAlignmentX[] { field2418, field2420, field2417 };
	}

	public MapAlignmentX(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    public int getId() {
		return this.serialID;
	}
}
