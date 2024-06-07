package com.jagex.game.config;

import deob.ObfuscatedName;

public interface ConfigTypeFactory {

    Class type();

    ConfigType create(int id, ConfigTypeList configTypeList);
}
