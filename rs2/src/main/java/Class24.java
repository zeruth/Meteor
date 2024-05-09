import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class24 {
   private static byte[] aByteArray10 = new byte[520];
   private int anInt318;
   private boolean aBoolean95 = false;
   private RandomAccessFile aRandomAccessFile2;
   private RandomAccessFile aRandomAccessFile1;
   private int anInt319 = 3;
   private int anInt321 = 65000;
   private int anInt320;

   public Class24(int var1, int var2, RandomAccessFile var3, RandomAccessFile var4, int var5) {
      this.anInt320 = var1;
      this.aRandomAccessFile1 = var3;
      this.aRandomAccessFile2 = var4;
      this.anInt321 = var2;
   }

   private synchronized boolean method243(byte[] var1, int var2, int var3, boolean var4, int var5) {
      if (var2 != 0) {
         throw new NullPointerException();
      } else {
         try {
            int var6;
            int var7;
            int var8;
            if (!var4) {
               var6 = (int)((this.aRandomAccessFile1.length() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            } else {
               this.method244(var3 * 6, this.aRandomAccessFile2);

               for(var7 = 0; var7 < 6; var7 += var8) {
                  var8 = this.aRandomAccessFile2.read(aByteArray10, var7, 6 - var7);
                  if (var8 == -1) {
                     return false;
                  }
               }

               var6 = ((aByteArray10[3] & 255) << 16) + ((aByteArray10[4] & 255) << 8) + (aByteArray10[5] & 255);
               if (var6 <= 0 || (long)var6 > this.aRandomAccessFile1.length() / 520L) {
                  return false;
               }
            }

            aByteArray10[0] = (byte)(var5 >> 16);
            aByteArray10[1] = (byte)(var5 >> 8);
            aByteArray10[2] = (byte)var5;
            aByteArray10[3] = (byte)(var6 >> 16);
            aByteArray10[4] = (byte)(var6 >> 8);
            aByteArray10[5] = (byte)var6;
            this.method244(var3 * 6, this.aRandomAccessFile2);
            this.aRandomAccessFile2.write(aByteArray10, 0, 6);
            var7 = 0;

            for(var8 = 0; var7 < var5; ++var8) {
               int var9 = 0;
               int var10;
               if (var4) {
                  this.method244(var6 * 520, this.aRandomAccessFile1);

                  int var11;
                  for(var10 = 0; var10 < 8; var10 += var11) {
                     var11 = this.aRandomAccessFile1.read(aByteArray10, var10, 8 - var10);
                     if (var11 == -1) {
                        break;
                     }
                  }

                  if (var10 == 8) {
                     var11 = ((aByteArray10[0] & 255) << 8) + (aByteArray10[1] & 255);
                     int var12 = ((aByteArray10[2] & 255) << 8) + (aByteArray10[3] & 255);
                     var9 = ((aByteArray10[4] & 255) << 16) + ((aByteArray10[5] & 255) << 8) + (aByteArray10[6] & 255);
                     int var13 = aByteArray10[7] & 255;
                     if (var11 != var3 || var12 != var8 || var13 != this.anInt320) {
                        return false;
                     }

                     if (var9 < 0 || (long)var9 > this.aRandomAccessFile1.length() / 520L) {
                        return false;
                     }
                  }
               }

               if (var9 == 0) {
                  var4 = false;
                  var9 = (int)((this.aRandomAccessFile1.length() + 519L) / 520L);
                  if (var9 == 0) {
                     ++var9;
                  }

                  if (var9 == var6) {
                     ++var9;
                  }
               }

               if (var5 - var7 <= 512) {
                  var9 = 0;
               }

               aByteArray10[0] = (byte)(var3 >> 8);
               aByteArray10[1] = (byte)var3;
               aByteArray10[2] = (byte)(var8 >> 8);
               aByteArray10[3] = (byte)var8;
               aByteArray10[4] = (byte)(var9 >> 16);
               aByteArray10[5] = (byte)(var9 >> 8);
               aByteArray10[6] = (byte)var9;
               aByteArray10[7] = (byte)this.anInt320;
               this.method244(var6 * 520, this.aRandomAccessFile1);
               this.aRandomAccessFile1.write(aByteArray10, 0, 8);
               var10 = var5 - var7;
               if (var10 > 512) {
                  var10 = 512;
               }

               this.aRandomAccessFile1.write(var1, var7, var10);
               var7 += var10;
               var6 = var9;
            }

            return true;
         } catch (IOException var15) {
            return false;
         }
      }
   }

   private synchronized void method244(int var1, RandomAccessFile var2) throws IOException {
      if (var1 < 0 || var1 > 62914560) {
         System.out.println("Badseek - pos:" + var1 + " len:" + var2.length());
         var1 = 62914560;

         try {
            Thread.sleep(1000L);
         } catch (Exception var4) {
         }
      }

      var2.seek((long)var1);
   }

   public synchronized byte[] method241(byte var1, int var2) {
      if (var1 == 6) {
         boolean var3 = false;
      } else {
         this.aBoolean95 = !this.aBoolean95;
      }

      try {
         this.method244(var2 * 6, this.aRandomAccessFile2);

         int var4;
         int var17;
         for(var17 = 0; var17 < 6; var17 += var4) {
            var4 = this.aRandomAccessFile2.read(aByteArray10, var17, 6 - var17);
            if (var4 == -1) {
               return null;
            }
         }

         var4 = ((aByteArray10[0] & 255) << 16) + ((aByteArray10[1] & 255) << 8) + (aByteArray10[2] & 255);
         int var5 = ((aByteArray10[3] & 255) << 16) + ((aByteArray10[4] & 255) << 8) + (aByteArray10[5] & 255);
         if (var4 >= 0 && var4 <= this.anInt321) {
            if (var5 > 0 && (long)var5 <= this.aRandomAccessFile1.length() / 520L) {
               byte[] var6 = new byte[var4];
               int var7 = 0;
               int var8 = 0;

               while(var7 < var4) {
                  if (var5 == 0) {
                     return null;
                  }

                  this.method244(var5 * 520, this.aRandomAccessFile1);
                  var17 = 0;
                  int var9 = var4 - var7;
                  if (var9 > 512) {
                     var9 = 512;
                  }

                  int var10;
                  while(var17 < var9 + 8) {
                     var10 = this.aRandomAccessFile1.read(aByteArray10, var17, var9 + 8 - var17);
                     if (var10 == -1) {
                        return null;
                     }

                     var17 += var10;
                  }

                  var10 = ((aByteArray10[0] & 255) << 8) + (aByteArray10[1] & 255);
                  int var11 = ((aByteArray10[2] & 255) << 8) + (aByteArray10[3] & 255);
                  int var12 = ((aByteArray10[4] & 255) << 16) + ((aByteArray10[5] & 255) << 8) + (aByteArray10[6] & 255);
                  int var13 = aByteArray10[7] & 255;
                  if (var10 == var2 && var11 == var8 && var13 == this.anInt320) {
                     if (var12 >= 0 && (long)var12 <= this.aRandomAccessFile1.length() / 520L) {
                        for(int var14 = 0; var14 < var9; ++var14) {
                           var6[var7++] = aByteArray10[var14 + 8];
                        }

                        var5 = var12;
                        ++var8;
                        continue;
                     }

                     return null;
                  }

                  return null;
               }

               return var6;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } catch (IOException var16) {
         return null;
      }
   }

   public synchronized boolean method242(int var1, byte[] var2, int var3) {
      boolean var4 = this.method243(var2, this.anInt318, var3, true, var1);
      if (!var4) {
         var4 = this.method243(var2, this.anInt318, var3, false, var1);
      }

      return var4;
   }
}
