package com.jagex.graphics.camera;



public class CameraProjectionMode {

    public static final CameraProjectionMode field2831 = new CameraProjectionMode(0);

    public static final CameraProjectionMode field2833 = new CameraProjectionMode(1);

    public static final CameraProjectionMode field2832 = new CameraProjectionMode(2);

    public int field2834;

	public CameraProjectionMode(int arg0) {
		this.field2834 = arg0;
	}

    public static CameraProjectionMode method16906(int arg0) {
		if (field2831.field2834 == arg0) {
			return field2831;
		} else if (field2833.field2834 == arg0) {
			return field2833;
		} else if (field2832.field2834 == arg0) {
			return field2832;
		} else {
			return null;
		}
	}
}
