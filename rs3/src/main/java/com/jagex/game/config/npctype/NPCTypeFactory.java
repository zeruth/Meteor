package com.jagex.game.config.npctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.client.LocalisedText;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;

import static rs2.client.Client.language;


public abstract class NPCTypeFactory implements ConfigTypeFactory {

    public final ModeGame modeGame;

    public boolean allowMembers;

    public final Js5 configClient;

    public final SoftLruHashTable modelCache = new SoftLruHashTable(50);

    public final SoftLruHashTable headModelCache = new SoftLruHashTable(5);

    public int field2773;

    public final String[] defaultops;

	public NPCTypeFactory(boolean allowMembers, Js5 configClient, Language language, ModeGame modeGame) {
		this.allowMembers = allowMembers;
		this.configClient = configClient;
		this.modeGame = modeGame;
		this.defaultops = initDefaultOps(modeGame);
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
		this.field2773 = arg0;
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		SoftLruHashTable var4 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.reset();
		}
	}

    public void cacheReset() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		SoftLruHashTable var3 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.reset();
		}
	}

    public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clean(arg0);
		}
		SoftLruHashTable var4 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.clean(arg0);
		}
	}

    public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clear();
		}
		SoftLruHashTable var3 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.clear();
		}
	}
}
