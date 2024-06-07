package com.jagex.game.config.meltype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;


public class BasicMapElementTypeFactory extends MapElementTypeFactory {

	public BasicMapElementTypeFactory(Js5 arg0, int arg1) {
		super(arg0, arg1);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new MapElementType(id, configTypeList, this);
	}

    public Class type() {
		return MapElementType.class;
	}
}
