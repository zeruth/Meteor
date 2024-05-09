import javax.swing.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {
   protected int idleCycles;
   private int state;
   private int deltime = 20;
   protected boolean hasFocus = true;
   protected PixMap gameSurface;
   private int keyQueueWritePos;
   protected int anInt821;
   protected ViewBox frame;
   protected int screenWidth;
   protected Graphics graphics;
   protected int mindel = 1;
   private int keyQueueReadPos;
   protected int mouseButton;
   private boolean refresh = true;
   protected int screenHeight;
   public int mouseX;
   protected int anInt822;
   protected boolean aBoolean213 = false;
   private final int[] keyQueue = new int[128];
   protected int[] actionKey = new int[128];
   public int mouseY;
   private int mouseClickX;
   protected int anInt823;
   private int mouseClickY;
   private final int anInt805 = 8;
   private final boolean aBoolean212 = false;
   private long mousePressMs;
   private final int anInt806 = 3;
   private int mouseClickButton;
   private final long[] otim = new long[10];
   private final Pix24[] temp = new Pix24[6];
   protected long aLong28;
   protected int fps;

   public static JPanel gamePanel = new JPanel();

   public final void destroy() {
      this.state = -1;

      try {
         Thread.sleep(10000L);
      } catch (Exception var2) {
      }

      if (this.state == -1) {
         this.shutdown();
      }

   }

   protected final int pollKey() {
      int var1 = -1;
      if (this.keyQueueWritePos != this.keyQueueReadPos) {
         var1 = this.keyQueue[this.keyQueueReadPos];
         this.keyQueueReadPos = this.keyQueueReadPos + 1 & 127;
      }

      return var1;
   }

   protected void drawProgress(int var1, String var2) {
      while(this.graphics == null) {
         this.graphics = this.getBaseComponent().getGraphics();

         try {
            this.getBaseComponent().repaint();
         } catch (Exception var10) {
         }

         try {
            Thread.sleep(1000L);
         } catch (Exception var9) {
         }
      }

      Font var3 = new Font("Helvetica", 1, 13);
      FontMetrics var4 = this.getBaseComponent().getFontMetrics(var3);
      Font var5 = new Font("Helvetica", 0, 13);
      FontMetrics var6 = this.getBaseComponent().getFontMetrics(var5);
      if (this.refresh) {
         this.graphics.setColor(Color.black);
         this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
         this.refresh = false;
      }

      Color var7 = new Color(140, 17, 17);
      int var8 = this.screenHeight / 2 - 18;
      this.graphics.setColor(var7);
      this.graphics.drawRect(this.screenWidth / 2 - 152, var8, 304, 34);
      this.graphics.fillRect(this.screenWidth / 2 - 150, var8 + 2, var1 * 3, 30);
      this.graphics.setColor(Color.black);
      this.graphics.fillRect(this.screenWidth / 2 + var1 * 3 - 150, var8 + 2, 300 - var1 * 3, 30);
      this.graphics.setFont(var3);
      this.graphics.setColor(Color.white);
      this.graphics.drawString(var2, (this.screenWidth - var4.stringWidth(var2)) / 2, var8 + 22);
   }

   protected Component getBaseComponent() {
      return (Component)(this.frame == null ? this : this.frame);
   }

   public final void update(Graphics var1) {
      if (this.graphics == null) {
         this.graphics = var1;
      }

      this.refresh = true;
      this.refresh();
   }

   public final void paint(Graphics var1) {
      if (this.graphics == null) {
         this.graphics = var1;
      }

      this.refresh = true;
      this.refresh();
   }

   public void run() {
      this.getBaseComponent().addMouseListener(this);
      this.getBaseComponent().addMouseMotionListener(this);
      this.getBaseComponent().addKeyListener(this);
      this.getBaseComponent().addFocusListener(this);
      if (this.frame != null) {
         this.frame.addWindowListener(this);
      }

      this.drawProgress(0, "Loading...");
      this.load();
      int var1 = 0;
      int var2 = 256;
      int var3 = 1;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 0; var6 < 10; ++var6) {
         this.otim[var6] = System.currentTimeMillis();
      }

      long var12 = System.currentTimeMillis();

      while(true) {
         int var9;
         do {
            if (this.state < 0) {
               if (this.state == -1) {
                  this.shutdown();
               }

               return;
            }

            if (this.state > 0) {
               --this.state;
               if (this.state == 0) {
                  this.shutdown();
                  return;
               }
            }

            var9 = var2;
            int var10 = var3;
            var2 = 300;
            var3 = 1;
            var12 = System.currentTimeMillis();
            if (this.otim[var1] == 0L) {
               var2 = var9;
               var3 = var10;
            } else if (var12 > this.otim[var1]) {
               var2 = (int)((long)this.deltime * 2560L / (var12 - this.otim[var1]));
            }

            if (var2 < 25) {
               var2 = 25;
            }

            if (var2 > 256) {
               var2 = 256;
               var3 = (int)((long)this.deltime - (var12 - this.otim[var1]) / 10L);
            }

            if (var3 > this.deltime) {
               var3 = this.deltime;
            }

            this.otim[var1] = var12;
            var1 = (var1 + 1) % 10;
            if (var3 > 1) {
               for(int var11 = 0; var11 < 10; ++var11) {
                  if (this.otim[var11] != 0L) {
                     long[] var10000 = this.otim;
                     var10000[var11] += (long)var3;
                  }
               }
            }

            if (var3 < this.mindel) {
               var3 = this.mindel;
            }

            try {
               Thread.sleep((long)var3);
            } catch (InterruptedException var15) {
               ++var5;
            }

            while(var4 < 256) {
               this.anInt821 = this.mouseClickButton;
               this.anInt822 = this.mouseClickX;
               this.anInt823 = this.mouseClickY;
               this.aLong28 = this.mousePressMs;
               this.mouseClickButton = 0;
               this.update();
               this.keyQueueReadPos = this.keyQueueWritePos;
               var4 += var2;
            }

            var4 &= 255;
            if (this.deltime > 0) {
               this.fps = var2 * 1000 / (this.deltime * 256);
            }

            this.draw();
         } while(!this.aBoolean213);

         System.out.println("ntime:" + var12);

         for(int var8 = 0; var8 < 10; ++var8) {
            var9 = (var1 + 20 - var8 - 1) % 10;
            System.out.println("otim" + var9 + ":" + this.otim[var9]);
         }

         System.out.println("fps:" + this.fps + " ratio:" + var2 + " count:" + var4);
         System.out.println("del:" + var3 + " deltime:" + this.deltime + " mindel:" + this.mindel);
         System.out.println("intex:" + var5 + " opos:" + var1);
         this.aBoolean213 = false;
         var5 = 0;
      }
   }

   protected void load() {
   }

   protected void unload() {
   }

   public void startThread(Runnable var1, int var2) {
      Thread var3 = new Thread(var1);
      var3.start();
      var3.setPriority(var2);
   }

   protected void refresh() {
   }

   private void shutdown() {
      this.state = -2;
      this.unload();
      if (this.frame != null) {
         try {
            Thread.sleep(1000L);
         } catch (Exception var3) {
         }

         try {
            System.exit(0);
         } catch (Throwable var2) {
         }
      }

   }

   protected final void setCycleDelay() {
      this.deltime = 1000;
   }

   protected final void initApplet() {
      this.screenWidth = 765;
      this.screenHeight = 503;
      this.graphics = this.getBaseComponent().getGraphics();
      this.gameSurface = new PixMap(this.getBaseComponent(), this.screenWidth, this.screenHeight);
      this.startThread(this, 1);
   }

   protected final void initApplication() {
      this.screenWidth = 765;
      this.screenHeight = 503;
      this.frame = new ViewBox(this, this.screenWidth, this.screenHeight);
      this.graphics = this.getBaseComponent().getGraphics();
      this.gameSurface = new PixMap(this.getBaseComponent(), this.screenWidth, this.screenHeight);
      this.startThread(this, 1);
   }

   protected void draw() {
   }

   protected void update() {
   }

   public final void start() {
      if (this.state >= 0) {
         this.state = 0;
      }

   }

   public final void stop() {
      if (this.state >= 0) {
         this.state = 4000 / this.deltime;
      }

   }

   public final void mousePressed(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();

      this.idleCycles = 0;
      this.mouseClickX = var2;
      this.mouseClickY = var3;
      this.mousePressMs = System.currentTimeMillis();

      try {
         if ((var1.getModifiersEx() & 4096) != 0) {
            this.mouseClickButton = 2;
            this.mouseButton = 2;
         } else if ((var1.getModifiersEx() & 1024) != 0) {
            this.mouseClickButton = 1;
            this.mouseButton = 1;
         }
      } catch (NoSuchMethodError var5) {
         if (var1.isMetaDown()) {
            this.mouseClickButton = 2;
            this.mouseButton = 2;
         } else {
            this.mouseClickButton = 1;
            this.mouseButton = 1;
         }
      }

   }

   public final void mouseReleased(MouseEvent var1) {
      this.idleCycles = 0;
      this.mouseButton = 0;
   }

   public final void mouseClicked(MouseEvent var1) {
   }

   public final void mouseEntered(MouseEvent var1) {
   }

   public final void mouseExited(MouseEvent var1) {
      this.idleCycles = 0;
      this.mouseX = -1;
      this.mouseY = -1;
   }

   public final void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();

      this.idleCycles = 0;
      this.mouseX = var2;
      this.mouseY = var3;
   }

   public final void mouseMoved(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();

      this.idleCycles = 0;
      this.mouseX = var2;
      this.mouseY = var3;
   }

   public final void keyPressed(KeyEvent var1) {
      this.idleCycles = 0;
      int var2 = var1.getKeyCode();
      int var3 = var1.getKeyChar();
      if (var3 < 30) {
         var3 = 0;
      }

      if (var2 == 37) {
         var3 = 1;
      }

      if (var2 == 39) {
         var3 = 2;
      }

      if (var2 == 38) {
         var3 = 3;
      }

      if (var2 == 40) {
         var3 = 4;
      }

      if (var2 == 17) {
         var3 = 5;
      }

      if (var2 == 16) {
         var3 = 6;
      }

      if (var2 == 18) {
         var3 = 7;
      }

      if (var2 == 8) {
         var3 = 8;
      }

      if (var2 == 127) {
         var3 = 8;
      }

      if (var2 == 9) {
         var3 = 9;
      }

      if (var2 == 10) {
         var3 = 10;
      }

      if (var2 >= 112 && var2 <= 123) {
         var3 = var2 + 1008 - 112;
      }

      if (var2 == 36) {
         var3 = 1000;
      }

      if (var2 == 35) {
         var3 = 1001;
      }

      if (var2 == 33) {
         var3 = 1002;
      }

      if (var2 == 34) {
         var3 = 1003;
      }

      if (var3 > 0 && var3 < 128) {
         this.actionKey[var3] = 1;
      }

      if (var3 > 4) {
         this.keyQueue[this.keyQueueWritePos] = var3;
         this.keyQueueWritePos = this.keyQueueWritePos + 1 & 127;
      }

   }

   public final void keyReleased(KeyEvent var1) {
      this.idleCycles = 0;
      int var2 = var1.getKeyCode();
      char var3 = var1.getKeyChar();
      if (var3 < 30) {
         var3 = 0;
      }

      if (var2 == 37) {
         var3 = 1;
      }

      if (var2 == 39) {
         var3 = 2;
      }

      if (var2 == 38) {
         var3 = 3;
      }

      if (var2 == 40) {
         var3 = 4;
      }

      if (var2 == 17) {
         var3 = 5;
      }

      if (var2 == 16) {
         var3 = 6;
      }

      if (var2 == 18) {
         var3 = 7;
      }

      if (var2 == 8) {
         var3 = '\b';
      }

      if (var2 == 127) {
         var3 = '\b';
      }

      if (var2 == 9) {
         var3 = '\t';
      }

      if (var2 == 10) {
         var3 = '\n';
      }

      if (var3 > 0 && var3 < 128) {
         this.actionKey[var3] = 0;
      }

   }

   public final void keyTyped(KeyEvent var1) {
   }

   public final void focusGained(FocusEvent var1) {
      this.hasFocus = true;
      this.refresh = true;
      this.refresh();
   }

   public final void focusLost(FocusEvent var1) {
      this.hasFocus = false;

      for(int var2 = 0; var2 < 128; ++var2) {
         this.actionKey[var2] = 0;
      }

   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }
}
