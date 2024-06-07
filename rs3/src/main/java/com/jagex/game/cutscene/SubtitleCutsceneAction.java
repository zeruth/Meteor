package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.clientscript.ScriptRunner;

public class SubtitleCutsceneAction extends CutsceneAction {

    public final String field10276;

    public final int field10277;

	public SubtitleCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10276 = arg0.gjstr();
		this.field10277 = arg0.g2();
	}

    public void method2890() {
		if (Client.cutsceneId != -1) {
			ScriptRunner.executeTriggeredScriptCutscene(Client.cutsceneId, this.field10276, this.field10277);
		}
	}
}
