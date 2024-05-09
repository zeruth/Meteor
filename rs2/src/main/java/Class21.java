public final class Class21 {
   public static int[] anIntArray73 = new int[6];
   public static int[] anIntArray74 = new int[6];
   public static int[] anIntArray75 = new int[6];
   public static int[] anIntArray76 = new int[6];
   public static int[] anIntArray77 = new int[6];
   private static int[] anIntArray78 = new int[]{1, 0};
   private static int[] anIntArray79 = new int[]{2, 1};
   private static int[] anIntArray80 = new int[]{3, 3};
   private static final int[][] anIntArrayArray6 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
   private static final int[][] anIntArrayArray7 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
   public int[] anIntArray63;
   public boolean aBoolean74 = true;
   public int[] anIntArray69;
   public int anInt233;
   public int[] anIntArray64;
   public int anInt234;
   public int[] anIntArray70;
   public int anInt235;
   public int[] anIntArray71;
   public int[] anIntArray65;
   public int anInt236;
   private int anInt232;
   public int[] anIntArray72;
   public int[] anIntArray66;
   public int[] anIntArray67;
   public int[] anIntArray68;

   public Class21(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      if (var4 != var14 || var4 != var3 || var4 != var1) {
         this.aBoolean74 = false;
      }

      this.anInt233 = var13;
      this.anInt234 = var20;
      this.anInt235 = var17;
      this.anInt236 = var8;
      short var21 = 128;
      int var22 = var21 / 2;
      int var23 = var21 / 4;
      int var24 = var21 * 3 / 4;
      if (var11 >= this.anInt232 && var11 <= this.anInt232) {
         int[] var25 = anIntArrayArray6[var13];
         int var26 = var25.length;
         this.anIntArray63 = new int[var26];
         this.anIntArray64 = new int[var26];
         this.anIntArray65 = new int[var26];
         int[] var27 = new int[var26];
         int[] var28 = new int[var26];
         int var29 = var5 * var21;
         int var30 = var19 * var21;

         int var31;
         int var32;
         int var33;
         int var34;
         int var35;
         int var37;
         for(int var36 = 0; var36 < var26; ++var36) {
            var37 = var25[var36];
            if ((var37 & 1) == 0 && var37 <= 8) {
               var37 = (var37 - var20 - var20 - 1 & 7) + 1;
            }

            if (var37 > 8 && var37 <= 12) {
               var37 = (var37 - var20 - 9 & 3) + 9;
            }

            if (var37 > 12 && var37 <= 16) {
               var37 = (var37 - var20 - 13 & 3) + 13;
            }

            if (var37 == 1) {
               var31 = var29;
               var32 = var30;
               var33 = var4;
               var34 = var12;
               var35 = var2;
            } else if (var37 == 2) {
               var31 = var29 + var22;
               var32 = var30;
               var33 = var4 + var14 >> 1;
               var34 = var12 + var9 >> 1;
               var35 = var2 + var18 >> 1;
            } else if (var37 == 3) {
               var31 = var29 + var21;
               var32 = var30;
               var33 = var14;
               var34 = var9;
               var35 = var18;
            } else if (var37 == 4) {
               var31 = var29 + var21;
               var32 = var30 + var22;
               var33 = var14 + var3 >> 1;
               var34 = var9 + var6 >> 1;
               var35 = var18 + var10 >> 1;
            } else if (var37 == 5) {
               var31 = var29 + var21;
               var32 = var30 + var21;
               var33 = var3;
               var34 = var6;
               var35 = var10;
            } else if (var37 == 6) {
               var31 = var29 + var22;
               var32 = var30 + var21;
               var33 = var3 + var1 >> 1;
               var34 = var6 + var7 >> 1;
               var35 = var10 + var15 >> 1;
            } else if (var37 == 7) {
               var31 = var29;
               var32 = var30 + var21;
               var33 = var1;
               var34 = var7;
               var35 = var15;
            } else if (var37 == 8) {
               var31 = var29;
               var32 = var30 + var22;
               var33 = var1 + var4 >> 1;
               var34 = var7 + var12 >> 1;
               var35 = var15 + var2 >> 1;
            } else if (var37 == 9) {
               var31 = var29 + var22;
               var32 = var30 + var23;
               var33 = var4 + var14 >> 1;
               var34 = var12 + var9 >> 1;
               var35 = var2 + var18 >> 1;
            } else if (var37 == 10) {
               var31 = var29 + var24;
               var32 = var30 + var22;
               var33 = var14 + var3 >> 1;
               var34 = var9 + var6 >> 1;
               var35 = var18 + var10 >> 1;
            } else if (var37 == 11) {
               var31 = var29 + var22;
               var32 = var30 + var24;
               var33 = var3 + var1 >> 1;
               var34 = var6 + var7 >> 1;
               var35 = var10 + var15 >> 1;
            } else if (var37 == 12) {
               var31 = var29 + var23;
               var32 = var30 + var22;
               var33 = var1 + var4 >> 1;
               var34 = var7 + var12 >> 1;
               var35 = var15 + var2 >> 1;
            } else if (var37 == 13) {
               var31 = var29 + var23;
               var32 = var30 + var23;
               var33 = var4;
               var34 = var12;
               var35 = var2;
            } else if (var37 == 14) {
               var31 = var29 + var24;
               var32 = var30 + var23;
               var33 = var14;
               var34 = var9;
               var35 = var18;
            } else if (var37 == 15) {
               var31 = var29 + var24;
               var32 = var30 + var24;
               var33 = var3;
               var34 = var6;
               var35 = var10;
            } else {
               var31 = var29 + var23;
               var32 = var30 + var24;
               var33 = var1;
               var34 = var7;
               var35 = var15;
            }

            this.anIntArray63[var36] = var31;
            this.anIntArray64[var36] = var33;
            this.anIntArray65[var36] = var32;
            var27[var36] = var34;
            var28[var36] = var35;
         }

         int[] var39 = anIntArrayArray7[var13];
         var31 = var39.length / 4;
         this.anIntArray69 = new int[var31];
         this.anIntArray70 = new int[var31];
         this.anIntArray71 = new int[var31];
         this.anIntArray66 = new int[var31];
         this.anIntArray67 = new int[var31];
         this.anIntArray68 = new int[var31];
         if (var16 != -1) {
            this.anIntArray72 = new int[var31];
         }

         var32 = 0;

         for(var33 = 0; var33 < var31; ++var33) {
            var34 = var39[var32];
            var35 = var39[var32 + 1];
            var37 = var39[var32 + 2];
            int var38 = var39[var32 + 3];
            var32 += 4;
            if (var35 < 4) {
               var35 = var35 - var20 & 3;
            }

            if (var37 < 4) {
               var37 = var37 - var20 & 3;
            }

            if (var38 < 4) {
               var38 = var38 - var20 & 3;
            }

            this.anIntArray69[var33] = var35;
            this.anIntArray70[var33] = var37;
            this.anIntArray71[var33] = var38;
            if (var34 == 0) {
               this.anIntArray66[var33] = var27[var35];
               this.anIntArray67[var33] = var27[var37];
               this.anIntArray68[var33] = var27[var38];
               if (this.anIntArray72 != null) {
                  this.anIntArray72[var33] = -1;
               }
            } else {
               this.anIntArray66[var33] = var28[var35];
               this.anIntArray67[var33] = var28[var37];
               this.anIntArray68[var33] = var28[var38];
               if (this.anIntArray72 != null) {
                  this.anIntArray72[var33] = var16;
               }
            }
         }

         var34 = var4;
         var35 = var14;
         if (var14 < var4) {
            var34 = var14;
         }

         if (var14 > var14) {
            var35 = var14;
         }

         if (var3 < var34) {
            var34 = var3;
         }

         if (var3 > var14) {
            var35 = var3;
         }

         if (var1 < var34) {
         }

         if (var1 > var35) {
         }

      } else {
         throw new NullPointerException();
      }
   }
}
