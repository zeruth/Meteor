public final class SpotAnimType {
   private static byte FACES = 6;
   public static LruCache modelCache = new LruCache(30);
   private static boolean aBoolean117 = true;
   public static SpotAnimType[] instances;
   private static int count;
   private int index;
   private int anim = -1;
   private int model;
   private int[] recol_s = new int[6];
   public SeqType seq;
   private int[] recol_d = new int[6];
   public int resizeh = 128;
   public int resizev = 128;
   public int orientation;
   public int ambient;
   public int contrast;

   private SpotAnimType() {
   }

   public Model getModel() {
      Model model = (Model) modelCache.get(this.index);
      if (model != null) {
         return model;
      } else {
         model = Model.createModel(this.model);
         if (model == null) {
            return null;
         } else {
            for(int var2 = 0; var2 < FACES; ++var2) {
               if (this.recol_s[0] != 0) {
                  model.recolor(this.recol_s[var2], this.recol_d[var2]);
               }
            }

            modelCache.put(model, this.index);
            return model;
         }
      }
   }

   private void decode(Packet dat) {
      while(true) {
         while(true) {
            int var4 = dat.g1();
            if (var4 == 0) {
               return;
            }

            if (var4 == 1) {
               this.model = dat.g2();
            } else if (var4 == 2) {
               this.anim = dat.g2();
               if (SeqType.instances != null) {
                  this.seq = SeqType.instances[this.anim];
               }
            } else if (var4 == 4) {
               this.resizeh = dat.g2();
            } else if (var4 == 5) {
               this.resizev = dat.g2();
            } else if (var4 == 6) {
               this.orientation = dat.g2();
            } else if (var4 == 7) {
               this.ambient = dat.g1();
            } else if (var4 == 8) {
               this.contrast = dat.g1();
            } else if (var4 >= 40 && var4 < 50) {
               this.recol_s[var4 - 40] = dat.g2();
            } else if (var4 >= 50 && var4 < 60) {
               this.recol_d[var4 - 50] = dat.g2();
            } else {
               System.out.println("Error unrecognised spotanim config code: " + var4);
            }
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("spotanim.dat", null));
      count = var1.g2();
      if (instances == null) {
         instances = new SpotAnimType[count];
      }

      for(int id = 0; id < count; ++id) {
         if (instances[id] == null) {
            instances[id] = new SpotAnimType();
         }

         instances[id].index = id;
         instances[id].decode(var1);
      }

   }
}
