package com.jagex.game.config.meltype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;


public class MapElementTypeList extends CachingConfigTypeList {

	public MapElementTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.MELTYPE, 128, new BasicMapElementTypeFactory(arg3, 64));
	}

    public void cacheResize(int size, int elementCacheSize) {
		super.cacheResize(size);
		((MapElementTypeFactory) this.factory).elementCache = new SoftLruHashTable(elementCacheSize);
	}

    public void cacheReset() {
		super.cacheReset();
		((MapElementTypeFactory) this.factory).elementCache.reset();
	}

    public void cacheClean(int num) {
		super.cacheClean(num);
		((MapElementTypeFactory) this.factory).elementCache.clean(num);
	}

    public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((MapElementTypeFactory) this.factory).elementCache.clear();
	}
}
