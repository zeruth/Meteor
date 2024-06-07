package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;


public class PreferencesBloom extends Preference {

	public PreferencesBloom(ClientOptions options) {
		super(options);
	}

	public PreferencesBloom(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.displayMode.method18546() && !Toolkit.method723(this.options.displayMode.getValue())) {
			this.currentValue = 0;
		}
		if (this.options.hardwareInfo().unused()) {
			if (this.currentValue < 0 || this.currentValue > 3) {
				this.currentValue = this.defaultValue();
			}
		} else if (this.currentValue < 0 || this.currentValue > 1) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 0;
	}

    public boolean canMod() {
		return Toolkit.method723(this.options.displayMode.getValue());
	}

    public int canSetValue(int value) {
		return Toolkit.method723(this.options.displayMode.getValue()) ? 1 : 3;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
