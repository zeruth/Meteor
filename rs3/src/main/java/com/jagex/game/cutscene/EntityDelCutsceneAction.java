package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class EntityDelCutsceneAction extends CutsceneAction {

    public final int field10290;

	public EntityDelCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10290 = arg0.g2();
	}

    public void method2890() {
		CutsceneManager.entities[this.field10290].method2868();
	}
}
