package com.jagex.core.datastruct;



import java.lang.ref.SoftReference;

public class SoftCacheEntry extends CacheEntry {

    public SoftReference value;

	public SoftCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.value = new SoftReference(arg1);
	}

    public Object getValue() {
		return this.value.get();
	}

    public boolean isSoft() {
		return true;
	}
}
