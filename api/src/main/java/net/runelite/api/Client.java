package net.runelite.api;

import javax.swing.*;

public interface Client extends GameShell{
    void setGamePanel(JPanel gamePanel);

    JPanel getGamePanel();

    Callbacks getCallbacks();

    void setCallbacks(Callbacks callbacks);

    ViewBox createViewBox(GameShell shell, int width, int height);

    void preInit();
}
