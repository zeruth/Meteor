package com.jagex.core.constants;



public class ModeGame {

    public static final ModeGame RUNESCAPE = new ModeGame("runescape", "RuneScape", 0, Namespace.RUNESCAPE);

    public static final ModeGame STELLARDAWN = new ModeGame("stellardawn", "Stellar Dawn", 1, Namespace.STELLAR_DAWN);

    public static final ModeGame ALTERNATEREALITY = new ModeGame("game3", "Game 3", 2, Namespace.RUNESCAPE);

    public static final ModeGame TRANSFORMERS = new ModeGame("game4", "Game 4", 3, Namespace.TRANSFORMERS);

    public static final ModeGame SCRATCH = new ModeGame("game5", "Game 5", 4, Namespace.SCRATCH);

    public static final ModeGame OLDSCAPE = new ModeGame("oldscape", "RuneScape 2007", 5, Namespace.RUNESCAPE);

    public final String titleURL;

    public final String title;

    public final int game;

	public ModeGame(String titleURL, String title, int game, Namespace arg3) {
		this.titleURL = titleURL;
		this.title = title;
		this.game = game;
	}

    public static ModeGame[] values() {
		return new ModeGame[] {RUNESCAPE, ALTERNATEREALITY, OLDSCAPE, TRANSFORMERS, SCRATCH, STELLARDAWN};
	}

    public static ModeGame of(int game) {
		ModeGame[] modes = values();
		for (int index = 0; index < modes.length; index++) {
			ModeGame mode = modes[index];
			if (mode.game == game) {
				return mode;
			}
		}
		return null;
	}
}
