package com.jagex.graphics.camera;

import deob.ObfuscatedName;

public class CameraEffectType {

    public static final CameraEffectType SHAKE = new CameraEffectType(0);

    public static final CameraEffectType ZTILT = new CameraEffectType(1);

    public final int index;

	public CameraEffectType(int index) {
		this.index = index;
	}

    public static CameraEffectType of(int index) {
        if (SHAKE.index == index) {
            return SHAKE;
        } else if (ZTILT.index == index) {
            return ZTILT;
        } else {
            return null;
        }
    }
}
