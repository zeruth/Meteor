import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;

@SuppressWarnings("all")
public final class Client extends GameShell {
   public static Client client;
   private static boolean lowMemory;
   public static PlayerEntity localPlayer;
   private static BigInteger modulus = new BigInteger("118715129948298085708715233077562919322936514902694757652158738381215780608469962250645351330040629214264158653936140878800548566943738621344847841892849665824893208868079989706488773861661003170979762976785695483470009941728657441381092748785938014719472658545215538224151739707447212206054952823153519556347");
   
   public static int anInt1050;
   public static int portOffset;
   private static int nodeId = 10;
   private static int anInt975;
   private static int anInt887;
   private static boolean aBoolean230;
   private static boolean members = true;
   private static int anInt1044;
   private static int[] anIntArray228 = new int[99];
   public static int[] anIntArray262;
   private static boolean aBoolean229;
   public static final int[][] anIntArrayArray24;
   private static boolean aBoolean228;
   private static int anInt938;
   public static final int[] anIntArray266;
   private static int anInt974;
   private static boolean aBoolean217;
   private static int anInt1007;
   private static boolean aBoolean250;
   private static int anInt858;
   private static BigInteger exponent;
   private static int anInt972;
   private static int anInt963;
   private static int anInt944;
   private static int anInt1005;
   private static int anInt925;
   private byte aByte48;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_14;
   private int anInt848;
   private volatile boolean aBoolean266;
   private int anInt1034;
   private boolean aBoolean232;
   private volatile boolean aBoolean267;
   private boolean aBoolean242;
   private Pix24 aClass10_Sub1_Sub1_Sub1_11;
   private int anInt920;
   private Class6 projectiles;
   private PixMap aClass19_15;
   private int anInt977;
   private int anInt876;
   private int anInt1048;
   private int sceneCycle;
   private int anInt885;
   private Class6 spotanims;
   private boolean aBoolean219;
   private PixMap aClass19_16;
   private int titleScreenState;
   private volatile boolean aBoolean257;
   private int systemUpdateTimer;
   private int npcCount;
   private int anInt1011;
   private Jagfile archiveTitle;
   private PixMap aClass19_18;
   private int anInt1026;
   private int waveCount;
   private PixMap aClass19_19;
   private int anInt923;
   private int[] archiveChecksum = new int[9];
   public Class24[] aClass24Array1;
   private int idleTimeout;
   private int playerCount;
   private int anInt1040;
   private int hintType;
   private Class6 spawnedLocations;
   private boolean aBoolean236;
   private PixMap areaViewport;
   private Class6[][][] levelObjStacks;
   private int objDragArea;
   private int anInt926;
   private int sceneState;
   private byte[][] aByteArrayArray5;
   private boolean midiActive;
   private ClientStream stream;
   public boolean ingame;
   private World3D scene;
   private PlayerEntity[] players;
   private int packetSize;
   private int objSelected;
   private int cameraZ;
   private PixFont aClass10_Sub1_Sub1_Sub2_4;
   private Class33_Sub1 aClass33_Sub1_1;
   private int menuSize;
   private Packet out;
   private int anInt839;
   private int anInt840;
   private int orbitCameraYaw;
   private int anInt997;
   private CRC32 aCRC32_2;
   private boolean aBoolean263;
   private int anInt1041;
   private int projectX;
   private int cameraX;
   private int anInt838;
   private int anInt985;
   private int[] anIntArray231;
   private String[] messageText;
   private Packet in;
   private int anInt888;
   private int currentLevel;
   private int[] menuAction;
   private int[][] anIntArrayArray22;
   private int anInt996;
   private int anInt849;
   private int[] anIntArray268;
   private int cameraAnticheatOffsetX;
   private int anInt828;
   private int anInt1038;
   private int[] anIntArray230;
   private Socket aSocket3;
   private boolean aBoolean264;
   private int anInt921;
   private String aString25;
   private int nextMusicDelay;
   private int[] anIntArray264;
   private int minimapAnticheatAngle;
   private int[] anIntArray256;
   private PixMap aClass19_21;
   private int[] anIntArray229;
   private int anInt1042;
   private String loginMessage0;
   private int anInt837;
   private int anInt955;
   private int spellSelected;
   private int cameraPitch;
   private NpcEntity[] npcs;
   private int crossMode;
   private String[] menuOption;
   private int[] anIntArray237;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_15;
   private int[] anIntArray236;
   private int anInt945;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_19;
   private int anInt1008;
   private int anInt883;
   private int[] anIntArray249;
   private String aString26;
   private int anInt1043;
   private int projectY;
   private String[] aStringArray8;
   private int sidebarInterfaceId;
   private int viewportInterfaceId;
   private boolean aBoolean255;
   private int sceneBaseTileX;
   private int[] anIntArray232;
   private int anInt932;
   private boolean aBoolean261;
   private byte aByte52;
   private Pix24[] imageCrosses;
   private boolean errorHost;
   private byte[][] aByteArrayArray6;
   private PixMap aClass19_22;
   private int anInt889;
   private int[] anIntArray259;
   private int anInt1006;
   private String aString17 = "";
   private long[] aLongArray3;
   private byte[][][] aByteArrayArrayArray8;
   private String loginMessage1;
   private long[] aLongArray4;
   private int[] anIntArray276;
   private int[] messageType;
   private int packetType;
   private int[][] anIntArrayArray25;
   private byte aByte45;
   private final int[] anIntArray243;
   private boolean aBoolean251;
   private int[] anIntArray271;
   private int[] anIntArray250;
   private int[] anIntArray258;
   private int anInt831;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_17;
   private int[] anIntArray251;
   private boolean aBoolean216;
   private int[] anIntArray238;
   private int[] anIntArray217;
   private boolean menuVisible;
   public int[] anIntArray244;
   private int[][][] anIntArrayArrayArray8;
   private int cameraY;
   private int crossCycle;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_16;
   private int anInt1029;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_18;
   private Pix24 aClass10_Sub1_Sub1_Sub1_3;
   private int[] anIntArray269;
   private int[] anIntArray272;
   private int cameraAnticheatOffsetZ;
   private Packet[] playerAppearanceBuffer;
   private int chatScrollOffset;
   private int anInt1002;
   private PixMap aClass19_20;
   private int anInt890;
   private int anInt956;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_20;
   private int viewportHoveredInterfaceIndex;
   private String username;
   private int anInt878;
   private int anInt1010;
   private PixFont aClass10_Sub1_Sub1_Sub2_3;
   private int anInt850;
   private int[] anIntArray239;
   private int anInt830;
   private int anInt1024;
   private int[] anIntArray216;
   private int lastPacketType1;
   private int[] anIntArray234;
   private int[] anIntArray254;
   private PixMap aClass19_3;
   private int[] anIntArray221;
   private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array3;
   private int[] anIntArray273;
   private int anInt829;
   private int anInt881;
   private long loginTime;
   private int[] anIntArray218;
   private int anInt1019;
   private String aString30;
   private String password;
   private int crossX;
   private int sceneBaseTileZ;
   private int anInt866;
   private Pix24 aClass10_Sub1_Sub1_Sub1_10;
   private int[] anIntArray242;
   private int[] anIntArray275;
   private int sidebarHoveredInterfaceIndex;
   private String aString24;
   private int anInt871;
   private int[] anIntArray222;
   private int anInt982;
   private int[] anIntArray260;
   private int[] anIntArray267;
   private int[] anIntArray274;
   private PixMap aClass19_23;
   private PixFont aClass10_Sub1_Sub1_Sub2_2;
   private int minimapZoom;
   private int[] anIntArray245;
   private int lastPacketType2;
   private int publicChatSetting;
   private int anInt880;
   private int anInt1039;
   private int anInt863;
   private int[] anIntArray248;
   private int[] anIntArray255;
   private int anInt898;
   private int anInt874;
   private int anInt832;
   private int anInt1023;
   private int anInt833;
   private String aString20;
   private int anInt928;
   private String[] messageSender;
   private int crossY;
   private boolean aBoolean248;
   private int[] anIntArray213 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   private PixMap aClass19_4;
   private int[] anIntArray224;
   private Pix24 aClass10_Sub1_Sub1_Sub1_4;
   private int[] anIntArray261;
   private PixMap aClass19_12;
   private byte aByte46;
   private int chatHoveredInterfaceIndex;
   private String aString19;
   private int anInt851;
   private int anInt995;
   private int anInt853;
   private int anInt1045;
   private int anInt1031;
   private Pix24 aClass10_Sub1_Sub1_Sub1_8;
   private String aString31;
   private int anInt943;
   private int anInt1020;
   private Class47[] levelCollisionMap;
   private boolean aBoolean254;
   private PixMap aClass19_5;
   private int[] anIntArray223;
   private PixMap aClass19_13;
   private int[] anIntArray214;
   private int anInt964;
   private Isaac randomIn;
   private int anInt886;
   private boolean aBoolean253;
   private int[] anIntArray265;
   private int anInt940;
   private boolean aBoolean247;
   private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array5;
   private Class7 aClass7_1;
   private PixMap aClass19_24;
   private boolean aBoolean260;
   private int anInt852;
   private boolean aBoolean245;
   private boolean aBoolean225;
   private PixMap aClass19_6;
   private long serverSeed;
   private int anInt842;
   private int anInt1051;
   private boolean cutscene;
   private PixMap aClass19_14;
   private Pix24 aClass10_Sub1_Sub1_Sub1_9;
   private int[] anIntArray220;
   private byte[] aByteArray21;
   private byte aByte50;
   private int anInt1036;
   private PixMap aClass19_25;
   private int anInt854;
   private int anInt989;
   private String aString18;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_1;
   private int currentOverlay;
   private boolean aBoolean241;
   private int anInt1012;
   private int anInt980;
   private int anInt957;
   private Pix24[] aClass10_Sub1_Sub1_Sub1Array5;
   private long aLong33;
   private int[] cameraModifierWobbleScale;
   private String[] aStringArray11;
   private PixMap aClass19_26;
   private int anInt1033;
   private String aString29;
   private int[] anIntArray241;
   private int anInt983;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_2;
   private int anInt855;
   private Pix24 aClass10_Sub1_Sub1_Sub1_17;
   private int anInt836;
   private byte aByte51;
   private Pix24[] aClass10_Sub1_Sub1_Sub1Array7;
   private PixMap aClass19_27;
   private int cameraYaw;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_3;
   private int anInt937;
   private int anInt999;
   private boolean[] cameraModifierEnabled;
   private int anInt912;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_4;
   private PixMap aClass19_7;
   private int anInt969;
   private String[] aStringArray10;
   private int anInt954;
   private String[] aStringArray9;
   private int anInt961;
   private int anInt959;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_5;
   private int anInt1021;
   private int anInt841;
   private int[] anIntArray219;
   private long aLong29;
   private Pix24[] aClass10_Sub1_Sub1_Sub1Array10;
   private int anInt897;
   private PixMap aClass19_8;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_9;
   private int cameraAnticheatAngle;
   private int[] designColors;
   private int[] anIntArray225;
   private int anInt936;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_10;
   private int anInt947;
   private int anInt1000;
   private int[][][] anIntArrayArrayArray7;
   private int[] anIntArray246;
   private PixMap aClass19_9;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_11;
   private int[] cameraModifierJitter;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_12;
   private int[][] anIntArrayArray23;
   private int anInt1046;
   private boolean aBoolean238;
   private boolean aBoolean246;
   private PixMap aClass19_10;
   private int anInt1025;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_13;
   private boolean[] aBooleanArray12;
   private int anInt1014;
   private boolean aBoolean218;
   private boolean waveEnabled;
   private int anInt1022;
   private int[] anIntArray247;
   private int[] cameraModifierCycle;
   private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array4;
   private int anInt857;
   private int anInt948;
   private PixMap aClass19_11;
   private int anInt934;
   private int anInt1047;
   private int[] cameraModifierWobbleSpeed;
   private int anInt949;
   private Pix24 aClass10_Sub1_Sub1_Sub1_7;
   private int anInt859;
   private int anInt1049;
   private boolean aBoolean258;
   private int anInt911;
   private byte aByte47;
   private Pix24[] aClass10_Sub1_Sub1_Sub1Array9;
   private int anInt951;
   private int anInt1035;
   private int idleNetCycles;
   private int anInt1032;
   private Pix24 aClass10_Sub1_Sub1_Sub1_12;
   private int anInt952;
   private int anInt939;
   private int anInt891;
   private int anInt865;
   private int lastPacketType0;
   private int[] anIntArray227;
   private Pix24 aClass10_Sub1_Sub1_Sub1_5;
   private boolean aBoolean220;
   private int anInt902;
   private Pix24[] aClass10_Sub1_Sub1_Sub1Array6;
   private boolean aBoolean262;
   private int anInt1053;
   private boolean aBoolean221;
   private int anInt971;
   private int anInt1015;
   private int anInt1030;
   private int anInt903;
   private int anInt918;
   private int anInt1054;
   private long aLong31;
   private int anInt856;
   private int anInt1055;
   private Pix24 aClass10_Sub1_Sub1_Sub1_6;
   private int anInt877;
   private int anInt1056;
   private int anInt927;
   private int anInt870;
   private Pix24 aClass10_Sub1_Sub1_Sub1_13;
   private PixFont aClass10_Sub1_Sub1_Sub2_5;
   private Packet login;
   private int[] anIntArray226;
   private int anInt879;
   private Pix24 aClass10_Sub1_Sub1_Sub1_15;
   private int[] anIntArray240;
   private boolean aBoolean224;
   private Pix24 aClass10_Sub1_Sub1_Sub1_14;
   private Pix24 aClass10_Sub1_Sub1_Sub1_16;
   private int anInt905;
   private int anInt966;
   private int anInt875;
   private Packet aClass10_Sub1_Sub3_8;
   private int anInt967;
   private int anInt892;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_6;
   private int anInt893;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_7;
   private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_8;
   private int anInt894;
   private int anInt935;
   private ComType aClass14_1;
   private int anInt895;
   private boolean aBoolean226;
   private int anInt987;
   private int anInt896;
   private boolean aBoolean227;
   private Pix24[] aClass10_Sub1_Sub1_Sub1Array8;
   private int MAX_PLAYER_COUNT;
   private int[] anIntArray263;
   private int anInt1009;
   private int anInt970;
   private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array2;
   private int anInt901;
   private boolean aBoolean231;
   private boolean aBoolean233;
   private boolean aBoolean235;
   private int anInt931;
   private int anInt968;
   private int anInt988;
   private int anInt930;
   private boolean aBoolean234;
   private int anInt924;
   private byte aByte49;
   private int anInt916;
   private int anInt917;
   private boolean aBoolean243;
   private int anInt953;
   private int anInt1004;
   private int anInt1017;
   private int anInt919;
   private final int anInt1018;
   private int anInt846;
   private int anInt1052;
   private int anInt979;

   static {
      int var0 = 0;

      int var1;
      for(var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + Math.pow(2.0, (double)var2 / 7.0) * 300.0);
         var0 += var3;
         anIntArray228[var1] = var0 / 4;
      }

      aBoolean229 = true;
      anIntArrayArray24 = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
      anIntArray262 = new int[32];
      var0 = 2;

      for(var1 = 0; var1 < 32; ++var1) {
         anIntArray262[var1] = var0 - 1;
         var0 += var0;
      }

      anIntArray266 = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
      exponent = new BigInteger("65537");
   }

   public Client() {
      this.anIntArray214 = new int[Class43.anInt612];
      this.aStringArray8 = new String[200];
      this.cameraModifierWobbleScale = new int[5];
      this.anInt836 = 2;
      this.aString18 = "";
      this.aStringArray9 = new String[100];
      this.anIntArray219 = new int[100];
      this.aBoolean216 = false;
      this.anIntArrayArrayArray7 = new int[4][13][13];
      this.anIntArrayArray22 = new int[104][104];
      this.anIntArrayArray23 = new int[104][104];
      this.aBoolean218 = false;
      this.anInt857 = -992;
      this.imageCrosses = new Pix24[8];
      this.anInt859 = 559;
      this.aByte45 = 6;
      this.aBoolean219 = false;
      this.aByte46 = -123;
      this.anInt865 = 2;
      this.aBoolean220 = true;
      this.aBoolean221 = true;
      this.anIntArray220 = new int[151];
      this.anInt866 = 8;
      this.cameraModifierEnabled = new boolean[5];
      this.anInt870 = -188;
      this.login = Packet.method299();
      this.anInt871 = 2301979;
      this.projectX = -1;
      this.projectY = -1;
      this.aBoolean224 = true;
      this.anInt874 = -1;
      this.aByte47 = -113;
      this.aString19 = "";
      this.anInt875 = -214;
      this.anInt877 = 50;
      this.anIntArray221 = new int[this.anInt877];
      this.anIntArray222 = new int[this.anInt877];
      this.anIntArray223 = new int[this.anInt877];
      this.anIntArray224 = new int[this.anInt877];
      this.anIntArray225 = new int[this.anInt877];
      this.anIntArray226 = new int[this.anInt877];
      this.anIntArray227 = new int[this.anInt877];
      this.aStringArray10 = new String[this.anInt877];
      this.aString20 = "";
      this.aBoolean225 = false;
      this.aBoolean226 = false;
      this.aClass10_Sub1_Sub1_Sub1Array5 = new Pix24[32];
      this.aByte48 = 1;
      this.loginMessage0 = "";
      this.loginMessage1 = "";
      this.aBoolean227 = true;
      this.anInt880 = -1;
      this.anInt881 = -1;
      this.out = Packet.method299();
      this.MAX_PLAYER_COUNT = 2048;
      this.anInt883 = 2047;
      this.players = new PlayerEntity[this.MAX_PLAYER_COUNT];
      this.anIntArray229 = new int[this.MAX_PLAYER_COUNT];
      this.anIntArray230 = new int[this.MAX_PLAYER_COUNT];
      this.playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];
      this.aClass10_Sub1_Sub1_Sub3Array2 = new Class10_Sub1_Sub1_Sub3[13];
      this.anIntArray231 = new int[500];
      this.anIntArray232 = new int[500];
      this.menuAction = new int[500];
      this.anIntArray234 = new int[500];
      this.anInt888 = -1;
      this.cameraModifierWobbleSpeed = new int[5];
      this.anIntArray240 = new int[2000];
      this.anInt901 = 2;
      this.aBoolean231 = false;
      this.aBoolean232 = false;
      this.anIntArray241 = new int[151];
      this.aString24 = "";
      this.aBoolean233 = false;
      this.anIntArray242 = new int[Class43.anInt612];
      this.aClass10_Sub1_Sub1_Sub1Array6 = new Pix24[100];
      this.anIntArray243 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      this.aBoolean234 = false;
      this.aBoolean235 = true;
      this.anIntArray244 = new int[2000];
      this.aBoolean236 = false;
      this.anInt924 = 69;
      this.anInt926 = -1;
      this.anIntArray245 = new int[Class43.anInt612];
      this.anInt927 = 2;
      this.anInt928 = 3;
      this.menuVisible = false;
      this.aByte49 = 1;
      this.aBoolean238 = false;
      this.aStringArray11 = new String[5];
      this.aBooleanArray12 = new boolean[5];
      this.anInt934 = 20411;
      this.aLongArray3 = new long[100];
      this.anIntArray246 = new int[1000];
      this.anIntArray247 = new int[1000];
      this.aClass10_Sub1_Sub1_Sub1Array7 = new Pix24[32];
      this.anInt937 = 5063219;
      this.anIntArray248 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
      this.aCRC32_2 = new CRC32();
      this.sidebarInterfaceId = -1;
      this.anIntArray251 = new int[50];
      this.username = "";
      this.password = "";
      this.errorHost = false;
      this.aBoolean241 = false;
      this.designColors = new int[5];
      this.aString29 = "";
      this.cameraModifierJitter = new int[5];
      this.anInt947 = 78;
      this.anInt954 = -30658;
      this.anIntArray254 = new int[4000];
      this.anIntArray255 = new int[4000];
      this.aBoolean242 = false;
      this.aLongArray4 = new long[200];
      this.aClass10_Sub1_Sub3_8 = new Packet(new byte[5000]);
      this.npcs = new NpcEntity[16384];
      this.anIntArray256 = new int[16384];
      this.anInt961 = 7759444;
      this.aBoolean243 = false;
      this.ingame = false;
      this.anInt964 = -110;
      this.aClass10_Sub1_Sub1_Sub3Array4 = new Class10_Sub1_Sub1_Sub3[2];
      this.aByte50 = -80;
      this.aBoolean245 = true;
      this.cameraModifierCycle = new int[5];
      this.aClass10_Sub1_Sub1_Sub3Array5 = new Class10_Sub1_Sub1_Sub3[100];
      this.anInt971 = -916;
      this.aBoolean246 = false;
      this.aByte51 = 97;
      this.aBoolean247 = false;
      this.anIntArray258 = new int[256];
      this.viewportInterfaceId = -1;
      this.anInt982 = 300;
      this.anIntArray261 = new int[33];
      this.aBoolean248 = false;
      this.aClass10_Sub1_Sub1_Sub1Array8 = new Pix24[20];
      this.menuOption = new String[500];
      this.in = Packet.method299();
      this.anIntArrayArray25 = new int[104][104];
      this.anInt985 = -1;
      this.aBoolean251 = false;
      this.spotanims = new Class6(true);
      this.cutscene = false;
      this.aBoolean253 = false;
      this.anInt988 = -1;
      this.aClass24Array1 = new Class24[5];
      this.anInt1002 = -1;
      this.anInt1004 = 1;
      this.anInt1006 = 326;
      this.aBoolean254 = false;
      this.aBoolean255 = false;
      this.aBoolean257 = false;
      this.aByteArray21 = new byte[16384];
      this.aClass14_1 = new ComType();
      this.anInt1012 = 128;
      this.anInt1017 = 1;
      this.anInt1018 = 100;
      this.anIntArray263 = new int[100];
      this.anIntArray264 = new int[50];
      this.levelCollisionMap = new Class47[4];
      this.spawnedLocations = new Class6(true);
      this.aBoolean258 = false;
      this.midiActive = true;
      this.anIntArray265 = new int[200];
      this.aBoolean260 = true;
      this.anInt1024 = -1;
      this.aBoolean261 = true;
      this.aBoolean262 = true;
      this.anInt1026 = -1;
      this.aBoolean263 = false;
      this.aClass10_Sub1_Sub1_Sub1Array9 = new Pix24[1000];
      this.currentOverlay = -1;
      this.anInt1029 = -939;
      this.projectiles = new Class6(true);
      this.aBoolean264 = false;
      this.anInt1031 = 3;
      this.anIntArray267 = new int[33];
      this.anInt1032 = 3353893;
      this.aClass10_Sub1_Sub1_Sub1Array10 = new Pix24[32];
      this.anIntArray268 = new int[]{17, 24, 34, 40};
      this.anIntArray269 = new int[1000];
      this.messageType = new int[100];
      this.messageSender = new String[100];
      this.messageText = new String[100];
      this.waveEnabled = true;
      this.aBoolean266 = false;
      this.aByte52 = -58;
      this.anInt1046 = 416;
      this.aBoolean267 = false;
      this.anIntArray275 = new int[50];
      this.levelObjStacks = new Class6[4][104][104];
      this.anIntArray276 = new int[7];
      this.anInt1051 = -1;
      this.anInt1052 = 409;
   }

   private void drawPrivateMessages() {
      this.packetSize += 0;
      if (this.anInt997 != 0) {
         PixFont var1 = this.aClass10_Sub1_Sub1_Sub2_3;
         int var2 = 0;
         if (this.systemUpdateTimer != 0) {
            var2 = 1;
         }

         for(int var3 = 0; var3 < 100; ++var3) {
            if (this.messageText[var3] != null) {
               int var4 = this.messageType[var3];
               String var5 = this.messageSender[var3];
               byte var6 = 0;
               if (var5 != null && var5.startsWith("@cr1@")) {
                  var5 = var5.substring(5);
                  var6 = 1;
               }

               if (var5 != null && var5.startsWith("@cr2@")) {
                  var5 = var5.substring(5);
                  var6 = 2;
               }

               int var7;
               if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.isFriend(var5))) {
                  var7 = 329 - var2 * 13;
                  var1.method152(4, 0, var7, "From");
                  var1.method152(4, 65535, var7 - 1, "From");
                  int var8 = var1.method150("From ") + 4;
                  if (var6 == 1) {
                     this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(var7 - 12, var8);
                     var8 += 14;
                  }

                  if (var6 == 2) {
                     this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(var7 - 12, var8);
                     var8 += 14;
                  }

                  var1.method152(var8, 0, var7, var5 + ": " + this.messageText[var3]);
                  var1.method152(var8, 65535, var7 - 1, var5 + ": " + this.messageText[var3]);
                  ++var2;
                  if (var2 >= 5) {
                     return;
                  }
               }

               if (var4 == 5 && this.anInt853 < 2) {
                  var7 = 329 - var2 * 13;
                  var1.method152(4, 0, var7, this.messageText[var3]);
                  var1.method152(4, 65535, var7 - 1, this.messageText[var3]);
                  ++var2;
                  if (var2 >= 5) {
                     return;
                  }
               }

               if (var4 == 6 && this.anInt853 < 2) {
                  var7 = 329 - var2 * 13;
                  var1.method152(4, 0, var7, "To " + var5 + ": " + this.messageText[var3]);
                  var1.method152(4, 65535, var7 - 1, "To " + var5 + ": " + this.messageText[var3]);
                  ++var2;
                  if (var2 >= 5) {
                     return;
                  }
               }
            }
         }
      }

   }

   public String getParameter(String var1) {
      return signlink.mainapp == null ? super.getParameter(var1) : signlink.mainapp.getParameter(var1);
   }

   private void method639() {
      if (this.aClass19_19 == null) {
         super.gameSurface = null;
         this.aClass19_18 = null;
         this.aClass19_16 = null;
         this.aClass19_15 = null;
         this.areaViewport = null;
         this.aClass19_12 = null;
         this.aClass19_13 = null;
         this.aClass19_14 = null;
         this.aClass19_22 = new PixMap(this.getBaseComponent(), 128, 265);
         Draw2D.clear();
         this.aClass19_23 = new PixMap(this.getBaseComponent(), 128, 265);
         Draw2D.clear();
         this.aClass19_19 = new PixMap(this.getBaseComponent(), 509, 171);
         Draw2D.clear();
         this.aClass19_20 = new PixMap(this.getBaseComponent(), 360, 132);
         Draw2D.clear();
         this.aClass19_21 = new PixMap(this.getBaseComponent(), 360, 200);
         Draw2D.clear();
         this.aClass19_24 = new PixMap(this.getBaseComponent(), 202, 238);
         Draw2D.clear();
         this.aClass19_25 = new PixMap(this.getBaseComponent(), 203, 238);
         Draw2D.clear();
         this.aClass19_26 = new PixMap(this.getBaseComponent(), 74, 94);
         Draw2D.clear();
         this.aClass19_27 = new PixMap(this.getBaseComponent(), 75, 94);
         Draw2D.clear();
         if (this.archiveTitle != null) {
            this.loadTitleBackground(aBoolean250);
            this.loadTitleImages();
         }

         this.aBoolean236 = true;
      }

   }

   public AppletContext getAppletContext() {
      return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
   }

   protected void drawProgress(int var1, String var2) {
      this.anInt1048 = var1;
      this.aString25 = var2;
      this.method639();
      if (this.archiveTitle == null) {
         super.drawProgress(var1, var2);
      } else {
         this.aClass19_21.method130();
         this.aClass10_Sub1_Sub1_Sub2_4.method148(180, 452, 54, 16777215, "RuneScape is loading - please wait...");
         Draw2D.drawRect(62, 34, 9179409, 28, 304);
         Draw2D.drawRect(63, 32, 0, 29, 302);
         Draw2D.fillRect(30, 64, 9179409, var1 * 3, 30);
         Draw2D.fillRect(30, 64, 0, 300 - var1 * 3, var1 * 3 + 30);
         this.aClass10_Sub1_Sub1_Sub2_4.method148(180, 452, 85, 16777215, var2);
         this.aClass19_21.draw(171, 202, super.graphics);
         if (this.aBoolean236) {
            this.aBoolean236 = false;
            if (!this.aBoolean257) {
               this.aClass19_22.draw(0, 0, super.graphics);
               this.aClass19_23.draw(0, 637, super.graphics);
            }

            this.aClass19_19.draw(0, 128, super.graphics);
            this.aClass19_20.draw(371, 202, super.graphics);
            this.aClass19_24.draw(265, 0, super.graphics);
            this.aClass19_25.draw(265, 562, super.graphics);
            this.aClass19_26.draw(171, 128, super.graphics);
            this.aClass19_27.draw(171, 562, super.graphics);
         }
      }

   }

   protected Component getBaseComponent() {
      if (signlink.mainapp == null) {
         return (Component)(super.frame == null ? this : super.frame);
      } else {
         return signlink.mainapp;
      }
   }

   private void method592(byte var1) {
      this.aBoolean267 = true;
      boolean var2 = false;

      try {
         long var3 = System.currentTimeMillis();
         int var5 = 0;
         int var6 = 20;

         while(this.aBoolean257) {
            ++this.anInt945;
            this.method656((byte)1);
            this.method656((byte)1);
            this.method673(47);
            ++var5;
            if (var5 > 10) {
               long var7 = System.currentTimeMillis();
               int var9 = (int)(var7 - var3) / 10 - var6;
               var6 = 40 - var9;
               if (var6 < 5) {
                  var6 = 5;
               }

               var5 = 0;
               var3 = var7;
            }

            try {
               Thread.sleep((long)var6);
            } catch (Exception var12) {
            }
         }
      } catch (Exception var13) {
      }

      this.aBoolean267 = false;
   }

   public URL getCodeBase() {
      if (signlink.mainapp != null) {
         return signlink.mainapp.getCodeBase();
      } else {
         try {
            if (super.frame != null) {
               return new URL("http://127.0.0.1:" + (portOffset + 80));
            }
         } catch (Exception var2) {
         }

         return super.getCodeBase();
      }
   }

   private void method698(int var1) {
      Graphics var2 = this.getBaseComponent().getGraphics();
      var2.setColor(Color.black);
      boolean var3 = false;
      var2.fillRect(0, 0, 765, 503);
      this.setCycleDelay();
      byte var4;
      int var5;
      if (this.aBoolean264) {
         this.aBoolean257 = false;
         var2.setFont(new Font("Helvetica", 1, 16));
         var2.setColor(Color.yellow);
         var4 = 35;
         var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
         var5 = var4 + 50;
         var2.setColor(Color.white);
         var2.drawString("To fix this try the following (in order):", 30, 85);
         int var6 = var5 + 50;
         var2.setColor(Color.white);
         var2.setFont(new Font("Helvetica", 1, 12));
         var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
         int var7 = var6 + 30;
         var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
         int var8 = var7 + 30;
         var2.drawString("3: Try using a different game-world", 30, 195);
         int var9 = var8 + 30;
         var2.drawString("4: Try rebooting your computer", 30, 225);
         int var10 = var9 + 30;
         var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
      }

      if (this.errorHost) {
         this.aBoolean257 = false;
         var2.setFont(new Font("Helvetica", 1, 20));
         var2.setColor(Color.white);
         var2.drawString("Error - unable to load game!", 50, 50);
         var2.drawString("To play RuneScape make sure you play from", 50, 100);
         var2.drawString("http://www.runescape.com", 50, 150);
      }

      if (this.aBoolean232) {
         this.aBoolean257 = false;
         var2.setColor(Color.yellow);
         var4 = 35;
         var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
         var5 = var4 + 50;
         var2.setColor(Color.white);
         var2.drawString("To fix this try the following (in order):", 30, 85);
         var5 += 50;
         var2.setColor(Color.white);
         var2.setFont(new Font("Helvetica", 1, 12));
         var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
         var5 += 30;
         var2.drawString("2: Try rebooting your computer, and reloading", 30, 165);
         var5 += 30;
      }

   }

   private void method716() {
      this.aBoolean257 = false;

      while(this.aBoolean267) {
         this.aBoolean257 = false;

         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }
      }

      this.aClass10_Sub1_Sub1_Sub3_19 = null;
      this.aClass10_Sub1_Sub1_Sub3_20 = null;
      this.aClass10_Sub1_Sub1_Sub3Array3 = null;
      this.anIntArray271 = null;
      this.anIntArray272 = null;
      this.anIntArray273 = null;
      this.anIntArray274 = null;
      this.anIntArray259 = null;
      this.anIntArray260 = null;
      this.anIntArray249 = null;
      this.anIntArray250 = null;
      this.aClass10_Sub1_Sub1_Sub1_3 = null;
      this.aClass10_Sub1_Sub1_Sub1_4 = null;
   }

   private void projectFromGround(int x, int z, int height) {
      if (x >= 128 && z >= 128 && x <= 13056 && z <= 13056) {
         int y = this.getHeightmapY(z, x, this.currentLevel) - height;
         int var5 = x - this.cameraX;
         int var6 = y - this.cameraY;
         int var7 = z - this.cameraZ;
         int var8 = Model.anIntArray146[this.cameraPitch];
         int var9 = Model.anIntArray147[this.cameraPitch];
         int var10 = Model.anIntArray146[this.cameraYaw];
         int var11 = Model.anIntArray147[this.cameraYaw];
         int var12 = var7 * var10 + var5 * var11 >> 16;
         int var13 = var7 * var11 - var5 * var10 >> 16;
         int var15 = var6 * var9 - var13 * var8 >> 16;
         int var16 = var6 * var8 + var13 * var9 >> 16;
         if (var16 >= 50) {
            this.projectX = Draw3D.anInt686 + (var12 << 9) / var16;
            this.projectY = Draw3D.anInt687 + (var15 << 9) / var16;
         } else {
            this.projectX = -1;
            this.projectY = -1;
         }
      } else {
         this.projectX = -1;
         this.projectY = -1;
      }

   }

   private void method700(String var1, String var2) {
      int var3;
      if (this.areaViewport != null) {
         this.areaViewport.method130();
         Draw3D.lineOffset = this.anIntArray238;
         var3 = 151;
         if (var1 != null) {
            var3 -= 7;
         }

         this.aClass10_Sub1_Sub1_Sub2_3.method148(257, 452, var3, 0, var2);
         this.aClass10_Sub1_Sub1_Sub2_3.method148(256, 452, var3 - 1, 16777215, var2);
         var3 += 15;
         if (var1 != null) {
            this.aClass10_Sub1_Sub1_Sub2_3.method148(257, 452, var3, 0, var1);
            this.aClass10_Sub1_Sub1_Sub2_3.method148(256, 452, var3 - 1, 16777215, var1);
         }

         this.areaViewport.draw(4, 4, super.graphics);
      } else if (super.gameSurface != null) {
         super.gameSurface.method130();
         Draw3D.lineOffset = this.anIntArray239;
         var3 = 251;
         Draw2D.fillRect(50, 221, 0, 300, 233);
         Draw2D.drawRect(221, 50, 16777215, 233, 300);
         if (var1 != null) {
            var3 -= 7;
         }

         this.aClass10_Sub1_Sub1_Sub2_3.method148(383, 452, var3, 0, var2);
         this.aClass10_Sub1_Sub1_Sub2_3.method148(382, 452, var3 - 1, 16777215, var2);
         var3 += 15;
         if (var1 != null) {
            this.aClass10_Sub1_Sub1_Sub2_3.method148(383, 452, var3, 0, var1);
            this.aClass10_Sub1_Sub1_Sub2_3.method148(382, 452, var3 - 1, 16777215, var1);
         }

         super.gameSurface.draw(0, 0, super.graphics);
      }

   }

   private void method705(int var1, Pix24 var2, int var3) {
      if (var2 != null) {
         int var4 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
         int var5 = var3 * var3 + var1 * var1;
         if (var5 <= 6400) {
            int var6 = Model.anIntArray146[var4];
            int var7 = Model.anIntArray147[var4];
            int var8 = var6 * 256 / (this.minimapZoom + 256);
            int var9 = var7 * 256 / (this.minimapZoom + 256);
            int var10 = var1 * var8 + var3 * var9 >> 16;
            int var11 = var1 * var9 - var3 * var8 >> 16;
            if (var5 > 2500) {
               var2.method84(this.aClass10_Sub1_Sub1_Sub3_17, 83 - var11 - var2.cropH / 2 - 4, var10 + 94 - var2.cropW / 2 + 4);
            } else {
               var2.draw(83 - var11 - var2.cropH / 2 - 4, var10 + 94 - var2.cropW / 2 + 4);
            }
         }
      }

   }

   private void tryReconnect() {
      if (this.idleTimeout > 0) {
         this.logout();
      } else {
         this.method700("Please wait - attempting to reestablish", "Connection lost");
         this.anInt923 = 0;
         this.anInt955 = 0;
         ClientStream stream = this.stream;
         this.ingame = false;
         this.anInt833 = 0;
         this.login(this.username, this.password, true);
         if (!this.ingame) {
            this.logout();
         }

         try {
            stream.close();
         } catch (Exception var3) {
         }
      }

   }

   private void logout() {
      try {
         if (this.stream != null) {
            this.stream.close();
         }
      } catch (Exception var3) {
      }

      this.stream = null;
      this.ingame = false;
      this.titleScreenState = 0;
      this.username = "";
      this.password = "";
      this.clearCaches();
      this.scene.reset();

      for(int level = 0; level < 4; ++level) {
         this.levelCollisionMap[level].reset();
      }

      System.gc();
      this.stopMidi();
      this.anInt1051 = -1;
      this.anInt1023 = -1;
      this.nextMusicDelay = 0;
   }

   protected void load() {
      this.drawProgress(20, "Starting up");
      if (signlink.sunjava) {
         super.mindel = 5;
      }

      if (aBoolean230) {
         this.aBoolean232 = true;
      } else {
         aBoolean230 = true;
         boolean good = false;
         String var2 = this.method612();
         if (var2.endsWith("jagex.com")) {
            good = true;
         }

         if (var2.endsWith("runescape.com")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.2")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.231")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.229")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.228")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.227")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.226")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.224")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.223")) {
            good = true;
         }

         if (var2.endsWith("192.168.1.221")) {
            good = true;
         }

         if (var2.endsWith("127.0.0.1")) {
            good = true;
         }

         if (!good) {
            this.errorHost = true;
         } else {
            if (signlink.aRandomAccessFile3 != null) {
               for(int var3 = 0; var3 < 5; ++var3) {
                  this.aClass24Array1[var3] = new Class24(var3 + 1, 600000, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[var3], 4);
               }
            }

            try {
               this.method661();
               this.archiveTitle = this.loadArchive(this.archiveChecksum[1], "title", 25, 1, "title screen");

               this.aClass10_Sub1_Sub1_Sub2_2 = new PixFont(false, this.archiveTitle, -914, "p11_full");
               this.aClass10_Sub1_Sub1_Sub2_3 = new PixFont(false, this.archiveTitle, -914, "p12_full");
               this.aClass10_Sub1_Sub1_Sub2_4 = new PixFont(false, this.archiveTitle, -914, "b12_full");
               this.aClass10_Sub1_Sub1_Sub2_5 = new PixFont(true, this.archiveTitle, -914, "q8_full");

               this.loadTitleBackground(aBoolean250);
               this.loadTitleImages();

               Jagfile var36 = this.loadArchive(this.archiveChecksum[2], "config", 30, 2, "config");
               Jagfile var4 = this.loadArchive(this.archiveChecksum[3], "interface", 35, 3, "interface");
               Jagfile var5 = this.loadArchive(this.archiveChecksum[4], "media", 40, 4, "2d graphics");
               Jagfile var6 = this.loadArchive(this.archiveChecksum[6], "textures", 45, 6, "textures");
               Jagfile var7 = this.loadArchive(this.archiveChecksum[7], "wordenc", 50, 7, "chat system");
               Jagfile var8 = this.loadArchive(this.archiveChecksum[8], "sounds", 55, 8, "sound effects");
               this.aByteArrayArrayArray8 = new byte[4][104][104];
               this.anIntArrayArrayArray8 = new int[4][105][105];
               this.scene = new World3D(this.anIntArrayArrayArray8, 104, 4, 104, (byte)5);

               for(int var9 = 0; var9 < 4; ++var9) {
                  this.levelCollisionMap[var9] = new Class47(104, 0, 104);
               }

               this.aClass10_Sub1_Sub1_Sub1_11 = new Pix24(512, 512);
               Jagfile var37 = this.loadArchive(this.archiveChecksum[5], "versionlist", 60, 5, "update list");
               this.drawProgress(60, "Connecting to update server");
               this.aClass33_Sub1_1 = new Class33_Sub1();
               this.aClass33_Sub1_1.method564(var37, this);
               Class22.method165(this.aClass33_Sub1_1.method572(553));
               Model.method268(this.aClass33_Sub1_1.method569(0), this.aClass33_Sub1_1);
               if (!lowMemory) {
                  this.anInt1023 = 0;
                  this.aBoolean260 = true;
                  this.aClass33_Sub1_1.method558(2, this.anInt1023);

                  while(this.aClass33_Sub1_1.method562() > 0) {
                     this.method652();

                     try {
                        Thread.sleep(100L);
                     } catch (Exception var47) {
                     }

                     if (this.aClass33_Sub1_1.anInt797 > 3) {
                        this.method594("ondemand");
                        return;
                     }
                  }
               }

               this.drawProgress(65, "Requesting animations");
               int var38 = this.aClass33_Sub1_1.method569(1);

               int var11;
               for(var11 = 0; var11 < var38; ++var11) {
                  this.aClass33_Sub1_1.method558(1, var11);
               }

               while(this.aClass33_Sub1_1.method562() > 0) {
                  var11 = var38 - this.aClass33_Sub1_1.method562();
                  if (var11 > 0) {
                     this.drawProgress(65, "Loading animations - " + var11 * 100 / var38 + "%");
                  }

                  this.method652();

                  try {
                     Thread.sleep(100L);
                  } catch (Exception var46) {
                  }

                  if (this.aClass33_Sub1_1.anInt797 > 3) {
                     this.method594("ondemand");
                     return;
                  }
               }

               this.drawProgress(70, "Requesting models");
               var38 = this.aClass33_Sub1_1.method569(0);

               int var39;
               for(var11 = 0; var11 < var38; ++var11) {
                  var39 = this.aClass33_Sub1_1.method554(var11);
                  if ((var39 & 1) != 0) {
                     this.aClass33_Sub1_1.method558(0, var11);
                  }
               }

               var38 = this.aClass33_Sub1_1.method562();

               while(this.aClass33_Sub1_1.method562() > 0) {
                  var39 = var38 - this.aClass33_Sub1_1.method562();
                  if (var39 > 0) {
                     this.drawProgress(70, "Loading models - " + var39 * 100 / var38 + "%");
                  }

                  this.method652();

                  try {
                     Thread.sleep(100L);
                  } catch (Exception var45) {
                  }
               }

               if (this.aClass24Array1[0] != null) {
                  this.drawProgress(75, "Requesting maps");
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 48, 0));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 48, 1));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 48, 0));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 48, 1));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(49, 48, 0));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(49, 48, 1));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 47, 0));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 47, 1));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 47, 0));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 47, 1));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 148, 0));
                  this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 148, 1));
                  var38 = this.aClass33_Sub1_1.method562();

                  while(this.aClass33_Sub1_1.method562() > 0) {
                     var39 = var38 - this.aClass33_Sub1_1.method562();
                     if (var39 > 0) {
                        this.drawProgress(75, "Loading maps - " + var39 * 100 / var38 + "%");
                     }

                     this.method652();

                     try {
                        Thread.sleep(100L);
                     } catch (Exception var44) {
                     }
                  }
               }

               var38 = this.aClass33_Sub1_1.method569(0);

               int var14;
               int var40;
               for(var39 = 0; var39 < var38; ++var39) {
                  var40 = this.aClass33_Sub1_1.method554(var39);
                  var14 = 0;
                  if ((var40 & 8) != 0) {
                     var14 = 10;
                  } else if ((var40 & 32) != 0) {
                     var14 = 9;
                  } else if ((var40 & 16) != 0) {
                     var14 = 8;
                  } else if ((var40 & 64) != 0) {
                     var14 = 7;
                  } else if ((var40 & 128) != 0) {
                     var14 = 6;
                  } else if ((var40 & 2) != 0) {
                     var14 = 5;
                  } else if ((var40 & 4) != 0) {
                     var14 = 4;
                  }

                  if ((var40 & 1) != 0) {
                     var14 = 3;
                  }

                  if (var14 != 0) {
                     this.aClass33_Sub1_1.method556(0, (byte)var14, var39);
                  }
               }

               this.aClass33_Sub1_1.method561(members);
               if (!lowMemory) {
                  var38 = this.aClass33_Sub1_1.method569(2);

                  for(var40 = 1; var40 < var38; ++var40) {
                     if (this.aClass33_Sub1_1.method557(var40, aBoolean229)) {
                        this.aClass33_Sub1_1.method556(2, (byte)1, var40);
                     }
                  }
               }

               var38 = this.aClass33_Sub1_1.method569(0);

               for(var40 = 0; var40 < var38; ++var40) {
                  var14 = this.aClass33_Sub1_1.method554(var40);
                  if (var14 == 0 && this.aClass33_Sub1_1.anInt789 < 200) {
                     this.aClass33_Sub1_1.method556(0, (byte)1, var40);
                  }
               }

               this.drawProgress(80, "Unpacking media");
               this.aClass10_Sub1_Sub1_Sub3_16 = new Class10_Sub1_Sub1_Sub3(var5, "invback", 0);
               this.aClass10_Sub1_Sub1_Sub3_18 = new Class10_Sub1_Sub1_Sub3(var5, "chatback", 0);
               this.aClass10_Sub1_Sub1_Sub3_17 = new Class10_Sub1_Sub1_Sub3(var5, "mapback", 0);
               this.aClass10_Sub1_Sub1_Sub3_6 = new Class10_Sub1_Sub1_Sub3(var5, "backbase1", 0);
               this.aClass10_Sub1_Sub1_Sub3_7 = new Class10_Sub1_Sub1_Sub3(var5, "backbase2", 0);
               this.aClass10_Sub1_Sub1_Sub3_8 = new Class10_Sub1_Sub1_Sub3(var5, "backhmid1", 0);

               for(var14 = 0; var14 < 13; ++var14) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[var14] = new Class10_Sub1_Sub1_Sub3(var5, "sideicons", var14);
               }

               this.aClass10_Sub1_Sub1_Sub1_10 = new Pix24(var5, "compass", 0);
               this.aClass10_Sub1_Sub1_Sub1_17 = new Pix24(var5, "mapedge", 0);
               this.aClass10_Sub1_Sub1_Sub1_17.method75();

               int var15;
               for(var15 = 0; var15 < 72; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub3Array5[var15] = new Class10_Sub1_Sub1_Sub3(var5, "mapscene", var15);
               }

               for(var15 = 0; var15 < 70; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub1Array6[var15] = new Pix24(var5, "mapfunction", var15);
               }

               for(var15 = 0; var15 < 5; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub1Array8[var15] = new Pix24(var5, "hitmarks", var15);
               }

               for(var15 = 0; var15 < 6; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub1Array10[var15] = new Pix24(var5, "headicons_pk", var15);
               }

               for(var15 = 0; var15 < 9; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub1Array7[var15] = new Pix24(var5, "headicons_prayer", var15);
               }

               for(var15 = 0; var15 < 6; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub1Array5[var15] = new Pix24(var5, "headicons_hint", var15);
               }

               this.aClass10_Sub1_Sub1_Sub1_7 = new Pix24(var5, "overlay_multiway", 0);
               this.aClass10_Sub1_Sub1_Sub1_5 = new Pix24(var5, "mapmarker", 0);
               this.aClass10_Sub1_Sub1_Sub1_6 = new Pix24(var5, "mapmarker", 1);

               for(var15 = 0; var15 < 8; ++var15) {
                  this.imageCrosses[var15] = new Pix24(var5, "cross", var15);
               }

               this.aClass10_Sub1_Sub1_Sub1_12 = new Pix24(var5, "mapdots", 0);
               this.aClass10_Sub1_Sub1_Sub1_13 = new Pix24(var5, "mapdots", 1);
               this.aClass10_Sub1_Sub1_Sub1_14 = new Pix24(var5, "mapdots", 2);
               this.aClass10_Sub1_Sub1_Sub1_15 = new Pix24(var5, "mapdots", 3);
               this.aClass10_Sub1_Sub1_Sub1_16 = new Pix24(var5, "mapdots", 4);
               this.aClass10_Sub1_Sub1_Sub3_14 = new Class10_Sub1_Sub1_Sub3(var5, "scrollbar", 0);
               this.aClass10_Sub1_Sub1_Sub3_15 = new Class10_Sub1_Sub1_Sub3(var5, "scrollbar", 1);
               this.aClass10_Sub1_Sub1_Sub3_1 = new Class10_Sub1_Sub1_Sub3(var5, "redstone1", 0);
               this.aClass10_Sub1_Sub1_Sub3_2 = new Class10_Sub1_Sub1_Sub3(var5, "redstone2", 0);
               this.aClass10_Sub1_Sub1_Sub3_3 = new Class10_Sub1_Sub1_Sub3(var5, "redstone3", 0);
               this.aClass10_Sub1_Sub1_Sub3_4 = new Class10_Sub1_Sub1_Sub3(var5, "redstone1", 0);
               this.aClass10_Sub1_Sub1_Sub3_4.method437();
               this.aClass10_Sub1_Sub1_Sub3_5 = new Class10_Sub1_Sub1_Sub3(var5, "redstone2", 0);
               this.aClass10_Sub1_Sub1_Sub3_5.method437();
               this.aClass10_Sub1_Sub1_Sub3_9 = new Class10_Sub1_Sub1_Sub3(var5, "redstone1", 0);
               this.aClass10_Sub1_Sub1_Sub3_9.method438();
               this.aClass10_Sub1_Sub1_Sub3_10 = new Class10_Sub1_Sub1_Sub3(var5, "redstone2", 0);
               this.aClass10_Sub1_Sub1_Sub3_10.method438();
               this.aClass10_Sub1_Sub1_Sub3_11 = new Class10_Sub1_Sub1_Sub3(var5, "redstone3", 0);
               this.aClass10_Sub1_Sub1_Sub3_11.method438();
               this.aClass10_Sub1_Sub1_Sub3_12 = new Class10_Sub1_Sub1_Sub3(var5, "redstone1", 0);
               this.aClass10_Sub1_Sub1_Sub3_12.method437();
               this.aClass10_Sub1_Sub1_Sub3_12.method438();
               this.aClass10_Sub1_Sub1_Sub3_13 = new Class10_Sub1_Sub1_Sub3(var5, "redstone2", 0);
               this.aClass10_Sub1_Sub1_Sub3_13.method437();
               this.aClass10_Sub1_Sub1_Sub3_13.method438();

               for(var15 = 0; var15 < 2; ++var15) {
                  this.aClass10_Sub1_Sub1_Sub3Array4[var15] = new Class10_Sub1_Sub1_Sub3(var5, "mod_icons", var15);
               }

               Pix24 var41 = new Pix24(var5, "backleft1", 0);
               this.aClass19_3 = new PixMap(this.getBaseComponent(), var41.width, var41.height);
               var41.method76(0, 0);
               Pix24 var16 = new Pix24(var5, "backleft2", 0);
               this.aClass19_4 = new PixMap(this.getBaseComponent(), var16.width, var16.height);
               var16.method76(0, 0);
               Pix24 var17 = new Pix24(var5, "backright1", 0);
               this.aClass19_5 = new PixMap(this.getBaseComponent(), var17.width, var17.height);
               var17.method76(0, 0);
               Pix24 var18 = new Pix24(var5, "backright2", 0);
               this.aClass19_6 = new PixMap(this.getBaseComponent(), var18.width, var18.height);
               var18.method76(0, 0);
               Pix24 var19 = new Pix24(var5, "backtop1", 0);
               this.aClass19_7 = new PixMap(this.getBaseComponent(), var19.width, var19.height);
               var19.method76(0, 0);
               Pix24 var20 = new Pix24(var5, "backvmid1", 0);
               this.aClass19_8 = new PixMap(this.getBaseComponent(), var20.width, var20.height);
               var20.method76(0, 0);
               Pix24 var21 = new Pix24(var5, "backvmid2", 0);
               this.aClass19_9 = new PixMap(this.getBaseComponent(), var21.width, var21.height);
               var21.method76(0, 0);
               Pix24 var22 = new Pix24(var5, "backvmid3", 0);
               this.aClass19_10 = new PixMap(this.getBaseComponent(), var22.width, var22.height);
               var22.method76(0, 0);
               Pix24 var23 = new Pix24(var5, "backhmid2", 0);
               this.aClass19_11 = new PixMap(this.getBaseComponent(), var23.width, var23.height);
               var23.method76(0, 0);
               int var24 = (int)(Math.random() * 21.0) - 10;
               int var25 = (int)(Math.random() * 21.0) - 10;
               int var26 = (int)(Math.random() * 21.0) - 10;
               int var27 = (int)(Math.random() * 41.0) - 20;

               for(int var28 = 0; var28 < 100; ++var28) {
                  if (this.aClass10_Sub1_Sub1_Sub1Array6[var28] != null) {
                     this.aClass10_Sub1_Sub1_Sub1Array6[var28].translate(var26 + var27, var25 + var27, var24 + var27);
                  }

                  if (this.aClass10_Sub1_Sub1_Sub3Array5[var28] != null) {
                     this.aClass10_Sub1_Sub1_Sub3Array5[var28].method439(var26 + var27, var25 + var27, var24 + var27);
                  }
               }

               this.drawProgress(83, "Unpacking textures");
               Draw3D.unpackTextures(var6);
               Draw3D.setBrightness(0.8);
               Draw3D.initPool();
               this.drawProgress(86, "Unpacking config");
               SeqType.unpack(var36);
               LocType.unpack(var36);
               FloType.unpack(var36);
               ObjType.unpack(var36);
               NpcType.unpack(var36);
               IdkType.unpack(var36);
               SpotAnimType.unpack(var36);
               VarpType.unpack(var36);
               VarbitType.unpack(var36);
               ObjType.aBoolean49 = members;
               if (!lowMemory) {
                  this.drawProgress(90, "Unpacking sounds");
                  byte[] var42 = var8.read("sounds.dat", (byte[])null);
                  Packet var29 = new Packet(var42);
                  Class39.method408(var29);
               }

               this.drawProgress(95, "Unpacking interfaces");
               PixFont[] var49 = new PixFont[]{this.aClass10_Sub1_Sub1_Sub2_2, this.aClass10_Sub1_Sub1_Sub2_3, this.aClass10_Sub1_Sub1_Sub2_4, this.aClass10_Sub1_Sub1_Sub2_5};
               ComType.method91(var49, var4, var5);
               this.drawProgress(100, "Preparing game engine");

               int var30;
               int var31;
               int var32;
               int var43;
               for(var32 = 0; var32 < 33; ++var32) {
                  var43 = 999;
                  var30 = 0;

                  for(var31 = 0; var31 < 34; ++var31) {
                     if (this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16[var31 + var32 * this.aClass10_Sub1_Sub1_Sub3_17.anInt652] == 0) {
                        if (var43 == 999) {
                           var43 = var31;
                        }
                     } else if (var43 != 999) {
                        var30 = var31;
                        break;
                     }
                  }

                  this.anIntArray261[var32] = var43;
                  this.anIntArray267[var32] = var30 - var43;
               }

               for(var43 = 5; var43 < 156; ++var43) {
                  var30 = 999;
                  var31 = 0;

                  for(var32 = 25; var32 < 172; ++var32) {
                     if (this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16[var32 + var43 * this.aClass10_Sub1_Sub1_Sub3_17.anInt652] == 0 && (var32 > 34 || var43 > 34)) {
                        if (var30 == 999) {
                           var30 = var32;
                        }
                     } else if (var30 != 999) {
                        var31 = var32;
                        break;
                     }
                  }

                  this.anIntArray241[var43 - 5] = var30 - 25;
                  this.anIntArray220[var43 - 5] = var31 - var30;
               }

               Draw3D.init3D(503, 765);
               this.anIntArray239 = Draw3D.lineOffset;
               Draw3D.init3D(96, 479);
               this.anIntArray236 = Draw3D.lineOffset;
               Draw3D.init3D(261, 190);
               this.anIntArray237 = Draw3D.lineOffset;
               Draw3D.init3D(334, 512);
               this.anIntArray238 = Draw3D.lineOffset;
               int[] var33 = new int[9];

               for(var31 = 0; var31 < 9; ++var31) {
                  var32 = var31 * 32 + 128 + 15;
                  int var34 = var32 * 3 + 600;
                  int var35 = Draw3D.anIntArray181[var32];
                  var33[var31] = var34 * var35 >> 16;
               }

               World3D.init(var33);
               //WordFilter.unpack(var7);
               this.aClass7_1 = new Class7(this, (byte)-116);
               this.startThread(this.aClass7_1, 10);
               LocEntity.aClient2 = this;
               LocType.aClient4 = this;
               NpcType.aClient3 = this;
            } catch (Exception var48) {
               signlink.reporterror("loaderror " + this.aString25 + " " + this.anInt1048);
               this.aBoolean264 = true;
            }

         }
      }
   }

   protected void unload() {
      this.players = null;
      this.anIntArray229 = null;
      this.anIntArray230 = null;
      this.playerAppearanceBuffer = null;
      this.anIntArray269 = null;
      this.aClass19_3 = null;
      this.aClass19_4 = null;
      this.aClass19_5 = null;
      this.aClass19_6 = null;
      this.aClass10_Sub1_Sub1_Sub3_1 = null;
      this.aClass10_Sub1_Sub1_Sub3_2 = null;
      this.aClass10_Sub1_Sub1_Sub3_3 = null;
      this.aClass10_Sub1_Sub1_Sub3_4 = null;
      this.aClass10_Sub1_Sub1_Sub3_5 = null;
      this.aClass10_Sub1_Sub1_Sub3_9 = null;
      this.aClass10_Sub1_Sub1_Sub3_10 = null;
      this.aClass10_Sub1_Sub1_Sub3_11 = null;
      this.aClass10_Sub1_Sub1_Sub3_12 = null;
      this.aClass10_Sub1_Sub1_Sub3_13 = null;
      this.aStringArray8 = null;
      this.aLongArray4 = null;
      this.anIntArray265 = null;
      this.aClass19_12 = null;
      this.aClass19_13 = null;
      this.aClass19_14 = null;
      this.anIntArray244 = null;
      this.anIntArray216 = null;
      this.aByteArrayArray5 = null;
      this.aByteArrayArray6 = null;
      this.anIntArray217 = null;
      this.anIntArray218 = null;
      this.aClass19_24 = null;
      this.aClass19_25 = null;
      this.aClass19_26 = null;
      this.aClass19_27 = null;
      this.anIntArrayArray22 = null;
      this.anIntArrayArray25 = null;
      this.anIntArray254 = null;
      this.anIntArray255 = null;
      this.aClass10_Sub1_Sub1_Sub1_12 = null;
      this.aClass10_Sub1_Sub1_Sub1_13 = null;
      this.aClass10_Sub1_Sub1_Sub1_14 = null;
      this.aClass10_Sub1_Sub1_Sub1_15 = null;
      this.aClass10_Sub1_Sub1_Sub1_16 = null;
      if (this.aClass7_1 != null) {
         this.aClass7_1.aBoolean12 = false;
      }

      this.aClass7_1 = null;
      this.aClass10_Sub1_Sub1_Sub3_6 = null;
      this.aClass10_Sub1_Sub1_Sub3_7 = null;
      this.aClass10_Sub1_Sub1_Sub3_8 = null;
      this.aClass19_7 = null;
      this.aClass19_8 = null;
      this.aClass19_9 = null;
      this.aClass19_10 = null;
      this.aClass19_11 = null;
      this.anIntArrayArrayArray8 = null;
      this.aByteArrayArrayArray8 = null;
      this.scene = null;
      this.levelCollisionMap = null;
      this.aClass10_Sub1_Sub1_Sub1_11 = null;
      this.aClass19_22 = null;
      this.aClass19_23 = null;
      this.aClass19_19 = null;
      this.aClass19_20 = null;
      this.aClass19_21 = null;
      this.aClass10_Sub1_Sub1_Sub1_10 = null;
      this.aClass10_Sub1_Sub1_Sub1Array8 = null;
      this.aClass10_Sub1_Sub1_Sub1Array10 = null;
      this.aClass10_Sub1_Sub1_Sub1Array7 = null;
      this.aClass10_Sub1_Sub1_Sub1Array5 = null;
      this.imageCrosses = null;
      this.stopMidi();
      this.out = null;
      this.login = null;
      this.in = null;
      this.aClass19_15 = null;
      this.aClass19_16 = null;
      this.areaViewport = null;
      this.aClass19_18 = null;
      this.aClass10_Sub1_Sub1_Sub3_16 = null;
      this.aClass10_Sub1_Sub1_Sub3_17 = null;
      this.aClass10_Sub1_Sub1_Sub3_18 = null;

      try {
         if (this.stream != null) {
            this.stream.close();
         }
      } catch (Exception var3) {
      }

      this.stream = null;
      this.anIntArray246 = null;
      this.anIntArray247 = null;
      this.aClass10_Sub1_Sub1_Sub1Array9 = null;
      this.npcs = null;
      this.anIntArray256 = null;
      this.aByteArray21 = null;
      this.aClass10_Sub1_Sub3_8 = null;
      this.aClass10_Sub1_Sub1_Sub3Array5 = null;
      this.aClass10_Sub1_Sub1_Sub1Array6 = null;
      this.anIntArrayArray23 = null;
      this.aClass10_Sub1_Sub1_Sub3Array2 = null;
      this.projectiles = null;
      this.spotanims = null;
      this.aClass10_Sub1_Sub1_Sub1_7 = null;
      if (this.aClass33_Sub1_1 != null) {
         this.aClass33_Sub1_1.method568();
      }

      this.aClass33_Sub1_1 = null;
      this.anIntArray231 = null;
      this.anIntArray232 = null;
      this.menuAction = null;
      this.anIntArray234 = null;
      this.menuOption = null;
      this.levelObjStacks = null;
      boolean var2 = false;
      this.spawnedLocations = null;
      this.method716();
      LocType.method533();
      NpcType.method401();
      ObjType.method114();
      ComType.method94();
      FloType.aClass16Array1 = null;
      IdkType.instances = null;
      Class4.aClass4Array1 = null;
      SeqType.aClass15Array1 = null;
      SpotAnimType.aClass28Array1 = null;
      SpotAnimType.aClass34_5 = null;
      VarpType.aClass44Array1 = null;
      super.gameSurface = null;
      PlayerEntity.aClass34_9 = null;
      Draw3D.method506();
      World3D.method189();
      Model.method267();
      Class22.method167();
      System.gc();
   }

   private int getHeightmapY(int var1, int var2, int var3) {
      int var4 = var2 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var3;
         if (var3 < 3 && (this.aByteArrayArrayArray8[1][var4][var5] & 2) == 2) {
            var6 = var3 + 1;
         }

         int var7 = var2 & 127;
         int var8 = var1 & 127;
         int var9 = this.anIntArrayArrayArray8[var6][var4][var5] * (128 - var7) + this.anIntArrayArrayArray8[var6][var4 + 1][var5] * var7 >> 7;
         int var10 = this.anIntArrayArrayArray8[var6][var4][var5 + 1] * (128 - var7) + this.anIntArrayArrayArray8[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var9 * (128 - var8) + var10 * var8 >> 7;
      } else {
         return 0;
      }
   }

   private void method694(boolean var1) {
      if (localPlayer.x >> 7 == this.anInt955 && localPlayer.z >> 7 == this.anInt956) {
         this.anInt955 = 0;
      }

      int var2 = this.playerCount;
      if (var1) {
         var2 = 1;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         PlayerEntity var4;
         int var5;
         if (var1) {
            var4 = localPlayer;
            var5 = this.anInt883 << 14;
         } else {
            var4 = this.players[this.anIntArray229[var3]];
            var5 = this.anIntArray229[var3] << 14;
         }

         if (var4 != null && var4.isVisible()) {
            var4.aBoolean200 = false;
            if ((lowMemory && this.playerCount > 50 || this.playerCount > 200) && !var1 && var4.anInt719 == var4.anInt760) {
               var4.aBoolean200 = true;
            }

            int var6 = var4.x >> 7;
            int var7 = var4.z >> 7;
            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
               if (var4.aClass10_Sub1_Sub2_Sub4_2 != null && anInt1050 >= var4.anInt771 && anInt1050 < var4.anInt772) {
                  var4.aBoolean200 = false;
                  var4.anInt766 = this.getHeightmapY(var4.z, var4.x, this.currentLevel);
                  this.scene.method202(var4.anInt766, var4.anInt775, var4, var4.anInt774, var4.z, var4.anInt777, var4.x, var4.anInt741, var4.anInt776, this.currentLevel, var5);
               } else {
                  if ((var4.x & 127) == 64 && (var4.z & 127) == 64) {
                     if (this.anIntArrayArray23[var6][var7] == this.sceneCycle) {
                        continue;
                     }

                     this.anIntArrayArray23[var6][var7] = this.sceneCycle;
                  }

                  var4.anInt766 = this.getHeightmapY(var4.z, var4.x, this.currentLevel);
                  this.scene.method201(var5, var4, var4.x, var4.anInt766, var4.aBoolean196, this.currentLevel, 60, var4.z, var4.anInt741);
               }
            }
         }
      }

   }

   private void prepareGameScreen() {
      if (this.aClass19_18 == null) {
         this.method716();
         super.gameSurface = null;
         this.aClass19_19 = null;
         this.aClass19_20 = null;
         this.aClass19_21 = null;
         this.aClass19_22 = null;
         this.aClass19_23 = null;
         this.aClass19_24 = null;
         this.aClass19_25 = null;
         this.aClass19_26 = null;
         this.aClass19_27 = null;
         this.aClass19_18 = new PixMap(this.getBaseComponent(), 479, 96);
         this.aClass19_16 = new PixMap(this.getBaseComponent(), 172, 156);
         Draw2D.clear();
         this.aClass10_Sub1_Sub1_Sub3_17.method440(0, 0);
         this.aClass19_15 = new PixMap(this.getBaseComponent(), 190, 261);
         this.areaViewport = new PixMap(this.getBaseComponent(), 512, 334);
         Draw2D.clear();
         this.aClass19_12 = new PixMap(this.getBaseComponent(), 496, 50);
         this.aClass19_13 = new PixMap(this.getBaseComponent(), 269, 37);
         this.aClass19_14 = new PixMap(this.getBaseComponent(), 249, 45);
         this.aBoolean236 = true;
         this.areaViewport.method130();
         Draw3D.lineOffset = this.anIntArray238;
      }

   }

   private int method719() {
      for(int var1 = 0; var1 < this.aByteArrayArray5.length; ++var1) {
         if (this.aByteArrayArray5[var1] == null && this.anIntArray217[var1] != -1) {
            return -1;
         }

         if (this.aByteArrayArray6[var1] == null && this.anIntArray218[var1] != -1) {
            return -2;
         }
      }

      boolean var6 = true;

      for(int var2 = 0; var2 < this.aByteArrayArray5.length; ++var2) {
         byte[] var3 = this.aByteArrayArray6[var2];
         if (var3 != null) {
            int var4 = (this.anIntArray216[var2] >> 8) * 64 - this.sceneBaseTileX;
            int var5 = (this.anIntArray216[var2] & 255) * 64 - this.sceneBaseTileZ;
            if (this.aBoolean247) {
               var4 = 10;
               var5 = 10;
            }

            var6 &= World.method29(var4, var5, var3);
         }
      }

      if (!var6) {
         return -3;
      } else if (this.aBoolean251) {
         return -4;
      } else {
         this.sceneState = 2;
         World.anInt60 = this.currentLevel;
         this.method668(175);
         this.out.p1isaac(6);
         return 0;
      }
   }

   public Socket openSocket(int var1) throws IOException {
      return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), var1) : signlink.opensocket(var1);
   }

   private int method704(int var1, ComType var2) {
      if (var2.anIntArrayArray5 != null && var1 < var2.anIntArrayArray5.length) {
         try {
            int[] var3 = var2.anIntArrayArray5[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = this.anIntArray242[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = this.anIntArray245[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = this.anIntArray214[var3[var5++]];
               }

               ComType var10;
               int var11;
               int var12;
               if (var7 == 4) {
                  var10 = ComType.method87(var3[var5++]);
                  var11 = var3[var5++];
                  if (var11 >= 0 && var11 < ObjType.anInt179 && (!ObjType.method104(var11).aBoolean54 || members)) {
                     for(var12 = 0; var12 < var10.anIntArray44.length; ++var12) {
                        if (var10.anIntArray44[var12] == var11 + 1) {
                           var8 += var10.anIntArray40[var12];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = this.anIntArray244[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = anIntArray228[this.anIntArray245[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = this.anIntArray244[var3[var5++]] * 100 / 46875;
               }

               if (var7 == 8) {
                  var8 = localPlayer.anInt767;
               }

               int var13;
               if (var7 == 9) {
                  for(var13 = 0; var13 < Class43.anInt612; ++var13) {
                     if (Class43.aBooleanArray8[var13]) {
                        var8 += this.anIntArray245[var13];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = ComType.method87(var3[var5++]);
                  var11 = var3[var5++] + 1;
                  if (var11 >= 0 && var11 < ObjType.anInt179 && (!ObjType.method104(var11).aBoolean54 || members)) {
                     for(var12 = 0; var12 < var10.anIntArray44.length; ++var12) {
                        if (var10.anIntArray44[var12] == var11) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = this.anInt1049;
               }

               if (var7 == 12) {
                  var8 = this.anInt911;
               }

               if (var7 == 13) {
                  var13 = this.anIntArray244[var3[var5++]];
                  var11 = var3[var5++];
                  var8 = (var13 & 1 << var11) == 0 ? 0 : 1;
               }

               if (var7 == 14) {
                  var13 = var3[var5++];
                  VarbitType var14 = VarbitType.aClass50Array1[var13];
                  var12 = var14.anInt800;
                  int var15 = var14.anInt801;
                  int var16 = var14.anInt802;
                  int var17 = anIntArray262[var16 - var15];
                  var8 = this.anIntArray244[var12] >> var15 & var17;
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (var7 == 17) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = (localPlayer.x >> 7) + this.sceneBaseTileX;
               }

               if (var7 == 19) {
                  var8 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
               }

               if (var7 == 20) {
                  var8 = var3[var5++];
               }

               if (var9 == 0) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var18) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   private void method616(int var1, boolean var2, Packet var3) {
      var3.accessBits((byte)6);
      int var4 = var3.gBit(1);
      if (var4 != 0) {
         int var5 = var3.gBit(2);
         this.ingame &= var2;
         if (var5 == 0) {
            this.anIntArray230[this.anInt885++] = this.anInt883;
         } else {
            int var6;
            int var7;
            if (var5 == 1) {
               var6 = var3.gBit(3);
               localPlayer.method540(false, var6);
               var7 = var3.gBit(1);
               if (var7 == 1) {
                  this.anIntArray230[this.anInt885++] = this.anInt883;
               }
            } else {
               int var8;
               if (var5 == 2) {
                  var6 = var3.gBit(3);
                  localPlayer.method540(true, var6);
                  var7 = var3.gBit(3);
                  localPlayer.method540(true, var7);
                  var8 = var3.gBit(1);
                  if (var8 == 1) {
                     this.anIntArray230[this.anInt885++] = this.anInt883;
                  }
               } else if (var5 == 3) {
                  var6 = var3.gBit(1);
                  this.currentLevel = var3.gBit(2);
                  var7 = var3.gBit(7);
                  var8 = var3.gBit(7);
                  int var9 = var3.gBit(1);
                  if (var9 == 1) {
                     this.anIntArray230[this.anInt885++] = this.anInt883;
                  }

                  localPlayer.method542(var7, (byte)5, var6 == 1, var8);
               }
            }
         }
      }

   }

   protected void refresh() {
      this.aBoolean236 = true;
   }

   private void method622(String var1, String var2, int var3) {
      if (var3 == 0 && this.anInt985 != -1) {
         this.aString26 = var2;
         super.anInt821 = 0;
      }

      if (this.anInt888 == -1) {
         this.aBoolean255 = true;
      }

      for(int var4 = 99; var4 > 0; --var4) {
         this.messageType[var4] = this.messageType[var4 - 1];
         this.messageSender[var4] = this.messageSender[var4 - 1];
         this.messageText[var4] = this.messageText[var4 - 1];
      }

      if (this.aByte46 != -123) {
         this.anInt964 = this.randomIn.nextInt();
      }

      this.messageType[0] = var3;
      this.messageSender[0] = var1;
      this.messageText[0] = var2;
   }

   private void method632(int var1, boolean var2) {
      boolean var3 = false;

      for(int var4 = 0; var4 < this.npcCount; ++var4) {
         NpcEntity var5 = this.npcs[this.anIntArray256[var4]];
         int var6 = (this.anIntArray256[var4] << 14) + 536870912;
         if (var5 != null && var5.isVisible() && var5.type.aBoolean143 == var2 && var5.type.method403()) {
            int var7 = var5.x >> 7;
            int var8 = var5.z >> 7;
            if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
               if (var5.anInt730 == 1 && (var5.x & 127) == 64 && (var5.z & 127) == 64) {
                  if (this.anIntArrayArray23[var7][var8] == this.sceneCycle) {
                     continue;
                  }

                  this.anIntArrayArray23[var7][var8] = this.sceneCycle;
               }

               if (!var5.type.aBoolean141) {
                  var6 -= Integer.MIN_VALUE;
               }

               this.scene.method201(var6, var5, var5.x, this.getHeightmapY(var5.z, var5.x, this.currentLevel), var5.aBoolean196, this.currentLevel, (var5.anInt730 - 1) * 64 + 60, var5.z, var5.anInt741);
            }
         }
      }

   }

   private void method621(int var1, Packet var2) {
      var2.accessBits((byte)6);
      int var3 = var2.gBit(8);
      if (this.aByte52 != -58) {
         this.anInt1029 = -460;
      }

      int var4;
      if (var3 < this.npcCount) {
         for(var4 = var3; var4 < this.npcCount; ++var4) {
            this.anIntArray269[this.anInt1034++] = this.anIntArray256[var4];
         }
      }

      if (var3 > this.npcCount) {
         signlink.reporterror(this.username + " Too many npcs");
         throw new RuntimeException("eek");
      } else {
         this.npcCount = 0;

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = this.anIntArray256[var4];
            NpcEntity var6 = this.npcs[var5];
            int var7 = var2.gBit(1);
            if (var7 == 0) {
               this.anIntArray256[this.npcCount++] = var5;
               var6.anInt718 = anInt1050;
            } else {
               int var8 = var2.gBit(2);
               if (var8 == 0) {
                  this.anIntArray256[this.npcCount++] = var5;
                  var6.anInt718 = anInt1050;
                  this.anIntArray230[this.anInt885++] = var5;
               } else {
                  int var9;
                  int var10;
                  if (var8 == 1) {
                     this.anIntArray256[this.npcCount++] = var5;
                     var6.anInt718 = anInt1050;
                     var9 = var2.gBit(3);
                     var6.method540(false, var9);
                     var10 = var2.gBit(1);
                     if (var10 == 1) {
                        this.anIntArray230[this.anInt885++] = var5;
                     }
                  } else if (var8 == 2) {
                     this.anIntArray256[this.npcCount++] = var5;
                     var6.anInt718 = anInt1050;
                     var9 = var2.gBit(3);
                     var6.method540(true, var9);
                     var10 = var2.gBit(3);
                     var6.method540(true, var10);
                     int var11 = var2.gBit(1);
                     if (var11 == 1) {
                        this.anIntArray230[this.anInt885++] = var5;
                     }
                  } else if (var8 == 3) {
                     this.anIntArray269[this.anInt1034++] = var5;
                  }
               }
            }
         }

      }
   }

   private void method689(int var1, Packet var2) {
      int var3 = var2.gBit(8);
      int var4;
      if (var3 < this.playerCount) {
         for(var4 = var3; var4 < this.playerCount; ++var4) {
            this.anIntArray269[this.anInt1034++] = this.anIntArray229[var4];
         }
      }

      if (var3 > this.playerCount) {
         signlink.reporterror(this.username + " Too many players");
         throw new RuntimeException("eek");
      } else {
         this.playerCount = 0;

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = this.anIntArray229[var4];
            PlayerEntity var6 = this.players[var5];
            int var7 = var2.gBit(1);
            if (var7 == 0) {
               this.anIntArray229[this.playerCount++] = var5;
               var6.anInt718 = anInt1050;
            } else {
               int var8 = var2.gBit(2);
               if (var8 == 0) {
                  this.anIntArray229[this.playerCount++] = var5;
                  var6.anInt718 = anInt1050;
                  this.anIntArray230[this.anInt885++] = var5;
               } else {
                  int var9;
                  int var10;
                  if (var8 == 1) {
                     this.anIntArray229[this.playerCount++] = var5;
                     var6.anInt718 = anInt1050;
                     var9 = var2.gBit(3);
                     var6.method540(false, var9);
                     var10 = var2.gBit(1);
                     if (var10 == 1) {
                        this.anIntArray230[this.anInt885++] = var5;
                     }
                  } else if (var8 == 2) {
                     this.anIntArray229[this.playerCount++] = var5;
                     var6.anInt718 = anInt1050;
                     var9 = var2.gBit(3);
                     var6.method540(true, var9);
                     var10 = var2.gBit(3);
                     var6.method540(true, var10);
                     int var11 = var2.gBit(1);
                     if (var11 == 1) {
                        this.anIntArray230[this.anInt885++] = var5;
                     }
                  } else if (var8 == 3) {
                     this.anIntArray269[this.anInt1034++] = var5;
                  }
               }
            }
         }

      }
   }

   private void method643(int var1, PathingEntity var2) {
      if (var2.x < 128 || var2.z < 128 || var2.x >= 13184 || var2.z >= 13184) {
         var2.anInt753 = -1;
         var2.anInt743 = -1;
         var2.anInt735 = 0;
         var2.anInt736 = 0;
         var2.x = var2.anIntArray193[0] * 128 + var2.anInt730 * 64;
         var2.z = var2.anIntArray194[0] * 128 + var2.anInt730 * 64;
         var2.method538();
      }

      if (var2 == localPlayer && (var2.x < 1536 || var2.z < 1536 || var2.x >= 11776 || var2.z >= 11776)) {
         var2.anInt753 = -1;
         var2.anInt743 = -1;
         var2.anInt735 = 0;
         var2.anInt736 = 0;
         var2.x = var2.anIntArray193[0] * 128 + var2.anInt730 * 64;
         var2.z = var2.anIntArray194[0] * 128 + var2.anInt730 * 64;
         var2.method538();
      }

      if (var2.anInt735 > anInt1050) {
         this.method644(var2);
      } else if (var2.anInt736 >= anInt1050) {
         this.method645(var2);
      } else {
         this.method646(var2);
      }

      this.method647(var2);
      this.method648(var2);
   }

   private void drawTitleScreen(boolean var1) {
      this.method639();
      this.aClass19_21.method130();
      this.aClass10_Sub1_Sub1_Sub3_19.method440(0, 0);
      byte var2;
      int var3;
      if (this.titleScreenState == 0) {
         this.aClass10_Sub1_Sub1_Sub2_2.method149(true, this.anInt928, 7711145, 180, 180, this.aClass33_Sub1_1.aString15);
         var2 = 80;
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 80, 180, "Welcome to RuneScape");
         var3 = var2 + 30;
         this.aClass10_Sub1_Sub1_Sub3_20.method440(100, 27);
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 125, 100, "New User");
         this.aClass10_Sub1_Sub1_Sub3_20.method440(100, 187);
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 125, 260, "Existing User");
      }

      if (this.titleScreenState == 2) {
         var2 = 60;
         if (this.loginMessage0.length() > 0) {
            this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 45, 180, this.loginMessage0);
            this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 60, 180, this.loginMessage1);
            var3 = var2 + 30;
         } else {
            this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 53, 180, this.loginMessage1);
            var3 = var2 + 30;
         }

         this.aClass10_Sub1_Sub1_Sub2_4.method156(16777215, 90, 90, true, "Username: " + this.username + (this.anInt886 == 0 & anInt1050 % 40 < 20 ? "@yel@|" : ""));
         var3 += 15;
         this.aClass10_Sub1_Sub1_Sub2_4.method156(16777215, 92, 105, true, "Password: " + Class26.method253(this.password) + (this.anInt886 == 1 & anInt1050 % 40 < 20 ? "@yel@|" : ""));
         var3 += 15;
         if (!var1) {
            this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 27);
            this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 100, "Login");
            this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 187);
            this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 260, "Cancel");
         }
      }

      if (this.titleScreenState == 3) {
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 40, 180, "Create a free account");
         var2 = 65;
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 65, 180, "To create a new account you need to");
         var3 = var2 + 15;
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 80, 180, "go back to the main RuneScape webpage");
         var3 += 15;
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 95, 180, "and choose the 'create account'");
         var3 += 15;
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 110, 180, "button near the top of that page.");
         var3 += 15;
         this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 107);
         this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 180, "Cancel");
      }

      this.aClass19_21.draw(171, 202, super.graphics);
      if (this.aBoolean236) {
         this.aBoolean236 = false;
         this.aClass19_19.draw(0, 128, super.graphics);
         this.aClass19_20.draw(371, 202, super.graphics);
         this.aClass19_24.draw(265, 0, super.graphics);
         this.aClass19_25.draw(265, 562, super.graphics);
         this.aClass19_26.draw(171, 128, super.graphics);
         this.aClass19_27.draw(171, 562, super.graphics);
      }

   }

   private void resetInterface(int var2) {
      ComType.resetInterface(var2);
   }

   private void method715(Class10_Sub2 var1) {
      int var2 = 0;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var1.anInt455 == 0) {
         var2 = this.scene.method216(var1.anInt454, var1.anInt456, var1.anInt457);
      }

      if (var1.anInt455 == 1) {
         var2 = this.scene.method217(var1.anInt456, var1.anInt454, var1.anInt457);
      }

      if (var1.anInt455 == 2) {
         var2 = this.scene.method218(var1.anInt454, var1.anInt456, var1.anInt457);
      }

      if (var1.anInt455 == 3) {
         var2 = this.scene.method219(var1.anInt454, var1.anInt456, var1.anInt457);
      }

      if (var2 != 0) {
         int var6 = this.scene.method220(var1.anInt454, var1.anInt456, var1.anInt457, var2);
         var3 = var2 >> 14 & 32767;
         var4 = var6 & 31;
         var5 = var6 >> 6;
      }

      var1.anInt450 = var3;
      var1.anInt452 = var4;
      var1.anInt451 = var5;
   }

   private boolean updateInterfaceAnimation(int var1, int var2) {
      boolean var4 = false;
      ComType var5 = ComType.method87(var2);

      for(int var6 = 0; var6 < var5.childId.length && var5.childId[var6] != -1; ++var6) {
         ComType var7 = ComType.method87(var5.childId[var6]);
         if (var7.type == 0) {
            var4 |= this.updateInterfaceAnimation(var1, var7.id);
         }

         int var8;
         if (var7.type == 6 && (var7.anInt148 != -1 || var7.anInt149 != -1)) {
            boolean var9 = this.method670(var7);
            if (var9) {
               var8 = var7.anInt149;
            } else {
               var8 = var7.anInt148;
            }

            if (var8 != -1) {
               SeqType var10 = SeqType.aClass15Array1[var8];

               for(var7.seqCycle += var1; var7.seqCycle > var10.method97(var7.seqFrame); var4 = true) {
                  var7.seqCycle -= var10.method97(var7.seqFrame);
                  ++var7.seqFrame;
                  if (var7.seqFrame >= var10.anInt152) {
                     var7.seqFrame -= var10.anInt153;
                     if (var7.seqFrame < 0 || var7.seqFrame >= var10.anInt152) {
                        var7.seqFrame = 0;
                     }
                  }
               }
            }
         }

         if (var7.type == 6 && var7.anInt112 != 0) {
            int var13 = var7.anInt112 >> 16;
            var8 = var7.anInt112 << 16 >> 16;
            int var11 = var13 * var1;
            var8 *= var1;
            var7.anInt130 = var7.anInt130 + var11 & 2047;
            var7.anInt131 = var7.anInt131 + var8 & 2047;
            var4 = true;
         }
      }

      boolean var12 = false;
      return var4;
   }

   private void method591(int var1, byte var2, Packet var3) {
      while(true) {
         if (var3.bitPos + 10 < var1 * 8) {
            int var4 = var3.gBit(11);
            if (var4 != 2047) {
               if (this.players[var4] == null) {
                  this.players[var4] = new PlayerEntity();
                  if (this.playerAppearanceBuffer[var4] != null) {
                     this.players[var4].method545(this.playerAppearanceBuffer[var4]);
                  }
               }

               this.anIntArray229[this.playerCount++] = var4;
               PlayerEntity var5 = this.players[var4];
               var5.anInt718 = anInt1050;
               int var6 = var3.gBit(5);
               if (var6 > 15) {
                  var6 -= 32;
               }

               int var7 = var3.gBit(1);
               if (var7 == 1) {
                  this.anIntArray230[this.anInt885++] = var4;
               }

               int var8 = var3.gBit(1);
               int var9 = var3.gBit(5);
               if (var9 > 15) {
                  var9 -= 32;
               }

               var5.method542(localPlayer.anIntArray194[0] + var9, (byte)5, var8 == 1, localPlayer.anIntArray193[0] + var6);
               continue;
            }
         }

         var3.accessBytes();
         boolean var10 = false;
         return;
      }
   }

   private void method707(Packet var1, int var2) {
      while(true) {
         if (var1.bitPos + 21 < var2 * 8) {
            int var3 = var1.gBit(14);
            if (var3 != 16383) {
               if (this.npcs[var3] == null) {
                  this.npcs[var3] = new NpcEntity();
               }

               NpcEntity var4 = this.npcs[var3];
               this.anIntArray256[this.npcCount++] = var3;
               var4.anInt718 = anInt1050;
               int var5 = var1.gBit(1);
               if (var5 == 1) {
                  this.anIntArray230[this.anInt885++] = var3;
               }

               int var6 = var1.gBit(5);
               if (var6 > 15) {
                  var6 -= 32;
               }

               int var7 = var1.gBit(5);
               if (var7 > 15) {
                  var7 -= 32;
               }

               int var8 = var1.gBit(1);
               var4.type = NpcType.method407(var1.gBit(13));
               var4.anInt730 = var4.type.aByte31;
               var4.anInt729 = var4.type.anInt579;
               var4.anInt748 = var4.type.anInt576;
               var4.anInt749 = var4.type.anInt575;
               var4.anInt750 = var4.type.anInt574;
               var4.anInt751 = var4.type.anInt569;
               var4.anInt760 = var4.type.anInt564;
               var4.method542(localPlayer.anIntArray194[0] + var6, (byte)5, var8 == 1, localPlayer.anIntArray193[0] + var7);
               continue;
            }
         }

         var1.accessBytes();
         return;
      }
   }

   private void method638(int var1, PlayerEntity var2, int var3, Packet var4) {
      int var5;
      int var6;
      int var7;
      if ((var3 & 8) != 0) {
         var5 = var4.g2();
         if (var5 == 65535) {
            var5 = -1;
         }

         var6 = var4.method332(this.anInt1006);
         if (var5 == var2.anInt753 && var5 != -1) {
            var7 = SeqType.aClass15Array1[var5].anInt160;
            if (var7 == 1) {
               var2.anInt754 = 0;
               var2.anInt755 = 0;
               var2.anInt756 = var6;
               var2.anInt757 = 0;
            }

            if (var7 == 2) {
               var2.anInt757 = 0;
            }
         } else if (var5 == -1 || var2.anInt753 == -1 || SeqType.aClass15Array1[var5].anInt154 >= SeqType.aClass15Array1[var2.anInt753].anInt154) {
            var2.anInt753 = var5;
            var2.anInt754 = 0;
            var2.anInt755 = 0;
            var2.anInt756 = var6;
            var2.anInt757 = 0;
            var2.anInt742 = var2.anInt759;
         }
      }

      if ((var3 & 16) != 0) {
         var2.aString13 = var4.gjstr();
         if (var2.aString13.charAt(0) == '~') {
            var2.aString13 = var2.aString13.substring(1);
            this.method622(var2.name, var2.aString13, 2);
         } else if (var2 == localPlayer) {
            this.method622(var2.name, var2.aString13, 2);
         }

         var2.anInt716 = 0;
         var2.anInt722 = 0;
         var2.anInt715 = 150;
      }

      if ((var3 & 256) != 0) {
         var2.anInt731 = var4.method330();
         var2.anInt733 = var4.method331();
         var2.anInt732 = var4.method332(this.anInt1006);
         var2.anInt734 = var4.g1();
         var2.anInt735 = var4.g2() + anInt1050;
         var2.anInt736 = var4.method340() + anInt1050;
         var2.anInt737 = var4.g1();
         var2.method538();
      }

      if ((var3 & 1) != 0) {
         var2.anInt738 = var4.method340();
         if (var2.anInt738 == 65535) {
            var2.anInt738 = -1;
         }
      }

      if ((var3 & 2) != 0) {
         var2.anInt727 = var4.g2();
         var2.anInt728 = var4.g2();
      }

      if ((var3 & 512) != 0) {
         var2.anInt743 = var4.method340();
         var5 = var4.method346();
         var2.anInt747 = var5 >> 16;
         var2.anInt746 = anInt1050 + (var5 & 65535);
         var2.anInt744 = 0;
         var2.anInt745 = 0;
         if (var2.anInt746 > anInt1050) {
            var2.anInt744 = -1;
         }

         if (var2.anInt743 == 65535) {
            var2.anInt743 = -1;
         }
      }

      if ((var3 & 4) != 0) {
         var5 = var4.g1();
         byte[] var8 = new byte[var5];
         Packet var9 = new Packet(var8);
         var4.method348(var8, var5);
         this.playerAppearanceBuffer[var1] = var9;
         var2.method545(var9);
      }

      if ((var3 & 1024) != 0) {
         var5 = var4.method330();
         var6 = var4.method332(this.anInt1006);
         var2.method541(anInt1050, var5, var6);
         var2.anInt724 = anInt1050 + 300;
         var2.anInt725 = var4.method331();
         var2.anInt726 = var4.g1();
      }

      if ((var3 & 64) != 0) {
         var5 = var4.g2();
         var6 = var4.method331();
         var7 = var4.method330();
         int var14 = var4.pos;
         if (var2.name != null && var2.visible) {
            long var15 = Class26.method248(var2.name);
            boolean var11 = false;
            if (var6 <= 1) {
               for(int var12 = 0; var12 < this.anInt837; ++var12) {
                  if (this.aLongArray3[var12] == var15) {
                     var11 = true;
                     break;
                  }
               }
            }

            if (!var11 && this.anInt1011 == 0) {
               try {
                  this.aClass10_Sub1_Sub3_8.pos = 0;
                  var4.method349(this.aClass10_Sub1_Sub3_8.data, var7);
                  this.aClass10_Sub1_Sub3_8.pos = 0;
                  String var17 = WordPack.unpack(this.aClass10_Sub1_Sub3_8, var7);
                  String var13 = WordFilter.method452(var17);
                  var2.aString13 = var13;
                  var2.anInt716 = var5 >> 8;
                  var2.anInt722 = var5 & 255;
                  var2.anInt715 = 150;
                  if (var6 != 2 && var6 != 3) {
                     if (var6 == 1) {
                        this.method622("@cr1@" + var2.name, var13, 1);
                     } else {
                        this.method622(var2.name, var13, 2);
                     }
                  } else {
                     this.method622("@cr2@" + var2.name, var13, 1);
                  }
               } catch (Exception var18) {
                  signlink.reporterror("cde2");
               }
            }
         }

         var4.pos = var14 + var7;
      }

      if ((var3 & 128) != 0) {
         var5 = var4.method332(this.anInt1006);
         var6 = var4.method331();
         var2.method541(anInt1050, var5, var6);
         var2.anInt724 = anInt1050 + 300;
         var2.anInt725 = var4.method332(this.anInt1006);
         var2.anInt726 = var4.g1();
      }

   }

   private boolean method608() {
      if (this.stream == null) {
         return false;
      } else {
         String var1;
         int var2;
         try {
            int var3 = this.stream.available();
            if (var3 == 0) {
               return false;
            }

            if (this.packetType == -1) {
               this.stream.read(this.in.data, 0, 1);
               this.packetType = this.in.data[0] & 255;
               if (this.randomIn != null) {
                  this.packetType = this.packetType - this.randomIn.nextInt() & 255;
               }

               this.packetSize = Class13.anIntArray34[this.packetType];
               --var3;
            }

            if (this.packetSize == -1) {
               if (var3 <= 0) {
                  return false;
               }

               this.stream.read(this.in.data, 0, 1);
               this.packetSize = this.in.data[0] & 255;
               --var3;
            }

            if (this.packetSize == -2) {
               if (var3 <= 1) {
                  return false;
               }

               this.stream.read(this.in.data, 0, 2);
               this.in.pos = 0;
               this.packetSize = this.in.g2();
               var3 -= 2;
            }

            if (var3 < this.packetSize) {
               return false;
            }

            this.in.pos = 0;
            this.stream.read(this.in.data, 0, this.packetSize);
            this.idleNetCycles = 0;
            this.lastPacketType2 = this.lastPacketType1;
            this.lastPacketType1 = this.lastPacketType0;
            this.lastPacketType0 = this.packetType;
            int i1;
            int var5;
            if (this.packetType == 166) {
               i1 = this.in.method342();
               var2 = this.in.method342();
               var5 = this.in.g2();
               ComType var6 = ComType.method87(var5);
               var6.x = var2;
               var6.y = i1;
               this.packetType = -1;
               return true;
            }

            int var28;
            if (this.packetType == 186) {
               i1 = this.in.method340();
               var2 = this.in.method341();
               var5 = this.in.method340();
               var28 = this.in.g2u();
               ComType.method87(var2).anInt130 = i1;
               ComType.method87(var2).anInt131 = var28;
               ComType.method87(var2).anInt129 = var5;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 216) {
               i1 = this.in.method341();
               var2 = this.in.method341();
               ComType.method87(var2).anInt145 = 1;
               ComType.method87(var2).anInt146 = i1;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 26) {
               i1 = this.in.g2();
               var2 = this.in.g1();
               var5 = this.in.g2();
               if (var5 == 65535) {
                  if (this.waveCount < 50) {
                     this.anIntArray251[this.waveCount] = (short)i1;
                     this.anIntArray275[this.waveCount] = var2;
                     this.anIntArray264[this.waveCount] = 0;
                     ++this.waveCount;
                  }
               } else if (this.waveEnabled && !lowMemory && this.waveCount < 50) {
                  this.anIntArray251[this.waveCount] = i1;
                  this.anIntArray275[this.waveCount] = var2;
                  this.anIntArray264[this.waveCount] = var5 + Class39.anIntArray171[i1];
                  ++this.waveCount;
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 182) {
               i1 = this.in.method340();
               byte var39 = this.in.method335();
               this.anIntArray240[i1] = var39;
               if (this.anIntArray244[i1] != var39) {
                  this.anIntArray244[i1] = var39;
                  this.method680(i1);
                  this.aBoolean248 = true;
                  if (this.anInt985 != -1) {
                     this.aBoolean255 = true;
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 13) {
               for(i1 = 0; i1 < this.players.length; ++i1) {
                  if (this.players[i1] != null) {
                     this.players[i1].anInt753 = -1;
                  }
               }

               for(var2 = 0; var2 < this.npcs.length; ++var2) {
                  if (this.npcs[var2] != null) {
                     this.npcs[var2].anInt753 = -1;
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 156) {
               this.anInt923 = this.in.g1();
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 162) {
               i1 = this.in.method340();
               var2 = this.in.g2u();
               ComType.method87(var2).anInt145 = 2;
               ComType.method87(var2).anInt146 = i1;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 109) {
               i1 = this.in.g2();
               this.resetInterfaceAnimation(i1);
               if (this.sidebarInterfaceId != -1) {
                  this.resetInterface(this.sidebarInterfaceId);
                  this.sidebarInterfaceId = -1;
                  this.aBoolean248 = true;
                  this.aBoolean225 = true;
               }

               if (this.anInt926 != -1) {
                  this.resetInterface(this.anInt926);
                  this.anInt926 = -1;
                  this.aBoolean236 = true;
               }

               if (this.anInt880 != -1) {
                  this.resetInterface(this.anInt880);
                  this.anInt880 = -1;
               }

               if (this.viewportInterfaceId != -1) {
                  this.resetInterface(this.viewportInterfaceId);
                  this.viewportInterfaceId = -1;
               }

               if (this.anInt888 != i1) {
                  this.resetInterface(this.anInt888);
                  this.anInt888 = i1;
               }

               this.aBoolean254 = false;
               this.aBoolean255 = true;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 220) {
               i1 = this.in.method341();
               if (i1 == 65535) {
                  i1 = -1;
               }

               if (i1 != this.anInt1051 && this.midiActive && !lowMemory && this.nextMusicDelay == 0) {
                  this.anInt1023 = i1;
                  this.aBoolean260 = true;
                  this.aClass33_Sub1_1.method558(2, this.anInt1023);
               }

               this.anInt1051 = i1;
               this.packetType = -1;
               return true;
            }

            //PLAY_MIDI
            //256 is a bitchin track btw
            if (this.packetType == 249) {
               i1 = this.in.g2u(); //ID
               var2 = this.in.g3u(); //DELAY
               System.out.println(i1);
               if (this.midiActive && !lowMemory) {
                  this.anInt1023 = i1;
                  this.aBoolean260 = false;
                  this.aClass33_Sub1_1.method558(2, this.anInt1023);
                  this.nextMusicDelay = var2;
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 158) {
               i1 = this.in.method342();
               if (i1 != this.anInt985) {
                  this.resetInterface(this.anInt985);
                  this.anInt985 = i1;
               }

               this.aBoolean255 = true;
               this.packetType = -1;
               return true;
            }

            int var7;
            if (this.packetType == 218) {
               i1 = this.in.g2();
               var2 = this.in.method340();
               var5 = var2 >> 10 & 31;
               var28 = var2 >> 5 & 31;
               var7 = var2 & 31;
               ComType.method87(i1).anInt122 = (var5 << 19) + (var28 << 11) + (var7 << 3);
               this.packetType = -1;
               return true;
            }

            String var8;
            if (this.packetType == 157) {
               i1 = this.in.method331();
               var8 = this.in.gjstr();
               var5 = this.in.g1();
               if (i1 >= 1 && i1 <= 5) {
                  if (var8.equalsIgnoreCase("null")) {
                     var8 = null;
                  }

                  this.aStringArray11[i1 - 1] = var8;
                  this.aBooleanArray12[i1 - 1] = var5 == 0;
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 6) {
               this.aBoolean216 = false;
               this.anInt1010 = 2;
               this.aString20 = "";
               this.aBoolean255 = true;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 201) {
               this.publicChatSetting = this.in.g1();
               this.anInt853 = this.in.g1();
               this.anInt1000 = this.in.g1();
               this.aBoolean253 = true;
               this.aBoolean255 = true;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 199) {
               this.hintType = this.in.g1();
               if (this.hintType == 1) {
                  this.anInt999 = this.in.g2();
               }

               if (this.hintType >= 2 && this.hintType <= 6) {
                  if (this.hintType == 2) {
                     this.anInt831 = 64;
                     this.anInt832 = 64;
                  }

                  if (this.hintType == 3) {
                     this.anInt831 = 0;
                     this.anInt832 = 64;
                  }

                  if (this.hintType == 4) {
                     this.anInt831 = 128;
                     this.anInt832 = 64;
                  }

                  if (this.hintType == 5) {
                     this.anInt831 = 64;
                     this.anInt832 = 0;
                  }

                  if (this.hintType == 6) {
                     this.anInt831 = 64;
                     this.anInt832 = 128;
                  }

                  this.hintType = 2;
                  this.anInt828 = this.in.g2();
                  this.anInt829 = this.in.g2();
                  this.anInt830 = this.in.g1();
               }

               if (this.hintType == 10) {
                  this.anInt969 = this.in.g2();
               }

               this.packetType = -1;
               return true;
            }

            int var9;
            int var10;
            if (this.packetType == 167) {
               this.cutscene = true;
               this.anInt892 = this.in.g1();
               this.anInt893 = this.in.g1();
               this.anInt894 = this.in.g2();
               this.anInt895 = this.in.g1();
               this.anInt896 = this.in.g1();
               if (this.anInt896 >= 100) {
                  i1 = this.anInt892 * 128 + 64;
                  var2 = this.anInt893 * 128 + 64;
                  var5 = this.getHeightmapY(var2, i1, this.currentLevel) - this.anInt894;
                  var28 = i1 - this.cameraX;
                  var7 = var5 - this.cameraY;
                  var9 = var2 - this.cameraZ;
                  var10 = (int)Math.sqrt((double)(var28 * var28 + var9 * var9));
                  this.cameraPitch = (int)(Math.atan2((double)var7, (double)var10) * 325.949) & 2047;
                  this.cameraYaw = (int)(Math.atan2((double)var28, (double)var9) * -325.949) & 2047;
                  if (this.cameraPitch < 128) {
                     this.cameraPitch = 128;
                  }

                  if (this.cameraPitch > 383) {
                     this.cameraPitch = 383;
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 5) {
               this.logout();
               this.packetType = -1;
               return false;
            }

            if (this.packetType == 115) {
               i1 = this.in.method347();
               var2 = this.in.g2u();
               this.anIntArray240[var2] = i1;
               if (this.anIntArray244[var2] != i1) {
                  this.anIntArray244[var2] = i1;
                  this.method680(var2);
                  this.aBoolean248 = true;
                  if (this.anInt985 != -1) {
                     this.aBoolean255 = true;
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 29) {
               if (this.sidebarInterfaceId != -1) {
                  this.resetInterface(this.sidebarInterfaceId);
                  this.sidebarInterfaceId = -1;
                  this.aBoolean248 = true;
                  this.aBoolean225 = true;
               }

               if (this.anInt888 != -1) {
                  this.resetInterface(this.anInt888);
                  this.anInt888 = -1;
                  this.aBoolean255 = true;
               }

               if (this.anInt926 != -1) {
                  this.resetInterface(this.anInt926);
                  this.anInt926 = -1;
                  this.aBoolean236 = true;
               }

               if (this.anInt880 != -1) {
                  this.resetInterface(this.anInt880);
                  this.anInt880 = -1;
               }

               if (this.viewportInterfaceId != -1) {
                  this.resetInterface(this.viewportInterfaceId);
                  this.viewportInterfaceId = -1;
               }

               if (this.anInt1010 != 0) {
                  this.anInt1010 = 0;
                  this.aBoolean255 = true;
               }

               this.aBoolean254 = false;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 76) {
               this.anInt939 = this.in.g2u();
               this.anInt935 = this.in.method341();
               this.in.g2();
               this.anInt987 = this.in.g2();
               this.anInt977 = this.in.g2u();
               this.anInt1025 = this.in.method340();
               this.anInt989 = this.in.method340();
               this.anInt891 = this.in.g2();
               this.anInt1009 = this.in.method345();
               this.anInt912 = this.in.method341();
               this.in.method330();
               signlink.dnslookup(Class26.method251(this.anInt1009));
               this.packetType = -1;
               return true;
            }

            boolean var11;
            String var12;
            if (this.packetType == 63) {
               var1 = this.in.gjstr();
               long var13;
               if (var1.endsWith(":tradereq:")) {
                  var8 = var1.substring(0, var1.indexOf(":"));
                  var13 = Class26.method248(var8);
                  var11 = false;

                  for(var9 = 0; var9 < this.anInt837; ++var9) {
                     if (this.aLongArray3[var9] == var13) {
                        var11 = true;
                        break;
                     }
                  }

                  if (!var11 && this.anInt1011 == 0) {
                     this.method622(var8, "wishes to trade with you.", 4);
                  }
               } else if (var1.endsWith(":duelreq:")) {
                  var8 = var1.substring(0, var1.indexOf(":"));
                  var13 = Class26.method248(var8);
                  var11 = false;

                  for(var9 = 0; var9 < this.anInt837; ++var9) {
                     if (this.aLongArray3[var9] == var13) {
                        var11 = true;
                        break;
                     }
                  }

                  if (!var11 && this.anInt1011 == 0) {
                     this.method622(var8, "wishes to duel with you.", 8);
                  }
               } else if (!var1.endsWith(":chalreq:")) {
                  this.method622("", var1, 0);
               } else {
                  var8 = var1.substring(0, var1.indexOf(":"));
                  var13 = Class26.method248(var8);
                  var11 = false;

                  for(var9 = 0; var9 < this.anInt837; ++var9) {
                     if (this.aLongArray3[var9] == var13) {
                        var11 = true;
                        break;
                     }
                  }

                  if (!var11 && this.anInt1011 == 0) {
                     var12 = var1.substring(var1.indexOf(":") + 1, var1.length() - 9);
                     this.method622(var8, var12, 8);
                  }
               }

               this.packetType = -1;
               return true;
            }

            //OPEN_OVERLAY
            if (this.packetType == 50) {
               i1 = this.in.g2b();
               if (i1 >= 0) {
                  this.resetInterfaceAnimation(i1);
               }

               if (i1 != this.currentOverlay) {
                  this.resetInterface(this.currentOverlay);
                  this.currentOverlay = i1;
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 82) {
               boolean var29 = this.in.g1() == 1;
               var2 = this.in.g2();
               ComType.method87(var2).hide = var29;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 174) {
               if (this.anInt1031 == 12) {
                  this.aBoolean248 = true;
               }

               this.anInt911 = this.in.g2b();
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 233) {
               this.anInt1047 = this.in.g1();
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 61) {
               this.anInt955 = 0;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 128) {
               i1 = this.in.method340();
               var2 = this.in.method341();
               if (this.anInt888 != -1) {
                  this.resetInterface(this.anInt888);
                  this.anInt888 = -1;
                  this.aBoolean255 = true;
               }

               if (this.anInt926 != -1) {
                  this.resetInterface(this.anInt926);
                  this.anInt926 = -1;
                  this.aBoolean236 = true;
               }

               if (this.anInt880 != -1) {
                  this.resetInterface(this.anInt880);
                  this.anInt880 = -1;
               }

               if (this.viewportInterfaceId != i1) {
                  this.resetInterface(this.viewportInterfaceId);
                  this.viewportInterfaceId = i1;
               }

               if (this.sidebarInterfaceId != var2) {
                  this.resetInterface(this.sidebarInterfaceId);
                  this.sidebarInterfaceId = var2;
               }

               if (this.anInt1010 != 0) {
                  this.anInt1010 = 0;
                  this.aBoolean255 = true;
               }

               this.aBoolean248 = true;
               this.aBoolean225 = true;
               this.aBoolean254 = false;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 67) {
               i1 = this.in.g1();
               var2 = this.in.g1();
               var5 = this.in.g1();
               var28 = this.in.g1();
               this.cameraModifierEnabled[i1] = true;
               this.cameraModifierJitter[i1] = var2;
               this.cameraModifierWobbleScale[i1] = var5;
               this.cameraModifierWobbleSpeed[i1] = var28;
               this.cameraModifierCycle[i1] = 0;
               this.packetType = -1;
               return true;
            }

            ComType var30;
            if (this.packetType == 134) {
               this.aBoolean248 = true;
               i1 = this.in.g2();
               var30 = ComType.method87(i1);

               while(this.in.pos < this.packetSize) {
                  var5 = this.in.gsmarts();
                  var28 = this.in.g2();
                  var7 = this.in.g1();
                  if (var7 == 255) {
                     var7 = this.in.g4();
                  }

                  if (var5 >= 0 && var5 < var30.anIntArray44.length) {
                     var30.anIntArray44[var5] = var28;
                     var30.anIntArray40[var5] = var7;
                  }
               }

               this.packetType = -1;
               return true;
            }

            int var14;
            long var15;
            if (this.packetType == 78) {
               var15 = this.in.g8();
               var5 = this.in.g1();
               String var46 = Class26.method252(Class26.method249(var15), (byte)7);

               for(var7 = 0; var7 < this.anInt838; ++var7) {
                  if (var15 == this.aLongArray4[var7]) {
                     if (this.anIntArray265[var7] != var5) {
                        this.anIntArray265[var7] = var5;
                        this.aBoolean248 = true;
                        if (var5 > 0) {
                           this.method622("", var46 + " has logged in.", 5);
                        }

                        if (var5 == 0) {
                           this.method622("", var46 + " has logged out.", 5);
                        }
                     }

                     var46 = null;
                     break;
                  }
               }

               if (var46 != null && this.anInt838 < 200) {
                  this.aLongArray4[this.anInt838] = var15;
                  this.aStringArray8[this.anInt838] = var46;
                  this.anIntArray265[this.anInt838] = var5;
                  ++this.anInt838;
                  this.aBoolean248 = true;
               }

               boolean var47 = false;

               while(!var47) {
                  var47 = true;

                  for(var10 = 0; var10 < this.anInt838 - 1; ++var10) {
                     if (this.anIntArray265[var10] != nodeId && this.anIntArray265[var10 + 1] == nodeId || this.anIntArray265[var10] == 0 && this.anIntArray265[var10 + 1] != 0) {
                        var14 = this.anIntArray265[var10];
                        this.anIntArray265[var10] = this.anIntArray265[var10 + 1];
                        this.anIntArray265[var10 + 1] = var14;
                        String var19 = this.aStringArray8[var10];
                        this.aStringArray8[var10] = this.aStringArray8[var10 + 1];
                        this.aStringArray8[var10 + 1] = var19;
                        long var20 = this.aLongArray4[var10];
                        this.aLongArray4[var10] = this.aLongArray4[var10 + 1];
                        this.aLongArray4[var10 + 1] = var20;
                        this.aBoolean248 = true;
                        var47 = false;
                     }
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 58) {
               this.aBoolean216 = false;
               this.anInt1010 = 1;
               this.aString20 = "";
               this.aBoolean255 = true;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 252) {
               this.anInt1031 = this.in.method331();
               this.aBoolean248 = true;
               this.aBoolean225 = true;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 40) {
               this.anInt890 = this.in.method332(this.anInt1006);
               this.anInt889 = this.in.method331();

               for(i1 = this.anInt889; i1 < this.anInt889 + 8; ++i1) {
                  for(var2 = this.anInt890; var2 < this.anInt890 + 8; ++var2) {
                     if (this.levelObjStacks[this.currentLevel][i1][var2] != null) {
                        this.levelObjStacks[this.currentLevel][i1][var2] = null;
                        this.method601(i1, var2);
                     }
                  }
               }

               for(Class10_Sub2 var45 = (Class10_Sub2)this.spawnedLocations.method6(); var45 != null; var45 = (Class10_Sub2)this.spawnedLocations.method8()) {
                  if (var45.anInt456 >= this.anInt889 && var45.anInt456 < this.anInt889 + 8 && var45.anInt457 >= this.anInt890 && var45.anInt457 < this.anInt890 + 8 && var45.anInt454 == this.currentLevel) {
                     var45.anInt453 = 0;
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 255) {
               i1 = this.in.method341();
               ComType.method87(i1).anInt145 = 3;
               if (localPlayer.aClass38_2 == null) {
                  ComType.method87(i1).anInt146 = (localPlayer.anIntArray199[0] << 25) + (localPlayer.anIntArray199[4] << 20) + (localPlayer.appearances[0] << 15) + (localPlayer.appearances[8] << 10) + (localPlayer.appearances[11] << 5) + localPlayer.appearances[1];
               } else {
                  ComType.method87(i1).anInt146 = (int)(localPlayer.aClass38_2.aLong19 + 305419896L);
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 135) {
               var15 = this.in.g8();
               var5 = this.in.g4();
               var28 = this.in.g1();
               var11 = false;

               for(var9 = 0; var9 < 100; ++var9) {
                  if (this.anIntArray263[var9] == var5) {
                     var11 = true;
                     break;
                  }
               }

               if (var28 <= 1) {
                  for(var10 = 0; var10 < this.anInt837; ++var10) {
                     if (this.aLongArray3[var10] == var15) {
                        var11 = true;
                        break;
                     }
                  }
               }

               if (!var11 && this.anInt1011 == 0) {
                  try {
                     this.anIntArray263[this.anInt970] = var5;
                     this.anInt970 = (this.anInt970 + 1) % 100;
                     var12 = WordPack.unpack(this.in, this.packetSize - 13);
                     if (var28 != 3) {
                        var12 = WordFilter.method452(var12);
                     }

                     if (var28 != 2 && var28 != 3) {
                        if (var28 == 1) {
                           this.method622("@cr1@" + Class26.method252(Class26.method249(var15), (byte)7), var12, 7);
                        } else {
                           this.method622(Class26.method252(Class26.method249(var15), (byte)7), var12, 3);
                        }
                     } else {
                        this.method622("@cr2@" + Class26.method252(Class26.method249(var15), (byte)7), var12, 7);
                     }
                  } catch (Exception var36) {
                     signlink.reporterror("cde1");
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 183) {
               this.anInt889 = this.in.g1();
               this.anInt890 = this.in.method330();

               while(this.in.pos < this.packetSize) {
                  i1 = this.in.g1();
                  this.method708(this.in, i1);
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 159) {
               i1 = this.in.method341();
               this.resetInterfaceAnimation(i1);
               if (this.sidebarInterfaceId != -1) {
                  this.resetInterface(this.sidebarInterfaceId);
                  this.sidebarInterfaceId = -1;
                  this.aBoolean248 = true;
                  this.aBoolean225 = true;
               }

               if (this.anInt888 != -1) {
                  this.resetInterface(this.anInt888);
                  this.anInt888 = -1;
                  this.aBoolean255 = true;
               }

               if (this.anInt926 != -1) {
                  this.resetInterface(this.anInt926);
                  this.anInt926 = -1;
                  this.aBoolean236 = true;
               }

               if (this.anInt880 != -1) {
                  this.resetInterface(this.anInt880);
                  this.anInt880 = -1;
               }

               if (this.viewportInterfaceId != i1) {
                  this.resetInterface(this.viewportInterfaceId);
                  this.viewportInterfaceId = i1;
               }

               if (this.anInt1010 != 0) {
                  this.anInt1010 = 0;
                  this.aBoolean255 = true;
               }

               this.aBoolean254 = false;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 246) {
               i1 = this.in.method341();
               this.resetInterfaceAnimation(i1);
               if (this.anInt888 != -1) {
                  this.resetInterface(this.anInt888);
                  this.anInt888 = -1;
                  this.aBoolean255 = true;
               }

               if (this.anInt926 != -1) {
                  this.resetInterface(this.anInt926);
                  this.anInt926 = -1;
                  this.aBoolean236 = true;
               }

               if (this.anInt880 != -1) {
                  this.resetInterface(this.anInt880);
                  this.anInt880 = -1;
               }

               if (this.viewportInterfaceId != -1) {
                  this.resetInterface(this.viewportInterfaceId);
                  this.viewportInterfaceId = -1;
               }

               if (this.sidebarInterfaceId != i1) {
                  this.resetInterface(this.sidebarInterfaceId);
                  this.sidebarInterfaceId = i1;
               }

               if (this.anInt1010 != 0) {
                  this.anInt1010 = 0;
                  this.aBoolean255 = true;
               }

               this.aBoolean248 = true;
               this.aBoolean225 = true;
               this.aBoolean254 = false;
               this.packetType = -1;
               return true;
            }

            if (this.packetType == 49) {
               this.aBoolean248 = true;
               i1 = this.in.method331();
               var2 = this.in.g1();
               var5 = this.in.g4();
               this.anIntArray214[i1] = var5;
               this.anIntArray242[i1] = var2;
               this.anIntArray245[i1] = 1;

               for(var28 = 0; var28 < 98; ++var28) {
                  if (var5 >= anIntArray228[var28]) {
                     this.anIntArray245[i1] = var28 + 2;
                  }
               }

               this.packetType = -1;
               return true;
            }

            if (this.packetType == 206) {
               this.aBoolean248 = true;
               i1 = this.in.g2();
               var30 = ComType.method87(i1);
               var5 = this.in.g2();

               for(var28 = 0; var28 < var5; ++var28) {
                  var30.anIntArray44[var28] = this.in.method341();
                  var7 = this.in.method331();
                  if (var7 == 255) {
                     var7 = this.in.method345();
                  }

                  var30.anIntArray40[var28] = var7;
               }

               for(var7 = var5; var7 < var30.anIntArray44.length; ++var7) {
                  var30.anIntArray44[var7] = 0;
                  var30.anIntArray40[var7] = 0;
               }

               this.packetType = -1;
               return true;
            }

            int var18;
            if (this.packetType != 222 && this.packetType != 53) {
               if (this.packetType == 190) {
                  this.systemUpdateTimer = this.in.g2u() * 30;
                  this.packetType = -1;
                  return true;
               }

               if (this.packetType != 41 && this.packetType != 121 && this.packetType != 203 && this.packetType != 106 && this.packetType != 59 && this.packetType != 181 && this.packetType != 208 && this.packetType != 107 && this.packetType != 142 && this.packetType != 88 && this.packetType != 152) {
                  if (this.packetType == 125) {
                     if (this.anInt1031 == 12) {
                        this.aBoolean248 = true;
                     }

                     this.anInt1049 = this.in.g1();
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 21) {
                     i1 = this.in.g2();
                     var2 = this.in.g2u();
                     var5 = this.in.method341();
                     if (var2 == 65535) {
                        ComType.method87(var5).anInt145 = 0;
                        this.packetType = -1;
                        return true;
                     }

                     ObjType var43 = ObjType.method104(var2);
                     ComType.method87(var5).anInt145 = 4;
                     ComType.method87(var5).anInt146 = var2;
                     ComType.method87(var5).anInt130 = var43.anInt192;
                     ComType.method87(var5).anInt131 = var43.anInt189;
                     ComType.method87(var5).anInt129 = var43.anInt200 * 100 / i1;
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 3) {
                     this.cutscene = true;
                     this.anInt848 = this.in.g1();
                     this.anInt849 = this.in.g1();
                     this.anInt850 = this.in.g2();
                     this.anInt851 = this.in.g1();
                     this.anInt852 = this.in.g1();
                     if (this.anInt852 >= 100) {
                        this.cameraX = this.anInt848 * 128 + 64;
                        this.cameraZ = this.anInt849 * 128 + 64;
                        this.cameraY = this.getHeightmapY(this.cameraZ, this.cameraX, this.currentLevel) - this.anInt850;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  ComType var42;
                  if (this.packetType == 2) {
                     i1 = this.in.method341();
                     var2 = this.in.method343();
                     var42 = ComType.method87(i1);
                     if (var42.anInt148 != var2 || var2 == -1) {
                        var42.anInt148 = var2;
                        var42.seqFrame = 0;
                        var42.seqCycle = 0;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 71) {
                     this.method623(this.in, this.aBoolean235, this.packetSize);
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 226) {
                     this.anInt837 = this.packetSize / 8;

                     for(i1 = 0; i1 < this.anInt837; ++i1) {
                        this.aLongArray3[i1] = this.in.g8();
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 10) {
                     i1 = this.in.method332(this.anInt1006);
                     var2 = this.in.method340();
                     if (var2 == 65535) {
                        var2 = -1;
                     }

                     if (this.anIntArray248[i1] != var2) {
                        this.resetInterface(this.anIntArray248[i1]);
                        this.anIntArray248[i1] = var2;
                     }

                     this.aBoolean248 = true;
                     this.aBoolean225 = true;
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 219) {
                     i1 = this.in.g2u();
                     var30 = ComType.method87(i1);

                     for(var5 = 0; var5 < var30.anIntArray44.length; ++var5) {
                        var30.anIntArray44[var5] = -1;
                        var30.anIntArray44[var5] = 0;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 238) {
                     this.anInt988 = this.in.g1();
                     if (this.anInt988 == this.anInt1031) {
                        if (this.anInt988 == 3) {
                           this.anInt1031 = 1;
                        } else {
                           this.anInt1031 = 3;
                        }

                        this.aBoolean248 = true;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 148) {
                     this.cutscene = false;

                     for(i1 = 0; i1 < 5; ++i1) {
                        this.cameraModifierEnabled[i1] = false;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 126) {
                     this.anInt932 = this.in.g1();
                     this.anInt881 = this.in.g2u();
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 75) {
                     this.anInt889 = this.in.method331();
                     this.anInt890 = this.in.method330();
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 253) {
                     i1 = this.in.g2u();
                     var2 = this.in.method340();
                     this.resetInterfaceAnimation(var2);
                     if (i1 != -1) {
                        this.resetInterfaceAnimation(i1);
                     }

                     if (this.viewportInterfaceId != -1) {
                        this.resetInterface(this.viewportInterfaceId);
                        this.viewportInterfaceId = -1;
                     }

                     if (this.sidebarInterfaceId != -1) {
                        this.resetInterface(this.sidebarInterfaceId);
                        this.sidebarInterfaceId = -1;
                     }

                     if (this.anInt888 != -1) {
                        this.resetInterface(this.anInt888);
                        this.anInt888 = -1;
                     }

                     if (this.anInt926 != var2) {
                        this.resetInterface(this.anInt926);
                        this.anInt926 = var2;
                     }

                     if (this.anInt880 != var2) {
                        this.resetInterface(this.anInt880);
                        this.anInt880 = i1;
                     }

                     this.anInt1010 = 0;
                     this.aBoolean254 = false;
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 251) {
                     this.anInt839 = this.in.g1();
                     this.aBoolean248 = true;
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 18) {
                     i1 = this.in.g2();
                     var2 = this.in.method340();
                     var5 = this.in.g2u();
                     ComType.method87(var2).anInt112 = (i1 << 16) + var5;
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 90) {
                     this.method671(this.packetSize, 69, this.in);
                     this.aBoolean251 = false;
                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 113) {
                     for(i1 = 0; i1 < this.anIntArray244.length; ++i1) {
                        if (this.anIntArray244[i1] != this.anIntArray240[i1]) {
                           this.anIntArray244[i1] = this.anIntArray240[i1];
                           this.method680(i1);
                           this.aBoolean248 = true;
                        }
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 232) {
                     i1 = this.in.method341();
                     var8 = this.in.gjstr();
                     ComType.method87(i1).aString2 = var8;
                     var18 = this.anIntArray248[this.anInt1031];
                     if (ComType.method87(i1).anInt128 == var18) {
                        this.aBoolean248 = true;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  if (this.packetType == 200) {
                     i1 = this.in.g2();
                     var2 = this.in.method341();
                     var42 = ComType.method87(i1);
                     if (var42 != null && var42.type == 0) {
                        if (var2 < 0) {
                           var2 = 0;
                        }

                        if (var2 > var42.scroll - var42.height) {
                           var2 = var42.scroll - var42.height;
                        }

                        var42.scrollPosition = var2;
                     }

                     this.packetType = -1;
                     return true;
                  }

                  signlink.reporterror("T1 - " + this.packetType + "," + this.packetSize + " - " + this.lastPacketType1 + "," + this.lastPacketType2);
                  this.logout();
                  return true;
               }

               this.method708(this.in, this.packetType);
               this.packetType = -1;
               return true;
            }

            i1 = this.anInt854;
            var2 = this.anInt855;
            if (this.packetType == 222) {
               var2 = this.in.g2();
               i1 = this.in.method341();
               this.aBoolean247 = false;
            }

            if (this.packetType == 53) {
               i1 = this.in.method340();
               this.in.accessBits((byte)6);
               var5 = 0;

               while(true) {
                  if (var5 >= 4) {
                     this.in.accessBytes();
                     var2 = this.in.method340();
                     this.aBoolean247 = true;
                     break;
                  }

                  for(var28 = 0; var28 < 13; ++var28) {
                     for(var7 = 0; var7 < 13; ++var7) {
                        var9 = this.in.gBit(1);
                        if (var9 == 1) {
                           this.anIntArrayArrayArray7[var5][var28][var7] = this.in.gBit(26);
                        } else {
                           this.anIntArrayArrayArray7[var5][var28][var7] = -1;
                        }
                     }
                  }

                  ++var5;
               }
            }

            if (this.anInt854 == i1 && this.anInt855 == var2 && this.sceneState == 2) {
               this.packetType = -1;
               return true;
            }

            this.anInt854 = i1;
            this.anInt855 = var2;
            this.sceneBaseTileX = (this.anInt854 - 6) * 8;
            this.sceneBaseTileZ = (this.anInt855 - 6) * 8;
            this.aBoolean238 = false;
            if ((this.anInt854 / 8 == 48 || this.anInt854 / 8 == 49) && this.anInt855 / 8 == 48) {
               this.aBoolean238 = true;
            }

            if (this.anInt854 / 8 == 48 && this.anInt855 / 8 == 148) {
               this.aBoolean238 = true;
            }

            this.sceneState = 1;
            this.loginTime = System.currentTimeMillis();
            this.method700((String)null, "Loading - please wait.");
            if (this.packetType == 222) {
               var5 = 0;
               var28 = (this.anInt854 - 6) / 8;

               label1409:
               while(true) {
                  if (var28 > (this.anInt854 + 6) / 8) {
                     this.aByteArrayArray5 = new byte[var5][];
                     this.aByteArrayArray6 = new byte[var5][];
                     this.anIntArray216 = new int[var5];
                     this.anIntArray217 = new int[var5];
                     this.anIntArray218 = new int[var5];
                     var5 = 0;
                     var7 = (this.anInt854 - 6) / 8;

                     while(true) {
                        if (var7 > (this.anInt854 + 6) / 8) {
                           break label1409;
                        }

                        for(var9 = (this.anInt855 - 6) / 8; var9 <= (this.anInt855 + 6) / 8; ++var9) {
                           this.anIntArray216[var5] = (var7 << 8) + var9;
                           if (this.aBoolean238 && (var9 == 49 || var9 == 149 || var9 == 147 || var7 == 50 || var7 == 49 && var9 == 47)) {
                              this.anIntArray217[var5] = -1;
                              this.anIntArray218[var5] = -1;
                              ++var5;
                           } else {
                              var10 = this.anIntArray217[var5] = this.aClass33_Sub1_1.method573(var7, var9, 0);
                              if (var10 != -1) {
                                 this.aClass33_Sub1_1.method558(3, var10);
                              }

                              var14 = this.anIntArray218[var5] = this.aClass33_Sub1_1.method573(var7, var9, 1);
                              if (var14 != -1) {
                                 this.aClass33_Sub1_1.method558(3, var14);
                              }

                              ++var5;
                           }
                        }

                        ++var7;
                     }
                  }

                  for(var7 = (this.anInt855 - 6) / 8; var7 <= (this.anInt855 + 6) / 8; ++var7) {
                     ++var5;
                  }

                  ++var28;
               }
            }

            if (this.packetType == 53) {
               var5 = 0;
               int[] var17 = new int[676];
               var7 = 0;

               label1370:
               while(true) {
                  int var31;
                  int var32;
                  if (var7 >= 4) {
                     this.aByteArrayArray5 = new byte[var5][];
                     this.aByteArrayArray6 = new byte[var5][];
                     this.anIntArray216 = new int[var5];
                     this.anIntArray217 = new int[var5];
                     this.anIntArray218 = new int[var5];
                     var9 = 0;

                     while(true) {
                        if (var9 >= var5) {
                           break label1370;
                        }

                        var10 = this.anIntArray216[var9] = var17[var9];
                        var14 = var10 >> 8 & 255;
                        var18 = var10 & 255;
                        var31 = this.anIntArray217[var9] = this.aClass33_Sub1_1.method573(var14, var18, 0);
                        if (var31 != -1) {
                           this.aClass33_Sub1_1.method558(3, var31);
                        }

                        var32 = this.anIntArray218[var9] = this.aClass33_Sub1_1.method573(var14, var18, 1);
                        if (var32 != -1) {
                           this.aClass33_Sub1_1.method558(3, var32);
                        }

                        ++var9;
                     }
                  }

                  for(var9 = 0; var9 < 13; ++var9) {
                     for(var10 = 0; var10 < 13; ++var10) {
                        var14 = this.anIntArrayArrayArray7[var7][var9][var10];
                        if (var14 != -1) {
                           var18 = var14 >> 14 & 1023;
                           var31 = var14 >> 3 & 2047;
                           var32 = (var18 / 8 << 8) + var31 / 8;

                           for(int var21 = 0; var21 < var5; ++var21) {
                              if (var17[var21] == var32) {
                                 var32 = -1;
                                 break;
                              }
                           }

                           if (var32 != -1) {
                              var17[var5++] = var32;
                           }
                        }
                     }
                  }

                  ++var7;
               }
            }

            var5 = this.sceneBaseTileX - this.anInt916;
            var28 = this.sceneBaseTileZ - this.anInt917;
            this.anInt916 = this.sceneBaseTileX;
            this.anInt917 = this.sceneBaseTileZ;

            int[] var10000;
            for(var7 = 0; var7 < 16384; ++var7) {
               NpcEntity var40 = this.npcs[var7];
               if (var40 != null) {
                  for(var10 = 0; var10 < 10; ++var10) {
                     var10000 = var40.anIntArray193;
                     var10000[var10] -= var5;
                     var10000 = var40.anIntArray194;
                     var10000[var10] -= var28;
                  }

                  var40.x -= var5 * 128;
                  var40.z -= var28 * 128;
               }
            }

            for(var9 = 0; var9 < this.MAX_PLAYER_COUNT; ++var9) {
               PlayerEntity var41 = this.players[var9];
               if (var41 != null) {
                  for(var14 = 0; var14 < 10; ++var14) {
                     var10000 = var41.anIntArray193;
                     var10000[var14] -= var5;
                     var10000 = var41.anIntArray194;
                     var10000[var14] -= var28;
                  }

                  var41.x -= var5 * 128;
                  var41.z -= var28 * 128;
               }
            }

            this.aBoolean251 = true;
            byte var33 = 0;
            byte var44 = 104;
            byte var49 = 1;
            if (var5 < 0) {
               var33 = 103;
               var44 = -1;
               var49 = -1;
            }

            byte var50 = 0;
            byte var48 = 104;
            byte var22 = 1;
            if (var28 < 0) {
               var50 = 103;
               var48 = -1;
               var22 = -1;
            }

            for(int var23 = var33; var23 != var44; var23 += var49) {
               for(int var24 = var50; var24 != var48; var24 += var22) {
                  int var25 = var23 + var5;
                  int var26 = var24 + var28;

                  for(int var27 = 0; var27 < 4; ++var27) {
                     if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        this.levelObjStacks[var27][var23][var24] = this.levelObjStacks[var27][var25][var26];
                     } else {
                        this.levelObjStacks[var27][var23][var24] = null;
                     }
                  }
               }
            }

            for(Class10_Sub2 var34 = (Class10_Sub2)this.spawnedLocations.method6(); var34 != null; var34 = (Class10_Sub2)this.spawnedLocations.method8()) {
               var34.anInt456 -= var5;
               var34.anInt457 -= var28;
               if (var34.anInt456 < 0 || var34.anInt457 < 0 || var34.anInt456 >= 104 || var34.anInt457 >= 104) {
                  var34.unlink();
               }
            }

            if (this.anInt955 != 0) {
               this.anInt955 -= var5;
               this.anInt956 -= var28;
            }

            this.cutscene = false;
            this.packetType = -1;
            return true;
         } catch (IOException var37) {
            this.tryReconnect();
         } catch (Exception var38) {
            var1 = "T2 - " + this.packetType + "," + this.lastPacketType1 + "," + this.lastPacketType2 + " - " + this.packetSize + "," + (this.sceneBaseTileX + localPlayer.anIntArray193[0]) + "," + (this.sceneBaseTileZ + localPlayer.anIntArray194[0]) + " - ";

            for(var2 = 0; var2 < this.packetSize && var2 < 50; ++var2) {
               var1 = var1 + this.in.data[var2] + ",";
            }

            signlink.reporterror(var1);
            this.logout();
         }

         return true;
      }
   }

   private void method656(byte var1) {
      int var2;
      int var3;
      for(var3 = 10; var3 < 117; ++var3) {
         var2 = (int)(Math.random() * 100.0);
         if (var2 < 50) {
            this.anIntArray249[var3 + 32512] = 255;
         }
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 100; ++var2) {
         var3 = (int)(Math.random() * 124.0) + 2;
         var4 = (int)(Math.random() * 128.0) + 128;
         var5 = var3 + (var4 << 7);
         this.anIntArray249[var5] = 192;
      }

      for(var3 = 1; var3 < 255; ++var3) {
         for(var4 = 1; var4 < 127; ++var4) {
            var5 = var4 + (var3 << 7);
            this.anIntArray250[var5] = (this.anIntArray249[var5 - 1] + this.anIntArray249[var5 + 1] + this.anIntArray249[var5 - 128] + this.anIntArray249[var5 + 128]) / 4;
         }
      }

      this.anInt1008 += 128;
      if (this.anInt1008 > this.anIntArray259.length) {
         this.anInt1008 -= this.anIntArray259.length;
         var4 = (int)(Math.random() * 12.0);
         this.method658(this.aClass10_Sub1_Sub1_Sub3Array3[var4]);
      }

      int var6;
      for(var4 = 1; var4 < 255; ++var4) {
         for(var5 = 1; var5 < 127; ++var5) {
            var6 = var5 + (var4 << 7);
            int var7 = this.anIntArray250[var6 + 128] - this.anIntArray259[var6 + this.anInt1008 & this.anIntArray259.length - 1] / 5;
            if (var7 < 0) {
               var7 = 0;
            }

            this.anIntArray249[var6] = var7;
         }
      }

      boolean var8 = false;

      for(var5 = 0; var5 < 255; ++var5) {
         this.anIntArray258[var5] = this.anIntArray258[var5 + 1];
      }

      this.anIntArray258[255] = (int)(Math.sin((double)anInt1050 / 14.0) * 16.0 + Math.sin((double)anInt1050 / 15.0) * 14.0 + Math.sin((double)anInt1050 / 16.0) * 12.0);
      if (this.anInt920 > 0) {
         this.anInt920 -= 4;
      }

      if (this.anInt921 > 0) {
         this.anInt921 -= 4;
      }

      if (this.anInt920 == 0 && this.anInt921 == 0) {
         var6 = (int)(Math.random() * 2000.0);
         if (var6 == 0) {
            this.anInt920 = 1024;
         }

         if (var6 == 1) {
            this.anInt921 = 1024;
            return;
         }
      }

   }

   private void drawScene() {
      ++this.sceneCycle;
      this.method694(true);
      this.method632(751, true);
      this.method694(false);
      this.method632(751, false);
      this.method626();
      this.method651();
      int var1;
      int cameraX;
      if (!this.cutscene) {
         var1 = this.anInt1012;
         if (this.anInt1033 / 256 > var1) {
            var1 = this.anInt1033 / 256;
         }

         if (this.cameraModifierEnabled[4] && this.cameraModifierWobbleScale[4] + 128 > var1) {
            var1 = this.cameraModifierWobbleScale[4] + 128;
         }

         cameraX = this.orbitCameraYaw + this.cameraAnticheatAngle & 2047;
         this.orbitCamera(this.getHeightmapY(localPlayer.z, localPlayer.x, this.currentLevel) - 50, this.anInt1019, var1, var1 * 3 + 600, cameraX, this.anInt1020);
      }

      if (this.cutscene) {
         var1 = this.getTopLevelCutscene();
      } else {
         var1 = this.getTopLevel((byte)1);
      }

      cameraX = this.cameraX;
      int cameraY = this.cameraY;
      int cameraZ = this.cameraZ;
      int cameraPitch = this.cameraPitch;
      int cameraYaw = this.cameraYaw;

      int var7;
      for(int var8 = 0; var8 < 5; ++var8) {
         if (this.cameraModifierEnabled[var8]) {
            var7 = (int)(Math.random() * (double)(this.cameraModifierJitter[var8] * 2 + 1) - (double)this.cameraModifierJitter[var8] + Math.sin((double)this.cameraModifierCycle[var8] * ((double)this.cameraModifierWobbleSpeed[var8] / 100.0)) * (double)this.cameraModifierWobbleScale[var8]);
            if (var8 == 0) {
               this.cameraX += var7;
            }

            if (var8 == 1) {
               this.cameraY += var7;
            }

            if (var8 == 2) {
               this.cameraZ += var7;
            }

            if (var8 == 3) {
               this.cameraYaw = this.cameraYaw + var7 & 2047;
            }

            if (var8 == 4) {
               this.cameraPitch += var7;
               if (this.cameraPitch < 128) {
                  this.cameraPitch = 128;
               }

               if (this.cameraPitch > 383) {
                  this.cameraPitch = 383;
               }
            }
         }
      }

      var7 = Draw3D.cycle;
      Model.checkHover = true;
      Model.pickedCount = 0;
      Model.mouseX = super.mouseX - 4;
      Model.mouseZ = super.mouseY - 4;
      Draw2D.clear();
      this.scene.draw(this.cameraX, var1, this.cameraY, this.cameraZ, this.cameraYaw, this.cameraPitch);
      this.scene.clearTemporaryLocs();
      this.draw2DEntityElements();
      this.drawTileHint();
      this.updateTextures(var7);
      this.draw3DEntityElements();
      this.areaViewport.draw(4, 4, super.graphics);
      this.cameraX = cameraX;
      this.cameraY = cameraY;
      this.cameraZ = cameraZ;
      this.cameraPitch = cameraPitch;
      this.cameraYaw = cameraYaw;
   }

   private void clearCaches() {
      LocType.aClass34_8.clear();
      LocType.aClass34_7.clear();
      NpcType.aClass34_6.clear();
      ObjType.aClass34_3.clear();
      ObjType.aClass34_4.clear();
      PlayerEntity.aClass34_9.clear();
      SpotAnimType.aClass34_5.clear();
   }

   private void method615(int var1, Packet var2, int var3) {
      for(int var4 = 0; var4 < this.anInt885; ++var4) {
         int var5 = this.anIntArray230[var4];
         PlayerEntity var6 = this.players[var5];
         int var7 = var2.g1();
         if ((var7 & 32) != 0) {
            var7 += var2.g1() << 8;
         }

         this.method638(var5, var6, var7, var2);
      }

      boolean var8 = false;
   }

   private void method637(Packet var1, int var2, int var3) {
      boolean var4 = false;

      for(int var5 = 0; var5 < this.anInt885; ++var5) {
         int var6 = this.anIntArray230[var5];
         NpcEntity var7 = this.npcs[var6];
         int var8 = var1.g1();
         if ((var8 & 1) != 0) {
            var7.type = NpcType.method407(var1.method340());
            var7.anInt730 = var7.type.aByte31;
            var7.anInt729 = var7.type.anInt579;
            var7.anInt748 = var7.type.anInt576;
            var7.anInt749 = var7.type.anInt575;
            var7.anInt750 = var7.type.anInt574;
            var7.anInt751 = var7.type.anInt569;
            var7.anInt760 = var7.type.anInt564;
         }

         if ((var8 & 64) != 0) {
            var7.anInt738 = var1.g2u();
            if (var7.anInt738 == 65535) {
               var7.anInt738 = -1;
            }
         }

         int var9;
         int var10;
         if ((var8 & 128) != 0) {
            var9 = var1.method330();
            var10 = var1.method330();
            var7.method541(anInt1050, var9, var10);
            var7.anInt724 = anInt1050 + 300;
            var7.anInt725 = var1.g1();
            var7.anInt726 = var1.method332(this.anInt1006);
         }

         if ((var8 & 4) != 0) {
            var7.anInt743 = var1.g2();
            var9 = var1.method346();
            var7.anInt747 = var9 >> 16;
            var7.anInt746 = anInt1050 + (var9 & 65535);
            var7.anInt744 = 0;
            var7.anInt745 = 0;
            if (var7.anInt746 > anInt1050) {
               var7.anInt744 = -1;
            }

            if (var7.anInt743 == 65535) {
               var7.anInt743 = -1;
            }
         }

         if ((var8 & 32) != 0) {
            var7.aString13 = var1.gjstr();
            var7.anInt715 = 100;
         }

         if ((var8 & 8) != 0) {
            var7.anInt727 = var1.method341();
            var7.anInt728 = var1.g2u();
         }

         if ((var8 & 2) != 0) {
            var9 = var1.g2();
            if (var9 == 65535) {
               var9 = -1;
            }

            var10 = var1.method332(this.anInt1006);
            if (var9 == var7.anInt753 && var9 != -1) {
               int var11 = SeqType.aClass15Array1[var9].anInt160;
               if (var11 == 1) {
                  var7.anInt754 = 0;
                  var7.anInt755 = 0;
                  var7.anInt756 = var10;
                  var7.anInt757 = 0;
               }

               if (var11 == 2) {
                  var7.anInt757 = 0;
               }
            } else if (var9 == -1 || var7.anInt753 == -1 || SeqType.aClass15Array1[var9].anInt154 >= SeqType.aClass15Array1[var7.anInt753].anInt154) {
               var7.anInt753 = var9;
               var7.anInt754 = 0;
               var7.anInt755 = 0;
               var7.anInt756 = var10;
               var7.anInt757 = 0;
               var7.anInt742 = var7.anInt759;
            }
         }

         if ((var8 & 16) != 0) {
            var9 = var1.method332(this.anInt1006);
            var10 = var1.method332(this.anInt1006);
            var7.method541(anInt1050, var9, var10);
            var7.anInt724 = anInt1050 + 300;
            var7.anInt725 = var1.g1();
            var7.anInt726 = var1.method331();
         }
      }

   }

   private String method612() {
      if (signlink.mainapp == null) {
         return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
      } else {
         return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
      }
   }

   private void method686(int var1) {
      int var2 = 21 / var1;
      if (this.anInt997 != 0) {
         int var3 = 0;
         if (this.systemUpdateTimer != 0) {
            var3 = 1;
         }

         for(int var4 = 0; var4 < 100; ++var4) {
            if (this.messageText[var4] != null) {
               int var5 = this.messageType[var4];
               String var6 = this.messageSender[var4];
               if (var6 != null && var6.startsWith("@cr1@")) {
                  var6 = var6.substring(5);
               }

               if (var6 != null && var6.startsWith("@cr2@")) {
                  var6 = var6.substring(5);
               }

               if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.isFriend(var6))) {
                  int var7 = 329 - var3 * 13;
                  if (super.mouseX > 4 && super.mouseY - 4 > var7 - 10 && super.mouseY - 4 <= var7 + 3) {
                     int var8 = this.aClass10_Sub1_Sub1_Sub2_3.method150("From:  " + var6 + this.messageText[var4]) + 25;
                     if (var8 > 450) {
                        var8 = 450;
                     }

                     if (super.mouseX < var8 + 4) {
                        if (this.anInt842 >= 1) {
                           this.menuOption[this.menuSize] = "Report abuse @whi@" + var6;
                           this.menuAction[this.menuSize] = 2507;
                           ++this.menuSize;
                        }

                        this.menuOption[this.menuSize] = "Add ignore @whi@" + var6;
                        this.menuAction[this.menuSize] = 2574;
                        ++this.menuSize;
                        this.menuOption[this.menuSize] = "Add friend @whi@" + var6;
                        this.menuAction[this.menuSize] = 2762;
                        ++this.menuSize;
                     }
                  }

                  ++var3;
                  if (var3 >= 5) {
                     return;
                  }
               }

               if ((var5 == 5 || var5 == 6) && this.anInt853 < 2) {
                  ++var3;
                  if (var3 >= 5) {
                     return;
                  }
               }
            }
         }
      }

   }

   private void method603() {
      if (this.systemUpdateTimer > 1) {
         --this.systemUpdateTimer;
      }

      if (this.idleTimeout > 0) {
         --this.idleTimeout;
      }

      for(int var1 = 0; var1 < 5 && this.method608(); ++var1) {
      }

      if (this.ingame) {
         Object var12 = this.aClass7_1.anObject1;
         int var2;
         int var3;
         int var4;
         int var5;
         int var7;
         synchronized(this.aClass7_1.anObject1) {
            if (!aBoolean228) {
               this.aClass7_1.anInt54 = 0;
            } else if (super.anInt821 != 0 || this.aClass7_1.anInt54 >= 40) {
               this.out.p1isaac(171);
               this.out.p1(0);
               var2 = this.out.pos;
               var3 = 0;

               for(var4 = 0; var4 < this.aClass7_1.anInt54 && var2 - this.out.pos < 240; ++var4) {
                  ++var3;
                  var7 = this.aClass7_1.anIntArray11[var4];
                  if (var7 < 0) {
                     var7 = 0;
                  } else if (var7 > 502) {
                     var7 = 502;
                  }

                  var5 = this.aClass7_1.anIntArray12[var4];
                  if (var5 < 0) {
                     var5 = 0;
                  } else if (var5 > 764) {
                     var5 = 764;
                  }

                  int var8 = var7 * 765 + var5;
                  if (this.aClass7_1.anIntArray11[var4] == -1 && this.aClass7_1.anIntArray12[var4] == -1) {
                     var5 = -1;
                     var7 = -1;
                     var8 = 524287;
                  }

                  if (var5 == this.anInt902 && var7 == this.anInt903) {
                     if (this.anInt1035 < 2047) {
                        ++this.anInt1035;
                     }
                  } else {
                     int var9 = var5 - this.anInt902;
                     this.anInt902 = var5;
                     int var10 = var7 - this.anInt903;
                     this.anInt903 = var7;
                     if (this.anInt1035 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        this.out.p2((this.anInt1035 << 12) + (var9 << 6) + var10);
                        this.anInt1035 = 0;
                     } else if (this.anInt1035 < 8) {
                        this.out.p3((this.anInt1035 << 19) + var8 + 8388608);
                        this.anInt1035 = 0;
                     } else {
                        this.out.p4((this.anInt1035 << 19) + var8 - 1073741824);
                        this.anInt1035 = 0;
                     }
                  }
               }

               this.out.psize1(this.out.pos - var2);
               if (var3 >= this.aClass7_1.anInt54) {
                  this.aClass7_1.anInt54 = 0;
               } else {
                  Class7 var10000 = this.aClass7_1;
                  var10000.anInt54 -= var3;

                  for(var7 = 0; var7 < this.aClass7_1.anInt54; ++var7) {
                     this.aClass7_1.anIntArray12[var7] = this.aClass7_1.anIntArray12[var7 + var3];
                     this.aClass7_1.anIntArray11[var7] = this.aClass7_1.anIntArray11[var7 + var3];
                  }
               }
            }
         }

         if (super.anInt821 != 0) {
            long var13 = (super.aLong28 - this.aLong29) / 50L;
            if (var13 > 4095L) {
               var13 = 4095L;
            }

            this.aLong29 = super.aLong28;
            var2 = super.anInt823;
            if (var2 < 0) {
               var2 = 0;
            } else if (var2 > 502) {
               var2 = 502;
            }

            var3 = super.anInt822;
            if (var3 < 0) {
               var3 = 0;
            } else if (var3 > 764) {
               var3 = 764;
            }

            var4 = var2 * 765 + var3;
            byte var20 = 0;
            if (super.anInt821 == 2) {
               var20 = 1;
            }

            var5 = (int)var13;
            this.out.p1isaac(19);
            this.out.p4((var5 << 20) + (var20 << 19) + var4);
         }

         if (this.anInt1021 > 0) {
            --this.anInt1021;
         }

         if (super.actionKey[1] == 1 || super.actionKey[2] == 1 || super.actionKey[3] == 1 || super.actionKey[4] == 1) {
            this.aBoolean258 = true;
         }

         if (this.aBoolean258 && this.anInt1021 <= 0) {
            this.anInt1021 = 20;
            this.aBoolean258 = false;
            this.out.p1isaac(140);
            this.out.method336(this.anInt1012);
            this.out.method336(this.orbitCameraYaw);
         }

         if (super.hasFocus && !this.aBoolean262) {
            this.aBoolean262 = true;
            this.out.p1isaac(187);
            this.out.p1(1);
         }

         if (!super.hasFocus && this.aBoolean262) {
            this.aBoolean262 = false;
            this.out.p1isaac(187);
            this.out.p1(0);
         }

         this.method718();
         this.method611();
         this.method727();
         ++this.idleNetCycles;
         if (this.idleNetCycles > 750) {
            this.tryReconnect();
         }

         this.method675();
         this.method642();
         this.method660();
         ++this.anInt878;
         if (this.crossMode != 0) {
            this.crossCycle += 20;
            if (this.crossCycle >= 400) {
               this.crossMode = 0;
            }
         }

         if (this.anInt1056 != 0) {
            ++this.anInt1053;
            if (this.anInt1053 >= 15) {
               if (this.anInt1056 == 2) {
                  this.aBoolean248 = true;
               }

               if (this.anInt1056 == 3) {
                  this.aBoolean255 = true;
               }

               this.anInt1056 = 0;
            }
         }

         if (this.objDragArea != 0) {
            ++this.anInt1022;
            if (super.mouseX > this.anInt951 + 5 || super.mouseX < this.anInt951 - 5 || super.mouseY > this.anInt952 + 5 || super.mouseY < this.anInt952 - 5) {
               this.aBoolean246 = true;
            }

            if (super.mouseButton == 0) {
               if (this.objDragArea == 2) {
                  this.aBoolean248 = true;
               }

               if (this.objDragArea == 3) {
                  this.aBoolean255 = true;
               }

               this.objDragArea = 0;
               if (this.aBoolean246 && this.anInt1022 >= 5) {
                  this.anInt931 = -1;
                  this.handleInput();
                  if (this.anInt931 == this.anInt948 && this.anInt930 != this.anInt949) {
                     ComType var6 = ComType.method87(this.anInt948);
                     byte var21 = 0;
                     if (this.anInt879 == 1 && var6.clientCode == 206) {
                        var21 = 1;
                     }

                     if (var6.anIntArray44[this.anInt930] <= 0) {
                        var21 = 0;
                     }

                     if (var6.aBoolean32) {
                        var2 = this.anInt949;
                        var3 = this.anInt930;
                        var6.anIntArray44[var3] = var6.anIntArray44[var2];
                        var6.anIntArray40[var3] = var6.anIntArray40[var2];
                        var6.anIntArray44[var2] = -1;
                        var6.anIntArray40[var2] = 0;
                     } else if (var21 == 1) {
                        var2 = this.anInt949;
                        var3 = this.anInt930;

                        while(var2 != var3) {
                           if (var2 > var3) {
                              var6.method88(var2 - 1, var2);
                              --var2;
                           } else if (var2 < var3) {
                              var6.method88(var2 + 1, var2);
                              ++var2;
                           }
                        }
                     } else {
                        var6.method88(this.anInt930, this.anInt949);
                     }

                     this.out.p1isaac(123);
                     this.out.method338(this.anInt930);
                     this.out.method327(var21);
                     this.out.method337(this.anInt948);
                     this.out.method336(this.anInt949);
                  }
               } else if ((this.anInt1036 == 1 || this.method701(this.menuSize - 1, this.aByte51)) && this.menuSize > 2) {
                  this.method683();
               } else if (this.menuSize > 0) {
                  this.method695(this.menuSize - 1);
               }

               this.anInt1053 = 10;
               super.anInt821 = 0;
            }
         }

         int var15;
         if (World3D.anInt307 != -1) {
            var15 = World3D.anInt307;
            var7 = World3D.anInt308;
            boolean var22 = this.method610(true, var7, localPlayer.anIntArray194[0], 0, 0, 0, 0, var15, 0, 0, localPlayer.anIntArray193[0]);
            World3D.anInt307 = -1;
            if (var22) {
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 1;
               this.crossCycle = 0;
            }
         }

         if (super.anInt821 == 1 && this.aString26 != null) {
            this.aString26 = null;
            this.aBoolean255 = true;
            super.anInt821 = 0;
         }

         this.method629();
         if (this.anInt926 == -1) {
            this.method721();
            this.method596();
            this.method614();
         }

         if (super.mouseButton == 1 || super.anInt821 == 1) {
            ++this.anInt943;
         }

         if (this.anInt1030 == 0 && this.anInt918 == 0 && this.anInt959 == 0) {
            if (this.anInt856 > 0) {
               --this.anInt856;
            }
         } else if (this.anInt856 < 100) {
            ++this.anInt856;
            if (this.anInt856 == 100) {
               if (this.anInt1030 != 0) {
                  this.aBoolean255 = true;
               }

               if (this.anInt918 != 0) {
                  this.aBoolean248 = true;
               }
            }
         }

         if (this.sceneState == 2) {
            this.method597(409);
         }

         if (this.sceneState == 2 && this.cutscene) {
            this.method604(this.aBoolean227);
         }

         for(var15 = 0; var15 < 5; ++var15) {
            int var10003 = this.cameraModifierCycle[var15]++;
         }

         this.method605((byte)2);
         ++super.idleCycles;
         if (super.idleCycles > 4500) {
            this.idleTimeout = 250;
            super.idleCycles -= 500;
            this.out.p1isaac(202);
         }

         ++this.anInt953;
         if (this.anInt953 > 500) {
            this.anInt953 = 0;
            var7 = (int)(Math.random() * 8.0);
            if ((var7 & 1) == 1) {
               this.cameraAnticheatOffsetX += this.anInt836;
            }

            if ((var7 & 2) == 2) {
               this.cameraAnticheatOffsetZ += this.anInt901;
            }

            if ((var7 & 4) == 4) {
               this.cameraAnticheatAngle += this.anInt1017;
            }
         }

         if (this.cameraAnticheatOffsetX < -50) {
            this.anInt836 = 2;
         }

         if (this.cameraAnticheatOffsetX > 50) {
            this.anInt836 = -2;
         }

         if (this.cameraAnticheatOffsetZ < -55) {
            this.anInt901 = 2;
         }

         if (this.cameraAnticheatOffsetZ > 55) {
            this.anInt901 = -2;
         }

         if (this.cameraAnticheatAngle < -40) {
            this.anInt1017 = 1;
         }

         if (this.cameraAnticheatAngle > 40) {
            this.anInt1017 = -1;
         }

         ++this.anInt919;
         if (this.anInt919 > 500) {
            this.anInt919 = 0;
            var7 = (int)(Math.random() * 8.0);
            if ((var7 & 1) == 1) {
               this.minimapAnticheatAngle += this.anInt865;
            }

            if ((var7 & 2) == 2) {
               this.minimapZoom += this.anInt1004;
            }
         }

         if (this.minimapAnticheatAngle < -60) {
            this.anInt865 = 2;
         }

         if (this.minimapAnticheatAngle > 60) {
            this.anInt865 = -2;
         }

         if (this.minimapZoom < -20) {
            this.anInt1004 = 1;
         }

         if (this.minimapZoom > 10) {
            this.anInt1004 = -1;
         }

         ++this.anInt846;
         if (this.anInt846 > 50) {
            this.out.p1isaac(40);
         }

         try {
            if (this.stream != null && this.out.pos > 0) {
               this.stream.write(this.out.pos, this.out.data);
               this.out.pos = 0;
               this.anInt846 = 0;
            }
         } catch (IOException var17) {
            this.tryReconnect();
         } catch (Exception var18) {
            this.logout();
         }
      }

   }

   private void method668(int var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      try {
         this.anInt1026 = -1;
         this.spotanims.clear();
         this.projectiles.clear();
         Draw3D.method509();
         this.clearCaches();
         this.scene.reset();
         System.gc();

         for(var2 = 0; var2 < 4; ++var2) {
            this.levelCollisionMap[var2].reset();
         }

         for(var3 = 0; var3 < 4; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  this.aByteArrayArrayArray8[var3][var4][var5] = 0;
               }
            }
         }

         World var10 = new World(this.anIntArrayArrayArray8, 14290, this.aByteArrayArrayArray8, 104, 104);
         var5 = this.aByteArrayArray5.length;
         this.out.p1isaac(40);
         int var11;
         int var12;
         if (!this.aBoolean247) {
            byte[] var13;
            for(var6 = 0; var6 < var5; ++var6) {
               var7 = (this.anIntArray216[var6] >> 8) * 64 - this.sceneBaseTileX;
               var8 = (this.anIntArray216[var6] & 255) * 64 - this.sceneBaseTileZ;
               var13 = this.aByteArrayArray5[var6];
               if (var13 != null) {
                  var10.method22(var8, (this.anInt855 - 6) * 8, var7, var13, (this.anInt854 - 6) * 8, this.levelCollisionMap);
               }
            }

            for(var7 = 0; var7 < var5; ++var7) {
               var8 = (this.anIntArray216[var7] >> 8) * 64 - this.sceneBaseTileX;
               var9 = (this.anIntArray216[var7] & 255) * 64 - this.sceneBaseTileZ;
               byte[] var14 = this.aByteArrayArray5[var7];
               if (var14 == null && this.anInt855 < 800) {
                  var10.method28(var8, var9, 64, 64);
               }
            }

            this.out.p1isaac(40);

            for(var8 = 0; var8 < var5; ++var8) {
               var13 = this.aByteArrayArray6[var8];
               if (var13 != null) {
                  var12 = (this.anIntArray216[var8] >> 8) * 64 - this.sceneBaseTileX;
                  var11 = (this.anIntArray216[var8] & 255) * 64 - this.sceneBaseTileZ;
                  var10.method27(var11, this.levelCollisionMap, var12, this.scene, var13);
               }
            }
         }

         if (this.aBoolean247) {
            var6 = 0;

            label254:
            while(true) {
               int var15;
               int var16;
               int var17;
               int var19;
               int var20;
               if (var6 >= 4) {
                  for(var7 = 0; var7 < 13; ++var7) {
                     for(var8 = 0; var8 < 13; ++var8) {
                        var9 = this.anIntArrayArrayArray7[0][var7][var8];
                        if (var9 == -1) {
                           var10.method28(var7 * 8, var8 * 8, 8, 8);
                        }
                     }
                  }

                  this.out.p1isaac(40);
                  var8 = 0;

                  while(true) {
                     if (var8 >= 4) {
                        break label254;
                     }

                     for(var9 = 0; var9 < 13; ++var9) {
                        for(var12 = 0; var12 < 13; ++var12) {
                           var11 = this.anIntArrayArrayArray7[var8][var9][var12];
                           if (var11 != -1) {
                              var19 = var11 >> 24 & 3;
                              var20 = var11 >> 1 & 3;
                              var15 = var11 >> 14 & 1023;
                              var16 = var11 >> 3 & 2047;
                              var17 = (var15 / 8 << 8) + var16 / 8;

                              for(int var23 = 0; var23 < this.anIntArray216.length; ++var23) {
                                 if (this.anIntArray216[var23] == var17 && this.aByteArrayArray6[var23] != null) {
                                    var10.method20(var8, this.levelCollisionMap, this.scene, this.aByteArrayArray6[var23], var12 * 8, var20, (var15 & 7) * 8, var9 * 8, (var16 & 7) * 8, var19);
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     ++var8;
                  }
               }

               for(var7 = 0; var7 < 13; ++var7) {
                  for(var8 = 0; var8 < 13; ++var8) {
                     boolean var18 = false;
                     var12 = this.anIntArrayArrayArray7[var6][var7][var8];
                     if (var12 != -1) {
                        var11 = var12 >> 24 & 3;
                        var19 = var12 >> 1 & 3;
                        var20 = var12 >> 14 & 1023;
                        var15 = var12 >> 3 & 2047;
                        var16 = (var20 / 8 << 8) + var15 / 8;

                        for(var17 = 0; var17 < this.anIntArray216.length; ++var17) {
                           if (this.anIntArray216[var17] == var16 && this.aByteArrayArray5[var17] != null) {
                              var10.method16(var19, (var15 & 7) * 8, this.aByteArrayArray5[var17], var6, var11, var7 * 8, this.levelCollisionMap, var8 * 8, (var20 & 7) * 8);
                              var18 = true;
                              break;
                           }
                        }
                     }

                     if (!var18) {
                        var10.method14(this.anInt934, var6, var8 * 8, var7 * 8);
                     }
                  }
               }

               ++var6;
            }
         }

         this.out.p1isaac(40);
         var10.method15(this.levelCollisionMap, this.anInt1046, this.scene);
         if (this.areaViewport != null) {
            this.areaViewport.method130();
            Draw3D.lineOffset = this.anIntArray238;
         }

         this.out.p1isaac(40);
         var6 = World.anInt56;
         if (var6 > this.currentLevel) {
            var6 = this.currentLevel;
         }

         if (var6 < this.currentLevel - 1) {
            var6 = this.currentLevel - 1;
         }

         if (lowMemory) {
            this.scene.method191(World.anInt56);
         } else {
            this.scene.method191(0);
         }

         for(var7 = 0; var7 < 104; ++var7) {
            for(var8 = 0; var8 < 104; ++var8) {
               this.method601(var7, var8);
            }
         }

         this.method593();
      } catch (Exception var22) {
      }

      LocType.aClass34_8.clear();
      if (super.frame != null) {
         this.out.p1isaac(78);
         this.out.p4(1057001181);
      }

      if (lowMemory && signlink.aRandomAccessFile3 != null) {
         var2 = this.aClass33_Sub1_1.method569(0);

         for(var3 = 0; var3 < var2; ++var3) {
            var4 = this.aClass33_Sub1_1.method554(var3);
            if ((var4 & 121) == 0) {
               Model.method270(var3);
            }
         }
      }

      System.gc();
      Draw3D.initPool();
      this.aClass33_Sub1_1.method565();
      var2 = (this.anInt854 - 6) / 8 - 1;
      var3 = (this.anInt854 + 6) / 8 + 1;
      var4 = (this.anInt855 - 6) / 8 - 1;
      var5 = (this.anInt855 + 6) / 8 + 1;
      boolean var21 = false;
      if (this.aBoolean238) {
         var2 = 49;
         var3 = 50;
         var4 = 49;
         var5 = 50;
      }

      for(var6 = var2; var6 <= var3; ++var6) {
         for(var7 = var4; var7 <= var5; ++var7) {
            if (var6 == var2 || var6 == var3 || var7 == var4 || var7 == var5) {
               var8 = this.aClass33_Sub1_1.method573(var6, var7, 0);
               if (var8 != -1) {
                  this.aClass33_Sub1_1.method566(var8, 3, this.aByte47);
               }

               var9 = this.aClass33_Sub1_1.method573(var6, var7, 1);
               if (var9 != -1) {
                  this.aClass33_Sub1_1.method566(var9, 3, this.aByte47);
               }
            }
         }
      }

   }

   private void method724() {
      int var1;
      int var2;
      if (this.titleScreenState == 0) {
         var1 = super.screenWidth / 2 - 80;
         var2 = super.screenHeight / 2 + 20;
         var2 += 20;
         if (super.anInt821 == 1 && super.anInt822 >= var1 - 75 && super.anInt822 <= var1 + 75 && super.anInt823 >= var2 - 20 && super.anInt823 <= var2 + 20) {
            this.titleScreenState = 3;
            this.anInt886 = 0;
         }

         var1 = super.screenWidth / 2 + 80;
         if (super.anInt821 == 1 && super.anInt822 >= var1 - 75 && super.anInt822 <= var1 + 75 && super.anInt823 >= var2 - 20 && super.anInt823 <= var2 + 20) {
            this.loginMessage0 = "";
            this.loginMessage1 = "Enter your username & password.";
            this.titleScreenState = 2;
            this.anInt886 = 0;
         }
      } else {
         int var3;
         if (this.titleScreenState == 2) {
            var1 = super.screenHeight / 2 - 40;
            var1 += 30;
            var1 += 25;
            if (super.anInt821 == 1 && super.anInt823 >= var1 - 15 && super.anInt823 < var1) {
               this.anInt886 = 0;
            }

            var1 += 15;
            if (super.anInt821 == 1 && super.anInt823 >= var1 - 15 && super.anInt823 < var1) {
               this.anInt886 = 1;
            }

            var1 += 15;
            var2 = super.screenWidth / 2 - 80;
            var3 = super.screenHeight / 2 + 50;
            int var4 = var3 + 20;
            if (super.anInt821 == 1 && super.anInt822 >= var2 - 75 && super.anInt822 <= var2 + 75 && super.anInt823 >= var4 - 20 && super.anInt823 <= var4 + 20) {
               this.anInt833 = 0;
               this.login(this.username, this.password, false);
               if (this.ingame) {
                  return;
               }
            }

            var2 = super.screenWidth / 2 + 80;
            if (super.anInt821 == 1 && super.anInt822 >= var2 - 75 && super.anInt822 <= var2 + 75 && super.anInt823 >= var4 - 20 && super.anInt823 <= var4 + 20) {
               this.titleScreenState = 0;
               this.username = "";
               this.password = "";
            }

            while(true) {
               while(true) {
                  int var5 = this.pollKey();
                  if (var5 == -1) {
                     return;
                  }

                  boolean var6 = false;

                  for(int var7 = 0; var7 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var7) {
                     if (var5 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var7)) {
                        var6 = true;
                        break;
                     }
                  }

                  if (this.anInt886 == 0) {
                     if (var5 == 8 && this.username.length() > 0) {
                        this.username = this.username.substring(0, this.username.length() - 1);
                     }

                     if (var5 == 9 || var5 == 10 || var5 == 13) {
                        this.anInt886 = 1;
                     }

                     if (var6) {
                        this.username = this.username + (char)var5;
                     }

                     if (this.username.length() > 12) {
                        this.username = this.username.substring(0, 12);
                     }
                  } else if (this.anInt886 == 1) {
                     if (var5 == 8 && this.password.length() > 0) {
                        this.password = this.password.substring(0, this.password.length() - 1);
                     }

                     if (var5 == 9 || var5 == 10 || var5 == 13) {
                        this.anInt886 = 0;
                     }

                     if (var6) {
                        this.password = this.password + (char)var5;
                     }

                     if (this.password.length() > 20) {
                        this.password = this.password.substring(0, 20);
                     }
                  }
               }
            }
         }

         if (this.titleScreenState == 3) {
            var1 = super.screenWidth / 2;
            var2 = super.screenHeight / 2 + 50;
            var3 = var2 + 20;
            if (super.anInt821 == 1 && super.anInt822 >= var1 - 75 && super.anInt822 <= var1 + 75 && super.anInt823 >= var3 - 20 && super.anInt823 <= var3 + 20) {
               this.titleScreenState = 0;
               return;
            }
         }
      }

   }

   private void method626() {
      for(Class10_Sub1_Sub2_Sub2 var1 = (Class10_Sub1_Sub2_Sub2)this.projectiles.method6(); var1 != null; var1 = (Class10_Sub1_Sub2_Sub2)this.projectiles.method8()) {
         if (var1.anInt264 == this.currentLevel && anInt1050 <= var1.anInt271) {
            if (anInt1050 >= var1.anInt270) {
               if (var1.anInt267 > 0) {
                  NpcEntity var2 = this.npcs[var1.anInt267 - 1];
                  if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.z >= 0 && var2.z < 13312) {
                     var1.method187(var2.x, var2.z, this.getHeightmapY(var2.z, var2.x, var1.anInt264) - var1.anInt277, anInt1050);
                  }
               }

               if (var1.anInt267 < 0) {
                  int var4 = -var1.anInt267 - 1;
                  PlayerEntity var3;
                  if (var4 == this.anInt881) {
                     var3 = localPlayer;
                  } else {
                     var3 = this.players[var4];
                  }

                  if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
                     var1.method187(var3.x, var3.z, this.getHeightmapY(var3.z, var3.x, var1.anInt264) - var1.anInt277, anInt1050);
                  }
               }

               var1.method188(this.anInt878);
               this.scene.method201(-1, var1, (int)var1.aDouble1, (int)var1.aDouble3, false, this.currentLevel, 60, (int)var1.aDouble2, var1.anInt268);
            }
         } else {
            var1.unlink();
         }
      }

      ++anInt975;
      if (anInt975 > 51) {
         anInt975 = 0;
         this.out.p1isaac(248);
      }

   }

   private void method649() {
      if (this.anInt926 == -1 || this.sceneState != 2 && super.gameSurface == null) {
         if (this.aBoolean236) {
            this.prepareGameScreen();
            this.aBoolean236 = false;
            this.aClass19_3.draw(4, 0, super.graphics);
            this.aClass19_4.draw(357, 0, super.graphics);
            this.aClass19_5.draw(4, 722, super.graphics);
            this.aClass19_6.draw(205, 743, super.graphics);
            this.aClass19_7.draw(0, 0, super.graphics);
            this.aClass19_8.draw(4, 516, super.graphics);
            this.aClass19_9.draw(205, 516, super.graphics);
            this.aClass19_10.draw(357, 496, super.graphics);
            this.aClass19_11.draw(338, 0, super.graphics);
            this.aBoolean248 = true;
            this.aBoolean255 = true;
            this.aBoolean225 = true;
            this.aBoolean253 = true;
            if (this.sceneState != 2) {
               this.areaViewport.draw(4, 4, super.graphics);
               this.aClass19_16.draw(4, 550, super.graphics);
            }

            ++anInt1007;
            if (anInt1007 > 85) {
               anInt1007 = 0;
               this.out.p1isaac(168);
            }
         }

         if (this.sceneState == 2) {
            this.drawScene();
         }

         if (this.menuVisible && this.anInt1039 == 1) {
            this.aBoolean248 = true;
         }

         boolean var4;
         if (this.sidebarInterfaceId != -1) {
            var4 = this.updateInterfaceAnimation(this.anInt878, this.sidebarInterfaceId);
            if (var4) {
               this.aBoolean248 = true;
            }
         }

         if (this.anInt1056 == 2) {
            this.aBoolean248 = true;
         }

         if (this.objDragArea == 2) {
            this.aBoolean248 = true;
         }

         if (this.aBoolean248) {
            this.method709();
            this.aBoolean248 = false;
         }

         int var2;
         if (this.anInt888 == -1 && this.anInt1010 == 0) {
            this.aClass14_1.scrollPosition = this.anInt947 - this.chatScrollOffset - 77;
            if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
               this.method617(this.anInt947, 0, this.aClass14_1, super.mouseY - 357, -1, super.mouseX - 17, 77, 463);
            }

            var2 = this.anInt947 - this.aClass14_1.scrollPosition - 77;
            if (var2 < 0) {
               var2 = 0;
            }

            if (var2 > this.anInt947 - 77) {
               var2 = this.anInt947 - 77;
            }

            if (this.chatScrollOffset != var2) {
               this.chatScrollOffset = var2;
               this.aBoolean255 = true;
            }
         }

         if (this.anInt888 == -1 && this.anInt1010 == 3) {
            var2 = this.anInt840 * 14 + 7;
            this.aClass14_1.scrollPosition = this.anInt841;
            if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
               this.method617(var2, 0, this.aClass14_1, super.mouseY - 357, -1, super.mouseX - 17, 77, 463);
            }

            int var3 = this.aClass14_1.scrollPosition;
            if (var3 < 0) {
               var3 = 0;
            }

            if (var3 > var2 - 77) {
               var3 = var2 - 77;
            }

            if (this.anInt841 != var3) {
               this.anInt841 = var3;
               this.aBoolean255 = true;
            }
         }

         if (this.anInt888 != -1) {
            var4 = this.updateInterfaceAnimation(this.anInt878, this.anInt888);
            if (var4) {
               this.aBoolean255 = true;
            }
         }

         if (this.anInt1056 == 3) {
            this.aBoolean255 = true;
         }

         if (this.objDragArea == 3) {
            this.aBoolean255 = true;
         }

         if (this.aString26 != null) {
            this.aBoolean255 = true;
         }

         if (this.menuVisible && this.anInt1039 == 2) {
            this.aBoolean255 = true;
         }

         if (this.aBoolean255) {
            this.method659();
            this.aBoolean255 = false;
         }

         if (this.sceneState == 2) {
            this.method662(503);
            this.aClass19_16.draw(4, 550, super.graphics);
         }

         if (this.anInt988 != -1) {
            this.aBoolean225 = true;
         }

         if (this.aBoolean225) {
            if (this.anInt988 != -1 && this.anInt988 == this.anInt1031) {
               this.anInt988 = -1;
               this.out.p1isaac(119);
               this.out.p1(this.anInt1031);
            }

            this.aBoolean225 = false;
            this.aClass19_14.method130();
            this.aClass10_Sub1_Sub1_Sub3_8.method440(0, 0);
            if (this.sidebarInterfaceId == -1) {
               if (this.anIntArray248[this.anInt1031] != -1) {
                  if (this.anInt1031 == 0) {
                     this.aClass10_Sub1_Sub1_Sub3_1.method440(10, 22);
                  }

                  if (this.anInt1031 == 1) {
                     this.aClass10_Sub1_Sub1_Sub3_2.method440(8, 54);
                  }

                  if (this.anInt1031 == 2) {
                     this.aClass10_Sub1_Sub1_Sub3_2.method440(8, 82);
                  }

                  if (this.anInt1031 == 3) {
                     this.aClass10_Sub1_Sub1_Sub3_3.method440(8, 110);
                  }

                  if (this.anInt1031 == 4) {
                     this.aClass10_Sub1_Sub1_Sub3_5.method440(8, 153);
                  }

                  if (this.anInt1031 == 5) {
                     this.aClass10_Sub1_Sub1_Sub3_5.method440(8, 181);
                  }

                  if (this.anInt1031 == 6) {
                     this.aClass10_Sub1_Sub1_Sub3_4.method440(9, 209);
                  }
               }

               if (this.anIntArray248[0] != -1 && (this.anInt988 != 0 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[0].method440(13, 29);
               }

               if (this.anIntArray248[1] != -1 && (this.anInt988 != 1 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[1].method440(11, 53);
               }

               if (this.anIntArray248[2] != -1 && (this.anInt988 != 2 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[2].method440(11, 82);
               }

               if (this.anIntArray248[3] != -1 && (this.anInt988 != 3 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[3].method440(12, 115);
               }

               if (this.anIntArray248[4] != -1 && (this.anInt988 != 4 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[4].method440(13, 153);
               }

               if (this.anIntArray248[5] != -1 && (this.anInt988 != 5 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[5].method440(11, 180);
               }

               if (this.anIntArray248[6] != -1 && (this.anInt988 != 6 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[6].method440(13, 208);
               }
            }

            this.aClass19_14.draw(160, 516, super.graphics);
            this.aClass19_13.method130();
            this.aClass10_Sub1_Sub1_Sub3_7.method440(0, 0);
            if (this.sidebarInterfaceId == -1) {
               if (this.anIntArray248[this.anInt1031] != -1) {
                  if (this.anInt1031 == 7) {
                     this.aClass10_Sub1_Sub1_Sub3_9.method440(0, 42);
                  }

                  if (this.anInt1031 == 8) {
                     this.aClass10_Sub1_Sub1_Sub3_10.method440(0, 74);
                  }

                  if (this.anInt1031 == 9) {
                     this.aClass10_Sub1_Sub1_Sub3_10.method440(0, 102);
                  }

                  if (this.anInt1031 == 10) {
                     this.aClass10_Sub1_Sub1_Sub3_11.method440(1, 130);
                  }

                  if (this.anInt1031 == 11) {
                     this.aClass10_Sub1_Sub1_Sub3_13.method440(0, 173);
                  }

                  if (this.anInt1031 == 12) {
                     this.aClass10_Sub1_Sub1_Sub3_13.method440(0, 201);
                  }

                  if (this.anInt1031 == 13) {
                     this.aClass10_Sub1_Sub1_Sub3_12.method440(0, 229);
                  }
               }

               if (this.anIntArray248[8] != -1 && (this.anInt988 != 8 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[7].method440(2, 74);
               }

               if (this.anIntArray248[9] != -1 && (this.anInt988 != 9 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[8].method440(3, 102);
               }

               if (this.anIntArray248[10] != -1 && (this.anInt988 != 10 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[9].method440(4, 137);
               }

               if (this.anIntArray248[11] != -1 && (this.anInt988 != 11 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[10].method440(2, 174);
               }

               if (this.anIntArray248[12] != -1 && (this.anInt988 != 12 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[11].method440(2, 201);
               }

               if (this.anIntArray248[13] != -1 && (this.anInt988 != 13 || anInt1050 % 20 < 10)) {
                  this.aClass10_Sub1_Sub1_Sub3Array2[12].method440(2, 226);
               }
            }

            this.aClass19_13.draw(466, 496, super.graphics);
            this.areaViewport.method130();
            Draw3D.lineOffset = this.anIntArray238;
         }

         if (this.aBoolean253) {
            this.aBoolean253 = false;
            this.aClass19_12.method130();
            this.aClass10_Sub1_Sub1_Sub3_6.method440(0, 0);
            this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 55, "Public chat");
            if (this.publicChatSetting == 0) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 55, "On");
            }

            if (this.publicChatSetting == 1) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 55, "Friends");
            }

            if (this.publicChatSetting == 2) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 55, "Off");
            }

            if (this.publicChatSetting == 3) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65535, 41, 55, "Hide");
            }

            this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 184, "Private chat");
            if (this.anInt853 == 0) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 184, "On");
            }

            if (this.anInt853 == 1) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 184, "Friends");
            }

            if (this.anInt853 == 2) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 184, "Off");
            }

            this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 324, "Trade/compete");
            if (this.anInt1000 == 0) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 324, "On");
            }

            if (this.anInt1000 == 1) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 324, "Friends");
            }

            if (this.anInt1000 == 2) {
               this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 324, "Off");
            }

            this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 33, 458, "Report abuse");
            this.aClass19_12.draw(453, 0, super.graphics);
            this.areaViewport.method130();
            Draw3D.lineOffset = this.anIntArray238;
         }

         this.anInt878 = 0;
      } else {
         if (this.sceneState == 2) {
            this.updateInterfaceAnimation(this.anInt878, this.anInt926);
            if (this.anInt880 != -1) {
               this.updateInterfaceAnimation(this.anInt878, this.anInt880);
            }

            this.anInt878 = 0;
            this.method722(this.anInt964);
            super.gameSurface.method130();
            Draw3D.lineOffset = this.anIntArray239;
            Draw2D.clear();
            this.aBoolean236 = true;
            ComType var1 = ComType.method87(this.anInt926);
            if (var1.anInt123 == 512 && var1.height == 334 && var1.type == 0) {
               var1.anInt123 = 765;
               var1.height = 503;
            }

            this.drawInterface(0, 0, var1, 0);
            if (this.anInt880 != -1) {
               var1 = ComType.method87(this.anInt880);
               if (var1.anInt123 == 512 && var1.height == 334 && var1.type == 0) {
                  var1.anInt123 = 765;
                  var1.height = 503;
               }

               this.drawInterface(0, 0, var1, 0);
            }

            if (this.menuVisible) {
               this.drawMenu();
            } else {
               this.handleInput();
               this.drawTooltip();
            }
         }

         super.gameSurface.draw(0, 0, super.graphics);
      }

   }

   private int method681(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return ((var1 & 16711935) * var4 + (var2 & 16711935) * var3 & -16711936) + ((var1 & 65280) * var4 + (var2 & 65280) * var3 & 16711680) >> 8;
   }

   private void method673(int var1) {
      int var2;
      if (this.anInt920 > 0) {
         for(var2 = 0; var2 < 256; ++var2) {
            if (this.anInt920 > 768) {
               this.anIntArray271[var2] = this.method681(this.anIntArray272[var2], this.anIntArray273[var2], 1024 - this.anInt920);
            } else if (this.anInt920 > 256) {
               this.anIntArray271[var2] = this.anIntArray273[var2];
            } else {
               this.anIntArray271[var2] = this.method681(this.anIntArray273[var2], this.anIntArray272[var2], 256 - this.anInt920);
            }
         }
      } else if (this.anInt921 > 0) {
         for(var2 = 0; var2 < 256; ++var2) {
            if (this.anInt921 > 768) {
               this.anIntArray271[var2] = this.method681(this.anIntArray272[var2], this.anIntArray274[var2], 1024 - this.anInt921);
            } else if (this.anInt921 > 256) {
               this.anIntArray271[var2] = this.anIntArray274[var2];
            } else {
               this.anIntArray271[var2] = this.method681(this.anIntArray274[var2], this.anIntArray272[var2], 256 - this.anInt921);
            }
         }
      } else {
         for(var2 = 0; var2 < 256; ++var2) {
            this.anIntArray271[var2] = this.anIntArray272[var2];
         }
      }

      for(var2 = 0; var2 < 33920; ++var2) {
         this.aClass19_22.pixels[var2] = this.aClass10_Sub1_Sub1_Sub1_3.pixels[var2];
      }

      int var3 = 0;
      int var4 = 1152;

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(int var12 = 1; var12 < 255; ++var12) {
         var5 = this.anIntArray258[var12] * (256 - var12) / 256;
         var6 = var5 + 22;
         if (var6 < 0) {
            var6 = 0;
         }

         var3 += var6;

         for(var7 = var6; var7 < 128; ++var7) {
            var8 = this.anIntArray249[var3++];
            if (var8 == 0) {
               ++var4;
            } else {
               var9 = var8;
               var10 = 256 - var8;
               var8 = this.anIntArray271[var8];
               var11 = this.aClass19_22.pixels[var4];
               this.aClass19_22.pixels[var4++] = ((var8 & 16711935) * var9 + (var11 & 16711935) * var10 & -16711936) + ((var8 & 65280) * var9 + (var11 & 65280) * var10 & 16711680) >> 8;
            }
         }

         var4 += var6;
      }

      this.aClass19_22.draw(0, 0, super.graphics);
      boolean var15 = true;

      for(var5 = 0; var5 < 33920; ++var5) {
         this.aClass19_23.pixels[var5] = this.aClass10_Sub1_Sub1_Sub1_4.pixels[var5];
      }

      var3 = 0;
      var4 = 1176;

      for(var6 = 1; var6 < 255; ++var6) {
         var7 = this.anIntArray258[var6] * (256 - var6) / 256;
         var8 = 103 - var7;
         var4 += var7;

         for(var9 = 0; var9 < var8; ++var9) {
            var10 = this.anIntArray249[var3++];
            if (var10 == 0) {
               ++var4;
            } else {
               var11 = var10;
               int var13 = 256 - var10;
               var10 = this.anIntArray271[var10];
               int var14 = this.aClass19_23.pixels[var4];
               this.aClass19_23.pixels[var4++] = ((var10 & 16711935) * var11 + (var14 & 16711935) * var13 & -16711936) + ((var10 & 65280) * var11 + (var14 & 65280) * var13 & 16711680) >> 8;
            }
         }

         var3 += 128 - var8;
         var4 += 128 - var8 - var7;
      }

      this.aClass19_23.draw(0, 637, super.graphics);
   }

   private boolean replayWave() {
      return signlink.wavereplay();
   }

   private void method651() {
      for(Class10_Sub1_Sub2_Sub6 var1 = (Class10_Sub1_Sub2_Sub6)this.spotanims.method6(); var1 != null; var1 = (Class10_Sub1_Sub2_Sub6)this.spotanims.method8()) {
         if (var1.anInt623 == this.currentLevel && !var1.aBoolean156) {
            if (anInt1050 >= var1.anInt629) {
               var1.method420((byte)1, this.anInt878);
               if (var1.aBoolean156) {
                  var1.unlink();
               } else {
                  this.scene.method201(-1, var1, var1.anInt624, var1.anInt626, false, var1.anInt623, 60, var1.anInt625, 0);
               }
            }
         } else {
            var1.unlink();
         }
      }

   }

   private void resetInterfaceAnimation(int var1) {
      ComType parent = ComType.method87(var1);

      for(int i = 0; i < parent.childId.length && parent.childId[i] != -1; ++i) {
         ComType child = ComType.method87(parent.childId[i]);
         if (child.type == 1) {
            this.resetInterfaceAnimation(child.id);
         }

         child.seqFrame = 0;
         child.seqCycle = 0;
      }

   }

   private void method652() {
      while(true) {
         Class10_Sub1_Sub4 var1 = this.aClass33_Sub1_1.method559();
         if (var1 == null) {
            return;
         }

         if (var1.anInt486 == 0) {
            Model.method269(var1.aByteArray13, var1.anInt487);
            if ((this.aClass33_Sub1_1.method554(var1.anInt487) & 98) != 0) {
               this.aBoolean248 = true;
               if (this.anInt888 != -1 || this.anInt985 != -1) {
                  this.aBoolean255 = true;
               }
            }
         }

         if (var1.anInt486 == 1 && var1.aByteArray13 != null) {
            Class22.method166(var1.aByteArray13);
         }

         if (var1.anInt486 == 2 && var1.anInt487 == this.anInt1023 && var1.aByteArray13 != null) {
            this.saveMidi(this.aBoolean260, var1.aByteArray13, 659);
         }

         if (var1.anInt486 == 3 && this.sceneState == 1) {
            for(int var2 = 0; var2 < this.aByteArrayArray5.length; ++var2) {
               if (this.anIntArray217[var2] == var1.anInt487) {
                  this.aByteArrayArray5[var2] = var1.aByteArray13;
                  if (var1.aByteArray13 == null) {
                     this.anIntArray217[var2] = -1;
                  }
                  break;
               }

               if (this.anIntArray218[var2] == var1.anInt487) {
                  this.aByteArrayArray6[var2] = var1.aByteArray13;
                  if (var1.aByteArray13 == null) {
                     this.anIntArray218[var2] = -1;
                  }
                  break;
               }
            }
         }

         if (var1.anInt486 == 93 && this.aClass33_Sub1_1.method563(var1.anInt487)) {
            World.method17(this.aClass33_Sub1_1, new Packet(var1.aByteArray13));
         }
      }
   }

   private void drawInterface(int var1, int var2, ComType root, int var4) {
      if (root.type == 0 && root.childId != null && (!root.hide || this.viewportHoveredInterfaceIndex == root.id || this.sidebarHoveredInterfaceIndex == root.id || this.chatHoveredInterfaceIndex == root.id)) {
         int left = Draw2D.left;
         int top = Draw2D.top;
         int right = Draw2D.right;
         int bottom = Draw2D.bottom;
         Draw2D.setBounds(var1, var2, var1 + root.height, var2 + root.anInt123);
         int children = root.childId.length;

         for(int i = 0; i < children; ++i) {
            int var11 = root.childX[i] + var2;
            int var12 = root.childY[i] + var1 - var4;
            ComType child = ComType.method87(root.childId[i]);
            int var14 = var11 + child.x;
            int var15 = var12 + child.y;
            if (child.clientCode > 0) {
               this.updateInterfaceContent((byte)2, child);
            }

            if (child.type == 0) {
               if (child.scrollPosition > child.scroll - child.height) {
                  child.scrollPosition = child.scroll - child.height;
               }

               if (child.scrollPosition < 0) {
                  child.scrollPosition = 0;
               }

               this.drawInterface(var15, var14, child, child.scrollPosition);
               if (child.scroll > child.height) {
                  this.drawScrollbar(child.scrollPosition, var14 + child.anInt123, child.height, child.scroll, var15);
               }
            } else if (child.type != 1) {
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (child.type == 2) {
                  var22 = 0;

                  for(var16 = 0; var16 < child.height; ++var16) {
                     for(var17 = 0; var17 < child.anInt123; ++var17) {
                        var18 = var14 + var17 * (child.anInt137 + 32);
                        int var32 = var15 + var16 * (child.anInt126 + 32);
                        if (var22 < 20) {
                           var18 += child.anIntArray39[var22];
                           var32 += child.anIntArray38[var22];
                        }

                        Pix24 var36;
                        if (child.anIntArray44[var22] <= 0) {
                           if (child.aClass10_Sub1_Sub1_Sub1Array1 != null && var22 < 20) {
                              var36 = child.aClass10_Sub1_Sub1_Sub1Array1[var22];
                              if (var36 != null) {
                                 var36.draw(var32, var18);
                              }
                           }
                        } else {
                           var23 = 0;
                           var19 = 0;
                           var20 = child.anIntArray44[var22] - 1;
                           if (var18 > Draw2D.left - 32 && var18 < Draw2D.right && var32 > Draw2D.top - 32 && var32 < Draw2D.bottom || this.objDragArea != 0 && this.anInt949 == var22) {
                              var21 = 0;
                              if (this.objSelected == 1 && this.anInt966 == var22 && this.anInt967 == child.id) {
                                 var21 = 16777215;
                              }

                              var36 = ObjType.method113(var21, child.anIntArray40[var22], var20);
                              if (var36 != null) {
                                 int var37;
                                 if (this.objDragArea != 0 && this.anInt949 == var22 && this.anInt948 == child.id) {
                                    var23 = super.mouseX - this.anInt951;
                                    var19 = super.mouseY - this.anInt952;
                                    if (var23 < 5 && var23 > -5) {
                                       var23 = 0;
                                    }

                                    if (var19 < 5 && var19 > -5) {
                                       var19 = 0;
                                    }

                                    if (this.anInt1022 < 5) {
                                       var23 = 0;
                                       var19 = 0;
                                    }

                                    var36.method80(var18 + var23, var32 + var19);
                                    if (var32 + var19 < Draw2D.top && root.scrollPosition > 0) {
                                       var37 = this.anInt878 * (Draw2D.top - var32 - var19) / 3;
                                       if (var37 > this.anInt878 * 10) {
                                          var37 = this.anInt878 * 10;
                                       }

                                       if (var37 > root.scrollPosition) {
                                          var37 = root.scrollPosition;
                                       }

                                       root.scrollPosition -= var37;
                                       this.anInt952 += var37;
                                    }

                                    if (var32 + var19 + 32 > Draw2D.bottom && root.scrollPosition < root.scroll - root.height) {
                                       var37 = this.anInt878 * (var32 + var19 + 32 - Draw2D.bottom) / 3;
                                       if (var37 > this.anInt878 * 10) {
                                          var37 = this.anInt878 * 10;
                                       }

                                       if (var37 > root.scroll - root.height - root.scrollPosition) {
                                          var37 = root.scroll - root.height - root.scrollPosition;
                                       }

                                       root.scrollPosition += var37;
                                       this.anInt952 -= var37;
                                    }
                                 } else if (this.anInt1056 != 0 && this.anInt1055 == var22 && this.anInt1054 == child.id) {
                                    var36.method80(var18, var32);
                                 } else {
                                    var36.draw(var32, var18);
                                 }

                                 if (var36.cropW == 33 || child.anIntArray40[var22] != 1) {
                                    var37 = child.anIntArray40[var22];
                                    this.aClass10_Sub1_Sub1_Sub2_2.method152(var18 + var23 + 1, 0, var32 + var19 + 10, method595(var37));
                                    this.aClass10_Sub1_Sub1_Sub2_2.method152(var18 + var23, 16776960, var32 + var19 + 9, method595(var37));
                                 }
                              }
                           }
                        }

                        ++var22;
                     }
                  }
               } else if (child.type == 3) {
                  boolean var24 = false;
                  if (this.chatHoveredInterfaceIndex == child.id || this.sidebarHoveredInterfaceIndex == child.id || this.viewportHoveredInterfaceIndex == child.id) {
                     var24 = true;
                  }

                  if (this.method670(child)) {
                     var22 = child.anInt135;
                     if (var24 && child.anInt115 != 0) {
                        var22 = child.anInt115;
                     }
                  } else {
                     var22 = child.anInt122;
                     if (var24 && child.anInt136 != 0) {
                        var22 = child.anInt136;
                     }
                  }

                  if (child.aByte9 == 0) {
                     if (child.aBoolean36) {
                        Draw2D.fillRect(child.height, var15, var22, child.anInt123, var14);
                     } else {
                        Draw2D.drawRect(var15, child.height, var22, var14, child.anInt123);
                     }
                  } else if (child.aBoolean36) {
                     Draw2D.fillRectAlpha(var22, var15, child.anInt123, child.height, 256 - (child.aByte9 & 255), var14);
                  } else {
                     Draw2D.method501(var14, child.anInt123, var22, child.height, var15, 256 - (child.aByte9 & 255));
                  }
               } else {
                  String var25;
                  PixFont var29;
                  if (child.type == 4) {
                     var29 = child.aClass10_Sub1_Sub1_Sub2_1;
                     String var35 = child.aString2;
                     boolean var27 = false;
                     if (this.chatHoveredInterfaceIndex == child.id || this.sidebarHoveredInterfaceIndex == child.id || this.viewportHoveredInterfaceIndex == child.id) {
                        var27 = true;
                     }

                     if (this.method670(child)) {
                        var16 = child.anInt135;
                        if (var27 && child.anInt115 != 0) {
                           var16 = child.anInt115;
                        }

                        if (child.aString3.length() > 0) {
                           var35 = child.aString3;
                        }
                     } else {
                        var16 = child.anInt122;
                        if (var27 && child.anInt136 != 0) {
                           var16 = child.anInt136;
                        }
                     }

                     if (child.anInt150 == 6 && this.aBoolean254) {
                        var35 = "Please wait...";
                        var16 = child.anInt122;
                     }

                     if (Draw2D.width2d == 479) {
                        if (var16 == 16776960) {
                           var16 = 255;
                        }

                        if (var16 == 49152) {
                           var16 = 16777215;
                        }
                     }

                     for(var23 = var15 + var29.anInt230; var35.length() > 0; var23 += var29.anInt230) {
                        if (var35.indexOf("%") != -1) {
                           label484:
                           while(true) {
                              var19 = var35.indexOf("%1");
                              if (var19 == -1) {
                                 while(true) {
                                    var19 = var35.indexOf("%2");
                                    if (var19 == -1) {
                                       while(true) {
                                          var19 = var35.indexOf("%3");
                                          if (var19 == -1) {
                                             while(true) {
                                                var19 = var35.indexOf("%4");
                                                if (var19 == -1) {
                                                   while(true) {
                                                      var19 = var35.indexOf("%5");
                                                      if (var19 == -1) {
                                                         break label484;
                                                      }

                                                      var35 = var35.substring(0, var19) + this.method664(this.method704(4, child)) + var35.substring(var19 + 2);
                                                   }
                                                }

                                                var35 = var35.substring(0, var19) + this.method664(this.method704(3, child)) + var35.substring(var19 + 2);
                                             }
                                          }

                                          var35 = var35.substring(0, var19) + this.method664(this.method704(2, child)) + var35.substring(var19 + 2);
                                       }
                                    }

                                    var35 = var35.substring(0, var19) + this.method664(this.method704(1, child)) + var35.substring(var19 + 2);
                                 }
                              }

                              var35 = var35.substring(0, var19) + this.method664(this.method704(0, child)) + var35.substring(var19 + 2);
                           }
                        }

                        var19 = var35.indexOf("\\n");
                        if (var19 == -1) {
                           var25 = var35;
                           var35 = "";
                        } else {
                           var25 = var35.substring(0, var19);
                           var35 = var35.substring(var19 + 2);
                        }

                        if (child.aBoolean40) {
                           var29.method149(child.aBoolean37, this.anInt928, var16, var23, var14 + child.anInt123 / 2, var25);
                        } else {
                           var29.method156(var16, var14, var23, child.aBoolean37, var25);
                        }
                     }
                  } else if (child.type == 5) {
                     Pix24 var34;
                     if (this.method670(child)) {
                        var34 = child.aClass10_Sub1_Sub1_Sub1_2;
                     } else {
                        var34 = child.aClass10_Sub1_Sub1_Sub1_1;
                     }

                     if (var34 != null) {
                        var34.draw(var15, var14);
                     }
                  } else if (child.type == 6) {
                     var22 = Draw3D.anInt686;
                     var16 = Draw3D.anInt687;
                     Draw3D.anInt686 = var14 + child.anInt123 / 2;
                     Draw3D.anInt687 = var15 + child.height / 2;
                     var17 = Draw3D.anIntArray181[child.anInt130] * child.anInt129 >> 16;
                     var18 = Draw3D.anIntArray182[child.anInt130] * child.anInt129 >> 16;
                     boolean var30 = this.method670(child);
                     if (var30) {
                        var23 = child.anInt149;
                     } else {
                        var23 = child.anInt148;
                     }

                     Model interfaceModel = null;
                     if (var23 == -1) {
                        interfaceModel = child.method95(-1, -1, var30);
                     } else {
                        SeqType animation = SeqType.aClass15Array1[var23];
                        interfaceModel = child.method95(animation.anIntArray47[child.seqFrame], animation.anIntArray48[child.seqFrame], var30);
                     }

                     if (interfaceModel != null) {
                        interfaceModel.method292(child.anInt131, 0, child.anInt130, 0, var17, var18);
                     }

                     Draw3D.anInt686 = var22;
                     Draw3D.anInt687 = var16;
                  } else {
                     String var31;
                     if (child.type == 7) {
                        var29 = child.aClass10_Sub1_Sub1_Sub2_1;
                        var16 = 0;

                        for(var17 = 0; var17 < child.height; ++var17) {
                           for(var18 = 0; var18 < child.anInt123; ++var18) {
                              if (child.anIntArray44[var16] > 0) {
                                 ObjType var26 = ObjType.method104(child.anIntArray44[var16] - 1);
                                 var31 = String.valueOf(var26.aString7);
                                 if (var26.aBoolean52 || child.anIntArray40[var16] != 1) {
                                    var31 = var31 + " x" + method710(child.anIntArray40[var16]);
                                 }

                                 var19 = var14 + var18 * (child.anInt137 + 115);
                                 var20 = var15 + var17 * (child.anInt126 + 12);
                                 if (child.aBoolean40) {
                                    var29.method149(child.aBoolean37, this.anInt928, child.anInt122, var20, var19 + child.anInt123 / 2, var31);
                                 } else {
                                    var29.method156(child.anInt122, var19, var20, child.aBoolean37, var31);
                                 }
                              }

                              ++var16;
                           }
                        }
                     }

                     if (child.type == 8 && (this.anInt1030 == child.id || this.anInt918 == child.id || this.anInt959 == child.id) && this.anInt856 == 100) {
                        var22 = 0;
                        var16 = 0;
                        PixFont var33 = this.aClass10_Sub1_Sub1_Sub2_3;

                        for(var31 = child.aString2; var31.length() > 0; var16 += var33.anInt230 + 1) {
                           var23 = var31.indexOf("\\n");
                           if (var23 == -1) {
                              var25 = var31;
                              var31 = "";
                           } else {
                              var25 = var31.substring(0, var23);
                              var31 = var31.substring(var23 + 2);
                           }

                           var19 = var33.method150(var25);
                           if (var19 > var22) {
                              var22 = var19;
                           }
                        }

                        var22 += 6;
                        var16 += 7;
                        var23 = var14 + child.anInt123 - var22 - 5;
                        var19 = var15 + child.height + 5;
                        if (var23 < var14 + 5) {
                           var23 = var14 + 5;
                        }

                        if (var23 + var22 > var2 + root.anInt123) {
                           var23 = var2 + root.anInt123 - var22;
                        }

                        if (var19 + var16 > var1 + root.height) {
                           var19 = var1 + root.height - var16;
                        }

                        Draw2D.fillRect(var16, var19, 16777120, var22, var23);
                        Draw2D.drawRect(var19, var16, 0, var23, var22);
                        var31 = child.aString2;

                        for(var20 = var19 + var33.anInt230 + 2; var31.length() > 0; var20 += var33.anInt230 + 1) {
                           var21 = var31.indexOf("\\n");
                           if (var21 == -1) {
                              var25 = var31;
                              var31 = "";
                           } else {
                              var25 = var31.substring(0, var21);
                              var31 = var31.substring(var21 + 2);
                           }

                           var33.method156(0, var23 + 3, var20, false, var25);
                        }
                     }
                  }
               }
            }
         }

         Draw2D.setBounds(top, left, bottom, right);
      }

   }

   private void method722(int var1) {
      if (super.gameSurface == null) {
         this.method716();
         this.aClass19_19 = null;
         this.aClass19_20 = null;
         this.aClass19_21 = null;
         if (var1 >= 0) {
            this.anInt898 = -4;
         }

         this.aClass19_22 = null;
         this.aClass19_23 = null;
         this.aClass19_24 = null;
         this.aClass19_25 = null;
         this.aClass19_26 = null;
         this.aClass19_27 = null;
         this.aClass19_18 = null;
         this.aClass19_16 = null;
         this.aClass19_15 = null;
         this.areaViewport = null;
         this.aClass19_12 = null;
         this.aClass19_13 = null;
         this.aClass19_14 = null;
         super.gameSurface = new PixMap(this.getBaseComponent(), 765, 503);
         this.aBoolean236 = true;
      }

   }

   public void startThread(Runnable var1, int var2) {
      if (var2 > 10) {
         var2 = 10;
      }

      if (signlink.mainapp == null) {
         super.startThread(var1, var2);
      } else {
         signlink.startthread(var1, var2);
      }

   }

   private DataInputStream method606(String var1) throws IOException {
      if (this.aBoolean219) {
         if (this.aSocket3 != null) {
            try {
               this.aSocket3.close();
            } catch (Exception var4) {
            }

            this.aSocket3 = null;
         }

         this.aSocket3 = this.openSocket(43595);
         this.aSocket3.setSoTimeout(10000);
         InputStream var2 = this.aSocket3.getInputStream();
         OutputStream var3 = this.aSocket3.getOutputStream();
         var3.write(("JAGGRAB /" + var1 + "\n\n").getBytes());
         return new DataInputStream(var2);
      } else {
         return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), var1)).openStream()) : signlink.openurl(var1);
      }
   }

   private void setMidiVolume(boolean active, int vol) {
      signlink.midivol = vol;
      if (active) {
         signlink.midi = "voladjust";
      }
   }

   private void login(String var1, String var2, boolean var3) {
      signlink.errorname = var1;

      try {
         if (!var3) {
            this.loginMessage0 = "";
            this.loginMessage1 = "Connecting to server...";
            this.drawTitleScreen(true);
         }

         this.stream = new ClientStream(this.openSocket(portOffset + 43594), this);
         long var4 = Class26.method248(var1);
         int var6 = (int)(var4 >> 16 & 31L);
         this.out.pos = 0;
         this.out.p1(14);
         this.out.p1(var6);
         this.stream.write(2, this.out.data);

         int var7;
         for(var7 = 0; var7 < 8; ++var7) {
            this.stream.read();
         }

         var7 = this.stream.read();
         int var8 = var7;
         int var9;
         if (var7 == 0) {
            this.stream.read(this.in.data, 0, 8);
            this.in.pos = 0;
            this.serverSeed = this.in.g8();
            int[] var10 = new int[]{(int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(this.serverSeed >> 32), (int)this.serverSeed};
            this.out.pos = 0;
            this.out.p1(10);
            this.out.p4(var10[0]);
            this.out.p4(var10[1]);
            this.out.p4(var10[2]);
            this.out.p4(var10[3]);
            this.out.p4(signlink.anInt1058);
            this.out.pjstr(var1);
            this.out.pjstr(var2);
            this.out.rsaenc(modulus, exponent);
            this.login.pos = 0;
            if (var3) {
               this.login.p1(18);
            } else {
               this.login.p1(16);
            }

            this.login.p1(this.out.pos + 36 + 1 + 1 + 2);
            this.login.p1(255);
            this.login.p2(377);
            this.login.p1(lowMemory ? 1 : 0);

            for(var9 = 0; var9 < 9; ++var9) {
               this.login.p4(this.archiveChecksum[var9]);
            }

            this.login.pdata(this.out.data, this.out.pos);
            this.out.random = new Isaac(var10);

            for(var9 = 0; var9 < 4; ++var9) {
               var10[var9] += 50;
            }

            this.randomIn = new Isaac(var10);
            this.stream.write(this.login.pos, this.login.data);
            var7 = this.stream.read();
         }

         if (var7 == 1) {
            try {
               Thread.sleep(2000L);
            } catch (Exception var20) {
            }

            this.login(var1, var2, var3);
         } else {
            int var11;
            int var14;
            if (var7 == 2) {
               this.anInt842 = this.stream.read();
               aBoolean228 = this.stream.read() == 1;
               this.aLong29 = 0L;
               this.anInt1035 = 0;
               this.aClass7_1.anInt54 = 0;
               super.hasFocus = true;
               this.aBoolean262 = true;
               this.ingame = true;
               this.out.pos = 0;
               this.in.pos = 0;
               this.packetType = -1;
               this.lastPacketType0 = -1;
               this.lastPacketType1 = -1;
               this.lastPacketType2 = -1;
               this.packetSize = 0;
               this.idleNetCycles = 0;
               this.systemUpdateTimer = 0;
               this.idleTimeout = 0;
               this.hintType = 0;
               this.menuSize = 0;
               this.menuVisible = false;
               super.idleCycles = 0;

               for(var14 = 0; var14 < 100; ++var14) {
                  this.messageText[var14] = null;
               }

               this.objSelected = 0;
               this.spellSelected = 0;
               this.sceneState = 0;
               this.waveCount = 0;
               this.cameraAnticheatOffsetX = (int)(Math.random() * 100.0) - 50;
               this.cameraAnticheatOffsetZ = (int)(Math.random() * 110.0) - 55;
               this.cameraAnticheatAngle = (int)(Math.random() * 80.0) - 40;
               this.minimapAnticheatAngle = (int)(Math.random() * 120.0) - 60;
               this.minimapZoom = (int)(Math.random() * 30.0) - 20;
               this.orbitCameraYaw = (int)(Math.random() * 20.0) - 10 & 2047;
               this.anInt923 = 0;
               this.anInt1026 = -1;
               this.anInt955 = 0;
               this.anInt956 = 0;
               this.playerCount = 0;
               this.npcCount = 0;

               for(var9 = 0; var9 < this.MAX_PLAYER_COUNT; ++var9) {
                  this.players[var9] = null;
                  this.playerAppearanceBuffer[var9] = null;
               }

               for(var9 = 0; var9 < 16384; ++var9) {
                  this.npcs[var9] = null;
               }

               localPlayer = this.players[this.anInt883] = new PlayerEntity();
               this.projectiles.clear();
               this.spotanims.clear();

               for(var11 = 0; var11 < 4; ++var11) {
                  for(int var12 = 0; var12 < 104; ++var12) {
                     for(int var13 = 0; var13 < 104; ++var13) {
                        this.levelObjStacks[var11][var12][var13] = null;
                     }
                  }
               }

               this.spawnedLocations = new Class6(true);
               this.anInt839 = 0;
               this.anInt838 = 0;
               this.resetInterface(this.anInt985);
               this.anInt985 = -1;
               this.resetInterface(this.anInt888);
               this.anInt888 = -1;
               this.resetInterface(this.viewportInterfaceId);
               this.viewportInterfaceId = -1;
               this.resetInterface(this.anInt926);
               this.anInt926 = -1;
               this.resetInterface(this.anInt880);
               this.anInt880 = -1;
               this.resetInterface(this.sidebarInterfaceId);
               this.sidebarInterfaceId = -1;
               this.resetInterface(this.currentOverlay);
               this.currentOverlay = -1;
               this.aBoolean254 = false;
               this.anInt1031 = 3;
               this.anInt1010 = 0;
               this.menuVisible = false;
               this.aBoolean216 = false;
               this.aString26 = null;
               this.anInt1047 = 0;
               this.anInt988 = -1;
               this.aBoolean245 = true;
               this.validateCharacterDesign(this.anInt905);

               for(var11 = 0; var11 < 5; ++var11) {
                  this.designColors[var11] = 0;
               }

               for(var11 = 0; var11 < 5; ++var11) {
                  this.aStringArray11[var11] = null;
                  this.aBooleanArray12[var11] = false;
               }

               anInt944 = 0;
               anInt974 = 0;
               anInt1005 = 0;
               anInt925 = 0;
               anInt963 = 0;
               this.prepareGameScreen();
            } else if (var7 == 3) {
               this.loginMessage0 = "";
               this.loginMessage1 = "Invalid username or password.";
            } else if (var7 == 4) {
               this.loginMessage0 = "Your account has been disabled.";
               this.loginMessage1 = "Please check your message-centre for details.";
            } else if (var7 == 5) {
               this.loginMessage0 = "Your account is already logged in.";
               this.loginMessage1 = "Try again in 60 secs...";
            } else if (var7 == 6) {
               this.loginMessage0 = "RuneScape has been updated!";
               this.loginMessage1 = "Please reload this page.";
            } else if (var7 == 7) {
               this.loginMessage0 = "This world is full.";
               this.loginMessage1 = "Please use a different world.";
            } else if (var7 == 8) {
               this.loginMessage0 = "Unable to connect.";
               this.loginMessage1 = "Login server offline.";
            } else if (var7 == 9) {
               this.loginMessage0 = "Login limit exceeded.";
               this.loginMessage1 = "Too many connections from your address.";
            } else if (var7 == 10) {
               this.loginMessage0 = "Unable to connect.";
               this.loginMessage1 = "Bad session id.";
            } else if (var7 == 12) {
               this.loginMessage0 = "You need a members account to login to this world.";
               this.loginMessage1 = "Please subscribe, or use a different world.";
            } else if (var7 == 13) {
               this.loginMessage0 = "Could not complete login.";
               this.loginMessage1 = "Please try using a different world.";
            } else if (var7 == 14) {
               this.loginMessage0 = "The server is being updated.";
               this.loginMessage1 = "Please wait 1 minute and try again.";
            } else if (var7 == 15) {
               this.ingame = true;
               this.out.pos = 0;
               this.in.pos = 0;
               this.packetType = -1;
               this.lastPacketType0 = -1;
               this.lastPacketType1 = -1;
               this.lastPacketType2 = -1;
               this.packetSize = 0;
               this.idleNetCycles = 0;
               this.systemUpdateTimer = 0;
               this.menuSize = 0;
               this.menuVisible = false;
               this.loginTime = System.currentTimeMillis();
            } else if (var7 == 16) {
               this.loginMessage0 = "Login attempts exceeded.";
               this.loginMessage1 = "Please wait 1 minute and try again.";
            } else if (var7 == 17) {
               this.loginMessage0 = "You are standing in a members-only area.";
               this.loginMessage1 = "To play on this world move to a free area first";
            } else if (var7 == 18) {
               this.loginMessage0 = "Account locked as we suspect it has been stolen.";
               this.loginMessage1 = "Press 'recover a locked account' on front page.";
            } else if (var7 == 20) {
               this.loginMessage0 = "Invalid loginserver requested";
               this.loginMessage1 = "Please try using a different world.";
            } else if (var7 == 21) {
               var14 = this.stream.read();

               for(var11 = var14 + 3; var11 >= 0; --var11) {
                  this.loginMessage0 = "You have only just left another world";
                  this.loginMessage1 = "Your profile will be transferred in: " + var11;
                  this.drawTitleScreen(true);

                  try {
                     Thread.sleep(1200L);
                  } catch (Exception var19) {
                  }
               }

               this.login(var1, var2, var3);
            } else if (var7 == 22) {
               this.loginMessage0 = "Malformed login packet.";
               this.loginMessage1 = "Please try again.";
            } else if (var7 == 23) {
               this.loginMessage0 = "No reply from loginserver.";
               this.loginMessage1 = "Please try again.";
            } else if (var7 == 24) {
               this.loginMessage0 = "Error loading your profile.";
               this.loginMessage1 = "Please contact customer support.";
            } else if (var7 == 25) {
               this.loginMessage0 = "Unexpected loginserver response.";
               this.loginMessage1 = "Please try using a different world.";
            } else if (var7 == 26) {
               this.loginMessage0 = "This computers address has been blocked";
               this.loginMessage1 = "as it was used to break our rules";
            } else if (var7 != -1) {
               System.out.println("response:" + var7);
               this.loginMessage0 = "Unexpected server response";
               this.loginMessage1 = "Please try using a different world.";
            } else if (var8 != 0) {
               this.loginMessage0 = "No response from server";
               this.loginMessage1 = "Please try using a different world.";
            } else if (this.anInt833 < 2) {
               try {
                  Thread.sleep(2000L);
               } catch (Exception var18) {
               }

               ++this.anInt833;
               this.login(var1, var2, var3);
            } else {
               this.loginMessage0 = "No response from loginserver";
               this.loginMessage1 = "Please wait 1 minute and try again.";
            }
         }
      } catch (IOException var21) {
         this.loginMessage0 = "";
         this.loginMessage1 = "Error connecting to server.";
      }

   }

   private boolean method610(boolean var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12;
      int var13;
      for(var13 = 0; var13 < 104; ++var13) {
         for(var12 = 0; var12 < 104; ++var12) {
            this.anIntArrayArray22[var13][var12] = 0;
            this.anIntArrayArray25[var13][var12] = 99999999;
         }
      }

      var12 = var11;
      var13 = var3;
      this.anIntArrayArray22[var11][var3] = 99;
      this.anIntArrayArray25[var11][var3] = 0;
      byte var14 = 0;
      int var15 = 0;
      this.anIntArray254[0] = var11;
      int var16 = var14 + 1;
      this.anIntArray255[0] = var3;
      boolean var17 = false;
      int var18 = this.anIntArray254.length;
      int[][] var19 = this.levelCollisionMap[this.currentLevel].anIntArrayArray16;

      int var20;
      while(var15 != var16) {
         var12 = this.anIntArray254[var15];
         var13 = this.anIntArray255[var15];
         var15 = (var15 + 1) % var18;
         if (var12 == var8 && var13 == var2) {
            var17 = true;
            break;
         }

         if (var7 != 0) {
            if ((var7 < 5 || var7 == 10) && this.levelCollisionMap[this.currentLevel].method489(var8, var2, var7 - 1, var12, var13, var10)) {
               var17 = true;
               break;
            }

            if (var7 < 10 && this.levelCollisionMap[this.currentLevel].method490(var13, var8, var12, var10, var7 - 1, var2)) {
               var17 = true;
               break;
            }
         }

         if (var4 != 0 && var5 != 0 && this.levelCollisionMap[this.currentLevel].method491(var4, var12, var8, var9, var5, var2, var13)) {
            var17 = true;
            break;
         }

         var20 = this.anIntArrayArray25[var12][var13] + 1;
         if (var12 > 0 && this.anIntArrayArray22[var12 - 1][var13] == 0 && (var19[var12 - 1][var13] & 19398920) == 0) {
            this.anIntArray254[var16] = var12 - 1;
            this.anIntArray255[var16] = var13;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12 - 1][var13] = 2;
            this.anIntArrayArray25[var12 - 1][var13] = var20;
         }

         if (var12 < 103 && this.anIntArrayArray22[var12 + 1][var13] == 0 && (var19[var12 + 1][var13] & 19399040) == 0) {
            this.anIntArray254[var16] = var12 + 1;
            this.anIntArray255[var16] = var13;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12 + 1][var13] = 8;
            this.anIntArrayArray25[var12 + 1][var13] = var20;
         }

         if (var13 > 0 && this.anIntArrayArray22[var12][var13 - 1] == 0 && (var19[var12][var13 - 1] & 19398914) == 0) {
            this.anIntArray254[var16] = var12;
            this.anIntArray255[var16] = var13 - 1;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12][var13 - 1] = 1;
            this.anIntArrayArray25[var12][var13 - 1] = var20;
         }

         if (var13 < 103 && this.anIntArrayArray22[var12][var13 + 1] == 0 && (var19[var12][var13 + 1] & 19398944) == 0) {
            this.anIntArray254[var16] = var12;
            this.anIntArray255[var16] = var13 + 1;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12][var13 + 1] = 4;
            this.anIntArrayArray25[var12][var13 + 1] = var20;
         }

         if (var12 > 0 && var13 > 0 && this.anIntArrayArray22[var12 - 1][var13 - 1] == 0 && (var19[var12 - 1][var13 - 1] & 19398926) == 0 && (var19[var12 - 1][var13] & 19398920) == 0 && (var19[var12][var13 - 1] & 19398914) == 0) {
            this.anIntArray254[var16] = var12 - 1;
            this.anIntArray255[var16] = var13 - 1;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12 - 1][var13 - 1] = 3;
            this.anIntArrayArray25[var12 - 1][var13 - 1] = var20;
         }

         if (var12 < 103 && var13 > 0 && this.anIntArrayArray22[var12 + 1][var13 - 1] == 0 && (var19[var12 + 1][var13 - 1] & 19399043) == 0 && (var19[var12 + 1][var13] & 19399040) == 0 && (var19[var12][var13 - 1] & 19398914) == 0) {
            this.anIntArray254[var16] = var12 + 1;
            this.anIntArray255[var16] = var13 - 1;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12 + 1][var13 - 1] = 9;
            this.anIntArrayArray25[var12 + 1][var13 - 1] = var20;
         }

         if (var12 > 0 && var13 < 103 && this.anIntArrayArray22[var12 - 1][var13 + 1] == 0 && (var19[var12 - 1][var13 + 1] & 19398968) == 0 && (var19[var12 - 1][var13] & 19398920) == 0 && (var19[var12][var13 + 1] & 19398944) == 0) {
            this.anIntArray254[var16] = var12 - 1;
            this.anIntArray255[var16] = var13 + 1;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12 - 1][var13 + 1] = 6;
            this.anIntArrayArray25[var12 - 1][var13 + 1] = var20;
         }

         if (var12 < 103 && var13 < 103 && this.anIntArrayArray22[var12 + 1][var13 + 1] == 0 && (var19[var12 + 1][var13 + 1] & 19399136) == 0 && (var19[var12 + 1][var13] & 19399040) == 0 && (var19[var12][var13 + 1] & 19398944) == 0) {
            this.anIntArray254[var16] = var12 + 1;
            this.anIntArray255[var16] = var13 + 1;
            var16 = (var16 + 1) % var18;
            this.anIntArrayArray22[var12 + 1][var13 + 1] = 12;
            this.anIntArrayArray25[var12 + 1][var13 + 1] = var20;
         }
      }

      this.anInt957 = 0;
      int var21;
      int var22;
      int var23;
      int var25;
      if (!var17) {
         if (!var1) {
            return false;
         }

         var20 = 1000;
         var21 = 100;

         for(var22 = var8 - 10; var22 <= var8 + 10; ++var22) {
            for(var23 = var2 - 10; var23 <= var2 + 10; ++var23) {
               if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && this.anIntArrayArray25[var22][var23] < 100) {
                  int var24 = 0;
                  if (var22 < var8) {
                     var24 = var8 - var22;
                  } else if (var22 > var8 + var4 - 1) {
                     var24 = var22 + 1 - var8 - var4;
                  }

                  var25 = 0;
                  if (var23 < var2) {
                     var25 = var2 - var23;
                  } else if (var23 > var2 + var5 - 1) {
                     var25 = var23 + 1 - var2 - var5;
                  }

                  int var26 = var24 * var24 + var25 * var25;
                  if (var26 < var20 || var26 == var20 && this.anIntArrayArray25[var22][var23] < var21) {
                     var20 = var26;
                     var21 = this.anIntArrayArray25[var22][var23];
                     var12 = var22;
                     var13 = var23;
                  }
               }
            }
         }

         if (var20 == 1000) {
            return false;
         }

         if (var12 == var11 && var13 == var3) {
            return false;
         }

         this.anInt957 = 1;
      }

      byte var27 = 0;
      this.anIntArray254[0] = var12;
      var15 = var27 + 1;
      this.anIntArray255[0] = var13;

      for(var20 = var21 = this.anIntArrayArray22[var12][var13]; var12 != var11 || var13 != var3; var20 = this.anIntArrayArray22[var12][var13]) {
         if (var20 != var21) {
            var21 = var20;
            this.anIntArray254[var15] = var12;
            this.anIntArray255[var15++] = var13;
         }

         if ((var20 & 2) != 0) {
            ++var12;
         } else if ((var20 & 8) != 0) {
            --var12;
         }

         if ((var20 & 1) != 0) {
            ++var13;
         } else if ((var20 & 4) != 0) {
            --var13;
         }
      }

      if (var15 <= 0) {
         if (var6 == 1) {
            return false;
         } else {
            return true;
         }
      } else {
         var18 = var15;
         if (var15 > 25) {
            var18 = 25;
         }

         --var15;
         var25 = this.anIntArray254[var15];
         var22 = this.anIntArray255[var15];
         if (var6 == 0) {
            this.out.p1isaac(28);
            this.out.p1(var18 + var18 + 3);
         }

         if (var6 == 1) {
            this.out.p1isaac(213);
            this.out.p1(var18 + var18 + 3 + 14);
         }

         if (var6 == 2) {
            this.out.p1isaac(247);
            this.out.p1(var18 + var18 + 3);
         }

         this.out.method338(var25 + this.sceneBaseTileX);
         this.out.p1(super.actionKey[5] == 1 ? 1 : 0);
         this.out.method338(var22 + this.sceneBaseTileZ);
         this.anInt955 = this.anIntArray254[0];
         this.anInt956 = this.anIntArray255[0];

         for(var23 = 1; var23 < var18; ++var23) {
            --var15;
            this.out.p1(this.anIntArray254[var15] - var25);
            this.out.method329(this.anIntArray255[var15] - var22);
         }

         return true;
      }
   }

   private void saveMidi(boolean fade, byte[] src, int var3) {
      if (this.midiActive) {
         signlink.midifade = fade ? 1 : 0;
         signlink.midisave(src, src.length);
         boolean var4 = false;
      }

   }

   private void method658(Class10_Sub1_Sub1_Sub3 var1) {
      this.packetSize += 0;

      int var2;
      for(var2 = 0; var2 < this.anIntArray259.length; ++var2) {
         this.anIntArray259[var2] = 0;
      }

      int var3;
      for(var3 = 0; var3 < 5000; ++var3) {
         var2 = (int)(Math.random() * 128.0 * 256.0);
         this.anIntArray259[var2] = (int)(Math.random() * 256.0);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               this.anIntArray260[var5] = (this.anIntArray259[var5 - 1] + this.anIntArray259[var5 + 1] + this.anIntArray259[var5 - 128] + this.anIntArray259[var5 + 128]) / 4;
            }
         }

         int[] var9 = this.anIntArray259;
         this.anIntArray259 = this.anIntArray260;
         this.anIntArray260 = var9;
      }

      if (var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.anInt653; ++var4) {
            for(var5 = 0; var5 < var1.anInt652; ++var5) {
               if (var1.aByteArray16[var3++] != 0) {
                  int var6 = var5 + var1.anInt654 + 16;
                  int var7 = var4 + var1.anInt655 + 16;
                  int var8 = var6 + (var7 << 7);
                  this.anIntArray259[var8] = 0;
               }
            }
         }
      }

   }

   private void drawMenu() {
      int var1 = this.anInt1040;
      int var2 = this.anInt1041;
      int var3 = this.anInt1042;
      int var4 = this.anInt1043;
      Draw2D.fillRect(var4, var2, 6116423, var3, var1);
      Draw2D.fillRect(16, var2 + 1, 0, var3 - 2, var1 + 1);
      Draw2D.drawRect(var2 + 18, var4 - 19, 0, var1 + 1, var3 - 2);
      this.aClass10_Sub1_Sub1_Sub2_4.method152(var1 + 3, 6116423, var2 + 14, "Choose Option");
      int var5 = super.mouseX;
      int var6 = super.mouseY;
      if (this.anInt1039 == 0) {
         var5 -= 4;
         var6 -= 4;
      }

      if (this.anInt1039 == 1) {
         var5 -= 553;
         var6 -= 205;
      }

      if (this.anInt1039 == 2) {
         var5 -= 17;
         var6 -= 357;
      }

      for(int var7 = 0; var7 < this.menuSize; ++var7) {
         int var8 = var2 + (this.menuSize - 1 - var7) * 15 + 31;
         int var9 = 16777215;
         if (var5 > var1 && var5 < var1 + var3 && var6 > var8 - 13 && var6 < var8 + 3) {
            var9 = 16776960;
         }

         this.aClass10_Sub1_Sub1_Sub2_4.method156(var9, var1 + 3, var8, true, this.menuOption[var7]);
      }

   }

   private boolean method670(ComType var1) {
      if (var1.anIntArray45 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.anIntArray45.length; ++var2) {
            int var3 = this.method704(var2, var1);
            int var4 = var1.anIntArray42[var2];
            if (var1.anIntArray45[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var1.anIntArray45[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.anIntArray45[var2] == 4) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private void handleInterfaceInput(int var1, ComType var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2.type == 0 && var2.childId != null && !var2.hide && var6 >= var5 && var7 >= var1 && var6 <= var5 + var2.anInt123 && var7 <= var1 + var2.height) {
         int var8 = var2.childId.length;

         for(int var9 = 0; var9 < var8; ++var9) {
            int var10 = var2.childX[var9] + var5;
            int var11 = var2.childY[var9] + var1 - var4;
            ComType var12 = ComType.method87(var2.childId[var9]);
            int var13 = var10 + var12.x;
            int var14 = var11 + var12.y;
            if ((var12.anInt132 >= 0 || var12.anInt136 != 0) && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
               if (var12.anInt132 >= 0) {
                  this.anInt863 = var12.anInt132;
               } else {
                  this.anInt863 = var12.id;
               }
            }

            if (var12.type == 8 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
               this.anInt1045 = var12.id;
            }

            if (var12.type == 0) {
               this.handleInterfaceInput(var14, var12, var3, var12.scrollPosition, var13, var6, var7);
               if (var12.scroll > var12.height) {
                  this.method617(var12.scroll, var14, var12, var7, var3, var6, var12.height, var13 + var12.anInt123);
               }
            } else {
               if (var12.anInt150 == 1 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
                  boolean var15 = false;
                  if (var12.clientCode != 0) {
                     var15 = this.method598(var12, 8);
                  }

                  if (!var15) {
                     this.menuOption[this.menuSize] = var12.aString4;
                     this.menuAction[this.menuSize] = 352;
                     this.anIntArray232[this.menuSize] = var12.id;
                     ++this.menuSize;
                  }
               }

               if (var12.anInt150 == 2 && this.spellSelected == 0 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
                  String var22 = var12.aString5;
                  if (var22.indexOf(" ") != -1) {
                     var22 = var22.substring(0, var22.indexOf(" "));
                  }

                  this.menuOption[this.menuSize] = var22 + " @gre@" + var12.aString1;
                  this.menuAction[this.menuSize] = 70;
                  this.anIntArray232[this.menuSize] = var12.id;
                  ++this.menuSize;
               }

               if (var12.anInt150 == 3 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
                  this.menuOption[this.menuSize] = "Close";
                  if (var3 == 3) {
                     this.menuAction[this.menuSize] = 55;
                  } else {
                     this.menuAction[this.menuSize] = 639;
                  }

                  this.anIntArray232[this.menuSize] = var12.id;
                  ++this.menuSize;
               }

               if (var12.anInt150 == 4 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
                  this.menuOption[this.menuSize] = var12.aString4;
                  this.menuAction[this.menuSize] = 890;
                  this.anIntArray232[this.menuSize] = var12.id;
                  ++this.menuSize;
               }

               if (var12.anInt150 == 5 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
                  this.menuOption[this.menuSize] = var12.aString4;
                  this.menuAction[this.menuSize] = 518;
                  this.anIntArray232[this.menuSize] = var12.id;
                  ++this.menuSize;
               }

               if (var12.anInt150 == 6 && !this.aBoolean254 && var6 >= var13 && var7 >= var14 && var6 < var13 + var12.anInt123 && var7 < var14 + var12.height) {
                  this.menuOption[this.menuSize] = var12.aString4;
                  this.menuAction[this.menuSize] = 575;
                  this.anIntArray232[this.menuSize] = var12.id;
                  ++this.menuSize;
               }

               if (var12.type == 2) {
                  int var23 = 0;

                  for(int var16 = 0; var16 < var12.height; ++var16) {
                     for(int var17 = 0; var17 < var12.anInt123; ++var17) {
                        int var18 = var13 + var17 * (var12.anInt137 + 32);
                        int var19 = var14 + var16 * (var12.anInt126 + 32);
                        if (var23 < 20) {
                           var18 += var12.anIntArray39[var23];
                           var19 += var12.anIntArray38[var23];
                        }

                        if (var6 >= var18 && var7 >= var19 && var6 < var18 + 32 && var7 < var19 + 32) {
                           this.anInt930 = var23;
                           this.anInt931 = var12.id;
                           if (var12.anIntArray44[var23] > 0) {
                              ObjType var20 = ObjType.method104(var12.anIntArray44[var23] - 1);
                              if (this.objSelected == 1 && var12.aBoolean34) {
                                 if (var12.id != this.anInt967 || var23 != this.anInt966) {
                                    this.menuOption[this.menuSize] = "Use " + this.aString30 + " with @lre@" + var20.aString7;
                                    this.menuAction[this.menuSize] = 903;
                                    this.anIntArray234[this.menuSize] = var20.anInt196;
                                    this.anIntArray231[this.menuSize] = var23;
                                    this.anIntArray232[this.menuSize] = var12.id;
                                    ++this.menuSize;
                                 }
                              } else if (this.spellSelected == 1 && var12.aBoolean34) {
                                 if ((this.anInt980 & 16) == 16) {
                                    this.menuOption[this.menuSize] = this.aString31 + " @lre@" + var20.aString7;
                                    this.menuAction[this.menuSize] = 361;
                                    this.anIntArray234[this.menuSize] = var20.anInt196;
                                    this.anIntArray231[this.menuSize] = var23;
                                    this.anIntArray232[this.menuSize] = var12.id;
                                    ++this.menuSize;
                                 }
                              } else {
                                 int var21;
                                 if (var12.aBoolean34) {
                                    for(var21 = 4; var21 >= 3; --var21) {
                                       if (var20.aStringArray3 != null && var20.aStringArray3[var21] != null) {
                                          this.menuOption[this.menuSize] = var20.aStringArray3[var21] + " @lre@" + var20.aString7;
                                          if (var21 == 3) {
                                             this.menuAction[this.menuSize] = 227;
                                          }

                                          if (var21 == 4) {
                                             this.menuAction[this.menuSize] = 891;
                                          }

                                          this.anIntArray234[this.menuSize] = var20.anInt196;
                                          this.anIntArray231[this.menuSize] = var23;
                                          this.anIntArray232[this.menuSize] = var12.id;
                                          ++this.menuSize;
                                       } else if (var21 == 4) {
                                          this.menuOption[this.menuSize] = "Drop @lre@" + var20.aString7;
                                          this.menuAction[this.menuSize] = 891;
                                          this.anIntArray234[this.menuSize] = var20.anInt196;
                                          this.anIntArray231[this.menuSize] = var23;
                                          this.anIntArray232[this.menuSize] = var12.id;
                                          ++this.menuSize;
                                       }
                                    }
                                 }

                                 if (var12.aBoolean43) {
                                    this.menuOption[this.menuSize] = "Use @lre@" + var20.aString7;
                                    this.menuAction[this.menuSize] = 52;
                                    this.anIntArray234[this.menuSize] = var20.anInt196;
                                    this.anIntArray231[this.menuSize] = var23;
                                    this.anIntArray232[this.menuSize] = var12.id;
                                    ++this.menuSize;
                                 }

                                 if (var12.aBoolean34 && var20.aStringArray3 != null) {
                                    for(var21 = 2; var21 >= 0; --var21) {
                                       if (var20.aStringArray3[var21] != null) {
                                          this.menuOption[this.menuSize] = var20.aStringArray3[var21] + " @lre@" + var20.aString7;
                                          if (var21 == 0) {
                                             this.menuAction[this.menuSize] = 961;
                                          }

                                          if (var21 == 1) {
                                             this.menuAction[this.menuSize] = 399;
                                          }

                                          if (var21 == 2) {
                                             this.menuAction[this.menuSize] = 324;
                                          }

                                          this.anIntArray234[this.menuSize] = var20.anInt196;
                                          this.anIntArray231[this.menuSize] = var23;
                                          this.anIntArray232[this.menuSize] = var12.id;
                                          ++this.menuSize;
                                       }
                                    }
                                 }

                                 if (var12.aStringArray1 != null) {
                                    for(var21 = 4; var21 >= 0; --var21) {
                                       if (var12.aStringArray1[var21] != null) {
                                          this.menuOption[this.menuSize] = var12.aStringArray1[var21] + " @lre@" + var20.aString7;
                                          if (var21 == 0) {
                                             this.menuAction[this.menuSize] = 9;
                                          }

                                          if (var21 == 1) {
                                             this.menuAction[this.menuSize] = 225;
                                          }

                                          if (var21 == 2) {
                                             this.menuAction[this.menuSize] = 444;
                                          }

                                          if (var21 == 3) {
                                             this.menuAction[this.menuSize] = 564;
                                          }

                                          if (var21 == 4) {
                                             this.menuAction[this.menuSize] = 894;
                                          }

                                          this.anIntArray234[this.menuSize] = var20.anInt196;
                                          this.anIntArray231[this.menuSize] = var23;
                                          this.anIntArray232[this.menuSize] = var12.id;
                                          ++this.menuSize;
                                       }
                                    }
                                 }

                                 this.menuOption[this.menuSize] = "Examine @lre@" + var20.aString7;
                                 this.menuAction[this.menuSize] = 1094;
                                 this.anIntArray234[this.menuSize] = var20.anInt196;
                                 this.anIntArray231[this.menuSize] = var23;
                                 this.anIntArray232[this.menuSize] = var12.id;
                                 ++this.menuSize;
                              }
                           }
                        }

                        ++var23;
                     }
                  }
               }
            }
         }
      }

   }

   private int getTopLevelCutscene() {
      int var1 = this.getHeightmapY(this.cameraZ, this.cameraX, this.currentLevel);
      return var1 - this.cameraY < 800 && (this.aByteArrayArrayArray8[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 4) != 0 ? this.currentLevel : 3;
   }

   private void method589(String var1) {
      if (var1 != null && var1.length() != 0) {
         String var2 = var1;
         String[] var3 = new String[100];
         int var4 = 0;

         while(true) {
            int var5 = var2.indexOf(" ");
            if (var5 == -1) {
               var2 = var2.trim();
               if (var2.length() > 0) {
                  var3[var4++] = var2.toLowerCase();
               }

               this.anInt840 = 0;

               label46:
               for(var5 = 0; var5 < ObjType.anInt179; ++var5) {
                  ObjType var9 = ObjType.method104(var5);
                  if (var9.anInt182 == -1 && var9.aString7 != null) {
                     String var7 = var9.aString7.toLowerCase();

                     for(int var8 = 0; var8 < var4; ++var8) {
                        if (var7.indexOf(var3[var8]) == -1) {
                           continue label46;
                        }
                     }

                     this.aStringArray9[this.anInt840] = var7;
                     this.anIntArray219[this.anInt840] = var5;
                     ++this.anInt840;
                     if (this.anInt840 >= this.aStringArray9.length) {
                        return;
                     }
                  }
               }

               return;
            }

            String var6 = var2.substring(0, var5).trim();
            if (var6.length() > 0) {
               var3[var4++] = var6.toLowerCase();
            }

            var2 = var2.substring(var5 + 1);
         }
      } else {
         this.anInt840 = 0;
      }
   }

   private void projectFromGround(PathingEntity entity, int height) {
      this.projectFromGround(entity.x, entity.z, height);
   }

   private boolean method701(int var1, byte var2) {
      if (var1 < 0) {
         return false;
      } else {
         int var3 = this.menuAction[var1];
         if (var2 != 97) {
            throw new NullPointerException();
         } else {
            if (var3 >= 2000) {
               var3 -= 2000;
            }

            return var3 == 762;
         }
      }
   }

   private void method620(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var4 >= 1 && var2 <= 102 && var4 <= 102) {
         if (lowMemory && var5 != this.currentLevel) {
            return;
         }

         int var8 = 0;
         if (var7 == 0) {
            var8 = this.scene.method216(var5, var2, var4);
         }

         if (var7 == 1) {
            var8 = this.scene.method217(var2, var5, var4);
         }

         if (var7 == 2) {
            var8 = this.scene.method218(var5, var2, var4);
         }

         if (var7 == 3) {
            var8 = this.scene.method219(var5, var2, var4);
         }

         int var9;
         if (var8 != 0) {
            var9 = this.scene.method220(var5, var2, var4, var8);
            int var10 = var8 >> 14 & 32767;
            int var11 = var9 & 31;
            int var12 = var9 >> 6;
            LocType var13;
            if (var7 == 0) {
               this.scene.method207(var4, var5, var2);
               var13 = LocType.method523(var10);
               if (var13.aBoolean192) {
                  this.levelCollisionMap[var5].method485(var12, var2, var4, var11, var13.aBoolean191);
               }
            }

            if (var7 == 1) {
               this.scene.method208(var2, var4, var5);
            }

            if (var7 == 2) {
               this.scene.method209(var4, var5, var2);
               var13 = LocType.method523(var10);
               if (var2 + var13.anInt707 > 103 || var4 + var13.anInt707 > 103 || var2 + var13.anInt697 > 103 || var4 + var13.anInt697 > 103) {
                  return;
               }

               if (var13.aBoolean192) {
                  this.levelCollisionMap[var5].method486(this.anInt927, var4, var2, var12, var13.anInt697, var13.aBoolean191, var13.anInt707);
               }
            }

            if (var7 == 3) {
               this.scene.method210(var2, var4, var5);
               var13 = LocType.method523(var10);
               if (var13.aBoolean192 && var13.aBoolean180) {
                  this.levelCollisionMap[var5].method488(var2, var4);
               }
            }
         }

         if (var3 >= 0) {
            var9 = var5;
            if (var5 < 3 && (this.aByteArrayArrayArray8[1][var2][var4] & 2) == 2) {
               var9 = var5 + 1;
            }

            World.method13(var3, var9, var6, var4, this.levelCollisionMap[var5], var1, var2, var5, this.scene, this.anIntArrayArrayArray8);
            return;
         }
      }

   }

   private void stopMidi() {
      signlink.midiplay = false;
      signlink.midifade = 0;
      signlink.midi = "stop";
   }

   private void method690(int var1) {
      int[] var2 = this.aClass10_Sub1_Sub1_Sub1_11.pixels;
      int var3 = var2.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         var2[var4] = 0;
      }

      int var5;
      int var6;
      for(var6 = 1; var6 < 103; ++var6) {
         var4 = (103 - var6) * 512 * 4 + 24628;

         for(var5 = 1; var5 < 103; ++var5) {
            if ((this.aByteArrayArrayArray8[var1][var5][var6] & 24) == 0) {
               this.scene.method225(var2, var4, var1, var5, var6);
            }

            if (var1 < 3 && (this.aByteArrayArrayArray8[var1 + 1][var5][var6] & 8) != 0) {
               this.scene.method225(var2, var4, var1 + 1, var5, var6);
            }

            var4 += 4;
         }
      }

      var4 = ((int)(Math.random() * 20.0) + 238 - 10 << 16) + ((int)(Math.random() * 20.0) + 238 - 10 << 8) + (int)(Math.random() * 20.0) + 238 - 10;
      var5 = (int)(Math.random() * 20.0) + 238 - 10 << 16;
      this.aClass10_Sub1_Sub1_Sub1_11.bind();

      int var7;
      for(var7 = 1; var7 < 103; ++var7) {
         for(var6 = 1; var6 < 103; ++var6) {
            if ((this.aByteArrayArrayArray8[var1][var6][var7] & 24) == 0) {
               this.method725(var7, var1, var6, var5, 563, var4);
            }

            if (var1 < 3 && (this.aByteArrayArrayArray8[var1 + 1][var6][var7] & 8) != 0) {
               this.method725(var7, var1 + 1, var6, var5, 563, var4);
            }
         }
      }

      if (this.areaViewport != null) {
         this.areaViewport.method130();
         Draw3D.lineOffset = this.anIntArray238;
      }

      ++anInt938;
      if (anInt938 > 177) {
         anInt938 = 0;
         this.out.p1isaac(173);
         this.out.p3(2657152);
      }

      this.anInt936 = 0;

      for(var6 = 0; var6 < 104; ++var6) {
         for(var7 = 0; var7 < 104; ++var7) {
            int var8 = this.scene.method219(this.currentLevel, var6, var7);
            if (var8 != 0) {
               var8 = var8 >> 14 & 32767;
               int var9 = LocType.method523(var8).anInt710;
               if (var9 >= 0) {
                  int var10 = var6;
                  int var11 = var7;
                  if (var9 != 22 && var9 != 29 && var9 != 34 && var9 != 36 && var9 != 46 && var9 != 47 && var9 != 48) {
                     int[][] var12 = this.levelCollisionMap[this.currentLevel].anIntArrayArray16;

                     for(int var13 = 0; var13 < 10; ++var13) {
                        int var14 = (int)(Math.random() * 4.0);
                        if (var14 == 0 && var10 > 0 && var10 > var6 - 3 && (var12[var10 - 1][var11] & 19398920) == 0) {
                           --var10;
                        }

                        if (var14 == 1 && var10 < 103 && var10 < var6 + 3 && (var12[var10 + 1][var11] & 19399040) == 0) {
                           ++var10;
                        }

                        if (var14 == 2 && var11 > 0 && var11 > var7 - 3 && (var12[var10][var11 - 1] & 19398914) == 0) {
                           --var11;
                        }

                        if (var14 == 3 && var11 < 103 && var11 < var7 + 3 && (var12[var10][var11 + 1] & 19398944) == 0) {
                           ++var11;
                        }
                     }
                  }

                  this.aClass10_Sub1_Sub1_Sub1Array9[this.anInt936] = this.aClass10_Sub1_Sub1_Sub1Array6[var9];
                  this.anIntArray246[this.anInt936] = var10;
                  this.anIntArray247[this.anInt936] = var11;
                  ++this.anInt936;
               }
            }
         }
      }

   }

   private void handleViewportOptions() {
      if (this.objSelected == 0 && this.spellSelected == 0) {
         this.menuOption[this.menuSize] = "Walk here";
         this.menuAction[this.menuSize] = 14;
         this.anIntArray231[this.menuSize] = super.mouseX;
         this.anIntArray232[this.menuSize] = super.mouseY;
         ++this.menuSize;
      }

      int var1 = -1;

      for(int var2 = 0; var2 < Model.pickedCount; ++var2) {
         int var3 = Model.anIntArray145[var2];
         int var4 = var3 & 127;
         int var5 = var3 >> 7 & 127;
         int var6 = var3 >> 29 & 3;
         int var7 = var3 >> 14 & 32767;
         if (var3 != var1) {
            var1 = var3;
            int var8;
            if (var6 == 2 && this.scene.method220(this.currentLevel, var4, var5, var3) >= 0) {
               LocType var9 = LocType.method523(var7);
               if (var9.anIntArray192 != null) {
                  var9 = var9.method524();
               }

               if (var9 == null) {
                  continue;
               }

               if (this.objSelected == 1) {
                  this.menuOption[this.menuSize] = "Use " + this.aString30 + " with @cya@" + var9.aString12;
                  this.menuAction[this.menuSize] = 467;
                  this.anIntArray234[this.menuSize] = var3;
                  this.anIntArray231[this.menuSize] = var4;
                  this.anIntArray232[this.menuSize] = var5;
                  ++this.menuSize;
               } else if (this.spellSelected != 1) {
                  if (var9.aStringArray7 != null) {
                     for(var8 = 4; var8 >= 0; --var8) {
                        if (var9.aStringArray7[var8] != null) {
                           this.menuOption[this.menuSize] = var9.aStringArray7[var8] + " @cya@" + var9.aString12;
                           if (var8 == 0) {
                              this.menuAction[this.menuSize] = 35;
                           }

                           if (var8 == 1) {
                              this.menuAction[this.menuSize] = 389;
                           }

                           if (var8 == 2) {
                              this.menuAction[this.menuSize] = 888;
                           }

                           if (var8 == 3) {
                              this.menuAction[this.menuSize] = 892;
                           }

                           if (var8 == 4) {
                              this.menuAction[this.menuSize] = 1280;
                           }

                           this.anIntArray234[this.menuSize] = var3;
                           this.anIntArray231[this.menuSize] = var4;
                           this.anIntArray232[this.menuSize] = var5;
                           ++this.menuSize;
                        }
                     }
                  }

                  this.menuOption[this.menuSize] = "Examine @cya@" + var9.aString12;
                  this.menuAction[this.menuSize] = 1412;
                  this.anIntArray234[this.menuSize] = var9.anInt696 << 14;
                  this.anIntArray231[this.menuSize] = var4;
                  this.anIntArray232[this.menuSize] = var5;
                  ++this.menuSize;
               } else if ((this.anInt980 & 4) == 4) {
                  this.menuOption[this.menuSize] = this.aString31 + " @cya@" + var9.aString12;
                  this.menuAction[this.menuSize] = 376;
                  this.anIntArray234[this.menuSize] = var3;
                  this.anIntArray231[this.menuSize] = var4;
                  this.anIntArray232[this.menuSize] = var5;
                  ++this.menuSize;
               }
            }

            PlayerEntity var10;
            int var11;
            NpcEntity var16;
            if (var6 == 1) {
               NpcEntity var12 = this.npcs[var7];
               if (var12.type.aByte31 == 1 && (var12.x & 127) == 64 && (var12.z & 127) == 64) {
                  for(var8 = 0; var8 < this.npcCount; ++var8) {
                     var16 = this.npcs[this.anIntArray256[var8]];
                     if (var16 != null && var16 != var12 && var16.type.aByte31 == 1 && var16.x == var12.x && var16.z == var12.z) {
                        this.method657(var16.type, var5, var4, this.anIntArray256[var8]);
                     }
                  }

                  for(var11 = 0; var11 < this.playerCount; ++var11) {
                     var10 = this.players[this.anIntArray229[var11]];
                     if (var10 != null && var10.x == var12.x && var10.z == var12.z) {
                        this.method613(this.anIntArray229[var11], var5, var4, var10);
                     }
                  }
               }

               this.method657(var12.type, var5, var4, var7);
            }

            if (var6 == 0) {
               PlayerEntity var17 = this.players[var7];
               if ((var17.x & 127) == 64 && (var17.z & 127) == 64) {
                  for(var8 = 0; var8 < this.npcCount; ++var8) {
                     var16 = this.npcs[this.anIntArray256[var8]];
                     if (var16 != null && var16.type.aByte31 == 1 && var16.x == var17.x && var16.z == var17.z) {
                        this.method657(var16.type, var5, var4, this.anIntArray256[var8]);
                     }
                  }

                  for(var11 = 0; var11 < this.playerCount; ++var11) {
                     var10 = this.players[this.anIntArray229[var11]];
                     if (var10 != null && var10 != var17 && var10.x == var17.x && var10.z == var17.z) {
                        this.method613(this.anIntArray229[var11], var5, var4, var10);
                     }
                  }
               }

               this.method613(var7, var5, var4, var17);
            }

            if (var6 == 3) {
               Class6 var18 = this.levelObjStacks[this.currentLevel][var4][var5];
               if (var18 != null) {
                  for(Class10_Sub1_Sub2_Sub1 var13 = (Class10_Sub1_Sub2_Sub1)var18.method7(); var13 != null; var13 = (Class10_Sub1_Sub2_Sub1)var18.method9()) {
                     ObjType var14 = ObjType.method104(var13.anInt211);
                     if (this.objSelected == 1) {
                        this.menuOption[this.menuSize] = "Use " + this.aString30 + " with @lre@" + var14.aString7;
                        this.menuAction[this.menuSize] = 100;
                        this.anIntArray234[this.menuSize] = var13.anInt211;
                        this.anIntArray231[this.menuSize] = var4;
                        this.anIntArray232[this.menuSize] = var5;
                        ++this.menuSize;
                     } else if (this.spellSelected == 1) {
                        if ((this.anInt980 & 1) == 1) {
                           this.menuOption[this.menuSize] = this.aString31 + " @lre@" + var14.aString7;
                           this.menuAction[this.menuSize] = 199;
                           this.anIntArray234[this.menuSize] = var13.anInt211;
                           this.anIntArray231[this.menuSize] = var4;
                           this.anIntArray232[this.menuSize] = var5;
                           ++this.menuSize;
                        }
                     } else {
                        for(int var15 = 4; var15 >= 0; --var15) {
                           if (var14.aStringArray2 != null && var14.aStringArray2[var15] != null) {
                              this.menuOption[this.menuSize] = var14.aStringArray2[var15] + " @lre@" + var14.aString7;
                              if (var15 == 0) {
                                 this.menuAction[this.menuSize] = 68;
                              }

                              if (var15 == 1) {
                                 this.menuAction[this.menuSize] = 26;
                              }

                              if (var15 == 2) {
                                 this.menuAction[this.menuSize] = 684;
                              }

                              if (var15 == 3) {
                                 this.menuAction[this.menuSize] = 930;
                              }

                              if (var15 == 4) {
                                 this.menuAction[this.menuSize] = 270;
                              }

                              this.anIntArray234[this.menuSize] = var13.anInt211;
                              this.anIntArray231[this.menuSize] = var4;
                              this.anIntArray232[this.menuSize] = var5;
                              ++this.menuSize;
                           } else if (var15 == 2) {
                              this.menuOption[this.menuSize] = "Take @lre@" + var14.aString7;
                              this.menuAction[this.menuSize] = 684;
                              this.anIntArray234[this.menuSize] = var13.anInt211;
                              this.anIntArray231[this.menuSize] = var4;
                              this.anIntArray232[this.menuSize] = var5;
                              ++this.menuSize;
                           }
                        }

                        this.menuOption[this.menuSize] = "Examine @lre@" + var14.aString7;
                        this.menuAction[this.menuSize] = 1564;
                        this.anIntArray234[this.menuSize] = var13.anInt211;
                        this.anIntArray231[this.menuSize] = var4;
                        this.anIntArray232[this.menuSize] = var5;
                        ++this.menuSize;
                     }
                  }
               }
            }
         }
      }

   }

   private boolean isFriend(String var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.anInt838; ++var2) {
            if (var1.equalsIgnoreCase(this.aStringArray8[var2])) {
               return true;
            }
         }

         return var1.equalsIgnoreCase(localPlayer.name);
      }
   }

   private void method725(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = this.scene.method216(var2, var3, var1);
      boolean var8 = false;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      Class10_Sub1_Sub1_Sub3 var17;
      if (var7 != 0) {
         var9 = this.scene.method220(var2, var3, var1, var7);
         var10 = var9 >> 6 & 3;
         var11 = var9 & 31;
         var12 = var6;
         if (var7 > 0) {
            var12 = var4;
         }

         int[] var15 = this.aClass10_Sub1_Sub1_Sub1_11.pixels;
         var13 = var3 * 4 + (103 - var1) * 512 * 4 + 24624;
         var14 = var7 >> 14 & 32767;
         LocType var16 = LocType.method523(var14);
         if (var16.anInt705 == -1) {
            if (var11 == 0 || var11 == 2) {
               if (var10 == 0) {
                  var15[var13] = var12;
                  var15[var13 + 512] = var12;
                  var15[var13 + 1024] = var12;
                  var15[var13 + 1536] = var12;
               } else if (var10 == 1) {
                  var15[var13] = var12;
                  var15[var13 + 1] = var12;
                  var15[var13 + 2] = var12;
                  var15[var13 + 3] = var12;
               } else if (var10 == 2) {
                  var15[var13 + 3] = var12;
                  var15[var13 + 3 + 512] = var12;
                  var15[var13 + 3 + 1024] = var12;
                  var15[var13 + 3 + 1536] = var12;
               } else if (var10 == 3) {
                  var15[var13 + 1536] = var12;
                  var15[var13 + 1536 + 1] = var12;
                  var15[var13 + 1536 + 2] = var12;
                  var15[var13 + 1536 + 3] = var12;
               }
            }

            if (var11 == 3) {
               if (var10 == 0) {
                  var15[var13] = var12;
               } else if (var10 == 1) {
                  var15[var13 + 3] = var12;
               } else if (var10 == 2) {
                  var15[var13 + 3 + 1536] = var12;
               } else if (var10 == 3) {
                  var15[var13 + 1536] = var12;
               }
            }

            if (var11 == 2) {
               if (var10 == 3) {
                  var15[var13] = var12;
                  var15[var13 + 512] = var12;
                  var15[var13 + 1024] = var12;
                  var15[var13 + 1536] = var12;
               } else if (var10 == 0) {
                  var15[var13] = var12;
                  var15[var13 + 1] = var12;
                  var15[var13 + 2] = var12;
                  var15[var13 + 3] = var12;
               } else if (var10 == 1) {
                  var15[var13 + 3] = var12;
                  var15[var13 + 3 + 512] = var12;
                  var15[var13 + 3 + 1024] = var12;
                  var15[var13 + 3 + 1536] = var12;
               } else if (var10 == 2) {
                  var15[var13 + 1536] = var12;
                  var15[var13 + 1536 + 1] = var12;
                  var15[var13 + 1536 + 2] = var12;
                  var15[var13 + 1536 + 3] = var12;
               }
            }
         } else {
            var17 = this.aClass10_Sub1_Sub1_Sub3Array5[var16.anInt705];
            if (var17 != null) {
               int var18 = (var16.anInt707 * 4 - var17.anInt652) / 2;
               int var19 = (var16.anInt697 * 4 - var17.anInt653) / 2;
               var17.method440((104 - var1 - var16.anInt697) * 4 + var19 + 48, var3 * 4 + 48 + var18);
            }
         }
      }

      var7 = this.scene.method218(var2, var3, var1);
      LocType var22;
      if (var7 != 0) {
         var9 = this.scene.method220(var2, var3, var1, var7);
         var10 = var9 >> 6 & 3;
         var11 = var9 & 31;
         var12 = var7 >> 14 & 32767;
         var22 = LocType.method523(var12);
         int var20;
         if (var22.anInt705 != -1) {
            var17 = this.aClass10_Sub1_Sub1_Sub3Array5[var22.anInt705];
            if (var17 != null) {
               var14 = (var22.anInt707 * 4 - var17.anInt652) / 2;
               var20 = (var22.anInt697 * 4 - var17.anInt653) / 2;
               var17.method440((104 - var1 - var22.anInt697) * 4 + var20 + 48, var3 * 4 + 48 + var14);
            }
         } else if (var11 == 9) {
            var13 = 15658734;
            if (var7 > 0) {
               var13 = 15597568;
            }

            int[] var24 = this.aClass10_Sub1_Sub1_Sub1_11.pixels;
            var20 = var3 * 4 + (103 - var1) * 512 * 4 + 24624;
            if (var10 != 0 && var10 != 2) {
               var24[var20] = var13;
               var24[var20 + 512 + 1] = var13;
               var24[var20 + 1024 + 2] = var13;
               var24[var20 + 1536 + 3] = var13;
            } else {
               var24[var20 + 1536] = var13;
               var24[var20 + 1024 + 1] = var13;
               var24[var20 + 512 + 2] = var13;
               var24[var20 + 3] = var13;
            }
         }
      }

      var7 = this.scene.method219(var2, var3, var1);
      if (var7 != 0) {
         var9 = var7 >> 14 & 32767;
         var22 = LocType.method523(var9);
         if (var22.anInt705 != -1) {
            Class10_Sub1_Sub1_Sub3 var23 = this.aClass10_Sub1_Sub1_Sub3Array5[var22.anInt705];
            if (var23 != null) {
               var12 = (var22.anInt707 * 4 - var23.anInt652) / 2;
               int var21 = (var22.anInt697 * 4 - var23.anInt653) / 2;
               var23.method440((104 - var1 - var22.anInt697) * 4 + var21 + 48, var3 * 4 + 48 + var12);
               return;
            }
         }
      }

   }

   private void method601(int var1, int var2) {
      Class6 var3 = this.levelObjStacks[this.currentLevel][var1][var2];
      if (var3 == null) {
         this.scene.method211(this.currentLevel, var1, var2);
      } else {
         int var4 = -99999999;
         Class10_Sub1_Sub2_Sub1 var5 = null;

         Class10_Sub1_Sub2_Sub1 var6;
         for(var6 = (Class10_Sub1_Sub2_Sub1)var3.method6(); var6 != null; var6 = (Class10_Sub1_Sub2_Sub1)var3.method8()) {
            ObjType var7 = ObjType.method104(var6.anInt211);
            int var8 = var7.anInt183;
            if (var7.aBoolean52) {
               var8 *= var6.anInt213 + 1;
            }

            if (var8 > var4) {
               var4 = var8;
               var5 = var6;
            }
         }

         var3.method4(var5);
         Class10_Sub1_Sub2_Sub1 var11 = null;
         Class10_Sub1_Sub2_Sub1 var10 = null;

         for(var6 = (Class10_Sub1_Sub2_Sub1)var3.method6(); var6 != null; var6 = (Class10_Sub1_Sub2_Sub1)var3.method8()) {
            if (var6.anInt211 != var5.anInt211 && var11 == null) {
               var11 = var6;
            }

            if (var6.anInt211 != var5.anInt211 && var6.anInt211 != var11.anInt211 && var10 == null) {
               var10 = var6;
            }
         }

         int var9 = var1 + (var2 << 7) + 1610612736;
         this.scene.method197(this.getHeightmapY(var2 * 128 + 64, var1 * 128 + 64, this.currentLevel), this.currentLevel, var5, var11, var9, var10, var2, var1);
      }
   }

   private void method999() {
      this.anInt1011 = 0;
      int var1 = (localPlayer.x >> 7) + this.sceneBaseTileX;
      int var2 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
      if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
         this.anInt1011 = 1;
      }

      if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
         this.anInt1011 = 1;
      }

      if (this.anInt1011 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
         this.anInt1011 = 0;
      }

   }

   private void method695(int var1) {
      if (var1 >= 0) {
         int var2 = this.anIntArray231[var1];
         int var3 = this.anIntArray232[var1];
         int var4 = this.menuAction[var1];
         int var5 = this.anIntArray234[var1];
         if (this.anInt866 > 8 || this.anInt866 < 8) {
            this.packetType = this.in.g1();
         }

         if (var4 >= 2000) {
            var4 -= 2000;
         }

         if (this.anInt1010 != 0 && var4 != 1016) {
            this.anInt1010 = 0;
            this.aBoolean255 = true;
         }

         PlayerEntity var6;
         if (var4 == 200) {
            var6 = this.players[var5];
            if (var6 != null) {
               this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(245);
               this.out.method338(var5);
            }
         }

         if (var4 == 227) {
            ++anInt974;
            if (anInt974 >= 62) {
               this.out.p1isaac(165);
               this.out.p1(206);
               anInt974 = 0;
            }

            this.out.p1isaac(228);
            this.out.method336(var2);
            this.out.method337(var5);
            this.out.p2(var3);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         if (var4 == 876) {
            var6 = this.players[var5];
            if (var6 != null) {
               this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(45);
               this.out.method337(var5);
            }
         }

         NpcEntity var7;
         if (var4 == 921) {
            var7 = this.npcs[var5];
            if (var7 != null) {
               this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(67);
               this.out.method337(var5);
            }
         }

         if (var4 == 961) {
            anInt963 += var5;
            if (anInt963 >= 115) {
               this.out.p1isaac(126);
               this.out.p1(125);
               anInt963 = 0;
            }

            this.out.p1isaac(203);
            this.out.method337(var3);
            this.out.method336(var2);
            this.out.method336(var5);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         if (var4 == 467 && this.method655(var3, var2, var5)) {
            this.out.p1isaac(152);
            this.out.method336(var5 >> 14 & 32767);
            this.out.method336(this.anInt967);
            this.out.method336(this.anInt968);
            this.out.method336(var3 + this.sceneBaseTileZ);
            this.out.p2(this.anInt966);
            this.out.method338(var2 + this.sceneBaseTileX);
         }

         if (var4 == 9) {
            this.out.p1isaac(3);
            this.out.method337(var5);
            this.out.p2(var3);
            this.out.p2(var2);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         if (var4 == 553) {
            var7 = this.npcs[var5];
            if (var7 != null) {
               this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(42);
               this.out.method336(var5);
            }
         }

         if (var4 == 677) {
            var6 = this.players[var5];
            if (var6 != null) {
               this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(116);
               this.out.method336(var5);
            }
         }

         int var8;
         long var9;
         String var11;
         if (var4 == 762 || var4 == 574 || var4 == 775 || var4 == 859) {
            var11 = this.menuOption[var1];
            var8 = var11.indexOf("@whi@");
            if (var8 != -1) {
               var9 = Class26.method248(var11.substring(var8 + 5).trim());
               if (var4 == 762) {
                  this.method677(var9);
               }

               if (var4 == 574) {
                  this.method665(this.anInt971, var9);
               }

               if (var4 == 775) {
                  this.method628(var9);
               }

               if (var4 == 859) {
                  this.method672(325, var9);
               }
            }
         }

         boolean var12;
         if (var4 == 930) {
            var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
            if (!var12) {
               this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
            }

            this.crossY = super.anInt822;
            this.crossX = super.anInt823;
            this.crossMode = 2;
            this.crossCycle = 0;
            this.out.p1isaac(54);
            this.out.method337(var5);
            this.out.method336(var3 + this.sceneBaseTileZ);
            this.out.p2(var2 + this.sceneBaseTileX);
         }

         if (var4 == 399) {
            this.out.p1isaac(24);
            this.out.method336(var3);
            this.out.method336(var5);
            this.out.method337(var2);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         if (var4 == 347) {
            var7 = this.npcs[var5];
            if (var7 != null) {
               this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(57);
               this.out.p2(var5);
               this.out.method336(this.anInt968);
               this.out.method338(this.anInt967);
               this.out.p2(this.anInt966);
            }
         }

         ComType var13;
         if (var4 == 890) {
            this.out.p1isaac(79);
            this.out.p2(var3);
            var13 = ComType.method87(var3);
            if (var13.anIntArrayArray5 != null && var13.anIntArrayArray5[0][0] == 5) {
               var8 = var13.anIntArrayArray5[0][1];
               this.anIntArray244[var8] = 1 - this.anIntArray244[var8];
               this.method680(var8);
               this.aBoolean248 = true;
            }
         }

         if (var4 == 493) {
            var6 = this.players[var5];
            if (var6 != null) {
               this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(233);
               this.out.method337(var5);
            }
         }

         if (var4 == 14) {
            if (this.menuVisible) {
               this.scene.method228(var2 - 4, var3 - 4);
            } else {
               this.scene.method228(super.anInt822 - 4, super.anInt823 - 4);
            }
         }

         if (var4 == 903) {
            this.out.p1isaac(1);
            this.out.p2(var5);
            this.out.method336(this.anInt966);
            this.out.method336(this.anInt968);
            this.out.method338(this.anInt967);
            this.out.method337(var2);
            this.out.method337(var3);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         if (var4 == 361) {
            this.out.p1isaac(36);
            this.out.p2(this.anInt979);
            this.out.method337(var3);
            this.out.method337(var2);
            this.out.method337(var5);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         if (var4 == 118) {
            var7 = this.npcs[var5];
            if (var7 != null) {
               this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               anInt1005 += var5;
               if (anInt1005 >= 143) {
                  this.out.p1isaac(157);
                  this.out.p4(0);
                  anInt1005 = 0;
               }

               this.out.p1isaac(13);
               this.out.method338(var5);
            }
         }

         if (var4 == 376 && this.method655(var3, var2, var5)) {
            this.out.p1isaac(210);
            this.out.p2(this.anInt979);
            this.out.method336(var5 >> 14 & 32767);
            this.out.method337(var2 + this.sceneBaseTileX);
            this.out.method336(var3 + this.sceneBaseTileZ);
         }

         if (var4 == 432) {
            var7 = this.npcs[var5];
            if (var7 != null) {
               this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(8);
               this.out.method336(var5);
            }
         }

         if (var4 == 639) {
            this.method590();
         }

         if (var4 == 918) {
            var6 = this.players[var5];
            if (var6 != null) {
               this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(31);
               this.out.p2(var5);
               this.out.method336(this.anInt979);
            }
         }

         if (var4 == 67) {
            var7 = this.npcs[var5];
            if (var7 != null) {
               this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(104);
               this.out.method337(this.anInt979);
               this.out.method336(var5);
            }
         }

         if (var4 == 68) {
            var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
            if (!var12) {
               this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
            }

            this.crossY = super.anInt822;
            this.crossX = super.anInt823;
            this.crossMode = 2;
            this.crossCycle = 0;
            this.out.p1isaac(77);
            this.out.method337(var2 + this.sceneBaseTileX);
            this.out.p2(var3 + this.sceneBaseTileZ);
            this.out.method338(var5);
         }

         if (var4 == 684) {
            var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
            if (!var12) {
               this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
            }

            this.crossY = super.anInt822;
            this.crossX = super.anInt823;
            this.crossMode = 2;
            this.crossCycle = 0;
            if ((var5 & 3) == 0) {
               ++anInt925;
            }

            if (anInt925 >= 84) {
               this.out.p1isaac(222);
               this.out.p3(11257922);
               anInt925 = 0;
            }

            this.out.p1isaac(71);
            this.out.method338(var5);
            this.out.method338(var2 + this.sceneBaseTileX);
            this.out.method337(var3 + this.sceneBaseTileZ);
         }

         int var14;
         String var15;
         if (var4 == 544 || var4 == 695) {
            var11 = this.menuOption[var1];
            var8 = var11.indexOf("@whi@");
            if (var8 != -1) {
               var11 = var11.substring(var8 + 5).trim();
               var15 = Class26.method252(Class26.method249(Class26.method248(var11)), (byte)7);
               boolean var20 = false;

               for(var14 = 0; var14 < this.playerCount; ++var14) {
                  PlayerEntity var17 = this.players[this.anIntArray229[var14]];
                  if (var17 != null && var17.name != null && var17.name.equalsIgnoreCase(var15)) {
                     this.method610(false, var17.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var17.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
                     if (var4 == 544) {
                        this.out.p1isaac(116);
                        this.out.method336(this.anIntArray229[var14]);
                     }

                     if (var4 == 695) {
                        this.out.p1isaac(245);
                        this.out.method338(this.anIntArray229[var14]);
                     }

                     var20 = true;
                     break;
                  }
               }

               if (!var20) {
                  this.method622("", "Unable to find " + var15, 0);
               }
            }
         }

         if (var4 == 225) {
            this.out.p1isaac(177);
            this.out.method337(var2);
            this.out.method336(var5);
            this.out.method336(var3);
            this.anInt1053 = 0;
            this.anInt1054 = var3;
            this.anInt1055 = var2;
            this.anInt1056 = 2;
            if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
               this.anInt1056 = 1;
            }

            if (ComType.method87(var3).anInt128 == this.anInt888) {
               this.anInt1056 = 3;
            }
         }

         String var16;
         if (var4 == 70) {
            var13 = ComType.method87(var3);
            this.spellSelected = 1;
            this.anInt979 = var3;
            this.anInt980 = var13.anInt113;
            this.objSelected = 0;
            this.aBoolean248 = true;
            var16 = var13.aString5;
            if (var16.indexOf(" ") != -1) {
               var16 = var16.substring(0, var16.indexOf(" "));
            }

            var15 = var13.aString5;
            if (var15.indexOf(" ") != -1) {
               var15 = var15.substring(var15.indexOf(" ") + 1);
            }

            this.aString31 = var16 + " " + var13.aString1 + " " + var15;
            if (this.anInt980 == 16) {
               this.aBoolean248 = true;
               this.anInt1031 = 3;
               this.aBoolean225 = true;
            }
         } else {
            if (var4 == 891) {
               this.out.p1isaac(4);
               this.out.method336(var2);
               this.out.method338(var5);
               this.out.method338(var3);
               this.anInt1053 = 0;
               this.anInt1054 = var3;
               this.anInt1055 = var2;
               this.anInt1056 = 2;
               if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
                  this.anInt1056 = 1;
               }

               if (ComType.method87(var3).anInt128 == this.anInt888) {
                  this.anInt1056 = 3;
               }
            }

            if (var4 == 894) {
               this.out.p1isaac(158);
               this.out.method338(var2);
               this.out.method338(var5);
               this.out.method336(var3);
               this.anInt1053 = 0;
               this.anInt1054 = var3;
               this.anInt1055 = var2;
               this.anInt1056 = 2;
               if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
                  this.anInt1056 = 1;
               }

               if (ComType.method87(var3).anInt128 == this.anInt888) {
                  this.anInt1056 = 3;
               }
            }

            if (var4 == 1280) {
               this.method655(var3, var2, var5);
               this.out.p1isaac(55);
               this.out.method336(var5 >> 14 & 32767);
               this.out.method336(var3 + this.sceneBaseTileZ);
               this.out.p2(var2 + this.sceneBaseTileX);
            }

            if (var4 == 35) {
               this.method655(var3, var2, var5);
               this.out.p1isaac(181);
               this.out.method337(var2 + this.sceneBaseTileX);
               this.out.method336(var3 + this.sceneBaseTileZ);
               this.out.method336(var5 >> 14 & 32767);
            }

            if (var4 == 888) {
               this.method655(var3, var2, var5);
               this.out.p1isaac(50);
               this.out.method337(var3 + this.sceneBaseTileZ);
               this.out.method336(var5 >> 14 & 32767);
               this.out.method338(var2 + this.sceneBaseTileX);
            }

            if (var4 == 324) {
               this.out.p1isaac(161);
               this.out.method338(var2);
               this.out.method338(var5);
               this.out.method336(var3);
               this.anInt1053 = 0;
               this.anInt1054 = var3;
               this.anInt1055 = var2;
               this.anInt1056 = 2;
               if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
                  this.anInt1056 = 1;
               }

               if (ComType.method87(var3).anInt128 == this.anInt888) {
                  this.anInt1056 = 3;
               }
            }

            ObjType var22;
            if (var4 == 1094) {
               var22 = ObjType.method104(var5);
               ComType var18 = ComType.method87(var3);
               if (var18 != null && var18.anIntArray40[var2] >= 100000) {
                  var16 = var18.anIntArray40[var2] + " x " + var22.aString7;
               } else if (var22.aByteArray8 == null) {
                  var16 = "It's a " + var22.aString7 + ".";
               } else {
                  var16 = new String(var22.aByteArray8);
               }

               this.method622("", var16, 0);
            }

            if (var4 == 352) {
               var13 = ComType.method87(var3);
               boolean var21 = true;
               if (var13.clientCode > 0) {
                  var21 = this.method635(var13);
               }

               if (var21) {
                  this.out.p1isaac(79);
                  this.out.p2(var3);
               }
            }

            int var24;
            if (var4 == 1412) {
               var24 = var5 >> 14 & 32767;
               LocType var19 = LocType.method523(var24);
               if (var19.aByteArray17 == null) {
                  var15 = "It's a " + var19.aString12 + ".";
               } else {
                  var15 = new String(var19.aByteArray17);
               }

               this.method622("", var15, 0);
            }

            if (var4 == 575 && !this.aBoolean254) {
               this.out.p1isaac(226);
               this.out.p2(var3);
               this.aBoolean254 = true;
            }

            if (var4 == 892) {
               this.method655(var3, var2, var5);
               this.out.p1isaac(136);
               this.out.p2(var2 + this.sceneBaseTileX);
               this.out.method336(var3 + this.sceneBaseTileZ);
               this.out.p2(var5 >> 14 & 32767);
            }

            if (var4 == 270) {
               var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               if (!var12) {
                  this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               }

               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(230);
               this.out.method336(var5);
               this.out.method337(var2 + this.sceneBaseTileX);
               this.out.p2(var3 + this.sceneBaseTileZ);
            }

            if (var4 == 596) {
               var6 = this.players[var5];
               if (var6 != null) {
                  this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
                  this.crossY = super.anInt822;
                  this.crossX = super.anInt823;
                  this.crossMode = 2;
                  this.crossCycle = 0;
                  this.out.p1isaac(143);
                  this.out.method336(this.anInt968);
                  this.out.method338(this.anInt966);
                  this.out.p2(this.anInt967);
                  this.out.method337(var5);
               }
            }

            if (var4 == 100) {
               var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               if (!var12) {
                  this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               }

               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(211);
               this.out.method338(this.anInt966);
               this.out.method337(this.anInt968);
               this.out.method338(var3 + this.sceneBaseTileZ);
               this.out.method338(var2 + this.sceneBaseTileX);
               this.out.method336(this.anInt967);
               this.out.method336(var5);
            }

            if (var4 == 1668) {
               var7 = this.npcs[var5];
               if (var7 != null) {
                  NpcType var23 = var7.type;
                  if (var23.anIntArray165 != null) {
                     var23 = var23.method406();
                  }

                  if (var23 != null) {
                     if (var23.aByteArray14 == null) {
                        var15 = "It's a " + var23.name + ".";
                     } else {
                        var15 = new String(var23.aByteArray14);
                     }

                     this.method622("", var15, 0);
                  }
               }
            }

            if (var4 == 26) {
               var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               if (!var12) {
                  this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               }

               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               ++anInt944;
               if (anInt944 >= 120) {
                  this.out.p1isaac(95);
                  this.out.p4(0);
                  anInt944 = 0;
               }

               this.out.p1isaac(100);
               this.out.p2(var2 + this.sceneBaseTileX);
               this.out.method337(var3 + this.sceneBaseTileZ);
               this.out.method338(var5);
            }

            if (var4 == 444) {
               this.out.p1isaac(91);
               this.out.method336(var5);
               this.out.method338(var2);
               this.out.p2(var3);
               this.anInt1053 = 0;
               this.anInt1054 = var3;
               this.anInt1055 = var2;
               this.anInt1056 = 2;
               if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
                  this.anInt1056 = 1;
               }

               if (ComType.method87(var3).anInt128 == this.anInt888) {
                  this.anInt1056 = 3;
               }
            }

            if (var4 == 507) {
               var11 = this.menuOption[var1];
               var8 = var11.indexOf("@whi@");
               if (var8 != -1) {
                  if (this.viewportInterfaceId == -1) {
                     this.method590();
                     this.aString17 = var11.substring(var8 + 5).trim();
                     this.aBoolean241 = false;
                     this.anInt1002 = this.viewportInterfaceId = ComType.anInt127;
                  } else {
                     this.method622("", "Please close the interface you have open before using 'report abuse'", 0);
                  }
               }
            }

            if (var4 == 389) {
               this.method655(var3, var2, var5);
               this.out.p1isaac(241);
               this.out.p2(var5 >> 14 & 32767);
               this.out.p2(var2 + this.sceneBaseTileX);
               this.out.method337(var3 + this.sceneBaseTileZ);
            }

            if (var4 == 564) {
               this.out.p1isaac(231);
               this.out.method338(var3);
               this.out.method336(var2);
               this.out.p2(var5);
               this.anInt1053 = 0;
               this.anInt1054 = var3;
               this.anInt1055 = var2;
               this.anInt1056 = 2;
               if (ComType.method87(var3).anInt128 == this.viewportInterfaceId) {
                  this.anInt1056 = 1;
               }

               if (ComType.method87(var3).anInt128 == this.anInt888) {
                  this.anInt1056 = 3;
               }
            }

            if (var4 == 984) {
               var11 = this.menuOption[var1];
               var8 = var11.indexOf("@whi@");
               if (var8 != -1) {
                  var9 = Class26.method248(var11.substring(var8 + 5).trim());
                  var14 = -1;

                  for(var24 = 0; var24 < this.anInt838; ++var24) {
                     if (this.aLongArray4[var24] == var9) {
                        var14 = var24;
                        break;
                     }
                  }

                  if (var14 != -1 && this.anIntArray265[var14] > 0) {
                     this.aBoolean255 = true;
                     this.anInt1010 = 0;
                     this.aBoolean216 = true;
                     this.aString24 = "";
                     this.anInt995 = 3;
                     this.aLong31 = this.aLongArray4[var14];
                     this.aString19 = "Enter message to send to " + this.aStringArray8[var14];
                  }
               }
            }

            if (var4 == 518) {
               this.out.p1isaac(79);
               this.out.p2(var3);
               var13 = ComType.method87(var3);
               if (var13.anIntArrayArray5 != null && var13.anIntArrayArray5[0][0] == 5) {
                  var8 = var13.anIntArrayArray5[0][1];
                  if (this.anIntArray244[var8] != var13.anIntArray42[0]) {
                     this.anIntArray244[var8] = var13.anIntArray42[0];
                     this.method680(var8);
                     this.aBoolean248 = true;
                  }
               }
            }

            if (var4 == 318) {
               var7 = this.npcs[var5];
               if (var7 != null) {
                  this.method610(false, var7.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var7.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
                  this.crossY = super.anInt822;
                  this.crossX = super.anInt823;
                  this.crossMode = 2;
                  this.crossCycle = 0;
                  this.out.p1isaac(112);
                  this.out.method336(var5);
               }
            }

            if (var4 == 199) {
               var12 = this.method610(false, var3, localPlayer.anIntArray194[0], 0, 0, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               if (!var12) {
                  this.method610(false, var3, localPlayer.anIntArray194[0], 1, 1, 2, 0, var2, 0, 0, localPlayer.anIntArray193[0]);
               }

               this.crossY = super.anInt822;
               this.crossX = super.anInt823;
               this.crossMode = 2;
               this.crossCycle = 0;
               this.out.p1isaac(83);
               this.out.method336(var5);
               this.out.p2(var3 + this.sceneBaseTileZ);
               this.out.method336(this.anInt979);
               this.out.method338(var2 + this.sceneBaseTileX);
            }

            if (var4 == 55) {
               this.resetInterface(this.anInt985);
               this.anInt985 = -1;
               this.aBoolean255 = true;
            }

            if (var4 == 52) {
               this.objSelected = 1;
               this.anInt966 = var2;
               this.anInt967 = var3;
               this.anInt968 = var5;
               this.aString30 = String.valueOf(ObjType.method104(var5).aString7);
               this.spellSelected = 0;
               this.aBoolean248 = true;
            } else {
               if (var4 == 1564) {
                  var22 = ObjType.method104(var5);
                  if (var22.aByteArray8 == null) {
                     var16 = "It's a " + var22.aString7 + ".";
                  } else {
                     var16 = new String(var22.aByteArray8);
                  }

                  this.method622("", var16, 0);
               }

               if (var4 == 408) {
                  var6 = this.players[var5];
                  if (var6 != null) {
                     this.method610(false, var6.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, var6.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
                     this.crossY = super.anInt822;
                     this.crossX = super.anInt823;
                     this.crossMode = 2;
                     this.crossCycle = 0;
                     this.out.p1isaac(194);
                     this.out.method336(var5);
                  }
               }

               this.objSelected = 0;
               this.spellSelected = 0;
               this.aBoolean248 = true;
            }
         }
      }

   }

   private void method677(long var1) {
      if (var1 != 0L) {
         if (this.anInt838 >= 100 && this.anInt932 != 1) {
            this.method622("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
         } else if (this.anInt838 >= 200) {
            this.method622("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
         } else {
            String var3 = Class26.method252(Class26.method249(var1), (byte)7);

            int var4;
            for(var4 = 0; var4 < this.anInt838; ++var4) {
               if (this.aLongArray4[var4] == var1) {
                  this.method622("", var3 + " is already on your friend list", 0);
                  return;
               }
            }

            for(var4 = 0; var4 < this.anInt837; ++var4) {
               if (this.aLongArray3[var4] == var1) {
                  this.method622("", "Please remove " + var3 + " from your ignore list first", 0);
                  return;
               }
            }

            if (!var3.equals(localPlayer.name)) {
               this.aStringArray8[this.anInt838] = var3;
               this.aLongArray4[this.anInt838] = var1;
               this.anIntArray265[this.anInt838] = 0;
               ++this.anInt838;
               this.aBoolean248 = true;
               this.out.p1isaac(120);
               this.out.p8(var1);
            }
         }
      }

   }

   private void drawScrollbar(int var1, int var2, int var3, int var4, int var5) {
      this.aClass10_Sub1_Sub1_Sub3_14.method440(var5, var2);
      this.aClass10_Sub1_Sub1_Sub3_15.method440(var5 + var3 - 16, var2);
      Draw2D.fillRect(var3 - 32, var5 + 16, this.anInt871, 16, var2);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = (var3 - var6 - 32) * var1 / (var4 - var3);
      Draw2D.fillRect(var6, var5 + var7 + 16, this.anInt937, 16, var2);
      Draw2D.drawVerticalLine(var2, this.anInt961, var6, var5 + var7 + 16);
      Draw2D.drawVerticalLine(var2 + 1, this.anInt961, var6, var5 + var7 + 16);
      Draw2D.drawHorizontalLine(var2, this.anInt961, var5 + var7 + 16, 16);
      Draw2D.drawHorizontalLine(var2, this.anInt961, var5 + var7 + 17, 16);
      Draw2D.drawVerticalLine(var2 + 15, this.anInt1032, var6, var5 + var7 + 16);
      Draw2D.drawVerticalLine(var2 + 14, this.anInt1032, var6 - 1, var5 + 17 + var7);
      Draw2D.drawHorizontalLine(var2, this.anInt1032, var5 + var7 + var6 + 15, 16);
      Draw2D.drawHorizontalLine(var2 + 1, this.anInt1032, var5 + var7 + var6 + 14, 15);
   }

   private boolean saveWave(byte[] src, int length) {
      return src == null ? true : signlink.wavesave(src, length);
   }

   private void method613(int var1, int var2, int var3, PlayerEntity var4) {
      if (var4 != localPlayer && this.menuSize < 400) {
         String var5;
         if (var4.anInt770 == 0) {
            var5 = var4.name + method667(var4.anInt767, localPlayer.anInt767) + " (level-" + var4.anInt767 + ")";
         } else {
            var5 = var4.name + " (skill-" + var4.anInt770 + ")";
         }

         int var6;
         if (this.objSelected == 1) {
            this.menuOption[this.menuSize] = "Use " + this.aString30 + " with @whi@" + var5;
            this.menuAction[this.menuSize] = 596;
            this.anIntArray234[this.menuSize] = var1;
            this.anIntArray231[this.menuSize] = var3;
            this.anIntArray232[this.menuSize] = var2;
            ++this.menuSize;
         } else if (this.spellSelected != 1) {
            for(var6 = 4; var6 >= 0; --var6) {
               if (this.aStringArray11[var6] != null) {
                  this.menuOption[this.menuSize] = this.aStringArray11[var6] + " @whi@" + var5;
                  short var7 = 0;
                  if (this.aStringArray11[var6].equalsIgnoreCase("attack")) {
                     if (var4.anInt767 > localPlayer.anInt767) {
                        var7 = 2000;
                     }

                     if (localPlayer.anInt773 != 0 && var4.anInt773 != 0) {
                        if (localPlayer.anInt773 == var4.anInt773) {
                           var7 = 2000;
                        } else {
                           var7 = 0;
                        }
                     }
                  } else if (this.aBooleanArray12[var6]) {
                     var7 = 2000;
                  }

                  if (var6 == 0) {
                     this.menuAction[this.menuSize] = var7 + 200;
                  }

                  if (var6 == 1) {
                     this.menuAction[this.menuSize] = var7 + 493;
                  }

                  if (var6 == 2) {
                     this.menuAction[this.menuSize] = var7 + 408;
                  }

                  if (var6 == 3) {
                     this.menuAction[this.menuSize] = var7 + 677;
                  }

                  if (var6 == 4) {
                     this.menuAction[this.menuSize] = var7 + 876;
                  }

                  this.anIntArray234[this.menuSize] = var1;
                  this.anIntArray231[this.menuSize] = var3;
                  this.anIntArray232[this.menuSize] = var2;
                  ++this.menuSize;
               }
            }
         } else if ((this.anInt980 & 8) == 8) {
            this.menuOption[this.menuSize] = this.aString31 + " @whi@" + var5;
            this.menuAction[this.menuSize] = 918;
            this.anIntArray234[this.menuSize] = var1;
            this.anIntArray231[this.menuSize] = var3;
            this.anIntArray232[this.menuSize] = var2;
            ++this.menuSize;
         }

         for(var6 = 0; var6 < this.menuSize; ++var6) {
            if (this.menuAction[var6] == 14) {
               this.menuOption[var6] = "Walk here @whi@" + var5;
               return;
            }
         }
      }

   }

   private void method644(PathingEntity var1) {
      int var2 = var1.anInt735 - anInt1050;
      int var3 = var1.anInt731 * 128 + var1.anInt730 * 64;
      int var4 = var1.anInt733 * 128 + var1.anInt730 * 64;
      var1.x += (var3 - var1.x) / var2;
      var1.z += (var4 - var1.z) / var2;
      var1.anInt752 = 0;
      if (var1.anInt737 == 0) {
         var1.anInt717 = 1024;
      }

      if (var1.anInt737 == 1) {
         var1.anInt717 = 1536;
      }

      if (var1.anInt737 == 2) {
         var1.anInt717 = 0;
      }

      if (var1.anInt737 == 3) {
         var1.anInt717 = 512;
      }

   }

   private void method657(NpcType var1, int var2, int var3, int var4) {
      if (this.menuSize < 400) {
         if (var1.anIntArray165 != null) {
            var1 = var1.method406();
         }

         if (var1 != null && var1.aBoolean141) {
            String var5 = var1.name;
            if (var1.anInt572 != 0) {
               var5 = var5 + method667(var1.anInt572, localPlayer.anInt767) + " (level-" + var1.anInt572 + ")";
            }

            if (this.objSelected == 1) {
               this.menuOption[this.menuSize] = "Use " + this.aString30 + " with @yel@" + var5;
               this.menuAction[this.menuSize] = 347;
               this.anIntArray234[this.menuSize] = var4;
               this.anIntArray231[this.menuSize] = var3;
               this.anIntArray232[this.menuSize] = var2;
               ++this.menuSize;
            } else if (this.spellSelected != 1) {
               int var6;
               if (var1.aStringArray4 != null) {
                  for(var6 = 4; var6 >= 0; --var6) {
                     if (var1.aStringArray4[var6] != null && !var1.aStringArray4[var6].equalsIgnoreCase("attack")) {
                        this.menuOption[this.menuSize] = var1.aStringArray4[var6] + " @yel@" + var5;
                        if (var6 == 0) {
                           this.menuAction[this.menuSize] = 318;
                        }

                        if (var6 == 1) {
                           this.menuAction[this.menuSize] = 921;
                        }

                        if (var6 == 2) {
                           this.menuAction[this.menuSize] = 118;
                        }

                        if (var6 == 3) {
                           this.menuAction[this.menuSize] = 553;
                        }

                        if (var6 == 4) {
                           this.menuAction[this.menuSize] = 432;
                        }

                        this.anIntArray234[this.menuSize] = var4;
                        this.anIntArray231[this.menuSize] = var3;
                        this.anIntArray232[this.menuSize] = var2;
                        ++this.menuSize;
                     }
                  }
               }

               if (var1.aStringArray4 != null) {
                  for(var6 = 4; var6 >= 0; --var6) {
                     if (var1.aStringArray4[var6] != null && var1.aStringArray4[var6].equalsIgnoreCase("attack")) {
                        short var7 = 0;
                        if (var1.anInt572 > localPlayer.anInt767) {
                           var7 = 2000;
                        }

                        this.menuOption[this.menuSize] = var1.aStringArray4[var6] + " @yel@" + var5;
                        if (var6 == 0) {
                           this.menuAction[this.menuSize] = var7 + 318;
                        }

                        if (var6 == 1) {
                           this.menuAction[this.menuSize] = var7 + 921;
                        }

                        if (var6 == 2) {
                           this.menuAction[this.menuSize] = var7 + 118;
                        }

                        if (var6 == 3) {
                           this.menuAction[this.menuSize] = var7 + 553;
                        }

                        if (var6 == 4) {
                           this.menuAction[this.menuSize] = var7 + 432;
                        }

                        this.anIntArray234[this.menuSize] = var4;
                        this.anIntArray231[this.menuSize] = var3;
                        this.anIntArray232[this.menuSize] = var2;
                        ++this.menuSize;
                     }
                  }
               }

               this.menuOption[this.menuSize] = "Examine @yel@" + var5;
               this.menuAction[this.menuSize] = 1668;
               this.anIntArray234[this.menuSize] = var4;
               this.anIntArray231[this.menuSize] = var3;
               this.anIntArray232[this.menuSize] = var2;
               ++this.menuSize;
            } else if ((this.anInt980 & 2) == 2) {
               this.menuOption[this.menuSize] = this.aString31 + " @yel@" + var5;
               this.menuAction[this.menuSize] = 67;
               this.anIntArray234[this.menuSize] = var4;
               this.anIntArray231[this.menuSize] = var3;
               this.anIntArray232[this.menuSize] = var2;
               ++this.menuSize;
               return;
            }
         }
      }

   }

   private void updateInterfaceContent(byte var1, ComType var2) {
      boolean var3 = false;
      int var4 = var2.clientCode;
      int var5;
      if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
         if (var4 >= 101 && var4 <= 200 || var4 >= 801 && var4 <= 900) {
            var5 = this.anInt838;
            if (this.anInt839 != 2) {
               var5 = 0;
            }

            if (var4 > 800) {
               var4 -= 701;
            } else {
               var4 -= 101;
            }

            if (var4 >= var5) {
               var2.aString2 = "";
               var2.anInt150 = 0;
            } else {
               if (this.anIntArray265[var4] == 0) {
                  var2.aString2 = "@red@Offline";
               } else if (this.anIntArray265[var4] < 200) {
                  if (this.anIntArray265[var4] == nodeId) {
                     var2.aString2 = "@gre@World" + (this.anIntArray265[var4] - 9);
                  } else {
                     var2.aString2 = "@yel@World" + (this.anIntArray265[var4] - 9);
                  }
               } else if (this.anIntArray265[var4] == nodeId) {
                  var2.aString2 = "@gre@Classic" + (this.anIntArray265[var4] - 219);
               } else {
                  var2.aString2 = "@yel@Classic" + (this.anIntArray265[var4] - 219);
               }

               var2.anInt150 = 1;
            }
         } else if (var4 == 203) {
            var5 = this.anInt838;
            if (this.anInt839 != 2) {
               var5 = 0;
            }

            var2.scroll = var5 * 15 + 20;
            if (var2.scroll <= var2.height) {
               var2.scroll = var2.height + 1;
            }
         } else if (var4 >= 401 && var4 <= 500) {
            var4 -= 401;
            if (var4 == 0 && this.anInt839 == 0) {
               var2.aString2 = "Loading ignore list";
               var2.anInt150 = 0;
            } else if (var4 == 1 && this.anInt839 == 0) {
               var2.aString2 = "Please wait...";
               var2.anInt150 = 0;
            } else {
               var5 = this.anInt837;
               if (this.anInt839 == 0) {
                  var5 = 0;
               }

               if (var4 >= var5) {
                  var2.aString2 = "";
                  var2.anInt150 = 0;
               } else {
                  var2.aString2 = Class26.method252(Class26.method249(this.aLongArray3[var4]), (byte)7);
                  var2.anInt150 = 1;
               }
            }
         } else if (var4 == 503) {
            var2.scroll = this.anInt837 * 15 + 20;
            if (var2.scroll <= var2.height) {
               var2.scroll = var2.height + 1;
            }
         } else if (var4 == 327) {
            var2.anInt130 = 150;
            var2.anInt131 = (int)(Math.sin((double)anInt1050 / 40.0) * 256.0) & 2047;
            if (this.aBoolean263) {
               for(var5 = 0; var5 < 7; ++var5) {
                  int var6 = this.anIntArray276[var5];
                  if (var6 >= 0 && !IdkType.instances[var6].method548(256)) {
                     return;
                  }
               }

               this.aBoolean263 = false;
               Model[] var10 = new Model[7];
               int var7 = 0;

               int var9;
               for(int var8 = 0; var8 < 7; ++var8) {
                  var9 = this.anIntArray276[var8];
                  if (var9 >= 0) {
                     var10[var7++] = IdkType.instances[var9].getModel();
                  }
               }

               Model var12 = new Model(var7, var10);

               for(var9 = 0; var9 < 5; ++var9) {
                  if (this.designColors[var9] != 0) {
                     var12.recolor(anIntArrayArray24[var9][0], anIntArrayArray24[var9][this.designColors[var9]]);
                     if (var9 == 1) {
                        var12.recolor(anIntArray266[0], anIntArray266[this.designColors[var9]]);
                     }
                  }
               }

               var12.method278();
               var12.method279(SeqType.aClass15Array1[localPlayer.anInt760].anIntArray47[0], (byte)6);
               var12.method288(64, 850, -30, -50, -30, true);
               var2.anInt145 = 5;
               var2.anInt146 = 0;
               ComType.method93(var12);
            }
         } else if (var4 == 324) {
            if (this.aClass10_Sub1_Sub1_Sub1_8 == null) {
               this.aClass10_Sub1_Sub1_Sub1_8 = var2.aClass10_Sub1_Sub1_Sub1_1;
               this.aClass10_Sub1_Sub1_Sub1_9 = var2.aClass10_Sub1_Sub1_Sub1_2;
            }

            if (this.aBoolean245) {
               var2.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_9;
            } else {
               var2.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_8;
            }
         } else if (var4 == 325) {
            if (this.aClass10_Sub1_Sub1_Sub1_8 == null) {
               this.aClass10_Sub1_Sub1_Sub1_8 = var2.aClass10_Sub1_Sub1_Sub1_1;
               this.aClass10_Sub1_Sub1_Sub1_9 = var2.aClass10_Sub1_Sub1_Sub1_2;
            }

            if (this.aBoolean245) {
               var2.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_8;
            } else {
               var2.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_9;
            }
         } else if (var4 == 600) {
            var2.aString2 = this.aString17;
            if (anInt1050 % 20 < 10) {
               var2.aString2 = var2.aString2 + "|";
            } else {
               var2.aString2 = var2.aString2 + " ";
            }
         } else {
            if (var4 == 620) {
               if (this.anInt842 < 1) {
                  var2.aString2 = "";
               } else if (this.aBoolean241) {
                  var2.anInt122 = 16711680;
                  var2.aString2 = "Moderator option: Mute player for 48 hours: <ON>";
               } else {
                  var2.anInt122 = 16777215;
                  var2.aString2 = "Moderator option: Mute player for 48 hours: <OFF>";
               }
            }

            String var13;
            if (var4 == 660) {
               var5 = this.anInt977 - this.anInt989;
               if (var5 <= 0) {
                  var13 = "earlier today";
               } else if (var5 == 1) {
                  var13 = "yesterday";
               } else {
                  var13 = var5 + " days ago";
               }

               var2.aString2 = "You last logged in @red@" + var13 + "@bla@ from: @red@" + signlink.dns;
            }

            if (var4 == 661) {
               if (this.anInt912 == 0) {
                  var2.aString2 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
               } else if (this.anInt912 <= this.anInt977) {
                  var2.aString2 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method679(this.anInt912);
               } else {
                  var5 = this.anInt977 + 14 - this.anInt912;
                  if (var5 <= 0) {
                     var13 = "Earlier today";
                  } else if (var5 == 1) {
                     var13 = "Yesterday";
                  } else {
                     var13 = var5 + " days ago";
                  }

                  var2.aString2 = var13 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method679(this.anInt912) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
               }
            }

            if (var4 == 662) {
               String var11;
               if (this.anInt1025 == 0) {
                  var11 = "@yel@0 unread messages";
               } else if (this.anInt1025 == 1) {
                  var11 = "@gre@1 unread message";
               } else {
                  var11 = "@gre@" + this.anInt1025 + " unread messages";
               }

               var2.aString2 = "You have " + var11 + "\\nin your message centre.";
            }

            if (var4 == 663) {
               if (this.anInt939 > 0 && this.anInt939 <= this.anInt977 + 10) {
                  var2.aString2 = "Last password change:\\n@gre@" + this.method679(this.anInt939);
               } else {
                  var2.aString2 = "Last password change:\\n@gre@Never changed";
               }
            }

            if (var4 == 665) {
               if (this.anInt891 > 2 && !members) {
                  var2.aString2 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
               } else if (this.anInt891 > 2) {
                  var2.aString2 = "\\n\\nYou have @gre@" + this.anInt891 + "@yel@ days of\\nmember credit remaining.";
               } else if (this.anInt891 > 0) {
                  var2.aString2 = "You have @gre@" + this.anInt891 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
               } else {
                  var2.aString2 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
               }
            }

            if (var4 == 667) {
               if (this.anInt891 > 2 && !members) {
                  var2.aString2 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
               } else if (this.anInt891 > 0) {
                  var2.aString2 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
               } else {
                  var2.aString2 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
               }
            }

            if (var4 == 668) {
               if (this.anInt912 > this.anInt977) {
                  var2.aString2 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
               } else {
                  var2.aString2 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
               }
            }
         }
      } else if (var4 == 1 && this.anInt839 == 0) {
         var2.aString2 = "Loading friend list";
         var2.anInt150 = 0;
      } else if (var4 == 1 && this.anInt839 == 1) {
         var2.aString2 = "Connecting to friendserver";
         var2.anInt150 = 0;
      } else if (var4 == 2 && this.anInt839 != 2) {
         var2.aString2 = "Please wait...";
         var2.anInt150 = 0;
      } else {
         var5 = this.anInt838;
         if (this.anInt839 != 2) {
            var5 = 0;
         }

         if (var4 > 700) {
            var4 -= 601;
         } else {
            --var4;
         }

         if (var4 >= var5) {
            var2.aString2 = "";
            var2.anInt150 = 0;
         } else {
            var2.aString2 = this.aStringArray8[var4];
            var2.anInt150 = 1;
         }
      }

   }

   private void handleInput() {
      if (this.objDragArea == 0) {
         this.menuOption[0] = "Cancel";
         this.menuAction[0] = 1016;
         this.menuSize = 1;
         if (this.anInt926 == -1) {
            this.method686(this.anInt982);
            this.anInt863 = 0;
            this.anInt1045 = 0;
            if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
               if (this.viewportInterfaceId == -1) {
                  this.handleViewportOptions();
               } else {
                  this.handleInterfaceInput(4, ComType.method87(this.viewportInterfaceId), 0, 0, 4, super.mouseX, super.mouseY);
               }
            }

            if (this.anInt863 != this.viewportHoveredInterfaceIndex) {
               this.viewportHoveredInterfaceIndex = this.anInt863;
            }

            if (this.anInt1045 != this.anInt959) {
               this.anInt959 = this.anInt1045;
            }

            this.anInt863 = 0;
            this.anInt1045 = 0;
            if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
               if (this.sidebarInterfaceId != -1) {
                  this.handleInterfaceInput(205, ComType.method87(this.sidebarInterfaceId), 1, 0, 553, super.mouseX, super.mouseY);
               } else if (this.anIntArray248[this.anInt1031] != -1) {
                  this.handleInterfaceInput(205, ComType.method87(this.anIntArray248[this.anInt1031]), 1, 0, 553, super.mouseX, super.mouseY);
               }
            }

            if (this.anInt863 != this.sidebarHoveredInterfaceIndex) {
               this.aBoolean248 = true;
               this.sidebarHoveredInterfaceIndex = this.anInt863;
            }

            if (this.anInt1045 != this.anInt918) {
               this.aBoolean248 = true;
               this.anInt918 = this.anInt1045;
            }

            this.anInt863 = 0;
            this.anInt1045 = 0;
            if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
               if (this.anInt888 != -1) {
                  this.handleInterfaceInput(357, ComType.method87(this.anInt888), 2, 0, 17, super.mouseX, super.mouseY);
               } else if (this.anInt985 != -1) {
                  this.handleInterfaceInput(357, ComType.method87(this.anInt985), 3, 0, 17, super.mouseX, super.mouseY);
               } else if (super.mouseY < 434 && super.mouseX < 426 && this.anInt1010 == 0) {
                  this.handleChatMouseInput(super.mouseX - 17, super.mouseY - 357);
               }
            }

            if ((this.anInt888 != -1 || this.anInt985 != -1) && this.anInt863 != this.chatHoveredInterfaceIndex) {
               this.aBoolean255 = true;
               this.chatHoveredInterfaceIndex = this.anInt863;
            }

            if ((this.anInt888 != -1 || this.anInt985 != -1) && this.anInt1045 != this.anInt1030) {
               this.aBoolean255 = true;
               this.anInt1030 = this.anInt1045;
            }

            boolean var1 = false;

            while(!var1) {
               var1 = true;

               for(int var2 = 0; var2 < this.menuSize - 1; ++var2) {
                  if (this.menuAction[var2] < 1000 && this.menuAction[var2 + 1] > 1000) {
                     String var3 = this.menuOption[var2];
                     this.menuOption[var2] = this.menuOption[var2 + 1];
                     this.menuOption[var2 + 1] = var3;
                     int var4 = this.menuAction[var2];
                     this.menuAction[var2] = this.menuAction[var2 + 1];
                     this.menuAction[var2 + 1] = var4;
                     int var5 = this.anIntArray231[var2];
                     this.anIntArray231[var2] = this.anIntArray231[var2 + 1];
                     this.anIntArray231[var2 + 1] = var5;
                     int var6 = this.anIntArray232[var2];
                     this.anIntArray232[var2] = this.anIntArray232[var2 + 1];
                     this.anIntArray232[var2 + 1] = var6;
                     int var7 = this.anIntArray234[var2];
                     this.anIntArray234[var2] = this.anIntArray234[var2 + 1];
                     this.anIntArray234[var2 + 1] = var7;
                     var1 = false;
                  }
               }
            }
         } else {
            this.anInt863 = 0;
            this.anInt1045 = 0;
            this.handleInterfaceInput(0, ComType.method87(this.anInt926), 0, 0, 0, super.mouseX, super.mouseY);
            if (this.anInt863 != this.viewportHoveredInterfaceIndex) {
               this.viewportHoveredInterfaceIndex = this.anInt863;
            }

            if (this.anInt1045 != this.anInt959) {
               this.anInt959 = this.anInt1045;
            }
         }
      }

   }

   private void method683() {
      int var1 = this.aClass10_Sub1_Sub1_Sub2_4.method150("Choose Option");

      int var2;
      int var3;
      for(var3 = 0; var3 < this.menuSize; ++var3) {
         var2 = this.aClass10_Sub1_Sub1_Sub2_4.method150(this.menuOption[var3]);
         if (var2 > var1) {
            var1 = var2;
         }
      }

      var1 += 8;
      var2 = this.menuSize * 15 + 21;
      int var4;
      if (super.anInt822 > 4 && super.anInt823 > 4 && super.anInt822 < 516 && super.anInt823 < 338) {
         var3 = super.anInt822 - var1 / 2 - 4;
         if (var3 + var1 > 512) {
            var3 = 512 - var1;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         var4 = super.anInt823 - 4;
         if (var4 + var2 > 334) {
            var4 = 334 - var2;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         this.menuVisible = true;
         this.anInt1039 = 0;
         this.anInt1040 = var3;
         this.anInt1041 = var4;
         this.anInt1042 = var1;
         this.anInt1043 = this.menuSize * 15 + 22;
      }

      if (super.anInt822 > 553 && super.anInt823 > 205 && super.anInt822 < 743 && super.anInt823 < 466) {
         var3 = super.anInt822 - var1 / 2 - 553;
         if (var3 < 0) {
            var3 = 0;
         } else if (var3 + var1 > 190) {
            var3 = 190 - var1;
         }

         var4 = super.anInt823 - 205;
         if (var4 < 0) {
            var4 = 0;
         } else if (var4 + var2 > 261) {
            var4 = 261 - var2;
         }

         this.menuVisible = true;
         this.anInt1039 = 1;
         this.anInt1040 = var3;
         this.anInt1041 = var4;
         this.anInt1042 = var1;
         this.anInt1043 = this.menuSize * 15 + 22;
      }

      if (super.anInt822 > 17 && super.anInt823 > 357 && super.anInt822 < 496 && super.anInt823 < 453) {
         var3 = super.anInt822 - var1 / 2 - 17;
         if (var3 < 0) {
            var3 = 0;
         } else if (var3 + var1 > 479) {
            var3 = 479 - var1;
         }

         var4 = super.anInt823 - 357;
         if (var4 < 0) {
            var4 = 0;
         } else if (var4 + var2 > 96) {
            var4 = 96 - var2;
         }

         this.menuVisible = true;
         this.anInt1039 = 2;
         this.anInt1040 = var3;
         this.anInt1041 = var4;
         this.anInt1042 = var1;
         this.anInt1043 = this.menuSize * 15 + 22;
      }

   }

   private void method647(PathingEntity var1) {
      if (var1.anInt729 != 0) {
         int var2;
         int var3;
         if (var1.anInt738 != -1 && var1.anInt738 < 32768) {
            NpcEntity var4 = this.npcs[var1.anInt738];
            if (var4 != null) {
               var2 = var1.x - var4.x;
               var3 = var1.z - var4.z;
               if (var2 != 0 || var3 != 0) {
                  var1.anInt717 = (int)(Math.atan2((double)var2, (double)var3) * 325.949) & 2047;
               }
            }
         }

         int var7;
         if (var1.anInt738 >= 32768) {
            var7 = var1.anInt738 - 32768;
            if (var7 == this.anInt881) {
               var7 = this.anInt883;
            }

            PlayerEntity var5 = this.players[var7];
            if (var5 != null) {
               var3 = var1.x - var5.x;
               int var6 = var1.z - var5.z;
               if (var3 != 0 || var6 != 0) {
                  var1.anInt717 = (int)(Math.atan2((double)var3, (double)var6) * 325.949) & 2047;
               }
            }
         }

         if ((var1.anInt727 != 0 || var1.anInt728 != 0) && (var1.anInt759 == 0 || var1.anInt752 > 0)) {
            var7 = var1.x - (var1.anInt727 - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
            var2 = var1.z - (var1.anInt728 - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;
            if (var7 != 0 || var2 != 0) {
               var1.anInt717 = (int)(Math.atan2((double)var7, (double)var2) * 325.949) & 2047;
            }

            var1.anInt727 = 0;
            var1.anInt728 = 0;
         }

         var7 = var1.anInt717 - var1.anInt741 & 2047;
         if (var7 != 0) {
            if (var7 >= var1.anInt729 && var7 <= 2048 - var1.anInt729) {
               if (var7 > 1024) {
                  var1.anInt741 -= var1.anInt729;
               } else {
                  var1.anInt741 += var1.anInt729;
               }
            } else {
               var1.anInt741 = var1.anInt717;
            }

            var1.anInt741 &= 2047;
            if (var1.anInt719 == var1.anInt760 && var1.anInt741 != var1.anInt717) {
               if (var1.anInt761 != -1) {
                  var1.anInt719 = var1.anInt761;
                  return;
               }

               var1.anInt719 = var1.anInt748;
               return;
            }
         }
      }

   }

   private void drawTooltip() {
      if (this.menuSize >= 2 || this.objSelected != 0 || this.spellSelected != 0) {
         String var1;
         if (this.objSelected == 1 && this.menuSize < 2) {
            var1 = "Use " + this.aString30 + " with...";
         } else if (this.spellSelected == 1 && this.menuSize < 2) {
            var1 = this.aString31 + "...";
         } else {
            var1 = this.menuOption[this.menuSize - 1];
         }

         if (this.menuSize > 2) {
            var1 = var1 + "@whi@ / " + (this.menuSize - 2) + " more options";
         }

         this.aClass10_Sub1_Sub1_Sub2_4.method157(anInt1050 / 1000, 4, 16777215, 15, var1);
      }

   }

   private void method648(PathingEntity var1) {
      var1.aBoolean196 = false;
      SeqType var2;
      if (var1.anInt719 != -1) {
         var2 = SeqType.aClass15Array1[var1.anInt719];
         ++var1.anInt721;
         if (var1.anInt720 < var2.anInt152 && var1.anInt721 > var2.method97(var1.anInt720)) {
            var1.anInt721 = 1;
            ++var1.anInt720;
         }

         if (var1.anInt720 >= var2.anInt152) {
            var1.anInt721 = 1;
            var1.anInt720 = 0;
         }
      }

      if (var1.anInt743 != -1 && anInt1050 >= var1.anInt746) {
         if (var1.anInt744 < 0) {
            var1.anInt744 = 0;
         }

         var2 = SpotAnimType.aClass28Array1[var1.anInt743].aClass15_1;
         ++var1.anInt745;
         if (var1.anInt744 < var2.anInt152 && var1.anInt745 > var2.method97(var1.anInt744)) {
            var1.anInt745 = 1;
            ++var1.anInt744;
         }

         if (var1.anInt744 >= var2.anInt152 && (var1.anInt744 < 0 || var1.anInt744 >= var2.anInt152)) {
            var1.anInt743 = -1;
         }
      }

      if (var1.anInt753 != -1 && var1.anInt756 <= 1) {
         var2 = SeqType.aClass15Array1[var1.anInt753];
         if (var2.anInt158 == 1 && var1.anInt742 > 0 && var1.anInt735 <= anInt1050 && var1.anInt736 < anInt1050) {
            var1.anInt756 = 1;
            return;
         }
      }

      if (var1.anInt753 != -1 && var1.anInt756 == 0) {
         var2 = SeqType.aClass15Array1[var1.anInt753];
         ++var1.anInt755;
         if (var1.anInt754 < var2.anInt152 && var1.anInt755 > var2.method97(var1.anInt754)) {
            var1.anInt755 = 1;
            ++var1.anInt754;
         }

         if (var1.anInt754 >= var2.anInt152) {
            var1.anInt754 -= var2.anInt153;
            ++var1.anInt757;
            if (var1.anInt757 >= var2.anInt157) {
               var1.anInt753 = -1;
            }

            if (var1.anInt754 < 0 || var1.anInt754 >= var2.anInt152) {
               var1.anInt753 = -1;
            }
         }

         var1.aBoolean196 = var2.aBoolean45;
      }

      if (var1.anInt756 > 0) {
         --var1.anInt756;
      }

   }

   private void method661() {
      int var1 = 5;
      this.archiveChecksum[8] = 0;
      int var2 = 0;

      while(this.archiveChecksum[8] == 0) {
         String var3 = "Unknown problem";
         this.drawProgress(20, "Connecting to web server");

         try {
            DataInputStream var4 = this.method606("crc" + (int)(Math.random() * 9.9999999E7) + "-" + 377);
            Packet var5 = new Packet(new byte[40]);
            var4.readFully(var5.data, 0, 40);
            var4.close();

            int var6;
            for(var6 = 0; var6 < 9; ++var6) {
               this.archiveChecksum[var6] = var5.g4();
            }

            var6 = var5.g4();
            int var7 = 1234;

            for(int var8 = 0; var8 < 9; ++var8) {
               var7 = (var7 << 1) + this.archiveChecksum[var8];
            }

            if (var6 != var7) {
               System.out.println(var7);
               var3 = "checksum problem";
               this.archiveChecksum[8] = 0;
            }
         } catch (EOFException var11) {
            var3 = "EOF problem";
            this.archiveChecksum[8] = 0;
         } catch (IOException var12) {
            var3 = "connection problem";
            this.archiveChecksum[8] = 0;
         } catch (Exception var13) {
            var3 = "logic problem";
            this.archiveChecksum[8] = 0;
            if (!signlink.reporterror) {
               return;
            }
         }

         if (this.archiveChecksum[8] == 0) {
            ++var2;

            for(int var9 = var1; var9 > 0; --var9) {
               if (var2 >= 10) {
                  this.drawProgress(10, "Game updated - please reload page");
                  var9 = 10;
               } else {
                  this.drawProgress(10, var3 + " - Will retry in " + var9 + " secs.");
               }

               try {
                  Thread.sleep(1000L);
               } catch (Exception var10) {
               }
            }

            var1 *= 2;
            if (var1 > 60) {
               var1 = 60;
            }

            this.aBoolean219 = !this.aBoolean219;
         }
      }

   }

   private void orbitCamera(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 2048 - var3 & 2047;
      int var8 = 2048 - var5 & 2047;
      int var9 = 0;
      int var10 = 0;
      int var11 = var4;
      int var12;
      int var13;
      int var14;
      if (var7 != 0) {
         var12 = Model.anIntArray146[var7];
         var13 = Model.anIntArray147[var7];
         var14 = var13 * 0 - var4 * var12 >> 16;
         var11 = var12 * 0 + var4 * var13 >> 16;
         var10 = var14;
      }

      if (var8 != 0) {
         var12 = Model.anIntArray146[var8];
         var13 = Model.anIntArray147[var8];
         var14 = var11 * var12 + var13 * 0 >> 16;
         var11 = var11 * var13 - var12 * 0 >> 16;
         var9 = var14;
      }

      this.cameraX = var2 - var9;
      this.cameraY = var1 - var10;
      this.cameraZ = var6 - var11;
      this.cameraPitch = var3;
      this.cameraYaw = var5;
   }

   private void method628(long var1) {
      if (var1 != 0L) {
         for(int var3 = 0; var3 < this.anInt838; ++var3) {
            if (this.aLongArray4[var3] == var1) {
               --this.anInt838;
               this.aBoolean248 = true;

               for(int var4 = var3; var4 < this.anInt838; ++var4) {
                  this.aStringArray8[var4] = this.aStringArray8[var4 + 1];
                  this.anIntArray265[var4] = this.anIntArray265[var4 + 1];
                  this.aLongArray4[var4] = this.aLongArray4[var4 + 1];
               }

               this.out.p1isaac(141);
               this.out.p8(var1);
               break;
            }
         }

         this.packetSize += 0;
      }

   }

   private String method679(int var1) {
      if (var1 > this.anInt977 + 10) {
         return "Unknown";
      } else {
         long var2 = ((long)var1 + 11745L) * 86400000L;
         Calendar var4 = Calendar.getInstance();
         var4.setTime(new Date(var2));
         int var5 = var4.get(5);
         int var6 = var4.get(2);
         int var7 = var4.get(1);
         String[] var8 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
         return var5 + "-" + var8[var6] + "-" + var7;
      }
   }

   private Jagfile loadArchive(int var1, String var2, int var3, int var4, String var5) {
      byte[] var6 = null;
      int var7 = 5;

      try {
         if (this.aClass24Array1[0] != null) {
            var6 = this.aClass24Array1[0].method241(this.aByte45, var4);
         }
      } catch (Exception var23) {
      }

      int var19;
      if (var6 != null) {
         this.aCRC32_2.reset();
         this.aCRC32_2.update(var6);
         var19 = (int)this.aCRC32_2.getValue();
         if (var19 != var1) {
            var6 = null;
         }
      }

      if (var6 != null) {
         System.out.println("Loaded JagFile: " + var2);
         return new Jagfile(var6);
      } else {
         var19 = 0;

         while(var6 == null) {
            String var9 = "Unknown error";
            this.drawProgress(var3, "Requesting " + var5);

            int var10;
            try {
               var10 = 0;
               DataInputStream var11 = this.method606(var2 + var1);
               byte[] var12 = new byte[6];
               var11.readFully(var12, 0, 6);
               Packet var13 = new Packet(var12);
               var13.pos = 3;
               int var14 = var13.g3() + 6;
               int var15 = 6;
               var6 = new byte[var14];

               int var16;
               for(var16 = 0; var16 < 6; ++var16) {
                  var6[var16] = var12[var16];
               }

               int var18;
               for(; var15 < var14; var10 = var18) {
                  var16 = var14 - var15;
                  if (var16 > 1000) {
                     var16 = 1000;
                  }

                  int var17 = var11.read(var6, var15, var16);
                  if (var17 < 0) {
                     (new StringBuffer("Length error: ")).append(var15).append("/").append(var14).toString();
                     throw new IOException("EOF");
                  }

                  var15 += var17;
                  var18 = var15 * 100 / var14;
                  if (var18 != var10) {
                     this.drawProgress(var3, "Loading " + var5 + " - " + var18 + "%");
                  }
               }

               var11.close();

               try {
                  if (this.aClass24Array1[0] != null) {
                     this.aClass24Array1[0].method242(var6.length, var6, var4);
                  }
               } catch (Exception var22) {
                  this.aClass24Array1[0] = null;
               }

               if (var6 != null) {
                  this.aCRC32_2.reset();
                  this.aCRC32_2.update(var6);
                  var16 = (int)this.aCRC32_2.getValue();
                  if (var16 != var1) {
                     var6 = null;
                     ++var19;
                     var9 = "Checksum error: " + var16;
                  }
               }
            } catch (IOException var24) {
               if (var9.equals("Unknown error")) {
                  var9 = "Connection error";
               }

               var6 = null;
            } catch (NullPointerException var25) {
               var9 = "Null error";
               var6 = null;
               if (!signlink.reporterror) {
                  return null;
               }
            } catch (ArrayIndexOutOfBoundsException var26) {
               var9 = "Bounds error";
               var6 = null;
               if (!signlink.reporterror) {
                  return null;
               }
            } catch (Exception var27) {
               var9 = "Unexpected error";
               var6 = null;
               if (!signlink.reporterror) {
                  return null;
               }
            }

            if (var6 == null) {
               for(var10 = var7; var10 > 0; --var10) {
                  if (var19 >= 3) {
                     this.drawProgress(var3, "Game updated - please reload page");
                     var10 = 10;
                  } else {
                     this.drawProgress(var3, var9 + " - Retrying in " + var10);
                  }

                  try {
                     Thread.sleep(1000L);
                  } catch (Exception var21) {
                  }
               }

               var7 *= 2;
               if (var7 > 60) {
                  var7 = 60;
               }

               this.aBoolean219 = !this.aBoolean219;
            }
         }
         System.out.println("Loaded JagFile: " + var2);
         return new Jagfile(var6);
      }
   }

   private void printDebug() {
      System.out.println("============");
      System.out.println("flame-cycle:" + this.anInt945);
      if (this.aClass33_Sub1_1 != null) {
         System.out.println("Od-cycle:" + this.aClass33_Sub1_1.anInt788);
      }

      System.out.println("loop-cycle:" + anInt1050);
      System.out.println("draw-cycle:" + anInt1044);
      System.out.println("ptype:" + this.packetType);
      System.out.println("psize:" + this.packetSize);
      if (this.stream != null) {
         this.stream.printDebug();
      }

      super.aBoolean213 = true;
   }

   private int getTopLevel(byte var1) {
      int var2 = 3;
      if (this.aByte48 == 1) {
         boolean var3 = false;
      } else {
         this.load();
      }

      if (this.cameraPitch < 310) {
         ++anInt887;
         int var11;
         if (anInt887 > 1457) {
            anInt887 = 0;
            this.out.p1isaac(244);
            this.out.p1(0);
            var11 = this.out.pos;
            this.out.p1(219);
            this.out.p2(37745);
            this.out.p1(61);
            this.out.p2(43756);
            this.out.p2((int)(Math.random() * 65536.0));
            this.out.p1((int)(Math.random() * 256.0));
            this.out.p2(51171);
            if ((int)(Math.random() * 2.0) == 0) {
               this.out.p2(15808);
            }

            this.out.p1(97);
            this.out.p1((int)(Math.random() * 256.0));
            this.out.psize1(this.out.pos - var11);
         }

         var11 = this.cameraX >> 7;
         int var4 = this.cameraZ >> 7;
         int var5 = localPlayer.x >> 7;
         int var6 = localPlayer.z >> 7;
         if ((this.aByteArrayArrayArray8[this.currentLevel][var11][var4] & 4) != 0) {
            var2 = this.currentLevel;
         }

         int var7;
         if (var5 > var11) {
            var7 = var5 - var11;
         } else {
            var7 = var11 - var5;
         }

         int var8;
         if (var6 > var4) {
            var8 = var6 - var4;
         } else {
            var8 = var4 - var6;
         }

         int var9;
         int var10;
         if (var7 > var8) {
            var9 = var8 * 65536 / var7;
            var10 = 32768;

            while(var11 != var5) {
               if (var11 < var5) {
                  ++var11;
               } else if (var11 > var5) {
                  --var11;
               }

               if ((this.aByteArrayArrayArray8[this.currentLevel][var11][var4] & 4) != 0) {
                  var2 = this.currentLevel;
               }

               var10 += var9;
               if (var10 >= 65536) {
                  var10 -= 65536;
                  if (var4 < var6) {
                     ++var4;
                  } else if (var4 > var6) {
                     --var4;
                  }

                  if ((this.aByteArrayArrayArray8[this.currentLevel][var11][var4] & 4) != 0) {
                     var2 = this.currentLevel;
                  }
               }
            }
         } else {
            var9 = var7 * 65536 / var8;
            var10 = 32768;

            while(var4 != var6) {
               if (var4 < var6) {
                  ++var4;
               } else if (var4 > var6) {
                  --var4;
               }

               if ((this.aByteArrayArrayArray8[this.currentLevel][var11][var4] & 4) != 0) {
                  var2 = this.currentLevel;
               }

               var10 += var9;
               if (var10 >= 65536) {
                  var10 -= 65536;
                  if (var11 < var5) {
                     ++var11;
                  } else if (var11 > var5) {
                     --var11;
                  }

                  if ((this.aByteArrayArrayArray8[this.currentLevel][var11][var4] & 4) != 0) {
                     var2 = this.currentLevel;
                  }
               }
            }
         }
      }

      if ((this.aByteArrayArrayArray8[this.currentLevel][localPlayer.x >> 7][localPlayer.z >> 7] & 4) != 0) {
         var2 = this.currentLevel;
      }

      return var2;
   }

   private void method665(int var1, long var2) {
      if (var1 != -916) {
         this.packetType = this.in.g1();
      }

      if (var2 != 0L) {
         if (this.anInt837 >= 100) {
            this.method622("", "Your ignore list is full. Max of 100 hit", 0);
         } else {
            String var4 = Class26.method252(Class26.method249(var2), (byte)7);

            int var5;
            for(var5 = 0; var5 < this.anInt837; ++var5) {
               if (this.aLongArray3[var5] == var2) {
                  this.method622("", var4 + " is already on your ignore list", 0);
                  return;
               }
            }

            for(var5 = 0; var5 < this.anInt838; ++var5) {
               if (this.aLongArray4[var5] == var2) {
                  this.method622("", "Please remove " + var4 + " from your friend list first", 0);
                  return;
               }
            }

            this.aLongArray3[this.anInt837++] = var2;
            this.aBoolean248 = true;
            this.out.p1isaac(217);
            this.out.p8(var2);
         }
      }

   }

   protected void draw() {
      if (!this.aBoolean232 && !this.aBoolean264 && !this.errorHost) {
         ++anInt1044;
         if (this.ingame) {
            this.method649();
         } else {
            this.drawTitleScreen(false);
         }

         this.anInt943 = 0;
      } else {
         this.method698(281);
      }

   }

   private void method617(int var1, int var2, ComType var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.aBoolean242) {
         this.anInt1038 = 32;
      } else {
         this.anInt1038 = 0;
      }

      this.aBoolean242 = false;
      if (var6 >= var8 && var6 < var8 + 16 && var4 >= var2 && var4 < var2 + 16) {
         var3.scrollPosition -= this.anInt943 * 4;
         if (var5 == 1) {
            this.aBoolean248 = true;
         }

         if (var5 == 2 || var5 == 3) {
            this.aBoolean255 = true;
         }
      } else if (var6 >= var8 && var6 < var8 + 16 && var4 >= var2 + var7 - 16 && var4 < var2 + var7) {
         var3.scrollPosition += this.anInt943 * 4;
         if (var5 == 1) {
            this.aBoolean248 = true;
         }

         if (var5 == 2 || var5 == 3) {
            this.aBoolean255 = true;
         }
      } else if (var6 >= var8 - this.anInt1038 && var6 < var8 + this.anInt1038 + 16 && var4 >= var2 + 16 && var4 < var2 + var7 - 16 && this.anInt943 > 0) {
         int var9 = (var7 - 32) * var7 / var1;
         if (var9 < 8) {
            var9 = 8;
         }

         int var10 = var4 - var2 - var9 / 2 - 16;
         int var11 = var7 - var9 - 32;
         var3.scrollPosition = (var1 - var7) * var10 / var11;
         if (var5 == 1) {
            this.aBoolean248 = true;
         }

         if (var5 == 2 || var5 == 3) {
            this.aBoolean255 = true;
         }

         this.aBoolean242 = true;
      }

   }

   private void setWaveVol(int var1) {
      signlink.wavevol = var1;
   }

   private void method630(int var1, Pix24 var2, int var3) {
      int var4 = var3 * var3 + var1 * var1;
      if (var4 > 4225 && var4 < 90000) {
         int var5 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
         int var6 = Model.anIntArray146[var5];
         int var7 = Model.anIntArray147[var5];
         int var8 = var6 * 256 / (this.minimapZoom + 256);
         int var9 = var7 * 256 / (this.minimapZoom + 256);
         int var10 = var1 * var8 + var3 * var9 >> 16;
         int var11 = var1 * var9 - var3 * var8 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = (int)(Math.sin(var12) * 63.0);
         int var15 = (int)(Math.cos(var12) * 57.0);
         this.aClass10_Sub1_Sub1_Sub1_17.method83(var14 + 94 + 4 - 10, this.anInt954, var12, 83 - var15 - 20);
      } else {
         this.method705(var1, var2, var3);
      }

   }

   private void method720(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Class10_Sub2 var10 = null;

      for(Class10_Sub2 var11 = (Class10_Sub2)this.spawnedLocations.method6(); var11 != null; var11 = (Class10_Sub2)this.spawnedLocations.method8()) {
         if (var11.anInt454 == var1 && var11.anInt456 == var2 && var11.anInt457 == var9 && var11.anInt455 == var8) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new Class10_Sub2();
         var10.anInt454 = var1;
         var10.anInt455 = var8;
         var10.anInt456 = var2;
         var10.anInt457 = var9;
         this.method715(var10);
         this.spawnedLocations.method3(var10);
      }

      var10.anInt447 = var6;
      var10.anInt449 = var5;
      var10.anInt448 = var3;
      var10.anInt458 = var7;
      var10.anInt453 = var4;
      this.ingame &= true;
   }

   private void method672(int var1, long var2) {
      if (var2 != 0L) {
         for(int var4 = 0; var4 < this.anInt837; ++var4) {
            if (this.aLongArray3[var4] == var2) {
               --this.anInt837;
               this.aBoolean248 = true;

               for(int var5 = var4; var5 < this.anInt837; ++var5) {
                  this.aLongArray3[var5] = this.aLongArray3[var5 + 1];
               }

               this.out.p1isaac(160);
               this.out.p8(var2);
               break;
            }
         }

         boolean var6 = false;
      }

   }

   private void method593() {
      for(Class10_Sub2 var1 = (Class10_Sub2)this.spawnedLocations.method6(); var1 != null; var1 = (Class10_Sub2)this.spawnedLocations.method8()) {
         if (var1.anInt453 == -1) {
            var1.anInt458 = 0;
            this.method715(var1);
         } else {
            var1.unlink();
         }
      }

   }

   private void method645(PathingEntity var1) {
      if (var1.anInt736 == anInt1050 || var1.anInt753 == -1 || var1.anInt756 != 0 || var1.anInt755 + 1 > SeqType.aClass15Array1[var1.anInt753].method97(var1.anInt754)) {
         int var2 = var1.anInt736 - var1.anInt735;
         int var3 = anInt1050 - var1.anInt735;
         int var4 = var1.anInt731 * 128 + var1.anInt730 * 64;
         int var5 = var1.anInt733 * 128 + var1.anInt730 * 64;
         int var6 = var1.anInt732 * 128 + var1.anInt730 * 64;
         int var7 = var1.anInt734 * 128 + var1.anInt730 * 64;
         var1.x = (var4 * (var2 - var3) + var6 * var3) / var2;
         var1.z = (var5 * (var2 - var3) + var7 * var3) / var2;
      }

      var1.anInt752 = 0;
      if (var1.anInt737 == 0) {
         var1.anInt717 = 1024;
      }

      if (var1.anInt737 == 1) {
         var1.anInt717 = 1536;
      }

      if (var1.anInt737 == 2) {
         var1.anInt717 = 0;
      }

      if (var1.anInt737 == 3) {
         var1.anInt717 = 512;
      }

      var1.anInt741 = var1.anInt717;
   }

   private void method646(PathingEntity var1) {
      var1.anInt719 = var1.anInt760;
      if (var1.anInt759 == 0) {
         var1.anInt752 = 0;
      } else {
         if (var1.anInt753 != -1 && var1.anInt756 == 0) {
            SeqType var2 = SeqType.aClass15Array1[var1.anInt753];
            if (var1.anInt742 > 0 && var2.anInt158 == 0) {
               ++var1.anInt752;
               return;
            }

            if (var1.anInt742 <= 0 && var2.anInt159 == 0) {
               ++var1.anInt752;
               return;
            }
         }

         int var9 = var1.x;
         int var3 = var1.z;
         int var4 = var1.anIntArray193[var1.anInt759 - 1] * 128 + var1.anInt730 * 64;
         int var5 = var1.anIntArray194[var1.anInt759 - 1] * 128 + var1.anInt730 * 64;
         if (var4 - var9 <= 256 && var4 - var9 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
            if (var9 < var4) {
               if (var3 < var5) {
                  var1.anInt717 = 1280;
               } else if (var3 > var5) {
                  var1.anInt717 = 1792;
               } else {
                  var1.anInt717 = 1536;
               }
            } else if (var9 > var4) {
               if (var3 < var5) {
                  var1.anInt717 = 768;
               } else if (var3 > var5) {
                  var1.anInt717 = 256;
               } else {
                  var1.anInt717 = 512;
               }
            } else if (var3 < var5) {
               var1.anInt717 = 1024;
            } else {
               var1.anInt717 = 0;
            }

            int var6 = var1.anInt717 - var1.anInt741 & 2047;
            if (var6 > 1024) {
               var6 -= 2048;
            }

            int var7 = var1.anInt749;
            if (var6 >= -256 && var6 <= 256) {
               var7 = var1.anInt748;
            } else if (var6 >= 256 && var6 < 768) {
               var7 = var1.anInt751;
            } else if (var6 >= -768 && var6 <= -256) {
               var7 = var1.anInt750;
            }

            if (var7 == -1) {
               var7 = var1.anInt748;
            }

            var1.anInt719 = var7;
            int var8 = 4;
            if (var1.anInt741 != var1.anInt717 && var1.anInt738 == -1 && var1.anInt729 != 0) {
               var8 = 2;
            }

            if (var1.anInt759 > 2) {
               var8 = 6;
            }

            if (var1.anInt759 > 3) {
               var8 = 8;
            }

            if (var1.anInt752 > 0 && var1.anInt759 > 1) {
               var8 = 8;
               --var1.anInt752;
            }

            if (var1.aBooleanArray10[var1.anInt759 - 1]) {
               var8 <<= 1;
            }

            if (var8 >= 8 && var1.anInt719 == var1.anInt748 && var1.anInt758 != -1) {
               var1.anInt719 = var1.anInt758;
            }

            if (var9 < var4) {
               var1.x += var8;
               if (var1.x > var4) {
                  var1.x = var4;
               }
            } else if (var9 > var4) {
               var1.x -= var8;
               if (var1.x < var4) {
                  var1.x = var4;
               }
            }

            if (var3 < var5) {
               var1.z += var8;
               if (var1.z > var5) {
                  var1.z = var5;
               }
            } else if (var3 > var5) {
               var1.z -= var8;
               if (var1.z < var5) {
                  var1.z = var5;
               }
            }

            if (var1.x == var4 && var1.z == var5) {
               --var1.anInt759;
               if (var1.anInt742 > 0) {
                  --var1.anInt742;
                  return;
               }
            }
         } else {
            var1.x = var4;
            var1.z = var5;
         }
      }

   }

   private void loadTitleBackground(boolean var1) {
      byte[] var2 = this.archiveTitle.read("title.dat", (byte[])null);
      Pix24 var3 = new Pix24(var2, this);
      this.aClass19_22.method130();
      var3.method76(0, 0);
      this.aClass19_23.method130();
      var3.method76(0, -637);
      this.aClass19_19.method130();
      var3.method76(0, -128);
      this.aClass19_20.method130();
      var3.method76(-371, -202);
      this.aClass19_21.method130();
      var3.method76(-171, -202);
      this.aClass19_24.method130();
      var3.method76(-265, 0);
      this.aClass19_25.method130();
      var3.method76(-265, -562);
      this.aClass19_26.method130();
      var3.method76(-171, -128);
      this.aClass19_27.method130();
      var3.method76(-171, -562);
      int[] var4 = new int[var3.width];

      int var5;
      for(int var6 = 0; var6 < var3.height; ++var6) {
         for(var5 = 0; var5 < var3.width; ++var5) {
            var4[var5] = var3.pixels[var3.width + var3.width * var6 - var5 - 1];
         }

         for(int var7 = 0; var7 < var3.width; ++var7) {
            var3.pixels[var7 + var3.width * var6] = var4[var7];
         }
      }

      this.aClass19_22.method130();
      var3.method76(0, 382);
      this.aClass19_23.method130();
      var3.method76(0, -255);
      this.aClass19_19.method130();
      var3.method76(0, 254);
      this.aClass19_20.method130();
      var3.method76(-371, 180);
      this.aClass19_21.method130();
      var3.method76(-171, 180);
      this.aClass19_24.method130();
      if (var1) {
         for(var5 = 1; var5 > 0; ++var5) {
         }
      }

      var3.method76(-265, 382);
      this.aClass19_25.method130();
      var3.method76(-265, -180);
      this.aClass19_26.method130();
      var3.method76(-171, 254);
      this.aClass19_27.method130();
      var3.method76(-171, -180);
      var3 = new Pix24(this.archiveTitle, "logo", 0);
      this.aClass19_19.method130();
      var3.draw(18, 382 - var3.width / 2 - 128);
      System.gc();
   }

   protected void update() {
      if (!this.aBoolean232 && !this.aBoolean264 && !this.errorHost) {
         ++anInt1050;
         if (this.ingame) {
            this.method603();
         } else {
            this.method724();
         }

         this.method652();
      }

   }

   private void loadTitleImages() {
      this.aClass10_Sub1_Sub1_Sub3_19 = new Class10_Sub1_Sub1_Sub3(this.archiveTitle, "titlebox", 0);
      this.aClass10_Sub1_Sub1_Sub3_20 = new Class10_Sub1_Sub1_Sub3(this.archiveTitle, "titlebutton", 0);
      this.aClass10_Sub1_Sub1_Sub3Array3 = new Class10_Sub1_Sub1_Sub3[12];

      int var1;
      for(var1 = 0; var1 < 12; ++var1) {
         this.aClass10_Sub1_Sub1_Sub3Array3[var1] = new Class10_Sub1_Sub1_Sub3(this.archiveTitle, "runes", var1);
      }

      this.aClass10_Sub1_Sub1_Sub1_3 = new Pix24(128, 265);
      this.aClass10_Sub1_Sub1_Sub1_4 = new Pix24(128, 265);

      for(var1 = 0; var1 < 33920; ++var1) {
         this.aClass10_Sub1_Sub1_Sub1_3.pixels[var1] = this.aClass19_22.pixels[var1];
      }

      for(var1 = 0; var1 < 33920; ++var1) {
         this.aClass10_Sub1_Sub1_Sub1_4.pixels[var1] = this.aClass19_23.pixels[var1];
      }

      this.anIntArray272 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray272[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray272[var1 + 64] = var1 * 1024 + 16711680;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray272[var1 + 128] = var1 * 4 + 16776960;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray272[var1 + 192] = 16777215;
      }

      this.anIntArray273 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray273[var1] = var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray273[var1 + 64] = var1 * 4 + 65280;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray273[var1 + 128] = var1 * 262144 + 65535;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray273[var1 + 192] = 16777215;
      }

      this.anIntArray274 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray274[var1] = var1 * 4;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray274[var1 + 64] = var1 * 262144 + 255;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray274[var1 + 128] = var1 * 1024 + 16711935;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.anIntArray274[var1 + 192] = 16777215;
      }

      this.anIntArray271 = new int[256];
      this.anIntArray259 = new int[32768];
      this.anIntArray260 = new int[32768];
      this.method658((Class10_Sub1_Sub1_Sub3)null);
      this.anIntArray249 = new int[32768];
      this.anIntArray250 = new int[32768];
      this.drawProgress(10, "Connecting to fileserver");
      if (!this.aBoolean257) {
         this.aBoolean266 = true;
         this.aBoolean257 = true;
         this.startThread(this, 2);
      }

   }

   private boolean method598(ComType var1, int var2) {
      boolean var3 = true;
      int var4 = var1.clientCode;
      if ((var4 < 1 || var4 > 200) && (var4 < 701 || var4 > 900)) {
         if (var4 >= 401 && var4 <= 500) {
            this.menuOption[this.menuSize] = "Remove @whi@" + var1.aString2;
            this.menuAction[this.menuSize] = 859;
            ++this.menuSize;
            return true;
         } else {
            return false;
         }
      } else {
         if (var4 >= 801) {
            var4 -= 701;
         } else if (var4 >= 701) {
            var4 -= 601;
         } else if (var4 >= 101) {
            var4 -= 101;
         } else {
            --var4;
         }

         this.menuOption[this.menuSize] = "Remove @whi@" + this.aStringArray8[var4];
         this.menuAction[this.menuSize] = 775;
         ++this.menuSize;
         this.menuOption[this.menuSize] = "Message @whi@" + this.aStringArray8[var4];
         this.menuAction[this.menuSize] = 984;
         ++this.menuSize;
         return true;
      }
   }

   private void method590() {
      this.out.p1isaac(110);
      if (this.sidebarInterfaceId != -1) {
         this.resetInterface(this.sidebarInterfaceId);
         this.sidebarInterfaceId = -1;
         this.aBoolean248 = true;
         this.aBoolean254 = false;
         this.aBoolean225 = true;
      }

      if (this.anInt888 != -1) {
         this.resetInterface(this.anInt888);
         this.anInt888 = -1;
         this.aBoolean255 = true;
         this.aBoolean254 = false;
      }

      if (this.anInt926 != -1) {
         this.resetInterface(this.anInt926);
         this.anInt926 = -1;
         this.aBoolean236 = true;
      }

      if (this.anInt880 != -1) {
         this.resetInterface(this.anInt880);
         this.anInt880 = -1;
      }

      if (this.viewportInterfaceId != -1) {
         this.resetInterface(this.viewportInterfaceId);
         this.viewportInterfaceId = -1;
      }

   }

   private void method680(int var1) {
      int var2 = VarpType.aClass44Array1[var1].anInt617;
      if (var2 != 0) {
         int var3 = this.anIntArray244[var1];
         if (var2 == 1) {
            if (var3 == 1) {
               Draw3D.setBrightness(0.9);
            }

            if (var3 == 2) {
               Draw3D.setBrightness(0.8);
            }

            if (var3 == 3) {
               Draw3D.setBrightness(0.7);
            }

            if (var3 == 4) {
               Draw3D.setBrightness(0.6);
            }

            ObjType.aClass34_4.clear();
            this.aBoolean236 = true;
         }

         if (var2 == 3) {
            boolean var4 = this.midiActive;
            if (var3 == 0) {
               this.setMidiVolume(this.midiActive, 0);
               this.midiActive = true;
            }

            if (var3 == 1) {
               this.setMidiVolume(this.midiActive, -400);
               this.midiActive = true;
            }

            if (var3 == 2) {
               this.setMidiVolume(this.midiActive, -800);
               this.midiActive = true;
            }

            if (var3 == 3) {
               this.setMidiVolume(this.midiActive, -1200);
               this.midiActive = true;
            }

            if (var3 == 4) {
               this.midiActive = false;
            }

            if (this.midiActive != var4 && !lowMemory) {
               if (this.midiActive) {
                  this.anInt1023 = this.anInt1051;
                  this.aBoolean260 = true;
                  this.aClass33_Sub1_1.method558(2, this.anInt1023);
               } else {
                  this.stopMidi();
               }

               this.nextMusicDelay = 0;
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               this.waveEnabled = true;
               this.setWaveVol(0);
            }

            if (var3 == 1) {
               this.waveEnabled = true;
               this.setWaveVol(-400);
            }

            if (var3 == 2) {
               this.waveEnabled = true;
               this.setWaveVol(-800);
            }

            if (var3 == 3) {
               this.waveEnabled = true;
               this.setWaveVol(-1200);
            }

            if (var3 == 4) {
               this.waveEnabled = false;
            }
         }

         if (var2 == 5) {
            this.anInt1036 = var3;
         }

         if (var2 == 6) {
            this.anInt897 = var3;
         }

         if (var2 == 8) {
            this.anInt997 = var3;
            this.aBoolean255 = true;
         }

         if (var2 == 9) {
            this.anInt879 = var3;
         }
      }

   }

   private void validateCharacterDesign(int var1) {
      if (var1 != 0) {
         this.out.p1(186);
      }

      this.aBoolean263 = true;

      for(int var2 = 0; var2 < 7; ++var2) {
         this.anIntArray276[var2] = -1;

         for(int var3 = 0; var3 < IdkType.count; ++var3) {
            if (!IdkType.instances[var3].disable && IdkType.instances[var3].type == var2 + (this.aBoolean245 ? 0 : 7)) {
               this.anIntArray276[var2] = var3;
               break;
            }
         }
      }

   }

   private void draw2DEntityElements() {
      this.anInt876 = 0;

      int var1;
      int var2;
      for(var2 = -1; var2 < this.playerCount + this.npcCount; ++var2) {
         Object var3;
         if (var2 == -1) {
            var3 = localPlayer;
         } else if (var2 < this.playerCount) {
            var3 = this.players[this.anIntArray229[var2]];
         } else {
            var3 = this.npcs[this.anIntArray256[var2 - this.playerCount]];
         }

         if (var3 != null && ((PathingEntity)var3).isVisible()) {
            NpcType var4;
            if (var3 instanceof NpcEntity) {
               var4 = ((NpcEntity)var3).type;
               if (var4.anIntArray165 != null) {
                  var4 = var4.method406();
               }

               if (var4 == null) {
                  continue;
               }
            }

            if (var2 >= this.playerCount) {
               var4 = ((NpcEntity)var3).type;
               if (var4.anInt571 >= 0 && var4.anInt571 < this.aClass10_Sub1_Sub1_Sub1Array7.length) {
                  this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height + 15);
                  if (this.projectX > -1) {
                     this.aClass10_Sub1_Sub1_Sub1Array7[var4.anInt571].draw(this.projectY - 30, this.projectX - 12);
                  }
               }

               if (this.hintType == 1 && this.anInt999 == this.anIntArray256[var2 - this.playerCount] && anInt1050 % 20 < 10) {
                  this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height + 15);
                  if (this.projectX > -1) {
                     this.aClass10_Sub1_Sub1_Sub1Array5[0].draw(this.projectY - 28, this.projectX - 12);
                  }
               }
            } else {
               var1 = 30;
               PlayerEntity var5 = (PlayerEntity)var3;
               if (var5.anInt769 != -1 || var5.anInt765 != -1) {
                  this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height + 15);
                  if (this.projectX > -1) {
                     if (var5.anInt769 != -1) {
                        this.aClass10_Sub1_Sub1_Sub1Array10[var5.anInt769].draw(this.projectY - 30, this.projectX - 12);
                        var1 += 25;
                     }

                     if (var5.anInt765 != -1) {
                        this.aClass10_Sub1_Sub1_Sub1Array7[var5.anInt765].draw(this.projectY - var1, this.projectX - 12);
                        var1 += 25;
                     }
                  }
               }

               if (var2 >= 0 && this.hintType == 10 && this.anInt969 == this.anIntArray229[var2]) {
                  this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height + 15);
                  if (this.projectX > -1) {
                     this.aClass10_Sub1_Sub1_Sub1Array5[1].draw(this.projectY - var1, this.projectX - 12);
                  }
               }
            }

            if (((PathingEntity)var3).aString13 != null && (var2 >= this.playerCount || this.publicChatSetting == 0 || this.publicChatSetting == 3 || this.publicChatSetting == 1 && this.isFriend(((PlayerEntity)var3).name))) {
               this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height);
               if (this.projectX > -1 && this.anInt876 < this.anInt877) {
                  this.anIntArray224[this.anInt876] = this.aClass10_Sub1_Sub1_Sub2_4.method151(((PathingEntity)var3).aString13) / 2;
                  this.anIntArray223[this.anInt876] = this.aClass10_Sub1_Sub1_Sub2_4.anInt230;
                  this.anIntArray221[this.anInt876] = this.projectX;
                  this.anIntArray222[this.anInt876] = this.projectY;
                  this.anIntArray225[this.anInt876] = ((PathingEntity)var3).anInt716;
                  this.anIntArray226[this.anInt876] = ((PathingEntity)var3).anInt722;
                  this.anIntArray227[this.anInt876] = ((PathingEntity)var3).anInt715;
                  this.aStringArray10[this.anInt876++] = ((PathingEntity)var3).aString13;
                  int[] var10000;
                  int var10001;
                  if (this.anInt897 == 0 && ((PathingEntity)var3).anInt722 >= 1 && ((PathingEntity)var3).anInt722 <= 3) {
                     var10000 = this.anIntArray223;
                     var10001 = this.anInt876;
                     var10000[var10001] += 10;
                     var10000 = this.anIntArray222;
                     var10001 = this.anInt876;
                     var10000[var10001] += 5;
                  }

                  if (this.anInt897 == 0 && ((PathingEntity)var3).anInt722 == 4) {
                     this.anIntArray224[this.anInt876] = 60;
                  }

                  if (this.anInt897 == 0 && ((PathingEntity)var3).anInt722 == 5) {
                     var10000 = this.anIntArray223;
                     var10001 = this.anInt876;
                     var10000[var10001] += 5;
                  }
               }
            }

            if (((PathingEntity)var3).anInt724 > anInt1050) {
               this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height + 15);
               if (this.projectX > -1) {
                  var1 = ((PathingEntity)var3).anInt725 * 30 / ((PathingEntity)var3).anInt726;
                  if (var1 > 30) {
                     var1 = 30;
                  }

                  Draw2D.fillRect(5, this.projectY - 3, 65280, var1, this.projectX - 15);
                  Draw2D.fillRect(5, this.projectY - 3, 16711680, 30 - var1, this.projectX - 15 + var1);
               }
            }

            for(var1 = 0; var1 < 4; ++var1) {
               if (((PathingEntity)var3).anIntArray197[var1] > anInt1050) {
                  this.projectFromGround((PathingEntity)var3, ((PathingEntity)var3).height / 2);
                  if (this.projectX > -1) {
                     if (var1 == 1) {
                        this.projectY -= 20;
                     }

                     if (var1 == 2) {
                        this.projectX -= 15;
                        this.projectY -= 10;
                     }

                     if (var1 == 3) {
                        this.projectX += 15;
                        this.projectY -= 10;
                     }

                     this.aClass10_Sub1_Sub1_Sub1Array8[((PathingEntity)var3).anIntArray196[var1]].draw(this.projectY - 12, this.projectX - 12);
                     this.aClass10_Sub1_Sub1_Sub2_2.method148(this.projectX, 452, this.projectY + 4, 0, String.valueOf(((PathingEntity)var3).anIntArray195[var1]));
                     this.aClass10_Sub1_Sub1_Sub2_2.method148(this.projectX - 1, 452, this.projectY + 3, 16777215, String.valueOf(((PathingEntity)var3).anIntArray195[var1]));
                  }
               }
            }
         }
      }

      for(var2 = 0; var2 < this.anInt876; ++var2) {
         var1 = this.anIntArray221[var2];
         int var11 = this.anIntArray222[var2];
         int var12 = this.anIntArray224[var2];
         int var13 = this.anIntArray223[var2];
         boolean var6 = true;

         while(var6) {
            var6 = false;

            for(int var7 = 0; var7 < var2; ++var7) {
               if (var11 + 2 > this.anIntArray222[var7] - this.anIntArray223[var7] && var11 - var13 < this.anIntArray222[var7] + 2 && var1 - var12 < this.anIntArray221[var7] + this.anIntArray224[var7] && var1 + var12 > this.anIntArray221[var7] - this.anIntArray224[var7] && this.anIntArray222[var7] - this.anIntArray223[var7] < var11) {
                  var11 = this.anIntArray222[var7] - this.anIntArray223[var7];
                  var6 = true;
               }
            }
         }

         this.projectX = this.anIntArray221[var2];
         this.projectY = this.anIntArray222[var2] = var11;
         String var14 = this.aStringArray10[var2];
         if (this.anInt897 == 0) {
            int var8 = 16776960;
            if (this.anIntArray225[var2] < 6) {
               var8 = this.anIntArray213[this.anIntArray225[var2]];
            }

            if (this.anIntArray225[var2] == 6) {
               var8 = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
            }

            if (this.anIntArray225[var2] == 7) {
               var8 = this.sceneCycle % 20 < 10 ? 255 : '\uffff';
            }

            if (this.anIntArray225[var2] == 8) {
               var8 = this.sceneCycle % 20 < 10 ? '뀀' : 8454016;
            }

            int var9;
            if (this.anIntArray225[var2] == 9) {
               var9 = 150 - this.anIntArray227[var2];
               if (var9 < 50) {
                  var8 = var9 * 1280 + 16711680;
               } else if (var9 < 100) {
                  var8 = 16776960 - (var9 - 50) * 327680;
               } else if (var9 < 150) {
                  var8 = (var9 - 100) * 5 + 65280;
               }
            }

            if (this.anIntArray225[var2] == 10) {
               var9 = 150 - this.anIntArray227[var2];
               if (var9 < 50) {
                  var8 = var9 * 5 + 16711680;
               } else if (var9 < 100) {
                  var8 = 16711935 - (var9 - 50) * 327680;
               } else if (var9 < 150) {
                  var8 = (var9 - 100) * 327680 + 255 - (var9 - 100) * 5;
               }
            }

            if (this.anIntArray225[var2] == 11) {
               var9 = 150 - this.anIntArray227[var2];
               if (var9 < 50) {
                  var8 = 16777215 - var9 * 327685;
               } else if (var9 < 100) {
                  var8 = (var9 - 50) * 327685 + 65280;
               } else if (var9 < 150) {
                  var8 = 16777215 - (var9 - 100) * 327680;
               }
            }

            if (this.anIntArray226[var2] == 0) {
               this.aClass10_Sub1_Sub1_Sub2_4.method148(this.projectX, 452, this.projectY + 1, 0, var14);
               this.aClass10_Sub1_Sub1_Sub2_4.method148(this.projectX, 452, this.projectY, var8, var14);
            }

            if (this.anIntArray226[var2] == 1) {
               this.aClass10_Sub1_Sub1_Sub2_4.method153(this.projectY + 1, (byte)4, this.sceneCycle, var14, this.projectX, 0);
               this.aClass10_Sub1_Sub1_Sub2_4.method153(this.projectY, (byte)4, this.sceneCycle, var14, this.projectX, var8);
            }

            if (this.anIntArray226[var2] == 2) {
               this.aClass10_Sub1_Sub1_Sub2_4.method154(this.projectY + 1, 0, var14, this.projectX, this.sceneCycle);
               this.aClass10_Sub1_Sub1_Sub2_4.method154(this.projectY, var8, var14, this.projectX, this.sceneCycle);
            }

            if (this.anIntArray226[var2] == 3) {
               this.aClass10_Sub1_Sub1_Sub2_4.method155(var14, 0, this.projectX, this.projectY + 1, 150 - this.anIntArray227[var2], this.sceneCycle);
               this.aClass10_Sub1_Sub1_Sub2_4.method155(var14, var8, this.projectX, this.projectY, 150 - this.anIntArray227[var2], this.sceneCycle);
            }

            int var10;
            if (this.anIntArray226[var2] == 4) {
               var9 = this.aClass10_Sub1_Sub1_Sub2_4.method151(var14);
               var10 = (150 - this.anIntArray227[var2]) * (var9 + 100) / 150;
               Draw2D.setBounds(0, this.projectX - 50, 334, this.projectX + 50);
               this.aClass10_Sub1_Sub1_Sub2_4.method152(this.projectX + 50 - var10, 0, this.projectY + 1, var14);
               this.aClass10_Sub1_Sub1_Sub2_4.method152(this.projectX + 50 - var10, var8, this.projectY, var14);
               Draw2D.resetBounds();
            }

            if (this.anIntArray226[var2] == 5) {
               var9 = 150 - this.anIntArray227[var2];
               var10 = 0;
               if (var9 < 25) {
                  var10 = var9 - 25;
               } else if (var9 > 125) {
                  var10 = var9 - 125;
               }

               Draw2D.setBounds(this.projectY - this.aClass10_Sub1_Sub1_Sub2_4.anInt230 - 1, 0, this.projectY + 5, 512);
               this.aClass10_Sub1_Sub1_Sub2_4.method148(this.projectX, 452, this.projectY + var10 + 1, 0, var14);
               this.aClass10_Sub1_Sub1_Sub2_4.method148(this.projectX, 452, this.projectY + var10, var8, var14);
               Draw2D.resetBounds();
            }
         } else {
            this.aClass10_Sub1_Sub1_Sub2_4.method148(this.projectX, 452, this.projectY + 1, 0, var14);
            this.aClass10_Sub1_Sub1_Sub2_4.method148(this.projectX, 452, this.projectY, 16776960, var14);
         }
      }

   }

   private void drawTileHint() {
      if (this.hintType == 2) {
         this.projectFromGround((this.anInt828 - this.sceneBaseTileX << 7) + this.anInt831, (this.anInt829 - this.sceneBaseTileZ << 7) + this.anInt832, this.anInt830 * 2);
         if (this.projectX > -1 && anInt1050 % 20 < 10) {
            this.aClass10_Sub1_Sub1_Sub1Array5[0].draw(this.projectY - 28, this.projectX - 12);
         }
      }

   }

   private void method718() {
      if (lowMemory && this.sceneState == 2 && World.anInt60 != this.currentLevel) {
         this.method700((String)null, "Loading - please wait.");
         this.sceneState = 1;
         this.loginTime = System.currentTimeMillis();
      }

      if (this.sceneState == 1) {
         int var1 = this.method719();
         if (var1 != 0 && System.currentTimeMillis() - this.loginTime > 360000L) {
            signlink.reporterror(this.username + " glcfb " + this.serverSeed + "," + var1 + "," + lowMemory + "," + this.aClass24Array1[0] + "," + this.aClass33_Sub1_1.method562() + "," + this.currentLevel + "," + this.anInt854 + "," + this.anInt855);
            this.loginTime = System.currentTimeMillis();
         }
      }

      if (this.sceneState == 2 && this.currentLevel != this.anInt1026) {
         this.anInt1026 = this.currentLevel;
         this.method690(this.currentLevel);
      }

   }

   private void updateTextures(int var1) {
      if (!lowMemory) {
         for(int var2 = 0; var2 < this.anIntArray268.length; ++var2) {
            int var3 = this.anIntArray268[var2];
            if (Draw3D.anIntArray185[var3] >= var1) {
               Class10_Sub1_Sub1_Sub3 var4 = Draw3D.aClass10_Sub1_Sub1_Sub3Array1[var3];
               int var5 = var4.anInt652 * var4.anInt653 - 1;
               int var6 = var4.anInt652 * this.anInt878 * 2;
               byte[] var7 = var4.aByteArray16;
               byte[] var8 = this.aByteArray21;

               for(int var9 = 0; var9 <= var5; ++var9) {
                  var8[var9] = var7[var9 - var6 & var5];
               }

               var4.aByteArray16 = var8;
               this.aByteArray21 = var7;
               Draw3D.method513(var3);
            }
         }
      }

   }

   private void method611() {
      if (this.sceneState == 2) {
         for(Class10_Sub2 var1 = (Class10_Sub2)this.spawnedLocations.method6(); var1 != null; var1 = (Class10_Sub2)this.spawnedLocations.method8()) {
            if (var1.anInt453 > 0) {
               --var1.anInt453;
            }

            if (var1.anInt453 != 0) {
               if (var1.anInt458 > 0) {
                  --var1.anInt458;
               }

               if (var1.anInt458 == 0 && var1.anInt456 >= 1 && var1.anInt457 >= 1 && var1.anInt456 <= 102 && var1.anInt457 <= 102 && (var1.anInt447 < 0 || World.method18(var1.anInt449, this.aByte50, var1.anInt447))) {
                  this.method620(var1.anInt448, var1.anInt456, var1.anInt447, var1.anInt457, var1.anInt454, var1.anInt449, var1.anInt455);
                  var1.anInt458 = -1;
                  if (var1.anInt447 == var1.anInt450 && var1.anInt450 == -1) {
                     var1.unlink();
                  } else if (var1.anInt447 == var1.anInt450 && var1.anInt448 == var1.anInt451 && var1.anInt449 == var1.anInt452) {
                     var1.unlink();
                  }
               }
            } else if (var1.anInt450 < 0 || World.method18(var1.anInt452, this.aByte50, var1.anInt450)) {
               this.method620(var1.anInt451, var1.anInt456, var1.anInt450, var1.anInt457, var1.anInt454, var1.anInt452, var1.anInt455);
               var1.unlink();
            }
         }
      }

   }

   private String method664(int var1) {
      return var1 < 999999999 ? String.valueOf(var1) : "*";
   }

   private void draw3DEntityElements() {
      this.drawPrivateMessages();
      if (this.crossMode == 1) {
         this.imageCrosses[this.crossCycle / 100].draw(this.crossX - 8 - 4, this.crossY - 8 - 4);
      }

      if (this.crossMode == 2) {
         this.imageCrosses[this.crossCycle / 100 + 4].draw(this.crossX - 8 - 4, this.crossY - 8 - 4);
      }

      if (this.currentOverlay != -1) {
         this.updateInterfaceAnimation(this.anInt878, this.currentOverlay);
         this.drawInterface(0, 0, ComType.method87(this.currentOverlay), 0);
      }

      if (this.viewportInterfaceId != -1) {
         this.updateInterfaceAnimation(this.anInt878, this.viewportInterfaceId);
         this.drawInterface(0, 0, ComType.method87(this.viewportInterfaceId), 0);
      }

      this.method999();
      if (!this.menuVisible) {
         this.handleInput();
         this.drawTooltip();
      } else if (this.anInt1039 == 0) {
         this.drawMenu();
      }

      if (this.anInt1047 == 1) {
         this.aClass10_Sub1_Sub1_Sub1_7.draw(296, 472);
      }

      int var1;
      int var2;
      int var3;
      if (aBoolean217) {
         var2 = 20;
         var3 = 16776960;
         if (super.fps < 30 && lowMemory) {
            var3 = 16711680;
         }

         if (super.fps < 20 && !lowMemory) {
            var3 = 16711680;
         }

         this.aClass10_Sub1_Sub1_Sub2_3.method147("Fps:" + super.fps, var3, 20);
         var1 = var2 + 15;
         Runtime var4 = Runtime.getRuntime();
         int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
         if (var5 > 33554432 && lowMemory) {
         }

         if (var5 > 67108864 && !lowMemory) {
         }

         this.aClass10_Sub1_Sub1_Sub2_3.method147("Mem:" + var5 + "k", 16776960, 35);
         var1 += 15;
      }

      if (this.systemUpdateTimer != 0) {
         var2 = this.systemUpdateTimer / 50;
         var1 = var2 / 60;
         var3 = var2 % 60;
         if (var3 < 10) {
            this.aClass10_Sub1_Sub1_Sub2_3.method152(4, 16776960, 329, "System update in: " + var1 + ":0" + var3);
         } else {
            this.aClass10_Sub1_Sub1_Sub2_3.method152(4, 16776960, 329, "System update in: " + var1 + ":" + var3);
         }

         ++anInt858;
         if (anInt858 > 112) {
            anInt858 = 0;
            this.out.p1isaac(197);
            this.out.p4(0);
            return;
         }
      }

   }

   private void method727() {
      for(int var1 = 0; var1 < this.waveCount; ++var1) {
         if (this.anIntArray264[var1] <= 0) {
            boolean var2 = false;

            try {
               if (this.anIntArray251[var1] == this.anInt1024 && this.anIntArray275[var1] == this.anInt874) {
                  if (!this.replayWave()) {
                     var2 = true;
                  }
               } else {
                  Packet var3 = Class39.method409(this.anIntArray275[var1], this.anIntArray251[var1]);
                  if (System.currentTimeMillis() + (long)(var3.pos / 22) > this.aLong33 + (long)(this.anInt983 / 22)) {
                     this.anInt983 = var3.pos;
                     this.aLong33 = System.currentTimeMillis();
                     if (this.saveWave(var3.data, var3.pos)) {
                        this.anInt1024 = this.anIntArray251[var1];
                        this.anInt874 = this.anIntArray275[var1];
                     } else {
                        var2 = true;
                     }
                  }
               }
            } catch (Exception var5) {
               if (signlink.reporterror) {
                  this.out.p1isaac(80);
                  this.out.p2(this.anIntArray251[var1] & 32767);
               } else {
                  this.out.p1isaac(80);
                  this.out.p2(-1);
               }
            }

            if (var2 && this.anIntArray264[var1] != -5) {
               this.anIntArray264[var1] = -5;
            } else {
               --this.waveCount;

               for(int var4 = var1; var4 < this.waveCount; ++var4) {
                  this.anIntArray251[var4] = this.anIntArray251[var4 + 1];
                  this.anIntArray275[var4] = this.anIntArray275[var4 + 1];
                  this.anIntArray264[var4] = this.anIntArray264[var4 + 1];
               }

               --var1;
            }
         } else {
            int var10003 = this.anIntArray264[var1]--;
         }
      }

      if (this.nextMusicDelay > 0) {
         this.nextMusicDelay -= 20;
         if (this.nextMusicDelay < 0) {
            this.nextMusicDelay = 0;
         }

         if (this.nextMusicDelay == 0 && this.midiActive && !lowMemory) {
            this.anInt1023 = this.anInt1051;
            this.aBoolean260 = true;
            this.aClass33_Sub1_1.method558(2, this.anInt1023);
            return;
         }
      }

   }

   private void handleChatMouseInput(int mouseX, int mouseY) {
      int var4 = 0;
      boolean var5 = false;

      for(int var6 = 0; var6 < 100; ++var6) {
         if (this.messageText[var6] != null) {
            int type = this.messageType[var6];
            int y = this.chatScrollOffset + 70 + 4 - var4 * 14;
            if (y < -20) {
               break;
            }

            String var9 = this.messageSender[var6];
            if (var9 != null && var9.startsWith("@cr1@")) {
               var9 = var9.substring(5);
            }

            if (var9 != null && var9.startsWith("@cr2@")) {
               var9 = var9.substring(5);
            }

            if (type == 0) {
               ++var4;
            }

            if ((type == 1 || type == 2) && (type == 1 || this.publicChatSetting == 0 || this.publicChatSetting == 1 && this.isFriend(var9))) {
               if (mouseY > y - 14 && mouseY <= y && !var9.equals(localPlayer.name)) {
                  if (this.anInt842 >= 1) {
                     this.menuOption[this.menuSize] = "Report abuse @whi@" + var9;
                     this.menuAction[this.menuSize] = 507;
                     ++this.menuSize;
                  }

                  this.menuOption[this.menuSize] = "Add ignore @whi@" + var9;
                  this.menuAction[this.menuSize] = 574;
                  ++this.menuSize;
                  this.menuOption[this.menuSize] = "Add friend @whi@" + var9;
                  this.menuAction[this.menuSize] = 762;
                  ++this.menuSize;
               }

               ++var4;
            }

            if ((type == 3 || type == 7) && this.anInt997 == 0 && (type == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.isFriend(var9))) {
               if (mouseY > y - 14 && mouseY <= y) {
                  if (this.anInt842 >= 1) {
                     this.menuOption[this.menuSize] = "Report abuse @whi@" + var9;
                     this.menuAction[this.menuSize] = 507;
                     ++this.menuSize;
                  }

                  this.menuOption[this.menuSize] = "Add ignore @whi@" + var9;
                  this.menuAction[this.menuSize] = 574;
                  ++this.menuSize;
                  this.menuOption[this.menuSize] = "Add friend @whi@" + var9;
                  this.menuAction[this.menuSize] = 762;
                  ++this.menuSize;
               }

               ++var4;
            }

            if (type == 4 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.isFriend(var9))) {
               if (mouseY > y - 14 && mouseY <= y) {
                  this.menuOption[this.menuSize] = "Accept trade @whi@" + var9;
                  this.menuAction[this.menuSize] = 544;
                  ++this.menuSize;
               }

               ++var4;
            }

            if ((type == 5 || type == 6) && this.anInt997 == 0 && this.anInt853 < 2) {
               ++var4;
            }

            if (type == 8 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.isFriend(var9))) {
               if (mouseY > y - 14 && mouseY <= y) {
                  this.menuOption[this.menuSize] = "Accept challenge @whi@" + var9;
                  this.menuAction[this.menuSize] = 695;
                  ++this.menuSize;
               }

               ++var4;
            }
         }
      }

   }

   private void method675() {
      int var1;
      for(int var2 = -1; var2 < this.playerCount; ++var2) {
         if (var2 == -1) {
            var1 = this.anInt883;
         } else {
            var1 = this.anIntArray229[var2];
         }

         PlayerEntity var3 = this.players[var1];
         if (var3 != null) {
            this.method643(1, var3);
         }
      }

      if (this.anInt996 > 0 || this.anInt996 < 0) {
         for(var1 = 1; var1 > 0; ++var1) {
         }
      }

   }

   private void method709() {
      this.aClass19_15.method130();
      Draw3D.lineOffset = this.anIntArray237;
      this.aClass10_Sub1_Sub1_Sub3_16.method440(0, 0);
      if (this.sidebarInterfaceId != -1) {
         this.drawInterface(0, 0, ComType.method87(this.sidebarInterfaceId), 0);
      } else if (this.anIntArray248[this.anInt1031] != -1) {
         this.drawInterface(0, 0, ComType.method87(this.anIntArray248[this.anInt1031]), 0);
      }

      if (this.menuVisible && this.anInt1039 == 1) {
         this.drawMenu();
      }

      this.aClass19_15.draw(205, 553, super.graphics);
      this.areaViewport.method130();
      Draw3D.lineOffset = this.anIntArray238;
   }

   private void method642() {
      for(int var1 = 0; var1 < this.npcCount; ++var1) {
         int var2 = this.anIntArray256[var1];
         NpcEntity var3 = this.npcs[var2];
         if (var3 != null) {
            this.method643(var3.type.aByte31, var3);
         }
      }

   }

   private void method660() {
      int var1;
      int var2;
      for(var2 = -1; var2 < this.playerCount; ++var2) {
         if (var2 == -1) {
            var1 = this.anInt883;
         } else {
            var1 = this.anIntArray229[var2];
         }

         PlayerEntity var3 = this.players[var1];
         if (var3 != null && var3.anInt715 > 0) {
            --var3.anInt715;
            if (var3.anInt715 == 0) {
               var3.aString13 = null;
            }
         }
      }

      this.packetSize += 0;

      for(var1 = 0; var1 < this.npcCount; ++var1) {
         var2 = this.anIntArray256[var1];
         NpcEntity var4 = this.npcs[var2];
         if (var4 != null && var4.anInt715 > 0) {
            --var4.anInt715;
            if (var4.anInt715 == 0) {
               var4.aString13 = null;
            }
         }
      }

   }

   private void method708(Packet var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var16;
      if (var2 == 203) {
         var3 = var1.g2();
         var4 = var1.g1();
         var5 = var4 >> 2;
         var6 = var4 & 3;
         var7 = this.anIntArray243[var5];
         var13 = var1.method334();
         var8 = var1.method330();
         var9 = this.anInt889 + (var8 >> 4 & 7);
         var10 = this.anInt890 + (var8 & 7);
         var14 = var1.method333(this.anInt940);
         var11 = var1.method340();
         var12 = var1.g2u();
         byte var15 = var1.g1b();
         var16 = var1.method333(this.anInt940);
         int var17 = var1.g2();
         PlayerEntity var18;
         if (var12 == this.anInt881) {
            var18 = localPlayer;
         } else {
            var18 = this.players[var12];
         }

         if (var18 != null) {
            LocType var19 = LocType.method523(var3);
            int var20 = this.anIntArrayArrayArray8[this.currentLevel][var9][var10];
            int var21 = this.anIntArrayArrayArray8[this.currentLevel][var9 + 1][var10];
            int var22 = this.anIntArrayArrayArray8[this.currentLevel][var9 + 1][var10 + 1];
            int var23 = this.anIntArrayArrayArray8[this.currentLevel][var9][var10 + 1];
            Model var24 = var19.method531(var5, var6, var20, var21, var22, var23, -1);
            if (var24 != null) {
               this.method720(this.currentLevel, var9, 0, var11 + 1, 0, -1, var17 + 1, var7, var10);
               var18.anInt771 = var17 + anInt1050;
               var18.anInt772 = var11 + anInt1050;
               var18.aClass10_Sub1_Sub2_Sub4_2 = var24;
               int var25 = var19.anInt707;
               int var26 = var19.anInt697;
               if (var6 == 1 || var6 == 3) {
                  var25 = var19.anInt697;
                  var26 = var19.anInt707;
               }

               var18.anInt762 = var9 * 128 + var25 * 64;
               var18.anInt764 = var10 * 128 + var26 * 64;
               var18.anInt763 = this.getHeightmapY(var18.anInt764, var18.anInt762, this.currentLevel);
               byte var27;
               if (var14 > var13) {
                  var27 = (byte)var14;
                  var14 = var13;
                  var13 = var27;
               }

               if (var16 > var15) {
                  var27 = (byte)var16;
                  var16 = var15;
                  var15 = var27;
               }

               var18.anInt774 = var9 + var14;
               var18.anInt776 = var9 + var13;
               var18.anInt775 = var10 + var16;
               var18.anInt777 = var10 + var15;
            }
         }
      }

      if (var2 == 106) {
         var3 = var1.method330();
         var4 = this.anInt889 + (var3 >> 4 & 7);
         var5 = this.anInt890 + (var3 & 7);
         var6 = var1.method341();
         var7 = var1.method340();
         var13 = var1.method340();
         if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var13 != this.anInt881) {
            Class10_Sub1_Sub2_Sub1 var28 = new Class10_Sub1_Sub2_Sub1();
            var28.anInt211 = var7;
            var28.anInt213 = var6;
            if (this.levelObjStacks[this.currentLevel][var4][var5] == null) {
               this.levelObjStacks[this.currentLevel][var4][var5] = new Class6(true);
            }

            this.levelObjStacks[this.currentLevel][var4][var5].method3(var28);
            this.method601(var4, var5);
         }
      } else if (var2 == 142) {
         var3 = var1.g2();
         var4 = var1.method330();
         var5 = var4 >> 2;
         var6 = var4 & 3;
         var7 = this.anIntArray243[var5];
         var13 = var1.g1();
         var8 = this.anInt889 + (var13 >> 4 & 7);
         var9 = this.anInt890 + (var13 & 7);
         if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
            var10 = this.anIntArrayArrayArray8[this.currentLevel][var8][var9];
            var14 = this.anIntArrayArrayArray8[this.currentLevel][var8 + 1][var9];
            var11 = this.anIntArrayArrayArray8[this.currentLevel][var8 + 1][var9 + 1];
            var12 = this.anIntArrayArrayArray8[this.currentLevel][var8][var9 + 1];
            if (var7 == 0) {
               Class45 var29 = this.scene.method212(this.currentLevel, var8, var9);
               if (var29 != null) {
                  var16 = var29.anInt635 >> 14 & 32767;
                  if (var5 == 2) {
                     var29.aClass10_Sub1_Sub2_7 = new LocEntity(var3, var11, var12, var14, 2, (byte)3, var16, false, var10, var6 + 4);
                     var29.aClass10_Sub1_Sub2_8 = new LocEntity(var3, var11, var12, var14, 2, (byte)3, var16, false, var10, var6 + 1 & 3);
                  } else {
                     var29.aClass10_Sub1_Sub2_7 = new LocEntity(var3, var11, var12, var14, var5, (byte)3, var16, false, var10, var6);
                  }
               }
            }

            if (var7 == 1) {
               Class36 var32 = this.scene.method213(this.currentLevel, var9, var8);
               if (var32 != null) {
                  var32.aClass10_Sub1_Sub2_6 = new LocEntity(var3, var11, var12, var14, 4, (byte)3, var32.anInt561 >> 14 & 32767, false, var10, 0);
               }
            }

            if (var7 == 2) {
               Class5 var33 = this.scene.method214(var8, var9, this.currentLevel);
               if (var5 == 11) {
                  var5 = 10;
               }

               if (var33 != null) {
                  var33.aClass10_Sub1_Sub2_1 = new LocEntity(var3, var11, var12, var14, var5, (byte)3, var33.anInt50 >> 14 & 32767, false, var10, var6);
               }
            }

            if (var7 == 3) {
               Class29 var34 = this.scene.method215(this.currentLevel, var9, var8);
               if (var34 != null) {
                  var34.aClass10_Sub1_Sub2_5 = new LocEntity(var3, var11, var12, var14, 22, (byte)3, var34.anInt446 >> 14 & 32767, false, var10, var6);
               }
            }
         }
      } else {
         Class10_Sub1_Sub2_Sub1 var35;
         if (var2 == 107) {
            var3 = var1.g2();
            var4 = var1.method331();
            var5 = this.anInt889 + (var4 >> 4 & 7);
            var6 = this.anInt890 + (var4 & 7);
            var7 = var1.method340();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               var35 = new Class10_Sub1_Sub2_Sub1();
               var35.anInt211 = var3;
               var35.anInt213 = var7;
               if (this.levelObjStacks[this.currentLevel][var5][var6] == null) {
                  this.levelObjStacks[this.currentLevel][var5][var6] = new Class6(true);
               }

               this.levelObjStacks[this.currentLevel][var5][var6].method3(var35);
               this.method601(var5, var6);
            }
         } else {
            Class6 var30;
            if (var2 == 121) {
               var3 = var1.g1();
               var4 = this.anInt889 + (var3 >> 4 & 7);
               var5 = this.anInt890 + (var3 & 7);
               var6 = var1.g2();
               var7 = var1.g2();
               var13 = var1.g2();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  var30 = this.levelObjStacks[this.currentLevel][var4][var5];
                  if (var30 != null) {
                     for(Class10_Sub1_Sub2_Sub1 var31 = (Class10_Sub1_Sub2_Sub1)var30.method6(); var31 != null; var31 = (Class10_Sub1_Sub2_Sub1)var30.method8()) {
                        if (var31.anInt211 == (var6 & 32767) && var31.anInt213 == var7) {
                           var31.anInt213 = var13;
                           break;
                        }
                     }

                     this.method601(var4, var5);
                  }
               }
            } else if (var2 == 181) {
               var3 = var1.g1();
               var4 = this.anInt889 + (var3 >> 4 & 7);
               var5 = this.anInt890 + (var3 & 7);
               var6 = var4 + var1.g1b();
               var7 = var5 + var1.g1b();
               var13 = var1.g2b();
               var8 = var1.g2();
               var9 = var1.g1() * 4;
               var10 = var1.g1() * 4;
               var14 = var1.g2();
               var11 = var1.g2();
               var12 = var1.g1();
               var16 = var1.g1();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var8 != 65535) {
                  var4 = var4 * 128 + 64;
                  var5 = var5 * 128 + 64;
                  var6 = var6 * 128 + 64;
                  var7 = var7 * 128 + 64;
                  Class10_Sub1_Sub2_Sub2 var37 = new Class10_Sub1_Sub2_Sub2(this.currentLevel, var10, var16, var5, var8, var11 + anInt1050, var12, var13, (byte)-41, this.getHeightmapY(var5, var4, this.currentLevel) - var9, var4, var14 + anInt1050);
                  var37.method187(var6, var7, this.getHeightmapY(var7, var6, this.currentLevel) - var10, var14 + anInt1050);
                  this.projectiles.method3(var37);
               }
            } else {
               if (var2 == 41) {
                  var3 = var1.g1();
                  var4 = this.anInt889 + (var3 >> 4 & 7);
                  var5 = this.anInt890 + (var3 & 7);
                  var6 = var1.g2();
                  var7 = var1.g1();
                  var13 = var7 >> 4 & 15;
                  var8 = var7 & 7;
                  if (localPlayer.anIntArray193[0] >= var4 - var13 && localPlayer.anIntArray193[0] <= var4 + var13 && localPlayer.anIntArray194[0] >= var5 - var13 && localPlayer.anIntArray194[0] <= var5 + var13 && this.waveEnabled && !lowMemory && this.waveCount < 50) {
                     this.anIntArray251[this.waveCount] = var6;
                     this.anIntArray275[this.waveCount] = var8;
                     this.anIntArray264[this.waveCount] = Class39.anIntArray171[var6];
                     ++this.waveCount;
                  }
               }

               if (var2 == 59) {
                  var3 = var1.g1();
                  var4 = this.anInt889 + (var3 >> 4 & 7);
                  var5 = this.anInt890 + (var3 & 7);
                  var6 = var1.g2();
                  var7 = var1.g1();
                  var13 = var1.g2();
                  if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                     var4 = var4 * 128 + 64;
                     var5 = var5 * 128 + 64;
                     Class10_Sub1_Sub2_Sub6 var36 = new Class10_Sub1_Sub2_Sub6(var4, this.currentLevel, this.getHeightmapY(var5, var4, this.currentLevel) - var7, var13, var6, anInt1050, var5, 10709);
                     this.spotanims.method3(var36);
                  }
               } else if (var2 == 152) {
                  var3 = var1.method331();
                  var4 = var3 >> 2;
                  var5 = var3 & 3;
                  var6 = this.anIntArray243[var4];
                  var7 = var1.method341();
                  var13 = var1.method330();
                  var8 = this.anInt889 + (var13 >> 4 & 7);
                  var9 = this.anInt890 + (var13 & 7);
                  if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                     this.method720(this.currentLevel, var8, var5, -1, var4, var7, 0, var6, var9);
                  }
               } else if (var2 == 208) {
                  var3 = var1.method340();
                  var4 = var1.method330();
                  var5 = this.anInt889 + (var4 >> 4 & 7);
                  var6 = this.anInt890 + (var4 & 7);
                  if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                     var30 = this.levelObjStacks[this.currentLevel][var5][var6];
                     if (var30 != null) {
                        for(var35 = (Class10_Sub1_Sub2_Sub1)var30.method6(); var35 != null; var35 = (Class10_Sub1_Sub2_Sub1)var30.method8()) {
                           if (var35.anInt211 == (var3 & 32767)) {
                              var35.unlink();
                              break;
                           }
                        }

                        if (var30.method6() == null) {
                           this.levelObjStacks[this.currentLevel][var5][var6] = null;
                        }

                        this.method601(var5, var6);
                     }
                  }
               } else if (var2 == 88) {
                  var3 = var1.method332(this.anInt1006);
                  var4 = this.anInt889 + (var3 >> 4 & 7);
                  var5 = this.anInt890 + (var3 & 7);
                  var6 = var1.method332(this.anInt1006);
                  var7 = var6 >> 2;
                  var13 = var6 & 3;
                  var8 = this.anIntArray243[var7];
                  if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                     this.method720(this.currentLevel, var4, var13, -1, var7, -1, 0, var8, var5);
                  }
               }
            }
         }
      }

   }

   private void method594(String var1) {
      System.out.println(var1);

      try {
         this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + var1 + ".html"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      while(true) {
         while(true) {
            try {
               Thread.sleep(1000L);
            } catch (Exception var4) {
            }
         }
      }
   }

   private boolean method655(int var1, int var2, int var3) {
      int var4 = var3 >> 14 & 32767;
      int var5 = this.scene.method220(this.currentLevel, var2, var1, var3);
      if (var5 == -1) {
         return false;
      } else {
         int var6 = var5 & 31;
         int var7 = var5 >> 6 & 3;
         if (var6 != 10 && var6 != 11 && var6 != 22) {
            this.method610(true, var1, localPlayer.anIntArray194[0], 0, 0, 2, var6 + 1, var2, 0, var7, localPlayer.anIntArray193[0]);
         } else {
            LocType var8 = LocType.method523(var4);
            int var9;
            int var10;
            if (var7 != 0 && var7 != 2) {
               var9 = var8.anInt697;
               var10 = var8.anInt707;
            } else {
               var9 = var8.anInt707;
               var10 = var8.anInt697;
            }

            int var11 = var8.anInt693;
            if (var7 != 0) {
               var11 = (var11 << var7 & 15) + (var11 >> 4 - var7);
            }

            this.method610(true, var1, localPlayer.anIntArray194[0], var9, var10, 2, 0, var2, var11, 0, localPlayer.anIntArray193[0]);
         }

         this.crossY = super.anInt822;
         this.crossX = super.anInt823;
         this.crossMode = 2;
         this.crossCycle = 0;
         this.packetSize += 0;
         return true;
      }
   }

   private void method659() {
      this.aClass19_18.method130();
      Draw3D.lineOffset = this.anIntArray236;
      this.aClass10_Sub1_Sub1_Sub3_18.method440(0, 0);
      if (this.aBoolean216) {
         this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, this.aString19);
         this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString24 + "*");
      } else if (this.anInt1010 == 1) {
         this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "Enter amount:");
         this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString20 + "*");
      } else if (this.anInt1010 == 2) {
         this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "Enter name:");
         this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString20 + "*");
      } else {
         PixFont var1;
         int var2;
         int var3;
         if (this.anInt1010 == 3) {
            if (this.aString20 != this.aString18) {
               this.method589(this.aString20);
               this.aString18 = this.aString20;
            }

            var1 = this.aClass10_Sub1_Sub1_Sub2_3;
            Draw2D.setBounds(0, 0, 77, 463);

            for(var2 = 0; var2 < this.anInt840; ++var2) {
               var3 = var2 * 14 + 18 - this.anInt841;
               if (var3 > 0 && var3 < 110) {
                  var1.method148(239, 452, var3, 0, this.aStringArray9[var2]);
               }
            }

            Draw2D.resetBounds();
            if (this.anInt840 > 5) {
               this.drawScrollbar(this.anInt841, 463, 77, this.anInt840 * 14 + 7, 0);
            }

            if (this.aString20.length() == 0) {
               this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 255, "Enter object name");
            } else if (this.anInt840 == 0) {
               this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "No matching objects found, please shorten search");
            }

            var1.method148(239, 452, 90, 0, this.aString20 + "*");
            Draw2D.drawHorizontalLine(0, 0, 77, 479);
         } else if (this.aString26 != null) {
            this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, this.aString26);
            this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, "Click to continue");
         } else if (this.anInt888 != -1) {
            this.drawInterface(0, 0, ComType.method87(this.anInt888), 0);
         } else if (this.anInt985 == -1) {
            var1 = this.aClass10_Sub1_Sub1_Sub2_3;
            var2 = 0;
            Draw2D.setBounds(0, 0, 77, 463);

            for(var3 = 0; var3 < 100; ++var3) {
               if (this.messageText[var3] != null) {
                  int var4 = this.messageType[var3];
                  int var5 = this.chatScrollOffset + 70 - var2 * 14;
                  String var6 = this.messageSender[var3];
                  byte var7 = 0;
                  if (var6 != null && var6.startsWith("@cr1@")) {
                     var6 = var6.substring(5);
                     var7 = 1;
                  }

                  if (var6 != null && var6.startsWith("@cr2@")) {
                     var6 = var6.substring(5);
                     var7 = 2;
                  }

                  if (var4 == 0) {
                     if (var5 > 0 && var5 < 110) {
                        var1.method152(4, 0, var5, this.messageText[var3]);
                     }

                     ++var2;
                  }

                  int var8;
                  if ((var4 == 1 || var4 == 2) && (var4 == 1 || this.publicChatSetting == 0 || this.publicChatSetting == 1 && this.isFriend(var6))) {
                     if (var5 > 0 && var5 < 110) {
                        var8 = 4;
                        if (var7 == 1) {
                           this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(var5 - 12, 4);
                           var8 += 14;
                        }

                        if (var7 == 2) {
                           this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(var5 - 12, var8);
                           var8 += 14;
                        }

                        var1.method152(var8, 0, var5, var6 + ":");
                        var8 += var1.method150(var6) + 8;
                        var1.method152(var8, 255, var5, this.messageText[var3]);
                     }

                     ++var2;
                  }

                  if ((var4 == 3 || var4 == 7) && this.anInt997 == 0 && (var4 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.isFriend(var6))) {
                     if (var5 > 0 && var5 < 110) {
                        var1.method152(4, 0, var5, "From");
                        var8 = var1.method150("From ") + 4;
                        if (var7 == 1) {
                           this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(var5 - 12, var8);
                           var8 += 14;
                        }

                        if (var7 == 2) {
                           this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(var5 - 12, var8);
                           var8 += 14;
                        }

                        var1.method152(var8, 0, var5, var6 + ":");
                        var8 += var1.method150(var6) + 8;
                        var1.method152(var8, 8388608, var5, this.messageText[var3]);
                     }

                     ++var2;
                  }

                  if (var4 == 4 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.isFriend(var6))) {
                     if (var5 > 0 && var5 < 110) {
                        var1.method152(4, 8388736, var5, var6 + " " + this.messageText[var3]);
                     }

                     ++var2;
                  }

                  if (var4 == 5 && this.anInt997 == 0 && this.anInt853 < 2) {
                     if (var5 > 0 && var5 < 110) {
                        var1.method152(4, 8388608, var5, this.messageText[var3]);
                     }

                     ++var2;
                  }

                  if (var4 == 6 && this.anInt997 == 0 && this.anInt853 < 2) {
                     if (var5 > 0 && var5 < 110) {
                        var1.method152(4, 0, var5, "To " + var6 + ":");
                        var1.method152(var1.method150("To " + var6) + 12, 8388608, var5, this.messageText[var3]);
                     }

                     ++var2;
                  }

                  if (var4 == 8 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.isFriend(var6))) {
                     if (var5 > 0 && var5 < 110) {
                        var1.method152(4, 8270336, var5, var6 + " " + this.messageText[var3]);
                     }

                     ++var2;
                  }
               }
            }

            Draw2D.resetBounds();
            this.anInt947 = var2 * 14 + 7;
            if (this.anInt947 < 78) {
               this.anInt947 = 78;
            }

            this.drawScrollbar(this.anInt947 - this.chatScrollOffset - 77, 463, 77, this.anInt947, 0);
            String var9;
            if (localPlayer != null && localPlayer.name != null) {
               var9 = localPlayer.name;
            } else {
               var9 = Class26.method252(this.username, (byte)7);
            }

            var1.method152(4, 0, 90, var9 + ":");
            var1.method152(var1.method150(var9 + ": ") + 6, 255, 90, this.aString29 + "*");
            Draw2D.drawHorizontalLine(0, 0, 77, 479);
         } else {
            this.drawInterface(0, 0, ComType.method87(this.anInt985), 0);
         }
      }

      if (this.menuVisible && this.anInt1039 == 2) {
         this.drawMenu();
      }

      this.aClass19_18.draw(357, 17, super.graphics);
      this.areaViewport.method130();
      Draw3D.lineOffset = this.anIntArray238;
   }

   private void method662(int var1) {
      this.aClass19_16.method130();
      int var2;
      int var3;
      if (this.anInt923 == 2) {
         byte[] var4 = this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16;
         int[] var5 = Draw2D.data;
         var2 = var4.length;

         for(var3 = 0; var3 < var2; ++var3) {
            if (var4[var3] == 0) {
               var5[var3] = 0;
            }
         }

         this.aClass10_Sub1_Sub1_Sub1_10.method82(0, 567, 33, 25, 33, this.anIntArray267, 0, this.orbitCameraYaw, 256, this.anIntArray261, 25);
         this.areaViewport.method130();
         Draw3D.lineOffset = this.anIntArray238;
      } else {
         int var14 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
         int var15 = localPlayer.x / 32 + 48;
         boolean var6 = false;
         var2 = 464 - localPlayer.z / 32;
         this.aClass10_Sub1_Sub1_Sub1_11.method82(5, 567, 151, var15, 146, this.anIntArray220, 25, var14, this.minimapZoom + 256, this.anIntArray241, var2);
         this.aClass10_Sub1_Sub1_Sub1_10.method82(0, 567, 33, 25, 33, this.anIntArray267, 0, this.orbitCameraYaw, 256, this.anIntArray261, 25);

         for(var3 = 0; var3 < this.anInt936; ++var3) {
            var15 = this.anIntArray246[var3] * 4 + 2 - localPlayer.x / 32;
            var2 = this.anIntArray247[var3] * 4 + 2 - localPlayer.z / 32;
            this.method705(var2, this.aClass10_Sub1_Sub1_Sub1Array9[var3], var15);
         }

         int var7;
         for(int var8 = 0; var8 < 104; ++var8) {
            for(var7 = 0; var7 < 104; ++var7) {
               Class6 var9 = this.levelObjStacks[this.currentLevel][var8][var7];
               if (var9 != null) {
                  var15 = var8 * 4 + 2 - localPlayer.x / 32;
                  var2 = var7 * 4 + 2 - localPlayer.z / 32;
                  this.method705(var2, this.aClass10_Sub1_Sub1_Sub1_12, var15);
               }
            }
         }

         for(var7 = 0; var7 < this.npcCount; ++var7) {
            NpcEntity var16 = this.npcs[this.anIntArray256[var7]];
            if (var16 != null && var16.isVisible()) {
               NpcType var18 = var16.type;
               if (var18.anIntArray165 != null) {
                  var18 = var18.method406();
               }

               if (var18 != null && var18.aBoolean142 && var18.aBoolean141) {
                  var15 = var16.x / 32 - localPlayer.x / 32;
                  var2 = var16.z / 32 - localPlayer.z / 32;
                  this.method705(var2, this.aClass10_Sub1_Sub1_Sub1_13, var15);
               }
            }
         }

         PlayerEntity var21;
         for(int var17 = 0; var17 < this.playerCount; ++var17) {
            var21 = this.players[this.anIntArray229[var17]];
            if (var21 != null && var21.isVisible()) {
               var15 = var21.x / 32 - localPlayer.x / 32;
               var2 = var21.z / 32 - localPlayer.z / 32;
               boolean var10 = false;
               long var11 = Class26.method248(var21.name);

               for(int var13 = 0; var13 < this.anInt838; ++var13) {
                  if (var11 == this.aLongArray4[var13] && this.anIntArray265[var13] != 0) {
                     var10 = true;
                     break;
                  }
               }

               boolean var20 = false;
               if (localPlayer.anInt773 != 0 && var21.anInt773 != 0 && localPlayer.anInt773 == var21.anInt773) {
                  var20 = true;
               }

               if (var10) {
                  this.method705(var2, this.aClass10_Sub1_Sub1_Sub1_15, var15);
               } else if (var20) {
                  this.method705(var2, this.aClass10_Sub1_Sub1_Sub1_16, var15);
               } else {
                  this.method705(var2, this.aClass10_Sub1_Sub1_Sub1_14, var15);
               }
            }
         }

         if (this.hintType != 0 && anInt1050 % 20 < 10) {
            if (this.hintType == 1 && this.anInt999 >= 0 && this.anInt999 < this.npcs.length) {
               NpcEntity var19 = this.npcs[this.anInt999];
               if (var19 != null) {
                  var15 = var19.x / 32 - localPlayer.x / 32;
                  var2 = var19.z / 32 - localPlayer.z / 32;
                  this.method630(var2, this.aClass10_Sub1_Sub1_Sub1_6, var15);
               }
            }

            if (this.hintType == 2) {
               var15 = (this.anInt828 - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
               var2 = (this.anInt829 - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
               this.method630(var2, this.aClass10_Sub1_Sub1_Sub1_6, var15);
            }

            if (this.hintType == 10 && this.anInt969 >= 0 && this.anInt969 < this.players.length) {
               var21 = this.players[this.anInt969];
               if (var21 != null) {
                  var15 = var21.x / 32 - localPlayer.x / 32;
                  var2 = var21.z / 32 - localPlayer.z / 32;
                  this.method630(var2, this.aClass10_Sub1_Sub1_Sub1_6, var15);
               }
            }
         }

         if (this.anInt955 != 0) {
            var15 = this.anInt955 * 4 + 2 - localPlayer.x / 32;
            var2 = this.anInt956 * 4 + 2 - localPlayer.z / 32;
            this.method705(var2, this.aClass10_Sub1_Sub1_Sub1_5, var15);
         }

         Draw2D.fillRect(3, 78, 16777215, 3, 97);
         this.areaViewport.method130();
         Draw3D.lineOffset = this.anIntArray238;
      }

   }

   private void method623(Packet var1, boolean var2, int var3) {
      this.ingame &= var2;
      this.anInt1034 = 0;
      this.anInt885 = 0;
      this.method621(var3, var1);
      this.method707(var1, var3);
      this.method637(var1, var3, 838);

      int var4;
      for(int var5 = 0; var5 < this.anInt1034; ++var5) {
         var4 = this.anIntArray269[var5];
         if (this.npcs[var4].anInt718 != anInt1050) {
            this.npcs[var4].type = null;
            this.npcs[var4] = null;
         }
      }

      if (var1.pos != var3) {
         signlink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + var1.pos + " psize:" + var3);
         throw new RuntimeException("eek");
      } else {
         for(var4 = 0; var4 < this.npcCount; ++var4) {
            if (this.npcs[this.anIntArray256[var4]] == null) {
               signlink.reporterror(this.username + " null entry in npc list - pos:" + var4 + " size:" + this.npcCount);
               throw new RuntimeException("eek");
            }
         }

      }
   }

   private void method629() {
      if (this.objDragArea == 0) {
         int var1 = super.anInt821;
         if (this.spellSelected == 1 && super.anInt822 >= 516 && super.anInt823 >= 160 && super.anInt822 <= 765 && super.anInt823 <= 205) {
            var1 = 0;
         }

         int var2;
         int var3;
         int var4;
         if (this.menuVisible) {
            if (var1 != 1) {
               var2 = super.mouseX;
               var3 = super.mouseY;
               if (this.anInt1039 == 0) {
                  var2 -= 4;
                  var3 -= 4;
               }

               if (this.anInt1039 == 1) {
                  var2 -= 553;
                  var3 -= 205;
               }

               if (this.anInt1039 == 2) {
                  var2 -= 17;
                  var3 -= 357;
               }

               if (var2 < this.anInt1040 - 10 || var2 > this.anInt1040 + this.anInt1042 + 10 || var3 < this.anInt1041 - 10 || var3 > this.anInt1041 + this.anInt1043 + 10) {
                  this.menuVisible = false;
                  if (this.anInt1039 == 1) {
                     this.aBoolean248 = true;
                  }

                  if (this.anInt1039 == 2) {
                     this.aBoolean255 = true;
                  }
               }
            }

            if (var1 == 1) {
               var2 = this.anInt1040;
               var3 = this.anInt1041;
               var4 = this.anInt1042;
               int var5 = super.anInt822;
               int var6 = super.anInt823;
               if (this.anInt1039 == 0) {
                  var5 -= 4;
                  var6 -= 4;
               }

               if (this.anInt1039 == 1) {
                  var5 -= 553;
                  var6 -= 205;
               }

               if (this.anInt1039 == 2) {
                  var5 -= 17;
                  var6 -= 357;
               }

               int var7 = -1;

               for(int var8 = 0; var8 < this.menuSize; ++var8) {
                  int var9 = var3 + (this.menuSize - 1 - var8) * 15 + 31;
                  if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
                     var7 = var8;
                  }
               }

               if (var7 != -1) {
                  this.method695(var7);
               }

               this.menuVisible = false;
               if (this.anInt1039 == 1) {
                  this.aBoolean248 = true;
               }

               if (this.anInt1039 == 2) {
                  this.aBoolean255 = true;
                  return;
               }
            }
         } else {
            if (var1 == 1 && this.menuSize > 0) {
               var2 = this.menuAction[this.menuSize - 1];
               if (var2 == 9 || var2 == 225 || var2 == 444 || var2 == 564 || var2 == 894 || var2 == 961 || var2 == 399 || var2 == 324 || var2 == 227 || var2 == 891 || var2 == 52 || var2 == 1094) {
                  var3 = this.anIntArray231[this.menuSize - 1];
                  var4 = this.anIntArray232[this.menuSize - 1];
                  ComType var10 = ComType.method87(var4);
                  if (var10.aBoolean41 || var10.aBoolean32) {
                     this.aBoolean246 = false;
                     this.anInt1022 = 0;
                     this.anInt948 = var4;
                     this.anInt949 = var3;
                     this.objDragArea = 2;
                     this.anInt951 = super.anInt822;
                     this.anInt952 = super.anInt823;
                     if (ComType.method87(var4).anInt128 == this.viewportInterfaceId) {
                        this.objDragArea = 1;
                     }

                     if (ComType.method87(var4).anInt128 == this.anInt888) {
                        this.objDragArea = 3;
                     }

                     return;
                  }
               }
            }

            if (var1 == 1 && (this.anInt1036 == 1 || this.method701(this.menuSize - 1, this.aByte51)) && this.menuSize > 2) {
               var1 = 2;
            }

            if (var1 == 1 && this.menuSize > 0) {
               this.method695(this.menuSize - 1);
            }

            if (var1 != 2 || this.menuSize <= 0) {
               return;
            }

            this.method683();
         }
      }

   }

   private void method671(int var1, int var2, Packet var3) {
      this.anInt1034 = 0;
      this.anInt885 = 0;
      this.method616(var1, this.aBoolean261, var3);
      this.method689(var1, var3);
      boolean var4 = false;
      this.method591(var1, (byte)6, var3);
      this.method615(808, var3, var1);

      int var5;
      for(int var6 = 0; var6 < this.anInt1034; ++var6) {
         var5 = this.anIntArray269[var6];
         if (this.players[var5].anInt718 != anInt1050) {
            this.players[var5] = null;
         }
      }

      if (var3.pos != var1) {
         signlink.reporterror("Error packet size mismatch in getplayer pos:" + var3.pos + " psize:" + var1);
         throw new RuntimeException("eek");
      } else {
         for(var5 = 0; var5 < this.playerCount; ++var5) {
            if (this.players[this.anIntArray229[var5]] == null) {
               signlink.reporterror(this.username + " null entry in pl list - pos:" + var5 + " size:" + this.playerCount);
               throw new RuntimeException("eek");
            }
         }

      }
   }

   private void method721() {
      if (this.anInt923 == 0 && super.anInt821 == 1) {
         int var1 = super.anInt822 - 25 - 550;
         int var2 = super.anInt823 - 5 - 4;
         if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
            var1 -= 73;
            var2 -= 75;
            int var3 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
            int var4 = Draw3D.anIntArray181[var3];
            int var5 = Draw3D.anIntArray182[var3];
            int var6 = var4 * (this.minimapZoom + 256) >> 8;
            int var7 = var5 * (this.minimapZoom + 256) >> 8;
            int var8 = var2 * var6 + var1 * var7 >> 11;
            int var9 = var2 * var7 - var1 * var6 >> 11;
            int var10 = localPlayer.x + var8 >> 7;
            int var11 = localPlayer.z - var9 >> 7;
            boolean var12 = this.method610(true, var11, localPlayer.anIntArray194[0], 0, 0, 1, 0, var10, 0, 0, localPlayer.anIntArray193[0]);
            if (var12) {
               this.out.p1(var1);
               this.out.p1(var2);
               this.out.p2(this.orbitCameraYaw);
               this.out.p1(57);
               this.out.p1(this.minimapAnticheatAngle);
               this.out.p1(this.minimapZoom);
               this.out.p1(89);
               this.out.p2(localPlayer.x);
               this.out.p2(localPlayer.z);
               this.out.p1(this.anInt957);
               this.out.p1(63);
               return;
            }
         }
      }

   }

   private void method596() {
      if (super.anInt821 == 1) {
         if (super.anInt822 >= 539 && super.anInt822 <= 573 && super.anInt823 >= 169 && super.anInt823 < 205 && this.anIntArray248[0] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 0;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 569 && super.anInt822 <= 599 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[1] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 1;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 597 && super.anInt822 <= 627 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[2] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 2;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 625 && super.anInt822 <= 669 && super.anInt823 >= 168 && super.anInt823 < 203 && this.anIntArray248[3] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 3;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 666 && super.anInt822 <= 696 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[4] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 4;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 694 && super.anInt822 <= 724 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[5] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 5;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 722 && super.anInt822 <= 756 && super.anInt823 >= 169 && super.anInt823 < 205 && this.anIntArray248[6] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 6;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 540 && super.anInt822 <= 574 && super.anInt823 >= 466 && super.anInt823 < 502 && this.anIntArray248[7] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 7;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 572 && super.anInt822 <= 602 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[8] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 8;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 599 && super.anInt822 <= 629 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[9] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 9;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 627 && super.anInt822 <= 671 && super.anInt823 >= 467 && super.anInt823 < 502 && this.anIntArray248[10] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 10;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 669 && super.anInt822 <= 699 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[11] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 11;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 696 && super.anInt822 <= 726 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[12] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 12;
            this.aBoolean225 = true;
         }

         if (super.anInt822 >= 724 && super.anInt822 <= 758 && super.anInt823 >= 466 && super.anInt823 < 502 && this.anIntArray248[13] != -1) {
            this.aBoolean248 = true;
            this.anInt1031 = 13;
            this.aBoolean225 = true;
            return;
         }
      }

   }

   private void method614() {
      if (super.anInt821 == 1) {
         if (super.anInt822 >= 6 && super.anInt822 <= 106 && super.anInt823 >= 467 && super.anInt823 <= 499) {
            this.publicChatSetting = (this.publicChatSetting + 1) % 4;
            this.aBoolean253 = true;
            this.aBoolean255 = true;
            this.out.p1isaac(176);
            this.out.p1(this.publicChatSetting);
            this.out.p1(this.anInt853);
            this.out.p1(this.anInt1000);
         }

         if (super.anInt822 >= 135 && super.anInt822 <= 235 && super.anInt823 >= 467 && super.anInt823 <= 499) {
            this.anInt853 = (this.anInt853 + 1) % 3;
            this.aBoolean253 = true;
            this.aBoolean255 = true;
            this.out.p1isaac(176);
            this.out.p1(this.publicChatSetting);
            this.out.p1(this.anInt853);
            this.out.p1(this.anInt1000);
         }

         if (super.anInt822 >= 273 && super.anInt822 <= 373 && super.anInt823 >= 467 && super.anInt823 <= 499) {
            this.anInt1000 = (this.anInt1000 + 1) % 3;
            this.aBoolean253 = true;
            this.aBoolean255 = true;
            this.out.p1isaac(176);
            this.out.p1(this.publicChatSetting);
            this.out.p1(this.anInt853);
            this.out.p1(this.anInt1000);
         }

         if (super.anInt822 >= 412 && super.anInt822 <= 512 && super.anInt823 >= 467 && super.anInt823 <= 499) {
            if (this.viewportInterfaceId == -1) {
               this.method590();
               this.aString17 = "";
               this.aBoolean241 = false;
               this.anInt1002 = this.viewportInterfaceId = ComType.anInt127;
            } else {
               this.method622("", "Please close the interface you have open before using 'report abuse'", 0);
            }
         }

         ++anInt972;
         if (anInt972 > 161) {
            anInt972 = 0;
            this.out.p1isaac(22);
            this.out.p2(38304);
            return;
         }
      }

   }

   private void method597(int var1) {
      boolean var2 = false;

      try {
         int var3 = localPlayer.x + this.cameraAnticheatOffsetX;
         int var4 = localPlayer.z + this.cameraAnticheatOffsetZ;
         if (this.anInt1019 - var3 < -500 || this.anInt1019 - var3 > 500 || this.anInt1020 - var4 < -500 || this.anInt1020 - var4 > 500) {
            this.anInt1019 = var3;
            this.anInt1020 = var4;
         }

         if (this.anInt1019 != var3) {
            this.anInt1019 += (var3 - this.anInt1019) / 16;
         }

         if (this.anInt1020 != var4) {
            this.anInt1020 += (var4 - this.anInt1020) / 16;
         }

         if (super.actionKey[1] == 1) {
            this.anInt1014 += (-this.anInt1014 - 24) / 2;
         } else if (super.actionKey[2] == 1) {
            this.anInt1014 += (24 - this.anInt1014) / 2;
         } else {
            this.anInt1014 /= 2;
         }

         if (super.actionKey[3] == 1) {
            this.anInt1015 += (12 - this.anInt1015) / 2;
         } else if (super.actionKey[4] == 1) {
            this.anInt1015 += (-this.anInt1015 - 12) / 2;
         } else {
            this.anInt1015 /= 2;
         }

         this.orbitCameraYaw = this.orbitCameraYaw + this.anInt1014 / 2 & 2047;
         this.anInt1012 += this.anInt1015 / 2;
         if (this.anInt1012 < 128) {
            this.anInt1012 = 128;
         }

         if (this.anInt1012 > 383) {
            this.anInt1012 = 383;
         }

         int var5 = this.anInt1019 >> 7;
         int var6 = this.anInt1020 >> 7;
         int var7 = this.getHeightmapY(this.anInt1020, this.anInt1019, this.currentLevel);
         int var8 = 0;
         int var9;
         if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
            for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
               for(int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                  int var11 = this.currentLevel;
                  if (var11 < 3 && (this.aByteArrayArrayArray8[1][var9][var10] & 2) == 2) {
                     ++var11;
                  }

                  int var12 = var7 - this.anIntArrayArrayArray8[var11][var9][var10];
                  if (var12 > var8) {
                     var8 = var12;
                  }
               }
            }
         }

         var9 = var8 * 192;
         if (var9 > 98048) {
            var9 = 98048;
         }

         if (var9 < 32768) {
            var9 = 32768;
         }

         if (var9 > this.anInt1033) {
            this.anInt1033 += (var9 - this.anInt1033) / 24;
         } else if (var9 < this.anInt1033) {
            this.anInt1033 += (var9 - this.anInt1033) / 80;
         }

      } catch (Exception var14) {
         signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.anInt1019 + "," + this.anInt1020 + "," + this.anInt854 + "," + this.anInt855 + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
         throw new RuntimeException("eek");
      }
   }

   private void method604(boolean var1) {
      int var2 = this.anInt848 * 128 + 64;
      int var3 = this.anInt849 * 128 + 64;
      int var4 = this.getHeightmapY(var3, var2, this.currentLevel) - this.anInt850;
      if (this.cameraX < var2) {
         this.cameraX += this.anInt851 + (var2 - this.cameraX) * this.anInt852 / 1000;
         if (this.cameraX > var2) {
            this.cameraX = var2;
         }
      }

      if (this.cameraX > var2) {
         this.cameraX -= this.anInt851 + (this.cameraX - var2) * this.anInt852 / 1000;
         if (this.cameraX < var2) {
            this.cameraX = var2;
         }
      }

      if (this.cameraY < var4) {
         this.cameraY += this.anInt851 + (var4 - this.cameraY) * this.anInt852 / 1000;
         if (this.cameraY > var4) {
            this.cameraY = var4;
         }
      }

      if (this.cameraY > var4) {
         this.cameraY -= this.anInt851 + (this.cameraY - var4) * this.anInt852 / 1000;
         if (this.cameraY < var4) {
            this.cameraY = var4;
         }
      }

      if (this.cameraZ < var3) {
         this.cameraZ += this.anInt851 + (var3 - this.cameraZ) * this.anInt852 / 1000;
         if (this.cameraZ > var3) {
            this.cameraZ = var3;
         }
      }

      if (this.cameraZ > var3) {
         this.cameraZ -= this.anInt851 + (this.cameraZ - var3) * this.anInt852 / 1000;
         if (this.cameraZ < var3) {
            this.cameraZ = var3;
         }
      }

      var2 = this.anInt892 * 128 + 64;
      var3 = this.anInt893 * 128 + 64;
      var4 = this.getHeightmapY(var3, var2, this.currentLevel) - this.anInt894;
      int var5 = var2 - this.cameraX;
      int var6 = var4 - this.cameraY;
      int var7 = var3 - this.cameraZ;
      int var8 = (int)Math.sqrt((double)(var5 * var5 + var7 * var7));
      int var9 = (int)(Math.atan2((double)var6, (double)var8) * 325.949) & 2047;
      int var10;
      if (!var1) {
         for(var10 = 1; var10 > 0; ++var10) {
         }
      }

      var10 = (int)(Math.atan2((double)var5, (double)var7) * -325.949) & 2047;
      if (var9 < 128) {
         var9 = 128;
      }

      if (var9 > 383) {
         var9 = 383;
      }

      if (this.cameraPitch < var9) {
         this.cameraPitch += this.anInt895 + (var9 - this.cameraPitch) * this.anInt896 / 1000;
         if (this.cameraPitch > var9) {
            this.cameraPitch = var9;
         }
      }

      if (this.cameraPitch > var9) {
         this.cameraPitch -= this.anInt895 + (this.cameraPitch - var9) * this.anInt896 / 1000;
         if (this.cameraPitch < var9) {
            this.cameraPitch = var9;
         }
      }

      int var11 = var10 - this.cameraYaw;
      if (var11 > 1024) {
         var11 -= 2048;
      }

      if (var11 < -1024) {
         var11 += 2048;
      }

      if (var11 > 0) {
         this.cameraYaw += this.anInt895 + var11 * this.anInt896 / 1000;
         this.cameraYaw &= 2047;
      }

      if (var11 < 0) {
         this.cameraYaw -= this.anInt895 + -var11 * this.anInt896 / 1000;
         this.cameraYaw &= 2047;
      }

      int var12 = var10 - this.cameraYaw;
      if (var12 > 1024) {
         var12 -= 2048;
      }

      if (var12 < -1024) {
         var12 += 2048;
      }

      if (var12 < 0 && var11 > 0 || var12 > 0 && var11 < 0) {
         this.cameraYaw = var10;
      }

   }

   private void method605(byte var1) {
      boolean var2 = false;

      while(true) {
         int var3;
         do {
            while(true) {
               var3 = this.pollKey();
               if (var3 == -1) {
                  return;
               }

               if (this.viewportInterfaceId != -1 && this.viewportInterfaceId == this.anInt1002) {
                  if (var3 == 8 && this.aString17.length() > 0) {
                     this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
                  }
                  break;
               }

               int var4;
               if (this.aBoolean216) {
                  if (var3 >= 32 && var3 <= 122 && this.aString24.length() < 80) {
                     this.aString24 = this.aString24 + (char)var3;
                     this.aBoolean255 = true;
                  }

                  if (var3 == 8 && this.aString24.length() > 0) {
                     this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
                     this.aBoolean255 = true;
                  }

                  if (var3 == 13 || var3 == 10) {
                     this.aBoolean216 = false;
                     this.aBoolean255 = true;
                     long var5;
                     if (this.anInt995 == 1) {
                        var5 = Class26.method248(this.aString24);
                        this.method677(var5);
                     }

                     if (this.anInt995 == 2 && this.anInt838 > 0) {
                        var5 = Class26.method248(this.aString24);
                        this.method628(var5);
                     }

                     if (this.anInt995 == 3 && this.aString24.length() > 0) {
                        this.out.p1isaac(227);
                        this.out.p1(0);
                        var4 = this.out.pos;
                        this.out.p8(this.aLong31);
                        WordPack.pack(this.aString24, this.out);
                        this.out.psize1(this.out.pos - var4);
                        this.aString24 = WordPack.method373(this.aString24);
                        this.aString24 = WordFilter.method452(this.aString24);
                        this.method622(Class26.method252(Class26.method249(this.aLong31), (byte)7), this.aString24, 6);
                        if (this.anInt853 == 2) {
                           this.anInt853 = 1;
                           this.aBoolean253 = true;
                           this.out.p1isaac(176);
                           this.out.p1(this.publicChatSetting);
                           this.out.p1(this.anInt853);
                           this.out.p1(this.anInt1000);
                        }
                     }

                     if (this.anInt995 == 4 && this.anInt837 < 100) {
                        var5 = Class26.method248(this.aString24);
                        this.method665(this.anInt971, var5);
                     }

                     if (this.anInt995 == 5 && this.anInt837 > 0) {
                        var5 = Class26.method248(this.aString24);
                        this.method672(325, var5);
                     }
                  }
               } else if (this.anInt1010 == 1) {
                  if (var3 >= 48 && var3 <= 57 && this.aString20.length() < 10) {
                     this.aString20 = this.aString20 + (char)var3;
                     this.aBoolean255 = true;
                  }

                  if (var3 == 8 && this.aString20.length() > 0) {
                     this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
                     this.aBoolean255 = true;
                  }

                  if (var3 == 13 || var3 == 10) {
                     if (this.aString20.length() > 0) {
                        var4 = 0;

                        try {
                           var4 = Integer.parseInt(this.aString20);
                        } catch (Exception var11) {
                        }

                        this.out.p1isaac(75);
                        this.out.p4(var4);
                     }

                     this.anInt1010 = 0;
                     this.aBoolean255 = true;
                  }
               } else if (this.anInt1010 == 2) {
                  if (var3 >= 32 && var3 <= 122 && this.aString20.length() < 12) {
                     this.aString20 = this.aString20 + (char)var3;
                     this.aBoolean255 = true;
                  }

                  if (var3 == 8 && this.aString20.length() > 0) {
                     this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
                     this.aBoolean255 = true;
                  }

                  if (var3 == 13 || var3 == 10) {
                     if (this.aString20.length() > 0) {
                        this.out.p1isaac(206);
                        this.out.p8(Class26.method248(this.aString20));
                     }

                     this.anInt1010 = 0;
                     this.aBoolean255 = true;
                  }
               } else if (this.anInt1010 == 3) {
                  if (var3 >= 32 && var3 <= 122 && this.aString20.length() < 40) {
                     this.aString20 = this.aString20 + (char)var3;
                     this.aBoolean255 = true;
                  }

                  if (var3 == 8 && this.aString20.length() > 0) {
                     this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
                     this.aBoolean255 = true;
                  }
               } else if (this.anInt888 == -1 && this.anInt926 == -1) {
                  if (var3 >= 32 && var3 <= 122 && this.aString29.length() < 80) {
                     this.aString29 = this.aString29 + (char)var3;
                     this.aBoolean255 = true;
                  }

                  if (var3 == 8 && this.aString29.length() > 0) {
                     this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
                     this.aBoolean255 = true;
                  }

                  if ((var3 == 13 || var3 == 10) && this.aString29.length() > 0) {
                     if (this.anInt842 == 2) {
                        if (this.aString29.equals("::clientdrop")) {
                           this.tryReconnect();
                        }

                        if (this.aString29.equals("::lag")) {
                           this.printDebug();
                        }

                        if (this.aString29.equals("::prefetchmusic")) {
                           for(var4 = 0; var4 < this.aClass33_Sub1_1.method569(2); ++var4) {
                              this.aClass33_Sub1_1.method556(2, (byte)1, var4);
                           }
                        }

                        if (this.aString29.equals("::fpson")) {
                           aBoolean217 = true;
                        }

                        if (this.aString29.equals("::fpsoff")) {
                           aBoolean217 = false;
                        }

                        if (this.aString29.equals("::noclip")) {
                           for(var4 = 0; var4 < 4; ++var4) {
                              for(int var10 = 1; var10 < 103; ++var10) {
                                 for(int var6 = 1; var6 < 103; ++var6) {
                                    this.levelCollisionMap[var4].anIntArrayArray16[var10][var6] = 0;
                                 }
                              }
                           }
                        }
                     }

                     if (this.aString29.startsWith("::")) {
                        this.out.p1isaac(56);
                        this.out.p1(this.aString29.length() - 1);
                        this.out.pjstr(this.aString29.substring(2));
                     } else {
                        String var9 = this.aString29.toLowerCase();
                        byte var12 = 0;
                        if (var9.startsWith("yellow:")) {
                           var12 = 0;
                           this.aString29 = this.aString29.substring(7);
                        } else if (var9.startsWith("red:")) {
                           var12 = 1;
                           this.aString29 = this.aString29.substring(4);
                        } else if (var9.startsWith("green:")) {
                           var12 = 2;
                           this.aString29 = this.aString29.substring(6);
                        } else if (var9.startsWith("cyan:")) {
                           var12 = 3;
                           this.aString29 = this.aString29.substring(5);
                        } else if (var9.startsWith("purple:")) {
                           var12 = 4;
                           this.aString29 = this.aString29.substring(7);
                        } else if (var9.startsWith("white:")) {
                           var12 = 5;
                           this.aString29 = this.aString29.substring(6);
                        } else if (var9.startsWith("flash1:")) {
                           var12 = 6;
                           this.aString29 = this.aString29.substring(7);
                        } else if (var9.startsWith("flash2:")) {
                           var12 = 7;
                           this.aString29 = this.aString29.substring(7);
                        } else if (var9.startsWith("flash3:")) {
                           var12 = 8;
                           this.aString29 = this.aString29.substring(7);
                        } else if (var9.startsWith("glow1:")) {
                           var12 = 9;
                           this.aString29 = this.aString29.substring(6);
                        } else if (var9.startsWith("glow2:")) {
                           var12 = 10;
                           this.aString29 = this.aString29.substring(6);
                        } else if (var9.startsWith("glow3:")) {
                           var12 = 11;
                           this.aString29 = this.aString29.substring(6);
                        }

                        var9 = this.aString29.toLowerCase();
                        byte var7 = 0;
                        if (var9.startsWith("wave:")) {
                           var7 = 1;
                           this.aString29 = this.aString29.substring(5);
                        } else if (var9.startsWith("wave2:")) {
                           var7 = 2;
                           this.aString29 = this.aString29.substring(6);
                        } else if (var9.startsWith("shake:")) {
                           var7 = 3;
                           this.aString29 = this.aString29.substring(6);
                        } else if (var9.startsWith("scroll:")) {
                           var7 = 4;
                           this.aString29 = this.aString29.substring(7);
                        } else if (var9.startsWith("slide:")) {
                           var7 = 5;
                           this.aString29 = this.aString29.substring(6);
                        }

                        this.out.p1isaac(49);
                        this.out.p1(0);
                        int var8 = this.out.pos;
                        this.out.method328(var12);
                        this.out.method327(var7);
                        this.aClass10_Sub1_Sub3_8.pos = 0;
                        WordPack.pack(this.aString29, this.aClass10_Sub1_Sub3_8);
                        this.out.pdata(this.aClass10_Sub1_Sub3_8.data, this.aClass10_Sub1_Sub3_8.pos);
                        this.out.psize1(this.out.pos - var8);
                        this.aString29 = WordPack.method373(this.aString29);
                        this.aString29 = WordFilter.method452(this.aString29);
                        localPlayer.aString13 = this.aString29;
                        localPlayer.anInt716 = var12;
                        localPlayer.anInt722 = var7;
                        localPlayer.anInt715 = 150;
                        if (this.anInt842 == 2) {
                           this.method622("@cr2@" + localPlayer.name, localPlayer.aString13, 2);
                        } else if (this.anInt842 == 1) {
                           this.method622("@cr1@" + localPlayer.name, localPlayer.aString13, 2);
                        } else {
                           this.method622(localPlayer.name, localPlayer.aString13, 2);
                        }

                        if (this.publicChatSetting == 2) {
                           this.publicChatSetting = 3;
                           this.aBoolean253 = true;
                           this.out.p1isaac(176);
                           this.out.p1(this.publicChatSetting);
                           this.out.p1(this.anInt853);
                           this.out.p1(this.anInt1000);
                        }
                     }

                     this.aString29 = "";
                     this.aBoolean255 = true;
                  }
               }
            }
         } while((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);

         if (this.aString17.length() < 12) {
            this.aString17 = this.aString17 + (char)var3;
         }
      }
   }

   private boolean method635(ComType var1) {
      int var2 = var1.clientCode;
      if (this.anInt839 == 2) {
         if (var2 == 201) {
            this.aBoolean255 = true;
            this.anInt1010 = 0;
            this.aBoolean216 = true;
            this.aString24 = "";
            this.anInt995 = 1;
            this.aString19 = "Enter name of friend to add to list";
         }

         if (var2 == 202) {
            this.aBoolean255 = true;
            this.anInt1010 = 0;
            this.aBoolean216 = true;
            this.aString24 = "";
            this.anInt995 = 2;
            this.aString19 = "Enter name of friend to delete from list";
         }
      }

      if (var2 == 205) {
         this.idleTimeout = 250;
         return true;
      } else {
         if (var2 == 501) {
            this.aBoolean255 = true;
            this.anInt1010 = 0;
            this.aBoolean216 = true;
            this.aString24 = "";
            this.anInt995 = 4;
            this.aString19 = "Enter name of player to add to list";
         }

         if (var2 == 502) {
            this.aBoolean255 = true;
            this.anInt1010 = 0;
            this.aBoolean216 = true;
            this.aString24 = "";
            this.anInt995 = 5;
            this.aString19 = "Enter name of player to delete from list";
         }

         int var3;
         int var4;
         int var5;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            var5 = this.anIntArray276[var3];
            if (var5 != -1) {
               while(true) {
                  if (var4 == 0) {
                     --var5;
                     if (var5 < 0) {
                        var5 = IdkType.count - 1;
                     }
                  }

                  if (var4 == 1) {
                     ++var5;
                     if (var5 >= IdkType.count) {
                        var5 = 0;
                     }
                  }

                  if (!IdkType.instances[var5].disable && IdkType.instances[var5].type == var3 + (this.aBoolean245 ? 0 : 7)) {
                     this.anIntArray276[var3] = var5;
                     this.aBoolean263 = true;
                     break;
                  }
               }
            }
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            var5 = this.designColors[var3];
            if (var4 == 0) {
               --var5;
               if (var5 < 0) {
                  var5 = anIntArrayArray24[var3].length - 1;
               }
            }

            if (var4 == 1) {
               ++var5;
               if (var5 >= anIntArrayArray24[var3].length) {
                  var5 = 0;
               }
            }

            this.designColors[var3] = var5;
            this.aBoolean263 = true;
         }

         if (var2 == 324 && !this.aBoolean245) {
            this.aBoolean245 = true;
            this.validateCharacterDesign(this.anInt905);
         }

         if (var2 == 325 && this.aBoolean245) {
            this.aBoolean245 = false;
            this.validateCharacterDesign(this.anInt905);
         }

         if (var2 != 326) {
            if (var2 == 620) {
               this.aBoolean241 = !this.aBoolean241;
            }

            if (var2 >= 601 && var2 <= 613) {
               this.method590();
               if (this.aString17.length() > 0) {
                  this.out.p1isaac(184);
                  this.out.p8(Class26.method248(this.aString17));
                  this.out.p1(var2 - 601);
                  this.out.p1(this.aBoolean241 ? 1 : 0);
               }
            }

            return false;
         } else {
            this.out.p1isaac(163);
            this.out.p1(this.aBoolean245 ? 0 : 1);

            for(var3 = 0; var3 < 7; ++var3) {
               this.out.p1(this.anIntArray276[var3]);
            }

            for(var4 = 0; var4 < 5; ++var4) {
               this.out.p1(this.designColors[var4]);
            }

            return true;
         }
      }
   }

   public void init() {
      client = this;
      nodeId = Integer.parseInt(this.getParameter("nodeid"));
      portOffset = Integer.parseInt(this.getParameter("portoff"));
      String var1 = this.getParameter("lowmem");
      if (var1 != null && var1.equals("1")) {
         setLowMemory();
      } else {
         setHighMemory();
      }

      String var2 = this.getParameter("free");
      if (var2 != null && var2.equals("1")) {
         members = false;
      } else {
         members = true;
      }

      this.initApplet();
   }

   public void run() {
      if (this.aBoolean266) {
         this.method592((byte)4);
      } else {
         super.run();
      }
   }

   private static String method667(int var0, int var1) {
      int var2 = var1 - var0;
      if (var2 < -9) {
         return "@red@";
      } else if (var2 < -6) {
         return "@or3@";
      } else if (var2 < -3) {
         return "@or2@";
      } else if (var2 < 0) {
         return "@or1@";
      } else if (var2 > 9) {
         return "@gre@";
      } else if (var2 > 6) {
         return "@gr3@";
      } else if (var2 > 3) {
         return "@gr2@";
      } else {
         return var2 > 0 ? "@gr1@" : "@yel@";
      }
   }

   private static void setLowMemory() {
      World3D.aBoolean93 = true;
      Draw3D.aBoolean176 = true;
      lowMemory = true;
      World.aBoolean15 = true;
      LocType.aBoolean183 = true;
   }

   private static void setHighMemory() {
      World3D.aBoolean93 = false;
      Draw3D.aBoolean176 = false;
      lowMemory = false;
      World.aBoolean15 = false;
      LocType.aBoolean183 = false;
   }

   private static String method710(int var0) {
      String var1 = String.valueOf(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 8) {
         var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
      } else if (var1.length() > 4) {
         var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
      }

      return " " + var1;
   }

   private static String method595(int var0) {
      if (var0 < 100000) {
         return String.valueOf(var0);
      } else {
         return var0 < 10000000 ? var0 / 1000 + "K" : var0 / 1000000 + "M";
      }
   }

   public static void main(String[] var0) {
      try {
         System.out.println("RS2 user client - release #377");
         if (var0.length == 5) {
            nodeId = Integer.parseInt(var0[0]);
            portOffset = Integer.parseInt(var0[1]);
            if (var0[2].equals("lowmem")) {
               setLowMemory();
            } else {
               if (!var0[2].equals("highmem")) {
                  System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                  return;
               }

               setHighMemory();
            }

            if (var0[3].equals("free")) {
               members = false;
            } else {
               if (!var0[3].equals("members")) {
                  System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                  return;
               }

               members = true;
            }

            signlink.storeId = Integer.parseInt(var0[4]);
            signlink.startpriv(InetAddress.getLocalHost());
            client = new Client();
            client.initApplication();
         } else {
            System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
         }
      } catch (Exception var2) {
      }

   }
}
