package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

public class ObjectNode extends Node {

    public final Object value;

	public ObjectNode(Object value) {
		this.value = value;
	}
}
