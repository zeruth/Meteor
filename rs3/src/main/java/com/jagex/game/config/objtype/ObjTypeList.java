package com.jagex.game.config.objtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.defaults.GraphicsDefaults;
import com.jagex.game.world.entity.PlayerModel;
import com.jagex.graphics.Font;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.js5.Js5;


public class ObjTypeList extends CachingConfigTypeList {

	public ObjTypeList(ModeGame modeGame, Language language, boolean allowMembers, ConfigTypeList configTypeList, Js5 js5, Js5 factoryJs5) {
		super(modeGame, language, js5, Js5ConfigGroup.OBJTYPE, 64, new BasicObjTypeFactory(modeGame, language, allowMembers, factoryJs5, configTypeList));
	}

    public Sprite method18900(Toolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PlayerModel arg6) {
		return ((ObjTypeFactory) this.factory).method14616(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

    public Sprite method18905(Toolkit arg0, Toolkit arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, Font arg9, PlayerModel arg10, GraphicsDefaults arg11) {
		return ((ObjTypeFactory) this.factory).method14617(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, this);
	}

    public void setAllowMembers(boolean arg0) {
		((ObjTypeFactory) this.factory).setAllowMembers(arg0);
		super.cacheReset();
	}

    public void resetModelCache(int arg0) {
		((ObjTypeFactory) this.factory).resetModelCache(arg0);
	}

    public void cacheReset() {
		super.cacheReset();
		((ObjTypeFactory) this.factory).cacheReset();
	}

    public void resetIconCache() {
		((ObjTypeFactory) this.factory).resetIconCache();
	}

    public void cacheClean(int num) {
		super.cacheClean(num);
		((ObjTypeFactory) this.factory).cacheClean(num);
	}

    public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((ObjTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
