package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.Toolkit;
import deob.ObfuscatedName;

public class PreferencesScreenSize extends Preference {

	public PreferencesScreenSize(ClientOptions options) {
		super(options);
	}

	public PreferencesScreenSize(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return this.options.displayMode.method18546() && Toolkit.method551(this.options.displayMode.getValue()) ? 1 : 0;
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
