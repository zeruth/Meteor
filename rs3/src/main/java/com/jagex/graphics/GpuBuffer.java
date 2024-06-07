package com.jagex.graphics;



public interface GpuBuffer {

    long lock(int arg0, int arg1);

    boolean upload(int arg0, int arg1, long arg2);

    int method5743();

    void unlock();
}
