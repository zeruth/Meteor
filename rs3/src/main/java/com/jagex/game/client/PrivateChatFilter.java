package com.jagex.game.client;

import deob.ObfuscatedName;

public class PrivateChatFilter {

    public static final PrivateChatFilter field8528 = new PrivateChatFilter(0);

    public static final PrivateChatFilter field8527 = new PrivateChatFilter(1);

    public static final PrivateChatFilter field8529 = new PrivateChatFilter(2);

    public final int value;

    public static PrivateChatFilter[] method4481() {
		return new PrivateChatFilter[] { field8529, field8527, field8528 };
	}

	public PrivateChatFilter(int arg0) {
		this.value = arg0;
	}

    public static PrivateChatFilter method3374(int arg0) {
		PrivateChatFilter[] var1 = method4481();
		for (int var2 = 0; var2 < var1.length; var2++) {
			PrivateChatFilter var3 = var1[var2];
			if (var3.value == arg0) {
				return var3;
			}
		}
		return null;
	}
}
