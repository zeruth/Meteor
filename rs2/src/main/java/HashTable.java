public final class HashTable {
   private Linkable[] aClass10Array1;
   private boolean aBoolean72 = true;
   private int anInt231;
   private boolean aBoolean73 = true;

   public HashTable(int var1) {
      this.anInt231 = var1;
      this.aClass10Array1 = new Linkable[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Linkable var3 = this.aClass10Array1[var2] = new Linkable();
         var3.next = var3;
         var3.prev = var3;
      }

   }

   public Linkable get(long var1) {
      Linkable var3 = this.aClass10Array1[(int)(var1 & (long)(this.anInt231 - 1))];

      for(Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
         if (var4.key == var1) {
            return var4;
         }
      }

      return null;
   }

   public void method164(Linkable var1, long var2) {
      if (var1.prev != null) {
         var1.unlink();
      }

      Linkable var4 = this.aClass10Array1[(int)(var2 & (long)(this.anInt231 - 1))];
      var1.prev = var4.prev;
      var1.next = var4;
      var1.prev.next = var1;
      var1.next.prev = var1;
      var1.key = var2;
   }
}
