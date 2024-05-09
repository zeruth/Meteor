public final class IdkType {
   public static int count;
   public static IdkType[] instances;
   private int[] models;
   private int[] heads = new int[]{-1, -1, -1, -1, -1};
   public int type = -1;
   private int[] recol_s = new int[6];
   private int[] recol_d = new int[6];
   public boolean disable = false;

   private IdkType() {
   }

   public boolean method550() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.heads[var2] != -1 && !Model.method272(this.heads[var2])) {
            var1 = false;
         }
      }

      return var1;
   }

   public Model getHeadModel() {
      Model[] var1 = new Model[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.heads[var3] != -1) {
            var1[var2++] = Model.createModel(this.heads[var3]);
         }
      }

      Model var5 = new Model(var2, var1);

      for(int var4 = 0; var4 < 6 && this.recol_s[var4] != 0; ++var4) {
         var5.recolor(this.recol_s[var4], this.recol_d[var4]);
      }

      return var5;
   }

   private void decode(Packet var1) {
      while(true) {
         int var2 = var1.g1();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.type = var1.g1();
         } else if (var2 == 2) {
            int var3 = var1.g1();
            this.models = new int[var3];

            for(int var4 = 0; var4 < var3; ++var4) {
               this.models[var4] = var1.g2();
            }
         } else if (var2 == 3) {
            this.disable = true;
         } else if (var2 >= 40 && var2 < 50) {
            this.recol_s[var2 - 40] = var1.g2();
         } else if (var2 >= 50 && var2 < 60) {
            this.recol_d[var2 - 50] = var1.g2();
         } else if (var2 >= 60 && var2 < 70) {
            this.heads[var2 - 60] = var1.g2();
         } else {
            System.out.println("Error unrecognised config code: " + var2);
         }
      }
   }

   public boolean method548(int var1) {
      if (this.models == null) {
         return true;
      } else {
         boolean var2 = true;
         boolean var3 = false;

         for(int var4 = 0; var4 < this.models.length; ++var4) {
            if (!Model.method272(this.models[var4])) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public Model getModel() {
      if (this.models == null) {
         return null;
      } else {
         Model[] var1 = new Model[this.models.length];

         for(int var2 = 0; var2 < this.models.length; ++var2) {
            var1[var2] = Model.createModel(this.models[var2]);
         }

         Model var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new Model(var1.length, var1);
         }

         for(int var3 = 0; var3 < 6 && this.recol_s[var3] != 0; ++var3) {
            var4.recolor(this.recol_s[var3], this.recol_d[var3]);
         }

         return var4;
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("idk.dat", (byte[])null));
      count = var1.g2();
      if (instances == null) {
         instances = new IdkType[count];
      }

      for(int var2 = 0; var2 < count; ++var2) {
         if (instances[var2] == null) {
            instances[var2] = new IdkType();
         }

         instances[var2].decode(var1);
      }

   }
}
