package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesUnused9 extends Preference {

	public PreferencesUnused9(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused9(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		this.currentValue = Math.min(Math.max(this.currentValue, 5), 300);
	}

    public int defaultValue() {
		return 70;
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
