package com.jagex.core.datastruct;

import deob.ObfuscatedName;

public final class DualLinkQueue {

    public DualLink head = new DualLink();

    public DualLink peeked;

	public DualLinkQueue() {
		this.head.dualPrev = this.head;
		this.head.dualNext = this.head;
	}

    public void pushBack(DualLink node) {
		if (node.dualNext != null) {
			node.dualUnlink();
		}
		node.dualNext = this.head.dualNext;
		node.dualPrev = this.head;
		node.dualNext.dualPrev = node;
		node.dualPrev.dualNext = node;
	}

    public DualLink peekFront() {
		DualLink node = this.head.dualPrev;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.dualPrev;
			return node;
		}
	}

    public DualLink prev() {
		DualLink var1 = this.peeked;
		if (this.head == var1) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = var1.dualPrev;
			return var1;
		}
	}

    public void clear() {
		while (true) {
			DualLink node = this.head.dualPrev;
			if (this.head == node) {
				this.peeked = null;
				return;
			}
			node.dualUnlink();
		}
	}
}
