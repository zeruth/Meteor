package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

public class TextCoordCutsceneAction extends CutsceneAction {

    public final int field10315;

    public final int field10313;

    public final String field10312;

    public final int field10314;

    public final int field10316;

	public TextCoordCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10315 = arg0.g2();
		this.field10313 = arg0.g2();
		this.field10312 = arg0.gjstr();
		this.field10314 = arg0.g4s();
		this.field10316 = arg0.g2();
	}

    public void method2890() {
		Client.method8476(Client.currentPlayerLevel, this.field10315, this.field10313, Client.getHeightmapY(this.field10315, this.field10313, Client.currentPlayerLevel), this.field10316, this.field10314, this.field10312);
	}
}
