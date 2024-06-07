package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;


public abstract class WallDecorLayerEntity extends GraphEntity {

    public short field12452;

    public short field12451;

    public int field12450 = 0;

    public Light[] field12453 = new Light[4];

	public WallDecorLayerEntity(Scene scene, int arg1, int arg2, int arg3, int level, int occludeLevel, int arg6, int arg7, ScaleRotTrans scaleRotTrans) {
		super(scene, scaleRotTrans);
		this.level = (byte) level;
		this.occludeLevel = (byte) occludeLevel;
		this.field12452 = (short) arg6;
		this.field12451 = (short) arg7;
		if (scaleRotTrans != null) {
			this.method10529(scaleRotTrans);
		}
		this.method10532((float) arg1, (float) arg2, (float) arg3);
		for (int var10 = 0; var10 < 4; var10++) {
			this.field12453[var10] = null;
		}
	}

    public int method18375(Light[] arg0) {
		if (this.field8176) {
			Vector3 var2 = this.getTransform().trans;
			this.field12450 = this.method18362((int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, this.field12453);
			this.field8176 = false;
		}
		for (int var3 = 0; var3 < this.field12450; var3++) {
			arg0[var3] = this.field12453[var3];
		}
		return this.field12450;
	}

    public boolean isOccluded(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		return this.scene.occlusionManager.visible(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, this.overlayHeight());
	}

    public boolean isVisible() {
		Vector3 var1 = this.getTransform().trans;
		return this.scene.visibilityMap[this.scene.drawDistance + (((int) var1.x >> this.scene.size) - this.scene.eyeTileX)][this.scene.drawDistance + (((int) var1.z >> this.scene.size) - this.scene.eyeTileZ)];
	}

    public final boolean method17379() {
		return false;
	}

    public final void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

    public final void applyLighting() {
		throw new IllegalStateException();
	}
}
