package net.runelite.rs.api;

import net.runelite.api.NpcType;
import net.runelite.mapping.Import;

public interface RSNpcType extends NpcType {
    @Import("name")
    String getName();
}
