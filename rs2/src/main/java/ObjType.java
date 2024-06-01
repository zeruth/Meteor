public final class ObjType {
   public static LruCache aClass34_3 = new LruCache(50);
   private static int cachePos;
   private static ObjType[] cache;
   public static boolean aBoolean49 = true;
   public static LruCache aClass34_4 = new LruCache(100);
   private static Packet dat;
   private static byte aByte13 = 6;
   private static int[] offsets;
   public static int anInt179;
   private int manwear;
   private int manhead;
   private int model;
   private int[] countobj;
   public int certtemplate;
   private int manwear2;
   private int manhead2;
   private boolean aBoolean50 = true;
   private int manwear3;
   public String name;
   private int womanhead;
   private int anInt184 = -68;
   public int index = -1;
   private int womanwear;
   private int womanhead2;
   public int code113;
   private int[] countco;
   public byte[] desc;
   private int womanwear2;
   private int womanwear3;
   private int[] recol_s;
   private boolean aBoolean53 = true;
   private int[] recol_d;
   public int code114;
   public int zoom2d;
   private int code110;
   public int xan2d;
   public int cost;
   private int code111;
   private byte manwearOffsetY;
   public boolean stackable;
   private int code112;
   public int yan2d;
   private int zan2d;
   private int xof2d;
   private int yof2d;
   private int code10;
   private byte womanwearOffsetY;
   public boolean members;
   public String[] op;
   public String[] iop;
   private int certlink;
   public int team;

   private ObjType() {
   }

   public Model method112(int var1) {
      int var2;
      if (this.countobj != null && var1 > 1) {
         int var3 = -1;

         for(var2 = 0; var2 < 10; ++var2) {
            if (var1 >= this.countco[var2] && this.countco[var2] != 0) {
               var3 = this.countobj[var2];
            }
         }

         if (var3 != -1) {
            return get(var3).method112(1);
         }
      }

      Model var4 = (Model)aClass34_3.get((long)this.index);
      if (var4 != null) {
         return var4;
      } else {
         var4 = Model.createModel(this.model);
         if (var4 == null) {
            return null;
         } else {
            if (this.code110 != 128 || this.code111 != 128 || this.code112 != 128) {
               var4.method287(this.code111, this.code112, this.code110);
            }

            if (this.recol_s != null) {
               for(var2 = 0; var2 < this.recol_s.length; ++var2) {
                  var4.recolor(this.recol_s[var2], this.recol_d[var2]);
               }
            }

            var4.method288(this.code113 + 64, this.code114 + 768, -50, -10, -50, true);
            var4.aBoolean106 = true;
            aClass34_3.put(var4, (long)this.index);
            return var4;
         }
      }
   }

   public Model method109(int var1, int var2) {
      int var3;
      if (this.countobj != null && var2 > 1) {
         int var4 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if (var2 >= this.countco[var3] && this.countco[var3] != 0) {
               var4 = this.countobj[var3];
            }
         }

         if (var4 != -1) {
            return get(var4).method109(this.anInt184, 1);
         }
      }

      Model var5;
      for(var5 = Model.createModel(this.model); var1 >= 0; this.aBoolean50 = !this.aBoolean50) {
      }

      if (var5 == null) {
         return null;
      } else {
         if (this.recol_s != null) {
            for(var3 = 0; var3 < this.recol_s.length; ++var3) {
               var5.recolor(this.recol_s[var3], this.recol_d[var3]);
            }
         }

         return var5;
      }
   }

   public boolean method103(int var1) {
      int var2 = this.manhead;
      int var3 = this.manhead2;
      if (var1 == 1) {
         var2 = this.womanhead;
         var3 = this.womanhead2;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!Model.method272(var2)) {
            var4 = false;
         }

         if (var3 != -1 && !Model.method272(var3)) {
            var4 = false;
         }

         return var4;
      }
   }

   public Model method111(int var1) {
      int var2 = this.manhead;
      int var3 = this.manhead2;
      if (var1 == 1) {
         var2 = this.womanhead;
         var3 = this.womanhead2;
      }

      if (var2 == -1) {
         return null;
      } else {
         Model var4 = Model.createModel(var2);
         if (var3 != -1) {
            Model var5 = Model.createModel(var3);
            Model[] var6 = new Model[]{var4, var5};
            var4 = new Model(2, var6);
         }

         if (this.recol_s != null) {
            for(int var7 = 0; var7 < this.recol_s.length; ++var7) {
               var4.recolor(this.recol_s[var7], this.recol_d[var7]);
            }
         }

         return var4;
      }
   }

   private void reset() {
      this.model = 0;
      this.name = null;
      this.desc = null;
      this.recol_s = null;
      this.recol_d = null;
      this.zoom2d = 2000;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.xof2d = 0;
      this.yof2d = 0;
      this.code10 = -1;
      this.stackable = false;
      this.cost = 1;
      this.members = false;
      this.op = null;
      this.iop = null;
      this.manwear = -1;
      this.manwear2 = -1;
      this.manwearOffsetY = 0;
      this.womanwear = -1;
      this.womanwear2 = -1;
      this.womanwearOffsetY = 0;
      this.manwear3 = -1;
      this.womanwear3 = -1;
      this.manhead = -1;
      this.manhead2 = -1;
      this.womanhead = -1;
      this.womanhead2 = -1;
      this.countobj = null;
      this.countco = null;
      this.certlink = -1;
      this.certtemplate = -1;
      this.code110 = 128;
      this.code111 = 128;
      this.code112 = 128;
      this.code113 = 0;
      this.code114 = 0;
      this.team = 0;
   }

   private void decode(Packet dat) {
      while(true) {
         int code = dat.g1();
         if (code == 0) {
            return;
         }

         if (code == 1) {
            this.model = dat.g2();
         } else if (code == 2) {
            this.name = dat.gjstr();
         } else if (code == 3) {
            this.desc = dat.gstrbyte();
         } else if (code == 4) {
            this.zoom2d = dat.g2();
         } else if (code == 5) {
            this.xan2d = dat.g2();
         } else if (code == 6) {
            this.yan2d = dat.g2();
         } else if (code == 7) {
            this.xof2d = dat.g2();
            if (this.xof2d > 32767) {
               this.xof2d -= 65536;
            }
         } else if (code == 8) {
            this.yof2d = dat.g2();
            if (this.yof2d > 32767) {
               this.yof2d -= 65536;
            }
         } else if (code == 10) {
            this.code10 = dat.g2();
         } else if (code == 11) {
            this.stackable = true;
         } else if (code == 12) {
            this.cost = dat.g4();
         } else if (code == 16) {
            this.members = true;
         } else if (code == 23) {
            this.manwear = dat.g2();
            this.manwearOffsetY = dat.g1b();
         } else if (code == 24) {
            this.manwear2 = dat.g2();
         } else if (code == 25) {
            this.womanwear = dat.g2();
            this.womanwearOffsetY = dat.g1b();
         } else if (code == 26) {
            this.womanwear2 = dat.g2();
         } else if (code >= 30 && code < 35) {
            if (this.op == null) {
               this.op = new String[5];
            }

            this.op[code - 30] = dat.gjstr();
            if (this.op[code - 30].equalsIgnoreCase("hidden")) {
               this.op[code - 30] = null;
            }
         } else if (code >= 35 && code < 40) {
            if (this.iop == null) {
               this.iop = new String[5];
            }

            this.iop[code - 35] = dat.gjstr();
         } else if (code == 40) {
            int var4 = dat.g1();
            this.recol_s = new int[var4];
            this.recol_d = new int[var4];

            for(int var5 = 0; var5 < var4; ++var5) {
               this.recol_s[var5] = dat.g2();
               this.recol_d[var5] = dat.g2();
            }
         } else if (code == 78) {
            this.manwear3 = dat.g2();
         } else if (code == 79) {
            this.womanwear3 = dat.g2();
         } else if (code == 90) {
            this.manhead = dat.g2();
         } else if (code == 91) {
            this.womanhead = dat.g2();
         } else if (code == 92) {
            this.manhead2 = dat.g2();
         } else if (code == 93) {
            this.womanhead2 = dat.g2();
         } else if (code == 95) {
            this.zan2d = dat.g2();
         } else if (code == 97) {
            this.certlink = dat.g2();
         } else if (code == 98) {
            this.certtemplate = dat.g2();
         } else if (code >= 100 && code < 110) {
            if (this.countobj == null) {
               this.countobj = new int[10];
               this.countco = new int[10];
            }

            this.countobj[code - 100] = dat.g2();
            this.countco[code - 100] = dat.g2();
         } else if (code == 110) {
            this.code110 = dat.g2();
         } else if (code == 111) {
            this.code111 = dat.g2();
         } else if (code == 112) {
            this.code112 = dat.g2();
         } else if (code == 113) {
            this.code113 = dat.g1b();
         } else if (code == 114) {
            this.code114 = dat.g1b() * 5;
         } else if (code == 115) {
            this.team = dat.g1();
         }
      }
   }

   private void toCertificate() {
      ObjType var1 = get(this.certtemplate);
      this.model = var1.model;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.xof2d = var1.xof2d;
      this.yof2d = var1.yof2d;
      this.recol_s = var1.recol_s;
      this.recol_d = var1.recol_d;
      ObjType var2 = get(this.certlink);
      this.name = var2.name;
      this.members = var2.members;
      this.cost = var2.cost;
      String var3 = "a";
      char var4 = var2.name.charAt(0);
      if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
         var3 = "an";
      }

      this.desc = ("Swap this note at any bank for " + var3 + " " + var2.name + ".").getBytes();
      this.stackable = true;
   }

   public boolean method108(int var1) {
      int var2 = this.manwear;
      int var3 = this.manwear2;
      int var4 = this.manwear3;
      if (var1 == 1) {
         var2 = this.womanwear;
         var3 = this.womanwear2;
         var4 = this.womanwear3;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!Model.method272(var2)) {
            var5 = false;
         }

         if (var3 != -1 && !Model.method272(var3)) {
            var5 = false;
         }

         if (var4 != -1 && !Model.method272(var4)) {
            var5 = false;
         }

         return var5;
      }
   }

   public Model method105(int var1) {
      int var2 = this.manwear;
      int var3 = this.manwear2;
      int var4 = this.manwear3;
      if (var1 == 1) {
         var2 = this.womanwear;
         var3 = this.womanwear2;
         var4 = this.womanwear3;
      }

      if (var2 == -1) {
         return null;
      } else {
         Model var5 = Model.createModel(var2);
         if (var3 != -1) {
            Model var6;
            if (var4 == -1) {
               var6 = Model.createModel(var3);
               Model[] var7 = new Model[]{var5, var6};
               var5 = new Model(2, var7);
            } else {
               var6 = Model.createModel(var3);
               Model var10 = Model.createModel(var4);
               Model[] var8 = new Model[]{var5, var6, var10};
               var5 = new Model(3, var8);
            }
         }

         if (var1 == 0 && this.manwearOffsetY != 0) {
            var5.method284(0, 0, this.manwearOffsetY);
         }

         if (var1 == 1 && this.womanwearOffsetY != 0) {
            var5.method284(0, 0, this.womanwearOffsetY);
         }

         if (this.recol_s != null) {
            for(int var9 = 0; var9 < this.recol_s.length; ++var9) {
               var5.recolor(this.recol_s[var9], this.recol_d[var9]);
            }
         }

         return var5;
      }
   }

   public static ObjType get(int index) {
      for(int i = 0; i < 10; ++i) {
         if (cache[i].index == index) {
            return cache[i];
         }
      }

      cachePos = (cachePos + 1) % 10;
      ObjType obj = cache[cachePos];
      dat.pos = offsets[index];
      obj.index = index;
      obj.reset();
      obj.decode(dat);
      if (obj.certtemplate != -1) {
         obj.toCertificate();
      }

      if (!aBoolean49 && obj.members) {
         obj.name = "Members Object";
         obj.desc = "Login to a members' server to use this object.".getBytes();
         obj.op = null;
         obj.iop = null;
         obj.team = 0;
      }

      return obj;
   }

   public static Pix24 method113(int var0, int var1, int var2) {
      Pix24 var3;
      if (var0 == 0) {
         var3 = (Pix24)aClass34_4.get((long)var2);
         if (var3 != null && var3.cropH != var1 && var3.cropH != -1) {
            var3.unlink();
            var3 = null;
         }

         if (var3 != null) {
            return var3;
         }
      }

      ObjType var4 = get(var2);
      if (var4.countobj == null) {
         var1 = -1;
      }

      if (var1 > 1) {
         int var5 = -1;

         for(int var6 = 0; var6 < 10; ++var6) {
            if (var1 >= var4.countco[var6] && var4.countco[var6] != 0) {
               var5 = var4.countobj[var6];
            }
         }

         if (var5 != -1) {
            var4 = get(var5);
         }
      }

      Model var22 = var4.method112(1);
      if (var22 == null) {
         return null;
      } else {
         Pix24 var23 = null;
         if (var4.certtemplate != -1) {
            var23 = method113(-1, 10, var4.certlink);
            if (var23 == null) {
               return null;
            }
         }

         var3 = new Pix24(32, 32);
         int var7 = Draw3D.anInt686;
         int var8 = Draw3D.anInt687;
         int[] var9 = Draw3D.lineOffset;
         int[] var10 = Draw2D.data;
         int var11 = Draw2D.width2d;
         int var12 = Draw2D.height2d;
         int var13 = Draw2D.left;
         int var14 = Draw2D.right;
         int var15 = Draw2D.top;
         int var16 = Draw2D.bottom;
         Draw3D.aBoolean179 = false;
         Draw2D.bind(32, 32, var3.pixels);
         Draw2D.fillRect(32, 0, 0, 32, 0);
         Draw3D.method507(568);
         int var17 = var4.zoom2d;
         if (var0 == -1) {
            var17 = (int)((double)var17 * 1.5);
         }

         if (var0 > 0) {
            var17 = (int)((double)var17 * 1.04);
         }

         int var18 = Draw3D.anIntArray181[var4.xan2d] * var17 >> 16;
         int var19 = Draw3D.anIntArray182[var4.xan2d] * var17 >> 16;
         var22.method292(var4.yan2d, var4.zan2d, var4.xan2d, var4.xof2d, var18 + var22.anInt713 / 2 + var4.yof2d, var19 + var4.yof2d);

         int var20;
         for(var20 = 31; var20 >= 0; --var20) {
            for(var19 = 31; var19 >= 0; --var19) {
               if (var3.pixels[var20 + var19 * 32] == 0) {
                  if (var20 > 0 && var3.pixels[var20 + var19 * 32 - 1] > 1) {
                     var3.pixels[var20 + var19 * 32] = 1;
                  } else if (var19 > 0 && var3.pixels[var20 + (var19 - 1) * 32] > 1) {
                     var3.pixels[var20 + var19 * 32] = 1;
                  } else if (var20 < 31 && var3.pixels[var20 + var19 * 32 + 1] > 1) {
                     var3.pixels[var20 + var19 * 32] = 1;
                  } else if (var19 < 31 && var3.pixels[var20 + (var19 + 1) * 32] > 1) {
                     var3.pixels[var20 + var19 * 32] = 1;
                  }
               }
            }
         }

         if (var0 > 0) {
            for(var20 = 31; var20 >= 0; --var20) {
               for(var19 = 31; var19 >= 0; --var19) {
                  if (var3.pixels[var20 + var19 * 32] == 0) {
                     if (var20 > 0 && var3.pixels[var20 + var19 * 32 - 1] == 1) {
                        var3.pixels[var20 + var19 * 32] = var0;
                     } else if (var19 > 0 && var3.pixels[var20 + (var19 - 1) * 32] == 1) {
                        var3.pixels[var20 + var19 * 32] = var0;
                     } else if (var20 < 31 && var3.pixels[var20 + var19 * 32 + 1] == 1) {
                        var3.pixels[var20 + var19 * 32] = var0;
                     } else if (var19 < 31 && var3.pixels[var20 + (var19 + 1) * 32] == 1) {
                        var3.pixels[var20 + var19 * 32] = var0;
                     }
                  }
               }
            }
         } else if (var0 == 0) {
            for(var20 = 31; var20 >= 0; --var20) {
               for(var19 = 31; var19 >= 0; --var19) {
                  if (var3.pixels[var20 + var19 * 32] == 0 && var20 > 0 && var19 > 0 && var3.pixels[var20 + (var19 - 1) * 32 - 1] > 0) {
                     var3.pixels[var20 + var19 * 32] = 3153952;
                  }
               }
            }
         }

         if (var4.certtemplate != -1) {
            var20 = var23.cropW;
            int var21 = var23.cropH;
            var23.cropW = 32;
            var23.cropH = 32;
            var23.draw(0, 0);
            var23.cropW = var20;
            var23.cropH = var21;
         }

         if (var0 == 0) {
            aClass34_4.put(var3, (long)var2);
         }

         Draw2D.bind(var11, var12, var10);
         Draw2D.setBounds(var15, var13, var16, var14);
         Draw3D.anInt686 = var7;
         Draw3D.anInt687 = var8;
         Draw3D.lineOffset = var9;
         Draw3D.aBoolean179 = true;
         if (var4.stackable) {
            var3.cropW = 33;
         } else {
            var3.cropW = 32;
         }

         var3.cropH = var1;
         return var3;
      }
   }

   public static void method114() {
      aClass34_3 = null;
      aClass34_4 = null;
      offsets = null;
      cache = null;
      dat = null;
   }

   public static void unpack(Jagfile var0) {
      dat = new Packet(var0.read("obj.dat", (byte[])null));
      Packet var1 = new Packet(var0.read("obj.idx", (byte[])null));
      anInt179 = var1.g2();
      offsets = new int[anInt179];
      int var2 = 2;

      int var3;
      for(var3 = 0; var3 < anInt179; ++var3) {
         offsets[var3] = var2;
         var2 += var1.g2();
      }

      cache = new ObjType[10];

      for(var3 = 0; var3 < 10; ++var3) {
         cache[var3] = new ObjType();
      }

   }
}
