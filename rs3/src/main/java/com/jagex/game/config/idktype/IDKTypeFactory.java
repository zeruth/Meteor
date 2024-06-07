package com.jagex.game.config.idktype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;


public class IDKTypeFactory implements ConfigTypeFactory {

    public final Js5 configClient;

	public IDKTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new IDKType(id, this.configClient);
	}

    public Class type() {
		return IDKType.class;
	}
}
