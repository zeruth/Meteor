public class Linkable {
   public Linkable prev;
   public Linkable next;
   public long key;

   public final void unlink() {
      if (this.prev != null) {
         this.prev.next = this.next;
         this.next.prev = this.prev;
         this.next = null;
         this.prev = null;
      }

   }
}
