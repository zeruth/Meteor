public final class LocEntity extends Entity {
   public static Client aClient2;
   private int anInt469;
   private boolean aBoolean122 = false;
   private SeqType aClass15_2;
   private int anInt470;
   private int anInt472;
   private int anInt466;
   private int[] anIntArray154;
   private int anInt467;
   private int anInt468;
   private int anInt461;
   private int anInt473;
   private int anInt462;
   private int anInt463;
   private int anInt464;

   public LocEntity(int var1, int var2, int var3, int var4, int var5, byte var6, int var7, boolean var8, int var9, int var10) {
      this.anInt466 = var7;
      this.anInt467 = var5;
      this.anInt468 = var10;
      this.anInt461 = var9;
      this.anInt462 = var4;
      this.anInt463 = var2;
      this.anInt464 = var3;
      if (var1 != -1) {
         this.aClass15_2 = SeqType.instances[var1];
         this.anInt473 = 0;
         this.anInt472 = Client.anInt1050 - 1;
         if (var8 && this.aClass15_2.anInt153 != -1) {
            this.anInt473 = (int)(Math.random() * (double)this.aClass15_2.anInt152);
            this.anInt472 -= (int)(Math.random() * (double)this.aClass15_2.method97(this.anInt473));
         }
      }

      LocType var11 = LocType.method523(this.anInt466);
      this.anInt469 = var11.anInt699;
      this.anInt470 = var11.anInt701;
      this.anIntArray154 = var11.anIntArray192;
   }

   protected Model method537(byte var1) {
      if (var1 != 3) {
         this.aBoolean122 = !this.aBoolean122;
      }

      int var2 = -1;
      if (this.aClass15_2 != null) {
         int var3 = Client.anInt1050 - this.anInt472;
         if (var3 > 100 && this.aClass15_2.anInt153 > 0) {
            var3 = 100;
         }

         label50: {
            do {
               do {
                  if (var3 <= this.aClass15_2.method97(this.anInt473)) {
                     break label50;
                  }

                  var3 -= this.aClass15_2.method97(this.anInt473);
                  ++this.anInt473;
               } while(this.anInt473 < this.aClass15_2.anInt152);

               this.anInt473 -= this.aClass15_2.anInt153;
            } while(this.anInt473 >= 0 && this.anInt473 < this.aClass15_2.anInt152);

            this.aClass15_2 = null;
         }

         this.anInt472 = Client.anInt1050 - var3;
         if (this.aClass15_2 != null) {
            var2 = this.aClass15_2.anIntArray47[this.anInt473];
         }
      }

      LocType var4;
      if (this.anIntArray154 == null) {
         var4 = LocType.method523(this.anInt466);
      } else {
         var4 = this.method358();
      }

      return var4 == null ? null : var4.method531(this.anInt467, this.anInt468, this.anInt461, this.anInt462, this.anInt463, this.anInt464, var2);
   }

   private LocType method358() {
      int var1 = -1;
      if (this.anInt469 != -1) {
         VarbitType var2 = VarbitType.aClass50Array1[this.anInt469];
         int var3 = var2.anInt800;
         int var4 = var2.anInt801;
         int var5 = var2.anInt802;
         int var6 = Client.anIntArray262[var5 - var4];
         var1 = aClient2.anIntArray244[var3] >> var4 & var6;
      } else if (this.anInt470 != -1) {
         var1 = aClient2.anIntArray244[this.anInt470];
      }

      return var1 >= 0 && var1 < this.anIntArray154.length && this.anIntArray154[var1] != -1 ? LocType.method523(this.anIntArray154[var1]) : null;
   }
}
