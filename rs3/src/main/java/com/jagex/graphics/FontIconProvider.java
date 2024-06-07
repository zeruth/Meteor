package com.jagex.graphics;



public interface FontIconProvider {

    Sprite[] getIconSprites(Toolkit toolkit, int id);

    int getIconWidth(int id);
}
