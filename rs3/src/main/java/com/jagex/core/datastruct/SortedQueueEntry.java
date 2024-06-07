package com.jagex.core.datastruct;

import deob.ObfuscatedName;

public final class SortedQueueEntry {

    public final Object value;

    public int slot;

	public SortedQueueEntry(Object arg0, int arg1) {
		this.value = arg0;
		this.slot = arg1;
	}
}
