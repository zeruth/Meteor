package com.jagex.game.config;



public interface ConfigTypeFactory {

    Class type();

    ConfigType create(int id, ConfigTypeList configTypeList);
}
