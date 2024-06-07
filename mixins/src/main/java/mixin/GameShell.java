package mixin;

import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameShell;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("ALL")
@Mixin(RSGameShell.class)
abstract class GameShell extends Applet implements RSGameShell {
    @Shadow("client")
    public static RSClient client;
}
