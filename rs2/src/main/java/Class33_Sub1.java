import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

public final class Class33_Sub1 extends Class33 implements Runnable {
   private int[] anIntArray209;
   private boolean aBoolean205 = true;
   private byte[] aByteArray18;
   private int anInt785;
   private Class6 aClass6_8 = new Class6(true);
   private Client aClient5;
   private Class6 aClass6_7 = new Class6(true);
   private Socket aSocket2;
   private InputStream anInputStream2;
   private Class6 aClass6_5 = new Class6(true);
   private int[] anIntArray205;
   private int[][] anIntArrayArray21 = new int[4][];
   private Stack aClass9_2 = new Stack();
   private int[] anIntArray208;
   public int anInt788;
   private byte[][] aByteArrayArray4 = new byte[4][];
   private int[] anIntArray207;
   private int anInt786;
   private int anInt792;
   private int[] anIntArray204;
   private byte[] aByteArray20 = new byte[500];
   private long aLong26;
   private int anInt784;
   private boolean aBoolean204 = false;
   private Class6 aClass6_9 = new Class6(true);
   private OutputStream anOutputStream2;
   private CRC32 aCRC32_1 = new CRC32();
   private int[] anIntArray206;
   public int anInt797;
   private Class6 aClass6_6 = new Class6(true);
   private Class10_Sub1_Sub4 aClass10_Sub1_Sub4_1;
   private byte aByte44 = 6;
   private int[][] anIntArrayArray20 = new int[4][];
   public String aString15 = "";
   private byte[] aByteArray19 = new byte[65000];
   private int anInt791;
   private int anInt794 = 591;
   private int anInt796;
   private boolean aBoolean206 = false;
   private int anInt783;
   private boolean aBoolean207 = false;
   private int anInt787;
   private int anInt790;
   public int anInt789;
   private boolean aBoolean208 = false;

   public void method558(int var1, int var2) {
      if (var1 <= this.anIntArrayArray21.length && var2 >= 0 && var2 <= this.anIntArrayArray21[var1].length && this.anIntArrayArray21[var1][var2] != 0) {
         Stack var3 = this.aClass9_2;
         synchronized(this.aClass9_2) {
            Class10_Sub1_Sub4 var5;
            for(var5 = (Class10_Sub1_Sub4)this.aClass9_2.method35(); var5 != null; var5 = (Class10_Sub1_Sub4)this.aClass9_2.method36()) {
               if (var5.anInt486 == var1 && var5.anInt487 == var2) {
                  return;
               }
            }

            var5 = new Class10_Sub1_Sub4();
            var5.anInt486 = var1;
            var5.anInt487 = var2;
            var5.aBoolean125 = true;
            Class6 var6 = this.aClass6_5;
            synchronized(this.aClass6_5) {
               this.aClass6_5.method3(var5);
            }

            this.aClass9_2.method33(var5);
         }
      }
   }

