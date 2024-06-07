package com.jagex.core.datastruct;

import deob.ObfuscatedName;

public class HardReferenceNode extends ReferenceNode {

    public Object value;

	public HardReferenceNode(Object arg0, int arg1) {
		super(arg1);
		this.value = arg0;
	}

    public Object getValue() {
		return this.value;
	}

    public boolean isSoft() {
		return false;
	}
}
