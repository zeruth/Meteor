package com.jagex.game.config.meltype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;


public abstract class MapElementTypeFactory implements ConfigTypeFactory {

    public final Js5 configClient;

    public SoftLruHashTable elementCache;

	public MapElementTypeFactory(Js5 configClient, int size) {
		this.configClient = configClient;
		this.elementCache = new SoftLruHashTable(size);
	}
}
