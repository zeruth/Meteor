package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesAnimDetail extends Preference {

	public PreferencesAnimDetail(ClientOptions options) {
		super(options);
	}

	public PreferencesAnimDetail(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue != 1 && this.currentValue != 0) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 1;
	}

    public boolean canMod() {
		return true;
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
