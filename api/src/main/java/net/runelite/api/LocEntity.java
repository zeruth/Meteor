package net.runelite.api;

import java.awt.*;

public interface LocEntity extends Linkable {
    int getZ();
    int getX();
    int getY();
    int getID();
    int getType();
    Point[] getLocalTilePoints();
}
