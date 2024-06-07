package com.jagex.game.client;

import com.jagex.core.io.PacketBit;
import deob.ObfuscatedName;

public class RebuildRequest {

    public RebuildType rebuildType;

    public PacketBit buf;

	public RebuildRequest(RebuildType rebuildType, PacketBit buf) {
		this.rebuildType = rebuildType;
		this.buf = buf;
	}
}
