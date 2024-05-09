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
   public boolean aBoolean182;
   public String aString12 = "null";
   private boolean aBoolean184 = true;
   private boolean aBoolean186;
   public boolean aBoolean180;
   private boolean aBoolean189;
   public int[] anIntArray192;
   private byte aByte40 = -113;
   public byte[] aByteArray17;
   public boolean aBoolean192;
   private int[] anIntArray191;
   private boolean aBoolean185 = true;
   public String[] aStringArray7;
   public boolean aBoolean191;
   private int[] anIntArray190;
   private int anInt704;
   public int anInt707;
   public int anInt697;
   private boolean aBoolean188;
   public int anInt705;
   public int anInt693;
   public boolean aBoolean187;
   private int anInt700;
   public int anInt709;
   private int anInt691;
   public int anInt708;
   private byte aByte38;
   private byte aByte39;
   private int anInt706;
   private int anInt692;
   public int anInt710;
   public boolean aBoolean190;
   private int anInt702;
   private int anInt694;
   public boolean aBoolean181;

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

         var7 = this.aBoolean188 ^ var1 > 3;
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
         boolean var15 = this.aBoolean188 ^ var1 > 3;
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
      if (this.anInt700 == 128 && this.anInt691 == 128 && this.anInt706 == 128) {
         var14 = false;
      } else {
         var14 = true;
      }

      if (this.anInt692 == 0 && this.anInt702 == 0 && this.anInt694 == 0) {
         var7 = false;
      } else {
         var7 = true;
      }

      var9 = new Model(var1 == 0 && var2 == -1 && !var14 && !var7, false, this.anIntArray191 == null, var4, Class22.method169(this.aBoolean184, var2));
      if (var2 != -1) {
         var9.method278();
         var9.method279(var2, (byte)6);
         var9.anIntArrayArray11 = null;
         var9.anIntArrayArray10 = null;
      }

      while(var1-- > 0) {
         var9.method282();
      }

      if (this.anIntArray191 != null) {
         for(var8 = 0; var8 < this.anIntArray191.length; ++var8) {
            var9.recolor(this.anIntArray191[var8], this.anIntArray190[var8]);
         }
      }

      if (var14) {
         var9.method287(this.anInt691, this.anInt706, this.anInt700);
      }

      if (var7) {
         var9.method284(this.anInt692, this.anInt694, this.anInt702);
      }

      var9.method288(this.aByte38 + 64, this.aByte39 * 5 + 768, -50, -10, -50, !this.aBoolean189);
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
      this.aString12 = "null";
      this.aByteArray17 = null;
      this.anIntArray191 = null;
      this.anIntArray190 = null;
      this.anInt707 = 1;
      this.anInt697 = 1;
      this.aBoolean192 = true;
      this.aBoolean191 = true;
      this.aBoolean180 = false;
      this.aBoolean182 = false;
      this.aBoolean189 = false;
      this.aBoolean187 = false;
      this.anInt709 = -1;
      this.anInt708 = 16;
      this.aByte38 = 0;
      this.aByte39 = 0;
      this.aStringArray7 = null;
      this.anInt710 = -1;
      this.anInt705 = -1;
      this.aBoolean188 = false;
      this.aBoolean190 = true;
      this.anInt700 = 128;
      this.anInt691 = 128;
      this.anInt706 = 128;
      this.anInt693 = 0;
      this.anInt692 = 0;
      this.anInt702 = 0;
      this.anInt694 = 0;
      this.aBoolean181 = false;
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
                           this.aBoolean180 = false;
                           if (this.anIntArray188 != null && (this.anIntArray189 == null || this.anIntArray189[0] == 10)) {
                              this.aBoolean180 = true;
                           }

                           if (this.aStringArray7 != null) {
                              this.aBoolean180 = true;
                           }
                        }

                        if (this.aBoolean186) {
                           this.aBoolean192 = false;
                           this.aBoolean191 = false;
                        }

                        if (this.anInt704 == -1) {
                           this.anInt704 = this.aBoolean192 ? 1 : 0;
                           return;
                        }

                        return;
                     }

                     if (var6 == 1) {
                        var4 = var2.g1();
                        break;
                     }

                     if (var6 == 2) {
                        this.aString12 = var2.gjstr();
                     } else if (var6 == 3) {
                        this.aByteArray17 = var2.gstrbyte();
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
                        this.anInt707 = var2.g1();
                     } else if (var6 == 15) {
                        this.anInt697 = var2.g1();
                     } else if (var6 == 17) {
                        this.aBoolean192 = false;
                     } else if (var6 == 18) {
                        this.aBoolean191 = false;
                     } else if (var6 == 19) {
                        var3 = var2.g1();
                        if (var3 == 1) {
                           this.aBoolean180 = true;
                        }
                     } else if (var6 == 21) {
                        this.aBoolean182 = true;
                     } else if (var6 == 22) {
                        this.aBoolean189 = true;
                     } else if (var6 == 23) {
                        this.aBoolean187 = true;
                     } else if (var6 == 24) {
                        this.anInt709 = var2.g2();
                        if (this.anInt709 == 65535) {
                           this.anInt709 = -1;
                        }
                     } else if (var6 == 28) {
                        this.anInt708 = var2.g1();
                     } else if (var6 == 29) {
                        this.aByte38 = var2.g1b();
                     } else if (var6 == 39) {
                        this.aByte39 = var2.g1b();
                     } else if (var6 >= 30 && var6 < 39) {
                        if (this.aStringArray7 == null) {
                           this.aStringArray7 = new String[5];
                        }

                        this.aStringArray7[var6 - 30] = var2.gjstr();
                        if (this.aStringArray7[var6 - 30].equalsIgnoreCase("hidden")) {
                           this.aStringArray7[var6 - 30] = null;
                        }
                     } else if (var6 == 40) {
                        var4 = var2.g1();
                        this.anIntArray191 = new int[var4];
                        this.anIntArray190 = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           this.anIntArray191[var5] = var2.g2();
                           this.anIntArray190[var5] = var2.g2();
                        }
                     } else if (var6 == 60) {
                        this.anInt710 = var2.g2();
                     } else if (var6 == 62) {
                        this.aBoolean188 = true;
                     } else if (var6 == 64) {
                        this.aBoolean190 = false;
                     } else if (var6 == 65) {
                        this.anInt700 = var2.g2();
                     } else if (var6 == 66) {
                        this.anInt691 = var2.g2();
                     } else if (var6 == 67) {
                        this.anInt706 = var2.g2();
                     } else if (var6 == 68) {
                        this.anInt705 = var2.g2();
                     } else if (var6 == 69) {
                        this.anInt693 = var2.g1();
                     } else if (var6 == 70) {
                        this.anInt692 = var2.g2b();
                     } else if (var6 == 71) {
                        this.anInt702 = var2.g2b();
                     } else if (var6 == 72) {
                        this.anInt694 = var2.g2b();
                     } else if (var6 == 73) {
                        this.aBoolean181 = true;
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
         if (this.aBoolean182 || this.aBoolean189) {
            var8 = new Model(this.aBoolean182, this.aBoolean189, 0, var8);
         }

         if (this.aBoolean182) {
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
