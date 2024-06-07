package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

public class CompassPoint implements SerializableEnum {

    public static final CompassPoint NORTH = new CompassPoint(7, 0);

    public static final CompassPoint NORTHWEST = new CompassPoint(6, 1);

    public static final CompassPoint NORTHEAST = new CompassPoint(3, 2);

    public static final CompassPoint SOUTHWEST = new CompassPoint(5, 3);

    public static final CompassPoint SOUTH = new CompassPoint(0, 4);

    public static final CompassPoint WEST = new CompassPoint(4, 5);

    public static final CompassPoint EAST = new CompassPoint(1, 6);

    public static final CompassPoint SOUTHEAST = new CompassPoint(2, 7);

    public final int index;

    public final int serialID;

    public static CompassPoint[] values() {
		return new CompassPoint[] {NORTHWEST, SOUTH, NORTHEAST, NORTH, SOUTHEAST, EAST, SOUTHWEST, WEST};
	}

	public CompassPoint(int arg0, int arg1) {
		this.index = arg0;
		this.serialID = arg1;
	}

    public int getId() {
		return this.serialID;
	}

    public CompassPoint method13895() {
		switch(this.index) {
			case 0:
				return NORTH;
			case 1:
				return NORTHEAST;
			case 2:
				return SOUTHWEST;
			case 3:
				return EAST;
			case 4:
				return NORTHWEST;
			case 5:
				return SOUTHEAST;
			case 6:
				return WEST;
			case 7:
				return SOUTH;
			default:
				throw new IllegalStateException();
		}
	}
}
