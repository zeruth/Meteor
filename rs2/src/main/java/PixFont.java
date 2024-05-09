import java.util.Random;

public final class PixFont extends Draw2D {
   private int anInt229 = 3;
   private boolean aBoolean71 = false;
   private int anInt228 = 3;
   private Random aRandom1 = new Random();
   public int anInt230;
   private boolean aBoolean69 = true;
   private int[] anIntArray62 = new int[256];
   private boolean aBoolean70 = true;
   private byte[][] aByteArrayArray3 = new byte[256][];
   private int[] anIntArray60 = new int[256];
   private int[] anIntArray58 = new int[256];
   private int[] anIntArray61 = new int[256];
   private int[] anIntArray59 = new int[256];

   public PixFont(boolean var1, Jagfile var2, int var3, String var4) {
      Packet var5 = new Packet(var2.read(var4 + ".dat", (byte[])null));
      Packet var6 = new Packet(var2.read("index.dat", (byte[])null));
      var6.pos = var5.g2() + 4;
      int var7 = var6.g1();
      if (var7 > 0) {
         var6.pos += (var7 - 1) * 3;
      }

      for(int var8 = 0; var8 < 256; ++var8) {
         this.anIntArray60[var8] = var6.g1();
         this.anIntArray61[var8] = var6.g1();
         int var9 = this.anIntArray58[var8] = var6.g2();
         int var10 = this.anIntArray59[var8] = var6.g2();
         int var11 = var6.g1();
         int var12 = var9 * var10;
         this.aByteArrayArray3[var8] = new byte[var12];
         int var13;
         int var14;
         if (var11 == 0) {
            for(var13 = 0; var13 < var12; ++var13) {
               this.aByteArrayArray3[var8][var13] = var5.g1b();
            }
         } else if (var11 == 1) {
            for(var13 = 0; var13 < var9; ++var13) {
               for(var14 = 0; var14 < var10; ++var14) {
                  this.aByteArrayArray3[var8][var13 + var14 * var9] = var5.g1b();
               }
            }
         }

         if (var10 > this.anInt230 && var8 < 128) {
            this.anInt230 = var10;
         }

         this.anIntArray60[var8] = 1;
         this.anIntArray62[var8] = var9 + 2;
         var13 = 0;

         for(var14 = var10 / 7; var14 < var10; ++var14) {
            var13 += this.aByteArrayArray3[var8][var14 * var9];
         }

         int var10003;
         if (var13 <= var10 / 7) {
            var10003 = this.anIntArray62[var8]--;
            this.anIntArray60[var8] = 0;
         }

         var13 = 0;

         for(int var16 = var10 / 7; var16 < var10; ++var16) {
            var13 += this.aByteArrayArray3[var8][var9 + var16 * var9 - 1];
         }

         if (var13 <= var10 / 7) {
            var10003 = this.anIntArray62[var8]--;
         }
      }

      if (var1) {
         this.anIntArray62[32] = this.anIntArray62[73];
      } else {
         this.anIntArray62[32] = this.anIntArray62[105];
      }
   }

   public int method151(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            var2 += this.anIntArray62[var1.charAt(var3)];
         }

