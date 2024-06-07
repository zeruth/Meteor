package com.jagex.graphics;

import deob.ObfuscatedName;

public interface VertexBuffer extends GpuBuffer, DeletableResource {

    void delete();

    boolean allocate(int arg0, int arg1);
}
