package net.runelite.api;

import meteor.ui.config.AspectMode;
import meteor.ui.config.CPUFilter;
import meteor.ui.config.GPUFilter;
import meteor.ui.config.RenderMode;

import javax.swing.*;

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

}
