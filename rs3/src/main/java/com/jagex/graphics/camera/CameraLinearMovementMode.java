package com.jagex.graphics.camera;



public class CameraLinearMovementMode {

    public static final CameraLinearMovementMode field2824 = new CameraLinearMovementMode(0, true);

    public static final CameraLinearMovementMode field2825 = new CameraLinearMovementMode(1, true);

    public static final CameraLinearMovementMode field2823 = new CameraLinearMovementMode(2, false);

    public int field2822;

    public boolean field2821;

	public CameraLinearMovementMode(int arg0, boolean arg1) {
		this.field2822 = arg0;
		this.field2821 = arg1;
	}

    public static CameraLinearMovementMode method17805(int arg0) {
		if (field2824.field2822 == arg0) {
			return field2824;
		} else if (field2825.field2822 == arg0) {
			return field2825;
		} else if (field2823.field2822 == arg0) {
			return field2823;
		} else {
			return null;
		}
	}
}
