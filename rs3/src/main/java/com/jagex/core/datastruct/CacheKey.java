package com.jagex.core.datastruct;



public interface CacheKey {

    boolean equal(CacheKey arg0);

    long hash();
}
