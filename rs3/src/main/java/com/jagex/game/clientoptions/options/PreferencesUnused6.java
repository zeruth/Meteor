package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesUnused6 extends Preference {

	public PreferencesUnused6(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused6(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (!this.options.hardwareInfo().unused()) {
			this.currentValue = this.defaultValue();
		} else if (this.currentValue < -1 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return this.options.hardwareInfo().unused() ? 0 : 1;
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
