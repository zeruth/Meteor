package com.jagex.graphics;



public interface GpuTexture extends BaseTexture {

    int getHeight();

    float getU(float arg0);

    float getV(float arg0);

    void setWarp(boolean arg0, boolean arg1);

    void upload(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

    void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5);

    void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6);

    float method5707();

    boolean method5708();

    void upload(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7);

    int getWidth();

    void upload(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    boolean method5732();

    float method5734();
}
