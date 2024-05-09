import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class ClientStream implements Runnable {
   private boolean writer = false;
   private boolean closed = false;
   private boolean ioerror = false;
   private InputStream in;
   private int bufPos;
   private int bufLen;
   private OutputStream out;
   private byte[] buf;
   private GameShell shell;
   private Socket socket;

   public ClientStream(Socket var1, GameShell var2) throws IOException {
      this.shell = var2;
      this.socket = var1;
      this.socket.setSoTimeout(30000);
      this.socket.setTcpNoDelay(true);
      this.in = this.socket.getInputStream();
      this.out = this.socket.getOutputStream();
   }

   public int available() throws IOException {
      return this.closed ? 0 : this.in.available();
   }

   public void close() {
      this.closed = true;

      try {
         if (this.in != null) {
            this.in.close();
         }

         if (this.out != null) {
            this.out.close();
         }

         if (this.socket != null) {
            this.socket.close();
         }
      } catch (IOException var4) {
         System.out.println("Error closing stream");
      }

      this.writer = false;
      synchronized(this) {
         this.notify();
      }

      this.buf = null;
   }

   public void read(byte[] var1, int var2, int var3) throws IOException {
      if (!this.closed) {
         while(var3 > 0) {
            int var4 = this.in.read(var1, var2, var3);
            if (var4 <= 0) {
               throw new IOException("EOF");
            }

            var2 += var4;
            var3 -= var4;
         }

      }
   }

   public void write(int var1, byte[] var2) throws IOException {
      if (!this.closed) {
         if (this.ioerror) {
            this.ioerror = false;
            throw new IOException("Error in writer thread");
         }

         if (this.buf == null) {
            this.buf = new byte[5000];
         }

         synchronized(this) {
            for(int var4 = 0; var4 < var1; ++var4) {
               this.buf[this.bufPos] = var2[var4 + 0];
               this.bufPos = (this.bufPos + 1) % 5000;
               if (this.bufPos == (this.bufLen + 4900) % 5000) {
                  throw new IOException("buffer overflow");
               }
            }

            if (!this.writer) {
               this.writer = true;
               this.shell.startThread(this, 3);
            }

            this.notify();
         }
      }

   }

   public int read() throws IOException {
      return this.closed ? 0 : this.in.read();
   }

   public void printDebug() {
      System.out.println("dummy:" + this.closed);
      System.out.println("tcycl:" + this.bufLen);
      System.out.println("tnum:" + this.bufPos);
      System.out.println("writer:" + this.writer);
      System.out.println("ioerror:" + this.ioerror);

      try {
         System.out.println("available:" + this.available());
      } catch (IOException var2) {
      }

   }

   public void run() {
      while(this.writer) {
         int var1;
         int var2;
         synchronized(this) {
            if (this.bufPos == this.bufLen) {
               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }

            if (!this.writer) {
               return;
            }

            var2 = this.bufLen;
            if (this.bufPos >= this.bufLen) {
               var1 = this.bufPos - this.bufLen;
            } else {
               var1 = 5000 - this.bufLen;
            }
         }

         if (var1 > 0) {
            try {
               this.out.write(this.buf, var2, var1);
            } catch (IOException var7) {
               this.ioerror = true;
            }

            this.bufLen = (this.bufLen + var1) % 5000;

            try {
               if (this.bufPos == this.bufLen) {
                  this.out.flush();
               }
            } catch (IOException var6) {
               this.ioerror = true;
            }
         }
      }

   }
}
