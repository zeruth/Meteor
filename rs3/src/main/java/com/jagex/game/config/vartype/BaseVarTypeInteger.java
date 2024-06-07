package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;


public final class BaseVarTypeInteger implements BaseVarTypeCodec {

    public Object decode(Packet arg0) {
		return arg0.g4s();
	}
}
