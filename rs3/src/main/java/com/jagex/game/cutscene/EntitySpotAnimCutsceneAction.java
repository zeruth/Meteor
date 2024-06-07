package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;


public class EntitySpotAnimCutsceneAction extends CutsceneAction_Sub1 {

    public final int field12045;

    public final int field12046;

    public final int field12047;

	public EntitySpotAnimCutsceneAction(Packet arg0) {
		super(arg0);
		this.field12045 = arg0.g2();
		this.field12046 = arg0.g1();
		this.field12047 = arg0.g2();
	}

    public void method2890() {
		CutsceneManager.entities[this.field12045].getEntity().addSpotAnimation(this.field10303, this.field10305 << 16, this.field10304, this.field12047, false, this.field12046);
	}
}
