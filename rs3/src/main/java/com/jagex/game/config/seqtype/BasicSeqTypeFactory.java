package com.jagex.game.config.seqtype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;


public class BasicSeqTypeFactory extends SeqTypeFactory {

	public BasicSeqTypeFactory(ConfigTypeList arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new SeqType(id, this);
	}

    public Class type() {
		return SeqType.class;
	}
}
