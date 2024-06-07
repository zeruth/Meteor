package rs2.client.scene.entities;

import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.graphics.scenegraph.PrimaryLayerEntity;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;

import rs2.client.Client;

public class SpotAnimation extends PrimaryLayerEntity {

    public int effectAnim;

    public int field12608 = 0;

    public AnimationNode field12609;

    public int overlayHeight = 0;

    public boolean field12611 = true;

    public ParticleSystem field12612;

    public int targeted = 0;

	public SpotAnimation(Scene scene, int effectAnim, int arg2, int level, int occludeLevel, int x, int y, int z, int minSceneTileX, int maxSceneTileX, int minSceneTileZ, int maxSceneTileZ, int arg12, boolean arg13, int targeted) {
		super(scene, level, occludeLevel, x, y, z, minSceneTileX, maxSceneTileX, minSceneTileZ, maxSceneTileZ, false, (byte) 0);
		this.effectAnim = effectAnim;
		this.field12608 = arg12;
		this.targeted = targeted;
		EffectAnimType var16 = (EffectAnimType) Client.effectAnimTypeList.list(this.effectAnim);
		int var17 = var16.anim;
		if (var17 != -1) {
			this.field12609 = new EntityAnimationNode(this, false);
			int var18 = var16.field8261 ? 0 : 2;
			if (arg13) {
				var18 = 1;
			}
			this.field12609.method14353(var17, arg2, var18, false);
		}
		this.createEntityBounds(1);
	}

    public boolean method16488() {
		return false;
	}

    public boolean method16489() {
		return this.field12611;
	}

    public int overlayHeight() {
		return this.overlayHeight;
	}

    public int targeted() {
		return this.targeted;
	}

    public EntityBounds method17371(Toolkit toolkit) {
		return null;
	}

    public final void method19746(int arg0) {
		if (this.field12609 != null && !this.field12609.method14375()) {
			this.field12609.method14367(arg0);
		}
	}

    public final boolean method19751() {
		return this.field12609 != null && !this.field12609.method14355();
	}

    public final boolean method19747() {
		return this.field12609 == null || this.field12609.method14375();
	}

    public Model method19748(Toolkit arg0, int arg1, int arg2) {
		EffectAnimType var4 = (EffectAnimType) Client.effectAnimTypeList.list(arg2);
		FloorModel var5 = this.scene.field6915[this.level];
		FloorModel var6 = this.occludeLevel < 3 ? this.scene.field6915[this.occludeLevel + 1] : null;
		Vector3 var7 = this.getTransform().trans;
		return this.field12609 == null || this.field12609.method14375() ? var4.getModel(arg0, arg1, this.field12608 * 2048, var5, var6, (int) var7.x, (int) var7.y, (int) var7.z, null, (byte) 2) : var4.getModel(arg0, arg1, this.field12608 * 2048, var5, var6, (int) var7.x, (int) var7.y, (int) var7.z, this.field12609, (byte) 2);
	}

    public PickableEntity draw(Toolkit toolkit) {
		Model var2 = this.method19748(toolkit, (this.field12608 == 0 ? 0 : 5) | 0x800, this.effectAnim);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method10533();
		this.method19750(toolkit, var2, var3);
		PickableEntity var4 = PickableEntity.getPickableEntity(false);
		var2.draw(var3, this.entityBounds[0], 0);
		if (this.field12612 != null) {
			ParticleList var5 = this.field12612.method9965();
			toolkit.drawParticles(var5);
		}
		this.field12611 = var2.method1731();
		this.overlayHeight = var2.getMinY();
		var2.getRadius();
		return var4;
	}

    public void method17373(Toolkit toolkit) {
		Model var2 = this.method19748(toolkit, 0, this.effectAnim);
		if (var2 != null) {
			this.method19750(toolkit, var2, this.method10533());
		}
	}

    public void method19750(Toolkit arg0, Model arg1, Matrix4x3 arg2) {
		arg1.method1689(arg2);
		ModelParticleEmitter[] var4 = arg1.method1750();
		ModelParticleEffector[] var5 = arg1.method1765();
		if ((this.field12612 == null || this.field12612.field7804) && (var4 != null || var5 != null)) {
			this.field12612 = ParticleSystem.method9962(Client.loopCycle, true);
		}
		if (this.field12612 != null) {
			this.field12612.method9936(arg0, (long) Client.loopCycle, var4, var5, false);
			this.field12612.method9963(this.level, this.minSceneTileX, this.maxSceneTileX, this.minSceneTileZ, this.maxSceneTileZ);
		}
	}

    public void method19749() {
		if (this.field12612 != null) {
			this.field12612.method9932();
		}
	}

    public boolean method17375(Toolkit toolkit, int arg1, int arg2) {
		return false;
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
