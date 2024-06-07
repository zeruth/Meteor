package com.jagex.game.config.effectanimtype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;


public abstract class EffectAnimTypeFactory implements ConfigTypeFactory {

    public final Js5 configClient;

    public final SoftLruHashTable modelCache = new SoftLruHashTable(60);

    public int field8264;

	public EffectAnimTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

    public void resetModelCache(int arg0) {
		this.field8264 = arg0;
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
	}

    public void cacheReset() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
	}

    public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clean(arg0);
		}
	}

    public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clear();
		}
	}
}
