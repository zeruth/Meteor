package mixin;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPathingEntity;

import java.awt.*;

@SuppressWarnings("ALL")
@Mixin(RSPathingEntity.class)
abstract class PathingEntity extends Frame implements RSPathingEntity {
    @Shadow("client")
    public static RSClient client;

    @Inject
    public int projectX;

    @Inject
    @Override
    public int getProjectionX() {
        return projectX;
    }

    @Inject
    public int projectY;

    @Inject
    @Override
    public int getProjectionY() {
        return projectY;
    }

    @Inject
    @Override
    public void setProjection(int projectX, int projectY) {
        this.projectX = projectX;
        this.projectY = projectY;
    }
}
