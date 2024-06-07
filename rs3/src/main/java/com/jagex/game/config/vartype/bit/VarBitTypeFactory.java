package com.jagex.game.config.vartype.bit;

import com.jagex.game.config.ConfigTypeFactory;
import deob.ObfuscatedName;

import java.util.Map;

public abstract class VarBitTypeFactory implements ConfigTypeFactory {

    public final Map listContainer;

	public VarBitTypeFactory(Map arg0) {
		this.listContainer = arg0;
	}
}
