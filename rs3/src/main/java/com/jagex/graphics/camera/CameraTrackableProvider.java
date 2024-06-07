package com.jagex.graphics.camera;

import deob.ObfuscatedName;

public interface CameraTrackableProvider {

    CameraTrackable getCameraTrackable(CameraTrackableType cameraTrackableType, int index);
}
