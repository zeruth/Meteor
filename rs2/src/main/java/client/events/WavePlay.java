package client.events;

import java.io.ByteArrayInputStream;

public class WavePlay {
    public static ByteArrayInputStream lastWave;
    public ByteArrayInputStream soundStream;
    public WavePlay(byte[] data, int pos) {
        lastWave = soundStream = new ByteArrayInputStream(data, 0, pos);
    }
}
