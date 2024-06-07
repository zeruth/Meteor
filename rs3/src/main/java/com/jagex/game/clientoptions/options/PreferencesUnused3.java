package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesUnused3 extends Preference {

	public PreferencesUnused3(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused3(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 0;
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
