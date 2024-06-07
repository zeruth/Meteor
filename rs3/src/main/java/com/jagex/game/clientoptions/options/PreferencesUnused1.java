package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnused1 extends Preference {

	public PreferencesUnused1(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused1(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 1) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 1;
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
