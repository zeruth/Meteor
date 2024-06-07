package com.jagex.game.client;

import deob.ObfuscatedName;

public final class NativeMouseTask implements Runnable {

	public void run() {
		try {
			NativeMouse.field11719.run();
		} catch (Throwable var2) {
		}
		NativeMouse.field11719 = null;
	}
}
