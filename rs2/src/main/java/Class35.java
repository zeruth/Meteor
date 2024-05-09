public final class Class35 {
   private static boolean aBoolean138 = true;

   public static int method391(byte var0, int var1, int var2, int var3) {
      boolean var4 = false;
      int var5 = var1 & 3;
      if (var5 == 0) {
         return var2;
      } else if (var5 == 1) {
         return var3;
      } else {
         return var5 == 2 ? 7 - var2 : 7 - var3;
      }
   }

   public static int method392(int var0, int var1, int var2, byte var3) {
      boolean var4 = false;
      int var5 = var2 & 3;
      if (var5 == 0) {
         return var0;
      } else if (var5 == 1) {
         return 7 - var1;
      } else {
         return var5 == 2 ? 7 - var0 : var1;
      }
   }

   public static int method393(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if ((var2 & 1) == 1) {
         var6 = var4;
         var4 = var1;
         var1 = var6;
      }

      var6 = var0 & 3;
      if (var6 == 0) {
         return var3;
      } else if (var6 == 1) {
         return var5;
      } else {
         return var6 == 2 ? 8 - var3 - var4 : 8 - var5 - var1;
      }
   }

   public static int method394(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if ((var5 & 1) == 1) {
         var6 = var0;
         var0 = var4;
         var4 = var6;
      }

      var6 = var1 & 3;
      if (var6 == 0) {
         return var3;
      } else if (var6 == 1) {
         return 8 - var2 - var0;
      } else {
         return var6 == 2 ? 8 - var3 - var4 : var2;
      }
   }
}
