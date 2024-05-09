public final class Draw3D extends Draw2D {
   private static int anInt683 = -20714;
   public static int anInt686;
   public static int anInt687;
   public static boolean aBoolean176 = true;
   public static int anInt685;
   public static boolean aBoolean179 = true;
   public static int[] lineOffset;
   public static int[] anIntArray185;
   private static int[] anIntArray179 = new int[512];
   public static int[] anIntArray180 = new int[2048];
   private static int[][] anIntArrayArray17;
   public static Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array1;
   public static int[] anIntArray181 = new int[2048];
   private static int[][] anIntArrayArray18;
   public static boolean aBoolean177;
   public static int[] anIntArray182 = new int[2048];
   private static int anInt689;
   private static boolean[] aBooleanArray9;
   private static int[] anIntArray184;
   private static int[][] anIntArrayArray19;
   public static int[] anIntArray186;
   public static int cycle;
   private static boolean aBoolean178;
   private static int anInt688;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         anIntArray179[var0] = 32768 / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         anIntArray180[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         anIntArray181[var0] = (int)(Math.sin((double)var0 * 0.0030679615) * 65536.0);
         anIntArray182[var0] = (int)(Math.cos((double)var0 * 0.0030679615) * 65536.0);
      }

      aClass10_Sub1_Sub1_Sub3Array1 = new Class10_Sub1_Sub1_Sub3[50];
      aBooleanArray9 = new boolean[50];
      anIntArray184 = new int[50];
      anIntArrayArray18 = new int[50][];
      anIntArray185 = new int[50];
      anIntArray186 = new int[65536];
      anIntArrayArray19 = new int[50][];
   }

   public static void method509() {
      anIntArrayArray17 = null;

      for(int var0 = 0; var0 < 50; ++var0) {
         anIntArrayArray18[var0] = null;
      }

   }

   public static void setBrightness(double var0) {
      double var3 = var0 + Math.random() * 0.03 - 0.015;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < 512; ++var6) {
         double var7 = (double)(var6 / 8) / 64.0 + 0.0078125;
         double var9 = (double)(var6 & 7) / 8.0 + 0.0625;

         for(int var11 = 0; var11 < 128; ++var11) {
            double var12 = (double)var11 / 128.0;
            double var14 = var12;
            double var16 = var12;
            double var18 = var12;
            if (var9 != 0.0) {
               double var20;
               if (var12 < 0.5) {
                  var20 = var12 * (var9 + 1.0);
               } else {
                  var20 = var12 + var9 - var12 * var9;
               }

               double var22 = var12 * 2.0 - var20;
               double var24 = var7 + 0.3333333333333333;
               if (var24 > 1.0) {
                  --var24;
               }

               double var26 = var7 - 0.3333333333333333;
               if (var26 < 0.0) {
                  ++var26;
               }

               if (var24 * 6.0 < 1.0) {
                  var14 = var22 + (var20 - var22) * 6.0 * var24;
               } else if (var24 * 2.0 < 1.0) {
                  var14 = var20;
               } else if (var24 * 3.0 < 2.0) {
                  var14 = var22 + (var20 - var22) * (0.6666666666666666 - var24) * 6.0;
               } else {
                  var14 = var22;
               }

               if (var7 * 6.0 < 1.0) {
                  var16 = var22 + (var20 - var22) * 6.0 * var7;
               } else if (var7 * 2.0 < 1.0) {
                  var16 = var20;
               } else if (var7 * 3.0 < 2.0) {
                  var16 = var22 + (var20 - var22) * (0.6666666666666666 - var7) * 6.0;
               } else {
                  var16 = var22;
               }

               if (var26 * 6.0 < 1.0) {
                  var18 = var22 + (var20 - var22) * 6.0 * var26;
               } else if (var26 * 2.0 < 1.0) {
                  var18 = var20;
               } else if (var26 * 3.0 < 2.0) {
                  var18 = var22 + (var20 - var22) * (0.6666666666666666 - var26) * 6.0;
               } else {
                  var18 = var22;
               }
            }

            int var28 = (int)(var14 * 256.0);
            int var21 = (int)(var16 * 256.0);
            int var29 = (int)(var18 * 256.0);
            int var23 = (var28 << 16) + (var21 << 8) + var29;
            var23 = method516(var23, var3);
            if (var23 == 0) {
               var23 = 1;
            }

            anIntArray186[var5++] = var23;
         }
      }

      for(var6 = 0; var6 < 50; ++var6) {
         if (aClass10_Sub1_Sub1_Sub3Array1[var6] != null) {
            int[] var30 = aClass10_Sub1_Sub1_Sub3Array1[var6].anIntArray175;
            anIntArrayArray19[var6] = new int[var30.length];

            for(int var8 = 0; var8 < var30.length; ++var8) {
               anIntArrayArray19[var6][var8] = method516(var30[var8], var3);
               if ((anIntArrayArray19[var6][var8] & 16316671) == 0 && var8 != 0) {
                  anIntArrayArray19[var6][var8] = 1;
               }
            }
         }
      }

      boolean var32 = false;

      for(int var31 = 0; var31 < 50; ++var31) {
         method513(var31);
      }

   }

   public static void initPool() {
      if (anIntArrayArray17 == null) {
         anInt689 = 20;
         if (aBoolean176) {
            anIntArrayArray17 = new int[anInt689][16384];
         } else {
            anIntArrayArray17 = new int[anInt689][65536];
         }

         for(int var0 = 0; var0 < 50; ++var0) {
            anIntArrayArray18[var0] = null;
         }
      }

   }

   public static void method513(int var0) {
      if (anIntArrayArray18[var0] != null) {
         anIntArrayArray17[anInt689++] = anIntArrayArray18[var0];
         anIntArrayArray18[var0] = null;
      }

   }

   private static int method516(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      double var9 = Math.pow(var3, var1);
      double var11 = Math.pow(var5, var1);
      double var13 = Math.pow(var7, var1);
      int var15 = (int)(var9 * 256.0);
      int var16 = (int)(var11 * 256.0);
      int var17 = (int)(var13 * 256.0);
      return (var15 << 16) + (var16 << 8) + var17;
   }

   public static void method519(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var1 != var0) {
         var7 = (var4 - var3 << 16) / (var1 - var0);
      }

      int var8 = 0;
      if (var2 != var1) {
         var8 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var9 = 0;
      if (var2 != var0) {
         var9 = (var3 - var5 << 16) / (var0 - var2);
      }

      if (var0 <= var1 && var0 <= var2) {
         if (var0 < Draw2D.bottom) {
            if (var1 > Draw2D.bottom) {
               var1 = Draw2D.bottom;
            }

            if (var2 > Draw2D.bottom) {
               var2 = Draw2D.bottom;
            }

            if (var1 < var2) {
               var5 = var3 <<= 16;
               if (var0 < 0) {
                  var5 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               if (var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = lineOffset[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method520(Draw2D.data, var0, var6, var5 >> 16, var4 >> 16);
                           var5 += var9;
                           var4 += var8;
                           var0 += Draw2D.width2d;
                        }
                     }

                     method520(Draw2D.data, var0, var6, var5 >> 16, var3 >> 16);
                     var5 += var9;
                     var3 += var7;
                     var0 += Draw2D.width2d;
                  }
               }

               var2 -= var1;
               var1 -= var0;
               var0 = lineOffset[var0];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method520(Draw2D.data, var0, var6, var4 >> 16, var5 >> 16);
                        var5 += var9;
                        var4 += var8;
                        var0 += Draw2D.width2d;
                     }
                  }

                  method520(Draw2D.data, var0, var6, var3 >> 16, var5 >> 16);
                  var5 += var9;
                  var3 += var7;
                  var0 += Draw2D.width2d;
               }
            }

            var4 = var3 <<= 16;
            if (var0 < 0) {
               var4 -= var9 * var0;
               var3 -= var7 * var0;
               var0 = 0;
            }

            var5 <<= 16;
            if (var2 < 0) {
               var5 -= var8 * var2;
               var2 = 0;
            }

            if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
               var1 -= var2;
               var2 -= var0;
               var0 = lineOffset[var0];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method520(Draw2D.data, var0, var6, var3 >> 16, var5 >> 16);
                        var5 += var8;
                        var3 += var7;
                        var0 += Draw2D.width2d;
                     }
                  }

                  method520(Draw2D.data, var0, var6, var3 >> 16, var4 >> 16);
                  var4 += var9;
                  var3 += var7;
                  var0 += Draw2D.width2d;
               }
            }

            var1 -= var2;
            var2 -= var0;
            var0 = lineOffset[var0];

            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method520(Draw2D.data, var0, var6, var5 >> 16, var3 >> 16);
                     var5 += var8;
                     var3 += var7;
                     var0 += Draw2D.width2d;
                  }
               }

               method520(Draw2D.data, var0, var6, var4 >> 16, var3 >> 16);
               var4 += var9;
               var3 += var7;
               var0 += Draw2D.width2d;
            }
         }
      } else if (var1 <= var2) {
         if (var1 < Draw2D.bottom) {
            if (var2 > Draw2D.bottom) {
               var2 = Draw2D.bottom;
            }

            if (var0 > Draw2D.bottom) {
               var0 = Draw2D.bottom;
            }

            if (var2 < var0) {
               var3 = var4 <<= 16;
               if (var1 < 0) {
                  var3 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               if (var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = lineOffset[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method520(Draw2D.data, var1, var6, var3 >> 16, var5 >> 16);
                           var3 += var7;
                           var5 += var9;
                           var1 += Draw2D.width2d;
                        }
                     }

                     method520(Draw2D.data, var1, var6, var3 >> 16, var4 >> 16);
                     var3 += var7;
                     var4 += var8;
                     var1 += Draw2D.width2d;
                  }
               }

               var0 -= var2;
               var2 -= var1;
               var1 = lineOffset[var1];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method520(Draw2D.data, var1, var6, var5 >> 16, var3 >> 16);
                        var3 += var7;
                        var5 += var9;
                        var1 += Draw2D.width2d;
                     }
                  }

                  method520(Draw2D.data, var1, var6, var4 >> 16, var3 >> 16);
                  var3 += var7;
                  var4 += var8;
                  var1 += Draw2D.width2d;
               }
            }

            var5 = var4 <<= 16;
            if (var1 < 0) {
               var5 -= var7 * var1;
               var4 -= var8 * var1;
               var1 = 0;
            }

            var3 <<= 16;
            if (var0 < 0) {
               var3 -= var9 * var0;
               var0 = 0;
            }

            if (var7 < var8) {
               var2 -= var0;
               var0 -= var1;
               var1 = lineOffset[var1];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method520(Draw2D.data, var1, var6, var3 >> 16, var4 >> 16);
                        var3 += var9;
                        var4 += var8;
                        var1 += Draw2D.width2d;
                     }
                  }

                  method520(Draw2D.data, var1, var6, var5 >> 16, var4 >> 16);
                  var5 += var7;
                  var4 += var8;
                  var1 += Draw2D.width2d;
               }
            }

            var2 -= var0;
            var0 -= var1;
            var1 = lineOffset[var1];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        return;
                     }

                     method520(Draw2D.data, var1, var6, var4 >> 16, var3 >> 16);
                     var3 += var9;
                     var4 += var8;
                     var1 += Draw2D.width2d;
                  }
               }

               method520(Draw2D.data, var1, var6, var4 >> 16, var5 >> 16);
               var5 += var7;
               var4 += var8;
               var1 += Draw2D.width2d;
            }
         }
      } else if (var2 < Draw2D.bottom) {
         if (var0 > Draw2D.bottom) {
            var0 = Draw2D.bottom;
         }

         if (var1 > Draw2D.bottom) {
            var1 = Draw2D.bottom;
         }

         if (var0 < var1) {
            var4 = var5 <<= 16;
            if (var2 < 0) {
               var4 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            if (var0 < 0) {
               var3 -= var7 * var0;
               var0 = 0;
            }

            if (var8 < var9) {
               var1 -= var0;
               var0 -= var2;
               var2 = lineOffset[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method520(Draw2D.data, var2, var6, var4 >> 16, var3 >> 16);
                        var4 += var8;
                        var3 += var7;
                        var2 += Draw2D.width2d;
                     }
                  }

                  method520(Draw2D.data, var2, var6, var4 >> 16, var5 >> 16);
                  var4 += var8;
                  var5 += var9;
                  var2 += Draw2D.width2d;
               }
            }

            var1 -= var0;
            var0 -= var2;
            var2 = lineOffset[var2];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method520(Draw2D.data, var2, var6, var3 >> 16, var4 >> 16);
                     var4 += var8;
                     var3 += var7;
                     var2 += Draw2D.width2d;
                  }
               }

               method520(Draw2D.data, var2, var6, var5 >> 16, var4 >> 16);
               var4 += var8;
               var5 += var9;
               var2 += Draw2D.width2d;
            }
         }

         var3 = var5 <<= 16;
         if (var2 < 0) {
            var3 -= var8 * var2;
            var5 -= var9 * var2;
            var2 = 0;
         }

         var4 <<= 16;
         if (var1 < 0) {
            var4 -= var7 * var1;
            var1 = 0;
         }

         if (var8 < var9) {
            var0 -= var1;
            var1 -= var2;
            var2 = lineOffset[var2];

            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        return;
                     }

                     method520(Draw2D.data, var2, var6, var4 >> 16, var5 >> 16);
                     var4 += var7;
                     var5 += var9;
                     var2 += Draw2D.width2d;
                  }
               }

               method520(Draw2D.data, var2, var6, var3 >> 16, var5 >> 16);
               var3 += var8;
               var5 += var9;
               var2 += Draw2D.width2d;
            }
         }

         var0 -= var1;
         var1 -= var2;
         var2 = lineOffset[var2];

         while(true) {
            --var1;
            if (var1 < 0) {
               while(true) {
                  --var0;
                  if (var0 < 0) {
                     return;
                  }

                  method520(Draw2D.data, var2, var6, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var9;
                  var2 += Draw2D.width2d;
               }
            }

            method520(Draw2D.data, var2, var6, var5 >> 16, var3 >> 16);
            var3 += var8;
            var5 += var9;
            var2 += Draw2D.width2d;
         }
      }

   }

   public static void method517(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = 0;
      int var10 = 0;
      if (var1 != var0) {
         var9 = (var4 - var3 << 16) / (var1 - var0);
         var10 = (var7 - var6 << 15) / (var1 - var0);
      }

      int var11 = 0;
      int var12 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 16) / (var2 - var1);
         var12 = (var8 - var7 << 15) / (var2 - var1);
      }

      int var13 = 0;
      int var14 = 0;
      if (var2 != var0) {
         var13 = (var3 - var5 << 16) / (var0 - var2);
         var14 = (var6 - var8 << 15) / (var0 - var2);
      }

      if (var0 <= var1 && var0 <= var2) {
         if (var0 < Draw2D.bottom) {
            if (var1 > Draw2D.bottom) {
               var1 = Draw2D.bottom;
            }

            if (var2 > Draw2D.bottom) {
               var2 = Draw2D.bottom;
            }

            if (var1 < var2) {
               var5 = var3 <<= 16;
               var8 = var6 <<= 15;
               if (var0 < 0) {
                  var5 -= var13 * var0;
                  var3 -= var9 * var0;
                  var8 -= var14 * var0;
                  var6 -= var10 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               var7 <<= 15;
               if (var1 < 0) {
                  var4 -= var11 * var1;
                  var7 -= var12 * var1;
                  var1 = 0;
               }

               if (var0 != var1 && var13 < var9 || var0 == var1 && var13 > var11) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = lineOffset[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method518(Draw2D.data, var0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                           var5 += var13;
                           var4 += var11;
                           var8 += var14;
                           var7 += var12;
                           var0 += Draw2D.width2d;
                        }
                     }

                     method518(Draw2D.data, var0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                     var5 += var13;
                     var3 += var9;
                     var8 += var14;
                     var6 += var10;
                     var0 += Draw2D.width2d;
                  }
               }

               var2 -= var1;
               var1 -= var0;
               var0 = lineOffset[var0];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method518(Draw2D.data, var0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                        var5 += var13;
                        var4 += var11;
                        var8 += var14;
                        var7 += var12;
                        var0 += Draw2D.width2d;
                     }
                  }

                  method518(Draw2D.data, var0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                  var5 += var13;
                  var3 += var9;
                  var8 += var14;
                  var6 += var10;
                  var0 += Draw2D.width2d;
               }
            }

            var4 = var3 <<= 16;
            var7 = var6 <<= 15;
            if (var0 < 0) {
               var4 -= var13 * var0;
               var3 -= var9 * var0;
               var7 -= var14 * var0;
               var6 -= var10 * var0;
               var0 = 0;
            }

            var5 <<= 16;
            var8 <<= 15;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var8 -= var12 * var2;
               var2 = 0;
            }

            if ((var0 == var2 || var13 >= var9) && (var0 != var2 || var11 <= var9)) {
               var1 -= var2;
               var2 -= var0;
               var0 = lineOffset[var0];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method518(Draw2D.data, var0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                        var5 += var11;
                        var3 += var9;
                        var8 += var12;
                        var6 += var10;
                        var0 += Draw2D.width2d;
                     }
                  }

                  method518(Draw2D.data, var0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                  var4 += var13;
                  var3 += var9;
                  var7 += var14;
                  var6 += var10;
                  var0 += Draw2D.width2d;
               }
            }

            var1 -= var2;
            var2 -= var0;
            var0 = lineOffset[var0];

            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method518(Draw2D.data, var0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                     var5 += var11;
                     var3 += var9;
                     var8 += var12;
                     var6 += var10;
                     var0 += Draw2D.width2d;
                  }
               }

               method518(Draw2D.data, var0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
               var4 += var13;
               var3 += var9;
               var7 += var14;
               var6 += var10;
               var0 += Draw2D.width2d;
            }
         }
      } else if (var1 <= var2) {
         if (var1 < Draw2D.bottom) {
            if (var2 > Draw2D.bottom) {
               var2 = Draw2D.bottom;
            }

            if (var0 > Draw2D.bottom) {
               var0 = Draw2D.bottom;
            }

            if (var2 < var0) {
               var3 = var4 <<= 16;
               var6 = var7 <<= 15;
               if (var1 < 0) {
                  var3 -= var9 * var1;
                  var4 -= var11 * var1;
                  var6 -= var10 * var1;
                  var7 -= var12 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               var8 <<= 15;
               if (var2 < 0) {
                  var5 -= var13 * var2;
                  var8 -= var14 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var9 < var11 || var1 == var2 && var9 > var13) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = lineOffset[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method518(Draw2D.data, var1, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                           var3 += var9;
                           var5 += var13;
                           var6 += var10;
                           var8 += var14;
                           var1 += Draw2D.width2d;
                        }
                     }

                     method518(Draw2D.data, var1, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                     var3 += var9;
                     var4 += var11;
                     var6 += var10;
                     var7 += var12;
                     var1 += Draw2D.width2d;
                  }
               }

               var0 -= var2;
               var2 -= var1;
               var1 = lineOffset[var1];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method518(Draw2D.data, var1, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                        var3 += var9;
                        var5 += var13;
                        var6 += var10;
                        var8 += var14;
                        var1 += Draw2D.width2d;
                     }
                  }

                  method518(Draw2D.data, var1, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                  var3 += var9;
                  var4 += var11;
                  var6 += var10;
                  var7 += var12;
                  var1 += Draw2D.width2d;
               }
            }

            var5 = var4 <<= 16;
            var8 = var7 <<= 15;
            if (var1 < 0) {
               var5 -= var9 * var1;
               var4 -= var11 * var1;
               var8 -= var10 * var1;
               var7 -= var12 * var1;
               var1 = 0;
            }

            var3 <<= 16;
            var6 <<= 15;
            if (var0 < 0) {
               var3 -= var13 * var0;
               var6 -= var14 * var0;
               var0 = 0;
            }

            if (var9 < var11) {
               var2 -= var0;
               var0 -= var1;
               var1 = lineOffset[var1];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method518(Draw2D.data, var1, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                        var3 += var13;
                        var4 += var11;
                        var6 += var14;
                        var7 += var12;
                        var1 += Draw2D.width2d;
                     }
                  }

                  method518(Draw2D.data, var1, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                  var5 += var9;
                  var4 += var11;
                  var8 += var10;
                  var7 += var12;
                  var1 += Draw2D.width2d;
               }
            }

            var2 -= var0;
            var0 -= var1;
            var1 = lineOffset[var1];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        return;
                     }

                     method518(Draw2D.data, var1, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                     var3 += var13;
                     var4 += var11;
                     var6 += var14;
                     var7 += var12;
                     var1 += Draw2D.width2d;
                  }
               }

               method518(Draw2D.data, var1, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
               var5 += var9;
               var4 += var11;
               var8 += var10;
               var7 += var12;
               var1 += Draw2D.width2d;
            }
         }
      } else if (var2 < Draw2D.bottom) {
         if (var0 > Draw2D.bottom) {
            var0 = Draw2D.bottom;
         }

         if (var1 > Draw2D.bottom) {
            var1 = Draw2D.bottom;
         }

         if (var0 < var1) {
            var4 = var5 <<= 16;
            var7 = var8 <<= 15;
            if (var2 < 0) {
               var4 -= var11 * var2;
               var5 -= var13 * var2;
               var7 -= var12 * var2;
               var8 -= var14 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            var6 <<= 15;
            if (var0 < 0) {
               var3 -= var9 * var0;
               var6 -= var10 * var0;
               var0 = 0;
            }

            if (var11 < var13) {
               var1 -= var0;
               var0 -= var2;
               var2 = lineOffset[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method518(Draw2D.data, var2, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                        var4 += var11;
                        var3 += var9;
                        var7 += var12;
                        var6 += var10;
                        var2 += Draw2D.width2d;
                     }
                  }

                  method518(Draw2D.data, var2, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                  var4 += var11;
                  var5 += var13;
                  var7 += var12;
                  var8 += var14;
                  var2 += Draw2D.width2d;
               }
            }

            var1 -= var0;
            var0 -= var2;
            var2 = lineOffset[var2];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method518(Draw2D.data, var2, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                     var4 += var11;
                     var3 += var9;
                     var7 += var12;
                     var6 += var10;
                     var2 += Draw2D.width2d;
                  }
               }

               method518(Draw2D.data, var2, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
               var4 += var11;
               var5 += var13;
               var7 += var12;
               var8 += var14;
               var2 += Draw2D.width2d;
            }
         }

         var3 = var5 <<= 16;
         var6 = var8 <<= 15;
         if (var2 < 0) {
            var3 -= var11 * var2;
            var5 -= var13 * var2;
            var6 -= var12 * var2;
            var8 -= var14 * var2;
            var2 = 0;
         }

         var4 <<= 16;
         var7 <<= 15;
         if (var1 < 0) {
            var4 -= var9 * var1;
            var7 -= var10 * var1;
            var1 = 0;
         }

         if (var11 < var13) {
            var0 -= var1;
            var1 -= var2;
            var2 = lineOffset[var2];

            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        return;
                     }

                     method518(Draw2D.data, var2, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                     var4 += var9;
                     var5 += var13;
                     var7 += var10;
                     var8 += var14;
                     var2 += Draw2D.width2d;
                  }
               }

               method518(Draw2D.data, var2, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
               var3 += var11;
               var5 += var13;
               var6 += var12;
               var8 += var14;
               var2 += Draw2D.width2d;
            }
         }

         var0 -= var1;
         var1 -= var2;
         var2 = lineOffset[var2];

         while(true) {
            --var1;
            if (var1 < 0) {
               while(true) {
                  --var0;
                  if (var0 < 0) {
                     return;
                  }

                  method518(Draw2D.data, var2, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                  var4 += var9;
                  var5 += var13;
                  var7 += var10;
                  var8 += var14;
                  var2 += Draw2D.width2d;
               }
            }

            method518(Draw2D.data, var2, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
            var3 += var11;
            var5 += var13;
            var6 += var12;
            var8 += var14;
            var2 += Draw2D.width2d;
         }
      }

   }

   private static int[] method514(int var0) {
      anIntArray185[var0] = cycle++;
      if (anIntArrayArray18[var0] != null) {
         return anIntArrayArray18[var0];
      } else {
         int[] var1;
         int var2;
         if (anInt689 > 0) {
            var1 = anIntArrayArray17[--anInt689];
            anIntArrayArray17[anInt689] = null;
         } else {
            int var6 = 0;
            int var7 = -1;

            for(var2 = 0; var2 < anInt688; ++var2) {
               if (anIntArrayArray18[var2] != null && (anIntArray185[var2] < var6 || var7 == -1)) {
                  var6 = anIntArray185[var2];
                  var7 = var2;
               }
            }

            var1 = anIntArrayArray18[var7];
            anIntArrayArray18[var7] = null;
         }

         anIntArrayArray18[var0] = var1;
         Class10_Sub1_Sub1_Sub3 var3 = aClass10_Sub1_Sub1_Sub3Array1[var0];
         int[] var4 = anIntArrayArray19[var0];
         int var5;
         if (aBoolean176) {
            aBooleanArray9[var0] = false;

            for(var2 = 0; var2 < 4096; ++var2) {
               var5 = var1[var2] = var4[var3.aByteArray16[var2]] & 16316671;
               if (var5 == 0) {
                  aBooleanArray9[var0] = true;
               }

               var1[var2 + 4096] = var5 - (var5 >>> 3) & 16316671;
               var1[var2 + 8192] = var5 - (var5 >>> 2) & 16316671;
               var1[var2 + 12288] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
            }
         } else {
            if (var3.anInt652 != 64) {
               for(var2 = 0; var2 < 16384; ++var2) {
                  var1[var2] = var4[var3.aByteArray16[var2]];
               }
            } else {
               for(var2 = 0; var2 < 128; ++var2) {
                  for(var5 = 0; var5 < 128; ++var5) {
                     var1[var5 + (var2 << 7)] = var4[var3.aByteArray16[(var5 >> 1) + (var2 >> 1 << 6)]];
                  }
               }
            }

            aBooleanArray9[var0] = false;

            for(var2 = 0; var2 < 16384; ++var2) {
               var1[var2] &= 16316671;
               var5 = var1[var2];
               if (var5 == 0) {
                  aBooleanArray9[var0] = true;
               }

               var1[var2 + 16384] = var5 - (var5 >>> 3) & 16316671;
               var1[var2 + 32768] = var5 - (var5 >>> 2) & 16316671;
               var1[var2 + 49152] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
            }
         }

         return var1;
      }
   }

   public static void method521(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = method514(var18);
      aBoolean178 = !aBooleanArray9[var18];
      int var20 = var9 - var10;
      int var21 = var12 - var13;
      int var22 = var15 - var16;
      int var23 = var11 - var9;
      int var24 = var14 - var12;
      int var25 = var17 - var15;
      int var26 = var23 * var12 - var24 * var9 << 14;
      int var27 = var24 * var15 - var25 * var12 << 8;
      int var28 = var25 * var9 - var23 * var15 << 5;
      int var29 = var20 * var12 - var21 * var9 << 14;
      int var30 = var21 * var15 - var22 * var12 << 8;
      int var31 = var22 * var9 - var20 * var15 << 5;
      int var32 = var21 * var23 - var20 * var24 << 14;
      int var33 = var22 * var24 - var21 * var25 << 8;
      int var34 = var20 * var25 - var22 * var23 << 5;
      int var35 = 0;
      int var36 = 0;
      if (var1 != var0) {
         var35 = (var4 - var3 << 16) / (var1 - var0);
         var36 = (var7 - var6 << 16) / (var1 - var0);
      }

      int var37 = 0;
      int var38 = 0;
      if (var2 != var1) {
         var37 = (var5 - var4 << 16) / (var2 - var1);
         var38 = (var8 - var7 << 16) / (var2 - var1);
      }

      int var39 = 0;
      int var40 = 0;
      if (var2 != var0) {
         var39 = (var3 - var5 << 16) / (var0 - var2);
         var40 = (var6 - var8 << 16) / (var0 - var2);
      }

      int var41;
      if (var0 <= var1 && var0 <= var2) {
         if (var0 < Draw2D.bottom) {
            if (var1 > Draw2D.bottom) {
               var1 = Draw2D.bottom;
            }

            if (var2 > Draw2D.bottom) {
               var2 = Draw2D.bottom;
            }

            if (var1 < var2) {
               var5 = var3 <<= 16;
               var8 = var6 <<= 16;
               if (var0 < 0) {
                  var5 -= var39 * var0;
                  var3 -= var35 * var0;
                  var8 -= var40 * var0;
                  var6 -= var36 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               var7 <<= 16;
               if (var1 < 0) {
                  var4 -= var37 * var1;
                  var7 -= var38 * var1;
                  var1 = 0;
               }

               var41 = var0 - anInt687;
               var26 += var28 * var41;
               var29 += var31 * var41;
               var32 += var34 * var41;
               if (var0 != var1 && var39 < var35 || var0 == var1 && var39 > var37) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = lineOffset[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           method522(Draw2D.data, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
                           var5 += var39;
                           var4 += var37;
                           var8 += var40;
                           var7 += var38;
                           var0 += Draw2D.width2d;
                           var26 += var28;
                           var29 += var31;
                           var32 += var34;
                        }
                     }

                     method522(Draw2D.data, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                     var5 += var39;
                     var3 += var35;
                     var8 += var40;
                     var6 += var36;
                     var0 += Draw2D.width2d;
                     var26 += var28;
                     var29 += var31;
                     var32 += var34;
                  }
               }

               var2 -= var1;
               var1 -= var0;
               var0 = lineOffset[var0];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method522(Draw2D.data, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
                        var5 += var39;
                        var4 += var37;
                        var8 += var40;
                        var7 += var38;
                        var0 += Draw2D.width2d;
                        var26 += var28;
                        var29 += var31;
                        var32 += var34;
                     }
                  }

                  method522(Draw2D.data, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
                  var5 += var39;
                  var3 += var35;
                  var8 += var40;
                  var6 += var36;
                  var0 += Draw2D.width2d;
                  var26 += var28;
                  var29 += var31;
                  var32 += var34;
               }
            }

            var4 = var3 <<= 16;
            var7 = var6 <<= 16;
            if (var0 < 0) {
               var4 -= var39 * var0;
               var3 -= var35 * var0;
               var7 -= var40 * var0;
               var6 -= var36 * var0;
               var0 = 0;
            }

            var5 <<= 16;
            var8 <<= 16;
            if (var2 < 0) {
               var5 -= var37 * var2;
               var8 -= var38 * var2;
               var2 = 0;
            }

            var41 = var0 - anInt687;
            var26 += var28 * var41;
            var29 += var31 * var41;
            var32 += var34 * var41;
            if (var0 != var2 && var39 < var35 || var0 == var2 && var37 > var35) {
               var1 -= var2;
               var2 -= var0;
               var0 = lineOffset[var0];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method522(Draw2D.data, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                        var5 += var37;
                        var3 += var35;
                        var8 += var38;
                        var6 += var36;
                        var0 += Draw2D.width2d;
                        var26 += var28;
                        var29 += var31;
                        var32 += var34;
                     }
                  }

                  method522(Draw2D.data, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                  var4 += var39;
                  var3 += var35;
                  var7 += var40;
                  var6 += var36;
                  var0 += Draw2D.width2d;
                  var26 += var28;
                  var29 += var31;
                  var32 += var34;
               }
            }

            var1 -= var2;
            var2 -= var0;
            var0 = lineOffset[var0];

            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method522(Draw2D.data, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
                     var5 += var37;
                     var3 += var35;
                     var8 += var38;
                     var6 += var36;
                     var0 += Draw2D.width2d;
                     var26 += var28;
                     var29 += var31;
                     var32 += var34;
                  }
               }

               method522(Draw2D.data, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
               var4 += var39;
               var3 += var35;
               var7 += var40;
               var6 += var36;
               var0 += Draw2D.width2d;
               var26 += var28;
               var29 += var31;
               var32 += var34;
            }
         }
      } else if (var1 <= var2) {
         if (var1 < Draw2D.bottom) {
            if (var2 > Draw2D.bottom) {
               var2 = Draw2D.bottom;
            }

            if (var0 > Draw2D.bottom) {
               var0 = Draw2D.bottom;
            }

            if (var2 < var0) {
               var3 = var4 <<= 16;
               var6 = var7 <<= 16;
               if (var1 < 0) {
                  var3 -= var35 * var1;
                  var4 -= var37 * var1;
                  var6 -= var36 * var1;
                  var7 -= var38 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               var8 <<= 16;
               if (var2 < 0) {
                  var5 -= var39 * var2;
                  var8 -= var40 * var2;
                  var2 = 0;
               }

               var41 = var1 - anInt687;
               var26 += var28 * var41;
               var29 += var31 * var41;
               var32 += var34 * var41;
               if (var1 != var2 && var35 < var37 || var1 == var2 && var35 > var39) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = lineOffset[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           method522(Draw2D.data, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
                           var3 += var35;
                           var5 += var39;
                           var6 += var36;
                           var8 += var40;
                           var1 += Draw2D.width2d;
                           var26 += var28;
                           var29 += var31;
                           var32 += var34;
                        }
                     }

                     method522(Draw2D.data, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
                     var3 += var35;
                     var4 += var37;
                     var6 += var36;
                     var7 += var38;
                     var1 += Draw2D.width2d;
                     var26 += var28;
                     var29 += var31;
                     var32 += var34;
                  }
               }

               var0 -= var2;
               var2 -= var1;
               var1 = lineOffset[var1];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        method522(Draw2D.data, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                        var3 += var35;
                        var5 += var39;
                        var6 += var36;
                        var8 += var40;
                        var1 += Draw2D.width2d;
                        var26 += var28;
                        var29 += var31;
                        var32 += var34;
                     }
                  }

                  method522(Draw2D.data, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                  var3 += var35;
                  var4 += var37;
                  var6 += var36;
                  var7 += var38;
                  var1 += Draw2D.width2d;
                  var26 += var28;
                  var29 += var31;
                  var32 += var34;
               }
            }

            var5 = var4 <<= 16;
            var8 = var7 <<= 16;
            if (var1 < 0) {
               var5 -= var35 * var1;
               var4 -= var37 * var1;
               var8 -= var36 * var1;
               var7 -= var38 * var1;
               var1 = 0;
            }

            var3 <<= 16;
            var6 <<= 16;
            if (var0 < 0) {
               var3 -= var39 * var0;
               var6 -= var40 * var0;
               var0 = 0;
            }

            var41 = var1 - anInt687;
            var26 += var28 * var41;
            var29 += var31 * var41;
            var32 += var34 * var41;
            if (var35 < var37) {
               var2 -= var0;
               var0 -= var1;
               var1 = lineOffset[var1];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        method522(Draw2D.data, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
                        var3 += var39;
                        var4 += var37;
                        var6 += var40;
                        var7 += var38;
                        var1 += Draw2D.width2d;
                        var26 += var28;
                        var29 += var31;
                        var32 += var34;
                     }
                  }

                  method522(Draw2D.data, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
                  var5 += var35;
                  var4 += var37;
                  var8 += var36;
                  var7 += var38;
                  var1 += Draw2D.width2d;
                  var26 += var28;
                  var29 += var31;
                  var32 += var34;
               }
            }

            var2 -= var0;
            var0 -= var1;
            var1 = lineOffset[var1];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        return;
                     }

                     method522(Draw2D.data, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                     var3 += var39;
                     var4 += var37;
                     var6 += var40;
                     var7 += var38;
                     var1 += Draw2D.width2d;
                     var26 += var28;
                     var29 += var31;
                     var32 += var34;
                  }
               }

               method522(Draw2D.data, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
               var5 += var35;
               var4 += var37;
               var8 += var36;
               var7 += var38;
               var1 += Draw2D.width2d;
               var26 += var28;
               var29 += var31;
               var32 += var34;
            }
         }
      } else if (var2 < Draw2D.bottom) {
         if (var0 > Draw2D.bottom) {
            var0 = Draw2D.bottom;
         }

         if (var1 > Draw2D.bottom) {
            var1 = Draw2D.bottom;
         }

         if (var0 < var1) {
            var4 = var5 <<= 16;
            var7 = var8 <<= 16;
            if (var2 < 0) {
               var4 -= var37 * var2;
               var5 -= var39 * var2;
               var7 -= var38 * var2;
               var8 -= var40 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            var6 <<= 16;
            if (var0 < 0) {
               var3 -= var35 * var0;
               var6 -= var36 * var0;
               var0 = 0;
            }

            var41 = var2 - anInt687;
            var26 += var28 * var41;
            var29 += var31 * var41;
            var32 += var34 * var41;
            if (var37 < var39) {
               var1 -= var0;
               var0 -= var2;
               var2 = lineOffset[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        method522(Draw2D.data, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
                        var4 += var37;
                        var3 += var35;
                        var7 += var38;
                        var6 += var36;
                        var2 += Draw2D.width2d;
                        var26 += var28;
                        var29 += var31;
                        var32 += var34;
                     }
                  }

                  method522(Draw2D.data, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
                  var4 += var37;
                  var5 += var39;
                  var7 += var38;
                  var8 += var40;
                  var2 += Draw2D.width2d;
                  var26 += var28;
                  var29 += var31;
                  var32 += var34;
               }
            }

            var1 -= var0;
            var0 -= var2;
            var2 = lineOffset[var2];

            while(true) {
               --var0;
               if (var0 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        return;
                     }

                     method522(Draw2D.data, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
                     var4 += var37;
                     var3 += var35;
                     var7 += var38;
                     var6 += var36;
                     var2 += Draw2D.width2d;
                     var26 += var28;
                     var29 += var31;
                     var32 += var34;
                  }
               }

               method522(Draw2D.data, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
               var4 += var37;
               var5 += var39;
               var7 += var38;
               var8 += var40;
               var2 += Draw2D.width2d;
               var26 += var28;
               var29 += var31;
               var32 += var34;
            }
         }

         var3 = var5 <<= 16;
         var6 = var8 <<= 16;
         if (var2 < 0) {
            var3 -= var37 * var2;
            var5 -= var39 * var2;
            var6 -= var38 * var2;
            var8 -= var40 * var2;
            var2 = 0;
         }

         var4 <<= 16;
         var7 <<= 16;
         if (var1 < 0) {
            var4 -= var35 * var1;
            var7 -= var36 * var1;
            var1 = 0;
         }

         var41 = var2 - anInt687;
         var26 += var28 * var41;
         var29 += var31 * var41;
         var32 += var34 * var41;
         if (var37 < var39) {
            var0 -= var1;
            var1 -= var2;
            var2 = lineOffset[var2];

            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        return;
                     }

                     method522(Draw2D.data, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
                     var4 += var35;
                     var5 += var39;
                     var7 += var36;
                     var8 += var40;
                     var2 += Draw2D.width2d;
                     var26 += var28;
                     var29 += var31;
                     var32 += var34;
                  }
               }

               method522(Draw2D.data, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var26, var29, var32, var27, var30, var33);
               var3 += var37;
               var5 += var39;
               var6 += var38;
               var8 += var40;
               var2 += Draw2D.width2d;
               var26 += var28;
               var29 += var31;
               var32 += var34;
            }
         }

         var0 -= var1;
         var1 -= var2;
         var2 = lineOffset[var2];

         while(true) {
            --var1;
            if (var1 < 0) {
               while(true) {
                  --var0;
                  if (var0 < 0) {
                     return;
                  }

                  method522(Draw2D.data, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var26, var29, var32, var27, var30, var33);
                  var4 += var35;
                  var5 += var39;
                  var7 += var36;
                  var8 += var40;
                  var2 += Draw2D.width2d;
                  var26 += var28;
                  var29 += var31;
                  var32 += var34;
               }
            }

            method522(Draw2D.data, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var26, var29, var32, var27, var30, var33);
            var3 += var37;
            var5 += var39;
            var6 += var38;
            var8 += var40;
            var2 += Draw2D.width2d;
            var26 += var28;
            var29 += var31;
            var32 += var34;
         }
      }

   }

   private static void method520(int[] var0, int var1, int var2, int var3, int var4) {
      if (aBoolean177) {
         if (var4 > Draw2D.boundX) {
            var4 = Draw2D.boundX;
         }

         if (var3 < 0) {
            var3 = 0;
         }
      }

      if (var3 < var4) {
         var1 += var3;
         int var5 = var4 - var3 >> 2;
         int var6;
         if (anInt685 == 0) {
            while(true) {
               --var5;
               if (var5 < 0) {
                  var5 = var4 - var3 & 3;

                  while(true) {
                     --var5;
                     if (var5 < 0) {
                        return;
                     }

                     var0[var1++] = var2;
                  }
               }

               var6 = var1 + 1;
               var0[var1] = var2;
               var0[var6++] = var2;
               var0[var6++] = var2;
               var1 = var6 + 1;
               var0[var6] = var2;
            }
         } else {
            int var7 = anInt685;
            int var8 = 256 - anInt685;
            int var9 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & 65280) * var8 >> 8 & 65280);

            while(true) {
               --var5;
               if (var5 < 0) {
                  var5 = var4 - var3 & 3;

                  while(true) {
                     --var5;
                     if (var5 < 0) {
                        return;
                     }

                     var0[var1++] = var9 + ((var0[var1] & 16711935) * var7 >> 8 & 16711935) + ((var0[var1] & 65280) * var7 >> 8 & 65280);
                  }
               }

               var6 = var1 + 1;
               var0[var1] = var9 + ((var0[var6] & 16711935) * var7 >> 8 & 16711935) + ((var0[var6] & 65280) * var7 >> 8 & 65280);
               int var10 = var6 + 1;
               var0[var6] = var9 + ((var0[var10] & 16711935) * var7 >> 8 & 16711935) + ((var0[var10] & 65280) * var7 >> 8 & 65280);
               int var11 = var10 + 1;
               var0[var10] = var9 + ((var0[var11] & 16711935) * var7 >> 8 & 16711935) + ((var0[var11] & 65280) * var7 >> 8 & 65280);
               var1 = var11 + 1;
               var0[var11] = var9 + ((var0[var1] & 16711935) * var7 >> 8 & 16711935) + ((var0[var1] & 65280) * var7 >> 8 & 65280);
            }
         }
      }
   }

   private static void method518(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      if (aBoolean179) {
         if (aBoolean177) {
            if (var3 - var2 > 3) {
               var6 = (var5 - var4) / (var3 - var2);
            } else {
               var6 = 0;
            }

            if (var3 > Draw2D.boundX) {
               var3 = Draw2D.boundX;
            }

            if (var2 < 0) {
               var4 -= var2 * var6;
               var2 = 0;
            }

            if (var2 >= var3) {
               return;
            }

            var1 += var2;
            var9 = var3 - var2 >> 2;
            var6 <<= 2;
         } else {
            if (var2 >= var3) {
               return;
            }

            var1 += var2;
            var9 = var3 - var2 >> 2;
            if (var9 > 0) {
               var6 = (var5 - var4) * anIntArray179[var9] >> 15;
            } else {
               var6 = 0;
            }
         }

         if (anInt685 != 0) {
            var7 = anInt685;
            var8 = 256 - anInt685;

            while(true) {
               --var9;
               if (var9 < 0) {
                  var9 = var3 - var2 & 3;
                  if (var9 > 0) {
                     var10 = anIntArray186[var4 >> 8];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);

                     do {
                        var0[var1++] = var10 + ((var0[var1] & 16711935) * var7 >> 8 & 16711935) + ((var0[var1] & 65280) * var7 >> 8 & 65280);
                        --var9;
                     } while(var9 > 0);
                  }
                  break;
               }

               var10 = anIntArray186[var4 >> 8];
               var4 += var6;
               var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
               var11 = var1 + 1;
               var0[var1] = var10 + ((var0[var11] & 16711935) * var7 >> 8 & 16711935) + ((var0[var11] & 65280) * var7 >> 8 & 65280);
               var0[var11++] = var10 + ((var0[var11] & 16711935) * var7 >> 8 & 16711935) + ((var0[var11] & 65280) * var7 >> 8 & 65280);
               var0[var11++] = var10 + ((var0[var11] & 16711935) * var7 >> 8 & 16711935) + ((var0[var11] & 65280) * var7 >> 8 & 65280);
               var1 = var11 + 1;
               var0[var11] = var10 + ((var0[var1] & 16711935) * var7 >> 8 & 16711935) + ((var0[var1] & 65280) * var7 >> 8 & 65280);
            }
         } else {
            while(true) {
               --var9;
               if (var9 < 0) {
                  var9 = var3 - var2 & 3;
                  if (var9 > 0) {
                     var10 = anIntArray186[var4 >> 8];

                     do {
                        var0[var1++] = var10;
                        --var9;
                     } while(var9 > 0);

                     return;
                  }
                  break;
               }

               var10 = anIntArray186[var4 >> 8];
               var4 += var6;
               var11 = var1 + 1;
               var0[var1] = var10;
               var12 = var11 + 1;
               var0[var11] = var10;
               int var13 = var12 + 1;
               var0[var12] = var10;
               var1 = var13 + 1;
               var0[var13] = var10;
            }
         }
      } else if (var2 < var3) {
         var6 = (var5 - var4) / (var3 - var2);
         if (aBoolean177) {
            if (var3 > Draw2D.boundX) {
               var3 = Draw2D.boundX;
            }

            if (var2 < 0) {
               var4 -= var2 * var6;
               var2 = 0;
            }

            if (var2 >= var3) {
               return;
            }
         }

         var11 = var1 + var2;
         var9 = var3 - var2;
         if (anInt685 == 0) {
            do {
               var0[var11++] = anIntArray186[var4 >> 8];
               var4 += var6;
               --var9;
            } while(var9 > 0);
         } else {
            var7 = anInt685;
            var8 = 256 - anInt685;

            do {
               var10 = anIntArray186[var4 >> 8];
               var4 += var6;
               var12 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
               var0[var11++] = var12 + ((var0[var11] & 16711935) * var7 >> 8 & 16711935) + ((var0[var11] & 65280) * var7 >> 8 & 65280);
               --var9;
            } while(var9 > 0);
         }
      }

   }

   private static void method522(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if (var5 < var6) {
         int var15;
         int var16;
         if (aBoolean177) {
            var15 = (var8 - var7) / (var6 - var5);
            if (var6 > Draw2D.boundX) {
               var6 = Draw2D.boundX;
            }

            if (var5 < 0) {
               var7 -= var5 * var15;
               var5 = 0;
            }

            if (var5 >= var6) {
               return;
            }

            var16 = var6 - var5 >> 3;
            var15 <<= 12;
            var7 <<= 9;
         } else {
            if (var6 - var5 > 7) {
               var16 = var6 - var5 >> 3;
               var15 = (var8 - var7) * anIntArray179[var16] >> 6;
            } else {
               var16 = 0;
               var15 = 0;
            }

            var7 <<= 9;
         }

         var4 += var5;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         int var28;
         int var29;
         int var30;
         int var31;
         int var32;
         int var33;
         int var34;
         int var35;
         if (aBoolean176) {
            var17 = 0;
            var18 = 0;
            var20 = var5 - anInt686;
            var25 = var9 + (var12 >> 3) * var20;
            var26 = var10 + (var13 >> 3) * var20;
            var27 = var11 + (var14 >> 3) * var20;
            var19 = var27 >> 12;
            if (var19 != 0) {
               var2 = var25 / var19;
               var3 = var26 / var19;
               if (var2 < 0) {
                  var2 = 0;
               } else if (var2 > 4032) {
                  var2 = 4032;
               }
            }

            var9 = var25 + var12;
            var10 = var26 + var13;
            var11 = var27 + var14;
            var19 = var11 >> 12;
            if (var19 != 0) {
               var17 = var9 / var19;
               var18 = var10 / var19;
               if (var17 < 7) {
                  var17 = 7;
               } else if (var17 > 4032) {
                  var17 = 4032;
               }
            }

            var21 = var17 - var2 >> 3;
            var22 = var18 - var3 >> 3;
            var2 += var7 >> 3 & 786432;
            var23 = var7 >> 23;
            if (aBoolean178) {
               while(var16-- > 0) {
                  var24 = var4 + 1;
                  var0[var4] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var0[var24++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var0[var24++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var0[var24++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var0[var24++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var0[var24++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var0[var24++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var4 = var24 + 1;
                  var0[var24] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 = var17;
                  var3 = var18;
                  var9 += var12;
                  var10 += var13;
                  var11 += var14;
                  var19 = var11 >> 12;
                  if (var19 != 0) {
                     var17 = var9 / var19;
                     var18 = var10 / var19;
                     if (var17 < 7) {
                        var17 = 7;
                     } else if (var17 > 4032) {
                        var17 = 4032;
                     }
                  }

                  var21 = var17 - var2 >> 3;
                  var22 = var18 - var3 >> 3;
                  var7 += var15;
                  var2 += var7 >> 3 & 786432;
                  var23 = var7 >> 23;
               }

               for(var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
                  var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
                  var2 += var21;
               }
            } else {
               while(var16-- > 0) {
                  if ((var28 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var4] = var28;
                  }

                  var24 = var4 + 1;
                  var2 += var21;
                  var3 += var22;
                  if ((var29 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var29;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var30 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var30;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var31 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var31;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var32 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var32;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var33 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var33;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var34 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var34;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var35 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var24] = var35;
                  }

                  var4 = var24 + 1;
                  var2 = var17;
                  var3 = var18;
                  var9 += var12;
                  var10 += var13;
                  var11 += var14;
                  var19 = var11 >> 12;
                  if (var19 != 0) {
                     var17 = var9 / var19;
                     var18 = var10 / var19;
                     if (var17 < 7) {
                        var17 = 7;
                     } else if (var17 > 4032) {
                        var17 = 4032;
                     }
                  }

                  var21 = var17 - var2 >> 3;
                  var22 = var18 - var3 >> 3;
                  var7 += var15;
                  var2 += var7 >> 3 & 786432;
                  var23 = var7 >> 23;
               }

               for(var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
                  if ((var28 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
                     var0[var4] = var28;
                  }

                  ++var4;
                  var2 += var21;
               }
            }

         } else {
            var17 = 0;
            var18 = 0;
            var20 = var5 - anInt686;
            var25 = var9 + (var12 >> 3) * var20;
            var26 = var10 + (var13 >> 3) * var20;
            var27 = var11 + (var14 >> 3) * var20;
            var19 = var27 >> 14;
            if (var19 != 0) {
               var2 = var25 / var19;
               var3 = var26 / var19;
               if (var2 < 0) {
                  var2 = 0;
               } else if (var2 > 16256) {
                  var2 = 16256;
               }
            }

            var9 = var25 + var12;
            var10 = var26 + var13;
            var11 = var27 + var14;
            var19 = var11 >> 14;
            if (var19 != 0) {
               var17 = var9 / var19;
               var18 = var10 / var19;
               if (var17 < 7) {
                  var17 = 7;
               } else if (var17 > 16256) {
                  var17 = 16256;
               }
            }

            var21 = var17 - var2 >> 3;
            var22 = var18 - var3 >> 3;
            var2 += var7 & 6291456;
            var23 = var7 >> 23;
            if (!aBoolean178) {
               while(var16-- > 0) {
                  if ((var28 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var4] = var28;
                  }

                  var24 = var4 + 1;
                  var2 += var21;
                  var3 += var22;
                  if ((var29 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var29;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var30 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var30;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var31 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var31;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var32 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var32;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var33 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var33;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var34 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var34;
                  }

                  ++var24;
                  var2 += var21;
                  var3 += var22;
                  if ((var35 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var24] = var35;
                  }

                  var4 = var24 + 1;
                  var2 = var17;
                  var3 = var18;
                  var9 += var12;
                  var10 += var13;
                  var11 += var14;
                  var19 = var11 >> 14;
                  if (var19 != 0) {
                     var17 = var9 / var19;
                     var18 = var10 / var19;
                     if (var17 < 7) {
                        var17 = 7;
                     } else if (var17 > 16256) {
                        var17 = 16256;
                     }
                  }

                  var21 = var17 - var2 >> 3;
                  var22 = var18 - var3 >> 3;
                  var7 += var15;
                  var2 += var7 & 6291456;
                  var23 = var7 >> 23;
               }

               for(var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
                  if ((var28 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
                     var0[var4] = var28;
                  }

                  ++var4;
                  var2 += var21;
               }

            } else {
               while(var16-- > 0) {
                  var24 = var4 + 1;
                  var0[var4] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var28 = var24 + 1;
                  var0[var24] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var29 = var28 + 1;
                  var0[var28] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var30 = var29 + 1;
                  var0[var29] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var31 = var30 + 1;
                  var0[var30] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var32 = var31 + 1;
                  var0[var31] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var33 = var32 + 1;
                  var0[var32] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
                  var3 += var22;
                  var4 = var33 + 1;
                  var0[var33] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 = var17;
                  var3 = var18;
                  var9 += var12;
                  var10 += var13;
                  var11 += var14;
                  var19 = var11 >> 14;
                  if (var19 != 0) {
                     var17 = var9 / var19;
                     var18 = var10 / var19;
                     if (var17 < 7) {
                        var17 = 7;
                     } else if (var17 > 16256) {
                        var17 = 16256;
                     }
                  }

                  var21 = var17 - var2 >> 3;
                  var22 = var18 - var3 >> 3;
                  var7 += var15;
                  var2 += var7 & 6291456;
                  var23 = var7 >> 23;
               }

               for(var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
                  var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
                  var2 += var21;
               }

            }
         }
      }
   }

   public static void method507(int var0) {
      boolean var1 = false;
      lineOffset = new int[Draw2D.height2d];

      for(int var2 = 0; var2 < Draw2D.height2d; ++var2) {
         lineOffset[var2] = Draw2D.width2d * var2;
      }

      anInt686 = Draw2D.width2d / 2;
      anInt687 = Draw2D.height2d / 2;
   }

   public static int method512(int var0) {
      if (anIntArray184[var0] != 0) {
         return anIntArray184[var0];
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = anIntArrayArray19[var0].length;

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            var1 += anIntArrayArray19[var0][var5] >> 16 & 255;
            var2 += anIntArrayArray19[var0][var5] >> 8 & 255;
            var3 += anIntArrayArray19[var0][var5] & 255;
         }

         var5 = (var1 / var4 << 16) + (var2 / var4 << 8) + var3 / var4;
         var5 = method516(var5, 1.4);
         if (var5 == 0) {
            var5 = 1;
         }

         anIntArray184[var0] = var5;
         return var5;
      }
   }

   public static void method506() {
      anIntArray179 = null;
      anIntArray179 = null;
      anIntArray181 = null;
      anIntArray182 = null;
      lineOffset = null;
      aClass10_Sub1_Sub1_Sub3Array1 = null;
      aBooleanArray9 = null;
      anIntArray184 = null;
      anIntArrayArray17 = null;
      anIntArrayArray18 = null;
      anIntArray185 = null;
      anIntArray186 = null;
      anIntArrayArray19 = null;
   }

   public static void unpackTextures(Jagfile var0) {
      anInt688 = 0;

      for(int var1 = 0; var1 < 50; ++var1) {
         try {
            aClass10_Sub1_Sub1_Sub3Array1[var1] = new Class10_Sub1_Sub1_Sub3(var0, String.valueOf(var1), 0);
            if (aBoolean176 && aClass10_Sub1_Sub1_Sub3Array1[var1].anInt656 == 128) {
               aClass10_Sub1_Sub1_Sub3Array1[var1].method435();
            } else {
               aClass10_Sub1_Sub1_Sub3Array1[var1].method436();
            }

            ++anInt688;
         } catch (Exception var3) {
         }
      }

   }

   public static void init3D(int var0, int var1) {
      lineOffset = new int[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         lineOffset[var2] = var1 * var2;
      }

      anInt686 = var1 / 2;
      anInt687 = var0 / 2;
   }
}
