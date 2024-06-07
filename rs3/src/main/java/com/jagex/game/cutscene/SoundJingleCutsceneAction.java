package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;

import rs2.client.Client;

public class SoundJingleCutsceneAction extends CutsceneAction {

    public final int field10321;

    public final int field10322;

	public SoundJingleCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10321 = arg0.g2();
		this.field10322 = arg0.g1();
	}

    public void method2890() {
		Client.audioApi.playJingle(this.field10321, this.field10322);
	}
}
