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

    @Shadow("gamePanel")
    public static JPanel gamePanel;

    @Copy("initApplication")
    @Replace("initApplication")
    public void initApplication$mixin(int width, int height) {
        setScreenWidth(width);
        setScreenHeight(height);
        setFrame(client.createViewBox(this, width, height));
        setGraphics(gamePanel.getGraphics());
        setDrawArea(client.createPixMap(gamePanel, getScreenWidth(), getScreenHeight()));
        startThread$api(this, 1);
    }

    @Inject
    @Override
    public void update(Graphics g) {
        if (getGraphics() == null)
            setGraphics(gamePanel.getGraphics());
        setRefresh(true);
        refresh$api();
    }

    @Inject
    @Override
    public void paint(Graphics g) {
        if (getGraphics() == null)
            setGraphics(gamePanel.getGraphics());
        setRefresh(true);
        refresh$api();
    }

    @Replace("getBaseComponent")
    public Component getBaseComponent$mixin() {
        return gamePanel;
    }
}
