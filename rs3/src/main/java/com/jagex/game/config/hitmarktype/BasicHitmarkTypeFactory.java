package com.jagex.game.config.hitmarktype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;


public class BasicHitmarkTypeFactory extends HitmarkTypeFactory implements ConfigTypeFactory {

	public BasicHitmarkTypeFactory(Js5 js5) {
		super(js5);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new HitmarkType(id, this, configTypeList);
	}

    public Class type() {
		return HitmarkType.class;
	}
}
