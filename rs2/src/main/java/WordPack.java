public final class WordPack {
   private static int anInt484 = 20411;
   private static char[] aCharArray3 = new char[100];
   private static Packet aClass10_Sub1_Sub3_2 = new Packet(new byte[100]);
   private static char[] aCharArray4 = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']'};

   public static void pack(String var0, Packet var1) {
      if (var0.length() > 80) {
         var0 = var0.substring(0, 80);
      }

      var0 = var0.toLowerCase();
      int var2 = -1;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         char var4 = var0.charAt(var3);
         int var5 = 0;

         for(int var6 = 0; var6 < aCharArray4.length; ++var6) {
            if (var4 == aCharArray4[var6]) {
               var5 = var6;
               break;
            }
         }

         if (var5 > 12) {
            var5 += 195;
         }

         if (var2 == -1) {
            if (var5 < 13) {
               var2 = var5;
            } else {
               var1.p1(var5);
            }
         } else if (var5 < 13) {
            var1.p1((var2 << 4) + var5);
            var2 = -1;
         } else {
            var1.p1((var2 << 4) + (var5 >> 4));
            var2 = var5 & 15;
         }
      }

      if (var2 != -1) {
         var1.p1(var2 << 4);
      }

   }

   public static String method373(String var0) {
      aClass10_Sub1_Sub3_2.pos = 0;
      pack(var0, aClass10_Sub1_Sub3_2);
      int var1 = aClass10_Sub1_Sub3_2.pos;
      aClass10_Sub1_Sub3_2.pos = 0;
      return unpack(aClass10_Sub1_Sub3_2, var1);
   }

   public static String unpack(Packet var0, int var1) {
      int var2 = 0;
      int var3 = -1;

      int var4;
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = var0.g1();
         var4 = var6 >> 4 & 15;
         if (var3 != -1) {
            aCharArray3[var2++] = aCharArray4[(var3 << 4) + var4 - 195];
            var3 = -1;
         } else if (var4 < 13) {
            aCharArray3[var2++] = aCharArray4[var4];
         } else {
            var3 = var4;
         }

         var4 = var6 & 15;
         if (var3 != -1) {
            aCharArray3[var2++] = aCharArray4[(var3 << 4) + var4 - 195];
            var3 = -1;
         } else if (var4 < 13) {
            aCharArray3[var2++] = aCharArray4[var4];
         } else {
            var3 = var4;
         }
      }

      boolean var7 = true;

      for(var4 = 0; var4 < var2; ++var4) {
         char var8 = aCharArray3[var4];
         if (var7 && var8 >= 'a' && var8 <= 'z') {
            aCharArray3[var4] = (char)(aCharArray3[var4] - ' ');
            var7 = false;
         }

         if (var8 == '.' || var8 == '!' || var8 == '?') {
            var7 = true;
         }
      }

      return new String(aCharArray3, 0, var2);
   }
}
