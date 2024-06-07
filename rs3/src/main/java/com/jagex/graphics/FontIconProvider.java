package com.jagex.graphics;

import deob.ObfuscatedName;

public interface FontIconProvider {

    Sprite[] getIconSprites(Toolkit toolkit, int id);

    int getIconWidth(int id);
}
