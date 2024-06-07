package com.jagex.game.client;

import com.jagex.graphics.GraphicsPacketQueue;
import deob.ObfuscatedName;
import rs2.client.Client;

public class Js5DllResourceLoader implements ResourceLoader {

    public final String field4336;

    public final boolean field4335;

    public boolean field4337;

	public Js5DllResourceLoader(String arg0, boolean arg1) {
		this.field4336 = arg0;
		this.field4335 = arg1;
	}

	public Js5DllResourceLoader(String arg0) {
		this(arg0, false);
	}

    public int getPercentageComplete() {
		if (this.field4337) {
			return 100;
		}
		try {
			return Client.hardwarePlatformLoader.method8464(this.field4336, this.field4335);
		} catch (HardwarePlatformLoaderException var2) {
			GraphicsPacketQueue.method18474(NativeLibraryFailureType.field8907, var2.field11896, var2.field11897, var2.getCause());
			this.field4337 = true;
			return 100;
		}
	}

    public boolean method6812() {
		return this.field4337;
	}

    public void method6813() {
		this.field4337 = true;
	}

    public LoadableResourceType getLoadableResourceType() {
		return LoadableResourceType.DLL;
	}
}
