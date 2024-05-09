public final class Stack {
   private Hashable aClass10_Sub1_2;
   private Hashable aClass10_Sub1_1 = new Hashable();
   private boolean aBoolean16 = true;

   public Stack() {
      this.aClass10_Sub1_1.nextHashable = this.aClass10_Sub1_1;
      this.aClass10_Sub1_1.prevHashable = this.aClass10_Sub1_1;
   }

   public Hashable pop() {
      Hashable var1 = this.aClass10_Sub1_1.nextHashable;
      if (var1 == this.aClass10_Sub1_1) {
         return null;
      } else {
         var1.uncache();
         return var1;
      }
   }

   public int method37() {
      int var1 = 0;

      for(Hashable var2 = this.aClass10_Sub1_1.nextHashable; var2 != this.aClass10_Sub1_1; var2 = var2.nextHashable) {
         ++var1;
      }

      return var1;
   }

   public void method33(Hashable var1) {
      if (var1.prevHashable != null) {
         var1.uncache();
      }

      var1.prevHashable = this.aClass10_Sub1_1.prevHashable;
      var1.nextHashable = this.aClass10_Sub1_1;
      var1.prevHashable.nextHashable = var1;
      var1.nextHashable.prevHashable = var1;
   }

   public Hashable method35() {
      Hashable var1 = this.aClass10_Sub1_1.nextHashable;
      if (var1 == this.aClass10_Sub1_1) {
         this.aClass10_Sub1_2 = null;
         return null;
      } else {
         this.aClass10_Sub1_2 = var1.nextHashable;
         return var1;
      }
   }

   public Hashable method36() {
      Hashable var1 = this.aClass10_Sub1_2;
      if (var1 == this.aClass10_Sub1_1) {
         this.aClass10_Sub1_2 = null;
         return null;
      } else {
         this.aClass10_Sub1_2 = var1.nextHashable;
         return var1;
      }
   }
}
