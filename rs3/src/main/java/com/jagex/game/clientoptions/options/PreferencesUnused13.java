package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnused13 extends Preference {

	public PreferencesUnused13(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused13(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < -3) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return -2;
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
