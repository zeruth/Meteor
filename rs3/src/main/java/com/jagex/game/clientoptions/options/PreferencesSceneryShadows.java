package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesSceneryShadows extends Preference {

	public PreferencesSceneryShadows(ClientOptions options) {
		super(options);
	}

	public PreferencesSceneryShadows(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.textures.getValue() == 0) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 2;
	}

    public boolean canMod() {
		return this.options.textures.getValue() != 0;
	}

    public int canSetValue(int value) {
		return this.options.textures.getValue() == 0 ? 3 : 1;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
