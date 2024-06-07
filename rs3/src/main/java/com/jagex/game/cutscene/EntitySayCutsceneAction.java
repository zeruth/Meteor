package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;


public class EntitySayCutsceneAction extends CutsceneAction {

    public int field10284;

    public final String field10286;

    public final int field10285;

    public final int field10283;

	public EntitySayCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10284 = arg0.g2();
		this.field10286 = arg0.gjstr();
		this.field10285 = arg0.g4s();
		this.field10283 = arg0.g2();
	}

    public void method2890() {
		CutsceneManager.entities[this.field10284].getEntity().setChatLine(this.field10286, this.field10285, 0, this.field10283);
	}
}
