public final class NpcType {
   public static LruCache aClass34_6 = new LruCache(30);
   private static byte aByte32 = 6;
   public static Client aClient3;
   private static int anInt583;
   private static NpcType[] aClass38Array1;
   private static Packet aClass10_Sub1_Sub3_3;
   private static int[] anIntArray169;
   private static int anInt578;
   private int anInt580 = -1;
   public int[] anIntArray165;
   public int anInt564 = -1;
   private int anInt582 = -1;
   private int[] anIntArray166;
   private boolean aBoolean140 = true;
   public long aLong19 = -1L;
   private int anInt565 = 932;
   public boolean aBoolean141 = true;
   private int anInt566 = -1;
   private int[] anIntArray167;
   public String name = "null";
   public int anInt572 = -1;
   public byte aByte31 = 1;
   public byte[] aByteArray14;
   private int anInt567 = 128;
   public int anInt576 = -1;
   private int[] anIntArray168;
   public String[] aStringArray4;
   private int anInt568 = 128;
   public boolean aBoolean143 = false;
   private int anInt577 = -1;
   public int anInt569 = -1;
   public int anInt575 = -1;
   private int[] anIntArray170;
   public int anInt571 = -1;
   public boolean aBoolean142 = true;
   private int anInt570 = -1;
   private int anInt584;
   private int anInt581;
   public int anInt574 = -1;
   private int anInt573 = 7;
   public int anInt579 = 32;
   private boolean aBoolean144 = false;
   private boolean aBoolean145 = false;

   private NpcType() {
   }

   public NpcType method406() {
      int var1 = -1;
      if (this.anInt580 != -1) {
         VarbitType var2 = VarbitType.aClass50Array1[this.anInt580];
         int var3 = var2.anInt800;
         int var4 = var2.anInt801;
         int var5 = var2.anInt802;
         int var6 = Client.anIntArray262[var5 - var4];
         var1 = aClient3.anIntArray244[var3] >> var4 & var6;
      } else if (this.anInt582 != -1) {
         var1 = aClient3.anIntArray244[this.anInt582];
      }

      return var1 >= 0 && var1 < this.anIntArray165.length && this.anIntArray165[var1] != -1 ? method407(this.anIntArray165[var1]) : null;
   }

