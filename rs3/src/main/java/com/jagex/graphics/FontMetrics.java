package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import com.jagex.core.utils.StringTools;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.awt.*;

public class FontMetrics {

    public byte[] field8564;

    public byte[] field8574;

    public byte[][] field8563;

    public byte[] field8565;

    public int field8566;

    public int field8562;

    public int field8569;

    public int field8568;

    public int field8567;

    public int field8570;

    public int field8571;

    public int field8572;

    public short[][] field8573;

    public static String[] stringBuilder = new String[100];

    public final FontIconProvider fontIconProvider;

    public static FontMetrics createFontMetrics(Js5 fontmetricsJs5, int fontId, int arg2) {
		return createFontMetrics(fontmetricsJs5, fontId, arg2, null);
	}

    public static FontMetrics createFontMetrics(Js5 fontmetricsJs5, int fontId, int arg2, FontIconProvider fontIconProvider) {
		byte[] bytes = fontmetricsJs5.getfile(fontId, arg2);
		return bytes == null ? null : new FontMetrics(bytes, fontIconProvider);
	}

    public static FontMetrics createFontMetrics(Js5 fontmetricsJs5, int fontId, FontIconProvider fontIconProvider) {
		byte[] var3 = fontmetricsJs5.fetchFile(fontId);
		return var3 == null ? null : new FontMetrics(var3, fontIconProvider);
	}

