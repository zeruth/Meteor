package net.runelite.rs.api;

import net.runelite.api.PlayerEntity;
import net.runelite.mapping.Import;

public interface RSPlayerEntity extends PlayerEntity, RSPathingEntity {
    @Import("name")
    String getName();
}
