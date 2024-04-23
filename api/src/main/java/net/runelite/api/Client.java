package net.runelite.api;

import meteor.ui.config.AspectMode;
import meteor.ui.config.CPUFilter;
import meteor.ui.config.GPUFilter;
import meteor.ui.config.RenderMode;

import javax.swing.*;
import java.awt.image.BufferedImage;

public interface Client extends GameShell{
    void setGamePanel(JPanel gamePanel);

    JPanel getGamePanel();

    Callbacks getCallbacks();

    void setCallbacks(Callbacks callbacks);

    void preInit();

    RenderMode getRenderMode();

    void setRenderMode(RenderMode renderMode);

    AspectMode getAspectMode();

    void setAspectMode(AspectMode aspectMode);

    CPUFilter getCPUFilter();

    void setCPUFilter(CPUFilter cpuFilter);

    GPUFilter getGPUFilter();

    void setGPUFilter(GPUFilter gpuFilter);

    float getStretchedWidth();

    void setStretchedWidth(float stretcheWidth);

    float getStretchedHeight();

    void setStretchedHeight(float stretcheHeight);

    BufferedImage gpuResizeAndFilter(BufferedImage gameImage, int width, int height, int filter);

    float getPadding();

    void setPadding(float xPadding);
    void projectFromGround$api(PathingEntity entity, int height);
    int getProjectX();
    int getProjectY();
    PlayerEntity[] getPlayers();
    PlayerEntity getLocalPlayer();
    NpcEntity[] getNpcs();
    boolean loggedIn();
}
