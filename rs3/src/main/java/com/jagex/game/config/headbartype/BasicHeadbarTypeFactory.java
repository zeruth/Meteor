package com.jagex.game.config.headbartype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;


public class BasicHeadbarTypeFactory extends HeadbarTypeFactory implements ConfigTypeFactory {

	public BasicHeadbarTypeFactory(Js5 configClient) {
		super(configClient);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new HeadbarType(id, this);
	}

    public Class type() {
		return HeadbarType.class;
	}
}
