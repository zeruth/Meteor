package net.runelite.rs.api;

import net.runelite.api.Loc;
import net.runelite.api.LocEntity;
import net.runelite.mapping.Import;

public interface RSLoc extends Loc {
    @Import("z")
    int getZ();

    @Import("x")
    int getX();

    @Import("y")
    int getY();

    @Import("level")
    int getLevel();

    @Import("bitset")
    int getBitset();
}
