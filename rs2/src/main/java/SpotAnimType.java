public final class SpotAnimType {
   private static byte aByte26 = 6;
   public static LruCache aClass34_5 = new LruCache(30);
   private static boolean aBoolean117 = true;
   public static SpotAnimType[] aClass28Array1;
   private static int anInt434;
   private int anInt433 = -214;
   private int anInt435;
   private int anInt437 = -1;
   private int anInt436;
   private int[] anIntArray152 = new int[6];
   public SeqType aClass15_1;
   private int[] anIntArray153 = new int[6];
   public int anInt438 = 128;
   public int anInt439 = 128;
   public int anInt440;
   public int anInt441;
   public int anInt442;

   private SpotAnimType() {
   }

   public Model method352() {
      Model var1 = (Model)aClass34_5.get((long)this.anInt435);
      if (var1 != null) {
         return var1;
      } else {
         var1 = Model.createModel(this.anInt436);
         if (var1 == null) {
            return null;
         } else {
            for(int var2 = 0; var2 < 6; ++var2) {
               if (this.anIntArray152[0] != 0) {
                  var1.recolor(this.anIntArray152[var2], this.anIntArray153[var2]);
               }
            }

            aClass34_5.put(var1, (long)this.anInt435);
            return var1;
         }
      }
   }

   private void method351(byte var1, Packet var2) {
      if (var1 == 6) {
         boolean var3 = false;
      } else {
         this.anInt433 = 458;
      }

      while(true) {
         while(true) {
            int var4 = var2.g1();
            if (var4 == 0) {
               return;
            }

            if (var4 == 1) {
               this.anInt436 = var2.g2();
            } else if (var4 == 2) {
               this.anInt437 = var2.g2();
               if (SeqType.aClass15Array1 != null) {
                  this.aClass15_1 = SeqType.aClass15Array1[this.anInt437];
               }
            } else if (var4 == 4) {
               this.anInt438 = var2.g2();
            } else if (var4 == 5) {
               this.anInt439 = var2.g2();
            } else if (var4 == 6) {
               this.anInt440 = var2.g2();
            } else if (var4 == 7) {
               this.anInt441 = var2.g1();
            } else if (var4 == 8) {
               this.anInt442 = var2.g1();
            } else if (var4 >= 40 && var4 < 50) {
               this.anIntArray152[var4 - 40] = var2.g2();
            } else if (var4 >= 50 && var4 < 60) {
               this.anIntArray153[var4 - 50] = var2.g2();
            } else {
               System.out.println("Error unrecognised spotanim config code: " + var4);
            }
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("spotanim.dat", (byte[])null));
      anInt434 = var1.g2();
      if (aClass28Array1 == null) {
         aClass28Array1 = new SpotAnimType[anInt434];
      }

      for(int var2 = 0; var2 < anInt434; ++var2) {
         if (aClass28Array1[var2] == null) {
            aClass28Array1[var2] = new SpotAnimType();
         }

         aClass28Array1[var2].anInt435 = var2;
         aClass28Array1[var2].method351(aByte26, var1);
      }

   }
}
