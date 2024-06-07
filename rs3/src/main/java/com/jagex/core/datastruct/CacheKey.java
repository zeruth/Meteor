package com.jagex.core.datastruct;

import deob.ObfuscatedName;

public interface CacheKey {

    boolean equal(CacheKey arg0);

    long hash();
}
