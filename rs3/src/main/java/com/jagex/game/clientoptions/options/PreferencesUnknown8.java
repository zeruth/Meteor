package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnknown8 extends Preference {

	public PreferencesUnknown8(ClientOptions options) {
		super(options);
	}

	public PreferencesUnknown8(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 1;
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