   public Class10_Sub1_Sub4 method559() {
      Class6 var1 = this.aClass6_7;
      Class10_Sub1_Sub4 var2;
      synchronized(this.aClass6_7) {
         var2 = (Class10_Sub1_Sub4)this.aClass6_7.method5();
      }

      if (var2 == null) {
         return null;
      } else {
         Stack var3 = this.aClass9_2;
         synchronized(this.aClass9_2) {
            var2.uncache();
         }

         if (var2.aByteArray13 == null) {
            return var2;
         } else {
            int var7 = 0;

            try {
               GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.aByteArray13));

               while(true) {
                  if (var7 == this.aByteArray19.length) {
                     throw new RuntimeException("buffer overflow!");
                  }

                  int var6 = var5.read(this.aByteArray19, var7, this.aByteArray19.length - var7);
                  if (var6 == -1) {
                     break;
                  }

                  var7 += var6;
               }
            } catch (IOException var11) {
               throw new RuntimeException("error unzipping");
            }

            var2.aByteArray13 = new byte[var7];

            for(int var8 = 0; var8 < var7; ++var8) {
               var2.aByteArray13[var8] = this.aByteArray19[var8];
            }

            return var2;
         }
      }
   }

   public void method556(int var1, byte var2, int var3) {
      if (this.aClient5.aClass24Array1[0] != null && this.anIntArrayArray21[var1][var3] != 0) {
         byte[] var4 = this.aClient5.aClass24Array1[var1 + 1].method241(this.aByte44, var3);
         if (!this.method570(var4, 764, this.anIntArrayArray21[var1][var3], this.anIntArrayArray20[var1][var3])) {
            this.aByteArrayArray4[var1][var3] = var2;
            if (var2 > this.anInt784) {
               this.anInt784 = var2;
            }

            ++this.anInt789;
         }
      }

   }

   public void method566(int var1, int var2, byte var3) {
      if (this.aClient5.aClass24Array1[0] != null && this.anIntArrayArray21[var2][var1] != 0 && this.aByteArrayArray4[var2][var1] != 0 && this.anInt784 != 0) {
         Class10_Sub1_Sub4 var4 = new Class10_Sub1_Sub4();
         if (var3 != -113) {
            this.anInt794 = 244;
         }

         var4.anInt486 = var2;
         var4.anInt487 = var1;
         var4.aBoolean125 = false;
         Class6 var5 = this.aClass6_8;
         synchronized(this.aClass6_8) {
            this.aClass6_8.method3(var4);
         }
      }

   }

   public void method552(int var1) {
      this.method558(0, var1);
   }

   public int method569(int var1) {
      return this.anIntArrayArray21[var1].length;
   }

   public int method554(int var1) {
      return this.aByteArray18[var1] & 255;
   }

   public void method565() {
      Class6 var1 = this.aClass6_8;
      synchronized(this.aClass6_8) {
         this.aClass6_8.clear();
      }
   }

   private void method567() {
      Class6 var1 = this.aClass6_5;
      Class10_Sub1_Sub4 var2;
      synchronized(this.aClass6_5) {
         var2 = (Class10_Sub1_Sub4)this.aClass6_5.method5();
      }

      while(var2 != null) {
         this.aBoolean204 = true;
         byte[] var3 = null;
         if (this.aClient5.aClass24Array1[0] != null) {
            var3 = this.aClient5.aClass24Array1[var2.anInt486 + 1].method241(this.aByte44, var2.anInt487);
         }

         if (!this.method570(var3, 764, this.anIntArrayArray21[var2.anInt486][var2.anInt487], this.anIntArrayArray20[var2.anInt486][var2.anInt487])) {
            var3 = null;
         }

         Class6 var4 = this.aClass6_5;
         synchronized(this.aClass6_5) {
            if (var3 == null) {
               this.aClass6_6.method3(var2);
            } else {
               var2.aByteArray13 = var3;
               Class6 var6 = this.aClass6_7;
               synchronized(this.aClass6_7) {
                  this.aClass6_7.method3(var2);
               }
            }

            var2 = (Class10_Sub1_Sub4)this.aClass6_5.method5();
         }
      }

   }

   private void method560() {
      this.anInt785 = 0;
      this.anInt786 = 0;

      Class10_Sub1_Sub4 var1;
      for(var1 = (Class10_Sub1_Sub4)this.aClass6_9.method6(); var1 != null; var1 = (Class10_Sub1_Sub4)this.aClass6_9.method8()) {
         if (var1.aBoolean125) {
            ++this.anInt785;
         } else {
            ++this.anInt786;
         }
      }

      while(this.anInt785 < 10) {
         var1 = (Class10_Sub1_Sub4)this.aClass6_6.method5();
         if (var1 == null) {
            break;
         }

         if (this.aByteArrayArray4[var1.anInt486][var1.anInt487] != 0) {
            ++this.anInt783;
         }

         this.aByteArrayArray4[var1.anInt486][var1.anInt487] = 0;
         this.aClass6_9.method3(var1);
         ++this.anInt785;
         this.method571(this.anInt787, var1);
         this.aBoolean204 = true;
      }

   }

   private boolean method570(byte[] var1, int var2, int var3, int var4) {
      boolean var5 = false;
      if (var1 != null && var1.length >= 2) {
         int var6 = var1.length - 2;
         int var7 = ((var1[var6] & 255) << 8) + (var1[var6 + 1] & 255);
         this.aCRC32_1.reset();
         this.aCRC32_1.update(var1, 0, var6);
         int var8 = (int)this.aCRC32_1.getValue();
         if (var7 == var3) {
            return var8 == var4;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method555() {
      while(this.anInt785 == 0) {
         if (this.anInt786 >= 10 || this.anInt784 == 0) {
            return;
         }

         Class6 var1 = this.aClass6_8;
         Class10_Sub1_Sub4 var2;
         synchronized(this.aClass6_8) {
            var2 = (Class10_Sub1_Sub4)this.aClass6_8.method5();
         }

         while(var2 != null) {
            if (this.aByteArrayArray4[var2.anInt486][var2.anInt487] != 0) {
               this.aByteArrayArray4[var2.anInt486][var2.anInt487] = 0;
               this.aClass6_9.method3(var2);
               this.method571(this.anInt787, var2);
               this.aBoolean204 = true;
               if (this.anInt783 < this.anInt789) {
                  ++this.anInt783;
               }

               this.aString15 = "Loading extra files - " + this.anInt783 * 100 / this.anInt789 + "%";
               ++this.anInt786;
               if (this.anInt786 == 10) {
                  return;
               }
            }

            var1 = this.aClass6_8;
            synchronized(this.aClass6_8) {
               var2 = (Class10_Sub1_Sub4)this.aClass6_8.method5();
            }
         }

         for(int var7 = 0; var7 < 4; ++var7) {
            byte[] var4 = this.aByteArrayArray4[var7];
            int var8 = var4.length;

            for(int var6 = 0; var6 < var8; ++var6) {
               if (var4[var6] == this.anInt784) {
                  var4[var6] = 0;
                  var2 = new Class10_Sub1_Sub4();
                  var2.anInt486 = var7;
                  var2.anInt487 = var6;
                  var2.aBoolean125 = false;
                  this.aClass6_9.method3(var2);
                  this.method571(this.anInt787, var2);
                  this.aBoolean204 = true;
                  if (this.anInt783 < this.anInt789) {
                     ++this.anInt783;
                  }

                  this.aString15 = "Loading extra files - " + this.anInt783 * 100 / this.anInt789 + "%";
                  ++this.anInt786;
                  if (this.anInt786 == 10) {
                     return;
                  }
               }
            }
         }

         --this.anInt784;
      }

   }

   private void method571(int var1, Class10_Sub1_Sub4 var2) {
      if (var1 == 0) {
         try {
            if (this.aSocket2 == null) {
               long var3 = System.currentTimeMillis();
               if (var3 - this.aLong26 < 4000L) {
                  return;
               }

               this.aLong26 = var3;
               this.aSocket2 = this.aClient5.openSocket(Client.portOffset + 43594);
               this.anInputStream2 = this.aSocket2.getInputStream();
               this.anOutputStream2 = this.aSocket2.getOutputStream();
               this.anOutputStream2.write(15);

               for(int var5 = 0; var5 < 8; ++var5) {
                  this.anInputStream2.read();
               }

               this.anInt790 = 0;
            }

            this.aByteArray20[0] = (byte)var2.anInt486;
            this.aByteArray20[1] = (byte)(var2.anInt487 >> 8);
            this.aByteArray20[2] = (byte)var2.anInt487;
            if (var2.aBoolean125) {
               this.aByteArray20[3] = 2;
            } else if (this.aClient5.ingame) {
               this.aByteArray20[3] = 0;
            } else {
               this.aByteArray20[3] = 1;
            }

            this.anOutputStream2.write(this.aByteArray20, 0, 4);
            this.anInt796 = 0;
            this.anInt797 = -10000;
         } catch (IOException var8) {
            try {
               this.aSocket2.close();
            } catch (Exception var7) {
            }

            this.aSocket2 = null;
            this.anInputStream2 = null;
            this.anOutputStream2 = null;
            this.anInt792 = 0;
            ++this.anInt797;
         }
      }

   }

   public int method562() {
      Stack var1 = this.aClass9_2;
      synchronized(this.aClass9_2) {
         return this.aClass9_2.method37();
      }
   }

   private void method553() {
      try {
         int var1 = this.anInputStream2.available();
         int var2;
         int var3;
         if (this.anInt792 == 0 && var1 >= 6) {
            this.aBoolean204 = true;

            int var4;
            for(var4 = 0; var4 < 6; var4 += this.anInputStream2.read(this.aByteArray20, var4, 6 - var4)) {
            }

            var2 = this.aByteArray20[0] & 255;
            var3 = ((this.aByteArray20[1] & 255) << 8) + (this.aByteArray20[2] & 255);
            var4 = ((this.aByteArray20[3] & 255) << 8) + (this.aByteArray20[4] & 255);
            int var5 = this.aByteArray20[5] & 255;
            this.aClass10_Sub1_Sub4_1 = null;
            Class10_Sub1_Sub4 var6 = (Class10_Sub1_Sub4)this.aClass6_9.method6();

            while(true) {
               if (var6 == null) {
                  if (this.aClass10_Sub1_Sub4_1 != null) {
                     this.anInt790 = 0;
                     if (var4 == 0) {
                        signlink.reporterror("Rej: " + var2 + "," + var3);
                        this.aClass10_Sub1_Sub4_1.aByteArray13 = null;
                        if (this.aClass10_Sub1_Sub4_1.aBoolean125) {
                           Class6 var18 = this.aClass6_7;
                           synchronized(this.aClass6_7) {
                              this.aClass6_7.method3(this.aClass10_Sub1_Sub4_1);
                           }
                        } else {
                           this.aClass10_Sub1_Sub4_1.unlink();
                        }

                        this.aClass10_Sub1_Sub4_1 = null;
                     } else {
                        if (this.aClass10_Sub1_Sub4_1.aByteArray13 == null && var5 == 0) {
                           this.aClass10_Sub1_Sub4_1.aByteArray13 = new byte[var4];
                        }

                        if (this.aClass10_Sub1_Sub4_1.aByteArray13 == null && var5 != 0) {
                           throw new IOException("missing start of file");
                        }
                     }
                  }

                  this.anInt791 = var5 * 500;
                  this.anInt792 = 500;
                  if (this.anInt792 > var4 - var5 * 500) {
                     this.anInt792 = var4 - var5 * 500;
                  }
                  break;
               }

               if (var6.anInt486 == var2 && var6.anInt487 == var3) {
                  this.aClass10_Sub1_Sub4_1 = var6;
               }

               if (this.aClass10_Sub1_Sub4_1 != null) {
                  var6.anInt488 = 0;
               }

               var6 = (Class10_Sub1_Sub4)this.aClass6_9.method8();
            }
         }

         if (this.anInt792 > 0 && var1 >= this.anInt792) {
            this.aBoolean204 = true;
            byte[] var10 = this.aByteArray20;
            var2 = 0;
            if (this.aClass10_Sub1_Sub4_1 != null) {
               var10 = this.aClass10_Sub1_Sub4_1.aByteArray13;
               var2 = this.anInt791;
            }

            for(var3 = 0; var3 < this.anInt792; var3 += this.anInputStream2.read(var10, var3 + var2, this.anInt792 - var3)) {
            }

            if (this.anInt792 + this.anInt791 >= var10.length && this.aClass10_Sub1_Sub4_1 != null) {
               if (this.aClient5.aClass24Array1[0] != null) {
                  this.aClient5.aClass24Array1[this.aClass10_Sub1_Sub4_1.anInt486 + 1].method242(var10.length, var10, this.aClass10_Sub1_Sub4_1.anInt487);
               }

               if (!this.aClass10_Sub1_Sub4_1.aBoolean125 && this.aClass10_Sub1_Sub4_1.anInt486 == 3) {
                  this.aClass10_Sub1_Sub4_1.aBoolean125 = true;
                  this.aClass10_Sub1_Sub4_1.anInt486 = 93;
               }

               if (this.aClass10_Sub1_Sub4_1.aBoolean125) {
                  Class6 var11 = this.aClass6_7;
                  synchronized(this.aClass6_7) {
                     this.aClass6_7.method3(this.aClass10_Sub1_Sub4_1);
                  }
               } else {
                  this.aClass10_Sub1_Sub4_1.unlink();
               }
            }

            this.anInt792 = 0;
         }
      } catch (IOException var17) {
         try {
            this.aSocket2.close();
         } catch (Exception var14) {
         }

         this.aSocket2 = null;
         this.anInputStream2 = null;
         this.anOutputStream2 = null;
         this.anInt792 = 0;
      }

   }

   public boolean method563(int var1) {
      for(int var2 = 0; var2 < this.anIntArray205.length; ++var2) {
         if (this.anIntArray207[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public int method573(int var1, int var2, int var3) {
      int var4 = (var1 << 8) + var2;

      for(int var5 = 0; var5 < this.anIntArray205.length; ++var5) {
         if (this.anIntArray205[var5] == var4) {
            if (var3 == 0) {
               return this.anIntArray206[var5];
            }

            return this.anIntArray207[var5];
         }
      }

      return -1;
   }

   public void method564(Jagfile var1, Client var2) {
      String[] var3 = new String[]{"model_version", "anim_version", "midi_version", "map_version"};

      int var4;
      int var5;
      byte[] var7;
      Packet var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         var7 = var1.read(var3[var6], (byte[])null);
         var4 = var7.length / 2;
         var8 = new Packet(var7);
         this.anIntArrayArray21[var6] = new int[var4];
         this.aByteArrayArray4[var6] = new byte[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArrayArray21[var6][var5] = var8.g2();
         }
      }

      String[] var10 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};

      int var9;
      for(var4 = 0; var4 < 4; ++var4) {
         var7 = var1.read(var10[var4], (byte[])null);
         var5 = var7.length / 4;
         var8 = new Packet(var7);
         this.anIntArrayArray20[var4] = new int[var5];

         for(var9 = 0; var9 < var5; ++var9) {
            this.anIntArrayArray20[var4][var9] = var8.g4();
         }
      }

      var7 = var1.read("model_index", (byte[])null);
      var5 = this.anIntArrayArray21[0].length;
      this.aByteArray18 = new byte[var5];

      for(int var11 = 0; var11 < var5; ++var11) {
         if (var11 < var7.length) {
            this.aByteArray18[var11] = var7[var11];
         } else {
            this.aByteArray18[var11] = 0;
         }
      }

      var7 = var1.read("map_index", (byte[])null);
      var8 = new Packet(var7);
      var5 = var7.length / 7;
      this.anIntArray205 = new int[var5];
      this.anIntArray206 = new int[var5];
      this.anIntArray207 = new int[var5];
      this.anIntArray204 = new int[var5];

      for(var9 = 0; var9 < var5; ++var9) {
         this.anIntArray205[var9] = var8.g2();
         this.anIntArray206[var9] = var8.g2();
         this.anIntArray207[var9] = var8.g2();
         this.anIntArray204[var9] = var8.g1();
      }

      var7 = var1.read("anim_index", (byte[])null);
      var8 = new Packet(var7);
      var5 = var7.length / 2;
      this.anIntArray209 = new int[var5];

      for(var9 = 0; var9 < var5; ++var9) {
         this.anIntArray209[var9] = var8.g2();
      }

      var7 = var1.read("midi_index", (byte[])null);
      var8 = new Packet(var7);
      var5 = var7.length;
      this.anIntArray208 = new int[var5];

      for(var9 = 0; var9 < var5; ++var9) {
         this.anIntArray208[var9] = var8.g1();
      }

      this.aClient5 = var2;
      this.aBoolean205 = true;
      this.aClient5.startThread(this, 2);
   }

   public int method572(int var1) {
      boolean var2 = false;
      return this.anIntArray209.length;
   }

   public void method561(boolean var1) {
      int var2 = this.anIntArray205.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         if (var1 || this.anIntArray204[var3] != 0) {
            this.method556(3, (byte)2, this.anIntArray207[var3]);
            this.method556(3, (byte)2, this.anIntArray206[var3]);
         }
      }

   }

   public boolean method557(int var1, boolean var2) {
      if (!var2) {
         throw new NullPointerException();
      } else {
         return this.anIntArray208[var1] == 1;
      }
   }

   public void method568() {
      this.aBoolean205 = false;
   }

   public void run() {
      while(true) {
         try {
            if (this.aBoolean205) {
               ++this.anInt788;
               byte var1 = 20;
               if (this.anInt784 == 0 && this.aClient5.aClass24Array1[0] != null) {
                  var1 = 50;
               }

               try {
                  Thread.sleep((long)var1);
               } catch (Exception var9) {
               }

               this.aBoolean204 = true;

               for(int var5 = 0; var5 < 100 && this.aBoolean204; ++var5) {
                  this.aBoolean204 = false;
                  this.method567();
                  this.method560();
                  if (this.anInt785 == 0 && var5 >= 5) {
                     break;
                  }

                  this.method555();
                  if (this.anInputStream2 != null) {
                     this.method553();
                  }
               }

               boolean var11 = false;

               Class10_Sub1_Sub4 var3;
               for(var3 = (Class10_Sub1_Sub4)this.aClass6_9.method6(); var3 != null; var3 = (Class10_Sub1_Sub4)this.aClass6_9.method8()) {
                  if (var3.aBoolean125) {
                     var11 = true;
                     ++var3.anInt488;
                     if (var3.anInt488 > 50) {
                        var3.anInt488 = 0;
                        this.method571(this.anInt787, var3);
                     }
                  }
               }

               if (!var11) {
                  for(var3 = (Class10_Sub1_Sub4)this.aClass6_9.method6(); var3 != null; var3 = (Class10_Sub1_Sub4)this.aClass6_9.method8()) {
                     var11 = true;
                     ++var3.anInt488;
                     if (var3.anInt488 > 50) {
                        var3.anInt488 = 0;
                        this.method571(this.anInt787, var3);
                     }
                  }
               }

               if (var11) {
                  ++this.anInt790;
                  if (this.anInt790 > 750) {
                     try {
                        this.aSocket2.close();
                     } catch (Exception var8) {
                     }

                     this.aSocket2 = null;
                     this.anInputStream2 = null;
                     this.anOutputStream2 = null;
                     this.anInt792 = 0;
                  }
               } else {
                  this.anInt790 = 0;
                  this.aString15 = "";
               }

               if (!this.aClient5.ingame || this.aSocket2 == null || this.anOutputStream2 == null || this.anInt784 <= 0 && this.aClient5.aClass24Array1[0] != null) {
                  continue;
               }

               ++this.anInt796;
               if (this.anInt796 <= 500) {
                  continue;
               }

               this.anInt796 = 0;
               this.aByteArray20[0] = 0;
               this.aByteArray20[1] = 0;
               this.aByteArray20[2] = 0;
               this.aByteArray20[3] = 10;

               try {
                  this.anOutputStream2.write(this.aByteArray20, 0, 4);
               } catch (IOException var7) {
                  this.anInt790 = 5000;
               }
               continue;
            }
         } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
         }

         return;
      }
   }
}
