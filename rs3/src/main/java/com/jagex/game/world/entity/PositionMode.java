package com.jagex.game.world.entity;



public class PositionMode {

    public static final PositionMode POINT = new PositionMode(0, false);

    public static final PositionMode ENTITY = new PositionMode(1, false);

    public static final PositionMode field2819 = new PositionMode(2, true);

    public static final PositionMode field2817 = new PositionMode(3, true);

    public static final PositionMode field2818 = new PositionMode(4, true);

    public final int index;

    public final boolean field2820;

	public PositionMode(int index, boolean arg1) {
		this.index = index;
		this.field2820 = arg1;
	}

    public static PositionMode method1058(int arg0) {
		if (POINT.index == arg0) {
			return POINT;
		} else if (ENTITY.index == arg0) {
			return ENTITY;
		} else if (field2819.index == arg0) {
			return field2819;
		} else if (field2817.index == arg0) {
			return field2817;
		} else if (field2818.index == arg0) {
			return field2818;
		} else {
			return null;
		}
	}

    public boolean method4623() {
		return this.field2820;
	}
}
