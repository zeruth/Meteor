package com.jagex.game.client;

import com.jagex.graphics.FontFactory;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.SpriteDataProvider;

import rs2.client.Client;

public final class ClientFontFactory implements FontFactory {

    public Object createFont(byte[] bytes, FontMetrics fontMetrics, boolean arg2) {
		return Client.toolkit.createFont(fontMetrics, SpriteDataProvider.method1615(bytes)[0], arg2);
	}
}
