public final class World {
   public static boolean aBoolean15 = true;
   private static int anInt55 = (int)(Math.random() * 17.0) - 8;
   public static int anInt56 = 99;
   public static int anInt60;
   private static final int[] anIntArray13 = new int[]{0, -1, 0, 1};
   private static byte aByte5 = -80;
   private static int anInt61 = (int)(Math.random() * 33.0) - 16;
   private static final int[] anIntArray19 = new int[]{1, 2, 4, 8};
   private static final int[] anIntArray20 = new int[]{1, 0, -1, 0};
   private static final int[] anIntArray21 = new int[]{16, 32, 64, 128};
   private byte aByte6 = 0;
   private int anInt59 = 20411;
   private byte aByte4 = 0;
   private byte[][][] aByteArrayArrayArray1;
   private boolean aBoolean13 = true;
   private int[][][] anIntArrayArrayArray1;
   private int anInt57;
   private boolean aBoolean14 = true;
   private int anInt58;
   private byte[][][] aByteArrayArrayArray6;
   private int anInt62 = 69;
   private byte[][][] aByteArrayArrayArray4;
   private byte[][][] aByteArrayArrayArray5;
   private byte[][][] aByteArrayArrayArray3;
   private byte[][][] aByteArrayArrayArray2;
   private int[] anIntArray14;
   private int[] anIntArray15;
   private int[] anIntArray16;
   private int[][][] anIntArrayArrayArray2;
   private int[] anIntArray17;
   private int[] anIntArray18;
   private int[][] anIntArrayArray4;

   public World(int[][][] var1, int var2, byte[][][] var3, int var4, int var5) {
      anInt56 = 99;
      this.anInt57 = var5;
      this.anInt58 = var4;
      this.anIntArrayArrayArray1 = var1;
      this.aByteArrayArrayArray1 = var3;
      this.aByteArrayArrayArray5 = new byte[4][this.anInt57][this.anInt58];
      this.aByteArrayArrayArray4 = new byte[4][this.anInt57][this.anInt58];
      this.aByteArrayArrayArray3 = new byte[4][this.anInt57][this.anInt58];
      this.aByteArrayArrayArray2 = new byte[4][this.anInt57][this.anInt58];
      this.anIntArrayArrayArray2 = new int[4][this.anInt57 + 1][this.anInt58 + 1];
      this.aByteArrayArrayArray6 = new byte[4][this.anInt57 + 1][this.anInt58 + 1];
      this.anIntArrayArray4 = new int[this.anInt57 + 1][this.anInt58 + 1];
      this.anIntArray14 = new int[this.anInt58];
      this.anIntArray15 = new int[this.anInt58];
      this.anIntArray16 = new int[this.anInt58];
      this.anIntArray17 = new int[this.anInt58];
      this.anIntArray18 = new int[this.anInt58];
   }

