package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class EntityLookCutsceneAction extends CutsceneAction {

    public final int field10267;

    public final int field10266;

	public EntityLookCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10267 = arg0.g2();
		this.field10266 = arg0.g2();
	}

    public void method2890() {
		CutsceneManager.entities[this.field10267].getEntity().method16491(this.field10266, true);
	}
}
