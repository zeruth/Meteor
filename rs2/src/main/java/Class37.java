public final class Class37 {
   private static float[][] aFloatArrayArray1 = new float[2][8];
   public static int[][] anIntArrayArray14 = new int[2][8];
   private static float aFloat1;
   public static int anInt563;
   private int[][][] anIntArrayArrayArray5 = new int[2][2][4];
   private int[][][] anIntArrayArrayArray6 = new int[2][2][4];
   private boolean aBoolean139 = true;
   private int[] anIntArray164 = new int[2];
   public int[] anIntArray163 = new int[2];

   private float method396(float var1) {
      float var2 = (float)Math.pow(2.0, (double)var1) * 32.703197F;
      return var2 * 3.1415927F / 11025.0F;
   }

   private float method395(int var1, int var2, float var3, int var4) {
      float var5 = (float)this.anIntArrayArrayArray6[var1][0][var4] + var3 * (float)(this.anIntArrayArrayArray6[var1][1][var4] - this.anIntArrayArrayArray6[var1][0][var4]);
      float var6 = var5 * 0.0015258789F;
      boolean var7 = false;
      return 1.0F - (float)Math.pow(10.0, (double)(-var6 / 20.0F));
   }

   private float method397(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray5[var2][0][var1] + var3 * (float)(this.anIntArrayArrayArray5[var2][1][var1] - this.anIntArrayArrayArray5[var2][0][var1]);
      float var5 = var4 * 1.2207031E-4F;
      return this.method396(var5);
   }

   public int method398(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.anIntArray164[0] + (float)(this.anIntArray164[1] - this.anIntArray164[0]) * var2;
         float var4 = var3 * 0.0030517578F;
         aFloat1 = (float)Math.pow(0.1, (double)(var4 / 20.0F));
         anInt563 = (int)(aFloat1 * 65536.0F);
      }

      if (this.anIntArray163[var1] == 0) {
         return 0;
      } else {
         var3 = this.method395(var1, 849, var2, 0);
         aFloatArrayArray1[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method397(0, var1, var2));
         aFloatArrayArray1[var1][1] = var3 * var3;

         float[] var10000;
         int var8;
         for(var8 = 1; var8 < this.anIntArray163[var1]; ++var8) {
            var3 = this.method395(var1, 849, var2, var8);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method397(var8, var1, var2));
            float var6 = var3 * var3;
            aFloatArrayArray1[var1][var8 * 2 + 1] = aFloatArrayArray1[var1][var8 * 2 - 1] * var6;
            aFloatArrayArray1[var1][var8 * 2] = aFloatArrayArray1[var1][var8 * 2 - 1] * var5 + aFloatArrayArray1[var1][var8 * 2 - 2] * var6;

            for(int var7 = var8 * 2 - 1; var7 >= 2; --var7) {
               var10000 = aFloatArrayArray1[var1];
               var10000[var7] += aFloatArrayArray1[var1][var7 - 1] * var5 + aFloatArrayArray1[var1][var7 - 2] * var6;
            }

            var10000 = aFloatArrayArray1[var1];
            var10000[1] += aFloatArrayArray1[var1][0] * var5 + var6;
            var10000 = aFloatArrayArray1[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var8 = 0; var8 < this.anIntArray163[0] * 2; ++var8) {
               var10000 = aFloatArrayArray1[0];
               var10000[var8] *= aFloat1;
            }
         }

         for(var8 = 0; var8 < this.anIntArray163[var1] * 2; ++var8) {
            anIntArrayArray14[var1][var8] = (int)(aFloatArrayArray1[var1][var8] * 65536.0F);
         }

         return this.anIntArray163[var1] * 2;
      }
   }

   public void method399(Class30 var1, Packet var2) {
      int var3 = var2.g1();
      this.anIntArray163[0] = var3 >> 4;
      this.anIntArray163[1] = var3 & 15;
      if (var3 == 0) {
         this.anIntArray164[0] = this.anIntArray164[1] = 0;
      } else {
         this.anIntArray164[0] = var2.g2();
         this.anIntArray164[1] = var2.g2();
         int var4 = var2.g1();

         int var5;
         int var6;
         for(var6 = 0; var6 < 2; ++var6) {
            for(var5 = 0; var5 < this.anIntArray163[var6]; ++var5) {
               this.anIntArrayArrayArray5[var6][0][var5] = var2.g2();
               this.anIntArrayArrayArray6[var6][0][var5] = var2.g2();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.anIntArray163[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) == 0) {
                  this.anIntArrayArrayArray5[var5][1][var6] = this.anIntArrayArrayArray5[var5][0][var6];
                  this.anIntArrayArrayArray6[var5][1][var6] = this.anIntArrayArrayArray6[var5][0][var6];
               } else {
                  this.anIntArrayArrayArray5[var5][1][var6] = var2.g2();
                  this.anIntArrayArrayArray6[var5][1][var6] = var2.g2();
               }
            }
         }

         if (var4 != 0 || this.anIntArray164[1] != this.anIntArray164[0]) {
            var1.method360(var2);
         }
      }

   }
}
