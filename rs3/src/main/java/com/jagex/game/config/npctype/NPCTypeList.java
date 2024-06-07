package com.jagex.game.config.npctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public class NPCTypeList extends CachingConfigTypeList {

	public NPCTypeList(ModeGame modeGame, Language language, boolean allowMembers, Js5 js5, Js5 factoryJs5) {
		super(modeGame, language, js5, Js5ConfigGroup.NPCTYPE, 64, new BasicNPCTypeFactory(allowMembers, factoryJs5, language, modeGame));
	}

    public void setAllowMembers(boolean arg0) {
		((NPCTypeFactory) this.factory).setAllowMembers(arg0);
		super.cacheReset();
	}

    public void resetModelCache(int arg0) {
		((NPCTypeFactory) this.factory).resetModelCache(arg0);
	}

    public void cacheReset() {
		super.cacheReset();
		((NPCTypeFactory) this.factory).cacheReset();
	}

    public void cacheClean(int num) {
		super.cacheClean(num);
		((NPCTypeFactory) this.factory).cacheClean(num);
	}

    public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((NPCTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
