package com.jagex.game.config.headbartype;

import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.SpriteData;
import com.jagex.graphics.SpriteDataProvider;
import com.jagex.js5.Js5;


public class HeadbarType implements ConfigType {

    public final HeadbarTypeFactory factory;

    public int showpriority = 255;

    public int hidepriority = 255;

    public int fadeout = -1;

    public int field7220 = 1;

    public int sticktime = 70;

    public int full = -1;

    public int empty = -1;

    public int fulllocalpartner = -1;

    public int emptylocalpartner = -1;

    public int fullglobalpartner = -1;

    public int emptyglobalpartner = -1;

	public HeadbarType(int arg0, HeadbarTypeFactory factory) {
		this.factory = factory;
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
			buf.g2();
		} else if (code == 2) {
			this.showpriority = buf.g1();
		} else if (code == 3) {
			this.hidepriority = buf.g1();
		} else if (code == 4) {
			this.fadeout = 0;
		} else if (code == 5) {
			this.sticktime = buf.g2();
		} else if (code == 6) {
			buf.g1();
		} else if (code == 7) {
			this.full = buf.gSmart2or4null();
		} else if (code == 8) {
			this.empty = buf.gSmart2or4null();
		} else if (code == 9) {
			this.fulllocalpartner = buf.gSmart2or4null();
		} else if (code == 10) {
			this.emptylocalpartner = buf.gSmart2or4null();
		} else if (code == 11) {
			this.fadeout = buf.g2();
		} else if (code == 12) {
			this.fullglobalpartner = buf.gSmart2or4null();
		} else if (code == 13) {
			this.emptyglobalpartner = buf.gSmart2or4null();
		}
	}

    public Sprite getSprite(Toolkit toolkit, int id) {
		if (id < 0) {
			return null;
		}
		Sprite var3 = (Sprite) this.factory.spriteCache.get((long) id);
		if (var3 == null) {
			this.loadSprites(toolkit);
			var3 = (Sprite) this.factory.spriteCache.get((long) id);
		}
		return var3;
	}

    public void loadSprite(Toolkit toolkit, int id) {
		Js5 js5 = this.factory.configClient;
		if (id >= 0 && this.factory.spriteCache.get((long) id) == null && js5.loadFile(id)) {
			SpriteData var4 = SpriteDataProvider.get(js5, id);
			this.factory.spriteCache.put(toolkit.createSprite(var4, true), (long) id);
		}
	}

    public void loadSprites(Toolkit toolkit) {
		this.loadSprite(toolkit, this.full);
		this.loadSprite(toolkit, this.empty);
		this.loadSprite(toolkit, this.fulllocalpartner);
		this.loadSprite(toolkit, this.emptylocalpartner);
		this.loadSprite(toolkit, this.fullglobalpartner);
		this.loadSprite(toolkit, this.emptyglobalpartner);
	}

    public void postDecode() {
	}
}
