package com.jagex.game.config.questtype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import deob.ObfuscatedName;

public class QuestTypeFactory implements ConfigTypeFactory {

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new QuestType(id, configTypeList);
	}

    public Class type() {
		return QuestType.class;
	}
}
