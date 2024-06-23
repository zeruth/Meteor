package net.runelite.rs.api;

import net.runelite.api.LocEntity;
import net.runelite.mapping.Import;

public interface RSLocEntity extends LocEntity, RSLinkable {
    @Import("z")
    int getZ();

    @Import("x")
    int getX();

    @Import("level")
    int getY();

    @Import("index")
    int getID();

    @Import("type")
    int getType();
}
