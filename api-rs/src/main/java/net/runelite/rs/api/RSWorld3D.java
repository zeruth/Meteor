package net.runelite.rs.api;

import net.runelite.api.Loc;
import net.runelite.api.Tile;
import net.runelite.api.World3D;
import net.runelite.mapping.Import;

public interface RSWorld3D extends World3D {
    @Import("levelTiles")
    @Override
    Tile[][][] getTiles();
}
