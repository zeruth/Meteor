package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;


public class EntityRouteCutsceneAction extends CutsceneAction {

    public final int field10330;

    public final int field10331;

    public final int field10332;

	public EntityRouteCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10330 = arg0.g2();
		this.field10331 = arg0.g2();
		this.field10332 = arg0.g1();
	}

    public void method2890() {
		CutsceneEntity var1 = CutsceneManager.entities[this.field10330];
		CutsceneRoute var2 = CutsceneManager.field8358[this.field10331];
		var2.method2906(var1, this.field10332);
	}
}
