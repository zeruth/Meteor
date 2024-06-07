package com.jagex.core.datastruct;



public abstract class CacheEntry extends SecondaryNode {

    public final int cacheWeight;

    public final CacheKey cacheKey;

	public CacheEntry(CacheKey arg0, int arg1) {
		this.cacheKey = arg0;
		this.cacheWeight = arg1;
	}

    public abstract Object getValue();

    public abstract boolean isSoft();
}
