package net.runelite.rs.api;

import net.runelite.api.PathingEntity;
import net.runelite.mapping.Import;

public interface RSPathingEntity extends PathingEntity {
    @Import("height")
    int getHeight();

    @Import("pathLength")
    int getPathLength();

    @Import("forceMoveEndCycle")
    int getForceMoveEndCycle();

    @Import("forceMoveStartCycle")
    int getForceMoveStartCycle();

    @Import("size")
    int getSize();

    @Import("pathTileX")
    int[] getPathTileX();

    @Import("pathTileZ")
    int[] getPathTileZ();

    @Import("x")
    int getX();

    @Import("z")
    int getZ();
}
