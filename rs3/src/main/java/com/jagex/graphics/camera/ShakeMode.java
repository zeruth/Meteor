package com.jagex.graphics.camera;



public class ShakeMode {

    public static final ShakeMode field2625 = new ShakeMode(0);

    public static final ShakeMode field2620 = new ShakeMode(1);

    public static final ShakeMode field2619 = new ShakeMode(2);

    public static final ShakeMode field2622 = new ShakeMode(3);

    public static final ShakeMode field2623 = new ShakeMode(4);

    public static final ShakeMode field2624 = new ShakeMode(5);

    public int id;

	public ShakeMode(int id) {
		this.id = id;
	}

    public static ShakeMode of(int id) {
		if (field2625.id == id) {
			return field2625;
		} else if (field2620.id == id) {
			return field2620;
		} else if (field2619.id == id) {
			return field2619;
		} else if (field2622.id == id) {
			return field2622;
		} else if (field2623.id == id) {
			return field2623;
		} else if (field2624.id == id) {
			return field2624;
		} else {
			return null;
		}
	}
}
