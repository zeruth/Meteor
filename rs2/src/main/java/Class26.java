public final class Class26 {
   private static int anInt326 = 236;
   private static int anInt327 = -20714;
   private static int anInt328 = 3;
   private static int anInt329 = -68;
   private static final char[] aCharArray1 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

   public static String method249(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return "invalid_name";
         } else {
            int var2 = 0;

            char[] var3;
            long var4;
            for(var3 = new char[12]; var0 != 0L; var3[11 - var2++] = aCharArray1[(int)(var4 - var0 * 37L)]) {
               var4 = var0;
               var0 /= 37L;
            }

            return new String(var3, 12 - var2, var2);
         }
      } else {
         return "invalid_name";
      }
   }

   public static String method252(String var0, byte var1) {
      boolean var2 = false;
      if (var0.length() <= 0) {
         return var0;
      } else {
         char[] var3 = var0.toCharArray();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var3[var4] == '_') {
               var3[var4] = ' ';
               if (var4 + 1 < var3.length && var3[var4 + 1] >= 'a' && var3[var4 + 1] <= 'z') {
                  var3[var4 + 1] = (char)(var3[var4 + 1] + 'A' - 97);
               }
            }
         }

         if (var3[0] >= 'a' && var3[0] <= 'z') {
            var3[0] = (char)(var3[0] + 'A' - 97);
         }

         return new String(var3);
      }
   }

   public static long method248(String var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length() && var3 < 12; ++var3) {
         char var4 = var0.charAt(var3);
         var1 *= 37L;
         if (var4 >= 'A' && var4 <= 'Z') {
            var1 += (long)(var4 + 1 - 65);
         } else if (var4 >= 'a' && var4 <= 'z') {
            var1 += (long)(var4 + 1 - 97);
         } else if (var4 >= '0' && var4 <= '9') {
            var1 += (long)(var4 + 27 - 48);
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   public static String method253(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.append("*");
      }

      return var1.toString();
   }

   public static String method251(int var0) {
      return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
   }

   public static long method250(int var0, String var1) {
      String var2 = var1.toUpperCase();
      long var3 = 0L;
      boolean var5 = false;

      for(int var6 = 0; var6 < var2.length(); ++var6) {
         var3 = var3 * 61L + (long)var2.charAt(var6) - 32L;
         var3 = var3 + (var3 >> 56) & 72057594037927935L;
      }

      return var3;
   }
}
