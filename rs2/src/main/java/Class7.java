public final class Class7 implements Runnable {
   public boolean aBoolean12 = true;
   public Object anObject1 = new Object();
   public int[] anIntArray11 = new int[500];
   public int anInt54;
   public int[] anIntArray12 = new int[500];
   private int anInt53 = 8;
   private Client aClient1;

   public Class7(Client var1, byte var2) {
      this.aClient1 = var1;
   }

   public void run() {
      while(this.aBoolean12) {
         Object var1 = this.anObject1;
         synchronized(this.anObject1) {
            if (this.anInt54 < 500) {
               this.anIntArray12[this.anInt54] = this.aClient1.mouseX;
               this.anIntArray11[this.anInt54] = this.aClient1.mouseY;
               ++this.anInt54;
            }
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var4) {
         }
      }

   }
}
