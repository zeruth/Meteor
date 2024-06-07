package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;


public final class BaseVarTypeString implements BaseVarTypeCodec {

    public Object decode(Packet arg0) {
		return arg0.gjstr();
	}
}
