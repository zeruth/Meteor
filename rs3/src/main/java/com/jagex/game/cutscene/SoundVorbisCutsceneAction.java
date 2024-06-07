package com.jagex.game.cutscene;

import com.jagex.audio.stream.Sound;
import com.jagex.audio.stream.SoundShape;
import com.jagex.audio.stream.SoundType;
import com.jagex.audio.api.SubBussType;
import com.jagex.core.io.Packet;

import rs2.client.Client;

public class SoundVorbisCutsceneAction extends CutsceneAction {

    public final int field10323;

    public final int field10324;

    public final int field10325;

    public final int field10326;

    public Sound field10327;

	public SoundVorbisCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10323 = arg0.g2();
		this.field10324 = arg0.g1();
		this.field10325 = arg0.g1();
		this.field10326 = arg0.g1();
		this.field10327 = Client.audioApi.createSound(SoundType.field1828, this, this.field10323, this.field10326, this.field10324, SubBussType.SFX_SUB.getId(), SoundShape.field1835, 0.0F, 0.0F, null, 0, this.field10325, false);
		if (this.field10327 != null) {
			this.field10327.method7392();
		}
	}

    public void method2890() {
		if (this.field10327 != null) {
			this.field10327.method7441();
		}
	}

    public void method2896() {
		if (this.field10327 != null) {
			this.field10327.method7380(50);
			Client.audioApi.play(this.field10327);
			this.field10327 = null;
		}
	}
}
