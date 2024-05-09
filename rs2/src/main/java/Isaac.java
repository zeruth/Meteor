public final class Isaac {
   private int count;
   private int b;
   private int c;
   private int[] mem = new int[256];
   private int[] rsl = new int[256];
   private int a;

   public Isaac(int[] var1) {
      System.arraycopy(var1, 0, this.rsl, 0, var1.length);
      this.init();
   }

   private void isaac() {
      this.b += ++this.c;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.mem[var1];
         if ((var1 & 3) == 0) {
            this.a ^= this.a << 13;
         } else if ((var1 & 3) == 1) {
            this.a ^= this.a >>> 6;
         } else if ((var1 & 3) == 2) {
            this.a ^= this.a << 2;
         } else if ((var1 & 3) == 3) {
            this.a ^= this.a >>> 16;
         }

         this.a += this.mem[var1 + 128 & 255];
         int var3;
         this.mem[var1] = var3 = this.mem[var2 >> 2 & 255] + this.a + this.b;
         this.rsl[var1] = this.b = this.mem[var3 >> 8 >> 2 & 255] + var2;
      }

   }

   public int nextInt() {
      if (this.count-- == 0) {
         this.isaac();
         this.count = 255;
      }

      return this.rsl[this.count];
   }

   private void init() {
      int var1 = -1640531527;
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.rsl[var9];
         var7 += this.rsl[var9 + 1];
         var6 += this.rsl[var9 + 2];
         var5 += this.rsl[var9 + 3];
         var4 += this.rsl[var9 + 4];
         var3 += this.rsl[var9 + 5];
         var2 += this.rsl[var9 + 6];
         var1 += this.rsl[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.mem[var9] = var8;
         this.mem[var9 + 1] = var7;
         this.mem[var9 + 2] = var6;
         this.mem[var9 + 3] = var5;
         this.mem[var9 + 4] = var4;
         this.mem[var9 + 5] = var3;
         this.mem[var9 + 6] = var2;
         this.mem[var9 + 7] = var1;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.mem[var9];
         var7 += this.mem[var9 + 1];
         var6 += this.mem[var9 + 2];
         var5 += this.mem[var9 + 3];
         var4 += this.mem[var9 + 4];
         var3 += this.mem[var9 + 5];
         var2 += this.mem[var9 + 6];
         var1 += this.mem[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.mem[var9] = var8;
         this.mem[var9 + 1] = var7;
         this.mem[var9 + 2] = var6;
         this.mem[var9 + 3] = var5;
         this.mem[var9 + 4] = var4;
         this.mem[var9 + 5] = var3;
         this.mem[var9 + 6] = var2;
         this.mem[var9 + 7] = var1;
      }

      this.isaac();
      this.count = 256;
   }
}
