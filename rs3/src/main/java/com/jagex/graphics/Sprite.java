package com.jagex.graphics;



public abstract class Sprite implements FontGlyph {

    public final void drawSprite(int x, int y) {
		this.drawSprite(x, y, 1, -1, 1);
	}

    public final void drawTintedScaled(int arg0, int arg1, int arg2, int arg3) {
		this.drawTintedScaled(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
	}

    public final void drawTintedScaled(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.drawTintedScaled(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
	}

    public final void drawTiled(int arg0, int arg1, int arg2, int arg3) {
		this.drawTiledTinted(arg0, arg1, arg2, arg3, 1, -1, 1);
	}

    public final void method1450(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
		this.method1453(arg0, arg1, arg2, arg3, arg4, arg5, 1, -1, 1);
	}

    public final void method1451(float arg0, float arg1, int arg2, int arg3) {
		this.method1453(arg0, arg1, (float) this.getX() / 2.0F, (float) this.getY() / 2.0F, arg2, arg3, 1, -1, 1);
	}

    public final void method1452(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.method1453(arg0, arg1, (float) this.getX() / 2.0F, (float) this.getY() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

    public final void method1497(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg4 == 0 || arg5 == 0) {
			return;
		}
		double var11 = (double) (arg6 & 0xFFFF) * 9.587379924285257E-5D;
		float var13 = (float) Math.sin(var11) * (float) arg5;
		float var14 = (float) Math.cos(var11) * (float) arg5;
		float var15 = (float) Math.sin(var11) * (float) arg4;
		float var16 = (float) Math.cos(var11) * (float) arg4;
		float var17 = (-arg2 * var16 + -arg3 * var13) / 4096.0F + arg0;
		float var18 = (--arg2 * var15 + -arg3 * var14) / 4096.0F + arg1;
		float var19 = (((float) this.getX() - arg2) * var16 + -arg3 * var13) / 4096.0F + arg0;
		float var20 = (-((float) this.getX() - arg2) * var15 + -arg3 * var14) / 4096.0F + arg1;
		float var21 = (-arg2 * var16 + ((float) this.getY() - arg3) * var13) / 4096.0F + arg0;
		float var22 = (--arg2 * var15 + ((float) this.getY() - arg3) * var14) / 4096.0F + arg1;
		this.method1442(var17, var18, var19, var20, var21, var22, arg7, arg8, arg9);
	}

    public final void method1453(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg4 == 0) {
			return;
		}
		double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		float var12 = (float) Math.sin(var10) * (float) arg4;
		float var13 = (float) Math.cos(var10) * (float) arg4;
		float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var15 = (--arg2 * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var16 = (((float) this.getX() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var17 = (-((float) this.getX() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var18 = (-arg2 * var13 + ((float) this.getY() - arg3) * var12) / 4096.0F + arg0;
		float var19 = (--arg2 * var12 + ((float) this.getY() - arg3) * var13) / 4096.0F + arg1;
		this.method1442(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
	}

    public final void method1455(float arg0, float arg1, int arg2, int arg3, SpriteRelated arg4, int arg5, int arg6) {
		this.method1456(arg0, arg1, (float) this.getX() / 2.0F, (float) this.getY() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

    public final void method1456(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8) {
		if (arg4 == 0) {
			return;
		}
		double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		float var12 = (float) Math.sin(var10) * (float) arg4;
		float var13 = (float) Math.cos(var10) * (float) arg4;
		float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var15 = (--arg2 * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var16 = (((float) this.getX() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var17 = (-((float) this.getX() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var18 = (-arg2 * var13 + ((float) this.getY() - arg3) * var12) / 4096.0F + arg0;
		float var19 = (--arg2 * var12 + ((float) this.getY() - arg3) * var13) / 4096.0F + arg1;
		this.method1499(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
	}

    public final void method1442(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
		this.method1433(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
	}

    public final void method1499(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, SpriteRelated arg6, int arg7, int arg8) {
		this.method1454(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
	}

    public abstract void setPadding(int arg0, int arg1, int arg2, int arg3);

    public abstract void method1432(int[] arg0);

    public abstract void method1433(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    public abstract int getX();

    public abstract int getHeight();

    public abstract int getY();

    public abstract GraphicsDeletable method1437();

    public abstract void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract void method1441(int arg0, int arg1, int arg2);

    public abstract void drawSprite(int x, int y, int arg2, int rgb, int arg4);

    public abstract void method1444(int arg0, int arg1, SpriteRelated arg2, int arg3, int arg4);

    public abstract void drawTintedScaled(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    public abstract void drawTiledTinted(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract void method1454(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, SpriteRelated arg7, int arg8, int arg9);

    public abstract int getWidth();

    public abstract void method1469(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

    public abstract void download(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7);
}
