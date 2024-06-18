package net.runelite.rs.api;

import net.runelite.api.Tile;
import net.runelite.mapping.Import;

public interface RSTile extends Tile {
    @Import("locs")
    @Override
    RSLoc[] getLocs();

    @Import("wallDecoration")
    @Override
    RSWallDecoration getWallDecoration();

    @Import("groundDecoration")
    @Override
    RSGroundDecoration getGroundDecoration();

    @Import("x")
    @Override
    int getX();

    @Import("z")
    @Override
    int getZ();

    @Import("level")
    @Override
    int getLevel();
}
