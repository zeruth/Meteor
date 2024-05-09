public final class LruCache {
   private HashTable hashtable;
   private int available;
   private Stack history = new Stack();
   private Hashable selectedNode = new Hashable();
   private int capacity;

   public LruCache(int var1) {
      this.capacity = var1;
      this.available = var1;
      this.hashtable = new HashTable(1024);
   }

   public void clear() {
      while(true) {
         Hashable var1 = this.history.pop();
         if (var1 == null) {
            this.available = this.capacity;
            return;
         }

         var1.unlink();
         var1.uncache();
      }
   }

   public Hashable get(long var1) {
      Hashable var3 = (Hashable)this.hashtable.get(var1);
      if (var3 != null) {
         this.history.method33(var3);
      }

      return var3;
   }

   public void put(Hashable var1, long var2) {
      if (this.available == 0) {
         Hashable var4 = this.history.pop();
         var4.unlink();
         var4.uncache();
         if (var4 == this.selectedNode) {
            var4 = this.history.pop();
            var4.unlink();
            var4.uncache();
         }
      } else {
         --this.available;
      }

      this.hashtable.method164(var1, var2);
      this.history.method33(var1);
   }
}
