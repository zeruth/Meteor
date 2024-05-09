public abstract class PathingEntity extends Entity {
   public boolean aBoolean196 = false;
   public int anInt729 = 32;
   public int anInt760 = -1;
   public int anInt736;
   public int anInt735;
   public int anInt753 = -1;
   public int x;
   public int anInt759;
   public int[] anIntArray193 = new int[10];
   public int[] anIntArray197 = new int[4];
   public int anInt719 = -1;
   public int z;
   private int anInt714 = -89;
   public int anInt742;
   public int anInt738 = -1;
   public int anInt756;
   public int[] anIntArray194 = new int[10];
   public int anInt731;
   public int[] anIntArray195 = new int[4];
   public int anInt715 = 100;
   public int anInt743 = -1;
   public String aString13;
   public int anInt730 = 1;
   public int anInt752;
   public int anInt733;
   public int[] anIntArray196 = new int[4];
   public int height = 200;
   public int anInt721;
   public int anInt746;
   public int anInt755;
   public int anInt720;
   public int anInt754;
   public int anInt744;
   public boolean[] aBooleanArray10 = new boolean[10];
   public int anInt732;
   public int anInt757;
   public int anInt745;
   public int anInt734;
   public int anInt718;
   public int anInt737;
   public int anInt724 = -1000;
   public int anInt717;
   public int anInt727;
   public int anInt728;
   public int anInt747;
   public int anInt761 = -1;
   public int anInt748 = -1;
   public int anInt749 = -1;
   public int anInt725;
   public int anInt750 = -1;
   public int anInt741;
   public int anInt751 = -1;
   public int anInt716;
   public int anInt722;
   public int anInt726;
   public int anInt758 = -1;

   public boolean isVisible() {
      return false;
   }

   public final void method540(boolean var1, int var2) {
      int var3 = this.anIntArray193[0];
      int var4 = this.anIntArray194[0];
      if (var2 == 0) {
         --var3;
         ++var4;
      }

      if (var2 == 1) {
         ++var4;
      }

      if (var2 == 2) {
         ++var3;
         ++var4;
      }

      if (var2 == 3) {
         --var3;
      }

      if (var2 == 4) {
         ++var3;
      }

      if (var2 == 5) {
         --var3;
         --var4;
      }

      if (var2 == 6) {
         --var4;
      }

      if (var2 == 7) {
         ++var3;
         --var4;
      }

      if (this.anInt753 != -1 && SeqType.aClass15Array1[this.anInt753].anInt159 == 1) {
         this.anInt753 = -1;
      }

      if (this.anInt759 < 9) {
         ++this.anInt759;
      }

      for(int var5 = this.anInt759; var5 > 0; --var5) {
         this.anIntArray193[var5] = this.anIntArray193[var5 - 1];
         this.anIntArray194[var5] = this.anIntArray194[var5 - 1];
         this.aBooleanArray10[var5] = this.aBooleanArray10[var5 - 1];
      }

      this.anIntArray193[0] = var3;
      this.anIntArray194[0] = var4;
      this.aBooleanArray10[0] = var1;
   }

   public final void method538() {
      this.anInt759 = 0;
      this.anInt742 = 0;
   }

   public final void method541(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 4; ++var4) {
         if (this.anIntArray197[var4] <= var1) {
            this.anIntArray195[var4] = var2;
            this.anIntArray196[var4] = var3;
            this.anIntArray197[var4] = var1 + 70;
            return;
         }
      }

   }

   public final void method542(int var1, byte var2, boolean var3, int var4) {
      if (this.anInt753 != -1 && SeqType.aClass15Array1[this.anInt753].anInt159 == 1) {
         this.anInt753 = -1;
      }

      if (!var3) {
         int var5 = var4 - this.anIntArray193[0];
         int var6 = var1 - this.anIntArray194[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (this.anInt759 < 9) {
               ++this.anInt759;
            }

            for(int var7 = this.anInt759; var7 > 0; --var7) {
               this.anIntArray193[var7] = this.anIntArray193[var7 - 1];
               this.anIntArray194[var7] = this.anIntArray194[var7 - 1];
               this.aBooleanArray10[var7] = this.aBooleanArray10[var7 - 1];
            }

            this.anIntArray193[0] = var4;
            this.anIntArray194[0] = var1;
            this.aBooleanArray10[0] = false;
            return;
         }
      }

      this.anInt759 = 0;
      this.anInt742 = 0;
      this.anInt752 = 0;
      this.anIntArray193[0] = var4;
      this.anIntArray194[0] = var1;
      boolean var8 = false;
      this.x = this.anIntArray193[0] * 128 + this.anInt730 * 64;
      this.z = this.anIntArray194[0] * 128 + this.anInt730 * 64;
   }
}
