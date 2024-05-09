public final class ComType {
   private static int anInt144;
   public static int anInt127 = -1;
   private static ComType[] aClass14Array1;
   private static LruCache aClass34_2 = new LruCache(30);
   private static int anInt133 = -1;
   private static int anInt125;
   private static boolean aBoolean38;
   private static byte[][] aByteArrayArray2;
   private static int anInt141 = -291;
   private static int anInt142 = -1;
   private static boolean aBoolean42 = true;
   private static int anInt143 = 373;
   private static Jagfile aClass2_1;
   private static LruCache aClass34_1;
   private static PixFont[] aClass10_Sub1_Sub1_Sub2Array1;
   public int[] anIntArray45;
   public int[][] anIntArrayArray5;
   public int clientCode;
   public int type;
   public int[] anIntArray44;
   private int anInt140 = -68;
   public int[] childId;
   private boolean aBoolean39 = true;
   public boolean hide;
   private int anInt138;
   public int anInt145;
   private int anInt139;
   public int anInt146;
   public int[] anIntArray42;
   public String aString2;
   public int id;
   public int[] anIntArray40;
   public int anInt150;
   public int anInt123;
   public int height;
   public int anInt128;
   public int anInt130;
   public int scrollPosition;
   public int seqFrame;
   public int scroll;
   public Pix24 aClass10_Sub1_Sub1_Sub1_1;
   public int anInt148;
   public int seqCycle;
   public int[] childX;
   public int anInt149;
   public int anInt131;
   public Pix24 aClass10_Sub1_Sub1_Sub1_2;
   public int[] childY;
   public int anInt112;
   public int anInt122;
   public int x;
   public int y;
   public int anInt132;
   public boolean aBoolean41;
   public int anInt136;
   public boolean aBoolean32;
   public PixFont aClass10_Sub1_Sub1_Sub2_1;
   public int anInt137;
   public int anInt126;
   public int[] anIntArray39;
   public int anInt135;
   public int[] anIntArray38;
   public int anInt115;
   public byte aByte9;
   public String aString3;
   public Pix24[] aClass10_Sub1_Sub1_Sub1Array1;
   public boolean aBoolean36;
   public int anInt129;
   public String aString5;
   public String aString4;
   public String aString1;
   public boolean aBoolean40;
   public boolean aBoolean37;
   public boolean aBoolean34;
   public boolean aBoolean43;
   public String[] aStringArray1;
   private int anInt114;
   private boolean aBoolean35;
   public int anInt113;

   private Model method89(int var1, int var2) {
      ObjType var3 = null;
      if (var1 == 4) {
         var3 = ObjType.method104(var2);
         anInt144 += var3.anInt187;
         anInt125 += var3.anInt191;
      }

      Model var4 = (Model)aClass34_2.get((long)((var1 << 16) + var2));
      if (var4 != null) {
         return var4;
      } else {
         if (var1 == 1) {
            var4 = Model.createModel(var2);
         }

         if (var1 == 2) {
            var4 = NpcType.method407(var2).method402();
         }

         if (var1 == 3) {
            var4 = Client.localPlayer.getHeadModel();
         }

         if (var1 == 4) {
            var4 = var3.method109(this.anInt140, 50);
         }

         if (var1 == 5) {
            var4 = null;
         }

         if (var4 != null) {
            aClass34_2.put(var4, (long)((var1 << 16) + var2));
         }

         return var4;
      }
   }

   public Model method95(int var1, int var2, boolean var3) {
      anInt144 = 64;
      anInt125 = 768;
      Model var4;
      if (var3) {
         var4 = this.method89(this.anInt138, this.anInt139);
      } else {
         var4 = this.method89(this.anInt145, this.anInt146);
      }

      if (var4 == null) {
         return null;
      } else if (var1 == -1 && var2 == -1 && var4.anIntArray125 == null) {
         return var4;
      } else {
         Model var5 = new Model(false, false, true, var4, Class22.method169(this.aBoolean39, var1) & Class22.method169(this.aBoolean39, var2));
         if (var1 != -1 || var2 != -1) {
            var5.method278();
         }

         if (var1 != -1) {
            var5.method279(var1, (byte)6);
         }

         if (var2 != -1) {
            var5.method279(var2, (byte)6);
         }

         var5.method288(anInt144, anInt125, -50, -10, -50, true);
         return var5;
      }
   }

   public void method88(int var1, int var2) {
      int var3 = this.anIntArray44[var2];
      this.anIntArray44[var2] = this.anIntArray44[var1];
      this.anIntArray44[var1] = var3;
      int var4 = this.anIntArray40[var2];
      this.anIntArray40[var2] = this.anIntArray40[var1];
      this.anIntArray40[var1] = var4;
   }

   public static ComType method87(int var0) {
      if (aClass14Array1[var0] == null) {
         Packet var1 = new Packet(aByteArrayArray2[var0]);
         int var2 = var1.g2();
         aClass14Array1[var0] = method90(var2, var1, var0);
      }

      return aClass14Array1[var0];
   }

   public static void resetInterface(int var1) {
      if (var1 != -1) {
         for(int var2 = 0; var2 < aClass14Array1.length; ++var2) {
            if (aClass14Array1[var2] != null && aClass14Array1[var2].anInt128 == var1 && aClass14Array1[var2].type != 2) {
               aClass14Array1[var2] = null;
            }
         }
      }
   }

   private static ComType method90(int var0, Packet var1, int var2) {
      ComType var3 = new ComType();
      var3.id = var2;
      var3.anInt128 = var0;
      var3.type = var1.g1();
      var3.anInt150 = var1.g1();
      var3.clientCode = var1.g2();
      var3.anInt123 = var1.g2();
      var3.height = var1.g2();
      var3.aByte9 = (byte)var1.g1();
      var3.anInt132 = var1.g1();
      if (var3.anInt132 == 0) {
         var3.anInt132 = -1;
      } else {
         var3.anInt132 = (var3.anInt132 - 1 << 8) + var1.g1();
      }

      if (var3.clientCode == 600) {
         anInt127 = var0;
      }

      if (var3.clientCode == 650) {
         anInt133 = var0;
      }

      if (var3.clientCode == 655) {
         anInt142 = var0;
      }

      int var4 = var1.g1();
      int var5;
      if (var4 > 0) {
         var3.anIntArray45 = new int[var4];
         var3.anIntArray42 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            var3.anIntArray45[var5] = var1.g1();
            var3.anIntArray42[var5] = var1.g2();
         }
      }

      var5 = var1.g1();
      int var6;
      int var7;
      int var8;
      if (var5 > 0) {
         var3.anIntArrayArray5 = new int[var5][];

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = var1.g2();
            var3.anIntArrayArray5[var6] = new int[var7];

            for(var8 = 0; var8 < var7; ++var8) {
               var3.anIntArrayArray5[var6][var8] = var1.g2();
            }
         }
      }

      if (var3.type == 0) {
         var3.scroll = var1.g2();
         var3.hide = var1.g1() == 1;
         var6 = var1.g2();
         var3.childId = new int[var6];
         var3.childX = new int[var6];
         var3.childY = new int[var6];

         for(var7 = 0; var7 < var6; ++var7) {
            var3.childId[var7] = var1.g2();
            var3.childX[var7] = var1.g2b();
            var3.childY[var7] = var1.g2b();
         }
      }

      if (var3.type == 1) {
         var3.anInt114 = var1.g2();
         var3.aBoolean35 = var1.g1() == 1;
      }

      String var10;
      if (var3.type == 2) {
         var3.anIntArray44 = new int[var3.anInt123 * var3.height];
         var3.anIntArray40 = new int[var3.anInt123 * var3.height];
         var3.aBoolean41 = var1.g1() == 1;
         var3.aBoolean34 = var1.g1() == 1;
         var3.aBoolean43 = var1.g1() == 1;
         var3.aBoolean32 = var1.g1() == 1;
         var3.anInt137 = var1.g1();
         var3.anInt126 = var1.g1();
         var3.anIntArray39 = new int[20];
         var3.anIntArray38 = new int[20];
         var3.aClass10_Sub1_Sub1_Sub1Array1 = new Pix24[20];

         for(var6 = 0; var6 < 20; ++var6) {
            var7 = var1.g1();
            if (var7 == 1) {
               var3.anIntArray39[var6] = var1.g2b();
               var3.anIntArray38[var6] = var1.g2b();
               var10 = var1.gjstr();
               if (var10.length() > 0) {
                  int var9 = var10.lastIndexOf(",");
                  var3.aClass10_Sub1_Sub1_Sub1Array1[var6] = method86(Integer.parseInt(var10.substring(var9 + 1)), var10.substring(0, var9));
               }
            }
         }

         var3.aStringArray1 = new String[5];

         for(var7 = 0; var7 < 5; ++var7) {
            var3.aStringArray1[var7] = var1.gjstr();
            if (var3.aStringArray1[var7].length() == 0) {
               var3.aStringArray1[var7] = null;
            }
         }
      }

      if (var3.type == 3) {
         var3.aBoolean36 = var1.g1() == 1;
      }

      if (var3.type == 4 || var3.type == 1) {
         var3.aBoolean40 = var1.g1() == 1;
         var6 = var1.g1();
         if (aClass10_Sub1_Sub1_Sub2Array1 != null) {
            var3.aClass10_Sub1_Sub1_Sub2_1 = aClass10_Sub1_Sub1_Sub2Array1[var6];
         }

         var3.aBoolean37 = var1.g1() == 1;
      }

      if (var3.type == 4) {
         var3.aString2 = var1.gjstr();
         var3.aString3 = var1.gjstr();
      }

      if (var3.type == 1 || var3.type == 3 || var3.type == 4) {
         var3.anInt122 = var1.g4();
      }

      if (var3.type == 3 || var3.type == 4) {
         var3.anInt135 = var1.g4();
         var3.anInt136 = var1.g4();
         var3.anInt115 = var1.g4();
      }

      if (var3.type == 5) {
         var10 = var1.gjstr();
         if (var10.length() > 0) {
            var7 = var10.lastIndexOf(",");
            var3.aClass10_Sub1_Sub1_Sub1_1 = method86(Integer.parseInt(var10.substring(var7 + 1)), var10.substring(0, var7));
         }

         var10 = var1.gjstr();
         if (var10.length() > 0) {
            var7 = var10.lastIndexOf(",");
            var3.aClass10_Sub1_Sub1_Sub1_2 = method86(Integer.parseInt(var10.substring(var7 + 1)), var10.substring(0, var7));
         }
      }

      if (var3.type == 6) {
         var8 = var1.g1();
         if (var8 != 0) {
            var3.anInt145 = 1;
            var3.anInt146 = (var8 - 1 << 8) + var1.g1();
         }

         var8 = var1.g1();
         if (var8 != 0) {
            var3.anInt138 = 1;
            var3.anInt139 = (var8 - 1 << 8) + var1.g1();
         }

         var8 = var1.g1();
         if (var8 == 0) {
            var3.anInt148 = -1;
         } else {
            var3.anInt148 = (var8 - 1 << 8) + var1.g1();
         }

         var8 = var1.g1();
         if (var8 == 0) {
            var3.anInt149 = -1;
         } else {
            var3.anInt149 = (var8 - 1 << 8) + var1.g1();
         }

         var3.anInt129 = var1.g2();
         var3.anInt130 = var1.g2();
         var3.anInt131 = var1.g2();
      }

      if (var3.type == 7) {
         var3.anIntArray44 = new int[var3.anInt123 * var3.height];
         var3.anIntArray40 = new int[var3.anInt123 * var3.height];
         var3.aBoolean40 = var1.g1() == 1;
         var6 = var1.g1();
         if (aClass10_Sub1_Sub1_Sub2Array1 != null) {
            var3.aClass10_Sub1_Sub1_Sub2_1 = aClass10_Sub1_Sub1_Sub2Array1[var6];
         }

         var3.aBoolean37 = var1.g1() == 1;
         var3.anInt122 = var1.g4();
         var3.anInt137 = var1.g2b();
         var3.anInt126 = var1.g2b();
         var3.aBoolean34 = var1.g1() == 1;
         var3.aStringArray1 = new String[5];

         for(var7 = 0; var7 < 5; ++var7) {
            var3.aStringArray1[var7] = var1.gjstr();
            if (var3.aStringArray1[var7].length() == 0) {
               var3.aStringArray1[var7] = null;
            }
         }
      }

      if (var3.type == 8) {
         var3.aString2 = var1.gjstr();
      }

      if (var3.anInt150 == 2 || var3.type == 2) {
         var3.aString5 = var1.gjstr();
         var3.aString1 = var1.gjstr();
         var3.anInt113 = var1.g2();
      }

      if (var3.anInt150 == 1 || var3.anInt150 == 4 || var3.anInt150 == 5 || var3.anInt150 == 6) {
         var3.aString4 = var1.gjstr();
         if (var3.aString4.length() == 0) {
            if (var3.anInt150 == 1) {
               var3.aString4 = "Ok";
            }

            if (var3.anInt150 == 4) {
               var3.aString4 = "Select";
            }

            if (var3.anInt150 == 5) {
               var3.aString4 = "Select";
            }

            if (var3.anInt150 == 6) {
               var3.aString4 = "Continue";
            }
         }
      }

      return var3;
   }

   public static void method93(Model var0) {
      aClass34_2.clear();
      if (var0 != null) {
         aClass34_2.put(var0, 327680L);
      }

   }

   public static void method94() {
      aClass14Array1 = null;
      aClass2_1 = null;
      aClass34_1 = null;
      aClass10_Sub1_Sub1_Sub2Array1 = null;
      aByteArrayArray2 = null;
   }

   private static Pix24 method86(int var0, String var1) {
      long var2 = (Class26.method250(183, var1) << 8) + (long)var0;
      Pix24 var4 = (Pix24)aClass34_1.get(var2);
      if (var4 != null) {
         return var4;
      } else if (aClass2_1 == null) {
         return null;
      } else {
         try {
            var4 = new Pix24(aClass2_1, var1, var0);
            aClass34_1.put(var4, var2);
            return var4;
         } catch (Exception var6) {
            return null;
         }
      }
   }

   public static void method91(PixFont[] var0, Jagfile var1, Jagfile var2) {
      aClass34_1 = new LruCache(50000);
      aClass2_1 = var2;
      aClass10_Sub1_Sub1_Sub2Array1 = var0;
      int var3 = -1;
      Packet var4 = new Packet(var1.read("data", (byte[])null));
      int var5 = var4.g2();
      aClass14Array1 = new ComType[var5];

      byte[] var9;
      for(aByteArrayArray2 = new byte[var5][]; var4.pos < var4.data.length; var9[1] = (byte)var3) {
         int var6 = var4.g2();
         if (var6 == 65535) {
            var3 = var4.g2();
            var6 = var4.g2();
         }

         int var7 = var4.pos;
         ComType var8 = method90(var3, var4, var6);
         var9 = aByteArrayArray2[var8.id] = new byte[var4.pos + 2 - var7];

         for(int var10 = var7; var10 < var4.pos; ++var10) {
            var9[var10 + 2 - var7] = var4.data[var10];
         }

         var9[0] = (byte)(var3 >> 8);
      }

      aClass2_1 = null;
   }
}
