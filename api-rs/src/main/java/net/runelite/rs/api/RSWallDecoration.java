package net.runelite.rs.api;

import net.runelite.api.WallDecoration;
import net.runelite.mapping.Import;

public interface RSWallDecoration extends WallDecoration {
    @Import("z")
    int getZ();

    @Import("x")
    int getX();

    @Import("y")
    int getY();

    @Import("bitset")
    int getBitset();
}
