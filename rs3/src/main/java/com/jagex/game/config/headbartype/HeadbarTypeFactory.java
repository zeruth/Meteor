package com.jagex.game.config.headbartype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.js5.Js5;


public abstract class HeadbarTypeFactory {

    public final Js5 configClient;

    public SoftLruHashTable spriteCache = new SoftLruHashTable(20);

	public HeadbarTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

    public void cacheReset() {
		SoftLruHashTable var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.reset();
		}
	}

    public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clean(arg0);
		}
	}

    public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clear();
		}
	}
}
