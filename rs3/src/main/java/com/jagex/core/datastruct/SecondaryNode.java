package com.jagex.core.datastruct;



public class SecondaryNode extends Node {

    public long secondaryNodeId;

    public SecondaryNode secondaryPrev;

    public SecondaryNode secondaryNext;

    public void secondaryRemove() {
		if (this.secondaryNext != null) {
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryPrev = null;
			this.secondaryNext = null;
		}
	}
}
