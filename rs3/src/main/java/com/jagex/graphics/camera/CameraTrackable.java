package com.jagex.graphics.camera;

import com.jagex.game.shared.movement.CoordFine;
import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

public interface CameraTrackable {

    Vector3 createVector3();

    CoordFine getTrackableCoord();

    Quaternion method4668();

    int getIndex();

    CameraTrackableType getCameraTrackableType();
}
