package com.jagex.game.load;

import com.jagex.graphics.*;
import deob.ObfuscatedName;
import rs2.client.Client;

public class MessageBox {

    public static LoadingScreenAlignmentX halign;

    public static LoadingScreenAlignmentY valign;

    public static int boxX;

    public static int boxY;

    public static int minWidth;

    public static int minHeight;

    public static int borderCornerId;

    public static int borderLineId;

    public static int backgroundId;

    public static int fontId;

    public static SpriteData borderCorner;

    public static SpriteData borderLine;

    public static SpriteData background;

    public static FontMetrics font1;

    public static PalettedSpriteData font2;

    public static int color;

    public static boolean setup;

	public MessageBox() throws Throwable {
		throw new Error();
	}

    public static void setup(LoadingScreenAlignmentX halign, LoadingScreenAlignmentY valign, int boxX, int boxY, int minWidth, int minHeight, int borderCornerId, int borderLineId, int backgroundId, int color, int fontId) {
		MessageBox.halign = halign;
		MessageBox.valign = valign;
		MessageBox.boxX = boxX;
		MessageBox.boxY = boxY;
		MessageBox.minWidth = minWidth;
		MessageBox.minHeight = minHeight;
		MessageBox.borderCornerId = borderCornerId;
		MessageBox.borderLineId = borderLineId;
		MessageBox.backgroundId = backgroundId;
		MessageBox.borderCorner = null;
		MessageBox.borderLine = null;
		MessageBox.background = null;
		MessageBox.color = color;
		MessageBox.fontId = fontId;
		downloadSprites();
		MessageBox.setup = true;
	}

    public static boolean downloadSprites() {
		boolean loaded = true;

		if (borderCorner == null) {
			if (Client.spritesJs5.loadFile(borderCornerId)) {
				borderCorner = SpriteDataProvider.get(Client.spritesJs5, borderCornerId);
			} else {
				loaded = false;
			}
		}

		if (borderLine == null) {
			if (Client.spritesJs5.loadFile(borderLineId)) {
				borderLine = SpriteDataProvider.get(Client.spritesJs5, borderLineId);
			} else {
				loaded = false;
			}
		}

		if (background == null) {
			if (Client.spritesJs5.loadFile(backgroundId)) {
				background = SpriteDataProvider.get(Client.spritesJs5, backgroundId);
			} else {
				loaded = false;
			}
		}

		if (font1 == null) {
			if (Client.fontmetricsJs5.loadFile(fontId)) {
				font1 = Client.fontProvider.getFontMetrics(Client.fontFactory, fontId);
			} else {
				loaded = false;
			}
		}

		if (font2 == null) {
			if (Client.spritesJs5.loadFile(fontId)) {
				font2 = (PalettedSpriteData) SpriteDataProvider.get(Client.spritesJs5, fontId);
			} else {
				loaded = false;
			}
		}

		return loaded;
	}

    public static void draw(String text, boolean arg1, Toolkit toolkit, Font font, FontMetrics fontMetrics) {
		boolean loaded = !setup || downloadSprites();
		if (!loaded) {
			return;
		}

		if (setup && loaded) {
			FontMetrics var6 = font1;
			Font var7 = toolkit.createFont(var6, font2, true);

			int width = var6.parawidth(text, 250, null);
			int height = var6.paraheight(text, 250, var6.field8566, null);
			int var10 = borderLine.getWidth();

			int var11 = var10 + 4;
			int var12 = var11 * 2 + width;
			int var13 = var11 * 2 + height;

			if (var12 < minWidth) {
				var12 = minWidth;
			}

			if (var13 < minHeight) {
				var13 = minHeight;
			}

			int var14 = halign.computeX(var12, Client.frameWidth) + boxX;
			int var15 = valign.computeY(var13, Client.frameHeight) + boxY;

			toolkit.createSprite(background, false).drawTiledTinted(var14 + borderCorner.getWidth(), var15 + borderCorner.getHeight(), var12 - borderCorner.getWidth() * 2, var13 - borderCorner.getHeight() * 2, 1, -1, 0);

			toolkit.createSprite(borderCorner, true).drawSprite(var14, var15);
			borderCorner.flipHorizontally();

			toolkit.createSprite(borderCorner, true).drawSprite(var12 + var14 - var10, var15);
			borderCorner.flipVertically();

			toolkit.createSprite(borderCorner, true).drawSprite(var12 + var14 - var10, var13 + var15 - var10);
			borderCorner.flipHorizontally();

			toolkit.createSprite(borderCorner, true).drawSprite(var14, var13 + var15 - var10);
			borderCorner.flipVertically();

			toolkit.createSprite(borderLine, true).drawTiled(var14, var15 + borderCorner.getHeight(), var10, var13 - borderCorner.getHeight() * 2);
			borderLine.rotate();

			toolkit.createSprite(borderLine, true).drawTiled(var14 + borderCorner.getWidth(), var15, var12 - borderCorner.getWidth() * 2, var10);
			borderLine.rotate();

			toolkit.createSprite(borderLine, true).drawTiled(var12 + var14 - var10, var15 + borderCorner.getHeight(), var10, var13 - borderCorner.getHeight() * 2);
			borderLine.rotate();

			toolkit.createSprite(borderLine, true).drawTiled(var14 + borderCorner.getWidth(), var13 + var15 - var10, var12 - borderCorner.getWidth() * 2, var10);
			borderLine.rotate();

			var7.drawStringTaggable(text, var11 + var14, var11 + var15, var12 - var11 * 2, var13 - var11 * 2, color | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.requestRedrawAtPoint(var14, var15, var12, var13);
		} else {
			int width = fontMetrics.parawidth(text, 250, null);
			int height = fontMetrics.paraheight(text, 250, null) * 13;

			byte var18 = 4;
			int var19 = var18 + 6;
			int var20 = var18 + 6;

			toolkit.fillRectangle(var19 - var18, var20 - var18, width + var18 + var18, height + var18 + var18, -16777216, 0);
			toolkit.drawRectangle(var19 - var18, var20 - var18, width + var18 + var18, height + var18 + var18, -1, 0);
			font.drawStringTaggable(text, var19, var20, width, height, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Client.requestRedrawAtPoint(var19 - var18, var20 - var18, width + var18 + var18, height + var18 + var18);
		}

        if (arg1) {
            try {
                toolkit.flush();
                toolkit.method2115();
            } catch (RendererException var22) {
            }
        }
    }
}