   private void method31(int var1, int var2, Packet var3, int var4, int var5, int var6, int var7) {
      int var8;
      if (var5 >= 0 && var5 < 104 && var7 >= 0 && var7 < 104) {
         this.aByteArrayArrayArray1[var6][var5][var7] = 0;

         while(true) {
            var8 = var3.g1();
            if (var8 == 0) {
               if (var6 == 0) {
                  this.anIntArrayArrayArray1[0][var5][var7] = -method32(var5 + var1 + 932731, var7 + 556238 + var2) * 8;
                  return;
               } else {
                  this.anIntArrayArrayArray1[var6][var5][var7] = this.anIntArrayArrayArray1[var6 - 1][var5][var7] - 240;
                  return;
               }
            }

            if (var8 == 1) {
               int var9 = var3.g1();
               if (var9 == 1) {
                  var9 = 0;
               }

               if (var6 == 0) {
                  this.anIntArrayArrayArray1[0][var5][var7] = -var9 * 8;
                  return;
               }

               this.anIntArrayArrayArray1[var6][var5][var7] = this.anIntArrayArrayArray1[var6 - 1][var5][var7] - var9 * 8;
               return;
            }

            if (var8 <= 49) {
               this.aByteArrayArrayArray4[var6][var5][var7] = var3.g1b();
               this.aByteArrayArrayArray3[var6][var5][var7] = (byte)((var8 - 2) / 4);
               this.aByteArrayArrayArray2[var6][var5][var7] = (byte)(var8 + var4 - 2 & 3);
            } else if (var8 <= 81) {
               this.aByteArrayArrayArray1[var6][var5][var7] = (byte)(var8 - 49);
            } else {
               this.aByteArrayArrayArray5[var6][var5][var7] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var3.g1();
            if (var8 == 0) {
               return;
            }

            if (var8 == 1) {
               var3.g1();
               return;
            }

            if (var8 <= 49) {
               var3.g1();
            }
         }
      }
   }

   private int method12(int var1, int var2, int var3) {
      if (this.aByte6 != 0) {
         return 2;
      } else if ((this.aByteArrayArrayArray1[var2][var3][var1] & 8) != 0) {
         return 0;
      } else {
         return var2 > 0 && (this.aByteArrayArrayArray1[1][var3][var1] & 2) != 0 ? var2 - 1 : var2;
      }
   }

   private void method21(World3D var1, Class47 var2, int var3, int var4, int var5, byte var6, int var7, int var8, int var9) {
      if (aBoolean15 && (this.aByteArrayArrayArray1[0][var5][var3] & 2) == 0) {
         if ((this.aByteArrayArrayArray1[var4][var5][var3] & 16) != 0) {
            return;
         }

         if (this.method12(var3, var4, var5) != anInt60) {
            return;
         }
      }

      if (var4 < anInt56) {
         anInt56 = var4;
      }

      int var10 = this.anIntArrayArrayArray1[var4][var5][var3];
      int var11 = this.anIntArrayArrayArray1[var4][var5 + 1][var3];
      int var12 = this.anIntArrayArrayArray1[var4][var5 + 1][var3 + 1];
      int var13 = this.anIntArrayArrayArray1[var4][var5][var3 + 1];
      int var14 = var10 + var11 + var12 + var13 >> 2;
      LocType var15 = LocType.method523(var9);
      int var16 = var5 + (var3 << 7) + (var9 << 14) + 1073741824;
      if (var6 != 0) {
         this.aBoolean14 = !this.aBoolean14;
      }

      if (!var15.aBoolean180) {
         var16 -= Integer.MIN_VALUE;
      }

      byte var17 = (byte)((var7 << 6) + var8);
      Object var18;
      if (var8 != 22) {
         int var19;
         int var20;
         if (var8 != 10 && var8 != 11) {
            int[] var10000;
            if (var8 >= 12) {
               if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                  var18 = var15.method531(var8, var7, var10, var11, var12, var13, -1);
               } else {
                  var18 = new LocEntity(var15.anInt709, var12, var13, var11, var8, (byte)3, var9, true, var10, var7);
               }

               var1.method200(var4, 1, var3, (Entity)var18, var17, 0, var5, 1, var14, var16);
               if (var8 >= 12 && var8 <= 17 && var8 != 13 && var4 > 0) {
                  var10000 = this.anIntArrayArrayArray2[var4][var5];
                  var10000[var3] |= 2340;
               }

               if (var15.aBoolean192 && var2 != null) {
                  var2.method482(var3, var7, var15.anInt697, var15.anInt707, var15.aBoolean191, var5);
               }
            } else if (var8 == 0) {
               if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                  var18 = var15.method531(0, var7, var10, var11, var12, var13, -1);
               } else {
                  var18 = new LocEntity(var15.anInt709, var12, var13, var11, 0, (byte)3, var9, true, var10, var7);
               }

               var1.method198(var14, 0, anIntArray19[var7], (Entity)null, var5, var16, var17, var3, (Entity)var18, var4);
               if (var7 == 0) {
                  if (var15.aBoolean190) {
                     this.aByteArrayArrayArray6[var4][var5][var3] = 50;
                     this.aByteArrayArrayArray6[var4][var5][var3 + 1] = 50;
                  }

                  if (var15.aBoolean187) {
                     var10000 = this.anIntArrayArrayArray2[var4][var5];
                     var10000[var3] |= 585;
                  }
               } else if (var7 == 1) {
                  if (var15.aBoolean190) {
                     this.aByteArrayArrayArray6[var4][var5][var3 + 1] = 50;
                     this.aByteArrayArrayArray6[var4][var5 + 1][var3 + 1] = 50;
                  }

                  if (var15.aBoolean187) {
                     var10000 = this.anIntArrayArrayArray2[var4][var5];
                     var10000[var3 + 1] |= 1170;
                  }
               } else if (var7 == 2) {
                  if (var15.aBoolean190) {
                     this.aByteArrayArrayArray6[var4][var5 + 1][var3] = 50;
                     this.aByteArrayArrayArray6[var4][var5 + 1][var3 + 1] = 50;
                  }

                  if (var15.aBoolean187) {
                     var10000 = this.anIntArrayArrayArray2[var4][var5 + 1];
                     var10000[var3] |= 585;
                  }
               } else if (var7 == 3) {
                  if (var15.aBoolean190) {
                     this.aByteArrayArrayArray6[var4][var5][var3] = 50;
                     this.aByteArrayArrayArray6[var4][var5 + 1][var3] = 50;
                  }

                  if (var15.aBoolean187) {
                     var10000 = this.anIntArrayArrayArray2[var4][var5];
                     var10000[var3] |= 1170;
                  }
               }

               if (var15.aBoolean192 && var2 != null) {
                  var2.method481(var7, var15.aBoolean191, var8, var5, var3);
               }

               if (var15.anInt708 != 16) {
                  var1.method206(var3, var15.anInt708, var4, var5);
               }
            } else if (var8 == 1) {
               if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                  var18 = var15.method531(1, var7, var10, var11, var12, var13, -1);
               } else {
                  var18 = new LocEntity(var15.anInt709, var12, var13, var11, 1, (byte)3, var9, true, var10, var7);
               }

               var1.method198(var14, 0, anIntArray21[var7], (Entity)null, var5, var16, var17, var3, (Entity)var18, var4);
               if (var15.aBoolean190) {
                  if (var7 == 0) {
                     this.aByteArrayArrayArray6[var4][var5][var3 + 1] = 50;
                  } else if (var7 == 1) {
                     this.aByteArrayArrayArray6[var4][var5 + 1][var3 + 1] = 50;
                  } else if (var7 == 2) {
                     this.aByteArrayArrayArray6[var4][var5 + 1][var3] = 50;
                  } else if (var7 == 3) {
                     this.aByteArrayArrayArray6[var4][var5][var3] = 50;
                  }
               }

               if (var15.aBoolean192 && var2 != null) {
                  var2.method481(var7, var15.aBoolean191, var8, var5, var3);
               }
            } else {
               Object var21;
               if (var8 == 2) {
                  var20 = var7 + 1 & 3;
                  Object var27;
                  if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                     var27 = var15.method531(2, var7 + 4, var10, var11, var12, var13, -1);
                     var21 = var15.method531(2, var20, var10, var11, var12, var13, -1);
                  } else {
                     var27 = new LocEntity(var15.anInt709, var12, var13, var11, 2, (byte)3, var9, true, var10, var7 + 4);
                     var21 = new LocEntity(var15.anInt709, var12, var13, var11, 2, (byte)3, var9, true, var10, var20);
                  }

                  var1.method198(var14, anIntArray19[var20], anIntArray19[var7], (Entity)var21, var5, var16, var17, var3, (Entity)var27, var4);
                  if (var15.aBoolean187) {
                     if (var7 == 0) {
                        var10000 = this.anIntArrayArrayArray2[var4][var5];
                        var10000[var3] |= 585;
                        var10000 = this.anIntArrayArrayArray2[var4][var5];
                        var10000[var3 + 1] |= 1170;
                     } else if (var7 == 1) {
                        var10000 = this.anIntArrayArrayArray2[var4][var5];
                        var10000[var3 + 1] |= 1170;
                        var10000 = this.anIntArrayArrayArray2[var4][var5 + 1];
                        var10000[var3] |= 585;
                     } else if (var7 == 2) {
                        var10000 = this.anIntArrayArrayArray2[var4][var5 + 1];
                        var10000[var3] |= 585;
                        var10000 = this.anIntArrayArrayArray2[var4][var5];
                        var10000[var3] |= 1170;
                     } else if (var7 == 3) {
                        var10000 = this.anIntArrayArrayArray2[var4][var5];
                        var10000[var3] |= 1170;
                        var10000 = this.anIntArrayArrayArray2[var4][var5];
                        var10000[var3] |= 585;
                     }
                  }

                  if (var15.aBoolean192 && var2 != null) {
                     var2.method481(var7, var15.aBoolean191, var8, var5, var3);
                  }

                  if (var15.anInt708 != 16) {
                     var1.method206(var3, var15.anInt708, var4, var5);
                  }
               } else if (var8 == 3) {
                  if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                     var18 = var15.method531(3, var7, var10, var11, var12, var13, -1);
                  } else {
                     var18 = new LocEntity(var15.anInt709, var12, var13, var11, 3, (byte)3, var9, true, var10, var7);
                  }

                  var1.method198(var14, 0, anIntArray21[var7], (Entity)null, var5, var16, var17, var3, (Entity)var18, var4);
                  if (var15.aBoolean190) {
                     if (var7 == 0) {
                        this.aByteArrayArrayArray6[var4][var5][var3 + 1] = 50;
                     } else if (var7 == 1) {
                        this.aByteArrayArrayArray6[var4][var5 + 1][var3 + 1] = 50;
                     } else if (var7 == 2) {
                        this.aByteArrayArrayArray6[var4][var5 + 1][var3] = 50;
                     } else if (var7 == 3) {
                        this.aByteArrayArrayArray6[var4][var5][var3] = 50;
                     }
                  }

                  if (var15.aBoolean192 && var2 != null) {
                     var2.method481(var7, var15.aBoolean191, var8, var5, var3);
                  }
               } else if (var8 == 9) {
                  if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                     var18 = var15.method531(var8, var7, var10, var11, var12, var13, -1);
                  } else {
                     var18 = new LocEntity(var15.anInt709, var12, var13, var11, var8, (byte)3, var9, true, var10, var7);
                  }

