package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ana")
public class PreferencesUnused7 extends Preference {

	public PreferencesUnused7(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused7(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ana.o(I)V")
	public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ana.e(B)I")
	public int defaultValue() {
		return 0;
	}

	@ObfuscatedName("ana.n(II)I")
	public int canSetValue(int value) {
		return 3;
	}

	@ObfuscatedName("ana.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ana.s(S)I")
	public int getValue() {
		return this.currentValue;
	}
}
