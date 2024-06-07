package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;


public interface BaseVarTypeCodec {

    Object decode(Packet arg0);
}
