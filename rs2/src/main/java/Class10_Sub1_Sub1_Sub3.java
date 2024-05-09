public final class Class10_Sub1_Sub1_Sub3 extends Draw2D {
   public int anInt656;
   public int anInt654;
   public int anInt652;
   public int[] anIntArray175;
   public int anInt653;
   private int anInt648 = 3;
   private int anInt650 = -235;
   public int anInt655;
   private boolean aBoolean161 = true;
   private int anInt657;
   public byte[] aByteArray16;
   private byte aByte36 = 5;
   private int anInt651 = -3539;
   private boolean aBoolean162 = true;

   public Class10_Sub1_Sub1_Sub3(Jagfile var1, String var2, int var3) {
      Packet var4 = new Packet(var1.read(var2 + ".dat", (byte[])null));
      Packet var5 = new Packet(var1.read("index.dat", (byte[])null));
      var5.pos = var4.g2();
      this.anInt656 = var5.g2();
      this.anInt657 = var5.g2();
      int var6 = var5.g1();
      this.anIntArray175 = new int[var6];

      int var7;
      for(var7 = 0; var7 < var6 - 1; ++var7) {
         this.anIntArray175[var7 + 1] = var5.g3();
      }

      for(var7 = 0; var7 < var3; ++var7) {
         var5.pos += 2;
         var4.pos += var5.g2() * var5.g2();
         ++var5.pos;
      }

      this.anInt654 = var5.g1();
      this.anInt655 = var5.g1();
      this.anInt652 = var5.g2();
      this.anInt653 = var5.g2();
      var7 = var5.g1();
      int var8 = this.anInt652 * this.anInt653;
      this.aByteArray16 = new byte[var8];
      int var9;
      if (var7 == 0) {
         for(var9 = 0; var9 < var8; ++var9) {
            this.aByteArray16[var9] = var4.g1b();
         }
      } else if (var7 == 1) {
         for(var9 = 0; var9 < this.anInt652; ++var9) {
            for(int var10 = 0; var10 < this.anInt653; ++var10) {
               this.aByteArray16[var9 + var10 * this.anInt652] = var4.g1b();
            }
         }
      }

   }

   public void method440(int var1, int var2) {
      var2 += this.anInt654;
      var1 += this.anInt655;
      int var3 = var2 + var1 * Draw2D.width2d;
      int var4 = 0;
      int var5 = this.anInt653;
      int var6 = this.anInt652;
      int var7 = Draw2D.width2d - var6;
      int var8 = 0;
      int var9;
      if (var1 < Draw2D.top) {
         var9 = Draw2D.top - var1;
         var5 -= var9;
         var1 = Draw2D.top;
         var4 = var9 * var6 + 0;
         var3 += var9 * Draw2D.width2d;
      }

      if (var1 + var5 > Draw2D.bottom) {
         var5 -= var1 + var5 - Draw2D.bottom;
      }

      if (var2 < Draw2D.left) {
         var9 = Draw2D.left - var2;
         var6 -= var9;
         var2 = Draw2D.left;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if (var2 + var6 > Draw2D.right) {
         var9 = var2 + var6 - Draw2D.right;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         this.method441(var4, Draw2D.data, this.aByteArray16, var8, this.anIntArray175, var5, var6, var3, var7);
      }

   }

   private void method441(int var1, int[] var2, byte[] var3, int var4, int[] var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var7 >> 2);
      int var11 = -(var7 & 3);

      for(int var12 = -var6; var12 < 0; ++var12) {
         int var13;
         byte var14;
         for(var13 = var10; var13 < 0; ++var13) {
            var14 = var3[var1++];
            if (var14 == 0) {
               ++var8;
            } else {
               var2[var8++] = var5[var14 & 255];
            }

            var14 = var3[var1++];
            if (var14 == 0) {
               ++var8;
            } else {
               var2[var8++] = var5[var14 & 255];
            }

            var14 = var3[var1++];
            if (var14 == 0) {
               ++var8;
            } else {
               var2[var8++] = var5[var14 & 255];
            }

            var14 = var3[var1++];
            if (var14 == 0) {
               ++var8;
            } else {
               var2[var8++] = var5[var14 & 255];
            }
         }

         for(var13 = var11; var13 < 0; ++var13) {
            var14 = var3[var1++];
            if (var14 == 0) {
               ++var8;
            } else {
               var2[var8++] = var5[var14 & 255];
            }
         }

         var8 += var9;
         var1 += var4;
      }

   }

   public void method437() {
      byte[] var1 = new byte[this.anInt652 * this.anInt653];
      int var2 = 0;

      for(int var3 = 0; var3 < this.anInt653; ++var3) {
         for(int var4 = this.anInt652 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.aByteArray16[var4 + var3 * this.anInt652];
         }
      }

      this.aByteArray16 = var1;
      this.anInt654 = this.anInt656 - this.anInt652 - this.anInt654;
   }

   public void method438() {
      byte[] var1 = new byte[this.anInt652 * this.anInt653];
      int var2 = 0;

      for(int var3 = this.anInt653 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.anInt652; ++var4) {
            var1[var2++] = this.aByteArray16[var4 + var3 * this.anInt652];
         }
      }

      this.aByteArray16 = var1;
      this.anInt655 = this.anInt657 - this.anInt653 - this.anInt655;
   }

   public void method439(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anIntArray175.length; ++var4) {
         int var5 = this.anIntArray175[var4] >> 16 & 255;
         var5 += var3;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.anIntArray175[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.anIntArray175[var4] & 255;
         var7 += var1;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.anIntArray175[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

      if (this.anInt650 == -235) {
      }

   }

   public void method436() {
      if (this.anInt652 != this.anInt656 || this.anInt653 != this.anInt657) {
         byte[] var1 = new byte[this.anInt656 * this.anInt657];
         int var2 = 0;

         for(int var3 = 0; var3 < this.anInt653; ++var3) {
            for(int var4 = 0; var4 < this.anInt652; ++var4) {
               var1[var4 + this.anInt654 + (var3 + this.anInt655) * this.anInt656] = this.aByteArray16[var2++];
            }
         }

         this.aByteArray16 = var1;
         this.anInt652 = this.anInt656;
         this.anInt653 = this.anInt657;
         this.anInt654 = 0;
         this.anInt655 = 0;
      }

   }

   public void method435() {
      this.anInt656 /= 2;
      this.anInt657 /= 2;
      byte[] var1 = new byte[this.anInt656 * this.anInt657];
      int var2 = 0;

      for(int var3 = 0; var3 < this.anInt653; ++var3) {
         for(int var4 = 0; var4 < this.anInt652; ++var4) {
            var1[(var4 + this.anInt654 >> 1) + (var3 + this.anInt655 >> 1) * this.anInt656] = this.aByteArray16[var2++];
         }
      }

      this.aByteArray16 = var1;
      this.anInt652 = this.anInt656;
      this.anInt653 = this.anInt657;
      this.anInt654 = 0;
      this.anInt655 = 0;
   }
}
