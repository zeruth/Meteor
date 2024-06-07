package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;


public final class BaseVarTypeCoordFine implements BaseVarTypeCodec {

    public Object decode(Packet arg0) {
		return new CoordFine(arg0);
	}
}
