package com.jagex.game.script;

import com.jagex.game.config.quickchatphrasetype.QuickChatPhrase;
import com.jagex.game.script.activepointers.ActiveComponent;
import com.jagex.game.world.entity.Location;
import com.jagex.game.world.entity.ObjStackEntity;
import deob.ObfuscatedName;
import rs2.client.logic.clans.ClanChannel;
import rs2.client.logic.clans.ClanSettings;
import rs2.client.scene.entities.PathingEntity;

import java.util.HashMap;
import java.util.Map;

public class ClientScriptState {

    public int[] intLocals;

    public Object[] objectLocals;

    public long[] longLocals;

    public int[] field8214 = new int[5];

    public int[][] field8215 = new int[5][5000];

    public int[] intStack = new int[1000];

    public int isp = 0;

    public Object[] objectStack = new Object[1000];

    public int osp = 0;

    public long[] longStack = new long[1000];

    public int lsp = 0;

    public int fp = 0;

    public ScriptFrame[] frames = new ScriptFrame[50];

    public ActiveComponent activeComponent = new ActiveComponent();

    public ActiveComponent activeComponent2 = new ActiveComponent();

    public boolean secondary;

    public QuickChatPhrase activeChatPhrase;

    public ClanSettings activeClanSettings;

    public ClanChannel activeClanChannel;

    public PathingEntity activeEntity;

    public Location activeLoc;

    public ObjStackEntity activeObj;

    public Map primaryVars = new HashMap();

    public Map secondaryVars = new HashMap();

    public int nestedCount = 0;

    public int field8231;

    public int[] intOperands;

    public ClientScriptCommand[] instructions;

    public int pc = -1;

    public ClientScript script;
}
