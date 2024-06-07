package com.jagex.game.config.paramtype;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

public class ParamType implements ConfigType, MutableConfig {

    public ScriptVarType type;

    public int defaultint;

    public String defaultstr;

    public boolean autodisable = true;

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
			char c = Cp1252.byteToCp1252Char(buf.g1b());
			this.type = ScriptVarType.getByLegacyChar(c);
		} else if (code == 2) {
			this.defaultint = buf.g4s();
		} else if (code == 4) {
			this.autodisable = false;
		} else if (code == 5) {
			this.defaultstr = buf.gjstr();
		} else if (code == 101) {
			this.type = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), buf.gSmart1or2());
		}
	}

    public boolean isStringType() {
		return ScriptVarType.STRING == this.type;
	}

    public void postDecode() {
	}

    public void setId(int arg0) {
	}
}
