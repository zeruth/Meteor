package net.runelite.api;

import java.awt.*;

public interface Loc {
    int getLevel();
    int getZ();
    int getX();
    int getY();
    int getID();
    int getType();
    Point[] getLocalTilePoints();
}
