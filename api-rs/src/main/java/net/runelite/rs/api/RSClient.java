package net.runelite.rs.api;

import net.runelite.api.Client;
import net.runelite.api.PathingEntity;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;

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

    @Override
    @Import("projectFromGround")
    void projectFromGround$api(PathingEntity entity, int height);

    @Import("projectX")
    int getProjectX();

    @Import("projectY")
    int getProjectY();

    @Import("playerCount")
    int getPlayerCount();

    @Import("npcCount")
    int getNPCCount();

    @Import("players")
    RSPlayerEntity[] getPlayers();

    @Import("localPlayer")
    RSPlayerEntity getLocalPlayer();

    @Import("npcs")
    RSNpcEntity[] getNpcs();

    @Override
    @Import("ingame")
    boolean loggedIn();
}
