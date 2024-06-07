package net.runelite.rs.api;

import net.runelite.api.GameShell;
import net.runelite.mapping.Import;

import java.applet.Applet;
import java.awt.event.*;

public interface RSGameShell extends GameShell, Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {
    @Import("supplyApplet")
    void supplyApplet$api(Applet arg0);

    @Import("start")
    void start$api();
}
