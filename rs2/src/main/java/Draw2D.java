public class Draw2D extends Hashable {
   private static boolean aBoolean173 = true;
   public static int top;
   public static int left;
   public static int[] data;
   public static int width2d;
   public static int height2d;
   private static int anInt673 = -291;
   public static int right;
   public static int bottom;
   public static int centerX2d;
   public static int boundX;
   public static int anInt682;

   protected Draw2D() {
   }

   public static void drawHorizontalLine(int var0, int var1, int var2, int var3) {
      if (var2 >= top && var2 < bottom) {
         if (var0 < left) {
            var3 -= left - var0;
            var0 = left;
         }

         if (var0 + var3 > right) {
            var3 = right - var0;
         }

         int var4 = var0 + var2 * width2d;

         for(int var5 = 0; var5 < var3; ++var5) {
            data[var4 + var5] = var1;
         }
      }

   }

   public static void bind(int var0, int var1, int[] var2) {
      data = var2;
      width2d = var0;
      height2d = var1;
      setBounds(0, 0, var1, var0);
   }

   public static void fillRect(int var0, int var1, int var2, int var3, int var4) {
      if (var4 < left) {
         var3 -= left - var4;
         var4 = left;
      }

      if (var1 < top) {
         var0 -= top - var1;
         var1 = top;
      }

      if (var4 + var3 > right) {
         var3 = right - var4;
      }

      if (var1 + var0 > bottom) {
         var0 = bottom - var1;
      }

      int var5 = width2d - var3;
      int var6 = var4 + var1 * width2d;

      for(int var7 = -var0; var7 < 0; ++var7) {
         for(int var8 = -var3; var8 < 0; ++var8) {
            data[var6++] = var2;
         }

         var6 += var5;
      }

   }

   public static void drawVerticalLine(int var0, int var1, int var2, int var3) {
      if (var0 >= left && var0 < right) {
         if (var3 < top) {
            var2 -= top - var3;
            var3 = top;
         }

         if (var3 + var2 > bottom) {
            var2 = bottom - var3;
         }

         int var4 = var0 + var3 * width2d;

         for(int var5 = 0; var5 < var2; ++var5) {
            data[var4 + var5 * width2d] = var1;
         }
      }

   }

   public static void setBounds(int var0, int var1, int var2, int var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var0 < 0) {
         var0 = 0;
      }

      if (var3 > width2d) {
         var3 = width2d;
      }

      if (var2 > height2d) {
         var2 = height2d;
      }

      left = var1;
      top = var0;
      right = var3;
      bottom = var2;
      boundX = right - 1;
      centerX2d = right / 2;
      anInt682 = bottom / 2;
   }

   public static void drawRect(int var0, int var1, int var2, int var3, int var4) {
      drawHorizontalLine(var3, var2, var0, var4);
      drawHorizontalLine(var3, var2, var0 + var1 - 1, var4);
      drawVerticalLine(var3, var2, var1, var0);
      drawVerticalLine(var3 + var4 - 1, var2, var1, var0);
   }

   public static void clear() {
      int var0 = width2d * height2d;

      for(int var1 = 0; var1 < var0; ++var1) {
         data[var1] = 0;
      }

   }

   public static void resetBounds() {
      left = 0;
      top = 0;
      right = width2d;
      bottom = height2d;
      boundX = right - 1;
      centerX2d = right / 2;
   }

   public static void fillRectAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var5 < left) {
         var2 -= left - var5;
         var5 = left;
      }

      if (var1 < top) {
         var3 -= top - var1;
         var1 = top;
      }

      if (var5 + var2 > right) {
         var2 = right - var5;
      }

      if (var1 + var3 > bottom) {
         var3 = bottom - var1;
      }

      int var6 = 256 - var4;
      int var7 = (var0 >> 16 & 255) * var4;
      int var8 = (var0 >> 8 & 255) * var4;
      int var9 = (var0 & 255) * var4;
      int var10 = width2d - var2;
      int var11 = var5 + var1 * width2d;

      for(int var12 = 0; var12 < var3; ++var12) {
         for(int var13 = -var2; var13 < 0; ++var13) {
            int var14 = (data[var11] >> 16 & 255) * var6;
            int var15 = (data[var11] >> 8 & 255) * var6;
            int var16 = (data[var11] & 255) * var6;
            int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
            data[var11++] = var17;
         }

         var11 += var10;
      }

   }

   public static void method501(int var0, int var1, int var2, int var3, int var4, int var5) {
      method503(var4, var0, var1, var5, var2);
      method503(var4 + var3 - 1, var0, var1, var5, var2);
      if (var3 >= 3) {
         method505(var4 + 1, var0, var2, var3 - 2, var5);
         method505(var4 + 1, var0 + var1 - 1, var2, var3 - 2, var5);
      }

   }

   private static void method503(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= top && var0 < bottom) {
         if (var1 < left) {
            var2 -= left - var1;
            var1 = left;
         }

         if (var1 + var2 > right) {
            var2 = right - var1;
         }

         int var5 = 256 - var3;
         int var6 = (var4 >> 16 & 255) * var3;
         int var7 = (var4 >> 8 & 255) * var3;
         int var8 = (var4 & 255) * var3;
         int var9 = var1 + var0 * width2d;

         for(int var10 = 0; var10 < var2; ++var10) {
            int var11 = (data[var9] >> 16 & 255) * var5;
            int var12 = (data[var9] >> 8 & 255) * var5;
            int var13 = (data[var9] & 255) * var5;
            int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
            data[var9++] = var14;
         }
      }

   }

   private static void method505(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= left && var1 < right) {
         if (var0 < top) {
            var3 -= top - var0;
            var0 = top;
         }

         if (var0 + var3 > bottom) {
            var3 = bottom - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var2 >> 16 & 255) * var4;
         int var7 = (var2 >> 8 & 255) * var4;
         int var8 = (var2 & 255) * var4;
         int var9 = var1 + var0 * width2d;

         for(int var10 = 0; var10 < var3; ++var10) {
            int var11 = (data[var9] >> 16 & 255) * var5;
            int var12 = (data[var9] >> 8 & 255) * var5;
            int var13 = (data[var9] & 255) * var5;
            int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
            data[var9] = var14;
            var9 += width2d;
         }
      }

   }
}
