package com.jagex.game.config.flotype;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;


public class FloorOverlayType implements ConfigType, MutableConfig {

    public int id;

    public int rgb = 0;

    public int material = -1;

    public boolean occlude = true;

    public int averagecolour = -1;

    public int materialscale = 512;

    public boolean hardshadow = true;

    public int priority = 0;

    public boolean blend = false;

    public int waterfogcolour = 0x122b3d;

    public int waterfogscale = 512;

    public int waterfogoffset = 256;

    public int field8165 = 64;

    public int field8166 = 0;

    public int field8167 = 64;

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
			this.rgb = convertColour(buf.g3());
		} else if (code == 2) {
			this.material = buf.g1();
		} else if (code == 3) {
			this.material = buf.g2();

			if (this.material == 65535) {
				this.material = -1;
			}
		} else if (code == 5) {
			this.occlude = false;
		} else if (code == 7) {
			this.averagecolour = convertColour(buf.g3());
		} else if (code == 8) {
			// empty
		} else if (code == 9) {
			this.materialscale = buf.g2() << 2;
		} else if (code == 10) {
			this.hardshadow = false;
		} else if (code == 11) {
			this.priority = buf.g1();
		} else if (code == 12) {
			this.blend = true;
		} else if (code == 13) {
			this.waterfogcolour = buf.g3();
		} else if (code == 14) {
			this.waterfogscale = buf.g1() << 2;
		} else if (code == 16) {
			this.waterfogoffset = buf.g1();
		} else if (code == 20) {
			this.field8165 = buf.g2();
		} else if (code == 21) {
			this.field8166 = buf.g1();
		} else if (code == 22) {
			this.field8167 = buf.g2();
		}
	}

    public void postDecode() {
		this.priority = this.priority << 8 | this.id;
	}

    public static int convertColour(int color) {
		return color == 0xFF00FF ? -1 : ColourUtils.hslToRgb(color);
	}

    public void setId(int id) {
		this.id = id;
	}
}
