package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

@ObfuscatedName("ams")
public class PreferencesLightingDetail extends Preference {

	public PreferencesLightingDetail(ClientOptions options) {
		super(options);
	}

	public PreferencesLightingDetail(int value, ClientOptions options) {
		super(value, options);
	}

	@ObfuscatedName("ams.o(S)V")
	public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

	@ObfuscatedName("ams.e(B)I")
	public int defaultValue() {
		return 1;
	}

	@ObfuscatedName("ams.n(II)I")
	public int canSetValue(int value) {
		return 1;
	}

	@ObfuscatedName("ams.k(II)V")
	public void setValue(int value) {
		this.currentValue = value;
	}

	@ObfuscatedName("ams.s(I)I")
	public int getValue() {
		return this.currentValue;
	}
}
