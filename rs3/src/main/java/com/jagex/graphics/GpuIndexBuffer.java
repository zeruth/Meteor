package com.jagex.graphics;

import com.jagex.game.client.DataType;
import deob.ObfuscatedName;

public interface GpuIndexBuffer extends GpuBuffer, DeletableResource {

    void method5831(int arg0);

    DataType getDataType();

    void delete();
}
