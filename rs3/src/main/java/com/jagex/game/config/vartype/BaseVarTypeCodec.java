package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public interface BaseVarTypeCodec {

    Object decode(Packet arg0);
}
