public final class Model extends Entity {
   private static boolean[] aBooleanArray6 = new boolean[4096];
   private static Class27[] renderables;
   public static int[] anIntArray146;
   private static int anInt414;
   public static Model aClass10_Sub1_Sub2_Sub4_1 = new Model(852);
   private static int[] anIntArray137 = new int[1500];
   public static int pickedCount;
   public static int[] anIntArray147;
   private static int anInt415;
   private static int[] anIntArray109 = new int[2000];
   public static int[] anIntArray145 = new int[1000];
   private static Class33 aClass33_1;
   private static int anInt416;
   private static int[] anIntArray110 = new int[2000];
   private static int[] anIntArray138 = new int[12];
   private static int[] anIntArray111 = new int[2000];
   private static int[] anIntArray136 = new int[4096];
   private static boolean[] aBooleanArray5 = new boolean[4096];
   private static int[] anIntArray141 = new int[12];
   private static int[] anIntArray112 = new int[2000];
   private static int[][] anIntArrayArray12 = new int[1500][512];
   private static int[] anIntArray131 = new int[4096];
   private static int[] anIntArray142 = new int[10];
   private static int[] anIntArray134 = new int[4096];
   private static int anInt401;
   private static int[] anIntArray135 = new int[4096];
   private static int[] anIntArray132 = new int[4096];
   private static int[] anIntArray143 = new int[10];
   private static int[] anIntArray133 = new int[4096];
   private static int[] anIntArray149;
   public static int mouseX;
   private static int[][] anIntArrayArray13 = new int[12][2000];
   private static int[] anIntArray144 = new int[10];
   public static int mouseZ;
   private static int[] anIntArray139 = new int[2000];
   private static int[] anIntArray140 = new int[2000];
   private static int[] anIntArray148;
   public static boolean checkHover;
   private int anInt411;
   private int anInt406;
   public int[][] anIntArrayArray10;
   private int[] anIntArray129;
   public int[] anIntArray113;
   public int anInt402;
   public int anInt403;
   private int anInt398 = 932;
   public int anInt410;
   public int anInt409;
   public int[] anIntArray116;
   private int[] anIntArray130;
   public int[] anIntArray125;
   public int[] anIntArray114;
   public int[] anIntArray115;
   private int[] anIntArray119;
   private int anInt399 = 426;
   public Class41[] aClass41Array6;
   public int[] anIntArray117;
   private int[] anIntArray123;
   public int[] anIntArray122;
   public int[][] anIntArrayArray11;
   public int anInt407;
   private boolean aBoolean103 = false;
   public int[] anIntArray118;
   private int anInt405;
   private int[] anIntArray124;
   public int anInt408;
   private boolean aBoolean104 = true;
   public boolean aBoolean106 = false;
   private int[] anIntArray120;
   private int anInt400 = -252;
   private boolean aBoolean105 = false;
   private int[] anIntArray121;
   private int anInt412;
   private int[] anIntArray126;
   private int[] anIntArray127;
   private int anInt404;
   private int[] anIntArray128;
   public int anInt413;

   static {
      anIntArray146 = Draw3D.anIntArray181;
      anIntArray147 = Draw3D.anIntArray182;
      anIntArray148 = Draw3D.anIntArray186;
      anIntArray149 = Draw3D.anIntArray180;
   }

   private Model(int var1) {
   }

   public Model(int var1, Model[] var2) {
      ++anInt401;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.anInt402 = 0;
      this.anInt403 = 0;
      this.anInt405 = 0;
      this.anInt404 = -1;

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
         Model var8 = var2[var7];
         if (var8 != null) {
            this.anInt402 += var8.anInt402;
            this.anInt403 += var8.anInt403;
            this.anInt405 += var8.anInt405;
            var3 |= var8.anIntArray122 != null;
            if (var8.anIntArray123 == null) {
               if (this.anInt404 == -1) {
                  this.anInt404 = var8.anInt404;
               }

               if (this.anInt404 != var8.anInt404) {
                  var4 = true;
               }
            } else {
               var4 = true;
            }

            var5 |= var8.anIntArray124 != null;
            var6 |= var8.anIntArray130 != null;
         }
      }

      this.anIntArray113 = new int[this.anInt402];
      this.anIntArray114 = new int[this.anInt402];
      this.anIntArray115 = new int[this.anInt402];
      this.anIntArray129 = new int[this.anInt402];
      this.anIntArray116 = new int[this.anInt403];
      this.anIntArray117 = new int[this.anInt403];
      this.anIntArray118 = new int[this.anInt403];
      this.anIntArray126 = new int[this.anInt405];
      this.anIntArray127 = new int[this.anInt405];
      this.anIntArray128 = new int[this.anInt405];
      if (var3) {
         this.anIntArray122 = new int[this.anInt403];
      }

      if (var4) {
         this.anIntArray123 = new int[this.anInt403];
      }

      if (var5) {
         this.anIntArray124 = new int[this.anInt403];
      }

      if (var6) {
         this.anIntArray130 = new int[this.anInt403];
      }

      this.anIntArray125 = new int[this.anInt403];
      this.anInt402 = 0;
      this.anInt403 = 0;
      this.anInt405 = 0;
      var7 = 0;

