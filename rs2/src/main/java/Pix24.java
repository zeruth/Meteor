import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Pix24 extends Draw2D {
   private int cropX;
   public int cropW;
   public int width;
   public int[] pixels;
   public int cropH;
   public int height;
   private boolean aBoolean27 = true;
   private int cropY;
   private byte aByte8 = 5;
   private int anInt99 = -3539;
   private int anInt100 = -766;
   private int anInt101 = -766;
   private int anInt102 = 1;
   private boolean aBoolean28 = true;
   private boolean aBoolean29 = false;
   private boolean aBoolean30 = false;
   private int anInt103 = 3600;

   public Pix24(byte[] var1, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         this.width = var3.getWidth(var2);
         this.height = var3.getHeight(var2);
         this.cropW = this.width;
         this.cropH = this.height;
         this.cropX = 0;
         this.cropY = 0;
         this.pixels = new int[this.width * this.height];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.width, this.height, this.pixels, 0, this.width);
         var5.grabPixels();
      } catch (Exception var6) {
         System.out.println("Error converting jpg");
      }

   }

   public Pix24(int var1, int var2) {
      this.pixels = new int[var1 * var2];
      this.width = this.cropW = var1;
      this.height = this.cropH = var2;
      this.cropX = this.cropY = 0;
   }

   public Pix24(Jagfile var1, String var2, int var3) {
      Packet var4 = new Packet(var1.read(var2 + ".dat", (byte[])null));
      Packet var5 = new Packet(var1.read("index.dat", (byte[])null));
      var5.pos = var4.g2();
      this.cropW = var5.g2();
      this.cropH = var5.g2();
      int var6 = var5.g1();
      int[] var7 = new int[var6];

      int var8;
      for(var8 = 0; var8 < var6 - 1; ++var8) {
         var7[var8 + 1] = var5.g3();
         if (var7[var8 + 1] == 0) {
            var7[var8 + 1] = 1;
         }
      }

      for(var8 = 0; var8 < var3; ++var8) {
         var5.pos += 2;
         var4.pos += var5.g2() * var5.g2();
         ++var5.pos;
      }

      this.cropX = var5.g1();
      this.cropY = var5.g1();
      this.width = var5.g2();
      this.height = var5.g2();
      var8 = var5.g1();
      int var9 = this.width * this.height;
      this.pixels = new int[var9];
      int var10;
      if (var8 == 0) {
         for(var10 = 0; var10 < var9; ++var10) {
            this.pixels[var10] = var7[var4.g1()];
         }
      } else if (var8 == 1) {
         for(var10 = 0; var10 < this.width; ++var10) {
            for(int var11 = 0; var11 < this.height; ++var11) {
               this.pixels[var10 + var11 * this.width] = var7[var4.g1()];
            }
         }
      }

   }

   public void method76(int var1, int var2) {
      var2 += this.cropX;
      var1 += this.cropY;
      int var3 = var2 + var1 * Draw2D.width2d;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
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
         this.method77(var6, var7, var5, this.pixels, var4, var8, var3, Draw2D.data);
      }

   }

   public void method82(int var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int var8, int var9, int[] var10, int var11) {
      boolean var12 = false;

      try {
         int var13 = -var5 / 2;
         int var14 = -var3 / 2;
         int var15 = (int)(Math.sin((double)var8 / 326.11) * 65536.0);
         int var16 = (int)(Math.cos((double)var8 / 326.11) * 65536.0);
         int var17 = var15 * var9 >> 8;
         int var18 = var16 * var9 >> 8;
         int var19 = (var4 << 16) + var14 * var17 + var13 * var18;
         int var20 = (var11 << 16) + (var14 * var18 - var13 * var17);
         int var21 = var7 + var1 * Draw2D.width2d;

         for(int var22 = 0; var22 < var3; ++var22) {
            int var23 = var10[var22];
            int var24 = var21 + var23;
            int var25 = var19 + var18 * var23;
            int var26 = var20 - var17 * var23;

            for(int var27 = -var6[var22]; var27 < 0; ++var27) {
               Draw2D.data[var24++] = this.pixels[(var25 >> 16) + (var26 >> 16) * this.width];
               var25 += var18;
               var26 -= var17;
            }

            var19 += var17;
            var20 += var18;
            var21 += Draw2D.width2d;
         }
      } catch (Exception var29) {
      }

   }

   public void draw(int var1, int var2) {
      var2 += this.cropX;
      var1 += this.cropY;
      int var3 = var2 + var1 * Draw2D.width2d;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
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
         this.method79(Draw2D.data, this.pixels, var4, var3, var6, var5, var7, var8);
      }

   }

   public void bind() {
      Draw2D.bind(this.width, this.height, this.pixels);
   }

   public void method83(int var1, int var2, double var3, int var5) {
      if (var2 == -30658) {
         try {
            int var6 = (int)(Math.sin(var3) * 65536.0);
            int var7 = (int)(Math.cos(var3) * 65536.0);
            int var8 = var6 * 256 >> 8;
            int var9 = var7 * 256 >> 8;
            int var10 = var8 * -10 + var9 * -10 + 983040;
            int var11 = var9 * -10 + 983040 - var8 * -10;
            int var12 = var1 + var5 * Draw2D.width2d;

            for(int var13 = 0; var13 < 20; ++var13) {
               int var14 = var12;
               int var15 = var10;
               int var16 = var11;

               for(int var17 = -20; var17 < 0; ++var17) {
                  int var18 = this.pixels[(var15 >> 16) + (var16 >> 16) * this.width];
                  if (var18 == 0) {
                     ++var14;
                  } else {
                     Draw2D.data[var14++] = var18;
                  }

                  var15 += var9;
                  var16 -= var8;
               }

               var10 += var8;
               var11 += var9;
               var12 += Draw2D.width2d;
            }
         } catch (Exception var20) {
         }
      }

   }

   public void method84(Class10_Sub1_Sub1_Sub3 var1, int var2, int var3) {
      var3 += this.cropX;
      var2 += this.cropY;
      int var4 = var3 + var2 * Draw2D.width2d;
      int var5 = 0;
      int var6 = this.height;
      int var7 = this.width;
      int var8 = Draw2D.width2d - var7;
      int var9 = 0;
      int var10;
      if (var2 < Draw2D.top) {
         var10 = Draw2D.top - var2;
         var6 -= var10;
         var2 = Draw2D.top;
         var5 = var10 * var7 + 0;
         var4 += var10 * Draw2D.width2d;
      }

      if (var2 + var6 > Draw2D.bottom) {
         var6 -= var2 + var6 - Draw2D.bottom;
      }

      if (var3 < Draw2D.left) {
         var10 = Draw2D.left - var3;
         var7 -= var10;
         var3 = Draw2D.left;
         var5 += var10;
         var4 += var10;
         var9 = var10 + 0;
         var8 += var10;
      }

      if (var3 + var7 > Draw2D.right) {
         var10 = var3 + var7 - Draw2D.right;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         this.method85(var4, var8, this.pixels, var7, Draw2D.data, var1.aByteArray16, var6, var5, 0, var9);
      }

   }

   private void method79(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      int var10 = -(var5 & 3);

      for(int var11 = -var6; var11 < 0; ++var11) {
         int var12;
         int var13;
         for(var13 = var9; var13 < 0; ++var13) {
            var12 = var2[var3++];
            if (var12 == 0) {
               ++var4;
            } else {
               var1[var4++] = var12;
            }

            var12 = var2[var3++];
            if (var12 == 0) {
               ++var4;
            } else {
               var1[var4++] = var12;
            }

            var12 = var2[var3++];
            if (var12 == 0) {
               ++var4;
            } else {
               var1[var4++] = var12;
            }

            var12 = var2[var3++];
            if (var12 == 0) {
               ++var4;
            } else {
               var1[var4++] = var12;
            }
         }

         for(var13 = var10; var13 < 0; ++var13) {
            var12 = var2[var3++];
            if (var12 == 0) {
               ++var4;
            } else {
               var1[var4++] = var12;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private void method77(int var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int[] var8) {
      int var9 = -(var1 >> 2);
      int var10 = -(var1 & 3);

      for(int var11 = -var3; var11 < 0; ++var11) {
         int var12;
         for(var12 = var9; var12 < 0; ++var12) {
            var8[var7++] = var4[var5++];
            var8[var7++] = var4[var5++];
            var8[var7++] = var4[var5++];
            var8[var7++] = var4[var5++];
         }

         for(var12 = var10; var12 < 0; ++var12) {
            var8[var7++] = var4[var5++];
         }

         var7 += var2;
         var5 += var6;
      }

   }

   private void method85(int var1, int var2, int[] var3, int var4, int[] var5, byte[] var6, int var7, int var8, int var9, int var10) {
      int var11 = -(var4 >> 2);
      int var12 = -(var4 & 3);

      for(int var13 = -var7; var13 < 0; ++var13) {
         int var14;
         int var15;
         for(var15 = var11; var15 < 0; ++var15) {
            var14 = var3[var8++];
            if (var14 != 0 && var6[var1] == 0) {
               var5[var1++] = var14;
            } else {
               ++var1;
            }

            var14 = var3[var8++];
            if (var14 != 0 && var6[var1] == 0) {
               var5[var1++] = var14;
            } else {
               ++var1;
            }

            var14 = var3[var8++];
            if (var14 != 0 && var6[var1] == 0) {
               var5[var1++] = var14;
            } else {
               ++var1;
            }

            var14 = var3[var8++];
            if (var14 != 0 && var6[var1] == 0) {
               var5[var1++] = var14;
            } else {
               ++var1;
            }
         }

         for(var15 = var12; var15 < 0; ++var15) {
            var14 = var3[var8++];
            if (var14 != 0 && var6[var1] == 0) {
               var5[var1++] = var14;
            } else {
               ++var1;
            }
         }

         var1 += var2;
         var8 += var10;
      }

   }

   private void method81(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      for(int var11 = -var8; var11 < 0; ++var11) {
         for(int var12 = -var1; var12 < 0; ++var12) {
            int var13 = var10[var5++];
            if (var13 == 0) {
               ++var7;
            } else {
               int var14 = var9[var7];
               var9[var7++] = ((var13 & 16711935) * 128 + (var14 & 16711935) * 128 & -16711936) + ((var13 & 65280) * 128 + (var14 & 65280) * 128 & 16711680) >> 8;
            }
         }

         var7 += var4;
         var5 += var2;
      }

      if (var6 >= 0) {
         this.aBoolean27 = !this.aBoolean27;
      }

   }

   public void method80(int var1, int var2) {
      var1 += this.cropX;
      var2 += this.cropY;
      int var3 = var1 + var2 * Draw2D.width2d;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
      int var7 = Draw2D.width2d - var6;
      int var8 = 0;
      int var9;
      if (var2 < Draw2D.top) {
         var9 = Draw2D.top - var2;
         var5 -= var9;
         var2 = Draw2D.top;
         var4 = var9 * var6 + 0;
         var3 += var9 * Draw2D.width2d;
      }

      if (var2 + var5 > Draw2D.bottom) {
         var5 -= var2 + var5 - Draw2D.bottom;
      }

      if (var1 < Draw2D.left) {
         var9 = Draw2D.left - var1;
         var6 -= var9;
         var1 = Draw2D.left;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if (var1 + var6 > Draw2D.right) {
         var9 = var1 + var6 - Draw2D.right;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         this.method81(var6, var8, 0, var7, var4, this.anInt100, var3, var5, Draw2D.data, this.pixels);
      }

   }

   public void method75() {
      int[] var1 = new int[this.cropW * this.cropH];

      for(int var2 = 0; var2 < this.height; ++var2) {
         for(int var3 = 0; var3 < this.width; ++var3) {
            var1[(var2 + this.cropY) * this.cropW + var3 + this.cropX] = this.pixels[var2 * this.width + var3];
         }
      }

      this.pixels = var1;
      this.width = this.cropW;
      this.height = this.cropH;
      this.cropX = 0;
      this.cropY = 0;
   }

   public void translate(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.pixels.length; ++var4) {
         int var5 = this.pixels[var4];
         if (var5 != 0) {
            int var6 = var5 >> 16 & 255;
            var6 += var3;
            if (var6 < 1) {
               var6 = 1;
            } else if (var6 > 255) {
               var6 = 255;
            }

            int var7 = var5 >> 8 & 255;
            var7 += var2;
            if (var7 < 1) {
               var7 = 1;
            } else if (var7 > 255) {
               var7 = 255;
            }

            int var8 = var5 & 255;
            var8 += var1;
            if (var8 < 1) {
               var8 = 1;
            } else if (var8 > 255) {
               var8 = 255;
            }

            this.pixels[var4] = (var6 << 16) + (var7 << 8) + var8;
         }
      }

   }
}
