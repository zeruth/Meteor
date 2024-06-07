package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

public class CamMoveCutsceneAction extends CutsceneAction {

    public final int field10264;

    public final int field10262;

    public final int field10263;

    public final int field10261;

    public final int field10265;

	public CamMoveCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10264 = arg0.g2();
		this.field10262 = arg0.g2();
		this.field10263 = arg0.g2();
		this.field10261 = arg0.g2();
		this.field10265 = arg0.g2();
	}

    public void method2890() {
		Client.cameraMoveTo(this.field10264, this.field10263, this.field10262, 100, 100, false);
		Client.cameraForceAngle(this.field10261, this.field10265, 0);
		Client.field10877 = true;
	}
}
