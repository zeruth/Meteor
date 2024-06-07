package com.jagex.game.client;

import deob.ObfuscatedName;

import java.net.URL;

public class HttpRequest {

    public final URL field738;

    public volatile boolean field739;

    public volatile byte[] field737;

	public HttpRequest(URL arg0) {
		this.field738 = arg0;
	}

    public boolean isComplete() {
		return this.field739;
	}

    public byte[] getData() {
		return this.field737;
	}
}
