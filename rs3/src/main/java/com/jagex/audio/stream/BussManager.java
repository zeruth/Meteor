package com.jagex.audio.stream;

import com.jagex.audio.api.AudioBuss;
import com.jagex.audio.api.SoundBackend;
import com.jagex.audio.api.VolumeProvider;
import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BussManager {

    public Map busses = new HashMap();

    public SoundBackend backend;

	public BussManager(SoundBackend arg0) {
		this.backend = arg0;
	}

    public void update() {
		Iterator busses = this.busses.values().iterator();
		while (busses.hasNext()) {
			AudioBuss buss = (AudioBuss) busses.next();
			buss.update();
		}
	}

    public AudioBuss addBuss(int id, int arg1, float arg2, VolumeProvider arg3) {
		if (this.getBuss(id) != null) {
			return null;
		}
		AudioBuss var5 = null;
		if (arg1 != -1) {
			var5 = this.getBuss(arg1);
		}
		Object var6 = this.backend.method5866(var5);
		AudioBuss var7 = new AudioBuss(id, arg2, var6, this, arg3, var5);
		this.busses.put(id, var7);
		return var7;
	}

    public AudioBuss getBuss(int id) {
		return (AudioBuss) this.busses.get(id);
	}
}