      for(int var12 = 0; var12 < var1; ++var12) {
         Model var9 = var2[var12];
         if (var9 != null) {
            int var10;
            for(int var11 = 0; var11 < var9.anInt403; ++var11) {
               if (var3) {
                  if (var9.anIntArray122 == null) {
                     this.anIntArray122[this.anInt403] = 0;
                  } else {
                     var10 = var9.anIntArray122[var11];
                     if ((var10 & 2) == 2) {
                        var10 += var7 << 2;
                     }

                     this.anIntArray122[this.anInt403] = var10;
                  }
               }

               if (var4) {
                  if (var9.anIntArray123 == null) {
                     this.anIntArray123[this.anInt403] = var9.anInt404;
                  } else {
                     this.anIntArray123[this.anInt403] = var9.anIntArray123[var11];
                  }
               }

               if (var5) {
                  if (var9.anIntArray124 == null) {
                     this.anIntArray124[this.anInt403] = 0;
                  } else {
                     this.anIntArray124[this.anInt403] = var9.anIntArray124[var11];
                  }
               }

               if (var6 && var9.anIntArray130 != null) {
                  this.anIntArray130[this.anInt403] = var9.anIntArray130[var11];
               }

               this.anIntArray125[this.anInt403] = var9.anIntArray125[var11];
               this.anIntArray116[this.anInt403] = this.method274(var9, var9.anIntArray116[var11]);
               this.anIntArray117[this.anInt403] = this.method274(var9, var9.anIntArray117[var11]);
               this.anIntArray118[this.anInt403] = this.method274(var9, var9.anIntArray118[var11]);
               ++this.anInt403;
            }

            for(var10 = 0; var10 < var9.anInt405; ++var10) {
               this.anIntArray126[this.anInt405] = this.method274(var9, var9.anIntArray126[var10]);
               this.anIntArray127[this.anInt405] = this.method274(var9, var9.anIntArray127[var10]);
               this.anIntArray128[this.anInt405] = this.method274(var9, var9.anIntArray128[var10]);
               ++this.anInt405;
            }

            var7 += var9.anInt405;
         }
      }

   }

   private Model(int var1, int var2) {
      ++anInt401;
      Class27 var3 = renderables[var1];
      this.anInt402 = var3.anInt330;
      this.anInt403 = var3.anInt331;
      this.anInt405 = var3.anInt332;
      this.anIntArray113 = new int[this.anInt402];
      this.anIntArray114 = new int[this.anInt402];
      this.anIntArray115 = new int[this.anInt402];
      this.anIntArray116 = new int[this.anInt403];
      this.anIntArray117 = new int[this.anInt403];
      this.anIntArray118 = new int[this.anInt403];
      this.anIntArray126 = new int[this.anInt405];
      this.anIntArray127 = new int[this.anInt405];
      this.anIntArray128 = new int[this.anInt405];
      if (var3.anInt337 >= 0) {
         this.anIntArray129 = new int[this.anInt402];
      }

      if (var3.anInt341 >= 0) {
         this.anIntArray122 = new int[this.anInt403];
      }

      if (var3.anInt342 >= 0) {
         this.anIntArray123 = new int[this.anInt403];
      } else {
         this.anInt404 = -var3.anInt342 - 1;
      }

      if (var3.anInt343 >= 0) {
         this.anIntArray124 = new int[this.anInt403];
      }

      if (var3.anInt344 >= 0) {
         this.anIntArray130 = new int[this.anInt403];
      }

      this.anIntArray125 = new int[this.anInt403];
      Packet var4 = new Packet(var3.aByteArray11);
      var4.pos = var3.anInt333;
      Packet var5 = new Packet(var3.aByteArray11);
      var5.pos = var3.anInt334;
      Packet var6 = new Packet(var3.aByteArray11);
      var6.pos = var3.anInt335;
      Packet var7 = new Packet(var3.aByteArray11);
      var7.pos = var3.anInt336;
      Packet var8 = new Packet(var3.aByteArray11);
      var8.pos = var3.anInt337;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;

      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      for(var16 = 0; var16 < this.anInt402; ++var16) {
         var12 = var4.g1();
         var13 = 0;
         if ((var12 & 1) != 0) {
            var13 = var5.gsmart();
         }

         var14 = 0;
         if ((var12 & 2) != 0) {
            var14 = var6.gsmart();
         }

         var15 = 0;
         if ((var12 & 4) != 0) {
            var15 = var7.gsmart();
         }

         this.anIntArray113[var16] = var9 + var13;
         this.anIntArray114[var16] = var10 + var14;
         this.anIntArray115[var16] = var11 + var15;
         var9 = this.anIntArray113[var16];
         var10 = this.anIntArray114[var16];
         var11 = this.anIntArray115[var16];
         if (this.anIntArray129 != null) {
            this.anIntArray129[var16] = var8.g1();
         }
      }

      var4.pos = var3.anInt340;
      var5.pos = var3.anInt341;
      var6.pos = var3.anInt342;
      var7.pos = var3.anInt343;
      var8.pos = var3.anInt344;

      for(var12 = 0; var12 < this.anInt403; ++var12) {
         this.anIntArray125[var12] = var4.g2();
         if (this.anIntArray122 != null) {
            this.anIntArray122[var12] = var5.g1();
         }

         if (this.anIntArray123 != null) {
            this.anIntArray123[var12] = var6.g1();
         }

         if (this.anIntArray124 != null) {
            this.anIntArray124[var12] = var7.g1();
         }

         if (this.anIntArray130 != null) {
            this.anIntArray130[var12] = var8.g1();
         }
      }

      var4.pos = var3.anInt338;
      var5.pos = var3.anInt339;
      var13 = 0;
      var14 = 0;
      var15 = 0;
      var16 = 0;

      int var17;
      for(int var18 = 0; var18 < this.anInt403; ++var18) {
         var17 = var5.g1();
         if (var17 == 1) {
            var13 = var4.gsmart() + var16;
            var14 = var4.gsmart() + var13;
            var15 = var4.gsmart() + var14;
            var16 = var15;
            this.anIntArray116[var18] = var13;
            this.anIntArray117[var18] = var14;
            this.anIntArray118[var18] = var15;
         }

         if (var17 == 2) {
            var13 = var13;
            var14 = var15;
            var15 = var4.gsmart() + var16;
            var16 = var15;
            this.anIntArray116[var18] = var13;
            this.anIntArray117[var18] = var14;
            this.anIntArray118[var18] = var15;
         }

         if (var17 == 3) {
            var13 = var15;
            var14 = var14;
            var15 = var4.gsmart() + var16;
            var16 = var15;
            this.anIntArray116[var18] = var13;
            this.anIntArray117[var18] = var14;
            this.anIntArray118[var18] = var15;
         }

         if (var17 == 4) {
            int var19 = var13;
            var13 = var14;
            var14 = var19;
            var15 = var4.gsmart() + var16;
            var16 = var15;
            this.anIntArray116[var18] = var13;
            this.anIntArray117[var18] = var19;
            this.anIntArray118[var18] = var15;
         }
      }

      var4.pos = var3.anInt345;

      for(var17 = 0; var17 < this.anInt405; ++var17) {
         this.anIntArray126[var17] = var4.g2();
         this.anIntArray127[var17] = var4.g2();
         this.anIntArray128[var17] = var4.g2();
      }

   }

   public Model(boolean var1, boolean var2, int var3, Model var4) {
      ++anInt401;
      this.anInt402 = var4.anInt402;
      this.anInt403 = var4.anInt403;
      this.anInt405 = var4.anInt405;
      int var5;
      if (var1) {
         this.anIntArray114 = new int[this.anInt402];

         for(var5 = 0; var5 < this.anInt402; ++var5) {
            this.anIntArray114[var5] = var4.anIntArray114[var5];
         }
      } else {
         this.anIntArray114 = var4.anIntArray114;
      }

      if (var2) {
         this.anIntArray119 = new int[this.anInt403];
         this.anIntArray120 = new int[this.anInt403];
         this.anIntArray121 = new int[this.anInt403];

         for(var5 = 0; var5 < this.anInt403; ++var5) {
            this.anIntArray119[var5] = var4.anIntArray119[var5];
            this.anIntArray120[var5] = var4.anIntArray120[var5];
            this.anIntArray121[var5] = var4.anIntArray121[var5];
         }

         this.anIntArray122 = new int[this.anInt403];
         int var6;
         if (var4.anIntArray122 == null) {
            for(var6 = 0; var6 < this.anInt403; ++var6) {
               this.anIntArray122[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.anInt403; ++var6) {
               this.anIntArray122[var6] = var4.anIntArray122[var6];
            }
         }

         super.aClass41Array10 = new Class41[this.anInt402];

         for(var6 = 0; var6 < this.anInt402; ++var6) {
            Class41 var7 = super.aClass41Array10[var6] = new Class41();
            Class41 var8 = var4.aClass41Array10[var6];
            var7.anInt607 = var8.anInt607;
            var7.anInt608 = var8.anInt608;
            var7.anInt609 = var8.anInt609;
            var7.anInt610 = var8.anInt610;
         }

         this.aClass41Array6 = var4.aClass41Array6;
      } else {
         this.anIntArray119 = var4.anIntArray119;
         this.anIntArray120 = var4.anIntArray120;
         this.anIntArray121 = var4.anIntArray121;
         this.anIntArray122 = var4.anIntArray122;
      }

      this.anIntArray113 = var4.anIntArray113;
      this.anIntArray115 = var4.anIntArray115;
      this.anIntArray125 = var4.anIntArray125;
      this.anIntArray124 = var4.anIntArray124;
      this.anIntArray123 = var4.anIntArray123;
      this.anInt404 = var4.anInt404;
      this.anIntArray116 = var4.anIntArray116;
      this.anIntArray117 = var4.anIntArray117;
      this.anIntArray118 = var4.anIntArray118;
      this.anIntArray126 = var4.anIntArray126;
      this.anIntArray127 = var4.anIntArray127;
      this.anIntArray128 = var4.anIntArray128;
      super.anInt713 = var4.anInt713;
      this.anInt410 = var4.anInt410;
      this.anInt409 = var4.anInt409;
      this.anInt412 = var4.anInt412;
      this.anInt411 = var4.anInt411;
      this.anInt407 = var4.anInt407;
      this.anInt408 = var4.anInt408;
      this.anInt406 = var4.anInt406;
   }

   public Model(boolean var1, boolean var2, boolean var3, Model var4, boolean var5) {
      ++anInt401;
      this.anInt402 = var4.anInt402;
      this.anInt403 = var4.anInt403;
      this.anInt405 = var4.anInt405;
      int var6;
      if (var1) {
         this.anIntArray113 = var4.anIntArray113;
         this.anIntArray114 = var4.anIntArray114;
         this.anIntArray115 = var4.anIntArray115;
      } else {
         this.anIntArray113 = new int[this.anInt402];
         this.anIntArray114 = new int[this.anInt402];
         this.anIntArray115 = new int[this.anInt402];

         for(var6 = 0; var6 < this.anInt402; ++var6) {
            this.anIntArray113[var6] = var4.anIntArray113[var6];
            this.anIntArray114[var6] = var4.anIntArray114[var6];
            this.anIntArray115[var6] = var4.anIntArray115[var6];
         }
      }

      if (var3) {
         this.anIntArray125 = var4.anIntArray125;
      } else {
         this.anIntArray125 = new int[this.anInt403];

         for(var6 = 0; var6 < this.anInt403; ++var6) {
            this.anIntArray125[var6] = var4.anIntArray125[var6];
         }
      }

      if (var5) {
         this.anIntArray124 = var4.anIntArray124;
      } else {
         this.anIntArray124 = new int[this.anInt403];
         if (var4.anIntArray124 == null) {
            for(var6 = 0; var6 < this.anInt403; ++var6) {
               this.anIntArray124[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.anInt403; ++var6) {
               this.anIntArray124[var6] = var4.anIntArray124[var6];
            }
         }
      }

      this.anIntArray129 = var4.anIntArray129;
      this.anIntArray130 = var4.anIntArray130;
      this.anIntArray122 = var4.anIntArray122;
      this.anIntArray116 = var4.anIntArray116;
      this.anIntArray117 = var4.anIntArray117;
      this.anIntArray118 = var4.anIntArray118;
      this.anIntArray123 = var4.anIntArray123;
      this.anInt404 = var4.anInt404;
      this.anIntArray126 = var4.anIntArray126;
      this.anIntArray127 = var4.anIntArray127;
      this.anIntArray128 = var4.anIntArray128;
   }

   public Model(int var1, boolean var2, int var3, Model[] var4) {
      ++anInt401;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.anInt402 = 0;
      this.anInt403 = 0;
      this.anInt405 = 0;
      this.anInt404 = -1;

      int var9;
      for(var9 = 0; var9 < var1; ++var9) {
         Model var10 = var4[var9];
         if (var10 != null) {
            this.anInt402 += var10.anInt402;
            this.anInt403 += var10.anInt403;
            this.anInt405 += var10.anInt405;
            var5 |= var10.anIntArray122 != null;
            if (var10.anIntArray123 == null) {
               if (this.anInt404 == -1) {
                  this.anInt404 = var10.anInt404;
               }

               if (this.anInt404 != var10.anInt404) {
                  var6 = true;
               }
            } else {
               var6 = true;
            }

            var7 |= var10.anIntArray124 != null;
            var8 |= var10.anIntArray125 != null;
         }
      }

      this.anIntArray113 = new int[this.anInt402];
      this.anIntArray114 = new int[this.anInt402];
      this.anIntArray115 = new int[this.anInt402];
      this.anIntArray116 = new int[this.anInt403];
      this.anIntArray117 = new int[this.anInt403];
      this.anIntArray118 = new int[this.anInt403];
      this.anIntArray119 = new int[this.anInt403];
      this.anIntArray120 = new int[this.anInt403];
      this.anIntArray121 = new int[this.anInt403];
      this.anIntArray126 = new int[this.anInt405];
      this.anIntArray127 = new int[this.anInt405];
      this.anIntArray128 = new int[this.anInt405];
      if (var5) {
         this.anIntArray122 = new int[this.anInt403];
      }

      if (var6) {
         this.anIntArray123 = new int[this.anInt403];
      }

      if (var7) {
         this.anIntArray124 = new int[this.anInt403];
      }

      if (var8) {
         this.anIntArray125 = new int[this.anInt403];
      }

      this.anInt402 = 0;
      this.anInt403 = 0;
      this.anInt405 = 0;
      var9 = 0;

      for(int var15 = 0; var15 < var1; ++var15) {
         Model var11 = var4[var15];
         if (var11 != null) {
            int var12 = this.anInt402;

            int var13;
            for(var13 = 0; var13 < var11.anInt402; ++var13) {
               this.anIntArray113[this.anInt402] = var11.anIntArray113[var13];
               this.anIntArray114[this.anInt402] = var11.anIntArray114[var13];
               this.anIntArray115[this.anInt402] = var11.anIntArray115[var13];
               ++this.anInt402;
            }

            for(int var14 = 0; var14 < var11.anInt403; ++var14) {
               this.anIntArray116[this.anInt403] = var11.anIntArray116[var14] + var12;
               this.anIntArray117[this.anInt403] = var11.anIntArray117[var14] + var12;
               this.anIntArray118[this.anInt403] = var11.anIntArray118[var14] + var12;
               this.anIntArray119[this.anInt403] = var11.anIntArray119[var14];
               this.anIntArray120[this.anInt403] = var11.anIntArray120[var14];
               this.anIntArray121[this.anInt403] = var11.anIntArray121[var14];
               if (var5) {
                  if (var11.anIntArray122 == null) {
                     this.anIntArray122[this.anInt403] = 0;
                  } else {
                     var13 = var11.anIntArray122[var14];
                     if ((var13 & 2) == 2) {
                        var13 += var9 << 2;
                     }

                     this.anIntArray122[this.anInt403] = var13;
                  }
               }

               if (var6) {
                  if (var11.anIntArray123 == null) {
                     this.anIntArray123[this.anInt403] = var11.anInt404;
                  } else {
                     this.anIntArray123[this.anInt403] = var11.anIntArray123[var14];
                  }
               }

               if (var7) {
                  if (var11.anIntArray124 == null) {
                     this.anIntArray124[this.anInt403] = 0;
                  } else {
                     this.anIntArray124[this.anInt403] = var11.anIntArray124[var14];
                  }
               }

               if (var8 && var11.anIntArray125 != null) {
                  this.anIntArray125[this.anInt403] = var11.anIntArray125[var14];
               }

               ++this.anInt403;
            }

            for(var13 = 0; var13 < var11.anInt405; ++var13) {
               this.anIntArray126[this.anInt405] = var11.anIntArray126[var13] + var12;
               this.anIntArray127[this.anInt405] = var11.anIntArray127[var13] + var12;
               this.anIntArray128[this.anInt405] = var11.anIntArray128[var13] + var12;
               ++this.anInt405;
            }

            var9 += var11.anInt405;
         }
      }

      this.method275(this.anInt398);
   }

   private void method290(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      for(int var7 = 0; var7 < this.anInt403; ++var7) {
         var6 = this.anIntArray116[var7];
         int var8 = this.anIntArray117[var7];
         int var9 = this.anIntArray118[var7];
         Class41 var10;
         int var11;
         int var12;
         if (this.anIntArray122 == null) {
            var12 = this.anIntArray125[var7];
            var10 = super.aClass41Array10[var6];
            var11 = var1 + (var3 * var10.anInt607 + var4 * var10.anInt608 + var5 * var10.anInt609) / (var2 * var10.anInt610);
            this.anIntArray119[var7] = method291(var12, var11, 0);
            Class41 var13 = super.aClass41Array10[var8];
            int var14 = var1 + (var3 * var13.anInt607 + var4 * var13.anInt608 + var5 * var13.anInt609) / (var2 * var13.anInt610);
            this.anIntArray120[var7] = method291(var12, var14, 0);
            Class41 var15 = super.aClass41Array10[var9];
            int var16 = var1 + (var3 * var15.anInt607 + var4 * var15.anInt608 + var5 * var15.anInt609) / (var2 * var15.anInt610);
            this.anIntArray121[var7] = method291(var12, var16, 0);
         } else if ((this.anIntArray122[var7] & 1) == 0) {
            var12 = this.anIntArray125[var7];
            int var17 = this.anIntArray122[var7];
            var10 = super.aClass41Array10[var6];
            var11 = var1 + (var3 * var10.anInt607 + var4 * var10.anInt608 + var5 * var10.anInt609) / (var2 * var10.anInt610);
            this.anIntArray119[var7] = method291(var12, var11, var17);
            var10 = super.aClass41Array10[var8];
            var11 = var1 + (var3 * var10.anInt607 + var4 * var10.anInt608 + var5 * var10.anInt609) / (var2 * var10.anInt610);
            this.anIntArray120[var7] = method291(var12, var11, var17);
            var10 = super.aClass41Array10[var9];
            var11 = var1 + (var3 * var10.anInt607 + var4 * var10.anInt608 + var5 * var10.anInt609) / (var2 * var10.anInt610);
            this.anIntArray121[var7] = method291(var12, var11, var17);
         }
      }

      super.aClass41Array10 = null;
      this.aClass41Array6 = null;
      this.anIntArray129 = null;
      this.anIntArray130 = null;
      if (this.anIntArray122 != null) {
         for(var6 = 0; var6 < this.anInt403; ++var6) {
            if ((this.anIntArray122[var6] & 2) == 2) {
               return;
            }
         }
      }

      this.anIntArray125 = null;
   }

   public void method279(int var1, byte var2) {
      if (this.anIntArrayArray10 != null && var1 != -1) {
         Class22 var3 = Class22.method168(var1);
         if (var3 != null) {
            Class42 var4 = var3.aClass42_1;
            boolean var5 = false;
            anInt414 = 0;
            anInt415 = 0;
            anInt416 = 0;

            for(int var6 = 0; var6 < var3.anInt239; ++var6) {
               int var7 = var3.anIntArray81[var6];
               this.method281(var4.anIntArray172[var7], var4.anIntArrayArray15[var7], var3.anIntArray82[var6], var3.anIntArray83[var6], var3.anIntArray84[var6]);
            }
         }
      }

   }

   private void method295(int var1) {
      int var2 = Draw3D.anInt686;
      int var3 = Draw3D.anInt687;
      int var4 = 0;
      int var5 = this.anIntArray116[var1];
      int var6 = this.anIntArray117[var1];
      int var7 = this.anIntArray118[var1];
      int var8 = anIntArray136[var5];
      int var9 = anIntArray136[var6];
      int var10 = anIntArray136[var7];
      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         anIntArray142[0] = anIntArray131[var5];
         anIntArray143[0] = anIntArray132[var5];
         ++var4;
         anIntArray144[0] = this.anIntArray119[var1];
      } else {
         var11 = anIntArray134[var5];
         var12 = anIntArray135[var5];
         var13 = this.anIntArray119[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * anIntArray149[var10 - var8];
            anIntArray142[0] = var2 + (var11 + ((anIntArray134[var7] - var11) * var14 >> 16) << 9) / 50;
            anIntArray143[0] = var3 + (var12 + ((anIntArray135[var7] - var12) * var14 >> 16) << 9) / 50;
            ++var4;
            anIntArray144[0] = var13 + ((this.anIntArray121[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * anIntArray149[var9 - var8];
            anIntArray142[var4] = var2 + (var11 + ((anIntArray134[var6] - var11) * var14 >> 16) << 9) / 50;
            anIntArray143[var4] = var3 + (var12 + ((anIntArray135[var6] - var12) * var14 >> 16) << 9) / 50;
            anIntArray144[var4++] = var13 + ((this.anIntArray120[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         anIntArray142[var4] = anIntArray131[var6];
         anIntArray143[var4] = anIntArray132[var6];
         anIntArray144[var4++] = this.anIntArray120[var1];
      } else {
         var11 = anIntArray134[var6];
         var12 = anIntArray135[var6];
         var13 = this.anIntArray120[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * anIntArray149[var8 - var9];
            anIntArray142[var4] = var2 + (var11 + ((anIntArray134[var5] - var11) * var14 >> 16) << 9) / 50;
            anIntArray143[var4] = var3 + (var12 + ((anIntArray135[var5] - var12) * var14 >> 16) << 9) / 50;
            anIntArray144[var4++] = var13 + ((this.anIntArray119[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * anIntArray149[var10 - var9];
            anIntArray142[var4] = var2 + (var11 + ((anIntArray134[var7] - var11) * var14 >> 16) << 9) / 50;
            anIntArray143[var4] = var3 + (var12 + ((anIntArray135[var7] - var12) * var14 >> 16) << 9) / 50;
            anIntArray144[var4++] = var13 + ((this.anIntArray121[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         anIntArray142[var4] = anIntArray131[var7];
         anIntArray143[var4] = anIntArray132[var7];
         anIntArray144[var4++] = this.anIntArray121[var1];
      } else {
         var11 = anIntArray134[var7];
         var12 = anIntArray135[var7];
         var13 = this.anIntArray121[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * anIntArray149[var9 - var10];
            anIntArray142[var4] = var2 + (var11 + ((anIntArray134[var6] - var11) * var14 >> 16) << 9) / 50;
            anIntArray143[var4] = var3 + (var12 + ((anIntArray135[var6] - var12) * var14 >> 16) << 9) / 50;
            anIntArray144[var4++] = var13 + ((this.anIntArray120[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * anIntArray149[var8 - var10];
            anIntArray142[var4] = var2 + (var11 + ((anIntArray134[var5] - var11) * var14 >> 16) << 9) / 50;
            anIntArray143[var4] = var3 + (var12 + ((anIntArray135[var5] - var12) * var14 >> 16) << 9) / 50;
            anIntArray144[var4++] = var13 + ((this.anIntArray119[var1] - var13) * var14 >> 16);
         }
      }

      var11 = anIntArray142[0];
      var12 = anIntArray142[1];
      var13 = anIntArray142[2];
      var14 = anIntArray143[0];
      int var15 = anIntArray143[1];
      int var16 = anIntArray143[2];
      if ((var11 - var12) * (var16 - var15) - (var14 - var15) * (var13 - var12) > 0) {
         Draw3D.aBoolean177 = false;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         if (var4 == 3) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Draw2D.boundX || var12 > Draw2D.boundX || var13 > Draw2D.boundX) {
               Draw3D.aBoolean177 = true;
            }

            if (this.anIntArray122 == null) {
               var17 = 0;
            } else {
               var17 = this.anIntArray122[var1] & 3;
            }

            if (var17 == 0) {
               Draw3D.method517(var14, var15, var16, var11, var12, var13, anIntArray144[0], anIntArray144[1], anIntArray144[2]);
            } else if (var17 == 1) {
               Draw3D.method519(var14, var15, var16, var11, var12, var13, anIntArray148[this.anIntArray119[var1]]);
            } else if (var17 == 2) {
               var18 = this.anIntArray122[var1] >> 2;
               var19 = this.anIntArray126[var18];
               var20 = this.anIntArray127[var18];
               var21 = this.anIntArray128[var18];
               Draw3D.method521(var14, var15, var16, var11, var12, var13, anIntArray144[0], anIntArray144[1], anIntArray144[2], anIntArray134[var19], anIntArray134[var20], anIntArray134[var21], anIntArray135[var19], anIntArray135[var20], anIntArray135[var21], anIntArray136[var19], anIntArray136[var20], anIntArray136[var21], this.anIntArray125[var1]);
            } else if (var17 == 3) {
               var18 = this.anIntArray122[var1] >> 2;
               var19 = this.anIntArray126[var18];
               var20 = this.anIntArray127[var18];
               var21 = this.anIntArray128[var18];
               Draw3D.method521(var14, var15, var16, var11, var12, var13, this.anIntArray119[var1], this.anIntArray119[var1], this.anIntArray119[var1], anIntArray134[var19], anIntArray134[var20], anIntArray134[var21], anIntArray135[var19], anIntArray135[var20], anIntArray135[var21], anIntArray136[var19], anIntArray136[var20], anIntArray136[var21], this.anIntArray125[var1]);
            }
         }

         if (var4 == 4) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Draw2D.boundX || var12 > Draw2D.boundX || var13 > Draw2D.boundX || anIntArray142[3] < 0 || anIntArray142[3] > Draw2D.boundX) {
               Draw3D.aBoolean177 = true;
            }

            if (this.anIntArray122 == null) {
               var17 = 0;
            } else {
               var17 = this.anIntArray122[var1] & 3;
            }

            if (var17 == 0) {
               Draw3D.method517(var14, var15, var16, var11, var12, var13, anIntArray144[0], anIntArray144[1], anIntArray144[2]);
               Draw3D.method517(var14, var16, anIntArray143[3], var11, var13, anIntArray142[3], anIntArray144[0], anIntArray144[2], anIntArray144[3]);
            } else if (var17 == 1) {
               var18 = anIntArray148[this.anIntArray119[var1]];
               Draw3D.method519(var14, var15, var16, var11, var12, var13, var18);
               Draw3D.method519(var14, var16, anIntArray143[3], var11, var13, anIntArray142[3], var18);
            } else if (var17 == 2) {
               var18 = this.anIntArray122[var1] >> 2;
               var19 = this.anIntArray126[var18];
               var20 = this.anIntArray127[var18];
               var21 = this.anIntArray128[var18];
               Draw3D.method521(var14, var15, var16, var11, var12, var13, anIntArray144[0], anIntArray144[1], anIntArray144[2], anIntArray134[var19], anIntArray134[var20], anIntArray134[var21], anIntArray135[var19], anIntArray135[var20], anIntArray135[var21], anIntArray136[var19], anIntArray136[var20], anIntArray136[var21], this.anIntArray125[var1]);
               Draw3D.method521(var14, var16, anIntArray143[3], var11, var13, anIntArray142[3], anIntArray144[0], anIntArray144[2], anIntArray144[3], anIntArray134[var19], anIntArray134[var20], anIntArray134[var21], anIntArray135[var19], anIntArray135[var20], anIntArray135[var21], anIntArray136[var19], anIntArray136[var20], anIntArray136[var21], this.anIntArray125[var1]);
            } else if (var17 == 3) {
               var18 = this.anIntArray122[var1] >> 2;
               var19 = this.anIntArray126[var18];
               var20 = this.anIntArray127[var18];
               var21 = this.anIntArray128[var18];
               Draw3D.method521(var14, var15, var16, var11, var12, var13, this.anIntArray119[var1], this.anIntArray119[var1], this.anIntArray119[var1], anIntArray134[var19], anIntArray134[var20], anIntArray134[var21], anIntArray135[var19], anIntArray135[var20], anIntArray135[var21], anIntArray136[var19], anIntArray136[var20], anIntArray136[var21], this.anIntArray125[var1]);
               Draw3D.method521(var14, var16, anIntArray143[3], var11, var13, anIntArray142[3], this.anIntArray119[var1], this.anIntArray119[var1], this.anIntArray119[var1], anIntArray134[var19], anIntArray134[var20], anIntArray134[var21], anIntArray135[var19], anIntArray135[var20], anIntArray135[var21], anIntArray136[var19], anIntArray136[var20], anIntArray136[var21], this.anIntArray125[var1]);
            }
         }
      }
   }

   public void recolor(int var1, int var2) {
      for(int var3 = 0; var3 < this.anInt403; ++var3) {
         if (this.anIntArray125[var3] == var1) {
            this.anIntArray125[var3] = var2;
         }
      }

   }

   public void method278() {
      int[] var1;
      int var2;
      int var10003;
      int var4;
      int var5;
      int var6;
      int var7;
      if (this.anIntArray129 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var4 = 0; var4 < this.anInt402; ++var4) {
            var5 = this.anIntArray129[var4];
            var10003 = var1[var5]++;
            if (var5 > var2) {
               var2 = var5;
            }
         }

         this.anIntArrayArray10 = new int[var2 + 1][];

         for(var5 = 0; var5 <= var2; ++var5) {
            this.anIntArrayArray10[var5] = new int[var1[var5]];
            var1[var5] = 0;
         }

         for(var6 = 0; var6 < this.anInt402; this.anIntArrayArray10[var7][var1[var7]++] = var6++) {
            var7 = this.anIntArray129[var6];
         }

         this.anIntArray129 = null;
      }

      if (this.anIntArray130 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var4 = 0; var4 < this.anInt403; ++var4) {
            var5 = this.anIntArray130[var4];
            var10003 = var1[var5]++;
            if (var5 > var2) {
               var2 = var5;
            }
         }

         this.anIntArrayArray11 = new int[var2 + 1][];

         for(var5 = 0; var5 <= var2; ++var5) {
            this.anIntArrayArray11[var5] = new int[var1[var5]];
            var1[var5] = 0;
         }

         for(var6 = 0; var6 < this.anInt403; this.anIntArrayArray11[var7][var1[var7]++] = var6++) {
            var7 = this.anIntArray130[var6];
         }

         this.anIntArray130 = null;
      }

   }

   public void method273(boolean var1, Model var2) {
      this.anInt402 = var2.anInt402;
      this.anInt403 = var2.anInt403;
      this.anInt405 = var2.anInt405;
      if (anIntArray109.length < this.anInt402) {
         anIntArray109 = new int[this.anInt402 + 100];
         anIntArray110 = new int[this.anInt402 + 100];
         anIntArray111 = new int[this.anInt402 + 100];
      }

      this.anIntArray113 = anIntArray109;
      this.anIntArray114 = anIntArray110;
      this.anIntArray115 = anIntArray111;

      int var3;
      for(var3 = 0; var3 < this.anInt402; ++var3) {
         this.anIntArray113[var3] = var2.anIntArray113[var3];
         this.anIntArray114[var3] = var2.anIntArray114[var3];
         this.anIntArray115[var3] = var2.anIntArray115[var3];
      }

      if (var1) {
         this.anIntArray124 = var2.anIntArray124;
      } else {
         if (anIntArray112.length < this.anInt403) {
            anIntArray112 = new int[this.anInt403 + 100];
         }

         this.anIntArray124 = anIntArray112;
         if (var2.anIntArray124 == null) {
            for(var3 = 0; var3 < this.anInt403; ++var3) {
               this.anIntArray124[var3] = 0;
            }
         } else {
            for(var3 = 0; var3 < this.anInt403; ++var3) {
               this.anIntArray124[var3] = var2.anIntArray124[var3];
            }
         }
      }

      this.anIntArray122 = var2.anIntArray122;
      this.anIntArray125 = var2.anIntArray125;
      this.anIntArray123 = var2.anIntArray123;
      this.anInt404 = var2.anInt404;
      this.anIntArrayArray11 = var2.anIntArrayArray11;
      this.anIntArrayArray10 = var2.anIntArrayArray10;
      this.anIntArray116 = var2.anIntArray116;
      this.anIntArray117 = var2.anIntArray117;
      this.anIntArray118 = var2.anIntArray118;
      this.anIntArray119 = var2.anIntArray119;
      this.anIntArray120 = var2.anIntArray120;
      this.anIntArray121 = var2.anIntArray121;
      this.anIntArray126 = var2.anIntArray126;
      this.anIntArray127 = var2.anIntArray127;
      this.anIntArray128 = var2.anIntArray128;
   }

   public void method536(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var8 * var5 - var6 * var4 >> 16;
      int var11 = var7 * var2 + var10 * var3 >> 16;
      int var12 = this.anInt409 * var3 >> 16;
      int var13 = var11 + var12;
      if (var13 > 50 && var11 < 3500) {
         int var14 = var8 * var4 + var6 * var5 >> 16;
         int var15 = var14 - this.anInt409 << 9;
         if (var15 / var13 < Draw2D.centerX2d) {
            int var16 = var14 + this.anInt409 << 9;
            if (var16 / var13 > -Draw2D.centerX2d) {
               int var17 = var7 * var3 - var10 * var2 >> 16;
               int var18 = this.anInt409 * var2 >> 16;
               int var19 = var17 + var18 << 9;
               if (var19 / var13 > -Draw2D.anInt682) {
                  int var20 = var18 + (super.anInt713 * var3 >> 16);
                  int var21 = var17 - var20 << 9;
                  if (var21 / var13 < Draw2D.anInt682) {
                     int var22 = var12 + (super.anInt713 * var2 >> 16);
                     boolean var23 = false;
                     if (var11 - var22 <= 50) {
                        var23 = true;
                     }

                     boolean var24 = false;
                     int var25;
                     int var26;
                     int var27;
                     if (var9 > 0 && checkHover) {
                        var25 = var11 - var12;
                        if (var25 <= 50) {
                           var25 = 50;
                        }

                        if (var14 > 0) {
                           var15 /= var13;
                           var16 /= var25;
                        } else {
                           var16 /= var13;
                           var15 /= var25;
                        }

                        if (var17 > 0) {
                           var21 /= var13;
                           var19 /= var25;
                        } else {
                           var19 /= var13;
                           var21 /= var25;
                        }

                        var26 = mouseX - Draw3D.anInt686;
                        var27 = mouseZ - Draw3D.anInt687;
                        if (var26 > var15 && var26 < var16 && var27 > var21 && var27 < var19) {
                           if (this.aBoolean106) {
                              anIntArray145[pickedCount++] = var9;
                           } else {
                              var24 = true;
                           }
                        }
                     }

                     var25 = Draw3D.anInt686;
                     var26 = Draw3D.anInt687;
                     var27 = 0;
                     int var28 = 0;
                     if (var1 != 0) {
                        var27 = anIntArray146[var1];
                        var28 = anIntArray147[var1];
                     }

                     for(int var29 = 0; var29 < this.anInt402; ++var29) {
                        int var30 = this.anIntArray113[var29];
                        int var31 = this.anIntArray114[var29];
                        int var32 = this.anIntArray115[var29];
                        int var33;
                        if (var1 != 0) {
                           var33 = var32 * var27 + var30 * var28 >> 16;
                           var32 = var32 * var28 - var30 * var27 >> 16;
                           var30 = var33;
                        }

                        var30 += var6;
                        var31 += var7;
                        var32 += var8;
                        var33 = var32 * var4 + var30 * var5 >> 16;
                        var32 = var32 * var5 - var30 * var4 >> 16;
                        var30 = var33;
                        var33 = var31 * var3 - var32 * var2 >> 16;
                        var32 = var31 * var2 + var32 * var3 >> 16;
                        anIntArray133[var29] = var32 - var11;
                        if (var32 >= 50) {
                           anIntArray131[var29] = var25 + (var30 << 9) / var32;
                           anIntArray132[var29] = var26 + (var33 << 9) / var32;
                        } else {
                           anIntArray131[var29] = -5000;
                           var23 = true;
                        }

                        if (var23 || this.anInt405 > 0) {
                           anIntArray134[var29] = var30;
                           anIntArray135[var29] = var33;
                           anIntArray136[var29] = var32;
                        }
                     }

                     try {
                        this.method293(var23, var24, var9);
                     } catch (Exception var35) {
                     }

                  }
               }
            }
         }
      }
   }

   public void method287(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt402; ++var4) {
         this.anIntArray113[var4] = this.anIntArray113[var4] * var3 / 128;
         this.anIntArray114[var4] = this.anIntArray114[var4] * var1 / 128;
         this.anIntArray115[var4] = this.anIntArray115[var4] * var2 / 128;
      }

   }

   public void method284(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt402; ++var4) {
         int[] var10000 = this.anIntArray113;
         var10000[var4] += var1;
         var10000 = this.anIntArray114;
         var10000[var4] += var3;
         var10000 = this.anIntArray115;
         var10000[var4] += var2;
      }

   }

   private void method294(int var1) {
      if (aBooleanArray6[var1]) {
         this.method295(var1);
      } else {
         int var2 = this.anIntArray116[var1];
         int var3 = this.anIntArray117[var1];
         int var4 = this.anIntArray118[var1];
         Draw3D.aBoolean177 = aBooleanArray5[var1];
         if (this.anIntArray124 == null) {
            Draw3D.anInt685 = 0;
         } else {
            Draw3D.anInt685 = this.anIntArray124[var1];
         }

         int var5;
         if (this.anIntArray122 == null) {
            var5 = 0;
         } else {
            var5 = this.anIntArray122[var1] & 3;
         }

         if (var5 == 0) {
            Draw3D.method517(anIntArray132[var2], anIntArray132[var3], anIntArray132[var4], anIntArray131[var2], anIntArray131[var3], anIntArray131[var4], this.anIntArray119[var1], this.anIntArray120[var1], this.anIntArray121[var1]);
         } else if (var5 == 1) {
            Draw3D.method519(anIntArray132[var2], anIntArray132[var3], anIntArray132[var4], anIntArray131[var2], anIntArray131[var3], anIntArray131[var4], anIntArray148[this.anIntArray119[var1]]);
         } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (var5 == 2) {
               var6 = this.anIntArray122[var1] >> 2;
               var7 = this.anIntArray126[var6];
               var8 = this.anIntArray127[var6];
               var9 = this.anIntArray128[var6];
               Draw3D.method521(anIntArray132[var2], anIntArray132[var3], anIntArray132[var4], anIntArray131[var2], anIntArray131[var3], anIntArray131[var4], this.anIntArray119[var1], this.anIntArray120[var1], this.anIntArray121[var1], anIntArray134[var7], anIntArray134[var8], anIntArray134[var9], anIntArray135[var7], anIntArray135[var8], anIntArray135[var9], anIntArray136[var7], anIntArray136[var8], anIntArray136[var9], this.anIntArray125[var1]);
            } else if (var5 == 3) {
               var6 = this.anIntArray122[var1] >> 2;
               var7 = this.anIntArray126[var6];
               var8 = this.anIntArray127[var6];
               var9 = this.anIntArray128[var6];
               Draw3D.method521(anIntArray132[var2], anIntArray132[var3], anIntArray132[var4], anIntArray131[var2], anIntArray131[var3], anIntArray131[var4], this.anIntArray119[var1], this.anIntArray119[var1], this.anIntArray119[var1], anIntArray134[var7], anIntArray134[var8], anIntArray134[var9], anIntArray135[var7], anIntArray135[var8], anIntArray135[var9], anIntArray136[var7], anIntArray136[var8], anIntArray136[var9], this.anIntArray125[var1]);
            }
         }

      }
   }

   public void method280(int var1, int var2, int[] var3) {
      if (var2 != -1) {
         if (var3 != null && var1 != -1) {
            Class22 var4 = Class22.method168(var2);
            if (var4 != null) {
               Class22 var5 = Class22.method168(var1);
               if (var5 == null) {
                  this.method279(var2, (byte)6);
               } else {
                  Class42 var6 = var4.aClass42_1;
                  anInt414 = 0;
                  anInt415 = 0;
                  anInt416 = 0;
                  byte var7 = 0;
                  int var8 = var7 + 1;
                  int var9 = var3[0];

                  int var10;
                  int var11;
                  for(var11 = 0; var11 < var4.anInt239; ++var11) {
                     for(var10 = var4.anIntArray81[var11]; var10 > var9; var9 = var3[var8++]) {
                     }

                     if (var10 != var9 || var6.anIntArray172[var10] == 0) {
                        this.method281(var6.anIntArray172[var10], var6.anIntArrayArray15[var10], var4.anIntArray82[var11], var4.anIntArray83[var11], var4.anIntArray84[var11]);
                     }
                  }

                  anInt414 = 0;
                  anInt415 = 0;
                  anInt416 = 0;
                  var7 = 0;
                  var8 = var7 + 1;
                  var9 = var3[0];

                  for(var10 = 0; var10 < var5.anInt239; ++var10) {
                     for(var11 = var5.anIntArray81[var10]; var11 > var9; var9 = var3[var8++]) {
                     }

                     if (var11 == var9 || var6.anIntArray172[var11] == 0) {
                        this.method281(var6.anIntArray172[var11], var6.anIntArrayArray15[var11], var5.anIntArray82[var10], var5.anIntArray83[var10], var5.anIntArray84[var10]);
                     }
                  }
               }
            }
         } else {
            this.method279(var2, (byte)6);
         }
      }

   }

   public void method276() {
      super.anInt713 = 0;
      this.anInt410 = 0;

      for(int var1 = 0; var1 < this.anInt402; ++var1) {
         int var2 = this.anIntArray114[var1];
         if (-var2 > super.anInt713) {
            super.anInt713 = -var2;
         }

         if (var2 > this.anInt410) {
            this.anInt410 = var2;
         }
      }

      this.anInt412 = (int)(Math.sqrt((double)(this.anInt409 * this.anInt409 + super.anInt713 * super.anInt713)) + 0.99);
      this.anInt411 = this.anInt412 + (int)(Math.sqrt((double)(this.anInt409 * this.anInt409 + this.anInt410 * this.anInt410)) + 0.99);
   }

   private void method293(boolean var1, boolean var2, int var3) {
      int var4;
      for(var4 = 0; var4 < this.anInt411; ++var4) {
         anIntArray137[var4] = 0;
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var11 = 0; var11 < this.anInt403; ++var11) {
         if (this.anIntArray122 == null || this.anIntArray122[var11] != -1) {
            var4 = this.anIntArray116[var11];
            var5 = this.anIntArray117[var11];
            var6 = this.anIntArray118[var11];
            var7 = anIntArray131[var4];
            var8 = anIntArray131[var5];
            var9 = anIntArray131[var6];
            if (!var1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
               if (var2 && this.method296(mouseX, mouseZ, anIntArray132[var4], anIntArray132[var5], anIntArray132[var6], var7, var8, var9)) {
                  anIntArray145[pickedCount++] = var3;
                  var2 = false;
               }

               if ((var7 - var8) * (anIntArray132[var6] - anIntArray132[var5]) - (anIntArray132[var4] - anIntArray132[var5]) * (var9 - var8) > 0) {
                  aBooleanArray6[var11] = false;
                  if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= Draw2D.boundX && var8 <= Draw2D.boundX && var9 <= Draw2D.boundX) {
                     aBooleanArray5[var11] = false;
                  } else {
                     aBooleanArray5[var11] = true;
                  }

                  var10 = (anIntArray133[var4] + anIntArray133[var5] + anIntArray133[var6]) / 3 + this.anInt412;
                  anIntArrayArray12[var10][anIntArray137[var10]++] = var11;
               }
            } else {
               aBooleanArray6[var11] = true;
               var10 = (anIntArray133[var4] + anIntArray133[var5] + anIntArray133[var6]) / 3 + this.anInt412;
               anIntArrayArray12[var10][anIntArray137[var10]++] = var11;
            }
         }
      }

      if (this.anIntArray123 == null) {
         for(var4 = this.anInt411 - 1; var4 >= 0; --var4) {
            var5 = anIntArray137[var4];
            if (var5 > 0) {
               int[] var18 = anIntArrayArray12[var4];

               for(var7 = 0; var7 < var5; ++var7) {
                  this.method294(var18[var7]);
               }
            }
         }

      } else {
         for(var4 = 0; var4 < 12; ++var4) {
            anIntArray138[var4] = 0;
            anIntArray141[var4] = 0;
         }

         int[] var12;
         for(var5 = this.anInt411 - 1; var5 >= 0; --var5) {
            var6 = anIntArray137[var5];
            if (var6 > 0) {
               var12 = anIntArrayArray12[var5];

               for(var8 = 0; var8 < var6; ++var8) {
                  var9 = var12[var8];
                  var10 = this.anIntArray123[var9];
                  var11 = anIntArray138[var10]++;
                  anIntArrayArray13[var10][var11] = var9;
                  if (var10 < 10) {
                     int[] var10000 = anIntArray141;
                     var10000[var10] += var5;
                  } else if (var10 == 10) {
                     anIntArray139[var11] = var5;
                  } else {
                     anIntArray140[var11] = var5;
                  }
               }
            }
         }

         var6 = 0;
         if (anIntArray138[1] > 0 || anIntArray138[2] > 0) {
            var6 = (anIntArray141[1] + anIntArray141[2]) / (anIntArray138[1] + anIntArray138[2]);
         }

         var7 = 0;
         if (anIntArray138[3] > 0 || anIntArray138[4] > 0) {
            var7 = (anIntArray141[3] + anIntArray141[4]) / (anIntArray138[3] + anIntArray138[4]);
         }

         var8 = 0;
         if (anIntArray138[6] > 0 || anIntArray138[8] > 0) {
            var8 = (anIntArray141[6] + anIntArray141[8]) / (anIntArray138[6] + anIntArray138[8]);
         }

         var10 = 0;
         var11 = anIntArray138[10];
         var12 = anIntArrayArray13[10];
         int[] var13 = anIntArray139;
         if (var11 == 0) {
            var10 = 0;
            var11 = anIntArray138[11];
            var12 = anIntArrayArray13[11];
            var13 = anIntArray140;
         }

         if (var11 > 0) {
            var9 = var13[0];
         } else {
            var9 = -1000;
         }

         for(int var14 = 0; var14 < 10; ++var14) {
            while(var14 == 0 && var9 > var6) {
               this.method294(var12[var10++]);
               if (var10 == var11 && var12 != anIntArrayArray13[11]) {
                  var10 = 0;
                  var11 = anIntArray138[11];
                  var12 = anIntArrayArray13[11];
                  var13 = anIntArray140;
               }

               if (var10 < var11) {
                  var9 = var13[var10];
               } else {
                  var9 = -1000;
               }
            }

            while(var14 == 3 && var9 > var7) {
               this.method294(var12[var10++]);
               if (var10 == var11 && var12 != anIntArrayArray13[11]) {
                  var10 = 0;
                  var11 = anIntArray138[11];
                  var12 = anIntArrayArray13[11];
                  var13 = anIntArray140;
               }

               if (var10 < var11) {
                  var9 = var13[var10];
               } else {
                  var9 = -1000;
               }
            }

            while(var14 == 5 && var9 > var8) {
               this.method294(var12[var10++]);
               if (var10 == var11 && var12 != anIntArrayArray13[11]) {
                  var10 = 0;
                  var11 = anIntArray138[11];
                  var12 = anIntArrayArray13[11];
                  var13 = anIntArray140;
               }

               if (var10 < var11) {
                  var9 = var13[var10];
               } else {
                  var9 = -1000;
               }
            }

            int var15 = anIntArray138[var14];
            int[] var16 = anIntArrayArray13[var14];

            for(int var17 = 0; var17 < var15; ++var17) {
               this.method294(var16[var17]);
            }
         }

         while(var9 != -1000) {
            this.method294(var12[var10++]);
            if (var10 == var11 && var12 != anIntArrayArray13[11]) {
               var10 = 0;
               var12 = anIntArrayArray13[11];
               var11 = anIntArray138[11];
               var13 = anIntArray140;
            }

            if (var10 < var11) {
               var9 = var13[var10];
            } else {
               var9 = -1000;
            }
         }

      }
   }

   private void method277() {
      super.anInt713 = 0;
      this.anInt409 = 0;
      this.anInt410 = 0;
      int var1 = 32767;
      int var2 = -32767;
      int var3 = -32767;
      int var4 = 32767;

      for(int var5 = 0; var5 < this.anInt402; ++var5) {
         int var6 = this.anIntArray113[var5];
         int var7 = this.anIntArray114[var5];
         int var8 = this.anIntArray115[var5];
         if (var6 < var1) {
            var1 = var6;
         }

         if (var6 > var2) {
            var2 = var6;
         }

         if (var8 < var4) {
            var4 = var8;
         }

         if (var8 > var3) {
            var3 = var8;
         }

         if (-var7 > super.anInt713) {
            super.anInt713 = -var7;
         }

         if (var7 > this.anInt410) {
            this.anInt410 = var7;
         }

         int var9 = var6 * var6 + var8 * var8;
         if (var9 > this.anInt409) {
            this.anInt409 = var9;
         }
      }

      this.anInt409 = (int)Math.sqrt((double)this.anInt409);
      this.anInt412 = (int)Math.sqrt((double)(this.anInt409 * this.anInt409 + super.anInt713 * super.anInt713));
      this.anInt411 = this.anInt412 + (int)Math.sqrt((double)(this.anInt409 * this.anInt409 + this.anInt410 * this.anInt410));
      this.anInt407 = (var1 << 16) + (var2 & 65535);
      this.anInt408 = (var3 << 16) + (var4 & 65535);
   }

   public void method288(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var8 = var2 * var7 >> 8;
      if (this.anIntArray119 == null) {
         this.anIntArray119 = new int[this.anInt403];
         this.anIntArray120 = new int[this.anInt403];
         this.anIntArray121 = new int[this.anInt403];
      }

      int var9;
      if (super.aClass41Array10 == null) {
         super.aClass41Array10 = new Class41[this.anInt402];

         for(var9 = 0; var9 < this.anInt402; ++var9) {
            super.aClass41Array10[var9] = new Class41();
         }
      }

      int var10;
      for(var9 = 0; var9 < this.anInt403; ++var9) {
         var10 = this.anIntArray116[var9];
         int var11 = this.anIntArray117[var9];
         int var12 = this.anIntArray118[var9];
         int var13 = this.anIntArray113[var11] - this.anIntArray113[var10];
         int var14 = this.anIntArray114[var11] - this.anIntArray114[var10];
         int var15 = this.anIntArray115[var11] - this.anIntArray115[var10];
         int var16 = this.anIntArray113[var12] - this.anIntArray113[var10];
         int var17 = this.anIntArray114[var12] - this.anIntArray114[var10];
         int var18 = this.anIntArray115[var12] - this.anIntArray115[var10];
         int var19 = var14 * var18 - var17 * var15;
         int var20 = var15 * var16 - var18 * var13;

         int var21;
         for(var21 = var13 * var17 - var16 * var14; var19 > 8192 || var20 > 8192 || var21 > 8192 || var19 < -8192 || var20 < -8192 || var21 < -8192; var21 >>= 1) {
            var19 >>= 1;
            var20 >>= 1;
         }

         int var22 = (int)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21));
         if (var22 <= 0) {
            var22 = 1;
         }

         var19 = var19 * 256 / var22;
         var20 = var20 * 256 / var22;
         var21 = var21 * 256 / var22;
         if (this.anIntArray122 != null && (this.anIntArray122[var9] & 1) != 0) {
            int var23 = var1 + (var3 * var19 + var4 * var20 + var5 * var21) / (var8 + var8 / 2);
            this.anIntArray119[var9] = method291(this.anIntArray125[var9], var23, this.anIntArray122[var9]);
         } else {
            Class41 var26 = super.aClass41Array10[var10];
            var26.anInt607 += var19;
            var26.anInt608 += var20;
            var26.anInt609 += var21;
            ++var26.anInt610;
            Class41 var24 = super.aClass41Array10[var11];
            var24.anInt607 += var19;
            var24.anInt608 += var20;
            var24.anInt609 += var21;
            ++var24.anInt610;
            Class41 var25 = super.aClass41Array10[var12];
            var25.anInt607 += var19;
            var25.anInt608 += var20;
            var25.anInt609 += var21;
            ++var25.anInt610;
         }
      }

      if (var6) {
         this.method290(var1, var8, var3, var4, var5);
      } else {
         this.aClass41Array6 = new Class41[this.anInt402];

         for(var10 = 0; var10 < this.anInt402; ++var10) {
            Class41 var27 = super.aClass41Array10[var10];
            Class41 var28 = this.aClass41Array6[var10] = new Class41();
            var28.anInt607 = var27.anInt607;
            var28.anInt608 = var27.anInt608;
            var28.anInt609 = var27.anInt609;
            var28.anInt610 = var27.anInt610;
         }

         this.anInt406 = (var1 << 16) + (var8 & 65535);
      }

      if (var6) {
         this.method275(this.anInt398);
      } else {
         this.method277();
      }

   }

   public void method275(int var1) {
      super.anInt713 = 0;
      this.anInt409 = 0;
      this.anInt410 = 0;

      int var2;
      for(var2 = 0; var2 < this.anInt402; ++var2) {
         int var3 = this.anIntArray113[var2];
         int var4 = this.anIntArray114[var2];
         int var5 = this.anIntArray115[var2];
         if (-var4 > super.anInt713) {
            super.anInt713 = -var4;
         }

         if (var4 > this.anInt410) {
            this.anInt410 = var4;
         }

         int var6 = var3 * var3 + var5 * var5;
         if (var6 > this.anInt409) {
            this.anInt409 = var6;
         }
      }

      this.anInt409 = (int)(Math.sqrt((double)this.anInt409) + 0.99);
      this.anInt412 = (int)(Math.sqrt((double)(this.anInt409 * this.anInt409 + super.anInt713 * super.anInt713)) + 0.99);
      var2 = 64 / var1;
      this.anInt411 = this.anInt412 + (int)(Math.sqrt((double)(this.anInt409 * this.anInt409 + this.anInt410 * this.anInt410)) + 0.99);
   }

   public void method289() {
      int var1 = this.anInt406 >> 16;
      int var2 = this.anInt406 << 16 >> 16;
      this.method290(var1, var2, -50, -10, -50);
   }

   private void method281(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var1 == 0) {
         var7 = 0;
         anInt414 = 0;
         anInt415 = 0;
         anInt416 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var11 = var2[var8];
            if (var11 < this.anIntArrayArray10.length) {
               int[] var12 = this.anIntArrayArray10[var11];

               for(var9 = 0; var9 < var12.length; ++var9) {
                  var10 = var12[var9];
                  anInt414 += this.anIntArray113[var10];
                  anInt415 += this.anIntArray114[var10];
                  anInt416 += this.anIntArray115[var10];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            anInt414 = anInt414 / var7 + var3;
            anInt415 = anInt415 / var7 + var4;
            anInt416 = anInt416 / var7 + var5;
         } else {
            anInt414 = var3;
            anInt415 = var4;
            anInt416 = var5;
         }

      } else {
         int[] var10000;
         int[] var18;
         int var19;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.anIntArrayArray10.length) {
                  var18 = this.anIntArrayArray10[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     var10000 = this.anIntArray113;
                     var10000[var9] += var3;
                     var10000 = this.anIntArray114;
                     var10000[var9] += var4;
                     var10000 = this.anIntArray115;
                     var10000[var9] += var5;
                  }
               }
            }
         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.anIntArrayArray10.length) {
                  var18 = this.anIntArrayArray10[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     var10000 = this.anIntArray113;
                     var10000[var9] -= anInt414;
                     var10000 = this.anIntArray114;
                     var10000[var9] -= anInt415;
                     var10000 = this.anIntArray115;
                     var10000[var9] -= anInt416;
                     var10 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = anIntArray146[var14];
                        var16 = anIntArray147[var14];
                        var17 = this.anIntArray114[var9] * var15 + this.anIntArray113[var9] * var16 >> 16;
                        this.anIntArray114[var9] = this.anIntArray114[var9] * var16 - this.anIntArray113[var9] * var15 >> 16;
                        this.anIntArray113[var9] = var17;
                     }

                     if (var10 != 0) {
                        var15 = anIntArray146[var10];
                        var16 = anIntArray147[var10];
                        var17 = this.anIntArray114[var9] * var16 - this.anIntArray115[var9] * var15 >> 16;
                        this.anIntArray115[var9] = this.anIntArray114[var9] * var15 + this.anIntArray115[var9] * var16 >> 16;
                        this.anIntArray114[var9] = var17;
                     }

                     if (var13 != 0) {
                        var15 = anIntArray146[var13];
                        var16 = anIntArray147[var13];
                        var17 = this.anIntArray115[var9] * var15 + this.anIntArray113[var9] * var16 >> 16;
                        this.anIntArray115[var9] = this.anIntArray115[var9] * var16 - this.anIntArray113[var9] * var15 >> 16;
                        this.anIntArray113[var9] = var17;
                     }

                     var10000 = this.anIntArray113;
                     var10000[var9] += anInt414;
                     var10000 = this.anIntArray114;
                     var10000[var9] += anInt415;
                     var10000 = this.anIntArray115;
                     var10000[var9] += anInt416;
                  }
               }
            }
         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.anIntArrayArray10.length) {
                  var18 = this.anIntArrayArray10[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     var10000 = this.anIntArray113;
                     var10000[var9] -= anInt414;
                     var10000 = this.anIntArray114;
                     var10000[var9] -= anInt415;
                     var10000 = this.anIntArray115;
                     var10000[var9] -= anInt416;
                     this.anIntArray113[var9] = this.anIntArray113[var9] * var3 / 128;
                     this.anIntArray114[var9] = this.anIntArray114[var9] * var4 / 128;
                     this.anIntArray115[var9] = this.anIntArray115[var9] * var5 / 128;
                     var10000 = this.anIntArray113;
                     var10000[var9] += anInt414;
                     var10000 = this.anIntArray114;
                     var10000[var9] += anInt415;
                     var10000 = this.anIntArray115;
                     var10000[var9] += anInt416;
                  }
               }
            }
         } else if (var1 == 5 && this.anIntArrayArray11 != null && this.anIntArray124 != null) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.anIntArrayArray11.length) {
                  var18 = this.anIntArrayArray11[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var9 = var18[var19];
                     var10000 = this.anIntArray124;
                     var10000[var9] += var3 * 8;
                     if (this.anIntArray124[var9] < 0) {
                        this.anIntArray124[var9] = 0;
                     }

                     if (this.anIntArray124[var9] > 255) {
                        this.anIntArray124[var9] = 255;
                     }
                  }
               }
            }
         }

      }
   }

   public void method283(int var1, int var2) {
      int var3 = anIntArray146[var1];
      int var4 = anIntArray147[var1];

      for(int var5 = 0; var5 < this.anInt402; ++var5) {
         int var6 = this.anIntArray114[var5] * var4 - this.anIntArray115[var5] * var3 >> 16;
         this.anIntArray115[var5] = this.anIntArray114[var5] * var3 + this.anIntArray115[var5] * var4 >> 16;
         this.anIntArray114[var5] = var6;
      }

      boolean var7 = false;
   }

   public void method286() {
      int var1;
      for(var1 = 0; var1 < this.anInt402; ++var1) {
         this.anIntArray115[var1] = -this.anIntArray115[var1];
      }

      for(var1 = 0; var1 < this.anInt403; ++var1) {
         int var2 = this.anIntArray116[var1];
         this.anIntArray116[var1] = this.anIntArray118[var1];
         this.anIntArray118[var1] = var2;
      }

   }

   private boolean method296(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if (var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else if (var1 < var6 && var1 < var7 && var1 < var8) {
         return false;
      } else {
         return var1 <= var6 || var1 <= var7 || var1 <= var8;
      }
   }

   public void method282() {
      for(int var1 = 0; var1 < this.anInt402; ++var1) {
         int var2 = this.anIntArray113[var1];
         this.anIntArray113[var1] = this.anIntArray115[var1];
         this.anIntArray115[var1] = -var2;
      }

   }

   public void method292(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = Draw3D.anInt686;
      int var8 = Draw3D.anInt687;
      int var9 = anIntArray146[0];
      int var10 = anIntArray147[0];
      int var11 = anIntArray146[var1];
      int var12 = anIntArray147[var1];
      int var13 = anIntArray146[var2];
      int var14 = anIntArray147[var2];
      int var15 = anIntArray146[var3];
      int var16 = anIntArray147[var3];
      int var17 = var5 * var15 + var6 * var16 >> 16;

      for(int var18 = 0; var18 < this.anInt402; ++var18) {
         int var19 = this.anIntArray113[var18];
         int var20 = this.anIntArray114[var18];
         int var21 = this.anIntArray115[var18];
         int var22;
         if (var2 != 0) {
            var22 = var20 * var13 + var19 * var14 >> 16;
            var20 = var20 * var14 - var19 * var13 >> 16;
            var19 = var22;
         }

         if (var1 != 0) {
            var22 = var21 * var11 + var19 * var12 >> 16;
            var21 = var21 * var12 - var19 * var11 >> 16;
            var19 = var22;
         }

         var19 += var4;
         var20 += var5;
         var21 += var6;
         var22 = var20 * var16 - var21 * var15 >> 16;
         var21 = var20 * var15 + var21 * var16 >> 16;
         anIntArray133[var18] = var21 - var17;
         anIntArray131[var18] = var7 + (var19 << 9) / var21;
         anIntArray132[var18] = var8 + (var22 << 9) / var21;
         if (this.anInt405 > 0) {
            anIntArray134[var18] = var19;
            anIntArray135[var18] = var22;
            anIntArray136[var18] = var21;
         }
      }

      try {
         this.method293(false, false, 0);
      } catch (Exception var24) {
      }

   }

   private int method274(Model var1, int var2) {
      int var3 = -1;
      int var4 = var1.anIntArray113[var2];
      int var5 = var1.anIntArray114[var2];
      int var6 = var1.anIntArray115[var2];

      for(int var7 = 0; var7 < this.anInt402; ++var7) {
         if (var4 == this.anIntArray113[var7] && var5 == this.anIntArray114[var7] && var6 == this.anIntArray115[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.anIntArray113[this.anInt402] = var4;
         this.anIntArray114[this.anInt402] = var5;
         this.anIntArray115[this.anInt402] = var6;
         if (var1.anIntArray129 != null) {
            this.anIntArray129[this.anInt402] = var1.anIntArray129[var2];
         }

         var3 = this.anInt402++;
      }

      return var3;
   }

   public static Model createModel(int var0) {
      if (renderables == null) {
         return null;
      } else {
         Class27 var1 = renderables[var0];
         if (var1 == null) {
            aClass33_1.method552(var0);
            return null;
         } else {
            return new Model(var0, -478);
         }
      }
   }

   public static boolean method272(int var0) {
      if (renderables == null) {
         return false;
      } else {
         Class27 var1 = renderables[var0];
         if (var1 == null) {
            aClass33_1.method552(var0);
            return false;
         } else {
            return true;
         }
      }
   }

   public static void method269(byte[] var0, int var1) {
      if (var0 == null) {
         Class27 var2 = renderables[var1] = new Class27();
         var2.anInt330 = 0;
         var2.anInt331 = 0;
         var2.anInt332 = 0;
      } else {
         Packet var14 = new Packet(var0);
         var14.pos = var0.length - 18;
         Class27 var3 = renderables[var1] = new Class27();
         var3.aByteArray11 = var0;
         var3.anInt330 = var14.g2();
         var3.anInt331 = var14.g2();
         var3.anInt332 = var14.g1();
         int var4 = var14.g1();
         int var5 = var14.g1();
         int var6 = var14.g1();
         int var7 = var14.g1();
         int var8 = var14.g1();
         int var9 = var14.g2();
         int var10 = var14.g2();
         int var11 = var14.g2();
         int var12 = var14.g2();
         var3.anInt333 = 0;
         int var13 = var3.anInt330 + 0;
         var3.anInt339 = var13;
         var13 += var3.anInt331;
         var3.anInt342 = var13;
         if (var5 == 255) {
            var13 += var3.anInt331;
         } else {
            var3.anInt342 = -var5 - 1;
         }

         var3.anInt344 = var13;
         if (var7 == 1) {
            var13 += var3.anInt331;
         } else {
            var3.anInt344 = -1;
         }

         var3.anInt341 = var13;
         if (var4 == 1) {
            var13 += var3.anInt331;
         } else {
            var3.anInt341 = -1;
         }

         var3.anInt337 = var13;
         if (var8 == 1) {
            var13 += var3.anInt330;
         } else {
            var3.anInt337 = -1;
         }

         var3.anInt343 = var13;
         if (var6 == 1) {
            var13 += var3.anInt331;
         } else {
            var3.anInt343 = -1;
         }

         var3.anInt338 = var13;
         var13 += var12;
         var3.anInt340 = var13;
         var13 += var3.anInt331 * 2;
         var3.anInt345 = var13;
         var13 += var3.anInt332 * 6;
         var3.anInt334 = var13;
         var13 += var9;
         var3.anInt335 = var13;
         var13 += var10;
         var3.anInt336 = var13;
      }

   }

   public static void method270(int var0) {
      renderables[var0] = null;
   }

   private static int method291(int var0, int var1, int var2) {
      if ((var2 & 2) == 2) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         return 127 - var1;
      } else {
         var1 = var1 * (var0 & 127) >> 7;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   public static void method268(int var0, Class33 var1) {
      renderables = new Class27[var0];
      aClass33_1 = var1;
   }

   public static void method267() {
      renderables = null;
      aBooleanArray5 = null;
      aBooleanArray6 = null;
      anIntArray131 = null;
      anIntArray132 = null;
      anIntArray133 = null;
      anIntArray134 = null;
      anIntArray135 = null;
      anIntArray136 = null;
      anIntArray137 = null;
      anIntArrayArray12 = null;
      anIntArray138 = null;
      anIntArrayArray13 = null;
      anIntArray139 = null;
      anIntArray140 = null;
      anIntArray141 = null;
      anIntArray146 = null;
      anIntArray147 = null;
      anIntArray148 = null;
      anIntArray149 = null;
   }
}
