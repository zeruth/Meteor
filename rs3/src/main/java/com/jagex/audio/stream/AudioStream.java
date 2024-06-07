package com.jagex.audio.stream;

import com.jagex.audio.api.SoundBackend;
import com.jagex.audio.backend.AudioMixerRelated;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public class AudioStream implements AudioProcessingInterface {

    public SoundBackend field7628;

    public AudioStreamRelated field7629 = AudioStreamRelated.field7627;

    public int field7631;

    public Js5 field7630;

    public AudioMixerRelated field7632;

	public AudioStream(Js5 arg0, int arg1, SoundBackend arg2, AudioMixerRelated arg3) {
		this.field7630 = arg0;
		this.field7631 = arg1;
		this.field7628 = arg2;
		this.field7632 = arg3;
		this.field7629 = AudioStreamRelated.field7625;
	}

    public void method9672() {
		if (AudioStreamRelated.field7625 != this.field7629) {
			return;
		}
		this.method9737();
		this.field7629 = AudioStreamRelated.field7626;
		if (this.field7632 != null) {
			this.field7632.method3130(this, 0, this.field7631, true);
		}
	}

    public Sound method9710() {
		Sound var1 = new Sound(this.field7628);
		var1.method7376(this);
		return var1;
	}

    public AudioStreamRelated method9674() {
		return this.field7629;
	}

    public boolean method9675() {
		return true;
	}

    public void method9737() {
	}

    public int method9678() {
		return 0;
	}

    public SoundRelatedType2 method9679() {
		return SoundRelatedType2.field4851;
	}

    public int method9680() {
		return this.field7631;
	}

    public byte[] method9673(int arg0) {
		int var2 = arg0;
		if (arg0 == 0) {
			var2 = this.field7631;
		}
		return this.field7630.fetchFile(var2);
	}

    public void method9681(Packet arg0) {
	}

    public Packet method9686(int arg0) {
		return null;
	}

    public boolean method9683(int arg0) {
		return false;
	}

    public boolean method9702() {
		return false;
	}

    public int method9685() {
		return 0;
	}

    public void method9671(boolean arg0) {
	}

    public boolean method9687() {
		return false;
	}
}
