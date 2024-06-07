package com.jagex.graphics.gl;

import com.jagex.core.datastruct.Heap;
import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.ColourUtils;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.PreciseSleep;
import com.jagex.core.utils.StringTools;
import com.jagex.game.client.DataType;
import com.jagex.game.client.NativeLibraries;
import com.jagex.game.client.NativeLibraryConfig;
import com.jagex.game.client.ScreenBoundingBox;
import com.jagex.game.config.BillboardTypeList;
import com.jagex.game.config.ParticleEffectorTypeList;
import com.jagex.game.config.ParticleEmitterTypeList;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.*;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.particles.ParticleList;
import com.jagex.math.*;
import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import sun.misc.Unsafe;

import java.awt.*;
import java.lang.reflect.Field;

public class GlToolkit extends Toolkit {

	public static final boolean ALLOW_MICROSOFT = true; // microsoft support is better now!

    public OpenGL field10022;

    public int field9967;

    public final GlRelated2 field10026;

    public GlEffectList field10023;

    public GlPostProcessing field9986;

    public GlColourGradingBloomFilter field9864;

    public GlLevelsFilter field9865;

    public GlColourRemappingFilter field9853;

    public GlToolkitRelated field9978 = new GlToolkitRelated();

    public Matrix4x4 field9866 = new Matrix4x4();

    public Matrix4x4 field9842 = new Matrix4x4();

    public Matrix4x3 field9900 = new Matrix4x3();

    public GlEffectRelated1 field9871;

    public int field9872;

    public int field9873 = 8;

    public int field9874 = 3;

    public boolean field9875 = false;

    public NativeHeap field9876;

    public LinkList field9964 = new LinkList();

    public Unsafe field9878 = null;

    public int field9879;

    public int field9880;

    public int field9881;

    public LinkList field9938 = new LinkList();

    public LinkList field9883 = new LinkList();

    public LinkList field9884 = new LinkList();

    public LinkList field9885 = new LinkList();

    public LinkList field9886 = new LinkList();

    public LinkList field9838 = new LinkList();

    public LinkList field9888 = new LinkList();

    public long field9823;

    public static int[] field9890 = new int[1000];

    public int field9908;

    public int field9923;

    public int field9893;

    public boolean field9848;

    public boolean field9921;

    public int field9896;

    public boolean field9924;

    public byte field9943;

    public boolean field9899;

    public boolean field9815;

    public int field9940 = 2;

    public Matrix4x3 field9911 = new Matrix4x3();

    public Matrix4x4 field9903 = new Matrix4x4();

    public Matrix4x4 field9904 = new Matrix4x4();

    public Matrix4x4 field9939 = new Matrix4x4();

    public Matrix4x4 field9906 = new Matrix4x4();

    public Matrix4x4 field10005 = new Matrix4x4();

    public float[][] field10015 = new float[6][4];

    public float[] field9857 = new float[4];

    public float field9910;

    public float field9867;

    public float field9912;

    public float field9882;

    public float field9914 = 0.0F;

    public float field9831 = 1.0F;

    public float field9916 = 0.0F;

    public float field9917 = -1.0F;

    public Matrix4x3 field9976 = new Matrix4x3();

    public Matrix4x4 field9919 = new Matrix4x4();

    public Matrix4x4 field9920 = new Matrix4x4();

    public float[] field9844 = new float[16];

    public int field9922;

    public boolean field9980 = true;

    public boolean field9950 = true;

    public int field9925 = 0;

    public int field9926 = 0;

    public int field9927 = 0;

    public int field9928 = 0;

    public int field9869 = 0;

    public int field9930 = 0;

    public int field9897;

    public int field9932;

    public int field9931;

    public int field9934;

    public static int field9935 = 4;

    public boolean field9936;

    public boolean field9937;

    public float[] field9951 = new float[4];

    public float[] field9895 = new float[4];

    public float[] field9870 = new float[4];

    public float[] field9941 = new float[4];

    public int field9942 = -1;

    public float field9863 = 1.0F;

    public float field9944 = 1.0F;

    public float field9945 = 1.0F;

    public float field9946;

    public float field9947 = -1.0F;

    public float field9948 = -1.0F;

    public Light[] field9949 = new Light[field9935];

    public int field9909;

    public int field9898;

    public int field9915;

    public int field9953;

    public boolean field9954;

    public int field9955 = -1;

    public int field9956 = -1;

    public int field9957 = 0;

    public float field9830;

    public float field9829;

    public float field9960 = 1.0F;

    public float field9961 = 0.0F;

    public boolean field9840;

    public boolean field9963 = false;

    public int field10028;

    public WaterFogData field9892;

    public GlBinding field9966;

    public GlInterfaceRelated field9852;

    public int field9968;

    public int field9969 = 8448;

    public int field9970 = 8448;

    public boolean field9958;

    public int field10018;

    public GlTexture[] field9973;

    public GlTexture_Sub1 field9974;

    public GlEnvironmentSampler field9887;

    public String field9996;

    public String field9977;

    public boolean isAmd;

    public int field9979;

    public boolean field10017;

    public boolean field9981;

    public int field9982;

    public int field9929;

    public int field9984;

    public boolean field9985;

    public boolean field9901;

    public boolean field9987;

    public boolean field9988;

    public boolean field9989;

    public boolean field9990;

    public boolean field9991;

    public boolean field9992;

    public boolean field9889;

    public boolean field9952;

    public boolean field9995;

    public boolean field9965;

    public boolean field9997;

    public boolean field9998;

    public boolean field9999;

    public boolean field10000;

    public boolean field10001;

    public boolean field10002;

    public boolean field10003;

    public boolean field10004;

    public final int field9862;

    public float field9983 = -1.0F;

    public float field10007 = -1.0F;

    public GlModel[] field10008 = new GlModel[8];

    public GlModel[] field10009 = new GlModel[8];

    public GlFrameBuffer field9877;

    public GlRelated3 field9918;

    public GlRelated3 field10012;

    public GlInterfaceRelated field10013;

    public static final float[] field10014 = new float[4];

    public static final float[] field9894 = new float[4];

    public GpuPacket field10016 = new GpuPacket(8192);

    public int[] field9993 = new int[1];

    public int[] field9913 = new int[1];

    public int[] field10019 = new int[1];

    public final byte[] field10020 = new byte[16384];

    public Sprite field9854 = null;

    public Sprite field9975 = null;

    public FrameBuffer field10024 = null;

    public int[] field10025 = new int[3];

    public long[] field9959 = new long[3];

    public int[] field9902 = new int[3];

    public int field9891 = 0;

    public int field10029 = 0;

