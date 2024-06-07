package mixin;

import net.runelite.api.Callbacks;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;

import javax.swing.*;
import java.applet.Applet;

@SuppressWarnings("ALL")
@Mixin(RSClient.class)
abstract class Client implements RSClient {
    @Shadow("client")
    public static RSClient client;

    @Inject
    private Callbacks callbacks;

    @Inject
    @Override
    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Inject
    @Override
    public Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Inject
    @Override
    public void preGameInit(Applet applet) {
        supplyApplet$api(applet);
        init$api();
        start$api();
    }

    @Inject
    @Override
    public boolean loggedIn() {
        return false;
    }

    @Inject
    public JPanel gamePanel;

    @Inject
    @Override
    public JPanel getGamePanel() {
        return gamePanel;
    }

    @Inject
    @Override
    public void setGamePanel(JPanel gamePanel) {
        this.gamePanel = gamePanel;
    }
}
