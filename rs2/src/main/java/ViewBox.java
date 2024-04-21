
import java.awt.*;

public class ViewBox extends Frame {

	public static GameView gameView;

	public ViewBox( GameShell shell, int width, int height) {
		gameView = new GameView(shell, width, height);
		this.setTitle("Jagex");
		this.setResizable(false);
		this.resize(width, height);
		this.show();
	}

	@Override
	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		return g;
	}

	@Override
	public void update( Graphics g) {
		gameView.update(g);
	}

	@Override
	public void paint( Graphics g) {
		gameView.paint(g);
	}
}
