package com.jagex.game.clientoptions.options;

import com.jagex.game.clientoptions.ClientOptions;
import deob.ObfuscatedName;

public abstract class Preference {

    public ClientOptions options;

    public int currentValue;

	public Preference(ClientOptions options) {
		this.options = options;
		this.currentValue = this.defaultValue();
	}

	public Preference(int value, ClientOptions options) {
		this.currentValue = value;
		this.options = options;
	}

    public void method14071(int arg0) {
		if (this.canSetValue(arg0) != 3) {
			this.setValue(arg0);
		}
	}

    public abstract int defaultValue();

    public abstract int canSetValue(int value);

    public abstract void setValue(int value);
}
