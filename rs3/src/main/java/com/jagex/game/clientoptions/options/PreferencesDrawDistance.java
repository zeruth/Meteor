package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import com.jagex.game.world.BuildAreaRelated;
import com.jagex.graphics.DrawDistance;


public class PreferencesDrawDistance extends Preference {

	public PreferencesDrawDistance(ClientOptions options) {
		super(options);
	}

	public PreferencesDrawDistance(int value, ClientOptions options) {
		super(value, options);
	}

    public void clampValue() {
		if (this.options.hardwareInfo().unused()) {
			if (this.currentValue < BuildAreaRelated.field2669.field2666 || this.currentValue > BuildAreaRelated.field2670.field2666) {
				this.currentValue = this.defaultValue();
			}
		} else if (this.currentValue < DrawDistance.field2671.field2674 || this.currentValue > DrawDistance.field2673.field2674) {
			this.currentValue = this.defaultValue();
		}
	}

    public int defaultValue() {
		return this.options.hardwareInfo().unused() ? BuildAreaRelated.field2667.field2666 : DrawDistance.field2671.field2674;
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
