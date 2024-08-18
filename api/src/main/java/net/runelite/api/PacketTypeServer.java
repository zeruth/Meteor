package net.runelite.api;

public enum PacketTypeServer {
    UPDATE_STAT(44);

    public int id;

    PacketTypeServer(int id) {
        this.id = id;
    }
}
