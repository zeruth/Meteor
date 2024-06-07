package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.graphics.AmbientOcclusionValue;
import deob.ObfuscatedName;

public class PreferencesUnused4 extends Preference {

	public PreferencesUnused4(ClientOptions options) {
		super(options);
	}

	public PreferencesUnused4(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < AmbientOcclusionValue.field2680.getId() || this.currentValue > AmbientOcclusionValue.field2679.getId()) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return AmbientOcclusionValue.field2680.getId();
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
