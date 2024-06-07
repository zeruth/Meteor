package com.jagex.audio.vorbis;

import com.jagex.audio.api.AudioEndianness;
import com.jagex.audio.api.AudioFormat;
import com.jagex.core.io.Packet;


public interface VorbisInterface {

    void method3774(int arg0, AudioFormat arg1, AudioEndianness arg2, int arg3);

    void method3726(Packet arg0);

    AudioFormat method3733();

    AudioEndianness method3734();

    int method3722();

    int method3731(int arg0);

    void method3770(VorbisInterface2 arg0);

    Packet method3728(int arg0);

    boolean method3868();

    void method3721(boolean arg0);

    void method3771(boolean arg0, int arg1, int arg2, int arg3);

    int method3729();

    void method3727();

    VorbisRelated method3843();

    int method3730(int arg0);

    void method3738();
}
