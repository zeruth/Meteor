package mixin;

import meteor.events.*;
import meteor.ui.config.AspectMode;
import meteor.ui.config.CPUFilter;
import meteor.ui.config.RenderMode;
import net.runelite.api.*;
import net.runelite.api.LocEntity;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSComponent;
import net.runelite.rs.api.RSPathingEntity;

import javax.swing.*;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

@SuppressWarnings("ALL")
@Mixin(RSClient.class)
abstract class Client implements RSClient {
    @Shadow("client")
    public static RSClient client;

    @Shadow("instances")
    public static RSComponent[] components;

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

    @Replace("getBaseComponent")
    public java.awt.Component getBaseComponent$mixin() {
        return gamePanel;
    }

    @Copy("startpriv")
    @Replace("startpriv")
    public static void startPriv(InetAddress host) {
        startPriv(host);
    }

    @Inject
    @Override
    public void preGameInit() {
        client = this;
        setNodeID(10);
        setHighMemory$api();
        //setMembers(true);
        try {
            startPriv(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
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
    private float stretchedWidth = -1f;

    @Inject
    @Override
    public float getStretchedWidth() {
        return stretchedWidth;
    }

    @Inject
    @Override
    public void setStretchedWidth(float stretchedWidth) {
        this.stretchedWidth = stretchedWidth;
    }

    @Inject
    private float stretchedHeight = -1f;

    @Inject
    @Override
    public float getStretchedHeight() {
        return stretchedHeight;
    }

    @Inject
    @Override
    public void setStretchedHeight(float stretchedHeight) {
        this.stretchedHeight = stretchedHeight;
    }

    @Inject
    private float padding = 0;

    @Inject
    @Override
    public float getPadding() {
        if (padding == -1)
            padding = 0;
        return padding;
    }

    @Inject
    @Override
    public void setPadding(float padding) {
        this.padding = padding;
    }

    @Inject
    @MethodHook(value = "projectFromGround", end = true)
    public void projectFromGround$tail(RSPathingEntity entity, int height) {
        entity.setProjection(getProjectX(), getProjectY());
    }

    @Inject
    public ByteArrayInputStream lastSound;

    @Inject
    @MethodHook(value = "saveWave", end = true)
    void saveWave$tail(byte[] data, int pos) {
        ByteArrayInputStream soundStream = new ByteArrayInputStream(data, 0, pos);
        lastSound = soundStream;
        getCallbacks().post(new PlaySound(lastSound));
    }

    @Inject
    @MethodHook(value = "replayWave")
    void replayWave$head() {
        lastSound.reset();
        getCallbacks().post(new PlaySound(lastSound));
    }

    @Shadow("wavevol")
    public static int waveVol;

    @Inject
    @Override
    public int getWaveVol() {
        return waveVol;
    }

    @Shadow("midi")
    public static String midi;

    @Inject
    @FieldHook("midi")
    public static void onMidiChanged(int idx) {
        if (!midi.equals("stop") && !midi.equals("voladjust")) {
            client.getCallbacks().post(new PlaySong(midi));
        } else if (midi.equals("stop")) {
            client.getCallbacks().post(StopMusic.INSTANCE);
        }
    }

    @Inject
    @Override
    public String getMidi() {
        return midi;
    }

    @Copy("setMidiVolume")
    @Replace("setMidiVolume")
    public void setMidiVolume(int vol) {
        switch (vol) {
            case 0:
                getCallbacks().post(new ChangeMusicVolume(100));
                break;
            case -400:
                getCallbacks().post(new ChangeMusicVolume(75));
                break;
            case -800:
                getCallbacks().post(new ChangeMusicVolume(50));
                break;
            case -1200:
                getCallbacks().post(new ChangeMusicVolume(25));
                break;
        }
    }

    @Inject
    @Override
    public LocEntity[] getLocs() {
        ArrayList<LocEntity> locs = new ArrayList<LocEntity>();
        Linkable head = getLocLinkList().getSentinel();
        if (head instanceof LocEntity) {
            for (LocEntity loc = (LocEntity) head; loc != null; loc = checkNextLoc(head, loc)) {
                if (loc != null)
                    locs.add(loc);
            }
            return locs.toArray(new LocEntity[locs.size()]);
        }
        return new LocEntity[0];
    }

    @Inject
    public LocEntity checkNextLoc(Linkable sentinel, Linkable current) {
        Linkable next = current.getNext();
        if (current == null || next == sentinel)
            return null;
        return (LocEntity) next;
    }

    @Inject
    @Override
    public void projectFromLocal(int x, int y, int z) {
        projectFromGround$api(x * 128 + 64, y, z  * 128 + 64);
    }

    @Inject
    @Override
    public boolean isBankVisible() {
        return getViewportInterfaceID() == 5292;
    }


    @Inject
    @Override
    public Component[] getComponents() {
        return components;
    }

    @Inject
    @Override
    public boolean isWelcomeScreenVisible() {
        return getViewportInterfaceID() == 5993;
    }

    @Inject
    @FieldHook("ingame")
    public void onInGameChanged(int idx) {
        if (getCallbacks() != null)
            getCallbacks().post(new LoggedInChanged(isLoggedIn()));
    }

    @Inject
    public int lastPacketTypeServer = -1;

    @Inject
    @FieldHook(value = "packetType")
    public void packetType$tail(int idx) {
        int nextPacketType = getPacketType();

        // done processing last packet
        if (nextPacketType == -1) {
           if (lastPacketTypeServer == PacketTypeServer.UPDATE_STAT.id) {
               client.getCallbacks().post(new SkillUpdate(getLevels(), getBoostedLevels(), getExperience()));
           }
        }

        lastPacketTypeServer = nextPacketType;
    }

    @Inject
    @MethodHook("logout")
    public void logout$tail() {
        client.getCallbacks().post(Logout.INSTANCE);
    }

    @Inject
    public int lastViewportInterfaceID = -1;

    @Inject
    @FieldHook("viewportInterfaceId")
    public void onViewportInterfaceIDChanged(int idx) {
        if (lastViewportInterfaceID != getViewportInterfaceID()) {
            System.out.println("Viewport interface changed: " + getViewportInterfaceID());
            lastViewportInterfaceID = getViewportInterfaceID();
        }
    }
}
