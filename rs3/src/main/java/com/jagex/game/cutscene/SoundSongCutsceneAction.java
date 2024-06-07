package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

public class SoundSongCutsceneAction extends CutsceneAction {

    public final int field10318;

    public final int field10319;

	public SoundSongCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10318 = arg0.g2();
		this.field10319 = arg0.g1();
	}

    public void method2890() {
		Client.audioApi.playSong(this.field10318);
	}

    public boolean method2891() {
		Client.audioApi.preloadSong(this.field10318, this.field10319);
		return true;
	}
}
