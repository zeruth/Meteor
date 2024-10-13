package net.runelite.api;

public enum PacketTypeServer {
    UPDATE_STAT(44),
    MIDI_JINGLE(212),
    MIDI_SONG(54);

    public int id;

    PacketTypeServer(int id) {
        this.id = id;
    }
}
