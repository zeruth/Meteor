package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesRemoveRoofs extends Preference {

	public PreferencesRemoveRoofs(ClientOptions options) {
		super(options);
	}

	public PreferencesRemoveRoofs(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.orthographic.getValue() == 2 && this.currentValue == 2) {
			this.currentValue = 1;
		}
		if (this.currentValue < 0 || this.currentValue > 3) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 2;
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
