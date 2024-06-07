package com.jagex.game.client;

import com.jagex.core.datastruct.CacheEntry;
import com.jagex.core.datastruct.CacheKey;


public class HardCacheEntry extends CacheEntry {

    public Object value;

	public HardCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.value = arg1;
	}

    public Object getValue() {
		return this.value;
	}

    public boolean isSoft() {
		return false;
	}
}
