package com.jagex.audio.api;

import com.jagex.audio.stream.BussManager;
import com.jagex.audio.stream.AudioProcessingUnit;
import com.jagex.audio.stream.SoundRelatedType2;


public abstract class SoundBackend {

    public abstract Object playSample(int arg0, int arg1, AudioFormat format, AudioEndianness endianness, int arg4, float arg5);

    public abstract void method5863(Object arg0);

    public abstract int method5864(Object arg0);

    public abstract AudioProcessingUnit method5865(SoundRelatedType2 arg0);

    public abstract Object method5866(AudioBuss arg0);

    public abstract void method5868();

    public abstract void method5874();

    public abstract void method5875(Object arg0, byte[] arg1, int arg2, int arg3);

    public abstract BussManager getBussManager();
}
