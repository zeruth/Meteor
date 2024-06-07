package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesFlickeringEffects extends Preference {

	public PreferencesFlickeringEffects(ClientOptions options) {
		super(options);
	}

	public PreferencesFlickeringEffects(int value, ClientOptions options) {
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
