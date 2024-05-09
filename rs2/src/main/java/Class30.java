public final class Class30 {
   private int anInt478;
   private int anInt482;
   private boolean aBoolean123 = true;
   public int anInt477;
   private int anInt474;
   private int anInt479;
   private int[] anIntArray156;
   private int anInt481;
   private int anInt480;
   private int[] anIntArray155;
   public int anInt475;
   public int anInt476;

   public void method361() {
      this.anInt478 = 0;
      this.anInt479 = 0;
      this.anInt480 = 0;
      this.anInt481 = 0;
      this.anInt482 = 0;
   }

   public void method359(byte var1, Packet var2) {
      this.anInt477 = var2.g1();
      if (var1 != 6) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;
         this.anInt475 = var2.g4();
         this.anInt476 = var2.g4();
         this.method360(var2);
      }
   }

   public void method360(Packet var1) {
      this.anInt474 = var1.g1();
      this.anIntArray155 = new int[this.anInt474];
      this.anIntArray156 = new int[this.anInt474];

      for(int var2 = 0; var2 < this.anInt474; ++var2) {
         this.anIntArray155[var2] = var1.g2();
         this.anIntArray156[var2] = var1.g2();
      }

   }

   public int method362(int var1) {
      if (this.anInt482 >= this.anInt478) {
         this.anInt481 = this.anIntArray156[this.anInt479++] << 15;
         if (this.anInt479 >= this.anInt474) {
            this.anInt479 = this.anInt474 - 1;
         }

         this.anInt478 = (int)((double)this.anIntArray155[this.anInt479] / 65536.0 * (double)var1);
         if (this.anInt478 > this.anInt482) {
            this.anInt480 = ((this.anIntArray156[this.anInt479] << 15) - this.anInt481) / (this.anInt478 - this.anInt482);
         }
      }

      this.anInt481 += this.anInt480;
      ++this.anInt482;
      return this.anInt481 - this.anInt480 >> 15;
   }
}
