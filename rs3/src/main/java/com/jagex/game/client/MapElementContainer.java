package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import com.jagex.game.world.WorldMapElement;


public class MapElementContainer extends Node {

    public int field11251 = Integer.MAX_VALUE;

    public int field11249 = Integer.MIN_VALUE;

    public int field11246 = Integer.MAX_VALUE;

    public int field11248 = Integer.MIN_VALUE;

    public int field11244 = Integer.MAX_VALUE;

    public int field11247 = Integer.MIN_VALUE;

    public int field11250 = Integer.MAX_VALUE;

    public int field11245 = Integer.MIN_VALUE;

    public WorldMapElement field11252;

	public MapElementContainer(WorldMapElement arg0) {
		this.field11252 = arg0;
	}

    public boolean method17518(int arg0, int arg1) {
		if (arg0 >= this.field11251 && arg0 <= this.field11249 && arg1 >= this.field11246 && arg1 <= this.field11248) {
			return true;
		} else {
			return arg0 >= this.field11244 && arg0 <= this.field11247 && arg1 >= this.field11250 && arg1 <= this.field11245;
		}
	}
}
