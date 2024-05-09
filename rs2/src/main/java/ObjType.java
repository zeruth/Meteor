public final class ObjType {
   public static LruCache aClass34_3 = new LruCache(50);
   private static int anInt185;
   private static ObjType[] aClass17Array1;
   public static boolean aBoolean49 = true;
   public static LruCache aClass34_4 = new LruCache(100);
   private static Packet aClass10_Sub1_Sub3_1;
   private static byte aByte13 = 6;
   private static int[] anIntArray52;
   public static int anInt179;
   private int anInt186;
   private int anInt178;
   private int anInt193;
   private int[] anIntArray54;
   public int anInt182;
   private int anInt175;
   private int anInt194;
   private boolean aBoolean50 = true;
   private int anInt201;
   public String aString7;
   private int anInt203;
   private int anInt184 = -68;
   public int anInt196 = -1;
   private int anInt173;
   private int anInt195;
   public int anInt187;
   private int[] anIntArray55;
   public byte[] aByteArray8;
   private int anInt188;
   private int anInt198;
   private int[] anIntArray53;
   private boolean aBoolean53 = true;
   private int[] anIntArray51;
   public int anInt191;
   public int anInt200;
   private int anInt197;
   public int anInt192;
   public int anInt183;
   private int anInt190;
   private byte aByte14;
   public boolean aBoolean52;
   private int anInt199;
   public int anInt189;
   private int anInt180;
   private int anInt174;
   private int anInt181;
   private int anInt202;
   private byte aByte12;
   public boolean aBoolean54;
   public String[] aStringArray2;
   public String[] aStringArray3;
   private int anInt177;
   public int anInt176;

   private ObjType() {
   }

   public Model method112(int var1) {
      int var2;
      if (this.anIntArray54 != null && var1 > 1) {
         int var3 = -1;

         for(var2 = 0; var2 < 10; ++var2) {
            if (var1 >= this.anIntArray55[var2] && this.anIntArray55[var2] != 0) {
               var3 = this.anIntArray54[var2];
            }
         }

         if (var3 != -1) {
            return method104(var3).method112(1);
         }
      }

      Model var4 = (Model)aClass34_3.get((long)this.anInt196);
      if (var4 != null) {
         return var4;
      } else {
         var4 = Model.createModel(this.anInt193);
         if (var4 == null) {
            return null;
         } else {
            if (this.anInt197 != 128 || this.anInt190 != 128 || this.anInt199 != 128) {
               var4.method287(this.anInt190, this.anInt199, this.anInt197);
            }

            if (this.anIntArray53 != null) {
               for(var2 = 0; var2 < this.anIntArray53.length; ++var2) {
                  var4.recolor(this.anIntArray53[var2], this.anIntArray51[var2]);
               }
            }

            var4.method288(this.anInt187 + 64, this.anInt191 + 768, -50, -10, -50, true);
            var4.aBoolean106 = true;
            aClass34_3.put(var4, (long)this.anInt196);
            return var4;
         }
      }
   }

   public Model method109(int var1, int var2) {
      int var3;
      if (this.anIntArray54 != null && var2 > 1) {
         int var4 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if (var2 >= this.anIntArray55[var3] && this.anIntArray55[var3] != 0) {
               var4 = this.anIntArray54[var3];
            }
         }

         if (var4 != -1) {
            return method104(var4).method109(this.anInt184, 1);
         }
      }

      Model var5;
      for(var5 = Model.createModel(this.anInt193); var1 >= 0; this.aBoolean50 = !this.aBoolean50) {
      }

      if (var5 == null) {
         return null;
      } else {
         if (this.anIntArray53 != null) {
            for(var3 = 0; var3 < this.anIntArray53.length; ++var3) {
               var5.recolor(this.anIntArray53[var3], this.anIntArray51[var3]);
            }
         }

         return var5;
      }
   }

   public boolean method103(int var1) {
      int var2 = this.anInt178;
      int var3 = this.anInt194;
      if (var1 == 1) {
         var2 = this.anInt203;
         var3 = this.anInt195;
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
      int var2 = this.anInt178;
      int var3 = this.anInt194;
      if (var1 == 1) {
         var2 = this.anInt203;
         var3 = this.anInt195;
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

         if (this.anIntArray53 != null) {
            for(int var7 = 0; var7 < this.anIntArray53.length; ++var7) {
               var4.recolor(this.anIntArray53[var7], this.anIntArray51[var7]);
            }
         }

         return var4;
      }
   }

   private void method115() {
      this.anInt193 = 0;
      this.aString7 = null;
      this.aByteArray8 = null;
      this.anIntArray53 = null;
      this.anIntArray51 = null;
      this.anInt200 = 2000;
      this.anInt192 = 0;
      this.anInt189 = 0;
      this.anInt180 = 0;
      this.anInt174 = 0;
      this.anInt181 = 0;
      this.anInt202 = -1;
      this.aBoolean52 = false;
      this.anInt183 = 1;
      this.aBoolean54 = false;
      this.aStringArray2 = null;
      this.aStringArray3 = null;
      this.anInt186 = -1;
      this.anInt175 = -1;
      this.aByte14 = 0;
      this.anInt173 = -1;
      this.anInt188 = -1;
      this.aByte12 = 0;
      this.anInt201 = -1;
      this.anInt198 = -1;
      this.anInt178 = -1;
      this.anInt194 = -1;
      this.anInt203 = -1;
      this.anInt195 = -1;
      this.anIntArray54 = null;
      this.anIntArray55 = null;
      this.anInt177 = -1;
      this.anInt182 = -1;
      this.anInt197 = 128;
      this.anInt190 = 128;
      this.anInt199 = 128;
      this.anInt187 = 0;
      this.anInt191 = 0;
      this.anInt176 = 0;
   }

   private void method110(byte var1, Packet var2) {
      if (var1 != 6) {
         this.aBoolean50 = !this.aBoolean50;
      }

      while(true) {
         while(true) {
            int var3 = var2.g1();
            if (var3 == 0) {
               return;
            }

            if (var3 == 1) {
               this.anInt193 = var2.g2();
            } else if (var3 == 2) {
               this.aString7 = var2.gjstr();
            } else if (var3 == 3) {
               this.aByteArray8 = var2.gstrbyte();
            } else if (var3 == 4) {
               this.anInt200 = var2.g2();
            } else if (var3 == 5) {
               this.anInt192 = var2.g2();
            } else if (var3 == 6) {
               this.anInt189 = var2.g2();
            } else if (var3 == 7) {
               this.anInt174 = var2.g2();
               if (this.anInt174 > 32767) {
                  this.anInt174 -= 65536;
               }
            } else if (var3 == 8) {
               this.anInt181 = var2.g2();
               if (this.anInt181 > 32767) {
                  this.anInt181 -= 65536;
               }
            } else if (var3 == 10) {
               this.anInt202 = var2.g2();
            } else if (var3 == 11) {
               this.aBoolean52 = true;
            } else if (var3 == 12) {
               this.anInt183 = var2.g4();
            } else if (var3 == 16) {
               this.aBoolean54 = true;
            } else if (var3 == 23) {
               this.anInt186 = var2.g2();
               this.aByte14 = var2.g1b();
            } else if (var3 == 24) {
               this.anInt175 = var2.g2();
            } else if (var3 == 25) {
               this.anInt173 = var2.g2();
               this.aByte12 = var2.g1b();
            } else if (var3 == 26) {
               this.anInt188 = var2.g2();
            } else if (var3 >= 30 && var3 < 35) {
               if (this.aStringArray2 == null) {
                  this.aStringArray2 = new String[5];
               }

               this.aStringArray2[var3 - 30] = var2.gjstr();
               if (this.aStringArray2[var3 - 30].equalsIgnoreCase("hidden")) {
                  this.aStringArray2[var3 - 30] = null;
               }
            } else if (var3 >= 35 && var3 < 40) {
               if (this.aStringArray3 == null) {
                  this.aStringArray3 = new String[5];
               }

               this.aStringArray3[var3 - 35] = var2.gjstr();
            } else if (var3 == 40) {
               int var4 = var2.g1();
               this.anIntArray53 = new int[var4];
               this.anIntArray51 = new int[var4];

               for(int var5 = 0; var5 < var4; ++var5) {
                  this.anIntArray53[var5] = var2.g2();
                  this.anIntArray51[var5] = var2.g2();
               }
            } else if (var3 == 78) {
               this.anInt201 = var2.g2();
            } else if (var3 == 79) {
               this.anInt198 = var2.g2();
            } else if (var3 == 90) {
               this.anInt178 = var2.g2();
            } else if (var3 == 91) {
               this.anInt203 = var2.g2();
            } else if (var3 == 92) {
               this.anInt194 = var2.g2();
            } else if (var3 == 93) {
               this.anInt195 = var2.g2();
            } else if (var3 == 95) {
               this.anInt180 = var2.g2();
            } else if (var3 == 97) {
               this.anInt177 = var2.g2();
            } else if (var3 == 98) {
               this.anInt182 = var2.g2();
            } else if (var3 >= 100 && var3 < 110) {
               if (this.anIntArray54 == null) {
                  this.anIntArray54 = new int[10];
                  this.anIntArray55 = new int[10];
               }

               this.anIntArray54[var3 - 100] = var2.g2();
               this.anIntArray55[var3 - 100] = var2.g2();
            } else if (var3 == 110) {
               this.anInt197 = var2.g2();
            } else if (var3 == 111) {
               this.anInt190 = var2.g2();
            } else if (var3 == 112) {
               this.anInt199 = var2.g2();
            } else if (var3 == 113) {
               this.anInt187 = var2.g1b();
            } else if (var3 == 114) {
               this.anInt191 = var2.g1b() * 5;
            } else if (var3 == 115) {
               this.anInt176 = var2.g1();
            }
         }
      }
   }

   private void method107() {
      ObjType var1 = method104(this.anInt182);
      this.anInt193 = var1.anInt193;
      this.anInt200 = var1.anInt200;
      this.anInt192 = var1.anInt192;
      this.anInt189 = var1.anInt189;
      this.anInt180 = var1.anInt180;
      this.anInt174 = var1.anInt174;
      this.anInt181 = var1.anInt181;
      this.anIntArray53 = var1.anIntArray53;
      this.anIntArray51 = var1.anIntArray51;
      ObjType var2 = method104(this.anInt177);
      this.aString7 = var2.aString7;
      this.aBoolean54 = var2.aBoolean54;
      this.anInt183 = var2.anInt183;
      String var3 = "a";
      char var4 = var2.aString7.charAt(0);
      if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
         var3 = "an";
      }

      this.aByteArray8 = ("Swap this note at any bank for " + var3 + " " + var2.aString7 + ".").getBytes();
      this.aBoolean52 = true;
   }

   public boolean method108(int var1) {
      int var2 = this.anInt186;
      int var3 = this.anInt175;
      int var4 = this.anInt201;
      if (var1 == 1) {
         var2 = this.anInt173;
         var3 = this.anInt188;
         var4 = this.anInt198;
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
      int var2 = this.anInt186;
      int var3 = this.anInt175;
      int var4 = this.anInt201;
      if (var1 == 1) {
         var2 = this.anInt173;
         var3 = this.anInt188;
         var4 = this.anInt198;
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

         if (var1 == 0 && this.aByte14 != 0) {
            var5.method284(0, 0, this.aByte14);
         }

         if (var1 == 1 && this.aByte12 != 0) {
            var5.method284(0, 0, this.aByte12);
         }

         if (this.anIntArray53 != null) {
            for(int var9 = 0; var9 < this.anIntArray53.length; ++var9) {
               var5.recolor(this.anIntArray53[var9], this.anIntArray51[var9]);
            }
         }

         return var5;
      }
   }

   public static ObjType method104(int var0) {
      for(int var1 = 0; var1 < 10; ++var1) {
         if (aClass17Array1[var1].anInt196 == var0) {
            return aClass17Array1[var1];
         }
      }

      anInt185 = (anInt185 + 1) % 10;
      ObjType var2 = aClass17Array1[anInt185];
      aClass10_Sub1_Sub3_1.pos = anIntArray52[var0];
      var2.anInt196 = var0;
      var2.method115();
      var2.method110(aByte13, aClass10_Sub1_Sub3_1);
      if (var2.anInt182 != -1) {
         var2.method107();
      }

      if (!aBoolean49 && var2.aBoolean54) {
         var2.aString7 = "Members Object";
         var2.aByteArray8 = "Login to a members' server to use this object.".getBytes();
         var2.aStringArray2 = null;
         var2.aStringArray3 = null;
         var2.anInt176 = 0;
      }

      return var2;
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

      ObjType var4 = method104(var2);
      if (var4.anIntArray54 == null) {
         var1 = -1;
      }

      if (var1 > 1) {
         int var5 = -1;

         for(int var6 = 0; var6 < 10; ++var6) {
            if (var1 >= var4.anIntArray55[var6] && var4.anIntArray55[var6] != 0) {
               var5 = var4.anIntArray54[var6];
            }
         }

         if (var5 != -1) {
            var4 = method104(var5);
         }
      }

      Model var22 = var4.method112(1);
      if (var22 == null) {
         return null;
      } else {
         Pix24 var23 = null;
         if (var4.anInt182 != -1) {
            var23 = method113(-1, 10, var4.anInt177);
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
         int var17 = var4.anInt200;
         if (var0 == -1) {
            var17 = (int)((double)var17 * 1.5);
         }

         if (var0 > 0) {
            var17 = (int)((double)var17 * 1.04);
         }

         int var18 = Draw3D.anIntArray181[var4.anInt192] * var17 >> 16;
         int var19 = Draw3D.anIntArray182[var4.anInt192] * var17 >> 16;
         var22.method292(var4.anInt189, var4.anInt180, var4.anInt192, var4.anInt174, var18 + var22.anInt713 / 2 + var4.anInt181, var19 + var4.anInt181);

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

         if (var4.anInt182 != -1) {
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
         if (var4.aBoolean52) {
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
      anIntArray52 = null;
      aClass17Array1 = null;
      aClass10_Sub1_Sub3_1 = null;
   }

   public static void unpack(Jagfile var0) {
      aClass10_Sub1_Sub3_1 = new Packet(var0.read("obj.dat", (byte[])null));
      Packet var1 = new Packet(var0.read("obj.idx", (byte[])null));
      anInt179 = var1.g2();
      anIntArray52 = new int[anInt179];
      int var2 = 2;

      int var3;
      for(var3 = 0; var3 < anInt179; ++var3) {
         anIntArray52[var3] = var2;
         var2 += var1.g2();
      }

      aClass17Array1 = new ObjType[10];

      for(var3 = 0; var3 < 10; ++var3) {
         aClass17Array1[var3] = new ObjType();
      }

   }
}
