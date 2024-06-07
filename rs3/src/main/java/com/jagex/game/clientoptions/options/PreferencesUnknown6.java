package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnknown6 extends Preference {

	public PreferencesUnknown6(ClientOptions options) {
		super(options);
	}

	public PreferencesUnknown6(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 5 || this.currentValue == 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 0;
	}

    public int canSetValue(int value) {
		return 1;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
