package net.runelite.rs.api;

import net.runelite.api.Client;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

import javax.swing.*;
import java.awt.*;

public interface RSClient extends Client, RSGameShell {

    @Construct
    RSViewBox createViewBox(RSGameShell shell, int width, int height);

    @Construct
    RSPixMap createPixMap(Component component, int width, int height);

    @Import("gamePanel")
    @Override
    void setGamePanel(JPanel gamePanel);

    @Import("gamePanel")
    @Override
    JPanel getGamePanel();

    @Import("nodeId")
    void setNodeID(int nodeID);

    @Import("portOffset")
    void setPortOffset(int portOffset);

    @Import("setHighMemory")
    void setHighMemory$api();

    @Import("members")
    void setMembers(boolean isMembers);

    @Import("startDaemon")
    void startDaemon$api();
}
