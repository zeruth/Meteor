public final class FloType {
   private static byte aByte11 = 6;
   public static FloType[] aClass16Array1;
   private static int anInt164;
   private boolean aBoolean46 = true;
   public int anInt166 = -1;
   private boolean aBoolean47 = false;
   public int anInt165;
   public boolean aBoolean48 = true;
   public int anInt167;
   private String aString6;
   public int anInt168;
   public int anInt169;
   public int anInt170;
   public int anInt171;
   public int anInt172;

   private FloType() {
   }

   private void method101(int var1) {
      if (var1 == 16711935) {
         var1 = 0;
      }

      double var2 = (double)(var1 >> 16 & 255) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var8 + var10) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      this.anInt167 = (int)(var12 * 256.0);
      this.anInt168 = (int)(var14 * 256.0);
      this.anInt169 = (int)(var16 * 256.0);
      if (this.anInt168 < 0) {
         this.anInt168 = 0;
      } else if (this.anInt168 > 255) {
         this.anInt168 = 255;
      }

      if (this.anInt169 < 0) {
         this.anInt169 = 0;
      } else if (this.anInt169 > 255) {
         this.anInt169 = 255;
      }

      if (var16 > 0.5) {
         this.anInt171 = (int)((1.0 - var16) * var14 * 512.0);
      } else {
         this.anInt171 = (int)(var16 * var14 * 512.0);
      }

      if (this.anInt171 < 1) {
         this.anInt171 = 1;
      }

      this.anInt170 = (int)(var12 * (double)this.anInt171);
      int var18 = this.anInt167 + (int)(Math.random() * 16.0) - 8;
      if (var18 < 0) {
         var18 = 0;
      } else if (var18 > 255) {
         var18 = 255;
      }

      int var19 = this.anInt168 + (int)(Math.random() * 48.0) - 24;
      if (var19 < 0) {
         var19 = 0;
      } else if (var19 > 255) {
         var19 = 255;
      }

      int var20 = this.anInt169 + (int)(Math.random() * 48.0) - 24;
      if (var20 < 0) {
         var20 = 0;
      } else if (var20 > 255) {
         var20 = 255;
      }

      this.anInt172 = this.method102(var18, var19, var20);
   }

   private int method102(int var1, int var2, int var3) {
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

   private void method100(byte var1, Packet var2) {
      int var3;
      if (var1 == 6) {
         boolean var4 = false;
      } else {
         for(var3 = 1; var3 > 0; ++var3) {
         }
      }

      while(true) {
         var3 = var2.g1();
         if (var3 == 0) {
            return;
         }

         if (var3 == 1) {
            this.anInt165 = var2.g3();
            this.method101(this.anInt165);
         } else if (var3 == 2) {
            this.anInt166 = var2.g1();
         } else if (var3 == 3) {
            this.aBoolean47 = true;
         } else if (var3 == 5) {
            this.aBoolean48 = false;
         } else if (var3 == 6) {
            this.aString6 = var2.gjstr();
         } else if (var3 == 7) {
            int var9 = this.anInt167;
            int var5 = this.anInt168;
            int var6 = this.anInt169;
            int var7 = this.anInt170;
            int var8 = var2.g3();
            this.method101(var8);
            this.anInt167 = var9;
            this.anInt168 = var5;
            this.anInt169 = var6;
            this.anInt170 = var7;
            this.anInt171 = var7;
         } else {
            System.out.println("Error unrecognised config code: " + var3);
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("flo.dat", (byte[])null));
      anInt164 = var1.g2();
      if (aClass16Array1 == null) {
         aClass16Array1 = new FloType[anInt164];
      }

      for(int var2 = 0; var2 < anInt164; ++var2) {
         if (aClass16Array1[var2] == null) {
            aClass16Array1[var2] = new FloType();
         }

         aClass16Array1[var2].method100(aByte11, var1);
      }

   }
}
