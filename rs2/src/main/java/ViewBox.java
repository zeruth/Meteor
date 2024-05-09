import java.awt.Frame;
import java.awt.Graphics;

public final class ViewBox extends Frame {
   private final GameShell shell;

   public ViewBox(GameShell var1, int var2, int var3) {
      this.shell = var1;
      this.setTitle("Jagex");
      this.setResizable(false);
      this.show();
      this.toFront();
      this.resize(var2 + 8, var3 + 28);
   }

   public Graphics getGraphics() {
      Graphics var1 = super.getGraphics();
      var1.translate(4, 24);
      return var1;
   }

   public void update(Graphics var1) {
      this.shell.update(var1);
   }

   public void paint(Graphics var1) {
      this.shell.paint(var1);
   }
}
