package net.runelite.api;

import javax.swing.*;

public interface Client extends GameShell{
    void preInit$api();

    void setGamePanel(JPanel gamePanel);

    JPanel getGamePanel();

    void initApplication(int width, int height);

    Callbacks getCallbacks();

    void setCallbacks(Callbacks callbacks);
}
