import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class PixMap implements ImageProducer, ImageObserver {
   private ImageConsumer imageConsumer;
   private final int width;
   private final int height;
   public int[] pixels;
   private final Image image;
   private final ColorModel colorModel;

   public PixMap(Component var1, int var2, int var3) {
      this.width = var2;
      this.height = var3;
      this.pixels = new int[var2 * var3];
      this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
      this.image = var1.createImage(this);
      this.setPixels();
      var1.prepareImage(this.image, this);
      this.setPixels();
      var1.prepareImage(this.image, this);
      this.setPixels();
      var1.prepareImage(this.image, this);
      this.method130();
   }

   public synchronized void addConsumer(ImageConsumer var1) {
      this.imageConsumer = var1;
      var1.setDimensions(this.width, this.height);
      var1.setProperties((Hashtable)null);
      var1.setColorModel(this.colorModel);
      var1.setHints(14);
   }

   private synchronized void setPixels() {
      if (this.imageConsumer != null) {
         this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
         this.imageConsumer.imageComplete(2);
      }

   }

   public void method130() {
      Draw2D.bind(this.width, this.height, this.pixels);
   }

   public void draw(int var1, int var2, Graphics var3) {
      this.setPixels();
      var3.drawImage(this.image, var2, var1, this);
   }

   public synchronized boolean isConsumer(ImageConsumer var1) {
      return this.imageConsumer == var1;
   }

   public synchronized void removeConsumer(ImageConsumer var1) {
      if (this.imageConsumer == var1) {
         this.imageConsumer = null;
      }

   }

   public void startProduction(ImageConsumer var1) {
      this.addConsumer(var1);
   }

   public void requestTopDownLeftRightResend(ImageConsumer var1) {
      System.out.println("TDLR");
   }

   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }
}
