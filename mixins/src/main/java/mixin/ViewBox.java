package mixin;

import meteor.events.DrawFinished;
import net.runelite.api.Callbacks;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSViewBox;

import java.awt.*;

@SuppressWarnings("ALL")
/**
 * Prevent vanilla ViewBox behavior
 */
@Mixin(RSViewBox.class)
abstract class ViewBox extends Frame implements RSViewBox {
    @Shadow("client")
    public static RSClient client;

    @Inject
    @Override
    public void show() {}

    @Inject
    @Override
    public void update(Graphics g) {}

    @Inject
    @Override
    public void paint(Graphics g) {}
}
