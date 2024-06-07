package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;


public class LocDelCutsceneAction extends CutsceneAction {

    public final int field10320;

	public LocDelCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10320 = arg0.g2();
	}

    public void method2890() {
		CutsceneManager.field7317[this.field10320].method2848();
	}
}