	public GlToolkit(Canvas arg0, MaterialList arg1, TextureList arg2, BillboardTypeList arg3, ParticleEmitterTypeList arg4, ParticleEffectorTypeList arg5, int arg6) {
		super(arg1, arg2, arg3, arg4, arg5);
		try {
			try {
				Field var8 = Unsafe.class.getDeclaredField("theUnsafe");
				var8.setAccessible(true);
				this.field9878 = (Unsafe) var8.get(null);
			} catch (Exception var34) {
			}
			this.field9967 = arg6;
			NativeLibraries.getLoader().load("jaclib");
			NativeLibraries.getLoader().load("jaggl");
			this.field10022 = new OpenGL();
			long var10 = this.field10022.init(arg0, 8, 8, 8, 24, 0, this.field9967);
			if (var10 == 0L) {
				throw new RuntimeException("");
			}
			this.method15727();
			int var12 = this.method15861();
			if (var12 != 0) {
				throw new RuntimeException("");
			}
			if (this.field9981 && this.field9985) {
				String var13 = System.getProperty("java.version");
				int var14 = var13.indexOf(95);
				if (var14 > -1) {
					var13 = var13.substring(0, var14);
				}
				int var15 = var13.indexOf(46);
				if (var15 > -1) {
					int var16 = var13.indexOf(46, var15 + 1);
					if (var16 > -1) {
						var13 = var13.substring(0, var16);
					}
				}
				try {
					int var17 = (int) (Float.parseFloat(var13) * 100.0F);
					if (var17 >= 170) {
						this.field9985 = false;
						this.field9988 = false;
						this.field9989 = false;
					}
				} catch (NumberFormatException var33) {
					this.field9985 = false;
					this.field9988 = false;
					this.field9989 = false;
				}
			}

			this.field9862 = this.field10017 ? 33639 : 5121;
			this.isAmd = this.field9977.indexOf("radeon") != -1;
			boolean isIntel = this.field9996.indexOf("intel") != -1;
			boolean var20 = false;
			boolean var21 = false;

			int model = 0;
			if (this.isAmd || isIntel) {
				String[] parts = StringTools.split(this.field9977.replace('/', ' '), ' ');
				for (int i = 0; i < parts.length; i++) {
					String part = parts[i];
					try {
						if (part.length() > 0) {
							if (part.charAt(0) == 'x' && part.length() >= 3 && StringTools.method9836(part.substring(1, 3))) {
								part = part.substring(1);
								var21 = true;
							}

							if (part.equals("hd")) {
								var20 = true;
							} else if (part.equals("xe")) {
								// modern intel graphics
								var20 = true;
							} else {
								if (part.startsWith("hd")) {
									part = part.substring(2);
									var20 = true;
								}

								if (part.length() >= 4 && StringTools.method9836(part.substring(0, 4))) {
									model = StringTools.parseInt(part.substring(0, 4));
									break;
								}
							}
						}
					} catch (Exception ignored) {
					}
				}
			}

			if (this.field9967 != 0 && isIntel && !var20) {
				throw new GlException("");
			}

			if (this.isAmd || isIntel) {
				if (!isIntel) {
					if (!var21 && !var20) {
						if (model >= 7000 && model <= 7999) {
							this.field9990 = false;
						}

						if (model >= 7000 && model <= 9250) {
							this.field9889 = false;
						}
					}

					if (!var20 || model < 4000) {
						this.field9997 = false;
					}

					this.field9965 &= this.field10022.method0("GL_ARB_half_float_pixel");
					this.field9991 = this.field9990;
				} else if (!var20) {
					this.field9985 = false;
					this.field9988 = false;
					this.field9989 = false;
				}
			}

			this.field10003 = !this.field9996.equals("s3 graphics");
			if (this.field9990) {
				try {
					int[] var27 = new int[1];
					OpenGL.glGenBuffersARB(1, var27, 0);
				} catch (Throwable var32) {
					throw new RuntimeException("");
				}
			}

			ColourUtils.method10156(false, true);
			this.field9875 = true;
			this.field10026 = new GlRelated2(this, this.field1596);
			this.method15728();
			this.field9871 = new GlEffectRelated1(this);
			this.field9986 = new GlPostProcessing(this);
			if (this.field9986.method1363()) {
				this.field9864 = new GlColourGradingBloomFilter(this);
				if (!this.field9864.method19235()) {
					this.field9864.method17570();
					this.field9864 = null;
				}
				this.field9865 = new GlLevelsFilter(this);
				if (!this.field9865.method19231()) {
					this.field9865.method17570();
					this.field9865 = null;
				}
				this.field9853 = new GlColourRemappingFilter(this);
				if (!this.field9853.method19234()) {
					this.field9853.method17570();
					this.field9853 = null;
				}
			} else {
				this.field9986.method1375();
				this.field9986 = null;
			}
			this.method2138(arg0, new GlSurface(this, arg0, var10));
			this.method2140(arg0);
			if (this.field9981) {
				int var29 = arg0.getLocation().x;
				int var30 = arg0.getLocation().y;
				arg0.setLocation(var29 + 1, var30);
				arg0.setLocation(var29, var30);
			}
			this.field10023 = new GlEffectList(this);
			this.method15814();
			this.method2150();
			if (this.field9986 != null) {
				this.method15762();
				this.method15803();
			}
		} catch (Throwable var36) {
			var36.printStackTrace();
			this.dispose();
			if (var36 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) var36;
			} else if (var36 instanceof GlException) {
				throw (GlException) var36;
			} else {
				throw new RuntimeException("");
			}
		}
	}

    public void method15727() {
		int var1 = 0;
		while (!this.field10022.method1()) {
			if (var1++ > 5) {
				throw new RuntimeException("");
			}
			PreciseSleep.sleep(1000L);
		}
	}

    public int method15861() {
		int var1 = 0;
		this.field9996 = OpenGL.glGetString(7936).toLowerCase();
		this.field9977 = OpenGL.glGetString(7937).toLowerCase();
		if (!GlToolkit.ALLOW_MICROSOFT && this.field9996.indexOf("microsoft") != -1) {
			var1 |= 0x1;
		}
		if (this.field9996.indexOf("brian paul") != -1 || this.field9996.indexOf("mesa") != -1) {
			var1 |= 0x1;
		}
		String var2 = OpenGL.glGetString(7938);
		String[] var3 = StringTools.split(var2.replace('.', ' '), ' ');
		if (var3.length >= 2) {
			try {
				int var4 = StringTools.parseInt(var3[0]);
				int var5 = StringTools.parseInt(var3[1]);
				this.field9979 = var4 * 10 + var5;
			} catch (NumberFormatException var8) {
				var1 |= 0x4;
			}
		} else {
			var1 |= 0x4;
		}
		if (this.field9979 < 12) {
			var1 |= 0x2;
		}
		if (!this.field10022.method0("GL_ARB_multitexture")) {
			var1 |= 0x8;
		}
		if (!this.field10022.method0("GL_ARB_texture_env_combine")) {
			var1 |= 0x20;
		}
		int[] var7 = new int[1];
		OpenGL.glGetIntegerv(34018, var7, 0);
		this.field9982 = var7[0];
		OpenGL.glGetIntegerv(34929, var7, 0);
		this.field9929 = var7[0];
		OpenGL.glGetIntegerv(34930, var7, 0);
		this.field9984 = var7[0];
		if (this.field9982 < 2 || this.field9929 < 2 || this.field9984 < 2) {
			var1 |= 0x10;
		}
		this.field10017 = Stream.method61();
		this.field9990 = this.field10022.method0("GL_ARB_vertex_buffer_object");
		this.field9988 = this.field10022.method0("GL_ARB_multisample");
		this.field9999 = this.field10022.method0("GL_ARB_vertex_program");
		this.field10001 = this.field10022.method0("GL_ARB_fragment_program");
		this.field10000 = this.field10022.method0("GL_ARB_vertex_shader");
		this.field10002 = this.field10022.method0("GL_ARB_fragment_shader");
		this.field9889 = this.field10022.method0("GL_EXT_texture3D");
		this.field9965 = this.field10022.method0("GL_ARB_texture_rectangle");
		this.field9952 = this.field10022.method0("GL_ARB_texture_cube_map");
		this.field9995 = this.field10022.method0("GL_ARB_seamless_cube_map");
		this.field9997 = this.field10022.method0("GL_ARB_texture_float");
		this.field9998 = this.field10022.method0("GL_ARB_texture_non_power_of_two");
		this.field9985 = this.field10022.method0("GL_EXT_framebuffer_object");
		this.field9901 = this.field10022.method0("GL_EXT_framebuffer_blit");
		this.field9987 = this.field10022.method0("GL_EXT_framebuffer_multisample");
		this.field9989 = this.field9901 & this.field9987;
		this.field10004 = this.field10022.method0("GL_EXT_blend_func_separate");
		this.field9992 = this.field9878 != null && (this.field9979 >= 32 || this.field10022.method0("GL_ARB_sync"));
		this.field9981 = NativeLibraryConfig.osName.startsWith("mac");
		OpenGL.glGetFloatv(2834, field10014, 0);
		this.field10007 = field10014[0];
		this.field9983 = field10014[1];
		return var1 == 0 ? 0 : var1;
	}

    public void method15728() {
		this.field9973 = new GlTexture[this.field9982];
		this.field9974 = new GlTexture_Sub1(this, 3553, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, 1, 1);
		new GlTexture_Sub1(this, 3553, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, 1, 1);
		new GlTexture_Sub1(this, 3553, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, 1, 1);
		for (int var1 = 0; var1 < 8; var1++) {
			this.field10008[var1] = new GlModel(this);
			this.field10009[var1] = new GlModel(this);
		}
		if (this.field9985) {
			this.field9877 = new GlFrameBuffer(this);
			new GlFrameBuffer(this);
		}
	}

    public void method15814() {
		this.method15774(-2);
		for (int var1 = this.field9982 - 1; var1 >= 0; var1--) {
			this.method15776(var1);
			this.method15777(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method15810(8448, 8448);
		this.method15780(2, 34168, 770);
		this.method15785();
		this.field9923 = 1;
		this.field9896 = 0;
		this.field9921 = true;
		if (this.field10004) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.field9893 = 1;
		this.field9943 = -1;
		this.method15794((byte) 0);
		this.field9924 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.field9943);
		if (this.field9988) {
			if (this.field9967 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.field9848 = true;
		this.method15738(true);
		this.method15764(true);
		this.method15788(true);
		this.method15789(true);
		this.method2339(0.0F, 1.0F);
		this.method15748();
		this.field10022.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method15798(this.field9940);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int var3 = 0; var3 < 8; var3++) {
			int var4 = var3 + 16384;
			OpenGL.glLightfv(var4, 4608, var2, 0);
			OpenGL.glLightf(var4, 4615, 0.0F);
			OpenGL.glLightf(var4, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.field9995) {
			OpenGL.glEnable(34895);
		}
		this.field9955 = -1;
		this.field9942 = -1;
		this.method2263();
		this.resetClip();
	}

    public RendererInfo getRendererInfo() {
		int var1 = -1;
		if (this.field9996.indexOf("nvidia") != -1) {
			var1 = 4318;
		} else if (this.field9996.indexOf("intel") != -1) {
			var1 = 32902;
		} else if (this.field9996.indexOf("ati") != -1) {
			var1 = 4098;
		}
		return new RendererInfo(var1, "OpenGL", this.field9979, this.field9977, 0L, false);
	}

    public void method2116(int arg0, int arg1) throws RendererException {
		try {
			this.surface.method15451();
		} catch (Exception var4) {
		}
		if (this.field1596 != null) {
			this.field1596.method1982();
		}
	}

    public void method2117() {
		OpenGL.glFinish();
	}

    public void method2369() {
		for (Node var1 = this.field9964.head(); var1 != null; var1 = this.field9964.next()) {
			((GlHeap) var1).method19237();
		}
		if (this.field9986 != null) {
			this.field9986.method1375();
		}
		if (this.field9875) {
			ColourUtils.method14805(false, true);
			this.field9875 = false;
		}
	}

    public boolean method2194() {
		return true;
	}

    public boolean method2123() {
		return true;
	}

    public boolean method2124() {
		return true;
	}

    public boolean isBloomSupported() {
		return this.field9864 != null && (this.field9967 <= 1 || this.field9989);
	}

    public boolean method2127() {
		return true;
	}

    public boolean supportsHardShadows() {
		return true;
	}

    public boolean supportsAntiAliasing() {
		return this.field9988 && (!this.isBloomEnabled() || this.field9989);
	}

    public boolean method2129() {
		return true;
	}

    public boolean method15730() {
		return this.field10023.method1277(3);
	}

    public boolean hasExtraDrawDistance() {
		return true;
	}

    public boolean method2240() {
		return false;
	}

    public String hardwareInfo() {
		String var1 = "Caps: 2:";
		String var2 = ":";
		String var3 = var1 + this.field9967 + var2;
		String var4 = var3 + this.field9862 + var2;
		String var5 = var4 + this.field9982 + var2;
		String var6 = var5 + this.field9929 + var2;
		String var7 = var6 + this.field9984 + var2;
		String var8 = var7 + this.field10007 + var2;
		String var9 = var8 + this.field9983 + var2;
		String var10 = var9 + (this.field10017 ? 1 : 0) + var2;
		String var11 = var10 + (this.isAmd ? 1 : 0) + var2;
		String var12 = var11 + (this.field9981 ? 1 : 0) + var2;
		String var13 = var12 + (this.field9990 ? 1 : 0) + var2;
		String var14 = var13 + (this.field9991 ? 1 : 0) + var2;
		String var15 = var14 + (this.field9988 ? 1 : 0) + var2;
		String var16 = var15 + (this.field9999 ? 1 : 0) + var2;
		String var17 = var16 + (this.field10001 ? 1 : 0) + var2;
		String var18 = var17 + (this.field10000 ? 1 : 0) + var2;
		String var19 = var18 + (this.field10002 ? 1 : 0) + var2;
		String var20 = var19 + (this.field9889 ? 1 : 0) + var2;
		String var21 = var20 + (this.field9965 ? 1 : 0) + var2;
		String var22 = var21 + (this.field9952 ? 1 : 0) + var2;
		String var23 = var22 + (this.field9995 ? 1 : 0) + var2;
		String var24 = var23 + (this.field9998 ? 1 : 0) + var2;
		String var25 = var24 + (this.field9985 ? 1 : 0) + var2;
		String var26 = var25 + (this.field9901 ? 1 : 0) + var2;
		String var27 = var26 + (this.field9987 ? 1 : 0) + var2;
		String var28 = var27 + (this.field9997 ? 1 : 0) + var2;
		String var29 = var28 + (this.field10003 ? 1 : 0) + var2;
		return var29 + (this.field10004 ? 1 : 0);
	}

    public int[] textureFormat() {
		int[] var1 = new int[1];
		OpenGL.glGetIntegerv(34466, var1, 0);
		int var2 = var1[0];
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			OpenGL.glGetIntegerv(34467, var3, 0);
			return var3;
		}
	}

    public Surface createSurface(Canvas arg0, int arg1, int arg2) {
		return new GlSurface(this, arg0);
	}

    public void method15883() {
		this.method15757();
	}

    public void method15757() {
		int var1 = this.renderTarget.getWidth();
		int var2 = this.renderTarget.getHeight();
		this.field9906.method6617(0.0F, (float) var1, 0.0F, (float) var2, -1.0F, 1.0F);
		this.method2263();
		this.method15748();
		this.resetClip();
	}

    public int[] method2149(int arg0, int arg1, int arg2, int arg3) {
		if (this.renderTarget == null) {
			return null;
		}
		int[] var5 = new int[arg2 * arg3];
		int var6 = this.renderTarget.getHeight();
		for (int var7 = 0; var7 < arg3; var7++) {
			OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field9862, var5, arg2 * var7);
		}
		return var5;
	}

    public void method2150() {
		if (!this.field10003 || this.renderTarget == null) {
			return;
		}
		int var1 = this.field9927;
		int var2 = this.field9928;
		int var3 = this.field9925;
		int var4 = this.field9926;
		this.resetClip();
		int var5 = this.field9897;
		int var6 = this.field9932;
		int var7 = this.field9931;
		int var8 = this.field9934;
		this.method2263();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method15748();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15777(null);
		this.method15774(-2);
		this.method15778(1);
		this.method15791(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.renderTarget.getWidth(), this.renderTarget.getHeight(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.resetBounds(var1, var3, var2, var4);
		this.method2164(var5, var6, var7, var8);
	}

    public boolean method2360() {
		return this.field9992;
	}

    public boolean method2196() {
		return !this.field9992 || this.field9959[this.field10029] == 0L;
	}

    public boolean method2153() {
		return true;
	}

    public boolean method2304() {
		return true;
	}

    public int method2502() {
		if (!this.field9992) {
			return -1;
		} else if (this.field9959[this.field9891] == 0L) {
			return -1;
		} else {
			int var1 = OpenGL.glClientWaitSync(this.field9959[this.field9891], 0, 0);
			if (var1 == 37149) {
				this.method2156();
				return -1;
			} else if (var1 == 37147) {
				return -1;
			} else {
				return this.field9902[this.field9891];
			}
		}
	}

    public void method2163(int arg0, int arg1, int arg2) {
		this.method2203();
		if (this.field10024 == null) {
			this.method15735(arg1, arg2);
		}
		if (this.field9854 == null) {
			this.field9854 = this.method2314(0, 0, this.renderTarget.getWidth(), this.renderTarget.getHeight(), true);
		} else {
			((GlSprite) this.field9854).method15372(0, 0, this.renderTarget.getWidth(), this.renderTarget.getHeight(), 0, 0, true);
		}
		this.method2142(this.field10024);
		this.method2475(1, -16777216);
		this.field9854.drawTintedScaled(this.field1611, this.field1618, this.field1619, this.field1610);
		OpenGL.glBindBufferARB(35051, this.field10025[this.field10029]);
		OpenGL.glReadPixelsub(0, 0, this.field1615, this.field1588, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method2143(this.field10024);
		this.field9959[this.field10029] = OpenGL.glFenceSync(37143, 0);
		this.field9902[this.field10029] = arg0;
		if (++this.field10029 >= 3) {
			this.field10029 = 0;
		}
		this.method2204();
	}

    public void method2156() {
		for (int var1 = 0; var1 < 3; var1++) {
			if (this.field9959[var1] != 0L) {
				OpenGL.glDeleteSync(this.field9959[var1]);
				this.field9959[var1] = 0L;
			}
		}
		this.field10029 = 0;
		this.field9891 = 0;
	}

    public long method2158(int arg0, int arg1) {
		return this.method15733(arg0, arg1, null, null);
	}

    public void method2160(int arg0, int arg1, int[] arg2, int[] arg3) {
		this.method15733(arg0, arg1, arg2, arg3);
	}

    public long method15733(int arg0, int arg1, int[] arg2, int[] arg3) {
		if (!this.field9992) {
			if (this.field9975 == null) {
				this.method15735(arg0, arg1);
			}
			if (this.field9854 == null) {
				this.field9854 = this.method2314(0, 0, this.renderTarget.getWidth(), this.renderTarget.getHeight(), true);
			} else {
				((GlSprite) this.field9854).method15372(0, 0, this.renderTarget.getWidth(), this.renderTarget.getHeight(), 0, 0, true);
			}
			this.method2142(this.field10024);
			this.method2475(1, -16777216);
			this.field9854.drawTintedScaled(this.field1611, this.field1618, this.field1619, this.field1610);
			this.field9975.download(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method2143(this.field10024);
			return 0L;
		}
		if (this.field9959[this.field9891] != 0L) {
			OpenGL.glDeleteSync(this.field9959[this.field9891]);
			this.field9959[this.field9891] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.field10025[this.field9891]);
		long var5 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			int var7 = 0;
			for (int var8 = arg1 - 1; var8 >= 0; var8--) {
				for (int var9 = 0; var9 < arg0; var9++) {
					arg2[var7++] = this.field9878.getInt((long) ((arg0 * var8 + var9) * 4) + var5);
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			var5 = 0L;
		}
		if (++this.field9891 >= 3) {
			this.field9891 = 0;
		}
		return var5;
	}

    public void method2159(long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

    public void method2126() {
		if (!this.field9992) {
			this.field10024 = null;
			this.field9975 = null;
			this.field9854 = null;
			return;
		}
		this.field9854 = null;
		if (this.field10024 != null) {
			this.field10024.method1629();
			this.field10024 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.field10025, 0);
		for (int var1 = 0; var1 < 3; var1++) {
			this.field10025[var1] = 0;
			if (this.field9959[var1] != 0L) {
				OpenGL.glDeleteSync(this.field9959[var1]);
				this.field9959[var1] = 0L;
			}
		}
	}

    public void method15735(int arg0, int arg1) {
		this.method2126();
		this.method2419(arg0, arg1);
		if (!this.field9992) {
			this.field9975 = this.createSprite(arg0, arg1, true, true);
			this.field10024 = this.createFramebuffer();
			this.field10024.method15439(0, this.field9975.method1437());
			return;
		}
		this.field9975 = this.createSprite(arg0, arg1, true, true);
		this.field10024 = this.createFramebuffer();
		this.field10024.method15439(0, this.field9975.method1437());
		OpenGL.glGenBuffersARB(3, this.field10025, 0);
		for (int var3 = 0; var3 < 3; var3++) {
			OpenGL.glBindBufferARB(35051, this.field10025[var3]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

    public void method2475(int arg0, int arg1) {
		int var3 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			var3 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method15789(true);
			var3 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			var3 |= 0x400;
		}
		OpenGL.glClear(var3);
	}

    public void drawRectangle(int x, int y, int width, int height, int rgb, int arg5) {
		float var7 = (float) x + 0.35F;
		float var8 = (float) y + 0.35F;
		float var9 = (float) width + var7 - 1.0F;
		float var10 = (float) height + var8 - 1.0F;
		this.method15771();
		this.method15791(arg5);
		OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
		if (this.field9988) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(var7, var8);
		OpenGL.glVertex2f(var7, var10);
		OpenGL.glVertex2f(var9, var10);
		OpenGL.glVertex2f(var9, var8);
		OpenGL.glEnd();
		if (this.field9988) {
			OpenGL.glEnable(32925);
		}
	}

    public void fillRectangle(int x, int y, int width, int height, int rgb, int arg5) {
		float var7 = (float) x + 0.35F;
		float var8 = (float) y + 0.35F;
		float var9 = (float) width + var7;
		float var10 = (float) height + var8;
		this.method15771();
		this.method15791(arg5);
		OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
		if (this.field9988) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(var7, var8);
		OpenGL.glVertex2f(var7, var10);
		OpenGL.glVertex2f(var9, var10);
		OpenGL.glVertex2f(var9, var8);
		OpenGL.glEnd();
		if (this.field9988) {
			OpenGL.glEnable(32925);
		}
	}

    public void method2552(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		this.method15771();
		this.method15791(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

    public void method2182(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.field9927 || arg0 - arg2 > this.field9928 || arg1 + arg2 < this.field9925 || arg1 - arg2 > this.field9926) {
			return;
		}
		this.method15771();
		this.method15791(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		float var6 = (float) arg0 + 0.35F;
		float var7 = (float) arg1 + 0.35F;
		int var8 = arg2 << 1;
		if ((float) var8 < this.field10007) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
			OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
			OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
			OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) var8 <= this.field9983) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) var8);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(var6, var7);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(var6, var7);
			int var9 = 262144 / (arg2 * 6);
			if (var9 <= 64) {
				var9 = 64;
			} else if (var9 > 512) {
				var9 = 512;
			}
			int var10 = IntMath.method3082(var9);
			OpenGL.glVertex2f((float) arg2 + var6, var7);
			for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
				OpenGL.glVertex2f(GlTrig.cos[var11] * (float) arg2 + var6, GlTrig.sin[var11] * (float) arg2 + var7);
			}
			OpenGL.glVertex2f((float) arg2 + var6, var7);
			OpenGL.glEnd();
		}
	}

    public void drawHorizontalLine(int x, int y, int width, int rgb, int arg4) {
		this.method15771();
		this.method15791(arg4);
		float var6 = (float) x + 0.35F;
		float var7 = (float) y + 0.35F;
		OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(var6, var7);
		OpenGL.glVertex2f((float) width + var6, var7);
		OpenGL.glEnd();
	}

    public void drawVerticalLine(int x1, int y1, int x2, int y2, int arg4) {
		this.method15771();
		this.method15791(arg4);
		float var6 = (float) x1 + 0.35F;
		float var7 = (float) y1 + 0.35F;
		OpenGL.glColor4ub((byte) (y2 >> 16), (byte) (y2 >> 8), (byte) y2, (byte) (y2 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(var6, var7);
		OpenGL.glVertex2f(var6, (float) x2 + var7);
		OpenGL.glEnd();
	}

    public void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5) {
		this.method15771();
		this.method15791(arg5);
		float var7 = (float) x2 - (float) x1;
		float var8 = (float) y2 - (float) y1;
		float var9;
		if (var7 == 0.0F && var8 == 0.0F) {
			var9 = 1.0F;
		} else {
			float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
			var9 = var7 * var10;
			var8 *= var10;
		}
		OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) x1 + 0.35F, (float) y1 + 0.35F);
		OpenGL.glVertex2f((float) x2 + var9 + 0.35F, (float) y2 + var8 + 0.35F);
		OpenGL.glEnd();
	}

    public void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method15771();
		this.method15791(arg5);
		float var10 = (float) arg2 - (float) arg0;
		float var11 = (float) arg3 - (float) arg1;
		float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
		float var13 = var10 * var12;
		float var14 = var11 * var12;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		int var15 = arg8 % (arg6 + arg7);
		float var16 = (float) arg6 * var13;
		float var17 = (float) arg6 * var14;
		float var18 = 0.0F;
		float var19 = 0.0F;
		float var20 = var16;
		float var21 = var17;
		if (var15 > arg6) {
			var18 = (float) (arg6 + arg7 - var15) * var13;
			var19 = (float) (arg6 + arg7 - var15) * var14;
		} else {
			var20 = (float) (arg6 - var15) * var13;
			var21 = (float) (arg6 - var15) * var14;
		}
		float var22 = (float) arg0 + 0.35F + var18;
		float var23 = (float) arg1 + 0.35F + var19;
		float var24 = (float) arg7 * var13;
		float var25 = (float) arg7 * var14;
		while (true) {
			if (arg2 > arg0) {
				if (var22 > (float) arg2 + 0.35F) {
					break;
				}
				if (var20 + var22 > (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			} else {
				if (var22 < (float) arg2 + 0.35F) {
					break;
				}
				if (var20 + var22 < (float) arg2) {
					var20 = (float) arg2 - var22;
				}
			}
			if (arg3 > arg1) {
				if (var23 > (float) arg3 + 0.35F) {
					break;
				}
				if (var21 + var23 > (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			} else {
				if (var23 < (float) arg3 + 0.35F) {
					break;
				}
				if (var21 + var23 < (float) arg3) {
					var21 = (float) arg3 - var23;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(var22, var23);
			OpenGL.glVertex2f(var20 + var22, var21 + var23);
			OpenGL.glEnd();
			var22 += var20 + var24;
			var23 += var21 + var25;
			var20 = var16;
			var21 = var17;
		}
	}

    public void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8) {
		GlSpriteRelated var10 = (GlSpriteRelated) arg6;
		GlTexture_Sub1_Sub1 var11 = var10.field9416;
		this.method15772();
		this.method15777(var10.field9416);
		this.method15791(arg5);
		this.method15810(7681, 8448);
		this.method15780(0, 34167, 768);
		float var12 = var11.field11901 / (float) var11.field11900;
		float var13 = var11.field11898 / (float) var11.field11902;
		float var14 = (float) arg2 - (float) arg0;
		float var15 = (float) arg3 - (float) arg1;
		float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
		float var17 = var14 * var16;
		float var18 = var15 * var16;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
		OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
		OpenGL.glEnd();
		this.method15780(0, 5890, 768);
	}

    public void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, SpriteRelated arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		GlSpriteRelated var13 = (GlSpriteRelated) arg6;
		GlTexture_Sub1_Sub1 var14 = var13.field9416;
		this.method15772();
		this.method15777(var13.field9416);
		this.method15791(arg5);
		this.method15810(7681, 8448);
		this.method15780(0, 34167, 768);
		float var15 = var14.field11901 / (float) var14.field11900;
		float var16 = var14.field11898 / (float) var14.field11902;
		float var17 = (float) arg2 - (float) arg0;
		float var18 = (float) arg3 - (float) arg1;
		float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
		float var20 = var17 * var19;
		float var21 = var18 * var19;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		int var22 = arg11 % (arg9 + arg10);
		float var23 = (float) arg9 * var20;
		float var24 = (float) arg9 * var21;
		float var25 = 0.0F;
		float var26 = 0.0F;
		float var27 = var23;
		float var28 = var24;
		if (var22 > arg9) {
			var25 = (float) (arg9 + arg10 - var22) * var20;
			var26 = (float) (arg9 + arg10 - var22) * var21;
		} else {
			var27 = (float) (arg9 - var22) * var20;
			var28 = (float) (arg9 - var22) * var21;
		}
		float var29 = (float) arg0 + 0.35F + var25;
		float var30 = (float) arg1 + 0.35F + var26;
		float var31 = (float) arg10 * var20;
		float var32 = (float) arg10 * var21;
		while (true) {
			if (arg2 > arg0) {
				if (var29 > (float) arg2 + 0.35F) {
					break;
				}
				if (var27 + var29 > (float) arg2) {
					var27 = (float) arg2 - var29;
				}
			} else {
				if (var29 < (float) arg2 + 0.35F) {
					break;
				}
				if (var27 + var29 < (float) arg2) {
					var27 = (float) arg2 - var29;
				}
			}
			if (arg3 > arg1) {
				if (var30 > (float) arg3 + 0.35F) {
					break;
				}
				if (var28 + var30 > (float) arg3) {
					var28 = (float) arg3 - var30;
				}
			} else {
				if (var30 < (float) arg3 + 0.35F) {
					break;
				}
				if (var28 + var30 < (float) arg3) {
					var28 = (float) arg3 - var30;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
			OpenGL.glVertex2f(var29, var30);
			OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
			OpenGL.glVertex2f(var27 + var29, var28 + var30);
			OpenGL.glEnd();
			var29 += var27 + var31;
			var30 += var28 + var32;
			var27 = var23;
			var28 = var24;
		}
		this.method15780(0, 5890, 768);
	}

    public void drawLine(int x1, int y1, int x2, int y2, int rgb, int arg5, int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.drawLine(x1, y1, x2, y2, rgb, arg6);
		OpenGL.glLineWidth(1.0F);
	}

    public void method2525(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field10005.entries[11] * arg2 + this.field10005.entries[7] * arg1 + this.field10005.entries[3] * arg0 + this.field10005.entries[15];
		float var6 = this.field10005.entries[8] * arg2 + this.field10005.entries[4] * arg1 + this.field10005.entries[0] * arg0 + this.field10005.entries[12];
		float var7 = this.field10005.entries[9] * arg2 + this.field10005.entries[5] * arg1 + this.field10005.entries[1] * arg0 + this.field10005.entries[13];
		float var8 = this.field9903.entries[10] * arg2 + this.field9903.entries[6] * arg1 + this.field9903.entries[2] * arg0 + this.field9903.entries[14];
		arg3[0] = this.field9867 * var6 / var5 + this.field9910;
		arg3[1] = this.field9882 * var7 / var5 + this.field9912;
		arg3[2] = var8;
	}

    public void method2507(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field10005.entries[10] * arg2 + this.field10005.entries[6] * arg1 + this.field10005.entries[2] * arg0 + this.field10005.entries[14];
		float var6 = this.field10005.entries[11] * arg2 + this.field10005.entries[7] * arg1 + this.field10005.entries[3] * arg0 + this.field10005.entries[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field10005.entries[8] * arg2 + this.field10005.entries[4] * arg1 + this.field10005.entries[0] * arg0 + this.field10005.entries[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field10005.entries[9] * arg2 + this.field10005.entries[5] * arg1 + this.field10005.entries[1] * arg0 + this.field10005.entries[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field9903.entries[10] * arg2 + this.field9903.entries[6] * arg1 + this.field9903.entries[2] * arg0 + this.field9903.entries[14];
			arg3[0] = this.field9867 * var7 / var6 + this.field9910;
			arg3[1] = this.field9882 * var8 / var6 + this.field9912;
			arg3[2] = var9;
		}
	}

    public int method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field10005.entries[10] * (float) arg2 + this.field10005.entries[6] * (float) arg1 + this.field10005.entries[2] * (float) arg0 + this.field10005.entries[14];
		float var9 = this.field10005.entries[10] * (float) arg5 + this.field10005.entries[6] * (float) arg4 + this.field10005.entries[2] * (float) arg3 + this.field10005.entries[14];
		float var10 = this.field10005.entries[11] * (float) arg2 + this.field10005.entries[7] * (float) arg1 + this.field10005.entries[3] * (float) arg0 + this.field10005.entries[15];
		float var11 = this.field10005.entries[11] * (float) arg5 + this.field10005.entries[7] * (float) arg4 + this.field10005.entries[3] * (float) arg3 + this.field10005.entries[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field10005.entries[8] * (float) arg2 + this.field10005.entries[4] * (float) arg1 + this.field10005.entries[0] * (float) arg0 + this.field10005.entries[12];
		float var13 = this.field10005.entries[8] * (float) arg5 + this.field10005.entries[4] * (float) arg4 + this.field10005.entries[0] * (float) arg3 + this.field10005.entries[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field10005.entries[9] * (float) arg2 + this.field10005.entries[5] * (float) arg1 + this.field10005.entries[1] * (float) arg0 + this.field10005.entries[13];
		float var15 = this.field10005.entries[9] * (float) arg5 + this.field10005.entries[5] * (float) arg4 + this.field10005.entries[1] * (float) arg3 + this.field10005.entries[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

    public boolean pick(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, Cuboid arg5) {
		Matrix4x4 var7 = this.field9919;
		var7.setToMatrix4x3(arg4);
		var7.multiply(this.field10005);
		return arg5.pick(arg0, arg1, arg2, arg3, var7, this.field9910, this.field9912, this.field9867, this.field9882);
	}

    public void method2193(Matrix4x3 arg0, ScreenBoundingBox arg1, Cuboid arg2) {
		Matrix4x4 var4 = this.field9919;
		var4.setToMatrix4x3(arg0);
		var4.multiply(this.field10005);
		arg1.method2746(arg2, this.field9939, var4, this.field9910, this.field9912, this.field9867, this.field9882);
	}

    public Heap createHeap(int arg0) {
		GlHeap var2 = new GlHeap(arg0);
		this.field9964.addTail(var2);
		return var2;
	}

    public void setBufferHeap(Heap arg0) {
		this.field9876 = ((GlHeap) arg0).field12207;
		if (this.field10013 != null) {
			return;
		}
		GpuPacket var2 = new GpuPacket(80);
		if (this.field10017) {
			var2.method19550(-1.0F);
			var2.method19550(-1.0F);
			var2.method19550(0.0F);
			var2.method19550(0.0F);
			var2.method19550(0.0F);
			var2.method19550(-1.0F);
			var2.method19550(1.0F);
			var2.method19550(0.0F);
			var2.method19550(0.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(0.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(1.0F);
			var2.method19550(-1.0F);
			var2.method19550(0.0F);
			var2.method19550(1.0F);
			var2.method19550(0.0F);
		} else {
			var2.method19553(-1.0F);
			var2.method19553(-1.0F);
			var2.method19553(0.0F);
			var2.method19553(0.0F);
			var2.method19553(0.0F);
			var2.method19553(-1.0F);
			var2.method19553(1.0F);
			var2.method19553(0.0F);
			var2.method19553(0.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(0.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(1.0F);
			var2.method19553(-1.0F);
			var2.method19553(0.0F);
			var2.method19553(1.0F);
			var2.method19553(0.0F);
		}
		this.field10013 = this.method15767(20, var2.data, var2.pos, false);
		this.field9918 = new GlRelated3(this.field10013, 5126, 3, 0);
		this.field10012 = new GlRelated3(this.field10013, 5126, 2, 12);
		this.field9978.method1323(this);
	}

    public Sprite createSprite(int arg0, int arg1, boolean arg2, boolean arg3) {
		return new GlSprite(this, arg0, arg1, arg2);
	}

    public Sprite createSprite(SpriteData arg0, boolean arg1) {
		int[] var3 = arg0.method2604(false);
		Sprite var4 = this.createSprite(var3, 0, arg0.getWidth(), arg0.getWidth(), arg0.getHeight());
		var4.setPadding(arg0.getPaddingLeft(), arg0.getPaddingTop(), arg0.getPaddingRight(), arg0.getPaddingBottom());
		return var4;
	}

    public Sprite createSprite(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return new GlSprite(this, arg3, arg4, arg0, arg1, arg2);
	}

    public Sprite method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		return new GlSprite(this, arg0, arg1, arg2, arg3);
	}

    public SpriteRelated method2205(int arg0, int arg1, int[] arg2, int[] arg3) {
		return GlSpriteRelated.method15384(this, arg0, arg1, arg2, arg3);
	}

    public void method2206(int arg0, SpriteRelated arg1, int arg2, int arg3) {
		GlSpriteRelated var5 = (GlSpriteRelated) arg1;
		GlTexture_Sub1_Sub1 var6 = var5.field9416;
		this.method15772();
		this.method15777(var5.field9416);
		this.method15791(1);
		this.method15810(7681, 8448);
		this.method15780(0, 34167, 768);
		float var7 = var6.field11901 / (float) var6.field11900;
		float var8 = var6.field11898 / (float) var6.field11902;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.field9927 - arg2) * var7, (float) (this.field9925 - arg3) * var8);
		OpenGL.glVertex2i(this.field9927, this.field9925);
		OpenGL.glTexCoord2f((float) (this.field9927 - arg2) * var7, (float) (this.field9926 - arg3) * var8);
		OpenGL.glVertex2i(this.field9927, this.field9926);
		OpenGL.glTexCoord2f((float) (this.field9928 - arg2) * var7, (float) (this.field9926 - arg3) * var8);
		OpenGL.glVertex2i(this.field9928, this.field9926);
		OpenGL.glTexCoord2f((float) (this.field9928 - arg2) * var7, (float) (this.field9925 - arg3) * var8);
		OpenGL.glVertex2i(this.field9928, this.field9925);
		OpenGL.glEnd();
		this.method15780(0, 5890, 768);
	}

    public com.jagex.graphics.Font createFont(FontMetrics arg0, SpriteData arg1, boolean arg2) {
		return new GlFont(this, arg0, arg1, arg2);
	}

    public void setVertexCapacity(int arg0) {
	}

    public Model createModel(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			return new GlModel(this, arg0, arg1, arg3, arg4, arg2);
		} catch (Exception ex) {
			// todo: note - come back here if no models appear
			return null;
		}
	}

    public int method2394(int arg0, int arg1) {
		return arg0 & arg1 ^ arg1;
	}

    public int method2213(int arg0, int arg1) {
		return arg0 | arg1;
	}

    public FloorModel createFloor(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new GlFloorModel(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

    public Matrix4x4 method2208() {
		return this.field9866;
	}

    public Matrix4x3 method2209() {
		return this.field9900;
	}

    public void drawParticles(ParticleList arg0) {
		this.field9978.method1324(this, arg0);
	}

    public void method2245(int arg0, WaterFogData arg1) {
		this.field10028 = arg0;
		this.field9892 = arg1;
		this.field9840 = true;
	}

    public void setWaterFog(int arg0, WaterFogData arg1) {
		if (!this.field9840) {
			throw new RuntimeException("");
		}
		this.field10028 = arg0;
		this.field9892 = arg1;
		if (this.field9963) {
			this.field10023.field1032.method15343();
			this.field10023.field1032.method15344();
		}
	}

    public void method2247() {
		this.field9840 = false;
	}

    public void method2263() {
		this.field9897 = 0;
		this.field9932 = 0;
		this.field9931 = this.renderTarget.getWidth();
		this.field9934 = this.renderTarget.getHeight();
		this.method15937();
	}

    public void method2164(int arg0, int arg1, int arg2, int arg3) {
		this.field9897 = arg0;
		this.field9932 = arg1;
		this.field9931 = arg2;
		this.field9934 = arg3;
		this.method15937();
	}

    public void method2326(int[] arg0) {
		arg0[0] = this.field9897;
		arg0[1] = this.field9932;
		arg0[2] = this.field9931;
		arg0[3] = this.field9934;
	}

    public void method2339(float arg0, float arg1) {
		this.field9914 = arg0;
		this.field9831 = arg1;
		this.method15924();
	}

    public final void method2171(int[] arg0) {
		arg0[0] = this.field9927;
		arg0[1] = this.field9925;
		arg0[2] = this.field9928;
		arg0[3] = this.field9926;
	}

    public final void resetClip() {
		if (this.renderTarget == null) {
			return;
		}
		this.field9927 = 0;
		this.field9925 = 0;
		this.field9928 = this.renderTarget.getWidth();
		this.field9926 = this.renderTarget.getHeight();
		OpenGL.glDisable(3089);
	}

    public final void resetBounds(int left, int top, int right, int bottom) {
		if (this.renderTarget == null) {
			return;
		}
		if (left < 0) {
			left = 0;
		}
		if (right > this.renderTarget.getWidth()) {
			right = this.renderTarget.getWidth();
		}
		if (top < 0) {
			top = 0;
		}
		if (bottom > this.renderTarget.getHeight()) {
			bottom = this.renderTarget.getHeight();
		}
		this.field9927 = left;
		this.field9925 = top;
		this.field9928 = right;
		this.field9926 = bottom;
		OpenGL.glEnable(3089);
		this.method15743();
	}

    public final void setBounds(int left, int top, int right, int bottom) {
		if (this.field9927 < left) {
			this.field9927 = left;
		}
		if (this.field9928 > right) {
			this.field9928 = right;
		}
		if (this.field9925 < top) {
			this.field9925 = top;
		}
		if (this.field9926 > bottom) {
			this.field9926 = bottom;
		}
		OpenGL.glEnable(3089);
		this.method15743();
	}

    public final void method15925(int arg0, int arg1) {
		this.field9869 = arg0;
		this.field9930 = arg1;
		this.method15937();
		this.method15743();
	}

    public final void method15937() {
		if (this.renderTarget == null) {
			return;
		}
		int var1;
		int var2;
		int var3;
		int var4;
		if (this.field9922 == 2) {
			var1 = this.field9897;
			var2 = this.field9932;
			var3 = this.field9931;
			var4 = this.field9934;
		} else {
			var1 = 0;
			var2 = 0;
			var3 = this.renderTarget.getWidth();
			var4 = this.renderTarget.getHeight();
		}
		if (var3 < 1) {
			var3 = 1;
		}
		if (var4 < 1) {
			var4 = 1;
		}
		OpenGL.glViewport(this.field9869 + var1, this.field9930 + this.renderTarget.getHeight() - var2 - var4, var3, var4);
		this.field9867 = (float) this.field9931 / 2.0F;
		this.field9882 = (float) this.field9934 / 2.0F;
		this.field9910 = (float) this.field9897 + this.field9867;
		this.field9912 = (float) this.field9932 + this.field9882;
	}

    public final void method15924() {
		if (this.field9922 == 2) {
			OpenGL.glDepthRange(this.field9914, this.field9831);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

    public final void method15743() {
		if (this.renderTarget == null || this.field9927 >= this.field9928 || this.field9925 >= this.field9926) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.field9927 + this.field9869, this.field9930 + this.renderTarget.getHeight() - this.field9926, this.field9928 - this.field9927, this.field9926 - this.field9925);
		}
	}

    public final void method15744() {
		OpenGL.glPushMatrix();
	}

    public final void method15818(Matrix4x4 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.entries, 0);
	}

    public final void method15928(Matrix4x4 arg0) {
		OpenGL.glLoadMatrixf(arg0.entries, 0);
	}

    public final void method15745() {
		OpenGL.glPopMatrix();
	}

    public final void method2217(Matrix4x3 arg0) {
		this.field9911.setTo(arg0);
		this.field9903.setToMatrix4x3(this.field9911);
		this.field9976.setTo(arg0);
		this.field9976.method6300();
		this.field9904.setToMatrix4x3(this.field9976);
		this.method15752();
		if (this.field9922 != 1) {
			this.method15841();
		}
	}

    public Matrix4x3 method2218() {
		return new Matrix4x3(this.field9911);
	}

    public final void method15841() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.field9903.entries, 0);
		if (this.field9963) {
			this.field10023.field1032.method15343();
		}
		this.method15758();
		this.method15742();
	}

    public final void method2220(Matrix4x4 arg0) {
		this.field9939.setTo(arg0);
		this.method15752();
		this.method15751();
	}

    public final Matrix4x4 method2355() {
		return new Matrix4x4(this.field9939);
	}

    public final void method15748() {
		if (this.field9922 != 0) {
			this.field9922 = 0;
			this.method15937();
			this.method15924();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

    public final void method15749() {
		if (this.field9922 == 1) {
			return;
		}
		this.field9922 = 1;
		this.method15751();
		this.method15937();
		this.method15924();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.field9908 &= 0xFFFFFFE7;
	}

    public final void method15763() {
		if (this.field9922 == 2) {
			return;
		}
		this.field9922 = 2;
		this.method15753(this.field9939.entries);
		this.method15841();
		this.method15937();
		this.method15924();
		this.field9908 &= 0xFFFFFFF8;
	}

    public final void method15751() {
		this.field9917 = this.field9939.method6632();
		this.field9916 = this.field9939.method6654();
		this.method15806();
		if (this.field9922 == 2) {
			this.method15753(this.field9939.entries);
		} else if (this.field9922 == 1) {
			this.method15753(this.field9906.entries);
		}
	}

    public final void method15752() {
		this.field10005.setTo(this.field9903);
		this.field10005.multiply(this.field9939);
		this.field10005.method6607(this.field10015[0]);
		this.field10005.method6643(this.field10015[1]);
		this.field10005.method6625(this.field10015[2]);
		this.field10005.method6626(this.field10015[3]);
		this.field10005.method6627(this.field10015[4]);
		this.field10005.method6628(this.field10015[5]);
	}

    public final void method15753(float[] arg0) {
		float[] var2 = new float[16];
		System.arraycopy(arg0, 0, var2, 0, 16);
		var2[1] = -var2[1];
		var2[5] = -var2[5];
		var2[9] = -var2[9];
		var2[13] = -var2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(var2, 0);
		OpenGL.glMatrixMode(5888);
	}

    public void method2219(boolean arg0) {
		this.field9980 = arg0;
		this.method15826();
	}

    public int getMaxLights() {
		return 4;
	}

    public void setActiveLights(int arg0, Light[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field9949[var3] = arg1[var3];
		}
		this.field9898 = arg0;
		if (this.field9922 != 1) {
			this.method15742();
		}
	}

    public void method15742() {
		int var1;
		for (var1 = 0; var1 < this.field9898; var1++) {
			Light var2 = this.field9949[var1];
			int var3 = var1 + 16386;
			field9894[0] = var2.method17605();
			field9894[1] = var2.method17606();
			field9894[2] = var2.method17607();
			field9894[3] = 1.0F;
			OpenGL.glLightfv(var3, 4611, field9894, 0);
			int var4 = var2.method17624();
			float var5 = var2.method17610() / 255.0F;
			field9894[0] = (float) (var4 >> 16 & 0xFF) * var5;
			field9894[1] = (float) (var4 >> 8 & 0xFF) * var5;
			field9894[2] = (float) (var4 & 0xFF) * var5;
			OpenGL.glLightfv(var3, 4609, field9894, 0);
			OpenGL.glLightf(var3, 4617, 1.0F / (float) (var2.method17608() * var2.method17608()));
			OpenGL.glEnable(var3);
		}
		while (var1 < this.field9909) {
			OpenGL.glDisable(var1 + 16386);
			var1++;
		}
		this.field9909 = this.field9898;
	}

    public final void setSunAmbientIntensity(float arg0) {
		if (this.field9946 != arg0) {
			this.field9946 = arg0;
			this.method15756();
		}
	}

    public final void setSun(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		boolean var7 = this.field9942 != arg0;
		if (var7 || this.field9947 != arg1 || this.field9948 != arg2) {
			this.field9942 = arg0;
			this.field9947 = arg1;
			this.field9948 = arg2;
			if (var7) {
				this.field9863 = (float) (this.field9942 & 0xFF0000) / 1.671168E7F;
				this.field9944 = (float) (this.field9942 & 0xFF00) / 65280.0F;
				this.field9945 = (float) (this.field9942 & 0xFF) / 255.0F;
				this.method15756();
			}
			this.method15819();
		}
		if (this.field9951[0] == arg3 && this.field9951[1] == arg4 && this.field9951[2] == arg5) {
			return;
		}
		this.field9951[0] = arg3;
		this.field9951[1] = arg4;
		this.field9951[2] = arg5;
		this.field9895[0] = -arg3;
		this.field9895[1] = -arg4;
		this.field9895[2] = -arg5;
		float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.field9870[0] = arg3 * var8;
		this.field9870[1] = arg4 * var8;
		this.field9870[2] = arg5 * var8;
		this.field9941[0] = -this.field9870[0];
		this.field9941[1] = -this.field9870[1];
		this.field9941[2] = -this.field9870[2];
		this.method15758();
		this.field9915 = (int) (arg3 * 256.0F / arg4);
		this.field9953 = (int) (arg5 * 256.0F / arg4);
	}

    public final void method2224(int arg0) {
		this.field9874 = 0;
		while (arg0 > 1) {
			this.field9874++;
			arg0 >>= 0x1;
		}
		this.field9873 = 0x1 << this.field9874;
	}

    public final void setFog(int arg0, int arg1, int arg2) {
		if (this.field9955 == arg0 && this.field9956 == arg1 && this.field9957 == arg2) {
			return;
		}
		this.field9955 = arg0;
		this.field9956 = arg1;
		this.field9957 = arg2;
		this.method15806();
		this.method15828();
	}

    public final void method15755(float arg0, float arg1) {
		this.field9960 = arg0;
		this.field9961 = arg1;
		this.method15806();
	}

    public void method15756() {
		field10014[0] = this.field9946 * this.field9863;
		field10014[1] = this.field9946 * this.field9944;
		field10014[2] = this.field9946 * this.field9945;
		field10014[3] = 1.0F;
		OpenGL.glLightModelfv(2899, field10014, 0);
	}

    public void method15819() {
		field10014[0] = this.field9947 * this.field9863;
		field10014[1] = this.field9947 * this.field9944;
		field10014[2] = this.field9947 * this.field9945;
		field10014[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, field10014, 0);
		field10014[0] = -this.field9948 * this.field9863;
		field10014[1] = -this.field9948 * this.field9944;
		field10014[2] = -this.field9948 * this.field9945;
		field10014[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, field10014, 0);
	}

    public void method15758() {
		OpenGL.glLightfv(16384, 4611, this.field9870, 0);
		OpenGL.glLightfv(16385, 4611, this.field9941, 0);
	}

    public void method15828() {
		if (this.field9954 && this.field9956 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

    public void method15806() {
		this.field9829 = this.field9917 - (float) this.field9957 - this.field9961;
		this.field9830 = this.field9829 - (float) this.field9956 * this.field9960;
		if (this.field9830 < this.field9916) {
			this.field9830 = this.field9916;
		}
		OpenGL.glFogf(2915, this.field9830);
		OpenGL.glFogf(2916, this.field9829);
		field10014[0] = (float) (this.field9955 & 0xFF0000) / 1.671168E7F;
		field10014[1] = (float) (this.field9955 & 0xFF00) / 65280.0F;
		field10014[2] = (float) (this.field9955 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, field10014, 0);
	}

    public EnvironmentSampler createEnvironmentSampler(int arg0) {
		return this.field9952 ? new GlEnvironmentSampler_Sub2(this, arg0) : null;
	}

    public EnvironmentSampler method2435(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
		if (arg0 != null && arg1 != null && this.field9952 && this.field9985) {
			GlEnvironmentSampler_Sub1 var5 = null;
			GlEnvironmentSampler var6 = (GlEnvironmentSampler) arg0;
			GlEnvironmentSampler var7 = (GlEnvironmentSampler) arg1;
			GlCubeTexture var8 = var6.method15649();
			GlCubeTexture var9 = var7.method15649();
			if (var8 != null && var9 != null) {
				int var10 = var8.field9279 > var9.field9279 ? var8.field9279 : var9.field9279;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof GlEnvironmentSampler_Sub1) {
					GlEnvironmentSampler_Sub1 var11 = (GlEnvironmentSampler_Sub1) arg3;
					if (var11.method18982() == var10) {
						var5 = var11;
					}
				}
				if (var5 == null) {
					var5 = new GlEnvironmentSampler_Sub1(this, var10);
				}
				if (var5.method18984(var8, var9, arg2)) {
					return var5;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

    public final void setEnvironmentSampler(EnvironmentSampler arg0) {
		this.field9887 = (GlEnvironmentSampler) arg0;
	}

    public final GlCubeTexture method15760() {
		return this.field9887 == null ? null : this.field9887.method15649();
	}

    public final void method2172(int arg0, int arg1, int arg2, int arg3) {
		if (this.field9986 != null) {
			this.field9986.method1367(arg0, arg1, arg2, arg3);
		}
	}

    public final void method2233(int arg0, int arg1) {
		if (this.field9986 != null) {
			this.field9986.method1368(arg0, arg1);
		}
	}

    public final boolean method2234() {
		return this.field9986 == null ? false : this.field9986.method1378();
	}

    public boolean method15762() {
		if (this.field9865 == null) {
			return false;
		}
		if (!this.field9865.method17543()) {
			if (!this.field9986.method1369(this.field9865)) {
				return false;
			}
			this.field10026.method1399();
		}
		return true;
	}

    public boolean isLevelsEnabled() {
		return this.field9865 != null && this.field9865.method17543();
	}

    public void setLevels(float arg0, float arg1, float arg2, float arg3, float arg4) {
		GlLevelsFilter.field12167 = arg0;
		GlLevelsFilter.field12172 = arg1;
		GlLevelsFilter.field12168 = arg2;
		GlLevelsFilter.field12166 = arg3;
		GlLevelsFilter.field12170 = arg4;
	}

    public ColourRemapper createColourRemapper(int[] arg0) {
		return new GlColourRemapper(this, arg0);
	}

    public boolean method15803() {
		if (this.field9853 == null) {
			return false;
		}
		if (!this.field9853.method17543()) {
			if (!this.field9986.method1369(this.field9853)) {
				return false;
			}
			this.field10026.method1399();
		}
		return true;
	}

    public boolean method2238() {
		return this.field9853 != null && this.field9853.method17543();
	}

    public void setColourRemapping(ColourRemapper arg0, float arg1, ColourRemapper arg2, float arg3, ColourRemapper arg4, float arg5) {
		int var7 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		GlColourRemappingFilter.field12179[0] = (GlColourRemapper) arg0;
		GlColourRemappingFilter.field12183[0] = arg1;
		if (arg1 > 0.0F) {
			var7++;
		}
		GlColourRemappingFilter.field12179[1] = (GlColourRemapper) arg2;
		GlColourRemappingFilter.field12183[1] = arg3;
		if (arg3 > 0.0F) {
			var7++;
		}
		GlColourRemappingFilter.field12179[2] = (GlColourRemapper) arg4;
		GlColourRemappingFilter.field12183[2] = arg5;
		if (arg5 > 0.0F) {
			var7++;
		}
		GlColourRemappingFilter.field12175 = var7;
		GlColourRemappingFilter.field12174 = 1.0F - (arg1 + arg3 + arg5);
	}

    public final boolean enableBloom() {
		if (this.field9864 == null) {
			return false;
		}
		if (!this.field9864.method17543()) {
			if (!this.field9986.method1369(this.field9864)) {
				return false;
			}
			this.field10026.method1399();
		}
		return true;
	}

    public final void disableBloom() {
		if (this.field9864 != null && this.field9864.method17543()) {
			this.field9986.method1370(this.field9864);
			this.field10026.method1399();
		}
	}

    public final boolean isBloomEnabled() {
		return this.field9864 != null && this.field9864.method17543();
	}

    public final void setBloom(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		GlColourGradingBloomFilter.field12189 = arg0;
		GlColourGradingBloomFilter.field12188 = arg1;
		GlColourGradingBloomFilter.field12205 = arg2;
	}

    public FrameBuffer createFramebuffer() {
		return new GlFrameBuffer(this);
	}

    public EffectInterface method2121(int arg0, int arg1) {
		return new PostProcessingRelated(this, TextureFormat.DEPTH, DataType.UNSIGNED_INT_24, arg0, arg1);
	}

    public EffectInterface method2356(int arg0, int arg1, int arg2) {
		return new PostProcessingRelated(this, TextureFormat.DEPTH, DataType.UNSIGNED_INT_24, arg0, arg1, arg2);
	}

    public GraphicsDeletable method2146(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
		return new PostProcessingRelated(this, arg2, arg3, arg0, arg1, arg4);
	}

    public final GlBinding method15766(int arg0, byte[] arg1, int arg2, boolean arg3) {
		return (GlBinding) (this.field9990 && (!arg3 || this.field9991) ? new GlBufferRelated_Sub1(this, arg0, arg1, arg2, arg3) : new GlFloorModelRelated2_Sub1(this, arg0, arg1, arg2));
	}

    public final GlInterfaceRelated method15767(int arg0, byte[] arg1, int arg2, boolean arg3) {
		return (GlInterfaceRelated) (this.field9990 && (!arg3 || this.field9991) ? new GlBufferRelated_Sub2(this, arg0, arg1, arg2, arg3) : new GlFloorModelRelated2_Sub2(this, arg0, arg1, arg2));
	}

    public final GlInterfaceRelated method15804(int arg0, Buffer arg1, int arg2, boolean arg3) {
		return (GlInterfaceRelated) (this.field9990 && (!arg3 || this.field9991) ? new GlBufferRelated_Sub2(this, arg0, arg1, arg2, arg3) : new GlFloorModelRelated2_Sub2(this, arg0, arg1));
	}

    public final void method15842(GlInterfaceRelated arg0) {
		if (this.field9852 != arg0) {
			if (this.field9990) {
				OpenGL.glBindBufferARB(34962, arg0.method1294());
			}
			this.field9852 = arg0;
		}
	}

    public final void method15769(GlBinding arg0) {
		if (this.field9966 != arg0) {
			if (this.field9990) {
				OpenGL.glBindBufferARB(34963, arg0.method1416());
			}
			this.field9966 = arg0;
		}
	}

    public final void method15809(GlRelated3 arg0, GlRelated3 arg1, GlRelated3 arg2, GlRelated3 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method15842(arg0.field1111);
			OpenGL.glVertexPointer(arg0.field1110, arg0.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg0.field1112);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method15842(arg1.field1111);
			OpenGL.glNormalPointer(arg1.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg1.field1112);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method15842(arg2.field1111);
			OpenGL.glColorPointer(arg2.field1110, arg2.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg2.field1112);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method15842(arg3.field1111);
			OpenGL.glTexCoordPointer(arg3.field1110, arg3.field1113, this.field9852.method1295(), this.field9852.getAddress() + (long) arg3.field1112);
			OpenGL.glEnableClientState(32888);
		}
	}

    public final void method15801(int arg0, int arg1, int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

    public final void method15921(GlBinding arg0, int arg1, int arg2, int arg3) {
		this.method15769(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.getAddress() + (long) (arg2 * 2));
	}

    public final void method15771() {
		if (this.field9908 == 1) {
			return;
		}
		this.method15749();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15777(null);
		this.method15774(-2);
		this.method15778(1);
		this.method15794((byte) 0);
		this.field9908 = 1;
	}

    public final void method15772() {
		if (this.field9908 == 2) {
			return;
		}
		this.method15749();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15774(-2);
		this.method15794((byte) 0);
		this.field9908 = 2;
	}

    public final void method15731() {
		if (this.field9908 == 4) {
			return;
		}
		this.method15749();
		this.method15738(false);
		this.method15764(false);
		this.method15788(false);
		this.method15789(false);
		this.method15774(-2);
		this.method15791(1);
		this.method15794((byte) 0);
		this.field9908 = 4;
	}

    public final void method15773() {
		if (this.field9908 == 8) {
			return;
		}
		this.method15763();
		this.method15738(true);
		this.method15788(true);
		this.method15789(true);
		this.method15774(-2);
		this.method15791(1);
		this.method15794((byte) 0);
		this.field9908 = 8;
	}

    public final void method15774(int arg0) {
		this.method15775(arg0, true);
	}

    public final void method15775(int arg0, boolean arg1) {
		this.method15795(arg0, arg1, true);
	}

    public final void method15795(int arg0, boolean arg1, boolean arg2) {
		if (this.field9968 != arg0 || this.field9963 != this.field9840) {
			GlTexture_Sub1 var4 = null;
			byte var5 = 0;
			byte var6 = 0;
			int var7 = 0;
			int var8 = this.field9840 ? 3 : 0;
			byte var9 = 0;
			if (arg0 < 0) {
				this.method15785();
			} else {
				Material var10 = this.materialList.get(arg0);
				if (var10.field1330) {
					var4 = this.field10026.method1404(var10);
					if (var10.speedU == 0.0F && var10.speedV == 0.0F) {
						this.method15785();
					} else {
						this.method15784((float) (this.field9872 % 128000) / 1000.0F * var10.speedU % 1.0F, (float) (this.field9872 % 128000) / 1000.0F * var10.speedV % 1.0F, 0.0F);
					}
					if (!this.field9840) {
						var6 = var10.effectArg1;
						var7 = var10.field1359;
						var8 = var10.effect;
					}
					var5 = var10.field1311;
				} else {
					this.method15785();
				}
				if (MaterialAlphaMode.TEST == var10.alphaMode) {
					var9 = var10.alphaThreshold;
				}
			}
			this.method15794(var9);
			this.field10023.method1278(var8, var6, var7, arg1, arg2);
			if (!this.field10023.method1276(var4, var5)) {
				this.method15777(var4);
				this.method15778(var5);
			}
			this.field9963 = this.field9840;
			this.field9968 = arg0;
		}
		this.field9908 &= 0xFFFFFFF8;
	}

    public final void method15776(int arg0) {
		if (this.field10018 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.field10018 = arg0;
		}
	}

    public final void method15777(GlTexture arg0) {
		GlTexture var2 = this.field9973[this.field10018];
		if (arg0 != var2) {
			if (arg0 == null) {
				OpenGL.glDisable(var2.field1009);
			} else {
				if (var2 == null) {
					OpenGL.glEnable(arg0.field1009);
				} else if (arg0.field1009 != var2.field1009) {
					OpenGL.glDisable(var2.field1009);
					OpenGL.glEnable(arg0.field1009);
				}
				OpenGL.glBindTexture(arg0.field1009, arg0.field1007);
			}
			this.field9973[this.field10018] = arg0;
		}
		this.field9908 &= 0xFFFFFFEE;
	}

    public final void method15778(int arg0) {
		if (arg0 == 1) {
			this.method15810(7681, 7681);
		} else if (arg0 == 0) {
			this.method15810(8448, 8448);
		} else if (arg0 == 2) {
			this.method15810(34165, 7681);
		} else if (arg0 == 3) {
			this.method15810(260, 8448);
		} else if (arg0 == 4) {
			this.method15810(34023, 34023);
		}
	}

    public final int method15779(int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

    public final void method15810(int arg0, int arg1) {
		if (this.field10018 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		boolean var3 = false;
		if (this.field9969 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.field9969 = arg0;
			var3 = true;
		}
		if (this.field9970 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.field9970 = arg1;
			var3 = true;
		}
		if (var3) {
			this.field9908 &= 0xFFFFFFE2;
		}
	}

    public final void method15780(int arg0, int arg1, int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

    public final void method15781(int arg0, int arg1, int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

    public final void method15765(int arg0) {
		field10014[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		field10014[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		field10014[2] = (float) (arg0 & 0xFF) / 255.0F;
		field10014[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, field10014, 0);
	}

    public final void method15783(float arg0, float arg1, float arg2, float arg3) {
		field10014[0] = arg0;
		field10014[1] = arg1;
		field10014[2] = arg2;
		field10014[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, field10014, 0);
	}

    public final void method15784(float arg0, float arg1, float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.field9958) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.field9958 = true;
	}

    public final void method15785() {
		if (this.field9958) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.field9958 = false;
		}
	}

    public final void method15738(boolean arg0) {
		if (this.field9954 != arg0) {
			this.field9954 = arg0;
			this.method15828();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

    public final void method15764(boolean arg0) {
		if (this.field9936 != arg0) {
			this.field9936 = arg0;
			this.method15831();
			this.field9908 &= 0xFFFFFFF8;
		}
	}

    public final void method15840(boolean arg0) {
		if (this.field9937 != arg0) {
			this.field9937 = arg0;
			this.method15831();
		}
	}

    public void method15831() {
		if (this.field9936 && !this.field9937) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

    public final void method15788(boolean arg0) {
		if (this.field9899 != arg0) {
			this.field9899 = arg0;
			this.method15790();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

    public final void method15789(boolean arg0) {
		if (this.field9815 != arg0) {
			this.field9815 = arg0;
			this.method15826();
			this.field9908 &= 0xFFFFFFE0;
		}
	}

    public final void method15826() {
		OpenGL.glDepthMask(this.field9815 && this.field9980);
	}

    public final void method15790() {
		if (this.field9899 && this.field9950) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

    public final void method15791(int arg0) {
		if (this.field9923 == arg0) {
			return;
		}
		byte var2;
		boolean var3;
		boolean var4;
		boolean var5;
		if (arg0 == 1) {
			var2 = 1;
			var3 = true;
			var4 = true;
			var5 = true;
		} else if (arg0 == 2) {
			var2 = 2;
			var3 = true;
			var4 = false;
			var5 = true;
		} else if (arg0 == 128) {
			var2 = 3;
			var3 = true;
			var4 = true;
			var5 = true;
		} else if (arg0 == 3) {
			var2 = 0;
			var3 = true;
			var4 = true;
			var5 = false;
		} else {
			var2 = 0;
			var3 = true;
			var4 = false;
			var5 = false;
		}
		if (this.field9848 != var3) {
			OpenGL.glColorMask(var3, var3, var3, true);
			this.field9848 = var3;
		}
		if (this.field9924 != var4) {
			this.field9924 = var4;
			this.method15839();
		}
		if (this.field9921 != var5) {
			this.field9921 = var5;
			this.method15792();
		}
		if (this.field9893 != var2) {
			this.field9893 = var2;
			this.method15793();
		}
		this.field9923 = arg0;
		this.field9908 &= 0xFFFFFFE3;
	}

    public final void method15792() {
		if (this.field9921) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

    public final void method15793() {
		if (this.field10004) {
			byte var1 = 0;
			byte var2 = 0;
			if (this.field9896 == 0) {
				var1 = 0;
				var2 = 0;
			} else if (this.field9896 == 1) {
				var1 = 1;
				var2 = 0;
			} else if (this.field9896 == 2) {
				var1 = 1;
				var2 = 1;
			} else if (this.field9896 == 3) {
				var1 = 0;
				var2 = 1;
			}
			if (this.field9893 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
			} else if (this.field9893 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
			} else if (this.field9893 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
			} else if (this.field9893 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, var1, var2);
			}
		} else if (this.field9893 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.field9893 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.field9893 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

    public final void method15759(int arg0) {
		if (this.field9896 != arg0) {
			this.field9896 = arg0;
			this.method15793();
		}
	}

    public final void method15839() {
		if (this.field9924) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.field9943 & 0xFF) / 255.0F);
		if (this.field9967 <= 0) {
			return;
		}
		if (this.field9943 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

    public final void method15794(byte arg0) {
		if (this.field9943 == arg0) {
			return;
		}
		this.field9943 = arg0;
		if (arg0 == 0) {
			this.method15759(2);
			this.method15791(1);
		} else {
			this.method15759(3);
			this.method15791(3);
		}
		this.method15839();
	}

    public final int method2520() {
		return this.field9880 + this.field9879 + this.field9881;
	}

    public final synchronized void cycle(int arg0) {
		int var2 = 0;
		int var3 = arg0 & Integer.MAX_VALUE;
		while (!this.field9883._isEmpty()) {
			IntNode var4 = (IntNode) this.field9883.removeHead();
			field9890[var2++] = (int) var4.nodeId;
			this.field9880 -= var4.value;
			if (var2 == 1000) {
				OpenGL.glDeleteBuffersARB(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteBuffersARB(var2, field9890, 0);
			var2 = 0;
		}
		while (!this.field9884._isEmpty()) {
			IntNode var5 = (IntNode) this.field9884.removeHead();
			field9890[var2++] = (int) var5.nodeId;
			this.field9879 -= var5.value;
			if (var2 == 1000) {
				OpenGL.glDeleteTextures(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteTextures(var2, field9890, 0);
			var2 = 0;
		}
		while (!this.field9885._isEmpty()) {
			IntNode var6 = (IntNode) this.field9885.removeHead();
			field9890[var2++] = var6.value;
			if (var2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(var2, field9890, 0);
			var2 = 0;
		}
		while (!this.field9886._isEmpty()) {
			IntNode var7 = (IntNode) this.field9886.removeHead();
			field9890[var2++] = (int) var7.nodeId;
			this.field9881 -= var7.value;
			if (var2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(var2, field9890, 0);
				var2 = 0;
			}
		}
		if (var2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(var2, field9890, 0);
			boolean var8 = false;
		}
		while (!this.field9938._isEmpty()) {
			IntNode var9 = (IntNode) this.field9938.removeHead();
			OpenGL.glDeleteLists((int) var9.nodeId, var9.value);
		}
		while (!this.field9838._isEmpty()) {
			Node var10 = this.field9838.removeHead();
			OpenGL.glDeleteProgramARB((int) var10.nodeId);
		}
		while (!this.field9888._isEmpty()) {
			Node var11 = this.field9888.removeHead();
			OpenGL.glDeleteShader((int) var11.nodeId);
		}
		while (!this.field9938._isEmpty()) {
			IntNode var12 = (IntNode) this.field9938.removeHead();
			OpenGL.glDeleteLists((int) var12.nodeId, var12.value);
		}
		this.field10026.method1402();
		if (this.method2520() > 100663296 && MonotonicTime.get() > this.field9823 + 60000L) {
			System.gc();
			this.field9823 = MonotonicTime.get();
		}
		this.field9872 = var3;
	}

    public final synchronized void method15870(int arg0, int arg1) {
		IntNode var3 = new IntNode(arg1);
		var3.nodeId = arg0;
		this.field9883.addTail(var3);
	}

    public final synchronized void method15822(int arg0, int arg1) {
		IntNode var3 = new IntNode(arg1);
		var3.nodeId = arg0;
		this.field9884.addTail(var3);
	}

    public final synchronized void method15802(int arg0) {
		IntNode var2 = new IntNode(arg0);
		this.field9885.addTail(var2);
	}

    public final synchronized void method15796(int arg0, int arg1) {
		IntNode var3 = new IntNode(arg1);
		var3.nodeId = arg0;
		this.field9886.addTail(var3);
	}

    public final synchronized void method15816(long arg0) {
		Node var3 = new Node();
		var3.nodeId = arg0;
		this.field9888.addTail(var3);
	}

    public final synchronized void method15797(int arg0) {
		Node var2 = new Node();
		var2.nodeId = arg0;
		this.field9838.addTail(var2);
	}

    public void method15798(int arg0) {
		this.field9940 = arg0;
		if (this.field9940 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.field9940 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.field9940 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

    public static int method15899(TextureFormat arg0) {
		switch(arg0.index) {
			case 0:
				return 6402;
			case 1:
			case 5:
			default:
				throw new IllegalStateException();
			case 2:
				return 6407;
			case 3:
				return 6410;
			case 4:
				return 6408;
			case 6:
				return 6406;
			case 7:
				return 6409;
		}
	}

    public static int method15799(TextureFormat arg0, DataType arg1) {
		if (DataType.UNSIGNED_INT_8 == arg1) {
			switch(arg0.index) {
				case 2:
					return 6407;
				case 3:
					return 6410;
				case 4:
					return 6408;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 6406;
				case 7:
					return 6409;
			}
		} else if (DataType.UNSIGNED_INT_16 == arg1) {
			switch(arg0.index) {
				case 0:
					return 33189;
				case 1:
				case 5:
				default:
					throw new IllegalArgumentException();
				case 2:
					return 32852;
				case 3:
					return 36219;
				case 4:
					return 32859;
				case 6:
					return 32830;
				case 7:
					return 32834;
			}
		} else if (DataType.UNSIGNED_INT_24 == arg1) {
			switch(arg0.index) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (DataType.FLOAT_16 == arg1) {
			switch(arg0.index) {
				case 2:
					return 34843;
				case 3:
					return 34847;
				case 4:
					return 34842;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34844;
				case 7:
					return 34846;
			}
		} else if (DataType.FLOAT_32 == arg1) {
			switch(arg0.index) {
				case 2:
					return 34837;
				case 3:
					return 34841;
				case 4:
					return 34836;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34838;
				case 7:
					return 34840;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

    public void method2253(boolean arg0) {
	}
}
