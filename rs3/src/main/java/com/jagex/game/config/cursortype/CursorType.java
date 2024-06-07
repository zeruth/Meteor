package com.jagex.game.config.cursortype;

import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import deob.ObfuscatedName;

public class CursorType implements ConfigType {

    public final CursorTypeFactory myList;

    public int graphic;

    public int hotspotx;

    public int hotspoty;

	public CursorType(int id, CursorTypeFactory factory) {
		this.myList = factory;
	}

    public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

    public void decode(Packet buf, int code) {
		if (code == 1) {
			this.graphic = buf.gSmart2or4null();
		} else if (code == 2) {
			this.hotspotx = buf.g1();
			this.hotspoty = buf.g1();
		}
	}

    public synchronized SpriteData getCursor() {
		SpriteData cached = (SpriteData) this.myList.cursorCache.get((long) this.graphic);
		if (cached != null) {
			return cached;
		}
		SpriteData sprite = SpriteDataProvider.method1609(this.myList.js5, this.graphic, 0);
		if (sprite != null) {
			this.myList.cursorCache.put(sprite, (long) this.graphic);
		}
		return sprite;
	}

    public void postDecode() {
	}
}