         return var2;
      }
   }

   public int method150(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (var1.charAt(var3) == '@' && var3 + 4 < var1.length() && var1.charAt(var3 + 4) == '@') {
               var3 += 4;
            } else {
               var2 += this.anIntArray62[var1.charAt(var3)];
            }
         }

         return var2;
      }
   }

   public void method152(int var1, int var2, int var3, String var4) {
      if (var4 != null) {
         int var5 = var3 - this.anInt230;

         for(int var6 = 0; var6 < var4.length(); ++var6) {
            char var7 = var4.charAt(var6);
            if (var7 != ' ') {
               this.method159(this.aByteArrayArray3[var7], var1 + this.anIntArray60[var7], var5 + this.anIntArray61[var7], this.anIntArray58[var7], this.anIntArray59[var7], var2);
            }

            var1 += this.anIntArray62[var7];
         }
      }

   }

   public void method156(int var1, int var2, int var3, boolean var4, String var5) {
      this.aBoolean71 = false;
      int var6 = var2;
      if (var5 != null) {
         int var7 = var3 - this.anInt230;

         for(int var8 = 0; var8 < var5.length(); ++var8) {
            int var9;
            if (var5.charAt(var8) == '@' && var8 + 4 < var5.length() && var5.charAt(var8 + 4) == '@') {
               var9 = this.method158(this.anInt229, var5.substring(var8 + 1, var8 + 4));
               if (var9 != -1) {
                  var1 = var9;
               }

               var8 += 4;
            } else {
               var9 = var5.charAt(var8);
               if (var9 != 32) {
                  if (var4) {
                     this.method159(this.aByteArrayArray3[var9], var2 + this.anIntArray60[var9] + 1, var7 + this.anIntArray61[var9] + 1, this.anIntArray58[var9], this.anIntArray59[var9], 0);
                  }

                  this.method159(this.aByteArrayArray3[var9], var2 + this.anIntArray60[var9], var7 + this.anIntArray61[var9], this.anIntArray58[var9], this.anIntArray59[var9], var1);
               }

               var2 += this.anIntArray62[var9];
            }
         }

         if (this.aBoolean71) {
            Draw2D.drawHorizontalLine(var2, 8388608, var7 + (int)((double)this.anInt230 * 0.7), var2 - var6);
         }
      }

   }

   public void method148(int var1, int var2, int var3, int var4, String var5) {
      this.method152(var1 - this.method151(var5) / 2, var4, var3, var5);
      boolean var6 = false;
   }

   public void method149(boolean var1, int var2, int var3, int var4, int var5, String var6) {
      if (var2 >= this.anInt228 && var2 <= this.anInt228) {
         this.method156(var3, var5 - this.method150(var6) / 2, var4, var1, var6);
      }

   }

   private int method158(int var1, String var2) {
      if (var1 != this.anInt229) {
         for(int var3 = 1; var3 > 0; ++var3) {
         }
      }

      if (var2.equals("red")) {
         return 16711680;
      } else if (var2.equals("gre")) {
         return 65280;
      } else if (var2.equals("blu")) {
         return 255;
      } else if (var2.equals("yel")) {
         return 16776960;
      } else if (var2.equals("cya")) {
         return 65535;
      } else if (var2.equals("mag")) {
         return 16711935;
      } else if (var2.equals("whi")) {
         return 16777215;
      } else if (var2.equals("bla")) {
         return 0;
      } else if (var2.equals("lre")) {
         return 16748608;
      } else if (var2.equals("dre")) {
         return 8388608;
      } else if (var2.equals("dbl")) {
         return 128;
      } else if (var2.equals("or1")) {
         return 16756736;
      } else if (var2.equals("or2")) {
         return 16740352;
      } else if (var2.equals("or3")) {
         return 16723968;
      } else if (var2.equals("gr1")) {
         return 12648192;
      } else if (var2.equals("gr2")) {
         return 8453888;
      } else if (var2.equals("gr3")) {
         return 4259584;
      } else {
         if (var2.equals("str")) {
            this.aBoolean71 = true;
         }

         if (var2.equals("end")) {
            this.aBoolean71 = false;
         }

         return -1;
      }
   }

   private void method159(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Draw2D.width2d;
      int var8 = Draw2D.width2d - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < Draw2D.top) {
         var11 = Draw2D.top - var3;
         var5 -= var11;
         var3 = Draw2D.top;
         var10 = var11 * var4 + 0;
         var7 += var11 * Draw2D.width2d;
      }

      if (var3 + var5 >= Draw2D.bottom) {
         var5 -= var3 + var5 + 1 - Draw2D.bottom;
      }

      if (var2 < Draw2D.left) {
         var11 = Draw2D.left - var2;
         var4 -= var11;
         var2 = Draw2D.left;
         var10 += var11;
         var7 += var11;
         var9 = var11 + 0;
         var8 += var11;
      }

      if (var2 + var4 >= Draw2D.right) {
         var11 = var2 + var4 + 1 - Draw2D.right;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         this.method160(Draw2D.data, var1, var6, var10, var7, var4, var5, var8, var9);
      }

   }

   public void method157(int var1, int var2, int var3, int var4, String var5) {
      if (var5 != null) {
         this.aRandom1.setSeed((long)var1);
         int var6 = (this.aRandom1.nextInt() & 31) + 192;
         int var7 = 15 - this.anInt230;

         for(int var8 = 0; var8 < var5.length(); ++var8) {
            int var9;
            if (var5.charAt(var8) == '@' && var8 + 4 < var5.length() && var5.charAt(var8 + 4) == '@') {
               var9 = this.method158(this.anInt229, var5.substring(var8 + 1, var8 + 4));
               if (var9 != -1) {
                  var3 = var9;
               }

               var8 += 4;
            } else {
               var9 = var5.charAt(var8);
               if (var9 != 32) {
                  this.method161(var2 + this.anIntArray60[var9] + 1, 0, this.aByteArrayArray3[var9], var7 + this.anIntArray61[var9] + 1, this.anIntArray59[var9], this.anIntArray58[var9], 192);
                  this.method161(var2 + this.anIntArray60[var9], var3, this.aByteArrayArray3[var9], var7 + this.anIntArray61[var9], this.anIntArray59[var9], this.anIntArray58[var9], var6);
               }

               var2 += this.anIntArray62[var9];
               if ((this.aRandom1.nextInt() & 3) == 0) {
                  ++var2;
               }
            }
         }
      }

   }

   private void method161(int var1, int var2, byte[] var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var4 * Draw2D.width2d;
      int var9 = Draw2D.width2d - var6;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var4 < Draw2D.top) {
         var12 = Draw2D.top - var4;
         var5 -= var12;
         var4 = Draw2D.top;
         var11 = var12 * var6 + 0;
         var8 += var12 * Draw2D.width2d;
      }

      if (var4 + var5 >= Draw2D.bottom) {
         var5 -= var4 + var5 + 1 - Draw2D.bottom;
      }

      if (var1 < Draw2D.left) {
         var12 = Draw2D.left - var1;
         var6 -= var12;
         var1 = Draw2D.left;
         var11 += var12;
         var8 += var12;
         var10 = var12 + 0;
         var9 += var12;
      }

      if (var1 + var6 >= Draw2D.right) {
         var12 = var1 + var6 + 1 - Draw2D.right;
         var6 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var6 > 0 && var5 > 0) {
         this.method162(var11, var9, var10, var8, var7, Draw2D.data, var2, var5, var6, var3);
      }

   }

   private void method162(int var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int var8, int var9, byte[] var10) {
      int var11 = ((var7 & 16711935) * var5 & -16711936) + ((var7 & 65280) * var5 & 16711680) >> 8;
      int var12 = 256 - var5;

      for(int var13 = -var8; var13 < 0; ++var13) {
         for(int var14 = -var9; var14 < 0; ++var14) {
            if (var10[var1++] == 0) {
               ++var4;
            } else {
               int var15 = var6[var4];
               var6[var4++] = (((var15 & 16711935) * var12 & -16711936) + ((var15 & 65280) * var12 & 16711680) >> 8) + var11;
            }
         }

         var4 += var2;
         var1 += var3;
      }

   }

   private void method160(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      int var11 = -(var6 & 3);

      for(int var12 = -var7; var12 < 0; ++var12) {
         int var13;
         for(var13 = var10; var13 < 0; ++var13) {
            if (var2[var4++] == 0) {
               ++var5;
            } else {
               var1[var5++] = var3;
            }

            if (var2[var4++] == 0) {
               ++var5;
            } else {
               var1[var5++] = var3;
            }

            if (var2[var4++] == 0) {
               ++var5;
            } else {
               var1[var5++] = var3;
            }

            if (var2[var4++] == 0) {
               ++var5;
            } else {
               var1[var5++] = var3;
            }
         }

         for(var13 = var11; var13 < 0; ++var13) {
            if (var2[var4++] == 0) {
               ++var5;
            } else {
               var1[var5++] = var3;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   public void method147(String var1, int var2, int var3) {
      this.method152(507 - this.method151(var1), var2, var3, var1);
   }

   public void method153(int var1, byte var2, int var3, String var4, int var5, int var6) {
      if (var4 != null) {
         var5 -= this.method151(var4) / 2;
         boolean var7 = false;
         int var8 = var1 - this.anInt230;

         for(int var9 = 0; var9 < var4.length(); ++var9) {
            char var10 = var4.charAt(var9);
            if (var10 != ' ') {
               this.method159(this.aByteArrayArray3[var10], var5 + this.anIntArray60[var10], var8 + this.anIntArray61[var10] + (int)(Math.sin((double)var9 / 2.0 + (double)var3 / 5.0) * 5.0), this.anIntArray58[var10], this.anIntArray59[var10], var6);
            }

            var5 += this.anIntArray62[var10];
         }
      }

   }

   public void method154(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null) {
         var4 -= this.method151(var3) / 2;
         int var6 = var1 - this.anInt230;

         for(int var7 = 0; var7 < var3.length(); ++var7) {
            char var8 = var3.charAt(var7);
            if (var8 != ' ') {
               this.method159(this.aByteArrayArray3[var8], var4 + this.anIntArray60[var8] + (int)(Math.sin((double)var7 / 5.0 + (double)var5 / 5.0) * 5.0), var6 + this.anIntArray61[var8] + (int)(Math.sin((double)var7 / 3.0 + (double)var5 / 5.0) * 5.0), this.anIntArray58[var8], this.anIntArray59[var8], var2);
            }

            var4 += this.anIntArray62[var8];
         }
      }

   }

   public void method155(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         double var7 = 7.0 - (double)var5 / 8.0;
         if (var7 < 0.0) {
            var7 = 0.0;
         }

         var3 -= this.method151(var1) / 2;
         int var9 = var4 - this.anInt230;

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            char var11 = var1.charAt(var10);
            if (var11 != ' ') {
               this.method159(this.aByteArrayArray3[var11], var3 + this.anIntArray60[var11], var9 + this.anIntArray61[var11] + (int)(Math.sin((double)var10 / 1.5 + (double)var6) * var7), this.anIntArray58[var11], this.anIntArray59[var11], var2);
            }

            var3 += this.anIntArray62[var11];
         }
      }

   }
}
