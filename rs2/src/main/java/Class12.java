public final class Class12 {
   private static int[] anIntArray28 = new int[5];
   private static int[] anIntArray25;
   private static int[] anIntArray27;
   private static int[] anIntArray29 = new int[5];
   private static int[] anIntArray26;
   private static int[] anIntArray30 = new int[5];
   private static int[] anIntArray31 = new int[5];
   private static int[] anIntArray32 = new int[5];
   private byte aByte7 = 6;
   private Class30 aClass30_1;
   private int anInt69 = 8;
   private int[] anIntArray22 = new int[5];
   public int anInt72 = 500;
   public int anInt73;
   private Class30 aClass30_2;
   private int[] anIntArray23 = new int[5];
   private int[] anIntArray24 = new int[5];
   private Class30 aClass30_3;
   private int anInt71 = 100;
   private Class30 aClass30_5;
   private Class30 aClass30_4;
   private Class30 aClass30_6;
   private Class30 aClass30_7;
   private int anInt70;
   private Class37 aClass37_1;
   private Class30 aClass30_8;
   private Class30 aClass30_9;

   public void method44(byte var1, Packet var2) {
      this.aClass30_1 = new Class30();
      this.aClass30_1.method359(this.aByte7, var2);
      this.aClass30_2 = new Class30();
      this.aClass30_2.method359(this.aByte7, var2);
      int var3 = var2.g1();
      if (var3 != 0) {
         --var2.pos;
         this.aClass30_3 = new Class30();
         this.aClass30_3.method359(this.aByte7, var2);
         this.aClass30_4 = new Class30();
         this.aClass30_4.method359(this.aByte7, var2);
      }

      var3 = var2.g1();
      int var4;
      if (var1 != 6) {
         for(var4 = 1; var4 > 0; ++var4) {
         }
      }

      if (var3 != 0) {
         --var2.pos;
         this.aClass30_5 = new Class30();
         this.aClass30_5.method359(this.aByte7, var2);
         this.aClass30_6 = new Class30();
         this.aClass30_6.method359(this.aByte7, var2);
      }

      var3 = var2.g1();
      if (var3 != 0) {
         --var2.pos;
         this.aClass30_7 = new Class30();
         this.aClass30_7.method359(this.aByte7, var2);
         this.aClass30_8 = new Class30();
         this.aClass30_8.method359(this.aByte7, var2);
      }

      for(var4 = 0; var4 < 10; ++var4) {
         int var5 = var2.gsmarts();
         if (var5 == 0) {
            break;
         }

         this.anIntArray22[var4] = var5;
         this.anIntArray23[var4] = var2.gsmart();
         this.anIntArray24[var4] = var2.gsmarts();
      }

      this.anInt70 = var2.gsmarts();
      this.anInt71 = var2.gsmarts();
      this.anInt72 = var2.g2();
      this.anInt73 = var2.g2();
      this.aClass37_1 = new Class37();
      this.aClass30_9 = new Class30();
      this.aClass37_1.method399(this.aClass30_9, var2);
   }

   public int[] method42(int var1, int var2) {
      for(int var3 = 0; var3 < var1; ++var3) {
         anIntArray25[var3] = 0;
      }

      if (var2 < 10) {
         return anIntArray25;
      } else {
         double var20 = (double)var1 / ((double)var2 + 0.0);
         this.aClass30_1.method361();
         this.aClass30_2.method361();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.aClass30_3 != null) {
            this.aClass30_3.method361();
            this.aClass30_4.method361();
            var5 = (int)((double)(this.aClass30_3.anInt476 - this.aClass30_3.anInt475) * 32.768 / var20);
            var6 = (int)((double)this.aClass30_3.anInt475 * 32.768 / var20);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.aClass30_5 != null) {
            this.aClass30_5.method361();
            this.aClass30_6.method361();
            var8 = (int)((double)(this.aClass30_5.anInt476 - this.aClass30_5.anInt475) * 32.768 / var20);
            var9 = (int)((double)this.aClass30_5.anInt475 * 32.768 / var20);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.anIntArray22[var11] != 0) {
               anIntArray28[var11] = 0;
               anIntArray29[var11] = (int)((double)this.anIntArray24[var11] * var20);
               anIntArray30[var11] = (this.anIntArray22[var11] << 14) / 100;
               anIntArray31[var11] = (int)((double)(this.aClass30_1.anInt476 - this.aClass30_1.anInt475) * 32.768 * Math.pow(1.0057929410678534, (double)this.anIntArray23[var11]) / var20);
               anIntArray32[var11] = (int)((double)this.aClass30_1.anInt475 * 32.768 / var20);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var15 = 0; var15 < var1; ++var15) {
            var11 = this.aClass30_1.method362(var1);
            var12 = this.aClass30_2.method362(var1);
            if (this.aClass30_3 != null) {
               var13 = this.aClass30_3.method362(var1);
               var14 = this.aClass30_4.method362(var1);
               var11 += this.method43(var7, this.aClass30_3.anInt477, var14) >> 1;
               var7 += (var13 * var5 >> 16) + var6;
            }

            if (this.aClass30_5 != null) {
               var13 = this.aClass30_5.method362(var1);
               var14 = this.aClass30_6.method362(var1);
               var12 = var12 * ((this.method43(var10, this.aClass30_5.anInt477, var14) >> 1) + 32768) >> 15;
               var10 += (var13 * var8 >> 16) + var9;
            }

            for(var13 = 0; var13 < 5; ++var13) {
               if (this.anIntArray22[var13] != 0) {
                  var14 = var15 + anIntArray29[var13];
                  if (var14 < var1) {
                     var10000 = anIntArray25;
                     var10000[var14] += this.method43(anIntArray28[var13], this.aClass30_1.anInt477, var12 * anIntArray30[var13] >> 15);
                     var10000 = anIntArray28;
                     var10000[var13] += (var11 * anIntArray31[var13] >> 16) + anIntArray32[var13];
                  }
               }
            }
         }

         int var16;
         if (this.aClass30_7 != null) {
            this.aClass30_7.method361();
            this.aClass30_8.method361();
            var11 = 0;
            boolean var17 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.aClass30_7.method362(var1);
               var16 = this.aClass30_8.method362(var1);
               if (var17) {
                  var12 = this.aClass30_7.anInt475 + ((this.aClass30_7.anInt476 - this.aClass30_7.anInt475) * var15 >> 8);
               } else {
                  var12 = this.aClass30_7.anInt475 + ((this.aClass30_7.anInt476 - this.aClass30_7.anInt475) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var17 = !var17;
               }

               if (var17) {
                  anIntArray25[var14] = 0;
               }
            }
         }

         if (this.anInt70 > 0 && this.anInt71 > 0) {
            var11 = (int)((double)this.anInt70 * var20);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = anIntArray25;
               var10000[var12] += anIntArray25[var12 - var11] * this.anInt71 / 100;
            }
         }

         if (this.aClass37_1.anIntArray163[0] > 0 || this.aClass37_1.anIntArray163[1] > 0) {
            this.aClass30_9.method361();
            var11 = this.aClass30_9.method362(var1 + 1);
            var12 = this.aClass37_1.method398(0, (float)var11 / 65536.0F);
            var13 = this.aClass37_1.method398(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var18;
               int var22;
               while(var14 < var15) {
                  var16 = (int)((long)anIntArray25[var14 + var12] * (long)Class37.anInt563 >> 16);

                  for(var22 = 0; var22 < var12; ++var22) {
                     var16 += (int)((long)anIntArray25[var14 + var12 - var22 - 1] * (long)Class37.anIntArrayArray14[0][var22] >> 16);
                  }

                  for(var18 = 0; var18 < var14; ++var18) {
                     var16 -= (int)((long)anIntArray25[var14 - var18 - 1] * (long)Class37.anIntArrayArray14[1][var18] >> 16);
                  }

                  anIntArray25[var14] = var16;
                  var11 = this.aClass30_9.method362(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var19;
                  while(var14 < var15) {
                     var22 = (int)((long)anIntArray25[var14 + var12] * (long)Class37.anInt563 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var22 += (int)((long)anIntArray25[var14 + var12 - var18 - 1] * (long)Class37.anIntArrayArray14[0][var18] >> 16);
                     }

                     for(var19 = 0; var19 < var13; ++var19) {
                        var22 -= (int)((long)anIntArray25[var14 - var19 - 1] * (long)Class37.anIntArrayArray14[1][var19] >> 16);
                     }

                     anIntArray25[var14] = var22;
                     var11 = this.aClass30_9.method362(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var22 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var22 += (int)((long)anIntArray25[var14 + var12 - var18 - 1] * (long)Class37.anIntArrayArray14[0][var18] >> 16);
                        }

                        for(var19 = 0; var19 < var13; ++var19) {
                           var22 -= (int)((long)anIntArray25[var14 - var19 - 1] * (long)Class37.anIntArrayArray14[1][var19] >> 16);
                        }

                        anIntArray25[var14] = var22;
                        this.aClass30_9.method362(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.aClass37_1.method398(0, (float)var11 / 65536.0F);
                  var13 = this.aClass37_1.method398(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (anIntArray25[var11] < -32768) {
               anIntArray25[var11] = -32768;
            }

            if (anIntArray25[var11] > 32767) {
               anIntArray25[var11] = 32767;
            }
         }

         return anIntArray25;
      }
   }

   private int method43(int var1, int var2, int var3) {
      if (var2 == 1) {
         return (var1 & 32767) < 16384 ? var3 : -var3;
      } else if (var2 == 2) {
         return anIntArray27[var1 & 32767] * var3 >> 14;
      } else if (var2 == 3) {
         return ((var1 & 32767) * var3 >> 14) - var3;
      } else {
         return var2 == 4 ? anIntArray26[var1 / 2607 & 32767] * var3 : 0;
      }
   }

   public static void method41() {
      anIntArray26 = new int[32768];

      int var0;
      for(var0 = 0; var0 < 32768; ++var0) {
         if (Math.random() > 0.5) {
            anIntArray26[var0] = 1;
         } else {
            anIntArray26[var0] = -1;
         }
      }

      anIntArray27 = new int[32768];

      for(var0 = 0; var0 < 32768; ++var0) {
         anIntArray27[var0] = (int)(Math.sin((double)var0 / 5215.1903) * 16384.0);
      }

      anIntArray25 = new int[220500];
   }
}
