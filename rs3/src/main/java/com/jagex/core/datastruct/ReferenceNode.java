package com.jagex.core.datastruct;



public abstract class ReferenceNode extends SecondaryNode {

    public final int weight;

	public ReferenceNode(int arg0) {
		this.weight = arg0;
	}

    public abstract Object getValue();

    public abstract boolean isSoft();
}
