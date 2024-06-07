package com.jagex.audio.api;

import com.jagex.audio.stream.BussManager;
import com.jagex.core.utils.MonotonicTime;


public class AudioBuss {

    public float volume;

    public AudioBuss parent;

    public VolumeProvider volumeProvider;

    public float priority;

    public float volumeEaseVolume2;

    public float volumeEaseVolume1;

    public long volumeEaseTime1;

    public long volumeEaseTime2;

	public AudioBuss(int arg0, float priority, Object arg2, BussManager arg3, VolumeProvider volumeProvider, AudioBuss parent) {
		this.parent = parent;
		this.volumeProvider = volumeProvider;
		this.volume = 1.0F;
		this.priority = priority;
		this.volumeEaseVolume1 = -1.0F;
		this.volumeEaseVolume2 = -1.0F;
		this.volumeEaseTime1 = -1L;
		this.volumeEaseTime2 = -1L;
	}

    public float getSelfPriority() {
		return this.priority;
	}

    public float getPriority() {
		float var1 = 1.0F;
		for (AudioBuss var2 = this; var2 != null; var2 = var2.getParent()) {
			var1 *= var2.getSelfPriority();
		}
		return var1;
	}

    public void update() {
		if (this.volumeProvider != null) {
			float var1 = this.volumeProvider.getVolume();
			if (this.volume != var1 && this.volumeEaseVolume2 < 0.0F) {
				this.volumeEaseVolume1 = this.volume;
				this.volumeEaseVolume2 = var1;
				this.volumeEaseTime1 = MonotonicTime.get();
				this.volumeEaseTime2 = this.volumeEaseTime1 + 100L;
			}
		}
		if (this.volumeEaseVolume2 >= 0.0F) {
			long var2 = MonotonicTime.get();
			if (var2 > this.volumeEaseTime2) {
				this.volume = this.volumeEaseVolume2;
				this.volumeEaseVolume2 = -1.0F;
			} else {
				float var4 = this.volumeEaseVolume2 - this.volumeEaseVolume1;
				long var5 = this.volumeEaseTime2 - this.volumeEaseTime1;
				float var7 = var4 / (float) var5;
				this.volume = (float) (var2 - this.volumeEaseTime1) * var7 + this.volumeEaseVolume1;
				if (this.volume == this.volumeEaseVolume2) {
					this.volumeEaseVolume2 = -1.0F;
				}
			}
		}
		this.volume = Math.min(1.0F, Math.max(this.volume, 0.0F));
	}

    public float getVolume() {
		float var1 = this.volume;
		for (AudioBuss var2 = this.parent; var2 != null; var2 = var2.getParent()) {
			var1 *= var2.getSelfVolume();
		}
		return Math.min(Math.max(var1, 0.0F), 1.0F);
	}

    public float getSelfVolume() {
		return this.volume;
	}

    public void method5897(float arg0) {
		if (this.volumeProvider == null) {
			this.volumeEaseVolume2 = arg0;
			this.volumeEaseVolume1 = this.volume;
			this.volumeEaseTime1 = MonotonicTime.get();
			this.volumeEaseTime2 = this.volumeEaseTime1 + 100L;
		}
	}

    public AudioBuss getParent() {
		return this.parent;
	}
}
