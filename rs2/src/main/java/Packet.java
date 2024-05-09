import java.math.BigInteger;

public final class Packet extends Hashable {
   private static boolean aBoolean115 = true;
   private static int[] anIntArray150 = new int[256];
   private static final int[] BITMASK;
   private static Class6 aClass6_2;
   private static Class6 aClass6_3;
   private static Class6 aClass6_4;
   private static int anInt431;
   private static char[] aCharArray2;
   private int anInt425;
   public int bitPos;
   public byte[] data;
   public int pos;
   private boolean aBoolean109 = false;
   private int anInt423 = 217;
   private int anInt421 = 8;
   private byte aByte23 = 17;
   public Isaac random;
   private boolean aBoolean110 = false;
   private boolean aBoolean112 = false;
   private boolean aBoolean111 = true;
   private byte aByte22 = 5;
   private int anInt424 = 236;
   private boolean aBoolean113 = false;
   private byte aByte24 = 89;
   private byte aByte25 = -16;
   private boolean aBoolean114 = false;
   private int anInt427 = 1;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = var0;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var1 & 1) == 1) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         anIntArray150[var0] = var1;
      }

      BITMASK = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
      aClass6_2 = new Class6(true);
      aClass6_3 = new Class6(true);
      aClass6_4 = new Class6(true);
      aCharArray2 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
   }

   public Packet(byte[] var1) {
      this.data = var1;
      this.pos = 0;
   }

   private Packet(int var1) {
   }

   public void accessBits(byte var1) {
      this.bitPos = this.pos * 8;
   }

   public int gBit(int var1) {
      int var2 = this.bitPos >> 3;
      int var3 = 8 - (this.bitPos & 7);
      int var4 = 0;

      for(this.bitPos += var1; var1 > var3; var3 = 8) {
         var4 += (this.data[var2++] & BITMASK[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += this.data[var2] & BITMASK[var3];
      } else {
         var4 += this.data[var2] >> var3 - var1 & BITMASK[var1];
      }

      return var4;
   }

   public int g4() {
      this.pos += 4;
      return ((this.data[this.pos - 4] & 255) << 24) + ((this.data[this.pos - 3] & 255) << 16) + ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   public int g1() {
      return this.data[this.pos++] & 255;
   }

   public int g2() {
      this.pos += 2;
      return ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   public void p1isaac(int var1) {
      this.data[this.pos++] = (byte)(var1 + this.random.nextInt());
   }

   public int gsmarts() {
      int var1 = this.data[this.pos] & 255;
      return var1 < 128 ? this.g1() : this.g2() - 32768;
   }

   public int method330() {
      return this.anInt425 == 0 ? this.data[this.pos++] - 128 & 255 : this.anInt423;
   }

   public String gjstr() {
      int var1 = this.pos;

      while(this.data[this.pos++] != 10) {
      }

      return new String(this.data, var1, this.pos - var1 - 1);
   }

   public int g3() {
      this.pos += 3;
      return ((this.data[this.pos - 3] & 255) << 16) + ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   public void p1(int var1) {
      this.data[this.pos++] = (byte)var1;
   }

   private void gdata(int var1, byte[] var2) {
      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = this.data[this.pos++];
      }

   }

   public void accessBytes() {
      this.pos = (this.bitPos + 7) / 8;
   }

   public int method332(int var1) {
      int var2 = 77 / var1;
      return 128 - this.data[this.pos++] & 255;
   }

   public int method331() {
      return -this.data[this.pos++] & 255;
   }

   public void p4(int var1) {
      this.data[this.pos++] = (byte)(var1 >> 24);
      this.data[this.pos++] = (byte)(var1 >> 16);
      this.data[this.pos++] = (byte)(var1 >> 8);
      this.data[this.pos++] = (byte)var1;
   }

   public byte g1b() {
      return this.data[this.pos++];
   }

   public byte method334() {
      return (byte)(-this.data[this.pos++]);
   }

   public byte[] gstrbyte() {
      int var1 = this.pos;

      while(this.data[this.pos++] != 10) {
      }

      byte[] var2 = new byte[this.pos - var1 - 1];
      if (this.pos - 1 - var1 >= 0) {
         System.arraycopy(this.data, var1, var2, 0, this.pos - 1 - var1);
      }

      return var2;
   }

   public int method341() {
      this.pos += 2;
      return ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] - 128 & 255);
   }

   public int method340() {
      this.pos += 2;
      return ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] - 128 & 255);
   }

   public void ip4(int var1) {
      this.data[this.pos++] = (byte)var1;
      this.data[this.pos++] = (byte)(var1 >> 8);
      this.data[this.pos++] = (byte)(var1 >> 16);
      this.data[this.pos++] = (byte)(var1 >> 24);
   }

   public int g2u() {
      this.pos += 2;
      return ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] & 255);
   }

   public void p2(int var1) {
      this.data[this.pos++] = (byte)(var1 >> 8);
      this.data[this.pos++] = (byte)var1;
   }

   public void pdata(byte[] var1, int var2) {
      for(int var3 = 0; var3 < var2 + 0; ++var3) {
         this.data[this.pos++] = var1[var3];
      }

   }

   public byte method333(int var1) {
      if (var1 != 0) {
         for(int var2 = 1; var2 > 0; ++var2) {
         }
      }

      return (byte)(this.data[this.pos++] - 128);
   }

   public int g2b() {
      this.pos += 2;
      int var1 = ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public void p8(long var1) {
      this.data[this.pos++] = (byte)((int)(var1 >> 56));
      this.data[this.pos++] = (byte)((int)(var1 >> 48));
      this.data[this.pos++] = (byte)((int)(var1 >> 40));
      this.data[this.pos++] = (byte)((int)(var1 >> 32));
      this.data[this.pos++] = (byte)((int)(var1 >> 24));
      this.data[this.pos++] = (byte)((int)(var1 >> 16));
      this.data[this.pos++] = (byte)((int)(var1 >> 8));
      this.data[this.pos++] = (byte)((int)var1);
   }

   public void method303(int var1) {
      this.data[this.pos++] = (byte)var1;
      this.data[this.pos++] = 0;
   }

   public int method346() {
      this.pos += 4;
      return ((this.data[this.pos - 2] & 255) << 24) + ((this.data[this.pos - 1] & 255) << 16) + ((this.data[this.pos - 4] & 255) << 8) + (this.data[this.pos - 3] & 255);
   }

   public void p3(int var1) {
      this.data[this.pos++] = (byte)(var1 >> 16);
      this.data[this.pos++] = (byte)(var1 >> 8);
      this.data[this.pos++] = (byte)var1;
   }

   public void psize1(int var1) {
      this.data[this.pos - var1 - 1] = (byte)var1;
   }

   public long g8() {
      long var1 = (long)this.g4() & 4294967295L;
      long var3 = (long)this.g4() & 4294967295L;
      return (var1 << 32) + var3;
   }

   public void method336(int var1) {
      this.data[this.pos++] = (byte)var1;
      this.data[this.pos++] = (byte)(var1 >> 8);
   }

   public void method337(int var1) {
      this.data[this.pos++] = (byte)(var1 >> 8);
      this.data[this.pos++] = (byte)(var1 + 128);
   }

   public void method338(int var1) {
      this.data[this.pos++] = (byte)(var1 + 128);
      this.data[this.pos++] = (byte)(var1 >> 8);
   }

   public int method342() {
      this.pos += 2;
      int var1 = ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public void pjstr(String var1) {
      var1.getBytes(0, var1.length(), this.data, this.pos);
      this.pos += var1.length();
      this.data[this.pos++] = 10;
   }

   public byte method335() {
      return (byte)(128 - this.data[this.pos++]);
   }

   public void method328(int var1) {
      this.data[this.pos++] = (byte)(-var1);
   }

   public void method327(int var1) {
      this.data[this.pos++] = (byte)(var1 + 128);
   }

   public int g3u() {
      this.pos += 3;
      return ((this.data[this.pos - 2] & 255) << 16) + ((this.data[this.pos - 3] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   public void rsaenc(BigInteger var1, BigInteger var2) {
      int var3 = this.pos;
      this.pos = 0;
      byte[] var4 = new byte[var3];
      this.gdata(var3, var4);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var2, var1);
      byte[] var7 = var6.toByteArray();
      this.pos = 0;
      this.p1(var7.length);
      this.pdata(var7, var7.length);
   }

   public int gsmart() {
      int var1 = this.data[this.pos] & 255;
      return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
   }

   public void method348(byte[] var1, int var2) {
      for(int var3 = var2 + 0 - 1; var3 >= 0; --var3) {
         var1[var3] = this.data[this.pos++];
      }

   }

   public int method347() {
      this.pos += 4;
      return ((this.data[this.pos - 3] & 255) << 24) + ((this.data[this.pos - 4] & 255) << 16) + ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] & 255);
   }

   public void method329(int var1) {
      this.data[this.pos++] = (byte)(128 - var1);
   }

   public int method345() {
      this.pos += 4;
      return ((this.data[this.pos - 1] & 255) << 24) + ((this.data[this.pos - 2] & 255) << 16) + ((this.data[this.pos - 3] & 255) << 8) + (this.data[this.pos - 4] & 255);
   }

   public void method349(byte[] var1, int var2) {
      for(int var3 = 0; var3 < var2 + 0; ++var3) {
         var1[var3] = (byte)(this.data[this.pos++] - 128);
      }

   }

   public int method343() {
      this.pos += 2;
      if (this.aByte23 != 17) {
         this.aBoolean112 = !this.aBoolean112;
      }

      int var1 = ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public static Packet method299() {
      Class6 var0 = aClass6_3;
      synchronized(aClass6_3) {
         Packet var2 = null;
         if (anInt431 > 0) {
            --anInt431;
            var2 = (Packet)aClass6_3.method5();
         }

         if (var2 != null) {
            var2.pos = 0;
            return var2;
         }
      }

      Packet var1 = new Packet(-211);
      var1.pos = 0;
      var1.data = new byte[5000];
      return var1;
   }
}
