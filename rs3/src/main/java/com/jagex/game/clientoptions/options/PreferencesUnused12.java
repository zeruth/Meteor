package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesUnused12 extends Preference {

	public PreferencesUnused12(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused12(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 33 || this.currentValue > 400) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 100;
	}

    public int canSetValue(int value) {
		return 3;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