   public Model method402() {
      if (this.anIntArray165 != null) {
         NpcType var1 = this.method406();
         return var1 == null ? null : var1.method402();
      } else if (this.anIntArray166 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.anIntArray166.length; ++var2) {
            if (!Model.method272(this.anIntArray166[var2])) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            Model[] var6 = new Model[this.anIntArray166.length];

            for(int var3 = 0; var3 < this.anIntArray166.length; ++var3) {
               var6[var3] = Model.createModel(this.anIntArray166[var3]);
            }

            Model var7;
            if (var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new Model(var6.length, var6);
            }

            if (this.anIntArray168 != null) {
               for(int var4 = 0; var4 < this.anIntArray168.length; ++var4) {
                  var7.recolor(this.anIntArray168[var4], this.anIntArray170[var4]);
               }
            }

            return var7;
         }
      }
   }

   public Model method405(int var1, int var2, int[] var3) {
      if (this.anIntArray165 != null) {
         NpcType var10 = this.method406();
         return var10 == null ? null : var10.method405(var1, var2, var3);
      } else {
         Model var4 = (Model)aClass34_6.get(this.aLong19);
         if (var4 == null) {
            boolean var5 = false;

            for(int var6 = 0; var6 < this.anIntArray167.length; ++var6) {
               if (!Model.method272(this.anIntArray167[var6])) {
                  var5 = true;
               }
            }

            if (var5) {
               return null;
            }

            Model[] var9 = new Model[this.anIntArray167.length];

            int var7;
            for(var7 = 0; var7 < this.anIntArray167.length; ++var7) {
               var9[var7] = Model.createModel(this.anIntArray167[var7]);
            }

            if (var9.length == 1) {
               var4 = var9[0];
            } else {
               var4 = new Model(var9.length, var9);
            }

            if (this.anIntArray168 != null) {
               for(var7 = 0; var7 < this.anIntArray168.length; ++var7) {
                  var4.recolor(this.anIntArray168[var7], this.anIntArray170[var7]);
               }
            }

            var4.method278();
            var4.method288(this.anInt584 + 64, this.anInt581 + 850, -30, -50, -30, true);
            aClass34_6.put(var4, this.aLong19);
         }

         Model var8 = Model.aClass10_Sub1_Sub2_Sub4_1;
         var8.method273(Class22.method169(this.aBoolean140, var1) & Class22.method169(this.aBoolean140, var2), var4);
         if (var1 != -1 && var2 != -1) {
            var8.method280(var2, var1, var3);
         } else if (var1 != -1) {
            var8.method279(var1, (byte)6);
         }

         if (this.anInt568 != 128 || this.anInt567 != 128) {
            var8.method287(this.anInt567, this.anInt568, this.anInt568);
         }

         var8.method275(this.anInt565);
         var8.anIntArrayArray11 = null;
         var8.anIntArrayArray10 = null;
         if (this.aByte31 == 1) {
            var8.aBoolean106 = true;
         }

         return var8;
      }
   }

   public boolean method403() {
      if (this.anIntArray165 == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.anInt580 != -1) {
            VarbitType var2 = VarbitType.aClass50Array1[this.anInt580];
            int var3 = var2.anInt800;
            int var4 = var2.anInt801;
            int var5 = var2.anInt802;
            int var6 = Client.anIntArray262[var5 - var4];
            var1 = aClient3.anIntArray244[var3] >> var4 & var6;
         } else if (this.anInt582 != -1) {
            var1 = aClient3.anIntArray244[this.anInt582];
         }

         return var1 >= 0 && var1 < this.anIntArray165.length && this.anIntArray165[var1] != -1;
      }
   }

   private void method400(byte var1, Packet var2) {
      if (var1 != 6) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;

         while(true) {
            while(true) {
               int var4 = var2.g1();
               if (var4 == 0) {
                  return;
               }

               int var5;
               int var6;
               if (var4 == 1) {
                  var5 = var2.g1();
                  this.anIntArray167 = new int[var5];

                  for(var6 = 0; var6 < var5; ++var6) {
                     this.anIntArray167[var6] = var2.g2();
                  }
               } else if (var4 == 2) {
                  this.name = var2.gjstr();
               } else if (var4 == 3) {
                  this.aByteArray14 = var2.gstrbyte();
               } else if (var4 == 12) {
                  this.aByte31 = var2.g1b();
               } else if (var4 == 13) {
                  this.anInt564 = var2.g2();
               } else if (var4 == 14) {
                  this.anInt576 = var2.g2();
               } else if (var4 == 17) {
                  this.anInt576 = var2.g2();
                  this.anInt575 = var2.g2();
                  this.anInt574 = var2.g2();
                  this.anInt569 = var2.g2();
               } else if (var4 >= 30 && var4 < 40) {
                  if (this.aStringArray4 == null) {
                     this.aStringArray4 = new String[5];
                  }

                  this.aStringArray4[var4 - 30] = var2.gjstr();
                  if (this.aStringArray4[var4 - 30].equalsIgnoreCase("hidden")) {
                     this.aStringArray4[var4 - 30] = null;
                  }
               } else if (var4 == 40) {
                  var5 = var2.g1();
                  this.anIntArray168 = new int[var5];
                  this.anIntArray170 = new int[var5];

                  for(var6 = 0; var6 < var5; ++var6) {
                     this.anIntArray168[var6] = var2.g2();
                     this.anIntArray170[var6] = var2.g2();
                  }
               } else if (var4 == 60) {
                  var5 = var2.g1();
                  this.anIntArray166 = new int[var5];

                  for(var6 = 0; var6 < var5; ++var6) {
                     this.anIntArray166[var6] = var2.g2();
                  }
               } else if (var4 == 90) {
                  this.anInt577 = var2.g2();
               } else if (var4 == 91) {
                  this.anInt566 = var2.g2();
               } else if (var4 == 92) {
                  this.anInt570 = var2.g2();
               } else if (var4 == 93) {
                  this.aBoolean142 = false;
               } else if (var4 == 95) {
                  this.anInt572 = var2.g2();
               } else if (var4 == 97) {
                  this.anInt568 = var2.g2();
               } else if (var4 == 98) {
                  this.anInt567 = var2.g2();
               } else if (var4 == 99) {
                  this.aBoolean143 = true;
               } else if (var4 == 100) {
                  this.anInt584 = var2.g1b();
               } else if (var4 == 101) {
                  this.anInt581 = var2.g1b() * 5;
               } else if (var4 == 102) {
                  this.anInt571 = var2.g2();
               } else if (var4 == 103) {
                  this.anInt579 = var2.g2();
               } else if (var4 == 106) {
                  this.anInt580 = var2.g2();
                  if (this.anInt580 == 65535) {
                     this.anInt580 = -1;
                  }

                  this.anInt582 = var2.g2();
                  if (this.anInt582 == 65535) {
                     this.anInt582 = -1;
                  }

                  var5 = var2.g1();
                  this.anIntArray165 = new int[var5 + 1];

                  for(var6 = 0; var6 <= var5; ++var6) {
                     this.anIntArray165[var6] = var2.g2();
                     if (this.anIntArray165[var6] == 65535) {
                        this.anIntArray165[var6] = -1;
                     }
                  }
               } else if (var4 == 107) {
                  this.aBoolean141 = false;
               }
            }
         }
      }
   }

   public static NpcType method407(int var0) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if (aClass38Array1[var1].aLong19 == (long)var0) {
            return aClass38Array1[var1];
         }
      }

      anInt583 = (anInt583 + 1) % 20;
      NpcType var2 = aClass38Array1[anInt583] = new NpcType();
      aClass10_Sub1_Sub3_3.pos = anIntArray169[var0];
      var2.aLong19 = (long)var0;
      var2.method400(aByte32, aClass10_Sub1_Sub3_3);
      return var2;
   }

   public static void method401() {
      aClass34_6 = null;
      anIntArray169 = null;
      aClass38Array1 = null;
      aClass10_Sub1_Sub3_3 = null;
   }

   public static void unpack(Jagfile var0) {
      aClass10_Sub1_Sub3_3 = new Packet(var0.read("npc.dat", (byte[])null));
      Packet var1 = new Packet(var0.read("npc.idx", (byte[])null));
      anInt578 = var1.g2();
      anIntArray169 = new int[anInt578];
      int var2 = 2;

      int var3;
      for(var3 = 0; var3 < anInt578; ++var3) {
         anIntArray169[var3] = var2;
         var2 += var1.g2();
      }

      aClass38Array1 = new NpcType[20];

      for(var3 = 0; var3 < 20; ++var3) {
         aClass38Array1[var3] = new NpcType();
      }

   }
}
