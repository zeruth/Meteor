package com.jagex.core.datastruct;

import com.jagex.core.utils.MonotonicTime;
import deob.ObfuscatedName;

public class TimestampMessage extends Link {

    public int timestamp = (int) (MonotonicTime.get() / 1000L);

    public String message;

    public short worldId;

	public TimestampMessage(String message, int worldId) {
		this.message = message;
		this.worldId = (short) worldId;
	}
}
