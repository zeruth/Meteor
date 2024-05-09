public final class Class6 {
   private Linkable aClass10_2;
   private Linkable aClass10_1 = new Linkable();
   private int anInt51 = -48545;

   public Class6(boolean var1) {
      this.aClass10_1.next = this.aClass10_1;
      this.aClass10_1.prev = this.aClass10_1;
   }

   public Linkable method6() {
      Linkable var1 = this.aClass10_1.next;
      if (var1 == this.aClass10_1) {
         this.aClass10_2 = null;
         return null;
      } else {
         this.aClass10_2 = var1.next;
         return var1;
      }
   }

   public void method3(Linkable var1) {
      if (var1.prev != null) {
         var1.unlink();
      }

      var1.prev = this.aClass10_1.prev;
      var1.next = this.aClass10_1;
      var1.prev.next = var1;
      var1.next.prev = var1;
   }

   public void clear() {
      if (this.aClass10_1.next != this.aClass10_1) {
         while(true) {
            Linkable var1 = this.aClass10_1.next;
            if (var1 == this.aClass10_1) {
               return;
            }

            var1.unlink();
         }
      }
   }

   public Linkable method5() {
      Linkable var1 = this.aClass10_1.next;
      if (var1 == this.aClass10_1) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   public Linkable method8() {
      Linkable var1 = this.aClass10_2;
      if (var1 == this.aClass10_1) {
         this.aClass10_2 = null;
         return null;
      } else {
         this.aClass10_2 = var1.next;
         return var1;
      }
   }

   public void method4(Linkable var1) {
      if (var1.prev != null) {
         var1.unlink();
      }

      var1.prev = this.aClass10_1;
      var1.next = this.aClass10_1.next;
      var1.prev.next = var1;
      var1.next.prev = var1;
   }

   public Linkable method7() {
      Linkable var1 = this.aClass10_1.prev;
      if (var1 == this.aClass10_1) {
         this.aClass10_2 = null;
         return null;
      } else {
         this.aClass10_2 = var1.prev;
         return var1;
      }
   }

   public Linkable method9() {
      Linkable var1 = this.aClass10_2;
      if (var1 == this.aClass10_1) {
         this.aClass10_2 = null;
         return null;
      } else {
         this.aClass10_2 = var1.prev;
         return var1;
      }
   }
}
