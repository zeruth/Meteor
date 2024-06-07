package com.jagex.game.load;

import com.jagex.core.utils.JagException;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.PreciseSleep;
import com.jagex.game.client.GameShell;
import com.jagex.game.client.PreLoadingScreen;
import com.jagex.graphics.FrameBuffer;
import com.jagex.graphics.RendererException;
import com.jagex.graphics.Sprite;

import rs2.client.Client;

public class LoadingScreenRenderer implements Runnable {

    public volatile boolean field2890;

    public boolean field2887;

    public LoadingScreen field2883 = new PreLoadingScreen();

    public LoadingScreen field2880 = null;

    public long field2884;

    public int field2885;

    public long field2886;

    public String field2882;

    public String field2888;

    public int field2881;

    public LoadingStage field2889;

    public int method4846() {
		return this.field2885;
	}

    public synchronized void method4845() {
		this.field2887 = true;
	}

    public synchronized boolean method4857() {
		return this.field2883.method4894(this.field2884);
	}

    public synchronized void method4879(LoadingScreen arg0) {
		this.field2880 = this.field2883;
		this.field2883 = arg0;
		this.field2884 = MonotonicTime.get();
	}

    public synchronized void method4849(long arg0, String arg1, String arg2, int arg3, LoadingStage arg4) {
		this.field2886 = arg0;
		this.field2888 = arg1;
		this.field2882 = arg2;
		this.field2881 = arg3;
		this.field2889 = arg4;
	}

    public int method4874() {
		if (this.field2889 == null) {
			return 0;
		}
		int var1 = this.field2889.field2920;
		if (this.field2889.field2926 && this.field2881 < this.field2889.field2924) {
			return this.field2881 + 1;
		} else if (var1 >= 0 && var1 < Loading.field2938.length - 1) {
			return this.field2889.field2923 == this.field2881 ? this.field2889.field2924 : this.field2889.field2923;
		} else {
			return 100;
		}
	}

    public int method4851() {
		return this.field2881;
	}

    public String method4852() {
		return this.field2882;
	}

    public String method4853() {
		return this.field2888;
	}

    public long method4872() {
		return this.field2886;
	}

    public LoadingStage method4855() {
		return this.field2889;
	}

    public void method4856() {
		this.field2890 = true;
	}

	public void run() {
		while (!this.field2890) {
			long var1 = MonotonicTime.get();
			synchronized (this) {
				try {
					this.field2885++;
					if (this.field2883 instanceof PreLoadingScreen) {
						this.field2883.method4888(this.field2887);
					} else {
						long var4 = MonotonicTime.get();
						if (Client.toolkit == null || this.field2880 == null || this.field2880.method4895() == 0 || this.field2884 < var4 - (long) this.field2880.method4895()) {
							if (this.field2880 != null) {
								this.field2887 = true;
								this.field2880.method4891();
								this.field2880 = null;
							}
							if (this.field2887) {
								Client.method8024();
								if (Client.toolkit != null) {
									Client.toolkit.method2475(1, 0);
								}
							}
							this.field2883.method4888(this.field2887 || Client.toolkit != null && Client.toolkit.method2123());
						} else {
							int var6 = (int) ((var4 - this.field2884) * 255L / (long) this.field2880.method4895());
							int var7 = 255 - var6;
							int var8 = var6 << 24 | 0xFFFFFF;
							int var9 = var7 << 24 | 0xFFFFFF;
							Client.method8024();
							Client.toolkit.method2475(1, 0);
							Sprite var10 = Client.toolkit.createSprite(GameShell.canvasWid, GameShell.canvasHei, true);
							FrameBuffer var11 = Client.toolkit.createFramebuffer();
							var11.method15439(0, var10.method1437());
							Client.toolkit.method2142(var11);
							this.field2880.method4888(true);
							Client.toolkit.method2143(var11);
							var10.drawSprite(0, 0, 0, var9, 1);
							Client.toolkit.method2142(var11);
							Client.toolkit.method2475(1, 0);
							this.field2883.method4888(true);
							Client.toolkit.method2143(var11);
							var10.drawSprite(0, 0, 0, var8, 1);
						}
						try {
							if (Client.toolkit != null && !(this.field2883 instanceof PreLoadingScreen)) {
								Client.toolkit.method2115();
							}
						} catch (RendererException var18) {
							JagException.report(var18.getMessage() + Client.field8301.method8038(), var18);
							Client.setToolkit(0, true);
						}
					}
					this.field2887 = false;
					if (Client.toolkit != null && !(this.field2883 instanceof PreLoadingScreen) && this.field2889.field2920 < LoadingStage.field2917.field2920) {
						Client.method3033();
					}
				} catch (Exception var19) {
					continue;
				}
			}
			long var15 = MonotonicTime.get();
			int var17 = (int) (20L - (var15 - var1));
			if (var17 > 0) {
				PreciseSleep.sleep((long) var17);
			}
		}
	}
}
