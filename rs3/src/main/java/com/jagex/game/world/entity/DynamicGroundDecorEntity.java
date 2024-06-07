package com.jagex.game.world.entity;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.ScaleRotTrans;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

public class DynamicGroundDecorEntity extends GroundDecorLayerEntity implements Location {

    public DynamicLoc loc;

    public boolean active;

    public EntityBounds field11134;

    public boolean field11135 = true;

	public DynamicGroundDecorEntity(Scene scene, Toolkit toolkit, LocTypeList locTypeList, LocType locType, int level, int occludeLevel, int x, int y, int z, boolean underwater, int angle, int arg11, int arg12, ScaleRotTrans scaleRotTrans) {
		super(scene, x, y, z, level, occludeLevel, locType.field7448, scaleRotTrans);
		this.loc = new DynamicLoc(toolkit, locTypeList, locType, LocShape.GROUND_DECOR.id, angle, occludeLevel, this, underwater, arg11, arg12);
		this.active = locType.active != 0 && !underwater;
		this.createEntityBounds(1);
	}

    public boolean method16488() {
		return false;
	}

    public boolean method16489() {
		return this.field11135;
	}

    public EntityBounds method17371(Toolkit toolkit) {
		return this.field11134;
	}

    public int overlayHeight() {
		return this.loc.overlayHeight();
	}

    public int height() {
		return this.loc.height();
	}

    public PickableEntity draw(Toolkit toolkit) {
		Model var2 = this.loc.getModel(toolkit, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		ScaleRotTrans var4 = this.getTransform();
		PickableEntity var5 = PickableEntity.getPickableEntity(this.active);
		int var6 = (int) var4.trans.x >> 9;
		int var7 = (int) var4.trans.z >> 9;
		this.loc.method8239(toolkit, var2, var3, var6, var6, var7, var7, true);
		LocType var8 = this.loc.getLocType();
		if (var8.clickbox == null) {
			var2.draw(var3, this.entityBounds[0], 0);
		} else {
			var2.draw(var3, null, 0);
			toolkit.method2193(var3, this.entityBounds[0], var8.clickbox);
		}
		if (this.loc.field6680 != null) {
			ParticleList var9 = this.loc.field6680.method9965();
			toolkit.drawParticles(var9);
		}
		this.field11135 = var2.method1731() || this.loc.field6680 != null;
		if (this.field11134 == null) {
			this.field11134 = GraphEntity.method15111((int) var4.trans.x, (int) var4.trans.y, (int) var4.trans.z, var2);
		} else {
			GraphEntity.method8229(this.field11134, (int) var4.trans.x, (int) var4.trans.y, (int) var4.trans.z, var2);
		}
		return var5;
	}

    public void method17373(Toolkit toolkit) {
		Model var2 = this.loc.getModel(toolkit, 262144, true, true);
		if (var2 != null) {
			Vector3 var3 = this.getTransform().trans;
			int var4 = (int) var3.x >> 9;
			int var5 = (int) var3.z >> 9;
			this.loc.method8239(toolkit, var2, this.method10533(), var4, var4, var5, var5, false);
		}
	}

    public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		LocType var4 = this.loc.getLocType();
		if (var4.clickbox == null) {
			Model var5 = this.loc.getModel(toolkit, 131072, false, false);
			return var5 == null ? false : var5.method1725(arg1, arg2, this.method10533(), false, 0);
		} else {
			return toolkit.pick(arg1, arg2, this.method10533(), var4.clickbox);
		}
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

    public int getId() {
		return this.loc.id;
	}

    public int getShape() {
		return this.loc.shape;
	}

    public int getAngle() {
		return this.loc.angle;
	}

    public void method17396(LocTypeCustomisation arg0) {
		this.loc.method8265(arg0);
	}

    public void method8205() {
	}

    public boolean method8207() {
		return true;
	}

    public boolean hasShadow() {
		return this.loc.hasShadow();
	}

    public void method8217(Toolkit arg0) {
		this.loc.method8241(arg0);
	}

    public void method8209(Toolkit arg0) {
		this.loc.method8242(arg0);
	}
}
