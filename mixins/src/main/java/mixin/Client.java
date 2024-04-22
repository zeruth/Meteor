package mixin;

import meteor.events.DrawFinished;
import meteor.ui.config.AspectMode;
import meteor.ui.config.CPUFilter;
import meteor.ui.config.GPUFilter;
import meteor.ui.config.RenderMode;
import net.runelite.api.Callbacks;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("ALL")
@Mixin(RSClient.class)
abstract class Client implements RSClient {
    @Shadow("client")
    public static RSClient client;

    @Shadow("gamePanel")
    public static JPanel gamePanel;

    @Inject
    private Callbacks callbacks;

    @Inject
    @Override
    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Inject
    @Override
    public Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Inject
    @MethodHook(value = "draw", end = true)
    public void draw$post() {
        getCallbacks().post(DrawFinished.INSTANCE);
    }

    @Copy("load")
    @Replace("load")
    public void load() {
        try {
            load();
        } catch (NoClassDefFoundError error) {
            //TODO: investigate this failure, it's weird.
            //simply calling WordFilter.unpack(wordenc)
            //even with an empty obj and empty code will cause the error
            //even though WordFilter has no initialization...
            //error.printStackTrace();
        }
    }

    @Copy("getBaseComponent")
    @Replace("getBaseComponent")
    public Component getBaseComponent$mixin() {
        return gamePanel;
    }

    @Inject
    @Override
    public void preInit() {
        client = this;
        setNodeID(10);
        setPortOffset(3); //world
        setHighMemory$api();
        setMembers(true);
        startDaemon$api();
    }

    @Inject
    private RenderMode renderMode;

    @Inject
    @Override
    public RenderMode getRenderMode() {
        if (renderMode == null)
            renderMode = RenderMode.CPU;
        return renderMode;
    }

    @Inject
    @Override
    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    @Inject
    private AspectMode aspectMode;

    @Inject
    @Override
    public AspectMode getAspectMode() {
        if (aspectMode == null)
            aspectMode = AspectMode.FIT;
        return aspectMode;
    }

    @Inject
    @Override
    public void setAspectMode(AspectMode aspectMode) {
        this.aspectMode = aspectMode;
    }

    @Inject
    private CPUFilter cpuFilter = CPUFilter.NONE;

    @Inject
    @Override
    public CPUFilter getCPUFilter() {
        if (cpuFilter == null)
            cpuFilter = CPUFilter.NONE;
        return cpuFilter;
    }

    @Inject
    @Override
    public void setCPUFilter(CPUFilter cpuFilter) {
        this.cpuFilter = cpuFilter;
    }

    @Inject
    private GPUFilter gpuFilter = GPUFilter.CUBIC;

    @Inject
    @Override
    public GPUFilter getGPUFilter() {
        if (gpuFilter == null)
            gpuFilter = GPUFilter.CUBIC;
        return gpuFilter;
    }

    @Inject
    @Override
    public void setGPUFilter(GPUFilter gpuFilter) {
        this.gpuFilter = gpuFilter;
    }
}
