package com.jagex.graphics.scenegraph;

import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.world.entity.EntityBounds;
import com.jagex.game.world.entity.PickableEntity;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.Light;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.math.ScaleRotTrans;


public abstract class GraphEntity extends GraphNode {

    public Scene scene;

    public GraphEntity field11712;

    public byte level;

    public byte occludeLevel;

    public int field11715;

    public ScreenBoundingBox[] entityBounds;

    public ScaleRotTrans scaleRotTrans;

	public GraphEntity(Scene scene) {
		this(scene, (ScaleRotTrans) null);
	}

	public GraphEntity(Scene scene, ScaleRotTrans scaleRotTrans) {
		this.scene = scene;
		this.scaleRotTrans = scaleRotTrans;
	}

    public int getPickSizeShift() {
		return 0;
	}

    public boolean method18359() {
		return true;
	}

    public int method18362(int arg0, int arg1, Light[] arg2) {
		long var4 = this.scene.field6954[this.level][arg0][arg1];
		long var6 = 0L;
		int var8 = 0;
		while (var6 <= 48L) {
			int var9 = (int) (var4 >> (int) var6 & 0xFFFFL);
			if (var9 <= 0) {
				break;
			}
			arg2[var8++] = this.scene.field6926[var9 - 1].field7003;
			var6 += 16L;
		}
		for (int var10 = var8; var10 < 4; var10++) {
			arg2[var10] = null;
		}
		return var8;
	}

    public static EntityBounds method15111(int arg0, int arg1, int arg2, Model arg3) {
		return arg3 == null ? null : new EntityBounds(arg0, arg1, arg2, arg3.getHorizontalRadius(), arg3.getMinX(), arg3.getMaxX(), arg3.getMinY(), arg3.getMaxY(), arg3.getMinZ(), arg3.getMaxZ());
	}

    public static void method8229(EntityBounds arg0, int arg1, int arg2, int arg3, Model arg4) {
		if (arg4 != null) {
			arg0.method8967(arg1, arg2, arg3, arg4.getHorizontalRadius(), arg4.getMinX(), arg4.getMaxX(), arg4.getMinY(), arg4.getMaxY(), arg4.getMinZ(), arg4.getMaxZ());
		}
	}

    public int height() {
		return -this.overlayHeight();
	}

    public void createEntityBounds(int stack) {
		this.entityBounds = new ScreenBoundingBox[stack];
		for (int index = 0; index < this.entityBounds.length; index++) {
			this.entityBounds[index] = new ScreenBoundingBox();
		}
	}

    public abstract boolean method17375(Toolkit toolkit, int arg1, int arg2);

    public abstract boolean method17379();

    public abstract boolean method16488();

    public abstract boolean method16489();

    public abstract void applyLighting();

    public abstract void method17373(Toolkit toolkit);

    public abstract void mergeNormals(Toolkit toolkit, GraphEntity entity, int arg2, int arg3, int arg4, boolean arg5);

    public abstract boolean isOccluded(Toolkit toolkit);

    public abstract PickableEntity draw(Toolkit toolkit);

    public abstract boolean isVisible();

    public abstract int overlayHeight();

    public abstract EntityBounds method17371(Toolkit toolkit);

    public abstract int method18375(Light[] arg0);
}
