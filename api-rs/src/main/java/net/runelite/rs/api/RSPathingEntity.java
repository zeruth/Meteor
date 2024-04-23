package net.runelite.rs.api;

import net.runelite.api.PathingEntity;
import net.runelite.mapping.Import;

public interface RSPathingEntity extends PathingEntity {
    @Import("height")
    int getHeight();
}
