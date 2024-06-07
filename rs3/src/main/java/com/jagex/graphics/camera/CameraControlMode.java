package com.jagex.graphics.camera;

import deob.ObfuscatedName;

public class CameraControlMode {

    public static final CameraControlMode SERVER = new CameraControlMode(0);

    public static final CameraControlMode CLIENT = new CameraControlMode(1);

    public int index;

	public CameraControlMode(int index) {
		this.index = index;
	}

    public static CameraControlMode of(int index) {
		if (SERVER.index == index) {
			return SERVER;
		} else if (CLIENT.index == index) {
			return CLIENT;
		} else {
			return null;
		}
	}
}
