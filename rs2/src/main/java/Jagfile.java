public final class Jagfile {
   private int anInt29 = -766;
   private boolean aBoolean2 = true;
   private int fileCount;
   private int[] fileHash;
   private byte[] buffer;
   private boolean unpacked;
   private int[] fileUnpackedSize;
   private int[] fileOffset;
   private int[] filePackedSize;

   public Jagfile(byte[] var1) {
      this.load(var1);
   }

   public byte[] read(String var1, byte[] var2) {
      int var3 = 0;
      String var4 = var1.toUpperCase();

      int var5;
      for(var5 = 0; var5 < var4.length(); ++var5) {
         var3 = var3 * 61 + var4.charAt(var5) - 32;
      }

      for(var5 = 0; var5 < this.fileCount; ++var5) {
         if (this.fileHash[var5] == var3) {
            if (var2 == null) {
               var2 = new byte[this.fileUnpackedSize[var5]];
            }

            if (this.unpacked) {
               if (this.fileUnpackedSize[var5] >= 0) {
                  System.arraycopy(this.buffer, this.fileOffset[var5], var2, 0, this.fileUnpackedSize[var5]);
               }
            } else {
               BZip2.read(var2, this.fileUnpackedSize[var5], this.buffer, this.filePackedSize[var5], this.fileOffset[var5]);
            }

            return var2;
         }
      }

      return null;
   }

   private void load(byte[] var1) {
      Packet var2 = new Packet(var1);
      int var3 = var2.g3();
      int var4 = var2.g3();
      if (var4 == var3) {
         this.buffer = var1;
         this.unpacked = false;
      } else {
         byte[] var7 = new byte[var3];
         BZip2.read(var7, var3, var1, var4, 6);
         this.buffer = var7;
         var2 = new Packet(this.buffer);
         this.unpacked = true;
      }

      this.fileCount = var2.g2();
      this.fileHash = new int[this.fileCount];
      this.fileUnpackedSize = new int[this.fileCount];
      this.filePackedSize = new int[this.fileCount];
      this.fileOffset = new int[this.fileCount];
      int var5 = var2.pos + this.fileCount * 10;

      for(int var6 = 0; var6 < this.fileCount; ++var6) {
         this.fileHash[var6] = var2.g4();
         this.fileUnpackedSize[var6] = var2.g3();
         this.filePackedSize[var6] = var2.g3();
         this.fileOffset[var6] = var5;
         var5 += this.filePackedSize[var6];
      }

   }
}
