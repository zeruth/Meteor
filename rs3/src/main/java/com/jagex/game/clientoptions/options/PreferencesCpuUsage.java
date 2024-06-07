package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesCpuUsage extends Preference {

	public PreferencesCpuUsage(ClientOptions options) {
		super(options);
	}

	public PreferencesCpuUsage(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.currentValue < 0 || this.currentValue > 4) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return this.options.hardwareInfo().cpucount() > 1 ? 4 : 2;
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
