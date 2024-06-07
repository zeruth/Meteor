package com.jagex.core.datastruct;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public interface Serializable {

    void encode(Packet buf);

    void decode(Packet buf);

    int computeSize();
}
