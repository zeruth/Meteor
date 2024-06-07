package com.jagex.game.config;



public interface ConfigTypeList extends Iterable {

    ConfigType list(int id);

    int length();
}
