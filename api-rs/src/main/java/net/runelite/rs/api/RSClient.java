package net.runelite.rs.api;

import net.runelite.api.Client;
import net.runelite.mapping.Import;

import javax.swing.*;

public interface RSClient extends Client, RSGameShell {


    @Import("preInit")
    @Override
    void preInit$api();

    @Import("gamePanel")
    @Override
    void setGamePanel(JPanel gamePanel);

    @Import("gamePanel")
    @Override
    JPanel getGamePanel();

    @Import("initApplication")
    @Override
    void initApplication(int width, int height);
}
