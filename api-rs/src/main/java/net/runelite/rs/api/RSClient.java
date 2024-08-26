package net.runelite.rs.api;

import net.runelite.api.Client;
import net.runelite.api.LinkList;
import net.runelite.api.PathingEntity;
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

    @Import("members")
    boolean getMembers();

    @Override
    @Import("project")
    void project$api(int x, int y, int z);

    @Override
    @Import("projectFromGround")
    void projectFromGround$api(PathingEntity entity, int height);

    @Override
    @Import("projectFromGround")
    void projectFromGround$api(int x, int y, int z);

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
    boolean isLoggedIn();

    @Import("loopCycle")
    int getLoopCycle();

    @Import("currentLevel")
    int getCurrentLevel();

    @Import("getHeightmapY")
    int getHeightmapY$api(int level, int x, int z);

    @Import("locList")
    LinkList getLocLinkList();

    @Import("sceneBaseTileX")
    int getBaseX();

    @Import("sceneBaseTileZ")
    int getBaseZ();

    @Import("scene")
    RSWorld3D getScene();

    @Import("viewportInterfaceId")
    int getViewportInterfaceID();

    @Import("updateServerConnection")
    void updateServerConnection$api(String URL, int PORT_OFFSET);

    @Import("skillBaseLevel")
    int[] getLevels();

    @Import("skillLevel")
    int[] getBoostedLevels();

    @Import("skillExperience")
    int[] getExperience();

    @Import("packetType")
    int getPacketType();

    @Import("levelExperience")
    int[] getLevelExperience();

    @Import("keepUsername")
    void setKeepUsername(boolean keepUsername);

    @Import("keepPassword")
    void setKeepPassword(boolean keepPassword);

    @Import("autoUsername")
    void setAutoUsername(String autoUsername);

    @Import("autoPassword")
    void setAutoPassword(String autoPassword);

    @Import("menuX")
    int getMenuX();

    @Import("menuY")
    int getMenuY();

    @Import("menuWidth")
    int getMenuWidth();

    @Import("menuHeight")
    int getMenuHeight();

    @Import("menuVisible")
    boolean getMenuVisible();

    @Import("energy")
    int getEnergy();

    @Import("setMidi")
    void setMidi$api(String name, int crc, int len);

    @Import("stopMidi")
    void stopMidi$api();
}
