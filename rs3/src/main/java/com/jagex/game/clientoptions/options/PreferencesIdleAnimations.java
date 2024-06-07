package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesIdleAnimations extends Preference {

	public PreferencesIdleAnimations(ClientOptions options) {
		super(options);
	}

	public PreferencesIdleAnimations(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.modeGame() == ModeGame.STELLARDAWN) {
			this.currentValue = 2;
		}
		if (this.currentValue < 0 || this.currentValue > 2) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 1;
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
