package com.jagex.game;

import com.jagex.game.world.entity.*;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

public class HintTrailPoint extends PrimaryLayerEntity {

    public HintTrail hintTrail;

	public HintTrailPoint(Scene scene, HintTrail hintTrail, int level, int occludeLevel, int x, int y, int z) {
		super(scene, level, occludeLevel, x, y, z, x >> 9, x >> 9, z >> 9, z >> 9, false, (byte) 0);
		this.hintTrail = hintTrail;
	}

    public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		return false;
	}

    public boolean method17379() {
		return false;
	}

    public boolean method16488() {
		return true;
	}

    public boolean method16489() {
		return false;
	}

    public void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
	}

    public void applyLighting() {
	}

    public PickableEntity draw(Toolkit toolkit) {
		if (this.hintTrail.model == null) {
			return null;
		}
		Matrix4x3 var2 = toolkit.method2209();
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		var2.setTo(var3);
		Tile var5 = this.scene.levelTiles[this.level][(int) var4.trans.x >> 9][(int) var4.trans.z >> 9];
		if (var5 != null && var5.groundDecoration != null) {
			var2.translate(0.0F, (float) -var5.groundDecoration.field12448, 0.0F);
		}
		this.hintTrail.model.draw(var2, null, 0);
		return null;
	}

    public void method17373(Toolkit toolkit) {
	}

    public EntityBounds method17371(Toolkit toolkit) {
		return null;
	}

    public int overlayHeight() {
		return this.hintTrail.model == null ? 0 : this.hintTrail.model.getMinY();
	}
}
