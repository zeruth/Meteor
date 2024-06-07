package com.jagex.game.config.loctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.Pair;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.client.LocalisedText;
import com.jagex.graphics.ModelUnlit;

import static rs2.client.Client.language;


public abstract class LocTypeFactory {

    public boolean allowMembers;

    public final SoftLruHashTable modelCacheStatic = new SoftLruHashTable(500);

    public final SoftLruHashTable modelCacheDynamic = new SoftLruHashTable(30);

    public final SoftLruHashTable field7532 = new SoftLruHashTable(50);

    public int field7536;

    public final String[] defaultops;

    public ModelUnlit[] field7535 = new ModelUnlit[4];

    public Pair field7529 = new Pair(null, null);

	public LocTypeFactory(boolean allowMembers, Language language, ModeGame modeGame) {
		this.allowMembers = allowMembers;
		defaultops = initDefaultOps(modeGame);
	}

	public String[] initDefaultOps(ModeGame modeGame) {
		if (ModeGame.RUNESCAPE == modeGame) {
			return new String[] { null, null, null, null, null, LocalisedText.EXAMINE.forLang(language) };
		} else {
			return new String[] { null, null, null, null, null, null };
		}
	}

    public void setAllowMembers(boolean arg0) {
		if (this.allowMembers != arg0) {
			this.allowMembers = arg0;
			this.cacheReset();
		}
	}

    public void resetModelCache(int arg0) {
		this.field7536 = arg0;
		SoftLruHashTable var2 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.reset();
		}
		SoftLruHashTable var4 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.reset();
		}
		SoftLruHashTable var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.reset();
		}
	}

    public void cacheReset() {
		SoftLruHashTable var1 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.reset();
		}
		SoftLruHashTable var3 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.reset();
		}
		SoftLruHashTable var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.reset();
		}
		this.field7535 = new ModelUnlit[4];
		this.field7529 = new Pair(null, null);
	}

    public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.clean(arg0);
		}
		SoftLruHashTable var4 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.clean(arg0);
		}
		SoftLruHashTable var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.clean(arg0);
		}
	}

    public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.clear();
		}
		SoftLruHashTable var3 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.clear();
		}
		SoftLruHashTable var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.clear();
		}
	}

    public abstract boolean method9525(int arg0);

    public abstract byte[] method9530(int arg0);
}
