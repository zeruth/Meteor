package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnused11 extends Preference {

	public PreferencesUnused11(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused11(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 33 || this.currentValue > 200) {
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
