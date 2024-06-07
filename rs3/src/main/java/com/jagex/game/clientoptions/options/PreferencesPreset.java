package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesPreset extends Preference {

	public PreferencesPreset(ClientOptions options) {
		super(options);
	}

	public PreferencesPreset(int value, ClientOptions options) {
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
		return 1;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