	public FontMetrics(byte[] bytes, FontIconProvider fontIconProvider) {
		this.fontIconProvider = fontIconProvider;
		Packet buf = new Packet(bytes);
		int var4 = buf.g1();
		if (var4 != 0) {
			throw new RuntimeException("");
		}
		boolean var5 = buf.g1() == 1;
		this.field8574 = new byte[256];
		buf.gdata(this.field8574, 0, 256);
		this.field8564 = new byte[256];
		buf.gdata(this.field8564, 0, 256);
		this.field8565 = new byte[256];
		buf.gdata(this.field8565, 0, 256);
		this.field8573 = new short[256][4];
		this.field8571 = buf.g2();
		this.field8572 = buf.g2();
		for (int var6 = 0; var6 < 256; var6++) {
			this.field8573[var6][0] = (short) buf.g2();
		}
		for (int var7 = 0; var7 < 256; var7++) {
			this.field8573[var7][1] = (short) buf.g2();
		}
		for (int var8 = 0; var8 < 256; var8++) {
			this.field8573[var8][2] = this.field8574[var8];
			this.field8573[var8][3] = this.field8564[var8];
		}
		if (var5) {
			byte[][] var9 = new byte[256][];
			for (int var10 = 0; var10 < 256; var10++) {
				var9[var10] = new byte[this.field8564[var10]];
				byte var11 = 0;
				for (int var12 = 0; var12 < var9[var10].length; var12++) {
					var11 += buf.g1b();
					var9[var10][var12] = var11;
				}
			}
			byte[][] var13 = new byte[256][];
			for (int var14 = 0; var14 < 256; var14++) {
				var13[var14] = new byte[this.field8564[var14]];
				byte var15 = 0;
				for (int var16 = 0; var16 < var13[var14].length; var16++) {
					var15 += buf.g1b();
					var13[var14][var16] = var15;
				}
			}
			this.field8563 = new byte[256][256];
			for (int var17 = 0; var17 < 256; var17++) {
				if (var17 != 32 && var17 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 32 && var18 != 160) {
							this.field8563[var17][var18] = (byte) method9852(var9, var13, this.field8565, this.field8574, this.field8564, var17, var18);
						}
					}
				}
			}
			this.field8566 = this.field8565[32] + this.field8564[32];
		} else {
			this.field8566 = buf.g1();
		}
		this.field8568 = buf.g1();
		this.field8567 = buf.g1();
		this.field8562 = buf.g1();
		this.field8569 = buf.g1();
		this.field8570 = buf.g1();
		if (this.field8570 != 1) {
			this.field8566 /= this.field8570;
			this.field8568 /= this.field8570;
			this.field8567 /= this.field8570;
			this.field8562 /= this.field8570;
			this.field8569 /= this.field8570;
			for (int var19 = 0; var19 < 256; var19++) {
				this.field8574[var19] = (byte) (this.field8574[var19] / this.field8570);
				this.field8564[var19] = (byte) (this.field8564[var19] / this.field8570);
				this.field8565[var19] = (byte) (this.field8565[var19] / this.field8570);
			}
			if (var5) {
				for (int var20 = 0; var20 < 256; var20++) {
					for (int var21 = 0; var21 < 256; var21++) {
						this.field8563[var20][var21] = (byte) (this.field8563[var20][var21] / this.field8570);
					}
				}
			}
		}
	}

    public static int method9852(byte[][] arg0, byte[][] arg1, byte[] arg2, byte[] arg3, byte[] arg4, int arg5, int arg6) {
		byte var7 = arg2[arg5];
		int var8 = arg4[arg5] + var7;
		byte var9 = arg2[arg6];
		int var10 = arg4[arg6] + var9;
		byte var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		int var13 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < var13) {
			var13 = arg3[arg6] & 0xFF;
		}
		byte[] var14 = arg1[arg5];
		byte[] var15 = arg0[arg6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		return -var13;
	}

    public int method14537(int arg0, char arg1) {
		return this.field8563 == null ? 0 : this.field8563[arg0][arg1];
	}

    public int method14558(int arg0) {
		return this.field8574[arg0] & 0xFF;
	}

    public int method14529(int arg0) {
		return this.field8564[arg0] & 0xFF;
	}

    public int method14560(int arg0) {
		return this.field8565[arg0] & 0xFF;
	}

    public short[] method14561(int arg0) {
		return this.field8573[arg0];
	}

    public int stringWidth(String str) {
		return this.stringWidth(str, null);
	}

    public int stringWidth(String str, FontGlyph[] glyphs) {
		if (str == null) {
			return 0;
		}
		int var3 = -1;
		int var4 = -1;
		int width = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			char c = str.charAt(index);
			if (c == '<') {
				var3 = index;
			} else {
				if (c == '>' && var3 != -1) {
					String var9 = str.substring(var3 + 1, index);
					var3 = -1;
					if (var9.equals("lt")) {
						c = '<';
					} else if (var9.equals("gt")) {
						c = '>';
					} else if (var9.equals("nbsp")) {
						c = 160;
					} else if (var9.equals("shy")) {
						c = 173;
					} else if (var9.equals("times")) {
						c = 215;
					} else if (var9.equals("euro")) {
						c = 128;
					} else if (var9.equals("copy")) {
						c = 169;
					} else {
						if (!var9.equals("reg")) {
							if (var9.startsWith("img=") && glyphs != null) {
								try {
									int glyphId = StringTools.parseInt(var9.substring(4));
									width += glyphs[glyphId].getX();
									var4 = -1;
								} catch (Exception var17) {
								}
								continue;
							}
							if (var9.startsWith("sprite=") && this.fontIconProvider != null) {
								try {
									boolean var12 = true;
									int iconIndex = var9.indexOf(44);
									int iconId;
									if (iconIndex == -1) {
										iconId = StringTools.parseInt(var9.substring(7));
									} else {
										iconId = StringTools.parseInt(var9.substring(7, iconIndex));
									}
									width += this.fontIconProvider.getIconWidth(iconId);
									var4 = -1;
								} catch (Exception var16) {
								}
							}
							continue;
						}
						c = 174;
					}
				}
				if (var3 == -1) {
					width += this.field8574[Cp1252.encode(c) & 0xFF] & 0xFF;
					if (this.field8563 != null && var4 != -1) {
						width += this.field8563[var4][c];
					}
					var4 = c;
				}
			}
		}
		return width;
	}

    public String truncString(String str, int width, FontGlyph[] glyphs) {
		if (this.stringWidth(str, glyphs) <= width) {
			return str;
		}
		int limit = width - this.stringWidth("...", null);
		int var5 = -1;
		int var6 = -1;
		int currentWidth = 0;
		int length = str.length();
		String stringBuilder = "";
		for (int index = 0; index < length; index++) {
			char c = str.charAt(index);
			if (c == '<') {
				var5 = index;
			} else {
				if (c == '>' && var5 != -1) {
					String line = str.substring(var5 + 1, index);
					var5 = -1;
					if (line.equals("lt")) {
						c = '<';
					} else if (line.equals("gt")) {
						c = '>';
					} else if (line.equals("nbsp")) {
						c = 160;
					} else if (line.equals("shy")) {
						c = 173;
					} else if (line.equals("times")) {
						c = 215;
					} else if (line.equals("euro")) {
						c = 128;
					} else if (line.equals("copy")) {
						c = 169;
					} else {
						if (!line.equals("reg")) {
							if (line.startsWith("img=") && glyphs != null) {
								try {
									int glyphId = StringTools.parseInt(line.substring(4));
									currentWidth += glyphs[glyphId].getX();
									var6 = -1;
									if (currentWidth > limit) {
										return stringBuilder + "...";
									}
									stringBuilder = str.substring(0, index + 1);
								} catch (Exception var21) {
								}
								continue;
							}
							if (line.startsWith("sprite=") && this.fontIconProvider != null) {
								try {
									boolean var15 = true;
									int iconIndex = line.indexOf(44);
									int iconId;
									if (iconIndex == -1) {
										iconId = StringTools.parseInt(line.substring(7));
									} else {
										iconId = StringTools.parseInt(line.substring(7, iconIndex));
									}
									currentWidth += this.fontIconProvider.getIconWidth(iconId);
									var6 = -1;
									if (currentWidth > limit) {
										return stringBuilder + "...";
									}
									stringBuilder = str.substring(0, index + 1);
								} catch (Exception var20) {
								}
							}
							continue;
						}
						c = 174;
					}
				}
				if (var5 == -1) {
					currentWidth += this.field8574[Cp1252.encode(c) & 0xFF] & 0xFF;
					if (this.field8563 != null && var6 != -1) {
						currentWidth += this.field8563[var6][c];
					}
					var6 = c;
					int var19 = currentWidth;
					if (this.field8563 != null) {
						var19 = this.field8563[c][46] + currentWidth;
					}
					if (var19 > limit) {
						return stringBuilder + "...";
					}
					stringBuilder = str.substring(0, index + 1);
				}
			}
		}
		return str;
	}

    public int splitInit(String str, int[] widths, String[] lines, FontGlyph[] glyphs) {
		return this.splitInit(str, widths, lines, glyphs, true);
	}

    public int splitInit(String str, int[] widths, String[] lines, FontGlyph[] glyphs, boolean arg4) {
		if (str == null) {
			return 0;
		}
		int var6 = 0;
		int var7 = 0;
		int var8 = -1;
		int var9 = 0;
		int var10 = 0;
		int var11 = -1;
		int var12 = -1;
		int linecount = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			int c = Cp1252.encode(str.charAt(index)) & 0xFF;
			int var17 = 0;
			if (c == 60) {
				var11 = index;
			} else {
				int var18;
				if (var11 == -1) {
					var18 = index;
					var17 += this.method14558(c);
					if (this.field8563 != null && var12 != -1) {
						var17 += this.field8563[var12][c];
					}
					var12 = c;
				} else {
					if (c != 62) {
						continue;
					}
					var18 = var11;
					String var19 = str.substring(var11 + 1, index);
					var11 = -1;
					if (var19.equals("br")) {
						lines[linecount] = str.substring(var7, index + 1);
						linecount++;
						if (linecount >= lines.length) {
							return 0;
						}
						var7 = index + 1;
						var6 = 0;
						var8 = -1;
						var12 = -1;
						continue;
					}
					if (var19.equals("lt")) {
						var17 += this.method14558(60);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][60];
						}
						var12 = 60;
					} else if (var19.equals("gt")) {
						var17 += this.method14558(62);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][62];
						}
						var12 = 62;
					} else if (var19.equals("nbsp")) {
						var17 += this.method14558(160);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][160];
						}
						var12 = 160;
					} else if (var19.equals("shy")) {
						var17 += this.method14558(173);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][173];
						}
						var12 = 173;
					} else if (var19.equals("times")) {
						var17 += this.method14558(215);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][215];
						}
						var12 = 215;
					} else if (var19.equals("euro")) {
						var17 += this.method14558(128);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][128];
						}
						var12 = 128;
					} else if (var19.equals("copy")) {
						var17 += this.method14558(169);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][169];
						}
						var12 = 169;
					} else if (var19.equals("reg")) {
						var17 += this.method14558(174);
						if (this.field8563 != null && var12 != -1) {
							var17 += this.field8563[var12][174];
						}
						var12 = 174;
					} else if (var19.startsWith("img=") && glyphs != null) {
						try {
							int glyphId = StringTools.parseInt(var19.substring(4));
							var17 += glyphs[glyphId].getX();
							var12 = -1;
						} catch (Exception var27) {
						}
					} else if (var19.startsWith("sprite=") && this.fontIconProvider != null) {
						try {
							boolean var22 = true;
							int iconIndex = var19.indexOf(44);
							int iconId;
							if (iconIndex == -1) {
								iconId = StringTools.parseInt(var19.substring(7));
							} else {
								iconId = StringTools.parseInt(var19.substring(7, iconIndex));
							}
							int var10000 = var17 + this.fontIconProvider.getIconWidth(iconId);
							var12 = -1;
						} catch (Exception var28) {
						}
						continue;
					}
					c = -1;
				}
				if (var17 > 0) {
					var6 += var17;
					if (widths != null) {
						if (c == 32) {
							var8 = index;
							var9 = var6;
							var10 = arg4 ? 1 : 0;
						}
						if (var6 > widths[linecount < widths.length ? linecount : widths.length - 1]) {
							if (var8 >= 0) {
								lines[linecount] = str.substring(var7, var8 + 1 - var10);
								linecount++;
								if (linecount >= lines.length) {
									return 0;
								}
								var7 = var8 + 1;
								var8 = -1;
								var6 -= var9;
								var12 = -1;
							} else {
								lines[linecount] = str.substring(var7, var18);
								linecount++;
								if (linecount >= lines.length) {
									return 0;
								}
								var7 = var18;
								var8 = -1;
								var6 = var17;
								var12 = -1;
							}
						}
						if (c == 45) {
							var8 = index;
							var9 = var6;
							var10 = 0;
						}
					}
				}
			}
		}
		if (str.length() > var7) {
			lines[linecount] = str.substring(var7, str.length());
			linecount++;
		}
		return linecount;
	}

    public int parawidth(String str, int width, FontGlyph[] glyphs) {
		int lineCount = this.splitInit(str, new int[] { width }, stringBuilder, glyphs);
		int parawidth = 0;
		for (int index = 0; index < lineCount; index++) {
			int lineWidth = this.stringWidth(stringBuilder[index], glyphs);
			if (lineWidth > parawidth) {
				parawidth = lineWidth;
			}
		}
		return parawidth;
	}

    public int paraheight(String str, int width, FontGlyph[] glyphs) {
		return this.splitInit(str, new int[] { width }, stringBuilder, glyphs);
	}

    public String paraline(String str, int width, FontGlyph[] glyphs, int pos) {
		int lineCount = this.splitInit(str, new int[] { width }, stringBuilder, glyphs);
		return pos >= 0 && pos < lineCount ? stringBuilder[pos] : null;
	}

    public int paraheight(String str, int width, int height, FontGlyph[] glyphs) {
		if (height == 0) {
			height = this.field8566;
		}
		int lineCount = this.splitInit(str, new int[] { width }, stringBuilder, glyphs);
		int lineHeight = (lineCount - 1) * height;
		return this.field8569 + this.field8562 + lineHeight;
	}

    public Point getCharPosAtIndex(String str, int width, int height, int index, FontGlyph[] glyphs) {
		if (index <= 0) {
			return new Point(0, this.field8562 + height);
		}
		if (index > str.length()) {
			index = str.length();
		}
		if (height == 0) {
			height = this.field8566;
		}
		int split = this.splitInit(str, new int[] { width }, stringBuilder, glyphs, false);
		int pos = 0;
		for (int s = 0; s < split; s++) {
			int lineLength = stringBuilder[s].length();
			if (pos + lineLength > index || split - 1 == s && index == str.length()) {
				String line = str.substring(pos, index);
				if (line.endsWith("<br>")) {
					line = "";
					int var10000 = pos + lineLength;
					s++;
				}
				int w = this.stringWidth(line, glyphs);
				int h = this.field8562 + height * s;
				return new Point(w, h);
			}
			pos += lineLength;
		}
		return null;
	}

    public int getCharIndexAtPos(String str, int width, int height, int arg3, int pos, FontGlyph[] arg5) {
		if (height == 0) {
			height = this.field8566;
		}
		int split = this.splitInit(str, new int[] { width }, stringBuilder, arg5, false);
		if (split == 0) {
			return 0;
		}
		if (pos < 0) {
			pos = 0;
		}
		int l = pos / height;
		if (l >= split) {
			l = split - 1;
		}
		String line = stringBuilder[l];
		int charIndex = 0;
		int var11 = 0;
		int var12;
		for (var12 = 0; var12 < arg3 && charIndex < line.length(); var12 = this.stringWidth(line.substring(0, charIndex), arg5)) {
			var11 = var12;
			charIndex++;
		}
		if (charIndex == line.length() && line.endsWith("<br>")) {
			charIndex -= 4;
		}
		if (arg3 - var11 < var12 - arg3) {
			charIndex--;
		}
		for (int index = 0; index < l; index++) {
			charIndex += stringBuilder[index].length();
		}
		return charIndex;
	}
}
