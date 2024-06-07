package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesFog extends Preference {

	public PreferencesFog(ClientOptions options) {
		super(options);
	}

	public PreferencesFog(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue != 0 && this.options.groundBlending.getValue() != 1) {
			this.currentValue = 0;
		}
		if (this.currentValue != 0 && this.options.orthographic.getValue() == 2) {
			this.currentValue = 0;
		}
		if (this.currentValue < 0 || this.currentValue > 1) {
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
		if (value != 0 && this.options.orthographic.getValue() == 2) {
			return 3;
		} else if (value == 0 || this.options.groundBlending.getValue() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
