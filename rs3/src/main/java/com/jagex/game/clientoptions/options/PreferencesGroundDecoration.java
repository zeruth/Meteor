package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesGroundDecoration extends Preference {

	public PreferencesGroundDecoration(ClientOptions options) {
		super(options);
	}

	public PreferencesGroundDecoration(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.modeGame() != ModeGame.RUNESCAPE) {
			this.currentValue = 1;
		}
		if (this.currentValue != 0 && this.currentValue != 1) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return 1;
	}

    public boolean canMod() {
		return this.options.modeGame() == ModeGame.RUNESCAPE;
	}

    public int canSetValue(int value) {
		return this.options.modeGame() == ModeGame.RUNESCAPE ? 1 : 3;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