                  var1.method200(var4, 1, var3, (Entity)var18, var17, 0, var5, 1, var14, var16);
                  if (var15.aBoolean192 && var2 != null) {
                     var2.method482(var3, var7, var15.anInt697, var15.anInt707, var15.aBoolean191, var5);
                  }
               } else {
                  if (var15.aBoolean182) {
                     if (var7 == 1) {
                        var20 = var13;
                        var13 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var20;
                     } else if (var7 == 2) {
                        var20 = var13;
                        var13 = var11;
                        var11 = var20;
                        var20 = var12;
                        var12 = var10;
                        var10 = var20;
                     } else if (var7 == 3) {
                        var20 = var13;
                        var13 = var10;
                        var10 = var11;
                        var11 = var12;
                        var12 = var20;
                     }
                  }

                  if (var8 == 4) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var9, true, var10, 0);
                     }

                     var1.method199(var4, anIntArray19[var7], var7 * 512, var16, var17, var5, 0, var3, 0, var14, (Entity)var18);
                  } else if (var8 == 5) {
                     var20 = 16;
                     var19 = var1.method216(var4, var5, var3);
                     if (var19 > 0) {
                        var20 = LocType.method523(var19 >> 14 & 32767).anInt708;
                     }

                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var21 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var21 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var9, true, var10, 0);
                     }

                     var1.method199(var4, anIntArray19[var7], var7 * 512, var16, var17, var5, anIntArray13[var7] * var20, var3, anIntArray20[var7] * var20, var14, (Entity)var21);
                  } else if (var8 == 6) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var9, true, var10, 0);
                     }

                     var1.method199(var4, 256, var7, var16, var17, var5, 0, var3, 0, var14, (Entity)var18);
                  } else if (var8 == 7) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var9, true, var10, 0);
                     }

                     var1.method199(var4, 512, var7, var16, var17, var5, 0, var3, 0, var14, (Entity)var18);
                  } else if (var8 == 8) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var9, true, var10, 0);
                     }

                     var1.method199(var4, 768, var7, var16, var17, var5, 0, var3, 0, var14, (Entity)var18);
                  }
               }
            }
         } else {
            if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
               var18 = var15.method531(10, var7, var10, var11, var12, var13, -1);
            } else {
               var18 = new LocEntity(var15.anInt709, var12, var13, var11, 10, (byte)3, var9, true, var10, var7);
            }

            if (var18 != null) {
               var20 = 0;
               if (var8 == 11) {
                  var20 += 256;
               }

               int var26;
               if (var7 != 1 && var7 != 3) {
                  var19 = var15.anInt707;
                  var26 = var15.anInt697;
               } else {
                  var19 = var15.anInt697;
                  var26 = var15.anInt707;
               }

               if (var1.method200(var4, var19, var3, (Entity)var18, var17, var20, var5, var26, var14, var16) && var15.aBoolean190) {
                  Model var22;
                  if (var18 instanceof Model) {
                     var22 = (Model)var18;
                  } else {
                     var22 = var15.method531(10, var7, var10, var11, var12, var13, -1);
                  }

                  if (var22 != null) {
                     for(int var23 = 0; var23 <= var19; ++var23) {
                        for(int var24 = 0; var24 <= var26; ++var24) {
                           int var25 = var22.anInt409 / 4;
                           if (var25 > 30) {
                              var25 = 30;
                           }

                           if (var25 > this.aByteArrayArrayArray6[var4][var5 + var23][var3 + var24]) {
                              this.aByteArrayArrayArray6[var4][var5 + var23][var3 + var24] = (byte)var25;
                           }
                        }
                     }
                  }
               }
            }

            if (var15.aBoolean192 && var2 != null) {
               var2.method482(var3, var7, var15.anInt697, var15.anInt707, var15.aBoolean191, var5);
            }
         }
      } else if (!aBoolean15 || var15.aBoolean180 || var15.aBoolean181) {
         if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
            var18 = var15.method531(22, var7, var10, var11, var12, var13, -1);
         } else {
            var18 = new LocEntity(var15.anInt709, var12, var13, var11, 22, (byte)3, var9, true, var10, var7);
         }

         var1.method196(var5, var3, var17, var16, var14, var4, (Entity)var18);
         if (var15.aBoolean192 && var15.aBoolean180 && var2 != null) {
            var2.method483(var3, var5);
         }
      }

   }

   public void method15(Class47[] var1, int var2, World3D var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               if ((this.aByteArrayArrayArray1[var7][var4][var5] & 1) == 1) {
                  var6 = var7;
                  if ((this.aByteArrayArrayArray1[1][var4][var5] & 2) == 2) {
                     var6 = var7 - 1;
                  }

                  if (var6 >= 0) {
                     var1[var6].method483(var5, var4);
                  }
               }
            }
         }
      }

      anInt55 += (int)(Math.random() * 5.0) - 2;
      if (anInt55 < -8) {
         anInt55 = -8;
      }

      if (anInt55 > 8) {
         anInt55 = 8;
      }

      anInt61 += (int)(Math.random() * 5.0) - 2;
      if (anInt61 < -16) {
         anInt61 = -16;
      }

      if (anInt61 > 16) {
         anInt61 = 16;
      }

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      int var20;
      int var21;
      int var22;
      for(var4 = 0; var4 < 4; ++var4) {
         byte[][] var19 = this.aByteArrayArrayArray6[var4];
         var7 = (int)Math.sqrt(5100.0);
         var8 = var7 * 768 >> 8;

         for(var9 = 1; var9 < this.anInt58 - 1; ++var9) {
            for(var10 = 1; var10 < this.anInt57 - 1; ++var10) {
               var11 = this.anIntArrayArrayArray1[var4][var10 + 1][var9] - this.anIntArrayArrayArray1[var4][var10 - 1][var9];
               var12 = this.anIntArrayArrayArray1[var4][var10][var9 + 1] - this.anIntArrayArrayArray1[var4][var10][var9 - 1];
               var13 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + 65536));
               var14 = (var11 << 8) / var13;
               var15 = 65536 / var13;
               var16 = (var12 << 8) / var13;
               var17 = (var14 * -50 + var15 * -10 + var16 * -50) / var8 + 96;
               var18 = (var19[var10 - 1][var9] >> 2) + (var19[var10 + 1][var9] >> 3) + (var19[var10][var9 - 1] >> 2) + (var19[var10][var9 + 1] >> 3) + (var19[var10][var9] >> 1);
               this.anIntArrayArray4[var10][var9] = var17 - var18;
            }
         }

         for(var10 = 0; var10 < this.anInt58; ++var10) {
            this.anIntArray14[var10] = 0;
            this.anIntArray15[var10] = 0;
            this.anIntArray16[var10] = 0;
            this.anIntArray17[var10] = 0;
            this.anIntArray18[var10] = 0;
         }

         for(var11 = -5; var11 < this.anInt57 + 5; ++var11) {
            for(var12 = 0; var12 < this.anInt58; ++var12) {
               var13 = var11 + 5;
               int var10003;
               FloType var42;
               if (var13 >= 0 && var13 < this.anInt57) {
                  var14 = this.aByteArrayArrayArray5[var4][var13][var12] & 255;
                  if (var14 > 0) {
                     var42 = FloType.aClass16Array1[var14 - 1];
                     var10000 = this.anIntArray14;
                     var10000[var12] += var42.anInt170;
                     var10000 = this.anIntArray15;
                     var10000[var12] += var42.anInt168;
                     var10000 = this.anIntArray16;
                     var10000[var12] += var42.anInt169;
                     var10000 = this.anIntArray17;
                     var10000[var12] += var42.anInt171;
                     var10003 = this.anIntArray18[var12]++;
                  }
               }

               var14 = var11 - 5;
               if (var14 >= 0 && var14 < this.anInt57) {
                  var15 = this.aByteArrayArrayArray5[var4][var14][var12] & 255;
                  if (var15 > 0) {
                     var42 = FloType.aClass16Array1[var15 - 1];
                     var10000 = this.anIntArray14;
                     var10000[var12] -= var42.anInt170;
                     var10000 = this.anIntArray15;
                     var10000[var12] -= var42.anInt168;
                     var10000 = this.anIntArray16;
                     var10000[var12] -= var42.anInt169;
                     var10000 = this.anIntArray17;
                     var10000[var12] -= var42.anInt171;
                     var10003 = this.anIntArray18[var12]--;
                  }
               }
            }

            if (var11 >= 1 && var11 < this.anInt57 - 1) {
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;
               var17 = 0;

               for(var18 = -5; var18 < this.anInt58 + 5; ++var18) {
                  var20 = var18 + 5;
                  if (var20 >= 0 && var20 < this.anInt58) {
                     var13 += this.anIntArray14[var20];
                     var14 += this.anIntArray15[var20];
                     var15 += this.anIntArray16[var20];
                     var16 += this.anIntArray17[var20];
                     var17 += this.anIntArray18[var20];
                  }

                  var21 = var18 - 5;
                  if (var21 >= 0 && var21 < this.anInt58) {
                     var13 -= this.anIntArray14[var21];
                     var14 -= this.anIntArray15[var21];
                     var15 -= this.anIntArray16[var21];
                     var16 -= this.anIntArray17[var21];
                     var17 -= this.anIntArray18[var21];
                  }

                  if (var18 >= 1 && var18 < this.anInt58 - 1 && (!aBoolean15 || (this.aByteArrayArrayArray1[0][var11][var18] & 2) != 0 || (this.aByteArrayArrayArray1[var4][var11][var18] & 16) == 0 && this.method12(var18, var4, var11) == anInt60)) {
                     if (var4 < anInt56) {
                        anInt56 = var4;
                     }

                     var22 = this.aByteArrayArrayArray5[var4][var11][var18] & 255;
                     int var23 = this.aByteArrayArrayArray4[var4][var11][var18] & 255;
                     if (var22 > 0 || var23 > 0) {
                        int var24 = this.anIntArrayArrayArray1[var4][var11][var18];
                        int var25 = this.anIntArrayArrayArray1[var4][var11 + 1][var18];
                        int var26 = this.anIntArrayArrayArray1[var4][var11 + 1][var18 + 1];
                        int var27 = this.anIntArrayArrayArray1[var4][var11][var18 + 1];
                        int var28 = this.anIntArrayArray4[var11][var18];
                        int var29 = this.anIntArrayArray4[var11 + 1][var18];
                        int var30 = this.anIntArrayArray4[var11 + 1][var18 + 1];
                        int var31 = this.anIntArrayArray4[var11][var18 + 1];
                        int var32 = -1;
                        int var33 = -1;
                        int var34;
                        int var35;
                        if (var22 > 0) {
                           var34 = var13 * 256 / var16;
                           var35 = var14 / var17;
                           int var36 = var15 / var17;
                           var32 = this.method25(var34, var35, var36);
                           int var37 = var34 + anInt55 & 255;
                           var36 += anInt61;
                           if (var36 < 0) {
                              var36 = 0;
                           } else if (var36 > 255) {
                              var36 = 255;
                           }

                           var33 = this.method25(var37, var35, var36);
                        }

                        if (var4 > 0) {
                           boolean var44 = true;
                           if (var22 == 0 && this.aByteArrayArrayArray3[var4][var11][var18] != 0) {
                              var44 = false;
                           }

                           if (var23 > 0 && !FloType.aClass16Array1[var23 - 1].aBoolean48) {
                              var44 = false;
                           }

                           if (var44 && var24 == var25 && var24 == var26 && var24 == var27) {
                              var10000 = this.anIntArrayArrayArray2[var4][var11];
                              var10000[var18] |= 2340;
                           }
                        }

                        var34 = 0;
                        if (var32 != -1) {
                           var34 = Draw3D.anIntArray186[method19(var33, 96)];
                        }

                        if (var23 == 0) {
                           var3.method195(var4, var11, var18, 0, 0, -1, var24, var25, var26, var27, method19(var32, var28), method19(var32, var29), method19(var32, var30), method19(var32, var31), 0, 0, 0, 0, var34, 0);
                        } else {
                           var35 = this.aByteArrayArrayArray3[var4][var11][var18] + 1;
                           byte var45 = this.aByteArrayArrayArray2[var4][var11][var18];
                           FloType var43 = FloType.aClass16Array1[var23 - 1];
                           int var38 = var43.anInt166;
                           int var39;
                           int var40;
                           if (var38 >= 0) {
                              var40 = Draw3D.method512(var38);
                              var39 = -1;
                           } else if (var43.anInt165 == 16711935) {
                              var39 = -2;
                              var38 = -1;
                              var40 = Draw3D.anIntArray186[this.method30(var43.anInt172, 96)];
                           } else {
                              var39 = this.method25(var43.anInt167, var43.anInt168, var43.anInt169);
                              var40 = Draw3D.anIntArray186[this.method30(var43.anInt172, 96)];
                           }

                           var3.method195(var4, var11, var18, var35, var45, var38, var24, var25, var26, var27, method19(var32, var28), method19(var32, var29), method19(var32, var30), method19(var32, var31), this.method30(var39, var28), this.method30(var39, var29), this.method30(var39, var30), this.method30(var39, var31), var34, var40);
                        }
                     }
                  }
               }
            }
         }

         for(var12 = 1; var12 < this.anInt58 - 1; ++var12) {
            for(var13 = 1; var13 < this.anInt57 - 1; ++var13) {
               var3.method194(var4, var13, var12, this.method12(var12, var4, var13));
            }
         }
      }

      var3.method221((byte)2);

      for(var5 = 0; var5 < this.anInt57; ++var5) {
         for(var6 = 0; var6 < this.anInt58; ++var6) {
            if ((this.aByteArrayArrayArray1[1][var5][var6] & 2) == 2) {
               var3.method192(var5, var6);
            }
         }
      }

      if (var2 <= 0) {
         this.anInt59 = 313;
      }

      var6 = 1;
      int var41 = 2;
      var20 = 4;

      for(var21 = 0; var21 < 4; ++var21) {
         if (var21 > 0) {
            var6 <<= 3;
            var41 <<= 3;
            var20 <<= 3;
         }

         for(var22 = 0; var22 <= var21; ++var22) {
            for(var7 = 0; var7 <= this.anInt58; ++var7) {
               for(var8 = 0; var8 <= this.anInt57; ++var8) {
                  if ((this.anIntArrayArrayArray2[var22][var8][var7] & var6) != 0) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var22;

                     for(var12 = var22; var9 > 0 && (this.anIntArrayArrayArray2[var22][var8][var9 - 1] & var6) != 0; --var9) {
                     }

                     while(var10 < this.anInt58 && (this.anIntArrayArrayArray2[var22][var8][var10 + 1] & var6) != 0) {
                        ++var10;
                     }

                     label333:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((this.anIntArrayArrayArray2[var11 - 1][var8][var13] & var6) == 0) {
                              break label333;
                           }
                        }

                        --var11;
                     }

                     label322:
                     while(var12 < var21) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((this.anIntArrayArrayArray2[var12 + 1][var8][var13] & var6) == 0) {
                              break label322;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var12 + 1 - var11) * (var10 + 1 - var9);
                     if (var13 >= 8) {
                        var15 = this.anIntArrayArrayArray1[var12][var8][var9] - 240;
                        var16 = this.anIntArrayArrayArray1[var11][var8][var9];
                        World3D.method193(var8 * 128, var16, var8 * 128, var10 * 128 + 128, var21, var9 * 128, var15, 1);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = this.anIntArrayArrayArray2[var17][var8];
                              var10000[var18] &= ~var6;
                           }
                        }
                     }
                  }

                  if ((this.anIntArrayArrayArray2[var22][var8][var7] & var41) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var22;

                     for(var12 = var22; var9 > 0 && (this.anIntArrayArrayArray2[var22][var9 - 1][var7] & var41) != 0; --var9) {
                     }

                     while(var10 < this.anInt57 && (this.anIntArrayArrayArray2[var22][var10 + 1][var7] & var41) != 0) {
                        ++var10;
                     }

                     label386:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((this.anIntArrayArrayArray2[var11 - 1][var13][var7] & var41) == 0) {
                              break label386;
                           }
                        }

                        --var11;
                     }

                     label375:
                     while(var12 < var21) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if ((this.anIntArrayArrayArray2[var12 + 1][var13][var7] & var41) == 0) {
                              break label375;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var12 + 1 - var11) * (var10 + 1 - var9);
                     if (var13 >= 8) {
                        var15 = this.anIntArrayArrayArray1[var12][var9][var7] - 240;
                        var16 = this.anIntArrayArrayArray1[var11][var9][var7];
                        World3D.method193(var9 * 128, var16, var10 * 128 + 128, var7 * 128, var21, var7 * 128, var15, 2);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              var10000 = this.anIntArrayArrayArray2[var17][var18];
                              var10000[var7] &= ~var41;
                           }
                        }
                     }
                  }

                  if ((this.anIntArrayArrayArray2[var22][var8][var7] & var20) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && (this.anIntArrayArrayArray2[var22][var8][var11 - 1] & var20) != 0; --var11) {
                     }

                     while(var12 < this.anInt58 && (this.anIntArrayArrayArray2[var22][var8][var12 + 1] & var20) != 0) {
                        ++var12;
                     }

                     label439:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((this.anIntArrayArrayArray2[var22][var9 - 1][var13] & var20) == 0) {
                              break label439;
                           }
                        }

                        --var9;
                     }

                     label428:
                     while(var10 < this.anInt57) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if ((this.anIntArrayArrayArray2[var22][var10 + 1][var13] & var20) == 0) {
                              break label428;
                           }
                        }

                        ++var10;
                     }

                     if ((var10 + 1 - var9) * (var12 + 1 - var11) >= 4) {
                        var13 = this.anIntArrayArrayArray1[var22][var9][var11];
                        World3D.method193(var9 * 128, var13, var10 * 128 + 128, var12 * 128 + 128, var21, var11 * 128, var13, 4);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              var10000 = this.anIntArrayArrayArray2[var22][var14];
                              var10000[var15] &= ~var20;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public void method28(int var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 <= var2 + var3; ++var5) {
         for(int var6 = var1; var6 <= var1 + var4; ++var6) {
            if (var6 >= 0 && var6 < this.anInt57 && var5 >= 0 && var5 < this.anInt58) {
               this.aByteArrayArrayArray6[0][var6][var5] = 127;
               if (var6 == var1 && var6 > 0) {
                  this.anIntArrayArrayArray1[0][var6][var5] = this.anIntArrayArrayArray1[0][var6 - 1][var5];
               }

               if (var6 == var1 + var4 && var6 < this.anInt57 - 1) {
                  this.anIntArrayArrayArray1[0][var6][var5] = this.anIntArrayArrayArray1[0][var6 + 1][var5];
               }

               if (var5 == var2 && var5 > 0) {
                  this.anIntArrayArrayArray1[0][var6][var5] = this.anIntArrayArrayArray1[0][var6][var5 - 1];
               }

               if (var5 == var2 + var3 && var5 < this.anInt58 - 1) {
                  this.anIntArrayArrayArray1[0][var6][var5] = this.anIntArrayArrayArray1[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   public void method14(int var1, int var2, int var3, int var4) {
      if (var1 == this.anInt59) {
         int var5;
         for(int var6 = 0; var6 < 8; ++var6) {
            for(var5 = 0; var5 < 8; ++var5) {
               this.anIntArrayArrayArray1[var2][var4 + var6][var3 + var5] = 0;
            }
         }

         if (var4 > 0) {
            for(var5 = 1; var5 < 8; ++var5) {
               this.anIntArrayArrayArray1[var2][var4][var3 + var5] = this.anIntArrayArrayArray1[var2][var4 - 1][var3 + var5];
            }
         }

         if (var3 > 0) {
            for(var5 = 1; var5 < 8; ++var5) {
               this.anIntArrayArrayArray1[var2][var4 + var5][var3] = this.anIntArrayArrayArray1[var2][var4 + var5][var3 - 1];
            }
         }

         if (var4 > 0 && this.anIntArrayArrayArray1[var2][var4 - 1][var3] != 0) {
            this.anIntArrayArrayArray1[var2][var4][var3] = this.anIntArrayArrayArray1[var2][var4 - 1][var3];
         } else if (var3 > 0 && this.anIntArrayArrayArray1[var2][var4][var3 - 1] != 0) {
            this.anIntArrayArrayArray1[var2][var4][var3] = this.anIntArrayArrayArray1[var2][var4][var3 - 1];
         } else if (var4 > 0 && var3 > 0 && this.anIntArrayArrayArray1[var2][var4 - 1][var3 - 1] != 0) {
            this.anIntArrayArrayArray1[var2][var4][var3] = this.anIntArrayArrayArray1[var2][var4 - 1][var3 - 1];
         }
      }

   }

   public void method22(int var1, int var2, int var3, byte[] var4, int var5, Class47[] var6) {
      int var7;
      int var9;
      for(int var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(var7 = 0; var7 < 64; ++var7) {
               if (var3 + var9 > 0 && var3 + var9 < 103 && var1 + var7 > 0 && var1 + var7 < 103) {
                  int[] var10000 = var6[var8].anIntArrayArray16[var3 + var9];
                  var10000[var1 + var7] &= -16777217;
               }
            }
         }
      }

      Packet var11 = new Packet(var4);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               this.method31(var5, var2, var11, 0, var9 + var3, var7, var10 + var1);
            }
         }
      }

   }

   public void method27(int var1, Class47[] var2, int var3, World3D var4, byte[] var5) {
      Packet var6 = new Packet(var5);
      int var7 = -1;

      while(true) {
         int var8 = var6.gsmarts();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.gsmarts();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.g1();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var12 + var3;
            int var18 = var11 + var1;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if ((this.aByteArrayArrayArray1[1][var17][var18] & 2) == 2) {
                  var19 = var13 - 1;
               }

               Class47 var20 = null;
               if (var19 >= 0) {
                  var20 = var2[var19];
               }

               this.method21(var4, var20, var18, var13, var17, this.aByte4, var16, var15, var7);
            }
         }
      }
   }

   public void method16(int var1, int var2, byte[] var3, int var4, int var5, int var6, Class47[] var7, int var8, int var9) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if (var6 + var10 > 0 && var6 + var10 < 103 && var8 + var11 > 0 && var8 + var11 < 103) {
               int[] var10000 = var7[var4].anIntArrayArray16[var6 + var10];
               var10000[var8 + var11] &= -16777217;
            }
         }
      }

      Packet var14 = new Packet(var3);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var12 = 0; var12 < 64; ++var12) {
            for(int var13 = 0; var13 < 64; ++var13) {
               if (var11 == var5 && var12 >= var9 && var12 < var9 + 8 && var13 >= var2 && var13 < var2 + 8) {
                  this.method31(0, 0, var14, var1, var6 + Class35.method391((byte)7, var1, var12 & 7, var13 & 7), var4, var8 + Class35.method392(var13 & 7, var12 & 7, var1, (byte)5));
               } else {
                  this.method31(0, 0, var14, 0, -1, 0, -1);
               }
            }
         }
      }

   }

   public void method20(int var1, Class47[] var2, World3D var3, byte[] var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      Packet var11 = new Packet(var4);
      int var12 = -1;

      while(true) {
         int var13 = var11.gsmarts();
         if (var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while(true) {
            int var15 = var11.gsmarts();
            if (var15 == 0) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.g1();
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if (var18 == var10 && var17 >= var7 && var17 < var7 + 8 && var16 >= var9 && var16 < var9 + 8) {
               LocType var22 = LocType.method523(var12);
               int var23 = var8 + Class35.method393(var6, var22.anInt697, var21, var17 & 7, var22.anInt707, var16 & 7);
               int var24 = var5 + Class35.method394(var22.anInt707, var6, var17 & 7, var16 & 7, var22.anInt697, var21);
               if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                  int var25 = var1;
                  if ((this.aByteArrayArrayArray1[1][var23][var24] & 2) == 2) {
                     var25 = var1 - 1;
                  }

                  Class47 var26 = null;
                  if (var25 >= 0) {
                     var26 = var2[var25];
                  }

                  this.method21(var3, var26, var24, var1, var23, this.aByte4, var21 + var6 & 3, var20, var12);
               }
            }
         }
      }
   }

   private int method25(int var1, int var2, int var3) {
      if (var3 > 179) {
         var2 /= 2;
      }

      if (var3 > 192) {
         var2 /= 2;
      }

      if (var3 > 217) {
         var2 /= 2;
      }

      if (var3 > 243) {
         var2 /= 2;
      }

      return (var1 / 4 << 10) + (var2 / 32 << 7) + var3 / 2;
   }

   private int method30(int var1, int var2) {
      if (var1 == -2) {
         return 12345678;
      } else if (var1 == -1) {
         if (var2 < 0) {
            var2 = 0;
         } else if (var2 > 127) {
            var2 = 127;
         }

         return 127 - var2;
      } else {
         var2 = var2 * (var1 & 127) / 128;
         if (var2 < 2) {
            var2 = 2;
         } else if (var2 > 126) {
            var2 = 126;
         }

         return (var1 & 65408) + var2;
      }
   }

   public static boolean method29(int var0, int var1, byte[] var2) {
      boolean var3 = true;
      Packet var4 = new Packet(var2);
      int var5 = -1;

      label66:
      while(true) {
         int var6 = var4.gsmarts();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var12;
            LocType var15;
            do {
               int var13;
               int var14;
               do {
                  do {
                     do {
                        do {
                           int var9;
                           while(var8) {
                              var9 = var4.gsmarts();
                              if (var9 == 0) {
                                 continue label66;
                              }

                              var4.g1();
                           }

                           var9 = var4.gsmarts();
                           if (var9 == 0) {
                              continue label66;
                           }

                           var7 += var9 - 1;
                           int var10 = var7 & 63;
                           int var11 = var7 >> 6 & 63;
                           var12 = var4.g1() >> 2;
                           var13 = var11 + var0;
                           var14 = var10 + var1;
                        } while(var13 <= 0);
                     } while(var14 <= 0);
                  } while(var13 >= 103);
               } while(var14 >= 103);

               var15 = LocType.method523(var5);
            } while(var12 == 22 && aBoolean15 && !var15.aBoolean180 && !var15.aBoolean181);

            var3 &= var15.method528();
            var8 = true;
         }
      }
   }

   private static int method32(int var0, int var1) {
      int var2 = method11(var0 + 45365, var1 + 91923, 4) + (method11(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (method11(var0, var1, 1) - 128 >> 2) - 128;
      var2 = (int)((double)var2 * 0.3) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   public static boolean method18(int var0, byte var1, int var2) {
      LocType var3 = LocType.method523(var2);
      if (var1 != aByte5) {
         for(int var4 = 1; var4 > 0; ++var4) {
         }
      }

      if (var0 == 11) {
         var0 = 10;
      }

      if (var0 >= 5 && var0 <= 8) {
         var0 = 4;
      }

      return var3.method532(var0);
   }

   private static int method11(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = method26(var3, var5);
      int var8 = method26(var3 + 1, var5);
      int var9 = method26(var3, var5 + 1);
      int var10 = method26(var3 + 1, var5 + 1);
      int var11 = method24(var7, var8, var4, var2);
      int var12 = method24(var9, var10, var4, var2);
      return method24(var11, var12, var6, var2);
   }

   private static int method26(int var0, int var1) {
      int var2 = method23(var0 - 1, var1 - 1) + method23(var0 + 1, var1 - 1) + method23(var0 - 1, var1 + 1) + method23(var0 + 1, var1 + 1);
      int var3 = method23(var0 - 1, var1) + method23(var0 + 1, var1) + method23(var0, var1 - 1) + method23(var0, var1 + 1);
      int var4 = method23(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   private static int method23(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      int var3 = var2 << 13 ^ var2;
      int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   public static void method13(int var0, int var1, int var2, int var3, Class47 var4, int var5, int var6, int var7, World3D var8, int[][][] var9) {
      int var10 = var9[var1][var6][var3];
      int var11 = var9[var1][var6 + 1][var3];
      int var12 = var9[var1][var6 + 1][var3 + 1];
      int var13 = var9[var1][var6][var3 + 1];
      int var14 = var10 + var11 + var12 + var13 >> 2;
      LocType var15 = LocType.method523(var0);
      int var16 = var6 + (var3 << 7) + (var0 << 14) + 1073741824;
      if (!var15.aBoolean180) {
         var16 -= Integer.MIN_VALUE;
      }

      byte var17 = (byte)((var5 << 6) + var2);
      Object var18;
      if (var2 == 22) {
         if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
            var18 = var15.method531(22, var5, var10, var11, var12, var13, -1);
         } else {
            var18 = new LocEntity(var15.anInt709, var12, var13, var11, 22, (byte)3, var0, true, var10, var5);
         }

         var8.method196(var6, var3, var17, var16, var14, var7, (Entity)var18);
         if (var15.aBoolean192 && var15.aBoolean180) {
            var4.method483(var3, var6);
         }
      } else {
         int var19;
         int var20;
         if (var2 != 10 && var2 != 11) {
            if (var2 >= 12) {
               if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                  var18 = var15.method531(var2, var5, var10, var11, var12, var13, -1);
               } else {
                  var18 = new LocEntity(var15.anInt709, var12, var13, var11, var2, (byte)3, var0, true, var10, var5);
               }

               var8.method200(var7, 1, var3, (Entity)var18, var17, 0, var6, 1, var14, var16);
               if (var15.aBoolean192) {
                  var4.method482(var3, var5, var15.anInt697, var15.anInt707, var15.aBoolean191, var6);
               }
            } else if (var2 == 0) {
               if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                  var18 = var15.method531(0, var5, var10, var11, var12, var13, -1);
               } else {
                  var18 = new LocEntity(var15.anInt709, var12, var13, var11, 0, (byte)3, var0, true, var10, var5);
               }

               var8.method198(var14, 0, anIntArray19[var5], (Entity)null, var6, var16, var17, var3, (Entity)var18, var7);
               if (var15.aBoolean192) {
                  var4.method481(var5, var15.aBoolean191, var2, var6, var3);
               }
            } else if (var2 == 1) {
               if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                  var18 = var15.method531(1, var5, var10, var11, var12, var13, -1);
               } else {
                  var18 = new LocEntity(var15.anInt709, var12, var13, var11, 1, (byte)3, var0, true, var10, var5);
               }

               var8.method198(var14, 0, anIntArray21[var5], (Entity)null, var6, var16, var17, var3, (Entity)var18, var7);
               if (var15.aBoolean192) {
                  var4.method481(var5, var15.aBoolean191, var2, var6, var3);
               }
            } else {
               Object var23;
               if (var2 == 2) {
                  var20 = var5 + 1 & 3;
                  Object var22;
                  if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                     var22 = var15.method531(2, var5 + 4, var10, var11, var12, var13, -1);
                     var23 = var15.method531(2, var20, var10, var11, var12, var13, -1);
                  } else {
                     var22 = new LocEntity(var15.anInt709, var12, var13, var11, 2, (byte)3, var0, true, var10, var5 + 4);
                     var23 = new LocEntity(var15.anInt709, var12, var13, var11, 2, (byte)3, var0, true, var10, var20);
                  }

                  var8.method198(var14, anIntArray19[var20], anIntArray19[var5], (Entity)var23, var6, var16, var17, var3, (Entity)var22, var7);
                  if (var15.aBoolean192) {
                     var4.method481(var5, var15.aBoolean191, var2, var6, var3);
                  }
               } else if (var2 == 3) {
                  if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                     var18 = var15.method531(3, var5, var10, var11, var12, var13, -1);
                  } else {
                     var18 = new LocEntity(var15.anInt709, var12, var13, var11, 3, (byte)3, var0, true, var10, var5);
                  }

                  var8.method198(var14, 0, anIntArray21[var5], (Entity)null, var6, var16, var17, var3, (Entity)var18, var7);
                  if (var15.aBoolean192) {
                     var4.method481(var5, var15.aBoolean191, var2, var6, var3);
                  }
               } else if (var2 == 9) {
                  if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                     var18 = var15.method531(var2, var5, var10, var11, var12, var13, -1);
                  } else {
                     var18 = new LocEntity(var15.anInt709, var12, var13, var11, var2, (byte)3, var0, true, var10, var5);
                  }

                  var8.method200(var7, 1, var3, (Entity)var18, var17, 0, var6, 1, var14, var16);
                  if (var15.aBoolean192) {
                     var4.method482(var3, var5, var15.anInt697, var15.anInt707, var15.aBoolean191, var6);
                  }
               } else {
                  if (var15.aBoolean182) {
                     if (var5 == 1) {
                        var20 = var13;
                        var13 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var20;
                     } else if (var5 == 2) {
                        var20 = var13;
                        var13 = var11;
                        var11 = var20;
                        var20 = var12;
                        var12 = var10;
                        var10 = var20;
                     } else if (var5 == 3) {
                        var20 = var13;
                        var13 = var10;
                        var10 = var11;
                        var11 = var12;
                        var12 = var20;
                     }
                  }

                  if (var2 == 4) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var0, true, var10, 0);
                     }

                     var8.method199(var7, anIntArray19[var5], var5 * 512, var16, var17, var6, 0, var3, 0, var14, (Entity)var18);
                  } else if (var2 == 5) {
                     var20 = 16;
                     var19 = var8.method216(var7, var6, var3);
                     if (var19 > 0) {
                        var20 = LocType.method523(var19 >> 14 & 32767).anInt708;
                     }

                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var23 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var23 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var0, true, var10, 0);
                     }

                     var8.method199(var7, anIntArray19[var5], var5 * 512, var16, var17, var6, anIntArray13[var5] * var20, var3, anIntArray20[var5] * var20, var14, (Entity)var23);
                  } else if (var2 == 6) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var0, true, var10, 0);
                     }

                     var8.method199(var7, 256, var5, var16, var17, var6, 0, var3, 0, var14, (Entity)var18);
                  } else if (var2 == 7) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var0, true, var10, 0);
                     }

                     var8.method199(var7, 512, var5, var16, var17, var6, 0, var3, 0, var14, (Entity)var18);
                  } else if (var2 == 8) {
                     if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
                        var18 = var15.method531(4, 0, var10, var11, var12, var13, -1);
                     } else {
                        var18 = new LocEntity(var15.anInt709, var12, var13, var11, 4, (byte)3, var0, true, var10, 0);
                     }

                     var8.method199(var7, 768, var5, var16, var17, var6, 0, var3, 0, var14, (Entity)var18);
                  }
               }
            }
         } else {
            if (var15.anInt709 == -1 && var15.anIntArray192 == null) {
               var18 = var15.method531(10, var5, var10, var11, var12, var13, -1);
            } else {
               var18 = new LocEntity(var15.anInt709, var12, var13, var11, 10, (byte)3, var0, true, var10, var5);
            }

            if (var18 != null) {
               var20 = 0;
               if (var2 == 11) {
                  var20 += 256;
               }

               int var21;
               if (var5 != 1 && var5 != 3) {
                  var19 = var15.anInt707;
                  var21 = var15.anInt697;
               } else {
                  var19 = var15.anInt697;
                  var21 = var15.anInt707;
               }

               var8.method200(var7, var19, var3, (Entity)var18, var17, var20, var6, var21, var14, var16);
            }

            if (var15.aBoolean192) {
               var4.method482(var3, var5, var15.anInt697, var15.anInt707, var15.aBoolean191, var6);
            }
         }
      }

   }

   public static void method17(Class33_Sub1 var0, Packet var1) {
      int var2 = -1;

      while(true) {
         int var3 = var1.gsmarts();
         if (var3 == 0) {
            return;
         }

         var2 += var3;
         LocType var4 = LocType.method523(var2);
         var4.method525(var0);

         while(true) {
            int var5 = var1.gsmarts();
            if (var5 == 0) {
               break;
            }

            var1.g1();
         }
      }
   }

   private static int method19(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   private static int method24(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - Draw3D.anIntArray182[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var4) >> 16) + (var1 * var4 >> 16);
   }
}
