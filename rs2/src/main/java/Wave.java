public final class Wave {
   private static byte aByte33 = 6;
   private static boolean aBoolean146 = true;
   private static Packet waveBuffer;
   private static Wave[] tracks = new Wave[5000];
   public static int[] delays = new int[5000];
   private static byte[] waveBytes;
   private int anInt585 = -573;
   private int loopBegin;
   private SoundTone[] tones = new SoundTone[10];
   private int loopEnd;
   private int anInt586 = -252;

   private Wave(int var1) {
   }

   private int method413(int var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if (this.tones[var3] != null && this.tones[var3].anInt72 + this.tones[var3].anInt73 > var2) {
            var2 = this.tones[var3].anInt72 + this.tones[var3].anInt73;
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         var3 = var2 * 22050 / 1000;
         int var4 = this.loopBegin * 22050 / 1000;
         int var5 = this.loopEnd * 22050 / 1000;
         if (var4 < 0 || var4 > var3 || var5 < 0 || var5 > var3 || var4 >= var5) {
            var1 = 0;
         }

         int var6 = var3 + (var5 - var4) * (var1 - 1);

         int var7;
         for(var7 = 44; var7 < var6 + 44; ++var7) {
            waveBytes[var7] = -128;
         }

         int var8;
         int var9;
         int var10;
         for(var10 = 0; var10 < 10; ++var10) {
            if (this.tones[var10] != null) {
               var7 = this.tones[var10].anInt72 * 22050 / 1000;
               var8 = this.tones[var10].anInt73 * 22050 / 1000;
               int[] var11 = this.tones[var10].method42(var7, this.tones[var10].anInt72);

               for(var9 = 0; var9 < var7; ++var9) {
                  int var12 = (waveBytes[var9 + var8 + 44] & 255) + (var11[var9] >> 8);
                  if ((var12 & -256) != 0) {
                     var12 = ~(var12 >> 31);
                  }

                  waveBytes[var9 + var8 + 44] = (byte)var12;
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
               waveBytes[var8 + var7] = waveBytes[var8];
            }

            for(var10 = 1; var10 < var1; ++var10) {
               var7 = (var5 - var4) * var10;

               for(var9 = var4; var9 < var5; ++var9) {
                  waveBytes[var9 + var7] = waveBytes[var9];
               }
            }

            var6 -= 44;
         }

         return var6;
      }
   }

   private Packet method412(int var1) {
      int var2 = this.method413(var1);
      waveBuffer.pos = 0;
      waveBuffer.p4(1380533830);
      waveBuffer.ip4(var2 + 36);
      waveBuffer.p4(1463899717);
      waveBuffer.p4(1718449184);
      waveBuffer.ip4(16);
      waveBuffer.method303(1);
      waveBuffer.method303(1);
      waveBuffer.ip4(22050);
      waveBuffer.ip4(22050);
      waveBuffer.method303(1);
      waveBuffer.method303(8);
      waveBuffer.p4(1684108385);
      waveBuffer.ip4(var2);
      Packet var10000 = waveBuffer;
      var10000.pos += var2;
      return waveBuffer;
   }

   private void read(Packet data) {
      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = data.g1();
         if (var4 != 0) {
            --data.pos;
            this.tones[var3] = new SoundTone();
            this.tones[var3].read(aByte33, data);
         }
      }

      this.loopBegin = data.g2();
      this.loopEnd = data.g2();
   }

   private int method411() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.tones[var2] != null && this.tones[var2].anInt73 / 20 < var1) {
            var1 = this.tones[var2].anInt73 / 20;
         }
      }

      if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < var1) {
         var1 = this.loopBegin / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.tones[var2] != null) {
               SoundTone var10000 = this.tones[var2];
               var10000.anInt73 -= var1 * 20;
            }
         }

         if (this.loopBegin < this.loopEnd) {
            this.loopBegin -= var1 * 20;
            this.loopEnd -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static Packet method409(int var0, int var1) {
      if (tracks[var1] == null) {
         return null;
      } else {
         Wave var2 = tracks[var1];
         return var2.method412(var0);
      }
   }

   public static void unpack(Packet var0) {
      waveBytes = new byte[441000];
      waveBuffer = new Packet(waveBytes);
      SoundTone.init();

      while(true) {
         int id = var0.g2();
         if (id == 65535) {
            return;
         }

         tracks[id] = new Wave(-524);
         tracks[id].read(var0);
         delays[id] = tracks[id].method411();
      }
   }
}
