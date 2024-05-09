public final class WordFilter {
   private static int anInt658 = 3;
   private static int anInt660 = -761;
   private static int anInt661 = -48545;
   private static byte aByte37 = -113;
   private static int anInt663 = 3;
   private static int anInt664 = -939;
   private static boolean aBoolean166 = true;
   private static final String[] aStringArray6 = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
   private static char[][] aCharArrayArray3;
   private static int[] anIntArray177;
   private static char[][] aCharArrayArray1;
   private static boolean aBoolean163;
   private static byte[][][] aByteArrayArrayArray7;
   private static char[][] aCharArrayArray2;
   private static boolean aBoolean165;
   private static int[] anIntArray176;

   public static String method452(String var0) {
      long var1 = System.currentTimeMillis();
      char[] var3 = var0.toCharArray();
      method450(var3);
      String var4 = (new String(var3)).trim();
      char[] var5 = var4.toLowerCase().toCharArray();
      String var6 = var4.toLowerCase();
      method460(var5);
      method455(var5, anInt661);
      method456(var5);
      method469(var5);

      for(int var7 = 0; var7 < aStringArray6.length; ++var7) {
         int var8 = -1;

         while((var8 = var6.indexOf(aStringArray6[var7], var8 + 1)) != -1) {
            char[] var9 = aStringArray6[var7].toCharArray();

            for(int var10 = 0; var10 < var9.length; ++var10) {
               var5[var10 + var8] = var9[var10];
            }
         }
      }

      method453(var5, var4.toCharArray());
      method454(var5);
      long var11 = System.currentTimeMillis();
      return (new String(var5)).trim();
   }

   private static void method450(char[] var0) {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < var0.length; ++var2) {
         if (method451(var0[var2])) {
            var0[var1] = var0[var2];
         } else {
            var0[var1] = ' ';
         }

         if (var1 == 0 || var0[var1] != ' ' || var0[var1 - 1] != ' ') {
            ++var1;
         }
      }

      for(var2 = var1; var2 < var0.length; ++var2) {
         var0[var2] = ' ';
      }

   }

   private static void method460(char[] var0) {
      char[] var1 = (char[])var0.clone();
      char[] var2 = new char[]{'d', 'o', 't'};
      method464((byte[][])null, var2, var1);
      char[] var3 = (char[])var0.clone();
      char[] var4 = new char[]{'s', 'l', 'a', 's', 'h'};
      method464((byte[][])null, var4, var3);

      for(int var5 = 0; var5 < aCharArrayArray3.length; ++var5) {
         method461(var0, (byte)7, var1, anIntArray177[var5], aCharArrayArray3[var5], var3);
      }

   }

   private static void method455(char[] var0, int var1) {
      for(int var2 = 0; var2 < 2; ++var2) {
         for(int var3 = aCharArrayArray1.length - 1; var3 >= 0; --var3) {
            method464(aByteArrayArrayArray7[var3], aCharArrayArray1[var3], var0);
         }
      }

      if (var1 != -48545) {
         aBoolean163 = !aBoolean163;
      }

   }

   private static void method456(char[] var0) {
      char[] var1 = (char[])var0.clone();
      char[] var2 = new char[]{'(', 'a', ')'};
      method464((byte[][])null, var2, var1);
      char[] var3 = (char[])var0.clone();
      char[] var4 = new char[]{'d', 'o', 't'};
      method464((byte[][])null, var4, var3);

      for(int var5 = aCharArrayArray2.length - 1; var5 >= 0; --var5) {
         method457(var0, var3, var1, aCharArrayArray2[var5]);
      }

   }

   private static void method469(char[] var0) {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      while(true) {
         int var4;
         do {
            if ((var4 = method470(var1, var0)) == -1) {
               return;
            }

            boolean var5 = false;

            int var6;
            for(var6 = var1; var6 >= 0 && var6 < var4 && !var5; ++var6) {
               if (!method472(var0[var6]) && !method473(var0[var6])) {
                  var5 = true;
               }
            }

            if (var5) {
               var2 = 0;
            }

            if (var2 == 0) {
               var3 = var4;
            }

            var1 = method471(var4, var0);
            var6 = 0;

            for(int var7 = var4; var7 < var1; ++var7) {
               var6 = var6 * 10 + var0[var7] - 48;
            }

            if (var6 <= 255 && var1 - var4 <= 8) {
               ++var2;
            } else {
               var2 = 0;
            }
         } while(var2 != 4);

         for(var4 = var3; var4 < var1; ++var4) {
            var0[var4] = '*';
         }

         var2 = 0;
      }
   }

   private static void method453(char[] var0, char[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var0[var2] != '*' && method477(var1[var2])) {
            var0[var2] = var1[var2];
         }
      }

   }

   private static void method454(char[] var0) {
      boolean var1 = true;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         char var3 = var0[var2];
         if (!method474(var3)) {
            var1 = true;
         } else if (var1) {
            if (method476(var3, aBoolean165)) {
               var1 = false;
            }
         } else if (method477(var3)) {
            var0[var2] = (char)(var3 + 'a' - 65);
         }
      }

   }

   private static boolean method451(char var0) {
      return var0 >= ' ' && var0 <= 127 || var0 == ' ' || var0 == '\n' || var0 == '\t' || var0 == 163 || var0 == 8364;
   }

   private static void method464(byte[][] var0, char[] var1, char[] var2) {
      int var3;
      if (var1.length <= var2.length) {
         for(int var4 = 0; var4 <= var2.length - var1.length; var4 += var3) {
            int var5 = var4;
            int var6 = 0;
            int var7 = 0;
            var3 = 1;
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;

            char var11;
            char var12;
            int var14;
            label165:
            while(true) {
               while(true) {
                  if (var5 >= var2.length || var9 && var10) {
                     break label165;
                  }

                  var11 = var2[var5];
                  var12 = 0;
                  if (var5 + 1 < var2.length) {
                     var12 = var2[var5 + 1];
                  }

                  int var13;
                  if (var6 < var1.length && (var13 = method467(var1[var6], var11, var12)) > 0) {
                     if (var13 == 1 && method475(var11)) {
                        var9 = true;
                     }

                     if (var13 == 2 && (method475(var11) || method475(var12))) {
                        var9 = true;
                     }

                     var5 += var13;
                     ++var6;
                  } else {
                     if (var6 == 0) {
                        break label165;
                     }

                     if ((var14 = method467(var1[var6 - 1], var11, var12)) > 0) {
                        var5 += var14;
                        if (var6 == 1) {
                           ++var3;
                        }
                     } else {
                        if (var6 >= var1.length || !method473(var11)) {
                           break label165;
                        }

                        if (method472(var11) && var11 != '\'') {
                           var8 = true;
                        }

                        if (method475(var11)) {
                           var10 = true;
                        }

                        ++var5;
                        ++var7;
                        if (var7 * 100 / (var5 - var4) > 90) {
                           break label165;
                        }
                     }
                  }
               }
            }

            if (var6 >= var1.length && (!var9 || !var10)) {
               boolean var22 = true;
               int var23;
               int var24;
               if (var8) {
                  boolean var15 = false;
                  boolean var16 = false;
                  if (var4 - 1 < 0 || method472(var2[var4 - 1]) && var2[var4 - 1] != '\'') {
                     var15 = true;
                  }

                  if (var5 >= var2.length || method472(var2[var5]) && var2[var5] != '\'') {
                     var16 = true;
                  }

                  if (!var15 || !var16) {
                     boolean var17 = false;
                     var14 = var4 - 2;
                     if (var15) {
                        var14 = var4;
                     }

                     for(; !var17 && var14 < var5; ++var14) {
                        if (var14 >= 0 && (!method472(var2[var14]) || var2[var14] == '\'')) {
                           char[] var18 = new char[3];

                           int var19;
                           for(var19 = 0; var19 < 3 && var14 + var19 < var2.length && (!method472(var2[var14 + var19]) || var2[var14 + var19] == '\''); ++var19) {
                              var18[var19] = var2[var14 + var19];
                           }

                           boolean var20 = true;
                           if (var19 == 0) {
                              var20 = false;
                           }

                           if (var19 < 3 && var14 - 1 >= 0 && (!method472(var2[var14 - 1]) || var2[var14 - 1] == '\'')) {
                              var20 = false;
                           }

                           if (var20 && !method478(var18, 463)) {
                              var17 = true;
                           }
                        }
                     }

                     if (!var17) {
                        var22 = false;
                     }
                  }
               } else {
                  var11 = ' ';
                  if (var4 - 1 >= 0) {
                     var11 = var2[var4 - 1];
                  }

                  var12 = ' ';
                  if (var5 < var2.length) {
                     var12 = var2[var5];
                  }

                  var23 = method468(var11);
                  var24 = method468(var12);
                  if (var0 != null && method465((byte)var24, var0, (byte)var23)) {
                     var22 = false;
                  }
               }

               if (var22) {
                  var23 = 0;
                  var24 = 0;
                  int var25 = -1;

                  for(var14 = var4; var14 < var5; ++var14) {
                     if (method475(var2[var14])) {
                        ++var23;
                     } else if (method474(var2[var14])) {
                        ++var24;
                        var25 = var14;
                     }
                  }

                  if (var25 > -1) {
                     var23 -= var5 - var25 - 1;
                  }

                  if (var23 <= var24) {
                     for(int var21 = var4; var21 < var5; ++var21) {
                        var2[var21] = '*';
                     }
                  } else {
                     var3 = 1;
                  }
               }
            }
         }
      }

   }

   private static int method467(char var0, char var1, char var2) {
      if (var0 == var1) {
         return 1;
      } else {
         if (var0 >= 'a' && var0 <= 'm') {
            if (var0 == 'a') {
               if (var1 != '4' && var1 != '@' && var1 != '^') {
                  if (var1 == '/' && var2 == '\\') {
                     return 2;
                  }

                  return 0;
               }

               return 1;
            }

            if (var0 == 'b') {
               if (var1 != '6' && var1 != '8') {
                  if ((var1 != '1' || var2 != '3') && (var1 != 'i' || var2 != '3')) {
                     return 0;
                  }

                  return 2;
               }

               return 1;
            }

            if (var0 == 'c') {
               if (var1 != '(' && var1 != '<' && var1 != '{' && var1 != '[') {
                  return 0;
               }

               return 1;
            }

            if (var0 == 'd') {
               if (var1 == '[' && var2 == ')' || var1 == 'i' && var2 == ')') {
                  return 2;
               }

               return 0;
            }

            if (var0 == 'e') {
               if (var1 != '3' && var1 != 8364) {
                  return 0;
               }

               return 1;
            }

            if (var0 == 'f') {
               if (var1 == 'p' && var2 == 'h') {
                  return 2;
               }

               if (var1 == 163) {
                  return 1;
               }

               return 0;
            }

            if (var0 == 'g') {
               if (var1 != '9' && var1 != '6' && var1 != 'q') {
                  return 0;
               }

               return 1;
            }

            if (var0 == 'h') {
               if (var1 == '#') {
                  return 1;
               }

               return 0;
            }

            if (var0 == 'i') {
               if (var1 != 'y' && var1 != 'l' && var1 != 'j' && var1 != '1' && var1 != '!' && var1 != ':' && var1 != ';' && var1 != '|') {
                  return 0;
               }

               return 1;
            }

            if (var0 == 'j') {
               return 0;
            }

            if (var0 == 'k') {
               return 0;
            }

            if (var0 == 'l') {
               if (var1 != '1' && var1 != '|' && var1 != 'i') {
                  return 0;
               }

               return 1;
            }

            if (var0 == 'm') {
               return 0;
            }
         }

         if (var0 >= 'n' && var0 <= 'z') {
            if (var0 == 'n') {
               return 0;
            }

            if (var0 == 'o') {
               if (var1 != '0' && var1 != '*') {
                  if ((var1 != '(' || var2 != ')') && (var1 != '[' || var2 != ']') && (var1 != '{' || var2 != '}') && (var1 != '<' || var2 != '>')) {
                     return 0;
                  }

                  return 2;
               }

               return 1;
            }

            if (var0 == 'p') {
               return 0;
            }

            if (var0 == 'q') {
               return 0;
            }

            if (var0 == 'r') {
               return 0;
            }

            if (var0 == 's') {
               if (var1 != '5' && var1 != 'z' && var1 != '$' && var1 != '2') {
                  return 0;
               }

               return 1;
            }

            if (var0 == 't') {
               if (var1 != '7' && var1 != '+') {
                  return 0;
               }

               return 1;
            }

            if (var0 == 'u') {
               if (var1 == 'v') {
                  return 1;
               }

               if ((var1 != '\\' || var2 != '/') && (var1 != '\\' || var2 != '|') && (var1 != '|' || var2 != '/')) {
                  return 0;
               }

               return 2;
            }

            if (var0 == 'v') {
               if (var1 == '\\' && var2 == '/' || var1 == '\\' && var2 == '|' || var1 == '|' && var2 == '/') {
                  return 2;
               }

               return 0;
            }

            if (var0 == 'w') {
               if (var1 == 'v' && var2 == 'v') {
                  return 2;
               }

               return 0;
            }

            if (var0 == 'x') {
               if ((var1 != ')' || var2 != '(') && (var1 != '}' || var2 != '{') && (var1 != ']' || var2 != '[') && (var1 != '>' || var2 != '<')) {
                  return 0;
               }

               return 2;
            }

            if (var0 == 'y') {
               return 0;
            }

            if (var0 == 'z') {
               return 0;
            }
         }

         if (var0 >= '0' && var0 <= '9') {
            if (var0 != '0') {
               if (var0 == '1') {
                  return var1 == 'l' ? 1 : 0;
               } else {
                  return 0;
               }
            } else if (var1 != 'o' && var1 != 'O') {
               return (var1 != '(' || var2 != ')') && (var1 != '{' || var2 != '}') && (var1 != '[' || var2 != ']') ? 0 : 2;
            } else {
               return 1;
            }
         } else if (var0 == ',') {
            return var1 == '.' ? 1 : 0;
         } else if (var0 == '.') {
            return var1 == ',' ? 1 : 0;
         } else if (var0 == '!') {
            return var1 == 'i' ? 1 : 0;
         } else {
            return 0;
         }
      }
   }

   private static boolean method472(char var0) {
      return !method474(var0) && !method475(var0);
   }

   private static void method461(char[] var0, byte var1, char[] var2, int var3, char[] var4, char[] var5) {
      if (var4.length <= var0.length) {
         int var6;
         for(int var7 = 0; var7 <= var0.length - var4.length; var7 += var6) {
            int var8 = var7;
            int var9 = 0;
            var6 = 1;

            int var11;
            int var12;
            label152:
            while(true) {
               while(true) {
                  if (var8 >= var0.length) {
                     break label152;
                  }

                  char var10 = var0[var8];
                  var11 = 0;
                  if (var8 + 1 < var0.length) {
                     var11 = var0[var8 + 1];
                  }

                  if (var9 < var4.length && (var12 = method466(var10, var4[var9], (char)var11)) > 0) {
                     var8 += var12;
                     ++var9;
                  } else {
                     if (var9 == 0) {
                        break label152;
                     }

                     int var13;
                     if ((var13 = method466(var10, var4[var9 - 1], (char)var11)) > 0) {
                        var8 += var13;
                        if (var9 == 1) {
                           ++var6;
                        }
                     } else {
                        if (var9 >= var4.length || !method472(var10)) {
                           break label152;
                        }

                        ++var8;
                     }
                  }
               }
            }

            if (var9 >= var4.length) {
               boolean var20 = false;
               var11 = method462(var2, var7, var0);
               var12 = method463(var5, var8 - 1, var0);
               if (var3 == 1 && var11 > 0 && var12 > 0) {
                  var20 = true;
               }

               if (var3 == 2 && (var11 > 2 && var12 > 0 || var11 > 0 && var12 > 2)) {
                  var20 = true;
               }

               if (var3 == 3 && var11 > 0 && var12 > 2) {
                  var20 = true;
               }

               boolean var21;
               if (var3 == 3 && var11 > 2 && var12 > 0) {
                  var21 = true;
               } else {
                  var21 = false;
               }

               if (var20) {
                  int var14 = var7;
                  int var15 = var8 - 1;
                  boolean var16;
                  int var17;
                  if (var11 > 2) {
                     if (var11 == 4) {
                        var16 = false;

                        for(var17 = var7 - 1; var17 >= 0; --var17) {
                           if (var16) {
                              if (var2[var17] != '*') {
                                 break;
                              }

                              var14 = var17;
                           } else if (var2[var17] == '*') {
                              var14 = var17;
                              var16 = true;
                           }
                        }
                     }

                     var16 = false;

                     for(var17 = var14 - 1; var17 >= 0; --var17) {
                        if (var16) {
                           if (method472(var0[var17])) {
                              break;
                           }

                           var14 = var17;
                        } else if (!method472(var0[var17])) {
                           var16 = true;
                           var14 = var17;
                        }
                     }
                  }

                  if (var12 > 2) {
                     if (var12 == 4) {
                        var16 = false;

                        for(var17 = var15 + 1; var17 < var0.length; ++var17) {
                           if (var16) {
                              if (var5[var17] != '*') {
                                 break;
                              }

                              var15 = var17;
                           } else if (var5[var17] == '*') {
                              var15 = var17;
                              var16 = true;
                           }
                        }
                     }

                     var16 = false;

                     for(var17 = var15 + 1; var17 < var0.length; ++var17) {
                        if (var16) {
                           if (method472(var0[var17])) {
                              break;
                           }

                           var15 = var17;
                        } else if (!method472(var0[var17])) {
                           var16 = true;
                           var15 = var17;
                        }
                     }
                  }

                  for(int var18 = var14; var18 <= var15; ++var18) {
                     var0[var18] = '*';
                  }
               }
            }
         }

         boolean var19 = false;
      }

   }

   private static boolean method474(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z';
   }

   private static byte method468(char var0) {
      if (var0 >= 'a' && var0 <= 'z') {
         return (byte)(var0 + 1 - 97);
      } else if (var0 == '\'') {
         return 28;
      } else {
         return var0 >= '0' && var0 <= '9' ? (byte)(var0 + 29 - 48) : 27;
      }
   }

   private static boolean method475(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   private static int method470(int var0, char[] var1) {
      for(int var2 = var0; var2 < var1.length && var2 >= 0; ++var2) {
         if (var1[var2] >= '0' && var1[var2] <= '9') {
            return var2;
         }
      }

      return -1;
   }

   private static boolean method473(char var0) {
      if (var0 >= 'a' && var0 <= 'z') {
         return var0 == 'v' || var0 == 'x' || var0 == 'j' || var0 == 'q' || var0 == 'z';
      } else {
         return true;
      }
   }

   private static boolean method465(byte var0, byte[][] var1, byte var2) {
      int var3 = 0;
      if (var1[0][0] == var2 && var1[0][1] == var0) {
         return true;
      } else {
         int var4 = var1.length - 1;
         if (var1[var4][0] == var2 && var1[var4][1] == var0) {
            return true;
         } else {
            do {
               int var5 = (var3 + var4) / 2;
               if (var1[var5][0] == var2 && var1[var5][1] == var0) {
                  return true;
               }

               if (var2 >= var1[var5][0] && (var2 != var1[var5][0] || var0 >= var1[var5][1])) {
                  var3 = var5;
               } else {
                  var4 = var5;
               }
            } while(var3 != var4 && var3 + 1 != var4);

            return false;
         }
      }
   }

   private static int method462(char[] var0, int var1, char[] var2) {
      int var3;
      if (aByte37 != -113) {
         for(var3 = 1; var3 > 0; ++var3) {
         }
      }

      if (var1 == 0) {
         return 2;
      } else {
         var3 = var1 - 1;

         while(true) {
            if (var3 >= 0 && method472(var2[var3])) {
               if (var2[var3] != ',' && var2[var3] != '.') {
                  --var3;
                  continue;
               }

               return 3;
            }

            int var4 = 0;

            for(int var5 = var1 - 1; var5 >= 0 && method472(var0[var5]); --var5) {
               if (var0[var5] == '*') {
                  ++var4;
               }
            }

            if (var4 >= 3) {
               return 4;
            }

            if (method472(var2[var1 - 1])) {
               return 1;
            }

            return 0;
         }
      }
   }

   private static int method466(char var0, char var1, char var2) {
      if (var1 == var0) {
         return 1;
      } else if (var1 == 'o' && var0 == '0') {
         return 1;
      } else if (var1 == 'o' && var0 == '(' && var2 == ')') {
         return 2;
      } else if (var1 == 'c' && (var0 == '(' || var0 == '<' || var0 == '[')) {
         return 1;
      } else if (var1 == 'e' && var0 == 8364) {
         return 1;
      } else if (var1 == 's' && var0 == '$') {
         return 1;
      } else {
         return var1 == 'l' && var0 == 'i' ? 1 : 0;
      }
   }

   private static int method463(char[] var0, int var1, char[] var2) {
      int var3;
      if (anInt663 > 3 || anInt663 < 3) {
         for(var3 = 1; var3 > 0; ++var3) {
         }
      }

      if (var1 + 1 == var2.length) {
         return 2;
      } else {
         var3 = var1 + 1;

         while(true) {
            if (var3 < var2.length && method472(var2[var3])) {
               if (var2[var3] != '\\' && var2[var3] != '/') {
                  ++var3;
                  continue;
               }

               return 3;
            }

            int var4 = 0;

            for(int var5 = var1 + 1; var5 < var2.length && method472(var0[var5]); ++var5) {
               if (var0[var5] == '*') {
                  ++var4;
               }
            }

            if (var4 >= 5) {
               return 4;
            }

            if (method472(var2[var1 + 1])) {
               return 1;
            }

            return 0;
         }
      }
   }

   private static int method471(int var0, char[] var1) {
      int var2 = var0;

      while(true) {
         if (var2 < var1.length && var2 >= 0) {
            if (var1[var2] >= '0' && var1[var2] <= '9') {
               ++var2;
               continue;
            }

            return var2;
         }

         return var1.length;
      }
   }

   private static boolean method477(char var0) {
      return var0 >= 'A' && var0 <= 'Z';
   }

   private static void method457(char[] var0, char[] var1, char[] var2, char[] var3) {
      int var4;
      if (var3.length <= var0.length) {
         for(int var5 = 0; var5 <= var0.length - var3.length; var5 += var4) {
            int var6 = var5;
            int var7 = 0;
            var4 = 1;

            int var9;
            int var10;
            int var11;
            label57:
            while(true) {
               while(true) {
                  if (var6 >= var0.length) {
                     break label57;
                  }

                  char var8 = var0[var6];
                  var9 = 0;
                  if (var6 + 1 < var0.length) {
                     var9 = var0[var6 + 1];
                  }

                  if (var7 < var3.length && (var10 = method466(var8, var3[var7], (char)var9)) > 0) {
                     var6 += var10;
                     ++var7;
                  } else {
                     if (var7 == 0) {
                        break label57;
                     }

                     if ((var11 = method466(var8, var3[var7 - 1], (char)var9)) > 0) {
                        var6 += var11;
                        if (var7 == 1) {
                           ++var4;
                        }
                     } else {
                        if (var7 >= var3.length || !method472(var8)) {
                           break label57;
                        }

                        ++var6;
                     }
                  }
               }
            }

            if (var7 >= var3.length) {
               boolean var12 = false;
               var9 = method458(var0, var2, var5);
               var10 = method459(var1, var6 - 1, var0);
               if (var9 > 2 || var10 > 2) {
                  var12 = true;
               }

               if (var12) {
                  for(var11 = var5; var11 < var6; ++var11) {
                     var0[var11] = '*';
                  }
               }
            }
         }
      }

   }

   private static boolean method476(char var0, boolean var1) {
      if (var1) {
         throw new NullPointerException();
      } else {
         return var0 >= 'a' && var0 <= 'z';
      }
   }

   private static boolean method478(char[] var0, int var1) {
      boolean var2 = true;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         if (!method475(var0[var3]) && var0[var3] != 0) {
            var2 = false;
         }
      }

      boolean var8 = false;
      if (var2) {
         return true;
      } else {
         int var4 = method479(var0, (byte)5);
         int var5 = 0;
         int var6 = anIntArray176.length - 1;
         if (var4 != anIntArray176[0] && var4 != anIntArray176[var6]) {
            do {
               int var7 = (var5 + var6) / 2;
               if (var4 == anIntArray176[var7]) {
                  return true;
               }

               if (var4 < anIntArray176[var7]) {
                  var6 = var7;
               } else {
                  var5 = var7;
               }
            } while(var5 != var6 && var5 + 1 != var6);

            return false;
         } else {
            return true;
         }
      }
   }

   private static int method458(char[] var0, char[] var1, int var2) {
      if (var2 == 0) {
         return 2;
      } else {
         int var3;
         for(var3 = var2 - 1; var3 >= 0 && method472(var0[var3]); --var3) {
            if (var0[var3] == '@') {
               return 3;
            }
         }

         var3 = 0;

         for(int var4 = var2 - 1; var4 >= 0 && method472(var1[var4]); --var4) {
            if (var1[var4] == '*') {
               ++var3;
            }
         }

         if (var3 >= 3) {
            return 4;
         } else {
            return method472(var0[var2 - 1]) ? 1 : 0;
         }
      }
   }

   private static int method479(char[] var0, byte var1) {
      if (var0.length > 6) {
         return 0;
      } else {
         int var2 = 0;
         boolean var3 = false;

         for(int var4 = 0; var4 < var0.length; ++var4) {
            char var5 = var0[var0.length - var4 - 1];
            if (var5 >= 'a' && var5 <= 'z') {
               var2 = var2 * 38 + var5 + 1 - 97;
            } else if (var5 == '\'') {
               var2 = var2 * 38 + 27;
            } else if (var5 >= '0' && var5 <= '9') {
               var2 = var2 * 38 + var5 + 28 - 48;
            } else if (var5 != 0) {
               return 0;
            }
         }

         return var2;
      }
   }

   private static int method459(char[] var0, int var1, char[] var2) {
      if (var1 + 1 == var2.length) {
         return 2;
      } else {
         int var3 = var1 + 1;

         while(true) {
            if (var3 < var2.length && method472(var2[var3])) {
               if (var2[var3] != '.' && var2[var3] != ',') {
                  ++var3;
                  continue;
               }

               return 3;
            }

            int var4 = 0;

            for(int var5 = var1 + 1; var5 < var2.length && method472(var0[var5]); ++var5) {
               if (var0[var5] == '*') {
                  ++var4;
               }
            }

            if (var4 >= 3) {
               return 4;
            }

            if (method472(var2[var1 + 1])) {
               return 1;
            }

            return 0;
         }
      }
   }

   public static void unpack(Jagfile var0) {
      Packet var1 = new Packet(var0.read("fragmentsenc.txt", (byte[])null));
      Packet var2 = new Packet(var0.read("badenc.txt", (byte[])null));
      Packet var3 = new Packet(var0.read("domainenc.txt", (byte[])null));
      Packet var4 = new Packet(var0.read("tldlist.txt", (byte[])null));
      method443(var1, var2, var3, var4);
   }

   private static void method443(Packet var0, Packet var1, Packet var2, Packet var3) {
      method445(var1);
      method446(var2);
      method447(var0);
      method444(var3);
   }

   private static void method445(Packet var0) {
      int var1 = var0.g4();
      aCharArrayArray1 = new char[var1][];
      aByteArrayArrayArray7 = new byte[var1][][];
      method448(var0, aCharArrayArray1, aByteArrayArrayArray7);
   }

   private static void method448(Packet var0, char[][] var1, byte[][][] var2) {
      for(int var3 = 0; var3 < var1.length; ++var3) {
         char[] var4 = new char[var0.g1()];

         for(int var5 = 0; var5 < var4.length; ++var5) {
            var4[var5] = (char)var0.g1();
         }

         var1[var3] = var4;
         byte[][] var7 = new byte[var0.g1()][2];

         for(int var6 = 0; var6 < var7.length; ++var6) {
            var7[var6][0] = (byte)var0.g1();
            var7[var6][1] = (byte)var0.g1();
         }

         if (var7.length > 0) {
            var2[var3] = var7;
         }
      }

   }

   private static void method446(Packet var0) {
      int var1 = var0.g4();
      aCharArrayArray2 = new char[var1][];
      method449(var0, aCharArrayArray2);
   }

   private static void method449(Packet var0, char[][] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         char[] var3 = new char[var0.g1()];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = (char)var0.g1();
         }

         var1[var2] = var3;
      }

   }

   private static void method447(Packet var0) {
      anIntArray176 = new int[var0.g4()];

      for(int var1 = 0; var1 < anIntArray176.length; ++var1) {
         anIntArray176[var1] = var0.g2();
      }

   }

   private static void method444(Packet var0) {
      int var1 = var0.g4();
      aCharArrayArray3 = new char[var1][];
      anIntArray177 = new int[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         anIntArray177[var2] = var0.g1();
         char[] var3 = new char[var0.g1()];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = (char)var0.g1();
         }

         aCharArrayArray3[var2] = var3;
      }

   }
}
