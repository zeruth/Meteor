public final class NpcEntity extends PathingEntity {
   public NpcType type;
   private boolean aBoolean131 = true;

   private Model method386() {
      int var1;
      if (super.anInt753 >= 0 && super.anInt756 == 0) {
         var1 = SeqType.aClass15Array1[super.anInt753].anIntArray47[super.anInt754];
         int var2 = -1;
         if (super.anInt719 >= 0 && super.anInt719 != super.anInt760) {
            var2 = SeqType.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
         }

         return this.type.method405(var1, var2, SeqType.aClass15Array1[super.anInt753].anIntArray50);
      } else {
         var1 = -1;
         if (super.anInt719 >= 0) {
            var1 = SeqType.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
         }

         return this.type.method405(var1, -1, (int[])null);
      }
   }

   protected Model method537(byte var1) {
      if (var1 != 3) {
         throw new NullPointerException();
      } else {
         boolean var2 = false;
         if (this.type == null) {
            return null;
         } else {
            Model var3 = this.method386();
            if (var3 == null) {
               return null;
            } else {
               super.height = var3.anInt713;
               if (super.anInt743 != -1 && super.anInt744 != -1) {
                  SpotAnimType var4 = SpotAnimType.aClass28Array1[super.anInt743];
                  Model var5 = var4.method352();
                  if (var5 != null) {
                     int var6 = var4.aClass15_1.anIntArray47[super.anInt744];
                     Model var7 = new Model(false, false, true, var5, Class22.method169(this.aBoolean131, var6));
                     var7.method284(0, 0, -super.anInt747);
                     var7.method278();
                     var7.method279(var6, (byte)6);
                     var7.anIntArrayArray11 = null;
                     var7.anIntArrayArray10 = null;
                     if (var4.anInt438 != 128 || var4.anInt439 != 128) {
                        var7.method287(var4.anInt439, var4.anInt438, var4.anInt438);
                     }

                     var7.method288(var4.anInt441 + 64, var4.anInt442 + 850, -30, -50, -30, true);
                     Model[] var8 = new Model[]{var3, var7};
                     var3 = new Model(2, true, 0, var8);
                  }
               }

               if (this.type.aByte31 == 1) {
                  var3.aBoolean106 = true;
               }

               return var3;
            }
         }
      }
   }

   public boolean isVisible() {
      return this.type != null;
   }
}
