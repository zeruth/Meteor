public final class VarpType {
   public static VarpType[] aClass44Array1;
   private static int[] anIntArray173;
   private static int anInt614;
   private static int anInt613;
   private boolean aBoolean147 = false;
   private boolean aBoolean148 = true;
   private boolean aBoolean149 = false;
   private int anInt615;
   public int anInt617;
   private int anInt616;
   public boolean aBoolean150 = false;
   private int anInt620 = -1;
   private boolean aBoolean151 = true;
   private int anInt619;
   private int anInt618;
   private String aString11;

   private VarpType() {
   }

   private void method415(int var1, Packet var2) {
      while(true) {
         int var3 = var2.g1();
         if (var3 == 0) {
            return;
         }

         if (var3 == 1) {
            this.anInt615 = var2.g1();
         } else if (var3 == 2) {
            this.anInt616 = var2.g1();
         } else if (var3 == 3) {
            this.aBoolean147 = true;
            anIntArray173[anInt614++] = var1;
         } else if (var3 == 4) {
            this.aBoolean148 = false;
         } else if (var3 == 5) {
            this.anInt617 = var2.g2();
         } else if (var3 == 6) {
            this.aBoolean149 = true;
         } else if (var3 == 7) {
            this.anInt618 = var2.g4();
         } else if (var3 == 8) {
            this.anInt619 = 1;
            this.aBoolean150 = true;
         } else if (var3 == 10) {
            this.aString11 = var2.gjstr();
         } else if (var3 == 11) {
            this.aBoolean150 = true;
         } else if (var3 == 12) {
            this.anInt620 = var2.g4();
         } else if (var3 == 13) {
            this.anInt619 = 2;
            this.aBoolean150 = true;
         } else if (var3 == 14) {
            this.aBoolean151 = false;
         } else {
            System.out.println("Error unrecognised config code: " + var3);
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("varp.dat", (byte[])null));
      anInt614 = 0;
      anInt613 = var1.g2();
      if (aClass44Array1 == null) {
         aClass44Array1 = new VarpType[anInt613];
      }

      if (anIntArray173 == null) {
         anIntArray173 = new int[anInt613];
      }

      for(int var2 = 0; var2 < anInt613; ++var2) {
         if (aClass44Array1[var2] == null) {
            aClass44Array1[var2] = new VarpType();
         }

         aClass44Array1[var2].method415(var2, var1);
      }

      if (var1.pos != var1.data.length) {
         System.out.println("varptype load mismatch");
      }

   }
}
