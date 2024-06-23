package net.runelite.rs.api;

import net.runelite.api.GroundDecoration;
import net.runelite.mapping.Import;

public interface RSGroundDecoration extends GroundDecoration {
    @Import("z")
    int getZ();

    @Import("x")
    int getX();

    @Import("y")
    int getY();

    @Import("bitset")
    int getBitset();
}
