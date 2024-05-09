public final class Class42 {
   private int anInt611;
   public int[] anIntArray172;
   public int[][] anIntArrayArray15;

   public Class42(Packet var1, int var2) {
      this.anInt611 = var1.g1();
      this.anIntArray172 = new int[this.anInt611];
      this.anIntArrayArray15 = new int[this.anInt611][];

      int var3;
      for(var3 = 0; var3 < this.anInt611; ++var3) {
         this.anIntArray172[var3] = var1.g1();
      }

      for(var3 = 0; var3 < this.anInt611; ++var3) {
         int var4 = var1.g1();
         this.anIntArrayArray15[var3] = new int[var4];

         for(int var5 = 0; var5 < var4; ++var5) {
            this.anIntArrayArray15[var3][var5] = var1.g1();
         }
      }

   }
}
