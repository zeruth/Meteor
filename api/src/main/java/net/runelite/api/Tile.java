package net.runelite.api;

public interface Tile {
    Loc[] getLocs();
    WallDecoration getWallDecoration();
    GroundDecoration getGroundDecoration();
    int getX();
    int getZ();
    int getLevel();
}
