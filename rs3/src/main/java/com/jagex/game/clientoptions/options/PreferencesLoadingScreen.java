package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesLoadingScreen extends Preference {

	public PreferencesLoadingScreen(ClientOptions options) {
		super(options);
	}

	public PreferencesLoadingScreen(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
	}

    public int defaultValue() {
		return 0;
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
