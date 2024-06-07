package com.jagex.game.config.cursortype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

public class BasicCursorTypeFactory extends CursorTypeFactory implements ConfigTypeFactory {

	public BasicCursorTypeFactory(Js5 js5) {
		super(js5);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new CursorType(id, this);
	}

    public Class type() {
		return CursorType.class;
	}
}
