package com.jagex.graphics;

import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.seqtype.SeqTypeList;
import deob.ObfuscatedName;

public class FrameSetLoader {

    public int field8515;

    public int field8516;

    public int field8517;

    public FrameSet field8520;

    public FrameSet field8519;

    public boolean field8518 = false;

    public final boolean method14431(SeqTypeList arg0, SeqType arg1, int arg2, int arg3, int[] arg4) {
		if (this.field8518) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.field8516 = arg4[arg2];
			this.field8520 = arg0.method18864(this.field8516 >> 16);
			this.field8516 &= 0xFFFF;
			if (this.field8520 == null) {
				return false;
			}
			if (arg1.field1772 && arg3 != -1 && arg3 < arg4.length) {
				this.field8517 = arg4[arg3];
				this.field8519 = arg0.method18864(this.field8517 >> 16);
				this.field8517 &= 0xFFFF;
			}
			if (arg1.field1786) {
				this.field8515 |= 0x200;
			}
			if (this.field8520.method19412(this.field8516)) {
				this.field8515 |= 0x80;
			}
			if (this.field8520.method19411(this.field8516)) {
				this.field8515 |= 0x100;
			}
			if (this.field8520.method19409(this.field8516)) {
				this.field8515 |= 0x400;
			}
			if (this.field8519 != null) {
				if (this.field8519.method19412(this.field8517)) {
					this.field8515 |= 0x80;
				}
				if (this.field8519.method19411(this.field8517)) {
					this.field8515 |= 0x100;
				}
				if (this.field8519.method19409(this.field8517)) {
					this.field8515 |= 0x400;
				}
			}
			this.field8515 |= 0x20;
			this.field8518 = true;
			return true;
		}
	}

    public final void method14432() {
		this.field8518 = false;
		this.field8515 = 0;
		this.field8519 = null;
		this.field8520 = null;
	}
}
