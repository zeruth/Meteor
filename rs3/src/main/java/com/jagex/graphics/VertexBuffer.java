package com.jagex.graphics;



public interface VertexBuffer extends GpuBuffer, DeletableResource {

    void delete();

    boolean allocate(int arg0, int arg1);
}
