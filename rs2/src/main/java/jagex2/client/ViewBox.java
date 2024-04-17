package jagex2.client;

import meteor.GameView;

import javax.swing.*;
import java.awt.*;

public class ViewBox extends Frame {

	private final GameShell shell;

	public static GameView gameView;

	public ViewBox( GameShell shell, int width, int height) {
		gameView = new GameView(shell, width, height);
		this.shell = shell;
		this.setTitle("Jagex");
		this.setResizable(false);
		if (Client.vanilla)
			this.show();
		this.resize(width, height);
	}

	public static Graphics overGraphics;

	@Override
	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
/*        if (this.insets != null) {
		    g.translate(this.insets.left, this.insets.top);
        }*/
		return g;
	}

	@Override
	public void update( Graphics g) {
/*		if (!Client.vanilla)
			super.update(g);
		else
			gameView.update(g);*/
	}

	@Override
	public void paint( Graphics g) {
/*		if (!Client.vanilla)
			super.paint(g);
		else
			gameView.paint(g);*/
	}
}
