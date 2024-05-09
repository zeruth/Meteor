import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class Launcher implements AppletStub {
   static URL baseURL;
   static JFrame frame = new JFrame("RS2 377");
   static Dimension gameSize;
   static BorderLayout layout = new BorderLayout();
   static JPanel panel;
   static Launcher INSTANCE;

   static {
      panel = new JPanel(layout);
      gameSize = new Dimension(779, 540);
      INSTANCE = new Launcher();

      try {
         baseURL = new URL("http://127.0.0.1");
      } catch (MalformedURLException var1) {
         throw new RuntimeException(var1);
      }
   }

   public boolean isActive() {
      return true;
   }

   public URL getDocumentBase() {
      return baseURL;
   }

   public URL getCodeBase() {
      return baseURL;
   }

   public String getParameter(String var1) {
      if (var1.equals("nodeid")) {
         return "10";
      } else if (var1.equals("portoff")) {
         return "0";
      } else if (!var1.equals("lowmem") && !var1.equals("free")) {
         throw new RuntimeException("unknown paramater: " + var1);
      } else {
         return "false";
      }
   }

   public AppletContext getAppletContext() {
      return null;
   }

   public void appletResize(int var1, int var2) {
   }

   public static void main(String[] var0) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
      frame.setSize(gameSize);
      frame.setBackground(Color.BLACK);
      panel.setSize(gameSize);
      panel.setBackground(Color.BLACK);
      Applet var1 = (Applet)ClassLoader.getSystemClassLoader().loadClass("Client").newInstance();
      var1.setStub(INSTANCE);
      panel.add(var1, BorderLayout.CENTER);
      frame.add(panel);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      var1.init();
      var1.start();
      frame.show();
   }
}
