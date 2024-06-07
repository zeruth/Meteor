package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesWaterDetail extends Preference {

	public PreferencesWaterDetail(ClientOptions options) {
		super(options);
	}

	public PreferencesWaterDetail(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 1;
	}

    public boolean canMod() {
		return true;
	}

    public int canSetValue(int value) {
		return value == 0 || this.options.groundBlending.getValue() == 1 ? 1 : 2;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
