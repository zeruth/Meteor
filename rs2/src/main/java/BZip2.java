public final class BZip2 {
   private static final BZip2State state = new BZip2State();

   private static int getBits(int var0, BZip2State var1) {
      while(var1.bsLive < var0) {
         var1.bsBuff = var1.bsBuff << 8 | var1.stream[var1.next_in] & 255;
         var1.bsLive += 8;
         ++var1.next_in;
         --var1.avail_in;
         ++var1.total_in_lo32;
         if (var1.total_in_lo32 == 0) {
            ++var1.total_in_hi32;
         }
      }

      int var2 = var1.bsBuff >> var1.bsLive - var0 & (1 << var0) - 1;
      var1.bsLive -= var0;
      return var2;
   }

   private static byte getUnsignedChar(BZip2State var0) {
      return (byte)getBits(8, var0);
   }

   public static int read(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(state) {
         state.stream = var2;
         state.next_in = var4;
         state.decompressed = var0;
         state.next_out = 0;
         state.avail_in = var3;
         state.avail_out = var1;
         state.bsLive = 0;
         state.bsBuff = 0;
         state.total_in_lo32 = 0;
         state.total_in_hi32 = 0;
         state.total_out_lo32 = 0;
         state.total_out_hi32 = 0;
         state.currBlockNo = 0;
         decompress(state);
         return var1 - state.avail_out;
      }
   }

   private static byte getBit(BZip2State var0) {
      return (byte)getBits(1, var0);
   }

   private static void decompress(BZip2State var0) {
      var0.anInt21 = 1;
      if (BZip2State.tt == null) {
         BZip2State.tt = new int[var0.anInt21 * 100000];
      }

      boolean var1 = true;

      while(true) {
         while(var1) {
            byte var2 = getUnsignedChar(var0);
            if (var2 == 23) {
               return;
            }

            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            ++var0.currBlockNo;
            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            var2 = getUnsignedChar(var0);
            var2 = getBit(var0);
            var0.blockRandomized = var2 != 0;
            if (var0.blockRandomized) {
               System.out.println("PANIC! RANDOMISED BLOCK!");
            }

            var0.origPtr = 0;
            var2 = getUnsignedChar(var0);
            var0.origPtr = var0.origPtr << 8 | var2 & 255;
            var2 = getUnsignedChar(var0);
            var0.origPtr = var0.origPtr << 8 | var2 & 255;
            var2 = getUnsignedChar(var0);
            var0.origPtr = var0.origPtr << 8 | var2 & 255;

            int var3;
            for(var3 = 0; var3 < 16; ++var3) {
               var2 = getBit(var0);
               var0.inUse16[var3] = var2 == 1;
            }

            for(var3 = 0; var3 < 256; ++var3) {
               var0.inUse[var3] = false;
            }

            int var4;
            for(var3 = 0; var3 < 16; ++var3) {
               if (var0.inUse16[var3]) {
                  for(var4 = 0; var4 < 16; ++var4) {
                     var2 = getBit(var0);
                     if (var2 == 1) {
                        var0.inUse[var3 * 16 + var4] = true;
                     }
                  }
               }
            }

            makeMaps(var0);
            int var5 = var0.nInUse + 2;
            int var6 = getBits(3, var0);
            int var7 = getBits(15, var0);

            for(var3 = 0; var3 < var7; ++var3) {
               var4 = 0;

               while(true) {
                  var2 = getBit(var0);
                  if (var2 == 0) {
                     var0.selectorMtf[var3] = (byte)var4;
                     break;
                  }

                  ++var4;
               }
            }

            byte[] var8 = new byte[6];

            byte var9;
            for(var9 = 0; var9 < var6; var8[var9] = var9++) {
            }

            int var10;
            for(var3 = 0; var3 < var7; ++var3) {
               var9 = var0.selectorMtf[var3];

               for(var10 = var8[var9]; var9 > 0; --var9) {
                  var8[var9] = var8[var9 - 1];
               }

               var8[0] = (byte)var10;
               var0.selector[var3] = (byte)var10;
            }

            int var11;
            for(var10 = 0; var10 < var6; ++var10) {
               var11 = getBits(5, var0);

               for(var3 = 0; var3 < var5; ++var3) {
                  while(true) {
                     var2 = getBit(var0);
                     if (var2 == 0) {
                        var0.len[var10][var3] = (byte)var11;
                        break;
                     }

                     var2 = getBit(var0);
                     if (var2 == 0) {
                        ++var11;
                     } else {
                        --var11;
                     }
                  }
               }
            }

            int var12;
            for(var10 = 0; var10 < var6; ++var10) {
               byte var36 = 32;
               var12 = 0;

               for(var3 = 0; var3 < var5; ++var3) {
                  if (var0.len[var10][var3] > var12) {
                     var12 = var0.len[var10][var3];
                  }

                  if (var0.len[var10][var3] < var36) {
                     var36 = var0.len[var10][var3];
                  }
               }

               createDecodeTables(var0.limit[var10], var0.base[var10], var0.perm[var10], var0.len[var10], var36, var12, var5);
               var0.minLens[var10] = var36;
            }

            var11 = var0.nInUse + 1;
            var12 = var0.anInt21 * 100000;
            byte var13 = -1;

            for(var3 = 0; var3 <= 255; ++var3) {
               var0.unzftab[var3] = 0;
            }

            int var14 = 4095;

            int var15;
            int var16;
            for(var15 = 15; var15 >= 0; --var15) {
               for(var16 = 15; var16 >= 0; --var16) {
                  var0.mtfa[var14] = (byte)(var15 * 16 + var16);
                  --var14;
               }

               var0.mtfbase[var15] = var14 + 1;
            }

            var15 = 0;
            var16 = var13 + 1;
            byte var17 = 50;
            byte var18 = var0.selector[0];
            int var19 = var0.minLens[var18];
            int[] var20 = var0.limit[var18];
            int[] var21 = var0.perm[var18];
            int[] var22 = var0.base[var18];
            int var23 = var17 - 1;
            int var24 = var19;

            int var25;
            byte var26;
            for(var25 = getBits(var19, var0); var25 > var20[var24]; var25 = var25 << 1 | var26) {
               ++var24;
               var26 = getBit(var0);
            }

            int var27 = var21[var25 - var22[var24]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var27 != var11) {
                  int var28;
                  int var29;
                  if (var27 != 0 && var27 != 1) {
                     var28 = var27 - 1;
                     int var30;
                     if (var28 < 16) {
                        var29 = var0.mtfbase[0];

                        for(var2 = var0.mtfa[var29 + var28]; var28 > 3; var28 -= 4) {
                           var30 = var29 + var28;
                           var0.mtfa[var30] = var0.mtfa[var30 - 1];
                           var0.mtfa[var30 - 1] = var0.mtfa[var30 - 2];
                           var0.mtfa[var30 - 2] = var0.mtfa[var30 - 3];
                           var0.mtfa[var30 - 3] = var0.mtfa[var30 - 4];
                        }

                        while(var28 > 0) {
                           var0.mtfa[var29 + var28] = var0.mtfa[var29 + var28 - 1];
                           --var28;
                        }

                        var0.mtfa[var29] = var2;
                     } else {
                        var30 = var28 / 16;
                        int var31 = var28 % 16;
                        var29 = var0.mtfbase[var30] + var31;

                        for(var2 = var0.mtfa[var29]; var29 > var0.mtfbase[var30]; --var29) {
                           var0.mtfa[var29] = var0.mtfa[var29 - 1];
                        }

                        int var10003;
                        for(var10003 = var0.mtfbase[var30]++; var30 > 0; --var30) {
                           var10003 = var0.mtfbase[var30]--;
                           var0.mtfa[var0.mtfbase[var30]] = var0.mtfa[var0.mtfbase[var30 - 1] + 16 - 1];
                        }

                        var10003 = var0.mtfbase[0]--;
                        var0.mtfa[var0.mtfbase[0]] = var2;
                        if (var0.mtfbase[0] == 0) {
                           int var33 = 4095;

                           for(int var34 = 15; var34 >= 0; --var34) {
                              for(int var35 = 15; var35 >= 0; --var35) {
                                 var0.mtfa[var33] = var0.mtfa[var0.mtfbase[var34] + var35];
                                 --var33;
                              }

                              var0.mtfbase[var34] = var33 + 1;
                           }
                        }
                     }

                     var10002 = var0.unzftab[var0.aByteArray3[var2 & 255] & 255]++;
                     BZip2State.tt[var15] = var0.aByteArray3[var2 & 255] & 255;
                     ++var15;
                     if (var23 == 0) {
                        ++var16;
                        var23 = 50;
                        var18 = var0.selector[var16];
                        var19 = var0.minLens[var18];
                        var20 = var0.limit[var18];
                        var21 = var0.perm[var18];
                        var22 = var0.base[var18];
                     }

                     --var23;
                     var24 = var19;

                     for(var25 = getBits(var19, var0); var25 > var20[var24]; var25 = var25 << 1 | var26) {
                        ++var24;
                        var26 = getBit(var0);
                     }

                     var27 = var21[var25 - var22[var24]];
                  } else {
                     var28 = -1;
                     var29 = 1;

                     do {
                        if (var27 == 0) {
                           var28 += var29;
                        } else if (var27 == 1) {
                           var28 += var29 * 2;
                        }

                        var29 *= 2;
                        if (var23 == 0) {
                           ++var16;
                           var23 = 50;
                           var18 = var0.selector[var16];
                           var19 = var0.minLens[var18];
                           var20 = var0.limit[var18];
                           var21 = var0.perm[var18];
                           var22 = var0.base[var18];
                        }

                        --var23;
                        var24 = var19;

                        for(var25 = getBits(var19, var0); var25 > var20[var24]; var25 = var25 << 1 | var26) {
                           ++var24;
                           var26 = getBit(var0);
                        }

                        var27 = var21[var25 - var22[var24]];
                     } while(var27 == 0 || var27 == 1);

                     ++var28;
                     var2 = var0.aByteArray3[var0.mtfa[var0.mtfbase[0]] & 255];
                     var10000 = var0.unzftab;

                     for(var10000[var2 & 255] += var28; var28 > 0; --var28) {
                        BZip2State.tt[var15] = var2 & 255;
                        ++var15;
                     }
                  }
               }

               var0.state_out_len = 0;
               var0.state_out_ch = 0;
               var0.anIntArray2[0] = 0;

               for(var3 = 1; var3 <= 256; ++var3) {
                  var0.anIntArray2[var3] = var0.unzftab[var3 - 1];
               }

               for(var3 = 1; var3 <= 256; ++var3) {
                  var10000 = var0.anIntArray2;
                  var10000[var3] += var0.anIntArray2[var3 - 1];
               }

               for(var3 = 0; var3 < var15; ++var3) {
                  var2 = (byte)(BZip2State.tt[var3] & 255);
                  var10000 = BZip2State.tt;
                  int var10001 = var0.anIntArray2[var2 & 255];
                  var10000[var10001] |= var3 << 8;
                  var10002 = var0.anIntArray2[var2 & 255]++;
               }

               var0.tPos = BZip2State.tt[var0.origPtr] >> 8;
               var0.c_nblock_used = 0;
               var0.tPos = BZip2State.tt[var0.tPos];
               var0.k0 = (byte)(var0.tPos & 255);
               var0.tPos >>= 8;
               ++var0.c_nblock_used;
               var0.save_nblock = var15;
               finish(var0);
               if (var0.c_nblock_used == var0.save_nblock + 1 && var0.state_out_len == 0) {
                  var1 = true;
                  break;
               }

               var1 = false;
               break;
            }
         }

         return;
      }
   }

   private static void makeMaps(BZip2State var0) {
      var0.nInUse = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.inUse[var1]) {
            var0.aByteArray3[var0.nInUse] = (byte)var1;
            ++var0.nInUse;
         }
      }

   }

   private static void createDecodeTables(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      int var9;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      var9 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var9 += var1[var8 + 1] - var1[var8];
         var0[var8] = var9 - 1;
         var9 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   private static void finish(BZip2State var0) {
      byte var1 = var0.state_out_ch;
      int var2 = var0.state_out_len;
      int var3 = var0.c_nblock_used;
      int var4 = var0.k0;
      int[] var5 = BZip2State.tt;
      int var6 = var0.tPos;
      byte[] var7 = var0.decompressed;
      int var8 = var0.next_out;
      int var9 = var0.avail_out;
      int var11 = var0.save_nblock + 1;

      label66:
      while(true) {
         if (var2 > 0) {
            while(true) {
               if (var9 == 0) {
                  break label66;
               }

               if (var2 == 1) {
                  if (var9 == 0) {
                     var2 = 1;
                     break label66;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         boolean var12 = true;

         byte var13;
         while(var12) {
            var12 = false;
            if (var3 == var11) {
               var2 = 0;
               break label66;
            }

            var1 = (byte)var4;
            var6 = var5[var6];
            var13 = (byte)(var6 & 255);
            var6 >>= 8;
            ++var3;
            if (var13 != var4) {
               var4 = var13;
               if (var9 == 0) {
                  var2 = 1;
                  break label66;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
               var12 = true;
            } else if (var3 == var11) {
               if (var9 == 0) {
                  var2 = 1;
                  break label66;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
               var12 = true;
            }
         }

         var2 = 2;
         var6 = var5[var6];
         var13 = (byte)(var6 & 255);
         var6 >>= 8;
         ++var3;
         if (var3 != var11) {
            if (var13 == var4) {
               var2 = 3;
               var6 = var5[var6];
               var13 = (byte)(var6 & 255);
               var6 >>= 8;
               ++var3;
               if (var3 != var11) {
                  if (var13 == var4) {
                     var6 = var5[var6];
                     var13 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                     var2 = (var13 & 255) + 4;
                     var6 = var5[var6];
                     var4 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                  } else {
                     var4 = var13;
                  }
               }
            } else {
               var4 = var13;
            }
         }
      }

      int var14 = var0.total_out_lo32;
      var0.total_out_lo32 += var9 - var9;
      if (var0.total_out_lo32 < var14) {
         ++var0.total_out_hi32;
      }

      var0.state_out_ch = var1;
      var0.state_out_len = var2;
      var0.c_nblock_used = var3;
      var0.k0 = var4;
      BZip2State.tt = var5;
      var0.tPos = var6;
      var0.next_out = var8;
      var0.avail_out = var9;
   }
   
   static class BZip2State {
      public static int[] tt;
      public int anInt21;
      public int nInUse;
      public byte state_out_ch;
      public int bsLive;
      private final int BZ_MAX_ALPHA_SIZE = 258;
      public int state_out_len;
      public int c_nblock_used;
      public byte[] stream;
      public int bsBuff;
      private final int BZ_MAX_CODE_LEN = 23;
      public boolean[] inUse = new boolean[256];
      public int k0;
      public int next_in;
      private final int anInt5 = 1;
      public int tPos;
      public byte[] decompressed;
      public byte[] aByteArray3 = new byte[256];
      private final int BZ_G_SIZE = 50;
      public int next_out;
      public int avail_out;
      private final int anInt8 = 4;
      public int save_nblock;
      private final int BZ_MAX_SELECTORS = 18002;
      public int[] unzftab = new int[256];
      public int total_out_lo32;
      public int avail_in;
      public int[] anIntArray2 = new int[257];
      private int[] anIntArray3 = new int[257];
      public int total_in_lo32;
      public int currBlockNo;
      public boolean[] inUse16 = new boolean[16];
      public int total_out_hi32;
      public byte[] mtfa = new byte[4096];
      public int total_in_hi32;
      public int[] mtfbase = new int[16];
      public byte[] selector = new byte[18002];
      public byte[] selectorMtf = new byte[18002];
      public byte[][] len = new byte[6][258];
      public int[][] limit = new int[6][258];
      public boolean blockRandomized;
      public int[][] base = new int[6][258];
      public int[][] perm = new int[6][258];
      public int origPtr;
      public int[] minLens = new int[6];
   }
}
