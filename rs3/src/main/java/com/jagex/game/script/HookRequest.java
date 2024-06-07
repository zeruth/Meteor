package com.jagex.game.script;

import com.jagex.core.datastruct.Node;
import com.jagex.game.config.iftype.Component;
import deob.ObfuscatedName;

public class HookRequest extends Node {

    public Object[] onop;

    public boolean isMouseHook;

    public Component component;

    public int mouseX;

    public int mouseY;

    public int opindex;

    public Component drop;

    public int key;

    public int keychar;

    public String opbase;

    public int nestedCount;
}
