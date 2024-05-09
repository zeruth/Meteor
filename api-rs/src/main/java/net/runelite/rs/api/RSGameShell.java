package net.runelite.rs.api;

import net.runelite.api.GameShell;
import net.runelite.mapping.Import;

import java.awt.*;
import java.awt.event.*;

public interface RSGameShell extends GameShell, Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {
    @Import("screenWidth")
    void setScreenWidth(int screenWidth);

    @Import("screenHeight")
    void setScreenHeight(int screenHeight);

    @Import("frame")
    void setFrame(RSViewBox frame);

    @Import("graphics")
    Graphics getGraphics();

    @Import("graphics")
    void setGraphics(Graphics graphics);

    @Import("gameSurface")
    void setGameSurface(RSPixMap gameSurface);

    @Import("screenWidth")
    int getScreenWidth();

    @Import("screenHeight")
    int getScreenHeight();

    @Import("initApplication")
    void initApplication$api();

    @Import("startThread")
    void startThread$api(Runnable runnable, int priority);

    @Import("refresh")
    void setRefresh(boolean shouldRefresh);

    @Import("refresh")
    void refresh$api();
}
