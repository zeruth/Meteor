package net.runelite.rs.api;

import net.runelite.api.Linkable;
import net.runelite.api.NpcEntity;
import net.runelite.mapping.Import;

public interface RSLinkable extends Linkable {
    @Import("next")
    RSLinkable getNext();
}
