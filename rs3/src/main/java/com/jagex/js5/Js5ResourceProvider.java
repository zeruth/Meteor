package com.jagex.js5;

import com.jagex.js5.index.Js5Index;


public abstract class Js5ResourceProvider {

    public abstract Js5Index fetchindex();

    public abstract byte[] fetchgroup(int arg0);

    public abstract int getPercentageComplete(int arg0);

    public abstract void prefetchGroup(int arg0);
}
