package com.jagex.game.config;

import deob.ObfuscatedName;

public interface ConfigTypeList extends Iterable {

    ConfigType list(int id);

    int length();
}
