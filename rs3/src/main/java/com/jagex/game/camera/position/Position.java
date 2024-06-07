package com.jagex.game.camera.position;

import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

public abstract class Position {

    public final Camera camera;

	public Position(Camera camera) {
		this.camera = camera;
	}

    public abstract boolean method5218();

    public abstract Vector3 method5219();

    public abstract CoordFine method5221();

    public abstract float method5222();

    public abstract void method5223(Vector3i arg0, int arg1, int arg2);

    public abstract void method5224(Packet arg0);

    public abstract double[] method5230();

    public abstract void method5238(float arg0, int[][][] arg1, SceneLevelTileFlags arg2, int arg3, int arg4);
}
