package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;


public class FinishCutsceneAction extends CutsceneAction {

	public FinishCutsceneAction(Packet arg0) {
		super(arg0);
	}

    public void method2890() {
		CutsceneManager.finish(true);
	}
}
