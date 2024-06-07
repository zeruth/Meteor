package com.jagex.game.config.msitype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;


public abstract class MSITypeFactory implements ConfigTypeFactory {

    public final Js5 field9157;

    public SoftLruHashTable field9156;

	public MSITypeFactory(Js5 arg0, int arg1) {
		this.field9157 = arg0;
		this.field9156 = new SoftLruHashTable(arg1);
	}

    public void method15072(int arg0) {
		this.field9156 = new SoftLruHashTable(arg0);
	}

    public void cacheReset() {
		SoftLruHashTable var1 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.reset();
		}
	}

    public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.clean(arg0);
		}
	}

    public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.clear();
		}
	}
}
