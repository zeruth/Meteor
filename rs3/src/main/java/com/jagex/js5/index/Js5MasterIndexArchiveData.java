package com.jagex.js5.index;

import deob.ObfuscatedName;

public class Js5MasterIndexArchiveData {

    public final int crc;

    public final int groupCount;

    public final int version;

    public final byte[] whirlpool;

	public Js5MasterIndexArchiveData(int crc, int groupCount, int version, int arg3, byte[] whirlpool) {
		this.crc = crc;
		this.groupCount = groupCount;
		this.version = version;
		this.whirlpool = whirlpool;
	}
}
