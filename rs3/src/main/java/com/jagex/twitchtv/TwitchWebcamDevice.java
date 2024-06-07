package com.jagex.twitchtv;

import deob.ObfuscatedName;

import java.util.LinkedList;

public class TwitchWebcamDevice {

    public String field236;

    public String field237;

    public int field238;

    public int field239;

    public LinkedList field240 = new LinkedList();

	public TwitchWebcamDevice(int arg0, int arg1, String arg2, String arg3) {
		this.field238 = arg0;
		this.field239 = arg1;
		this.field236 = arg2;
		this.field237 = arg3;
	}

	public void AddCapability(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field240.add(new TwitchWebcamDeviceCapability(arg0, arg1, arg2, arg3, arg4));
	}

    public TwitchWebcamDeviceCapability method26(int arg0) {
		return arg0 >= 0 && arg0 < this.field240.size() ? (TwitchWebcamDeviceCapability) this.field240.get(arg0) : null;
	}

    public TwitchWebcamDeviceCapability method27(int arg0) {
		for (int var2 = 0; var2 < this.field240.size(); var2++) {
			if (((TwitchWebcamDeviceCapability) this.field240.get(var2)).field215 == arg0) {
				return (TwitchWebcamDeviceCapability) this.field240.get(var2);
			}
		}
		return null;
	}

    public int method28() {
		return this.field240.size();
	}
}
