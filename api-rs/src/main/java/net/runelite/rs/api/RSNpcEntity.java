package net.runelite.rs.api;

import net.runelite.api.NpcEntity;
import net.runelite.mapping.Import;

public interface RSNpcEntity extends NpcEntity, RSPathingEntity {
    @Import("type")
    RSNpcType getType();
}
