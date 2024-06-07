package com.jagex.game.config.effectanimtype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;


public class BasicEffectAnimTypeFactory extends EffectAnimTypeFactory {

	public BasicEffectAnimTypeFactory(Js5 js5) {
		super(js5);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new EffectAnimType(id, this);
	}

    public Class type() {
		return EffectAnimType.class;
	}
}
