package com.jagex.core.datastruct;

import deob.ObfuscatedName;

public class DualLink extends Link {

    public DualLink dualPrev;

    public DualLink dualNext;

    public void dualUnlink() {
		if (this.dualNext != null) {
			this.dualNext.dualPrev = this.dualPrev;
			this.dualPrev.dualNext = this.dualNext;
			this.dualPrev = null;
			this.dualNext = null;
		}
	}
}
