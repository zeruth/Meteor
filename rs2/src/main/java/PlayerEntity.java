public final class PlayerEntity extends PathingEntity {
   public static LruCache aClass34_9 = new LruCache(260);
   public NpcType aClass38_2;
   public boolean visible = false;
   private boolean aBoolean197 = false;
   private long aLong25;
   public int anInt765 = -1;
   public int anInt770;
   private int anInt768;
   public String name;
   public int[] appearances = new int[12];
   private long aLong24 = -1L;
   public int anInt769 = -1;
   public int anInt767;
   public boolean aBoolean200 = false;
   public int[] anIntArray199 = new int[5];
   public Model aClass10_Sub1_Sub2_Sub4_2;
   private boolean aBoolean199 = true;
   public int anInt773;
   public int anInt772;
   private boolean aBoolean201 = false;
   public int anInt771;
   private int anInt778 = 932;
   public int anInt762;
   public int anInt764;
   public int anInt763;
   public int anInt766;
   public int anInt775;
   public int anInt774;
   public int anInt777;
   public int anInt776;

   private Model method544() {
      if (this.aClass38_2 != null) {
         int var1 = -1;
         if (super.anInt753 >= 0 && super.anInt756 == 0) {
            var1 = SeqType.instances[super.anInt753].anIntArray47[super.anInt754];
         } else if (super.anInt719 >= 0) {
            var1 = SeqType.instances[super.anInt719].anIntArray47[super.anInt720];
         }

         return this.aClass38_2.method405(var1, -1, (int[])null);
      } else {
         long var13 = this.aLong25;
         int var3 = -1;
         int var4 = -1;
         int var5 = -1;
         int var6 = -1;
         if (super.anInt753 >= 0 && super.anInt756 == 0) {
            SeqType var7 = SeqType.instances[super.anInt753];
            var3 = var7.anIntArray47[super.anInt754];
            if (super.anInt719 >= 0 && super.anInt719 != super.anInt760) {
               var4 = SeqType.instances[super.anInt719].anIntArray47[super.anInt720];
            }

            if (var7.anInt155 >= 0) {
               var5 = var7.anInt155;
               var13 += (long)(var5 - this.appearances[5] << 8);
            }

            if (var7.anInt156 >= 0) {
               var6 = var7.anInt156;
               var13 += (long)(var6 - this.appearances[3] << 16);
            }
         } else if (super.anInt719 >= 0) {
            var3 = SeqType.instances[super.anInt719].anIntArray47[super.anInt720];
         }

         Model var16 = (Model)aClass34_9.get(var13);
         int var8;
         int var9;
         if (var16 == null) {
            boolean var10 = false;

            for(var8 = 0; var8 < 12; ++var8) {
               var9 = this.appearances[var8];
               if (var6 >= 0 && var8 == 3) {
                  var9 = var6;
               }

               if (var5 >= 0 && var8 == 5) {
                  var9 = var5;
               }

               if (var9 >= 256 && var9 < 512 && !IdkType.instances[var9 - 256].method548(256)) {
                  var10 = true;
               }

               if (var9 >= 512 && !ObjType.get(var9 - 512).method108(this.anInt768)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (this.aLong24 != -1L) {
                  var16 = (Model)aClass34_9.get(this.aLong24);
               }

               if (var16 == null) {
                  return null;
               }
            }
         }

         if (var16 == null) {
            Model[] var15 = new Model[12];
            var8 = 0;

            int var11;
            for(var9 = 0; var9 < 12; ++var9) {
               var11 = this.appearances[var9];
               if (var6 >= 0 && var9 == 3) {
                  var11 = var6;
               }

               if (var5 >= 0 && var9 == 5) {
                  var11 = var5;
               }

               Model var12;
               if (var11 >= 256 && var11 < 512) {
                  var12 = IdkType.instances[var11 - 256].getModel();
                  if (var12 != null) {
                     var15[var8++] = var12;
                  }
               }

               if (var11 >= 512) {
                  var12 = ObjType.get(var11 - 512).method105(this.anInt768);
                  if (var12 != null) {
                     var15[var8++] = var12;
                  }
               }
            }

            var16 = new Model(var8, var15);

            for(var11 = 0; var11 < 5; ++var11) {
               if (this.anIntArray199[var11] != 0) {
                  var16.recolor(Client.anIntArrayArray24[var11][0], Client.anIntArrayArray24[var11][this.anIntArray199[var11]]);
                  if (var11 == 1) {
                     var16.recolor(Client.anIntArray266[0], Client.anIntArray266[this.anIntArray199[var11]]);
                  }
               }
            }

            var16.method278();
            var16.method288(64, 850, -30, -50, -30, true);
            aClass34_9.put(var16, var13);
            this.aLong24 = var13;
         }

         if (this.aBoolean200) {
            return var16;
         } else {
            Model var17 = Model.aClass10_Sub1_Sub2_Sub4_1;
            var17.method273(Class22.method169(this.aBoolean199, var3) & Class22.method169(this.aBoolean199, var4), var16);
            if (var3 != -1 && var4 != -1) {
               var17.method280(var4, var3, SeqType.instances[super.anInt753].anIntArray50);
            } else if (var3 != -1) {
               var17.method279(var3, (byte)6);
            }

            var17.method275(this.anInt778);
            var17.anIntArrayArray11 = null;
            var17.anIntArrayArray10 = null;
            return var17;
         }
      }
   }

   protected Model method537(byte var1) {
      if (!this.visible) {
         return null;
      } else {
         Model var2 = this.method544();
         if (var2 == null) {
            return null;
         } else {
            super.height = var2.anInt713;
            var2.aBoolean106 = true;
            if (this.aBoolean200) {
               return var2;
            } else {
               if (super.anInt743 != -1 && super.anInt744 != -1) {
                  SpotAnimType var3 = SpotAnimType.instances[super.anInt743];
                  Model var4 = var3.getModel();
                  if (var4 != null) {
                     Model var5 = new Model(false, false, true, var4, Class22.method169(this.aBoolean199, super.anInt744));
                     var5.method284(0, 0, -super.anInt747);
                     var5.method278();
                     var5.method279(var3.seq.anIntArray47[super.anInt744], (byte)6);
                     var5.anIntArrayArray11 = null;
                     var5.anIntArrayArray10 = null;
                     if (var3.resizeh != 128 || var3.resizev != 128) {
                        var5.method287(var3.resizev, var3.resizeh, var3.resizeh);
                     }

                     var5.method288(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
                     Model[] var6 = new Model[]{var2, var5};
                     var2 = new Model(2, true, 0, var6);
                  }
               }

               if (this.aClass10_Sub1_Sub2_Sub4_2 != null) {
                  if (Client.anInt1050 >= this.anInt772) {
                     this.aClass10_Sub1_Sub2_Sub4_2 = null;
                  }

                  if (Client.anInt1050 >= this.anInt771 && Client.anInt1050 < this.anInt772) {
                     Model var8 = this.aClass10_Sub1_Sub2_Sub4_2;
                     var8.method284(this.anInt762 - super.x, this.anInt764 - super.z, this.anInt763 - this.anInt766);
                     if (super.anInt717 == 512) {
                        var8.method282();
                        var8.method282();
                        var8.method282();
                     } else if (super.anInt717 == 1024) {
                        var8.method282();
                        var8.method282();
                     } else if (super.anInt717 == 1536) {
                        var8.method282();
                     }

                     Model[] var9 = new Model[]{var2, var8};
                     var2 = new Model(2, true, 0, var9);
                     if (super.anInt717 == 512) {
                        var8.method282();
                     } else if (super.anInt717 == 1024) {
                        var8.method282();
                        var8.method282();
                     } else if (super.anInt717 == 1536) {
                        var8.method282();
                        var8.method282();
                        var8.method282();
                     }

                     var8.method284(super.x - this.anInt762, super.z - this.anInt764, this.anInt766 - this.anInt763);
                  }
               }

               var2.aBoolean106 = true;
               if (var1 == 3) {
                  boolean var7 = false;
               } else {
                  this.aBoolean201 = !this.aBoolean201;
               }

               return var2;
            }
         }
      }
   }

   public boolean isVisible() {
      return this.visible;
   }

   public Model getHeadModel() {
      if (!this.visible) {
         return null;
      } else if (this.aClass38_2 == null) {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.appearances[var2];
            if (var3 >= 256 && var3 < 512 && !IdkType.instances[var3 - 256].method550()) {
               var1 = true;
            }

            if (var3 >= 512 && !ObjType.get(var3 - 512).method103(this.anInt768)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            Model[] var7 = new Model[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.appearances[var4];
               Model var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = IdkType.instances[var5 - 256].getHeadModel();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = ObjType.get(var5 - 512).method111(this.anInt768);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            Model var8 = new Model(var3, var7);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.anIntArray199[var5] != 0) {
                  var8.recolor(Client.anIntArrayArray24[var5][0], Client.anIntArrayArray24[var5][this.anIntArray199[var5]]);
                  if (var5 == 1) {
                     var8.recolor(Client.anIntArray266[0], Client.anIntArray266[this.anIntArray199[var5]]);
                  }
               }
            }

            return var8;
         }
      } else {
         return this.aClass38_2.method402();
      }
   }

   public void method545(Packet var1) {
      var1.pos = 0;
      this.anInt768 = var1.g1();
      this.anInt769 = var1.g1b();
      this.anInt765 = var1.g1b();
      this.aClass38_2 = null;
      this.anInt773 = 0;

      int var2;
      int var3;
      int var4;
      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         var2 = var1.g1();
         if (var2 == 0) {
            this.appearances[var5] = 0;
         } else {
            var3 = var1.g1();
            this.appearances[var5] = (var2 << 8) + var3;
            if (var5 == 0 && this.appearances[0] == 65535) {
               this.aClass38_2 = NpcType.method407(var1.g2());
               break;
            }

            if (this.appearances[var5] >= 512 && this.appearances[var5] - 512 < ObjType.anInt179) {
               var4 = ObjType.get(this.appearances[var5] - 512).team;
               if (var4 != 0) {
                  this.anInt773 = var4;
               }
            }
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var3 = var1.g1();
         if (var3 < 0 || var3 >= Client.anIntArrayArray24[var2].length) {
            var3 = 0;
         }

         this.anIntArray199[var2] = var3;
      }

      super.anInt760 = var1.g2();
      if (super.anInt760 == 65535) {
         super.anInt760 = -1;
      }

      super.anInt761 = var1.g2();
      if (super.anInt761 == 65535) {
         super.anInt761 = -1;
      }

      super.anInt748 = var1.g2();
      if (super.anInt748 == 65535) {
         super.anInt748 = -1;
      }

      super.anInt749 = var1.g2();
      if (super.anInt749 == 65535) {
         super.anInt749 = -1;
      }

      super.anInt750 = var1.g2();
      if (super.anInt750 == 65535) {
         super.anInt750 = -1;
      }

      super.anInt751 = var1.g2();
      if (super.anInt751 == 65535) {
         super.anInt751 = -1;
      }

      super.anInt758 = var1.g2();
      if (super.anInt758 == 65535) {
         super.anInt758 = -1;
      }

      this.name = Class26.method252(Class26.method249(var1.g8()), (byte)7);
      this.anInt767 = var1.g1();
      this.anInt770 = var1.g2();
      this.visible = true;
      this.aLong25 = 0L;
      var3 = this.appearances[5];
      var4 = this.appearances[9];
      this.appearances[5] = var4;
      this.appearances[9] = var3;

      for(var5 = 0; var5 < 12; ++var5) {
         this.aLong25 <<= 4;
         if (this.appearances[var5] >= 256) {
            this.aLong25 += (long)(this.appearances[var5] - 256);
         }
      }

      if (this.appearances[0] >= 256) {
         this.aLong25 += (long)(this.appearances[0] - 256 >> 4);
      }

      if (this.appearances[1] >= 256) {
         this.aLong25 += (long)(this.appearances[1] - 256 >> 8);
      }

      this.appearances[5] = var3;
      this.appearances[9] = var4;

      for(var5 = 0; var5 < 5; ++var5) {
         this.aLong25 <<= 3;
         this.aLong25 += (long)this.anIntArray199[var5];
      }

      this.aLong25 <<= 1;
      this.aLong25 += (long)this.anInt768;
   }
}
