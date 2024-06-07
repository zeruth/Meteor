package com.jagex.game.config.hitmarktype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public abstract class HitmarkTypeFactory {

    public final Js5 configClient;

    public final SoftLruHashTable spriteCache = new SoftLruHashTable(20);

	public HitmarkTypeFactory(Js5 configClient) {
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
