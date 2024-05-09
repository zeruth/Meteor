public final class Class39 {
   private static byte aByte33 = 6;
   private static boolean aBoolean146 = true;
   private static Packet aClass10_Sub1_Sub3_4;
   private static Class39[] aClass39Array1 = new Class39[5000];
   public static int[] anIntArray171 = new int[5000];
   private static byte[] aByteArray15;
   private int anInt585 = -573;
   private int anInt587;
   private Class12[] aClass12Array1 = new Class12[10];
   private int anInt588;
   private int anInt586 = -252;

   private Class39(int var1) {
   }

   private int method413(int var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if (this.aClass12Array1[var3] != null && this.aClass12Array1[var3].anInt72 + this.aClass12Array1[var3].anInt73 > var2) {
            var2 = this.aClass12Array1[var3].anInt72 + this.aClass12Array1[var3].anInt73;
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         var3 = var2 * 22050 / 1000;
         int var4 = this.anInt587 * 22050 / 1000;
         int var5 = this.anInt588 * 22050 / 1000;
         if (var4 < 0 || var4 > var3 || var5 < 0 || var5 > var3 || var4 >= var5) {
            var1 = 0;
         }

         int var6 = var3 + (var5 - var4) * (var1 - 1);

         int var7;
         for(var7 = 44; var7 < var6 + 44; ++var7) {
            aByteArray15[var7] = -128;
         }

         int var8;
         int var9;
         int var10;
         for(var10 = 0; var10 < 10; ++var10) {
            if (this.aClass12Array1[var10] != null) {
               var7 = this.aClass12Array1[var10].anInt72 * 22050 / 1000;
               var8 = this.aClass12Array1[var10].anInt73 * 22050 / 1000;
               int[] var11 = this.aClass12Array1[var10].method42(var7, this.aClass12Array1[var10].anInt72);

               for(var9 = 0; var9 < var7; ++var9) {
                  int var12 = (aByteArray15[var9 + var8 + 44] & 255) + (var11[var9] >> 8);
                  if ((var12 & -256) != 0) {
                     var12 = ~(var12 >> 31);
                  }

                  aByteArray15[var9 + var8 + 44] = (byte)var12;
               }
            }
         }

         if (var1 > 1) {
            var4 += 44;
            var5 += 44;
            var3 += 44;
            var6 += 44;
            var7 = var6 - var3;

            for(var8 = var3 - 1; var8 >= var5; --var8) {
               aByteArray15[var8 + var7] = aByteArray15[var8];
            }

            for(var10 = 1; var10 < var1; ++var10) {
               var7 = (var5 - var4) * var10;

               for(var9 = var4; var9 < var5; ++var9) {
                  aByteArray15[var9 + var7] = aByteArray15[var9];
               }
            }

            var6 -= 44;
         }

         return var6;
      }
   }

   private Packet method412(int var1) {
      int var2 = this.method413(var1);
      aClass10_Sub1_Sub3_4.pos = 0;
      aClass10_Sub1_Sub3_4.p4(1380533830);
      aClass10_Sub1_Sub3_4.ip4(var2 + 36);
      aClass10_Sub1_Sub3_4.p4(1463899717);
      aClass10_Sub1_Sub3_4.p4(1718449184);
      aClass10_Sub1_Sub3_4.ip4(16);
      aClass10_Sub1_Sub3_4.method303(1);
      aClass10_Sub1_Sub3_4.method303(1);
      aClass10_Sub1_Sub3_4.ip4(22050);
      aClass10_Sub1_Sub3_4.ip4(22050);
      aClass10_Sub1_Sub3_4.method303(1);
      aClass10_Sub1_Sub3_4.method303(8);
      aClass10_Sub1_Sub3_4.p4(1684108385);
      aClass10_Sub1_Sub3_4.ip4(var2);
      Packet var10000 = aClass10_Sub1_Sub3_4;
      var10000.pos += var2;
      return aClass10_Sub1_Sub3_4;
   }

   private void method410(byte var1, Packet var2) {
      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var2.g1();
         if (var4 != 0) {
            --var2.pos;
            this.aClass12Array1[var3] = new Class12();
            this.aClass12Array1[var3].method44(aByte33, var2);
         }
      }

      this.anInt587 = var2.g2();
      this.anInt588 = var2.g2();
      if (var1 == 6) {
         boolean var5 = false;
      } else {
         this.anInt586 = 64;
      }

   }

   private int method411() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.aClass12Array1[var2] != null && this.aClass12Array1[var2].anInt73 / 20 < var1) {
            var1 = this.aClass12Array1[var2].anInt73 / 20;
         }
      }

      if (this.anInt587 < this.anInt588 && this.anInt587 / 20 < var1) {
         var1 = this.anInt587 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.aClass12Array1[var2] != null) {
               Class12 var10000 = this.aClass12Array1[var2];
               var10000.anInt73 -= var1 * 20;
            }
         }

         if (this.anInt587 < this.anInt588) {
            this.anInt587 -= var1 * 20;
            this.anInt588 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static Packet method409(int var0, int var1) {
      if (aClass39Array1[var1] == null) {
         return null;
      } else {
         Class39 var2 = aClass39Array1[var1];
         return var2.method412(var0);
      }
   }

   public static void method408(Packet var0) {
      aByteArray15 = new byte[441000];
      aClass10_Sub1_Sub3_4 = new Packet(aByteArray15);
      Class12.method41();

      while(true) {
         int var1 = var0.g2();
         if (var1 == 65535) {
            return;
         }

         aClass39Array1[var1] = new Class39(-524);
         aClass39Array1[var1].method410(aByte33, var0);
         anIntArray171[var1] = aClass39Array1[var1].method411();
      }
   }
}
