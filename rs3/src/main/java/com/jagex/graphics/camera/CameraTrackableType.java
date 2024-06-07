package com.jagex.graphics.camera;

import deob.ObfuscatedName;

public class CameraTrackableType {

    public static final CameraTrackableType PLAYER = new CameraTrackableType(0);

    public static final CameraTrackableType NPC = new CameraTrackableType(1);

    public int id;

	public CameraTrackableType(int id) {
		this.id = id;
	}

    public static CameraTrackableType of(int index) {
        if (PLAYER.id == index) {
            return PLAYER;
        } else if (NPC.id == index) {
            return NPC;
        } else {
            return null;
        }
    }
}
