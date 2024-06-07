package com.jagex.game.clientoptions.options;

import com.jagex.core.constants.ModeGame;
import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public class PreferencesGroundBlending extends Preference {

	public PreferencesGroundBlending(ClientOptions options) {
		super(options);
	}

	public PreferencesGroundBlending(int value, ClientOptions options) {
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
		if (this.options.modeGame() != ModeGame.RUNESCAPE) {
			return 3;
		}
		if (value == 0) {
			if (this.options.fog.getValue() == 1) {
				return 2;
			}
			if (this.options.textures.getValue() == 1) {
				return 2;
			}
			if (this.options.waterDetail.getValue() > 0) {
				return 2;
			}
		}
		return 1;
	}

    public void setValue(int value) {
		this.currentValue = value;
	}

    public int getValue() {
		return this.currentValue;
	}
}
