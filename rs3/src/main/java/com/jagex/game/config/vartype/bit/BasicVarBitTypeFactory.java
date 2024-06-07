package com.jagex.game.config.vartype.bit;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;


import java.util.Map;

public class BasicVarBitTypeFactory extends VarBitTypeFactory {

	public BasicVarBitTypeFactory(Map arg0) {
		super(arg0);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new VarBitType(id, this);
	}

    public Class type() {
		return VarBitType.class;
	}
}
