public final class Class47 {
   private int anInt669;
   private int anInt667 = 0;
   public int[][] anIntArrayArray16;
   private boolean aBoolean168 = false;
   private int anInt670;
   private int anInt668 = 0;
   private int anInt665 = -766;
   private boolean aBoolean169 = true;
   private int anInt666 = 3;
   private boolean aBoolean170 = true;

   public Class47(int var1, int var2, int var3) {
      this.anInt669 = var3;
      this.anInt670 = var1;
      this.anIntArrayArray16 = new int[this.anInt669][this.anInt670];
      this.reset();
   }

   private void method487(int var1, int var2, int var3) {
      int[] var10000 = this.anIntArrayArray16[var1];
      var10000[var3] &= 16777215 - var2;
   }

   private void method484(int var1, int var2, int var3) {
      int[] var10000 = this.anIntArrayArray16[var1];
      var10000[var2] |= var3;
   }

   public void method483(int var1, int var2) {
      int var3 = var2 - this.anInt667;
      int var4 = var1 - this.anInt668;
      int[] var10000 = this.anIntArrayArray16[var3];
      var10000[var4] |= 2097152;
   }

   public void reset() {
      for(int var1 = 0; var1 < this.anInt669; ++var1) {
         for(int var2 = 0; var2 < this.anInt670; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 != this.anInt669 - 1 && var2 != this.anInt670 - 1) {
               this.anIntArrayArray16[var1][var2] = 16777216;
            } else {
               this.anIntArrayArray16[var1][var2] = 16777215;
            }
         }
      }

   }

   public boolean method489(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var4 == var1 && var5 == var2) {
         return true;
      } else {
         int var7 = var4 - this.anInt667;
         int var8 = var5 - this.anInt668;
         int var9 = var1 - this.anInt667;
         int var10 = var2 - this.anInt668;
         if (var3 == 0) {
            if (var6 == 0) {
               if (var7 == var9 - 1 && var8 == var10) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 19398944) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 19398914) == 0) {
                  return true;
               }
            } else if (var6 == 1) {
               if (var7 == var9 && var8 == var10 + 1) {
                  return true;
               }

               if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19398920) == 0) {
                  return true;
               }

               if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19399040) == 0) {
                  return true;
               }
            } else if (var6 == 2) {
               if (var7 == var9 + 1 && var8 == var10) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 19398944) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 19398914) == 0) {
                  return true;
               }
            } else if (var6 == 3) {
               if (var7 == var9 && var8 == var10 - 1) {
                  return true;
               }

               if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19398920) == 0) {
                  return true;
               }

               if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19399040) == 0) {
                  return true;
               }
            }
         }

         if (var3 == 2) {
            if (var6 == 0) {
               if (var7 == var9 - 1 && var8 == var10) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1) {
                  return true;
               }

               if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19399040) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 19398914) == 0) {
                  return true;
               }
            } else if (var6 == 1) {
               if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19398920) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1) {
                  return true;
               }

               if (var7 == var9 + 1 && var8 == var10) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 19398914) == 0) {
                  return true;
               }
            } else if (var6 == 2) {
               if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19398920) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 19398944) == 0) {
                  return true;
               }

               if (var7 == var9 + 1 && var8 == var10) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1) {
                  return true;
               }
            } else if (var6 == 3) {
               if (var7 == var9 - 1 && var8 == var10) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 19398944) == 0) {
                  return true;
               }

               if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 19399040) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1) {
                  return true;
               }
            }
         }

         if (var3 == 9) {
            if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 32) == 0) {
               return true;
            }

            if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 2) == 0) {
               return true;
            }

            if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 8) == 0) {
               return true;
            }

            if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 128) == 0) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method491(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 + var1 - 1;
      int var9 = var6 + var5 - 1;
      if (var2 >= var3 && var2 <= var8 && var7 >= var6 && var7 <= var9) {
         return true;
      } else if (var2 == var3 - 1 && var7 >= var6 && var7 <= var9 && (this.anIntArrayArray16[var2 - this.anInt667][var7 - this.anInt668] & 8) == 0 && (var4 & 8) == 0) {
         return true;
      } else if (var2 == var8 + 1 && var7 >= var6 && var7 <= var9 && (this.anIntArrayArray16[var2 - this.anInt667][var7 - this.anInt668] & 128) == 0 && (var4 & 2) == 0) {
         return true;
      } else if (var7 == var6 - 1 && var2 >= var3 && var2 <= var8 && (this.anIntArrayArray16[var2 - this.anInt667][var7 - this.anInt668] & 2) == 0 && (var4 & 4) == 0) {
         return true;
      } else {
         return var7 == var9 + 1 && var2 >= var3 && var2 <= var8 && (this.anIntArrayArray16[var2 - this.anInt667][var7 - this.anInt668] & 32) == 0 && (var4 & 1) == 0;
      }
   }

   public boolean method490(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var3 == var2 && var1 == var6) {
         return true;
      } else {
         int var7 = var3 - this.anInt667;
         int var8 = var1 - this.anInt668;
         int var9 = var2 - this.anInt667;
         int var10 = var6 - this.anInt668;
         if (var5 == 6 || var5 == 7) {
            if (var5 == 7) {
               var4 = var4 + 2 & 3;
            }

            if (var4 == 0) {
               if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 128) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 2) == 0) {
                  return true;
               }
            } else if (var4 == 1) {
               if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 8) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 2) == 0) {
                  return true;
               }
            } else if (var4 == 2) {
               if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 8) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 32) == 0) {
                  return true;
               }
            } else if (var4 == 3) {
               if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 128) == 0) {
                  return true;
               }

               if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 32) == 0) {
                  return true;
               }
            }
         }

         if (var5 == 8) {
            if (var7 == var9 && var8 == var10 + 1 && (this.anIntArrayArray16[var7][var8] & 32) == 0) {
               return true;
            }

            if (var7 == var9 && var8 == var10 - 1 && (this.anIntArrayArray16[var7][var8] & 2) == 0) {
               return true;
            }

            if (var7 == var9 - 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 8) == 0) {
               return true;
            }

            if (var7 == var9 + 1 && var8 == var10 && (this.anIntArrayArray16[var7][var8] & 128) == 0) {
               return true;
            }
         }

         return false;
      }
   }

   public void method485(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var2 - this.anInt667;
      int var7 = var3 - this.anInt668;
      if (var4 == 0) {
         if (var1 == 0) {
            this.method487(var6, 128, var7);
            this.method487(var6 - 1, 8, var7);
         }

         if (var1 == 1) {
            this.method487(var6, 2, var7);
            this.method487(var6, 32, var7 + 1);
         }

         if (var1 == 2) {
            this.method487(var6, 8, var7);
            this.method487(var6 + 1, 128, var7);
         }

         if (var1 == 3) {
            this.method487(var6, 32, var7);
            this.method487(var6, 2, var7 - 1);
         }
      }

      if (var4 == 1 || var4 == 3) {
         if (var1 == 0) {
            this.method487(var6, 1, var7);
            this.method487(var6 - 1, 16, var7 + 1);
         }

         if (var1 == 1) {
            this.method487(var6, 4, var7);
            this.method487(var6 + 1, 64, var7 + 1);
         }

         if (var1 == 2) {
            this.method487(var6, 16, var7);
            this.method487(var6 + 1, 1, var7 - 1);
         }

         if (var1 == 3) {
            this.method487(var6, 64, var7);
            this.method487(var6 - 1, 4, var7 - 1);
         }
      }

      if (var4 == 2) {
         if (var1 == 0) {
            this.method487(var6, 130, var7);
            this.method487(var6 - 1, 8, var7);
            this.method487(var6, 32, var7 + 1);
         }

         if (var1 == 1) {
            this.method487(var6, 10, var7);
            this.method487(var6, 32, var7 + 1);
            this.method487(var6 + 1, 128, var7);
         }

         if (var1 == 2) {
            this.method487(var6, 40, var7);
            this.method487(var6 + 1, 128, var7);
            this.method487(var6, 2, var7 - 1);
         }

         if (var1 == 3) {
            this.method487(var6, 160, var7);
            this.method487(var6, 2, var7 - 1);
            this.method487(var6 - 1, 8, var7);
         }
      }

      if (var5) {
         if (var4 == 0) {
            if (var1 == 0) {
               this.method487(var6, 65536, var7);
               this.method487(var6 - 1, 4096, var7);
            }

            if (var1 == 1) {
               this.method487(var6, 1024, var7);
               this.method487(var6, 16384, var7 + 1);
            }

            if (var1 == 2) {
               this.method487(var6, 4096, var7);
               this.method487(var6 + 1, 65536, var7);
            }

            if (var1 == 3) {
               this.method487(var6, 16384, var7);
               this.method487(var6, 1024, var7 - 1);
            }
         }

         if (var4 == 1 || var4 == 3) {
            if (var1 == 0) {
               this.method487(var6, 512, var7);
               this.method487(var6 - 1, 8192, var7 + 1);
            }

            if (var1 == 1) {
               this.method487(var6, 2048, var7);
               this.method487(var6 + 1, 32768, var7 + 1);
            }

            if (var1 == 2) {
               this.method487(var6, 8192, var7);
               this.method487(var6 + 1, 512, var7 - 1);
            }

            if (var1 == 3) {
               this.method487(var6, 32768, var7);
               this.method487(var6 - 1, 2048, var7 - 1);
            }
         }

         if (var4 == 2) {
            if (var1 == 0) {
               this.method487(var6, 66560, var7);
               this.method487(var6 - 1, 4096, var7);
               this.method487(var6, 16384, var7 + 1);
            }

            if (var1 == 1) {
               this.method487(var6, 5120, var7);
               this.method487(var6, 16384, var7 + 1);
               this.method487(var6 + 1, 65536, var7);
            }

            if (var1 == 2) {
               this.method487(var6, 20480, var7);
               this.method487(var6 + 1, 65536, var7);
               this.method487(var6, 1024, var7 - 1);
            }

            if (var1 == 3) {
               this.method487(var6, 81920, var7);
               this.method487(var6, 1024, var7 - 1);
               this.method487(var6 - 1, 4096, var7);
               return;
            }
         }
      }

   }

   public void method488(int var1, int var2) {
      int var3 = var1 - this.anInt667;
      int var4 = var2 - this.anInt668;
      int[] var10000 = this.anIntArrayArray16[var3];
      var10000[var4] &= 14680063;
   }

   public void method482(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7 = 256;
      if (var5) {
         var7 = 131328;
      }

      int var8 = var6 - this.anInt667;
      int var9 = var1 - this.anInt668;
      int var10;
      if (var2 == 1 || var2 == 3) {
         var10 = var4;
         var4 = var3;
         var3 = var10;
      }

      for(var10 = var8; var10 < var8 + var4; ++var10) {
         if (var10 >= 0 && var10 < this.anInt669) {
            for(int var11 = var9; var11 < var9 + var3; ++var11) {
               if (var11 >= 0 && var11 < this.anInt670) {
                  this.method484(var10, var11, var7);
               }
            }
         }
      }

   }

   public void method481(int var1, boolean var2, int var3, int var4, int var5) {
      int var6 = var4 - this.anInt667;
      int var7 = var5 - this.anInt668;
      if (var3 == 0) {
         if (var1 == 0) {
            this.method484(var6, var7, 128);
            this.method484(var6 - 1, var7, 8);
         }

         if (var1 == 1) {
            this.method484(var6, var7, 2);
            this.method484(var6, var7 + 1, 32);
         }

         if (var1 == 2) {
            this.method484(var6, var7, 8);
            this.method484(var6 + 1, var7, 128);
         }

         if (var1 == 3) {
            this.method484(var6, var7, 32);
            this.method484(var6, var7 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var1 == 0) {
            this.method484(var6, var7, 1);
            this.method484(var6 - 1, var7 + 1, 16);
         }

         if (var1 == 1) {
            this.method484(var6, var7, 4);
            this.method484(var6 + 1, var7 + 1, 64);
         }

         if (var1 == 2) {
            this.method484(var6, var7, 16);
            this.method484(var6 + 1, var7 - 1, 1);
         }

         if (var1 == 3) {
            this.method484(var6, var7, 64);
            this.method484(var6 - 1, var7 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var1 == 0) {
            this.method484(var6, var7, 130);
            this.method484(var6 - 1, var7, 8);
            this.method484(var6, var7 + 1, 32);
         }

         if (var1 == 1) {
            this.method484(var6, var7, 10);
            this.method484(var6, var7 + 1, 32);
            this.method484(var6 + 1, var7, 128);
         }

         if (var1 == 2) {
            this.method484(var6, var7, 40);
            this.method484(var6 + 1, var7, 128);
            this.method484(var6, var7 - 1, 2);
         }

         if (var1 == 3) {
            this.method484(var6, var7, 160);
            this.method484(var6, var7 - 1, 2);
            this.method484(var6 - 1, var7, 8);
         }
      }

      if (var2) {
         if (var3 == 0) {
            if (var1 == 0) {
               this.method484(var6, var7, 65536);
               this.method484(var6 - 1, var7, 4096);
            }

            if (var1 == 1) {
               this.method484(var6, var7, 1024);
               this.method484(var6, var7 + 1, 16384);
            }

            if (var1 == 2) {
               this.method484(var6, var7, 4096);
               this.method484(var6 + 1, var7, 65536);
            }

            if (var1 == 3) {
               this.method484(var6, var7, 16384);
               this.method484(var6, var7 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var1 == 0) {
               this.method484(var6, var7, 512);
               this.method484(var6 - 1, var7 + 1, 8192);
            }

            if (var1 == 1) {
               this.method484(var6, var7, 2048);
               this.method484(var6 + 1, var7 + 1, 32768);
            }

            if (var1 == 2) {
               this.method484(var6, var7, 8192);
               this.method484(var6 + 1, var7 - 1, 512);
            }

            if (var1 == 3) {
               this.method484(var6, var7, 32768);
               this.method484(var6 - 1, var7 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var1 == 0) {
               this.method484(var6, var7, 66560);
               this.method484(var6 - 1, var7, 4096);
               this.method484(var6, var7 + 1, 16384);
            }

            if (var1 == 1) {
               this.method484(var6, var7, 5120);
               this.method484(var6, var7 + 1, 16384);
               this.method484(var6 + 1, var7, 65536);
            }

            if (var1 == 2) {
               this.method484(var6, var7, 20480);
               this.method484(var6 + 1, var7, 65536);
               this.method484(var6, var7 - 1, 1024);
            }

            if (var1 == 3) {
               this.method484(var6, var7, 81920);
               this.method484(var6, var7 - 1, 1024);
               this.method484(var6 - 1, var7, 4096);
               return;
            }
         }
      }

   }

   public void method486(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      int var8 = 256;
      if (var6) {
         var8 = 131328;
      }

      int var9 = var3 - this.anInt667;
      if (var1 != 2) {
         this.aBoolean169 = !this.aBoolean169;
      }

      int var10 = var2 - this.anInt668;
      int var11;
      if (var4 == 1 || var4 == 3) {
         var11 = var7;
         var7 = var5;
         var5 = var11;
      }

      for(var11 = var9; var11 < var9 + var7; ++var11) {
         if (var11 >= 0 && var11 < this.anInt669) {
            for(int var12 = var10; var12 < var10 + var5; ++var12) {
               if (var12 >= 0 && var12 < this.anInt670) {
                  this.method487(var11, var8, var12);
               }
            }
         }
      }

   }
}
