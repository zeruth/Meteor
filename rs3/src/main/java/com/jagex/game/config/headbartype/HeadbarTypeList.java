package com.jagex.game.config.headbartype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public class HeadbarTypeList extends CachingConfigTypeList {

	public HeadbarTypeList(ModeGame modeGame, Language language, Js5 configClient, Js5 spritesClient) {
		super(modeGame, language, configClient, Js5ConfigGroup.HEADBARTYPE, 64, new BasicHeadbarTypeFactory(spritesClient));
	}

    public void cacheReset() {
		super.cacheReset();
		((HeadbarTypeFactory) this.factory).cacheReset();
	}

    public void cacheClean(int num) {
		super.cacheClean(num);
		((HeadbarTypeFactory) this.factory).cacheClean(num);
	}

    public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((HeadbarTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
