public final class Class22 {
   private static int anInt237 = 217;
   private static Class22[] aClass22Array1;
   private static boolean aBoolean75;
   private static boolean[] aBooleanArray3;
   public Class42 aClass42_1;
   public int anInt238;
   public int anInt239;
   public int[] anIntArray81;
   public int[] anIntArray82;
   public int[] anIntArray83;
   public int[] anIntArray84;

   private Class22() {
   }

   public static Class22 method168(int var0) {
      return aClass22Array1 == null ? null : aClass22Array1[var0];
   }

   public static boolean method169(boolean var0, int var1) {
      if (!var0) {
         aBoolean75 = !aBoolean75;
      }

      return var1 == -1;
   }

   public static void method166(byte[] var0) {
      Packet var1 = new Packet(var0);
      var1.pos = var0.length - 8;
      int var2 = var1.g2();
      int var3 = var1.g2();
      int var4 = var1.g2();
      int var5 = var1.g2();
      Packet var6 = new Packet(var0);
      var6.pos = 0;
      int var7 = var2 + 0 + 2;
      Packet var8 = new Packet(var0);
      var8.pos = var7;
      int var9 = var7 + var3;
      Packet var10 = new Packet(var0);
      var10.pos = var9;
      int var11 = var9 + var4;
      Packet var12 = new Packet(var0);
      var12.pos = var11;
      int var13 = var11 + var5;
      Packet var14 = new Packet(var0);
      var14.pos = var13;
      Class42 var15 = new Class42(var14, 0);
      int var16 = var6.g2();
      int[] var17 = new int[500];
      int[] var18 = new int[500];
      int[] var19 = new int[500];
      int[] var20 = new int[500];

      for(int var21 = 0; var21 < var16; ++var21) {
         int var22 = var6.g2();
         Class22 var23 = aClass22Array1[var22] = new Class22();
         var23.anInt238 = var12.g1();
         var23.aClass42_1 = var15;
         int var24 = var6.g1();
         int var25 = -1;
         int var26 = 0;

         int var27;
         for(int var28 = 0; var28 < var24; ++var28) {
            var27 = var8.g1();
            if (var27 > 0) {
               if (var15.anIntArray172[var28] != 0) {
                  for(int var29 = var28 - 1; var29 > var25; --var29) {
                     if (var15.anIntArray172[var29] == 0) {
                        var17[var26] = var29;
                        var18[var26] = 0;
                        var19[var26] = 0;
                        var20[var26] = 0;
                        ++var26;
                        break;
                     }
                  }
               }

               var17[var26] = var28;
               short var30 = 0;
               if (var15.anIntArray172[var28] == 3) {
                  var30 = 128;
               }

               if ((var27 & 1) == 0) {
                  var18[var26] = var30;
               } else {
                  var18[var26] = var10.gsmart();
               }

               if ((var27 & 2) == 0) {
                  var19[var26] = var30;
               } else {
                  var19[var26] = var10.gsmart();
               }

               if ((var27 & 4) == 0) {
                  var20[var26] = var30;
               } else {
                  var20[var26] = var10.gsmart();
               }

               var25 = var28;
               ++var26;
               if (var15.anIntArray172[var28] == 5) {
                  aBooleanArray3[var22] = false;
               }
            }
         }

         var23.anInt239 = var26;
         var23.anIntArray81 = new int[var26];
         var23.anIntArray82 = new int[var26];
         var23.anIntArray83 = new int[var26];
         var23.anIntArray84 = new int[var26];

         for(var27 = 0; var27 < var26; ++var27) {
            var23.anIntArray81[var27] = var17[var27];
            var23.anIntArray82[var27] = var18[var27];
            var23.anIntArray83[var27] = var19[var27];
            var23.anIntArray84[var27] = var20[var27];
         }
      }

   }

   public static void method165(int var0) {
      aClass22Array1 = new Class22[var0 + 1];
      aBooleanArray3 = new boolean[var0 + 1];

      for(int var1 = 0; var1 < var0 + 1; ++var1) {
         aBooleanArray3[var1] = true;
      }

   }

   public static void method167() {
      aClass22Array1 = null;
   }
}
