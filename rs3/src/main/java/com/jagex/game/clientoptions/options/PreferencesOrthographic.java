package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesOrthographic extends Preference {

	public PreferencesOrthographic(int value, ClientOptions options) {
		super(value, options);
	}

	public PreferencesOrthographic(ClientOptions options) {
		super(options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 0;
	}

    public boolean canMod() {
		return true;
	}

    public int canSetValue(int value) {
		return value == 2 ? 2 : 1;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
