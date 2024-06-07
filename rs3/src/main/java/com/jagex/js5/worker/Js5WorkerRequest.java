package com.jagex.js5.worker;

import com.jagex.game.client.DiskStore;
import com.jagex.js5.Js5Request;
import deob.ObfuscatedName;

public class Js5WorkerRequest extends Js5Request {

    public int type;

    public DiskStore diskStore;

    public byte[] bytes;

    public byte[] getBytes() {
		if (this.incomplete) {
			throw new RuntimeException("Not ready!");
		}

		return this.bytes;
	}

    public int getPercentageComplete() {
		return this.incomplete ? 0 : 100;
	}
}
