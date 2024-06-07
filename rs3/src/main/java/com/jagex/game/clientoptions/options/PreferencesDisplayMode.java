package com.jagex.game.clientoptions.options;

import com.jagex.game.client.NativeLibraries;
import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesDisplayMode extends Preference {

    public boolean field11772 = true;

    public boolean defaulted = false;

	public PreferencesDisplayMode(ClientOptions options) {
		super(options);
	}

	public PreferencesDisplayMode(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 5 || this.currentValue == 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		this.defaulted = true;
		return this.options.hardwareInfo().osArchWindows() ? 3 : 1;
	}

    public boolean canMod() {
		return true;
	}

    public int canSetValue(int value) {
		return value == 3 && !NativeLibraries.getLoader().method7900("jagdx") ? 3 : 2;
	}

    public void setValue(int value) {
		this.defaulted = false;
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}

    public boolean method18546() {
		return this.field11772;
	}

    public void method18544(boolean arg0) {
		this.field11772 = arg0;
	}
}
