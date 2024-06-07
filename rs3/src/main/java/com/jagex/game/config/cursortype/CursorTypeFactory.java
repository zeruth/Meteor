package com.jagex.game.config.cursortype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public abstract class CursorTypeFactory {

    public Js5 js5;

    public final SoftLruHashTable cursorCache = new SoftLruHashTable(2);

	public CursorTypeFactory(Js5 js5) {
		this.js5 = js5;
	}

    public void cacheReset() {
		SoftLruHashTable var1 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.reset();
		}
	}

    public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.clean(arg0);
		}
	}

    public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.clear();
		}
	}
}
