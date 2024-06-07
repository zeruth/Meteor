package com.jagex.js5;

import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;

public abstract class Js5Request extends SecondaryNode {

    public boolean urgent;

    public boolean orphan;

    public volatile boolean incomplete = true;

    public abstract byte[] getBytes();

    public abstract int getPercentageComplete();
}
