package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnused8 extends Preference {

	public PreferencesUnused8(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused8(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
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
