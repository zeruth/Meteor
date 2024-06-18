package net.runelite.api;

import java.awt.*;

public interface PathingEntity {
    void setProjection(int projectX, int projectY);

    int getProjectionX();

    int getProjectionY();

    int getHeight();

    int getPathLength();

    int getForceMoveEndCycle();

    int getForceMoveStartCycle();

    int getSize();

    int[] getPathTileX();

    int[] getPathTileZ();

    Point[] getTrueTilePoints();

    Point[] getLocalTilePoints();
}
