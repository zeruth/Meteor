public final class VarbitType {
   public static VarbitType[] aClass50Array1;
   private static int anInt799;
   private boolean aBoolean209 = false;
   private int anInt803 = -1;
   private boolean aBoolean210 = true;
   public int anInt800;
   public int anInt801;
   private String aString16;
   public int anInt802;
   private int anInt804;

   private VarbitType() {
   }

   private void method575(int var1, Packet var2) {
      while(true) {
         int var3 = var2.g1();
         if (var3 == 0) {
            return;
         }

         if (var3 == 1) {
            this.anInt800 = var2.g2();
            this.anInt801 = var2.g1();
            this.anInt802 = var2.g1();
         } else if (var3 == 10) {
            this.aString16 = var2.gjstr();
         } else if (var3 == 2) {
            this.aBoolean209 = true;
         } else if (var3 == 3) {
            this.anInt803 = var2.g4();
         } else if (var3 == 4) {
            this.anInt804 = var2.g4();
         } else if (var3 == 5) {
            this.aBoolean210 = false;
         } else {
            System.out.println("Error unrecognised config code: " + var3);
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("varbit.dat", (byte[])null));
      anInt799 = var1.g2();
      if (aClass50Array1 == null) {
         aClass50Array1 = new VarbitType[anInt799];
      }

      for(int var2 = 0; var2 < anInt799; ++var2) {
         if (aClass50Array1[var2] == null) {
            aClass50Array1[var2] = new VarbitType();
         }

         aClass50Array1[var2].method575(var2, var1);
         if (aClass50Array1[var2].aBoolean209) {
            VarpType.aClass44Array1[aClass50Array1[var2].anInt800].aBoolean150 = true;
         }
      }

      if (var1.pos != var1.data.length) {
         System.out.println("varbit load mismatch");
      }

   }
}
