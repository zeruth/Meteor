package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesVolume extends Preference {

	public PreferencesVolume(ClientOptions options) {
		super(options);
	}

	public PreferencesVolume(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 255) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 127;
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
