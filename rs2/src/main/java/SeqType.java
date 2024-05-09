public final class SeqType {
   private static byte aByte10 = 6;
   public static SeqType[] aClass15Array1;
   private static int anInt151;
   private int[] anIntArray49;
   private boolean aBoolean44 = false;
   public int[] anIntArray47;
   public int anInt153 = -1;
   public int anInt152;
   public boolean aBoolean45 = false;
   public int anInt159 = -1;
   public int anInt158 = -1;
   public int anInt154 = 5;
   public int[] anIntArray50;
   public int anInt155 = -1;
   public int anInt156 = -1;
   public int anInt160 = 2;
   public int[] anIntArray48;
   public int anInt157 = 99;
   private int anInt161;

   private SeqType() {
   }

   public int method97(int var1) {
      int var2 = this.anIntArray49[var1];
      if (var2 == 0) {
         Class22 var3 = Class22.method168(this.anIntArray47[var1]);
         if (var3 != null) {
            var2 = this.anIntArray49[var1] = var3.anInt238;
         }
      }

      if (var2 == 0) {
         var2 = 1;
      }

      return var2;
   }

   private void method98(byte var1, Packet var2) {
      if (var1 == 6) {
         boolean var3 = false;
      } else {
         this.aBoolean44 = !this.aBoolean44;
      }

      while(true) {
         while(true) {
            int var6 = var2.g1();
            if (var6 == 0) {
               if (this.anInt152 == 0) {
                  this.anInt152 = 1;
                  this.anIntArray47 = new int[1];
                  this.anIntArray47[0] = -1;
                  this.anIntArray48 = new int[1];
                  this.anIntArray48[0] = -1;
                  this.anIntArray49 = new int[1];
                  this.anIntArray49[0] = -1;
               }

               if (this.anInt158 == -1) {
                  if (this.anIntArray50 == null) {
                     this.anInt158 = 0;
                  } else {
                     this.anInt158 = 2;
                  }
               }

               if (this.anInt159 == -1) {
                  if (this.anIntArray50 != null) {
                     this.anInt159 = 2;
                     return;
                  }

                  this.anInt159 = 0;
                  return;
               }

               return;
            }

            int var4;
            if (var6 == 1) {
               this.anInt152 = var2.g1();
               this.anIntArray47 = new int[this.anInt152];
               this.anIntArray48 = new int[this.anInt152];
               this.anIntArray49 = new int[this.anInt152];

               for(var4 = 0; var4 < this.anInt152; ++var4) {
                  this.anIntArray47[var4] = var2.g2();
                  this.anIntArray48[var4] = var2.g2();
                  if (this.anIntArray48[var4] == 65535) {
                     this.anIntArray48[var4] = -1;
                  }

                  this.anIntArray49[var4] = var2.g2();
               }
            } else if (var6 == 2) {
               this.anInt153 = var2.g2();
            } else if (var6 != 3) {
               if (var6 == 4) {
                  this.aBoolean45 = true;
               } else if (var6 == 5) {
                  this.anInt154 = var2.g1();
               } else if (var6 == 6) {
                  this.anInt155 = var2.g2();
               } else if (var6 == 7) {
                  this.anInt156 = var2.g2();
               } else if (var6 == 8) {
                  this.anInt157 = var2.g1();
               } else if (var6 == 9) {
                  this.anInt158 = var2.g1();
               } else if (var6 == 10) {
                  this.anInt159 = var2.g1();
               } else if (var6 == 11) {
                  this.anInt160 = var2.g1();
               } else if (var6 == 12) {
                  this.anInt161 = var2.g4();
               } else {
                  System.out.println("Error unrecognised seq config code: " + var6);
               }
            } else {
               var4 = var2.g1();
               this.anIntArray50 = new int[var4 + 1];

               for(int var5 = 0; var5 < var4; ++var5) {
                  this.anIntArray50[var5] = var2.g1();
               }

               this.anIntArray50[var4] = 9999999;
            }
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("seq.dat", (byte[])null));
      anInt151 = var1.g2();
      if (aClass15Array1 == null) {
         aClass15Array1 = new SeqType[anInt151];
      }

      for(int var2 = 0; var2 < anInt151; ++var2) {
         if (aClass15Array1[var2] == null) {
            aClass15Array1[var2] = new SeqType();
         }

         aClass15Array1[var2].method98(aByte10, var1);
      }

   }
}
