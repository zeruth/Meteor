public final class Class10_Sub1_Sub2_Sub2 extends Entity {
   private boolean aBoolean86 = false;
   private SpotAnimType aClass28_1;
   private boolean aBoolean84 = false;
   private int anInt274;
   public int anInt271;
   public double aDouble1;
   private double aDouble4;
   private byte aByte19 = -41;
   public int anInt264;
   private int anInt275;
   private boolean aBoolean85 = true;
   public double aDouble2;
   private double aDouble5;
   private int anInt266;
   private int anInt272;
   public int anInt270;
   public double aDouble3;
   public int anInt267;
   private double aDouble7;
   private double aDouble8;
   private int anInt276;
   private double aDouble6;
   private int anInt265;
   private int anInt269;
   public int anInt268;
   public int anInt277;
   private int anInt273;

   public Class10_Sub1_Sub2_Sub2(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9, int var10, int var11, int var12) {
      this.aClass28_1 = SpotAnimType.aClass28Array1[var5];
      this.anInt264 = var1;
      this.anInt274 = var11;
      this.anInt275 = var4;
      this.anInt276 = var10;
      this.anInt270 = var12;
      this.anInt271 = var6;
      if (var9 != this.aByte19) {
         throw new NullPointerException();
      } else {
         this.anInt265 = var7;
         this.anInt266 = var3;
         this.anInt267 = var8;
         this.anInt277 = var2;
         this.aBoolean86 = false;
      }
   }

   protected Model method537(byte var1) {
      Model var2 = this.aClass28_1.method352();
      if (var2 == null) {
         return null;
      } else {
         int var3 = -1;
         if (this.aClass28_1.aClass15_1 != null) {
            var3 = this.aClass28_1.aClass15_1.anIntArray47[this.anInt272];
         }

         Model var4 = new Model(false, false, true, var2, Class22.method169(this.aBoolean85, var3));
         if (var3 != -1) {
            var4.method278();
            var4.method279(var3, (byte)6);
            var4.anIntArrayArray11 = null;
            var4.anIntArrayArray10 = null;
         }

         if (this.aClass28_1.anInt438 != 128 || this.aClass28_1.anInt439 != 128) {
            var4.method287(this.aClass28_1.anInt439, this.aClass28_1.anInt438, this.aClass28_1.anInt438);
         }

         var4.method283(this.anInt269, 341);
         var4.method288(this.aClass28_1.anInt441 + 64, this.aClass28_1.anInt442 + 850, -30, -50, -30, true);
         if (var1 == 3) {
            boolean var5 = false;
         } else {
            this.aBoolean84 = !this.aBoolean84;
         }

         return var4;
      }
   }

   public void method187(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.aBoolean86) {
         var5 = (double)(var1 - this.anInt274);
         double var7 = (double)(var2 - this.anInt275);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.aDouble1 = (double)this.anInt274 + var5 * (double)this.anInt266 / var9;
         this.aDouble2 = (double)this.anInt275 + var7 * (double)this.anInt266 / var9;
         this.aDouble3 = (double)this.anInt276;
      }

      var5 = (double)(this.anInt271 + 1 - var4);
      this.aDouble4 = ((double)var1 - this.aDouble1) / var5;
      this.aDouble5 = ((double)var2 - this.aDouble2) / var5;
      this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
      if (!this.aBoolean86) {
         this.aDouble7 = -this.aDouble6 * Math.tan((double)this.anInt265 * 0.02454369);
      }

      this.aDouble8 = ((double)var3 - this.aDouble3 - this.aDouble7 * var5) * 2.0 / (var5 * var5);
   }

   public void method188(int var1) {
      this.aBoolean86 = true;
      this.aDouble1 += this.aDouble4 * (double)var1;
      this.aDouble2 += this.aDouble5 * (double)var1;
      this.aDouble3 += this.aDouble7 * (double)var1 + this.aDouble8 * 0.5 * (double)var1 * (double)var1;
      this.aDouble7 += this.aDouble8 * (double)var1;
      this.anInt268 = (int)(Math.atan2(this.aDouble4, this.aDouble5) * 325.949) + 1024 & 2047;
      this.anInt269 = (int)(Math.atan2(this.aDouble7, this.aDouble6) * 325.949) & 2047;
      if (this.aClass28_1.aClass15_1 != null) {
         this.anInt273 += var1;

         while(this.anInt273 > this.aClass28_1.aClass15_1.method97(this.anInt272)) {
            this.anInt273 -= this.aClass28_1.aClass15_1.method97(this.anInt272);
            ++this.anInt272;
            if (this.anInt272 >= this.aClass28_1.aClass15_1.anInt152) {
               this.anInt272 = 0;
            }
         }
      }

   }
}
