package com.jagex.game.config;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public interface ConfigType {

    void postDecode();

    void decode(Packet buf);
}
