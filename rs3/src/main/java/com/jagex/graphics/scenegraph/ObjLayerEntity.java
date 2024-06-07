package com.jagex.graphics.scenegraph;

import com.jagex.game.world.entity.PrimaryLayerEntityList;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

public abstract class ObjLayerEntity extends GraphEntity {

	public ObjLayerEntity(Scene scene, int x, int y, int z, int level, int occludeLevel) {
		super(scene);
		this.level = (byte) level;
		this.occludeLevel = (byte) occludeLevel;
		this.method10531(new Vector3((float) x, (float) y, (float) z));
	}

    public int method18375(Light[] arg0) {
		Vector3 var2 = this.getTransform().trans;
		return this.method18362((int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, arg0);
	}

    public boolean isOccluded(Toolkit toolkit) {
		Vector3 var2 = this.getTransform().trans;
		PrimaryLayerEntityList var3 = this.scene.getEntities(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
		return var3 != null && var3.field7057.raised ? this.scene.occlusionManager.visible(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size, var3.field7057.overlayHeight() + this.overlayHeight()) : this.scene.occlusionManager.tileVisible(this.occludeLevel, (int) var2.x >> this.scene.size, (int) var2.z >> this.scene.size);
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
