package com.jagex.game.config;

import com.jagex.game.client.MutableConfig;
import deob.ObfuscatedName;

public class BasicTypeFactory implements ConfigTypeFactory {

    public final Class type;

	public BasicTypeFactory(Class type) {
		this.type = type;
	}

    public ConfigType create(int id, ConfigTypeList configTypeList) {
		try {
			ConfigType var3 = (ConfigType) this.type.getDeclaredConstructor().newInstance();
			((MutableConfig) var3).setId(id);
			return var3;
		} catch (Exception var5) {
			var5.printStackTrace();
			return null;
		}
	}

    public Class type() {
		return this.type;
	}
}
