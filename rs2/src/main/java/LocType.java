public final class LocType {
   public static LruCache aClass34_8 = new LruCache(500);
   public static LruCache aClass34_7 = new LruCache(40);
   public static Client aClient4;
   private static Model[] aClass10_Sub1_Sub2_Sub4Array1 = new Model[4];
   private static int anInt698;
   private static LocType[] aClass48Array1;
   public static boolean aBoolean183;
   private static byte aByte41 = 6;
   private static Packet aClass10_Sub1_Sub3_5;
   private static int[] anIntArray187;
   private static int anInt711;
   private int[] anIntArray189;
   private int[] anIntArray188;
   public int anInt699;
   private int anInt695 = -992;
   public int anInt701;
   public int anInt696 = -1;
   public boolean hillskew;
   public String name = "null";
   private boolean aBoolean184 = true;
   private boolean aBoolean186;
   public boolean active;
   private boolean sharelight;
   public int[] anIntArray192;
   private byte aByte40 = -113;
   public byte[] desc;
   public boolean blockwalk;
   private int[] recol_s;
   private boolean aBoolean185 = true;
   public String[] op;
   public boolean blockrange;
   private int[] recol_d;
   private int anInt704;
   public int width;
   public int length;
   private boolean mirror;
   public int mapscene;
   public int forceapproach;
   public boolean occlude;
   private int resizex;
   public int anim;
   private int resizey;
   public int wallwidth;
   private byte ambient;
   private byte contrast;
   private int resizez;
   private int offsetx;
   public int mapfunction;
   public boolean shadow;
   private int offsety;
   private int offsetz;
   public boolean forcedecor;

   private LocType() {
   }

   private Model method527(int var1, int var2, int var3) {
      Model var4 = null;
      long var5;
      boolean var7;
      int var8;
      Model var9;
      int var11;
      if (this.anIntArray189 == null) {
         if (var3 != 10) {
            return null;
         }

         var5 = (long)((this.anInt696 << 6) + var1) + ((long)(var2 + 1) << 32);
         Model var13 = (Model)aClass34_7.get(var5);
         if (var13 != null) {
            return var13;
         }

         if (this.anIntArray188 == null) {
            return null;
         }

         var7 = this.mirror ^ var1 > 3;
         var11 = this.anIntArray188.length;

         for(var8 = 0; var8 < var11; ++var8) {
            int var12 = this.anIntArray188[var8];
            if (var7) {
               var12 += 65536;
            }

            var4 = (Model)aClass34_8.get((long)var12);
            if (var4 == null) {
               var4 = Model.createModel(var12 & 65535);
               if (var4 == null) {
                  return null;
               }

               if (var7) {
                  var4.method286();
               }

               aClass34_8.put(var4, (long)var12);
            }

            if (var11 > 1) {
               aClass10_Sub1_Sub2_Sub4Array1[var8] = var4;
            }
         }

         if (var11 > 1) {
            var4 = new Model(var11, aClass10_Sub1_Sub2_Sub4Array1);
         }
      } else {
         int var10 = -1;

         for(var11 = 0; var11 < this.anIntArray189.length; ++var11) {
            if (this.anIntArray189[var11] == var3) {
               var10 = var11;
               break;
            }
         }

         if (var10 == -1) {
            return null;
         }

         var5 = (long)((this.anInt696 << 6) + (var10 << 3) + var1) + ((long)(var2 + 1) << 32);
         var9 = (Model)aClass34_7.get(var5);
         if (var9 != null) {
            return var9;
         }

         var8 = this.anIntArray188[var10];
         boolean var15 = this.mirror ^ var1 > 3;
         if (var15) {
            var8 += 65536;
         }

         var4 = (Model)aClass34_8.get((long)var8);
         if (var4 == null) {
            var4 = Model.createModel(var8 & 65535);
            if (var4 == null) {
               return null;
            }

            if (var15) {
               var4.method286();
            }

            aClass34_8.put(var4, (long)var8);
         }
      }

      boolean var14;
      if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
         var14 = false;
      } else {
         var14 = true;
      }

      if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
         var7 = false;
      } else {
         var7 = true;
      }

      var9 = new Model(var1 == 0 && var2 == -1 && !var14 && !var7, false, this.recol_s == null, var4, Class22.method169(this.aBoolean184, var2));
      if (var2 != -1) {
         var9.method278();
         var9.method279(var2, (byte)6);
         var9.anIntArrayArray11 = null;
         var9.anIntArrayArray10 = null;
      }

      while(var1-- > 0) {
         var9.method282();
      }

      if (this.recol_s != null) {
         for(var8 = 0; var8 < this.recol_s.length; ++var8) {
            var9.recolor(this.recol_s[var8], this.recol_d[var8]);
         }
      }

      if (var14) {
         var9.method287(this.resizey, this.resizez, this.resizex);
      }

      if (var7) {
         var9.method284(this.offsetx, this.offsetz, this.offsety);
      }

      var9.method288(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);
      if (this.anInt704 == 1) {
         var9.anInt413 = var9.anInt713;
      }

      aClass34_7.put(var9, var5);
      return var9;
   }

   public LocType method524() {
      int var1 = -1;
      if (this.anInt699 != -1) {
         VarbitType var2 = VarbitType.aClass50Array1[this.anInt699];
         int var3 = var2.anInt800;
         int var4 = var2.anInt801;
         int var5 = var2.anInt802;
         int var6 = Client.anIntArray262[var5 - var4];
         var1 = aClient4.anIntArray244[var3] >> var4 & var6;
      } else if (this.anInt701 != -1) {
         var1 = aClient4.anIntArray244[this.anInt701];
      }

      return var1 >= 0 && var1 < this.anIntArray192.length && this.anIntArray192[var1] != -1 ? method523(this.anIntArray192[var1]) : null;
   }

   private void method529() {
      this.anIntArray188 = null;
      this.anIntArray189 = null;
      this.name = "null";
      this.desc = null;
      this.recol_s = null;
      this.recol_d = null;
      this.width = 1;
      this.length = 1;
      this.blockwalk = true;
      this.blockrange = true;
      this.active = false;
      this.hillskew = false;
      this.sharelight = false;
      this.occlude = false;
      this.anim = -1;
      this.wallwidth = 16;
      this.ambient = 0;
      this.contrast = 0;
      this.op = null;
      this.mapfunction = -1;
      this.mapscene = -1;
      this.mirror = false;
      this.shadow = true;
      this.resizex = 128;
      this.resizey = 128;
      this.resizez = 128;
      this.forceapproach = 0;
      this.offsetx = 0;
      this.offsety = 0;
      this.offsetz = 0;
      this.forcedecor = false;
      this.aBoolean186 = false;
      this.anInt704 = -1;
      this.anInt699 = -1;
      this.anInt701 = -1;
      this.anIntArray192 = null;
   }

   public boolean method532(int var1) {
      if (this.anIntArray189 != null) {
         for(int var4 = 0; var4 < this.anIntArray189.length; ++var4) {
            if (this.anIntArray189[var4] == var1) {
               return Model.method272(this.anIntArray188[var4] & 65535);
            }
         }

         return true;
      } else if (this.anIntArray188 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.anIntArray188.length; ++var3) {
            var2 &= Model.method272(this.anIntArray188[var3] & 65535);
         }

         return var2;
      }
   }

   private void method530(byte var1, Packet var2) {
      int var3 = -1;
      if (var1 != 6) {
         throw new NullPointerException();
      } else {
         while(true) {
            while(true) {
               int var4;
               int var5;
               do {
                  while(true) {
                     int var6 = var2.g1();
                     if (var6 == 0) {
                        if (var3 == -1) {
                           this.active = false;
                           if (this.anIntArray188 != null && (this.anIntArray189 == null || this.anIntArray189[0] == 10)) {
                              this.active = true;
                           }

                           if (this.op != null) {
                              this.active = true;
                           }
                        }

                        if (this.aBoolean186) {
                           this.blockwalk = false;
                           this.blockrange = false;
                        }

                        if (this.anInt704 == -1) {
                           this.anInt704 = this.blockwalk ? 1 : 0;
                           return;
                        }

                        return;
                     }

                     if (var6 == 1) {
                        var4 = var2.g1();
                        break;
                     }

                     if (var6 == 2) {
                        this.name = var2.gjstr();
                     } else if (var6 == 3) {
                        this.desc = var2.gstrbyte();
                     } else if (var6 == 5) {
                        var4 = var2.g1();
                        if (var4 > 0) {
                           if (this.anIntArray188 != null && !aBoolean183) {
                              var2.pos += var4 * 2;
                           } else {
                              this.anIntArray189 = null;
                              this.anIntArray188 = new int[var4];

                              for(var5 = 0; var5 < var4; ++var5) {
                                 this.anIntArray188[var5] = var2.g2();
                              }
                           }
                        }
                     } else if (var6 == 14) {
                        this.width = var2.g1();
                     } else if (var6 == 15) {
                        this.length = var2.g1();
                     } else if (var6 == 17) {
                        this.blockwalk = false;
                     } else if (var6 == 18) {
                        this.blockrange = false;
                     } else if (var6 == 19) {
                        var3 = var2.g1();
                        if (var3 == 1) {
                           this.active = true;
                        }
                     } else if (var6 == 21) {
                        this.hillskew = true;
                     } else if (var6 == 22) {
                        this.sharelight = true;
                     } else if (var6 == 23) {
                        this.occlude = true;
                     } else if (var6 == 24) {
                        this.anim = var2.g2();
                        if (this.anim == 65535) {
                           this.anim = -1;
                        }
                     } else if (var6 == 28) {
                        this.wallwidth = var2.g1();
                     } else if (var6 == 29) {
                        this.ambient = var2.g1b();
                     } else if (var6 == 39) {
                        this.contrast = var2.g1b();
                     } else if (var6 >= 30 && var6 < 39) {
                        if (this.op == null) {
                           this.op = new String[5];
                        }

                        this.op[var6 - 30] = var2.gjstr();
                        if (this.op[var6 - 30].equalsIgnoreCase("hidden")) {
                           this.op[var6 - 30] = null;
                        }
                     } else if (var6 == 40) {
                        var4 = var2.g1();
                        this.recol_s = new int[var4];
                        this.recol_d = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           this.recol_s[var5] = var2.g2();
                           this.recol_d[var5] = var2.g2();
                        }
                     } else if (var6 == 60) {
                        this.mapfunction = var2.g2();
                     } else if (var6 == 62) {
                        this.mirror = true;
                     } else if (var6 == 64) {
                        this.shadow = false;
                     } else if (var6 == 65) {
                        this.resizex = var2.g2();
                     } else if (var6 == 66) {
                        this.resizey = var2.g2();
                     } else if (var6 == 67) {
                        this.resizez = var2.g2();
                     } else if (var6 == 68) {
                        this.mapscene = var2.g2();
                     } else if (var6 == 69) {
                        this.forceapproach = var2.g1();
                     } else if (var6 == 70) {
                        this.offsetx = var2.g2b();
                     } else if (var6 == 71) {
                        this.offsety = var2.g2b();
                     } else if (var6 == 72) {
                        this.offsetz = var2.g2b();
                     } else if (var6 == 73) {
                        this.forcedecor = true;
                     } else if (var6 == 74) {
                        this.aBoolean186 = true;
                     } else if (var6 == 75) {
                        this.anInt704 = var2.g1();
                     } else if (var6 == 77) {
                        this.anInt699 = var2.g2();
                        if (this.anInt699 == 65535) {
                           this.anInt699 = -1;
                        }

                        this.anInt701 = var2.g2();
                        if (this.anInt701 == 65535) {
                           this.anInt701 = -1;
                        }

                        var4 = var2.g1();
                        this.anIntArray192 = new int[var4 + 1];

                        for(var5 = 0; var5 <= var4; ++var5) {
                           this.anIntArray192[var5] = var2.g2();
                           if (this.anIntArray192[var5] == 65535) {
                              this.anIntArray192[var5] = -1;
                           }
                        }
                     }
                  }
               } while(var4 <= 0);

               if (this.anIntArray188 != null && !aBoolean183) {
                  var2.pos += var4 * 3;
               } else {
                  this.anIntArray189 = new int[var4];
                  this.anIntArray188 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray188[var5] = var2.g2();
                     this.anIntArray189[var5] = var2.g1();
                  }
               }
            }
         }
      }
   }

   public Model method531(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Model var8 = this.method527(var2, var7, var1);
      if (var8 == null) {
         return null;
      } else {
         if (this.hillskew || this.sharelight) {
            var8 = new Model(this.hillskew, this.sharelight, 0, var8);
         }

         if (this.hillskew) {
            int var9 = (var3 + var4 + var5 + var6) / 4;

            for(int var10 = 0; var10 < var8.anInt402; ++var10) {
               int var11 = var8.anIntArray113[var10];
               int var12 = var8.anIntArray115[var10];
               int var13 = var3 + (var4 - var3) * (var11 + 64) / 128;
               int var14 = var6 + (var5 - var6) * (var11 + 64) / 128;
               int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
               int[] var10000 = var8.anIntArray114;
               var10000[var10] += var15 - var9;
            }

            var8.method276();
         }

         return var8;
      }
   }

   public boolean method528() {
      if (this.anIntArray188 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.anIntArray188.length; ++var2) {
            var1 &= Model.method272(this.anIntArray188[var2] & 65535);
         }

         return var1;
      }
   }

   public void method525(Class33_Sub1 var1) {
      if (this.anIntArray188 != null) {
         for(int var2 = 0; var2 < this.anIntArray188.length; ++var2) {
            var1.method566(this.anIntArray188[var2] & 65535, 0, this.aByte40);
         }
      }

   }

   public static LocType method523(int var0) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if (aClass48Array1[var1].anInt696 == var0) {
            return aClass48Array1[var1];
         }
      }

      anInt698 = (anInt698 + 1) % 20;
      LocType var2 = aClass48Array1[anInt698];
      aClass10_Sub1_Sub3_5.pos = anIntArray187[var0];
      var2.anInt696 = var0;
      var2.method529();
      var2.method530(aByte41, aClass10_Sub1_Sub3_5);
      return var2;
   }

   public static void method533() {
      aClass34_8 = null;
      aClass34_7 = null;
      anIntArray187 = null;
      aClass48Array1 = null;
      aClass10_Sub1_Sub3_5 = null;
   }

   public static void unpack(Jagfile var0) {
      aClass10_Sub1_Sub3_5 = new Packet(var0.read("loc.dat", (byte[])null));
      Packet var1 = new Packet(var0.read("loc.idx", (byte[])null));
      anInt711 = var1.g2();
      anIntArray187 = new int[anInt711];
      int var2 = 2;

      int var3;
      for(var3 = 0; var3 < anInt711; ++var3) {
         anIntArray187[var3] = var2;
         var2 += var1.g2();
      }

      aClass48Array1 = new LocType[20];

      for(var3 = 0; var3 < 20; ++var3) {
         aClass48Array1[var3] = new LocType();
      }

   }
}
