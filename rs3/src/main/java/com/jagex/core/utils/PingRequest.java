package com.jagex.core.utils;

import deob.ObfuscatedName;

public final class PingRequest {

    public volatile String host;

    public volatile int hostpacked = -1;

	public PingRequest(String arg0) {
		this.host = arg0;
	}
}
