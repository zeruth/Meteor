package com.jagex.game.client;

import com.jagex.core.constants.ModeWhere;
import deob.ObfuscatedName;

public class ServerPorts {

	public ServerPorts() throws Throwable {
		throw new Error();
	}

    public static int method2912(ModeWhere arg0, ServerType arg1, int arg2) {
		return ModeWhere.LIVE == arg0 ? 43594 : arg2 + 40000;
	}

    public static int method10147(ModeWhere arg0, ServerType arg1, int arg2) {
		return ModeWhere.LIVE == arg0 ? 443 : arg2 + 50000;
	}

    public static int method14998(ModeWhere arg0, ServerType arg1, int arg2) {
		if (ModeWhere.LIVE == arg0) {
			return 80;
		} else if (ServerType.field8346 == arg1) {
			return arg2 + 12000;
		} else {
			return arg2 + 7000;
		}
	}
}
