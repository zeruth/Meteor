package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.BuildAreaSize;
import com.jagex.game.clientoptions.ClientOptions;


public class PreferencesBuildArea extends Preference {

	public PreferencesBuildArea(ClientOptions options) {
		super(options);
	}

	public PreferencesBuildArea(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.hardwareInfo().unused()) {
			this.currentValue = BuildAreaSize.SIZE_256.id;
			return;
		}
		int var1 = this.options.hardwareInfo().maxmemory();
		if (var1 < 245) {
			this.currentValue = BuildAreaSize.STANDARD.id;
		}
		if (BuildAreaSize.SIZE_168.id == this.currentValue && var1 < 500) {
			this.currentValue = BuildAreaSize.SIZE_136.id;
		}
		if (this.currentValue < BuildAreaSize.STANDARD.id || this.currentValue > BuildAreaSize.CONSTRUCTION.id) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return this.options.hardwareInfo().unused() ? BuildAreaSize.SIZE_256.id : BuildAreaSize.STANDARD.id;
	}

    public boolean canMod() {
		if (this.options.hardwareInfo().unused()) {
			return false;
		} else {
			int var1 = this.options.hardwareInfo().maxmemory();
			return var1 >= 245;
		}
	}

    public int canSetValue(int value) {
		if (this.options.hardwareInfo().unused()) {
			return 3;
		}
		int maxmemory = this.options.hardwareInfo().maxmemory();
		if (maxmemory < 245) {
			return 3;
		} else if (BuildAreaSize.SIZE_168.id == value && maxmemory < 500) {
			return 3;
		} else {
			return 1;
		}
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
