package com.jagex.game.cutscene;



public class CutsceneCommand {

    public static final CutsceneCommand CAM_MOVE = new CutsceneCommand(23, 0);

    public static final CutsceneCommand CAM_MOVEALONG = new CutsceneCommand(29, 1);

    public static final CutsceneCommand field9220 = new CutsceneCommand(18, 2);

    public static final CutsceneCommand field9240 = new CutsceneCommand(17, 3);

    public static final CutsceneCommand ENTITY_MOVE = new CutsceneCommand(1, 10);

    public static final CutsceneCommand ENTITY_DEL = new CutsceneCommand(13, 11);

    public static final CutsceneCommand ENTITY_ROUTE = new CutsceneCommand(6, 12);

    public static final CutsceneCommand ENTITY_SAY = new CutsceneCommand(11, 13);

    public static final CutsceneCommand ENTITY_ANIM = new CutsceneCommand(12, 14);

    public static final CutsceneCommand ENTITY_HITMARK = new CutsceneCommand(0, 15);

    public static final CutsceneCommand ENTITY_LOOK = new CutsceneCommand(9, 16);

    public static final CutsceneCommand ENTITY_SPOTANIM = new CutsceneCommand(24, 17);

    public static final CutsceneCommand LOC_CREATE = new CutsceneCommand(14, 20);

    public static final CutsceneCommand LOC_DEL = new CutsceneCommand(20, 21);

    public static final CutsceneCommand LOC_ANIM = new CutsceneCommand(21, 22);

    public static final CutsceneCommand SOUND_SONG = new CutsceneCommand(25, 30);

    public static final CutsceneCommand field9246 = new CutsceneCommand(3, 31);

    public static final CutsceneCommand SOUND_JINGLE = new CutsceneCommand(5, 32);

    public static final CutsceneCommand SOUND_VORBIS = new CutsceneCommand(22, 33);

    public static final CutsceneCommand FADE = new CutsceneCommand(19, 40);

    public static final CutsceneCommand TEXT_COROD = new CutsceneCommand(8, 41);

    public static final CutsceneCommand MAP_ANIM = new CutsceneCommand(28, 42);

    public static final CutsceneCommand field9243 = new CutsceneCommand(7, 43);

    public static final CutsceneCommand PROJANIM_ENTITY_ENTITY = new CutsceneCommand(10, 50);

    public static final CutsceneCommand PROJANIM_COORD_ENTITY = new CutsceneCommand(26, 51);

    public static final CutsceneCommand PROJANIM_COORD_COORD = new CutsceneCommand(15, 52);

    public static final CutsceneCommand PROJANIM_ENTITY_COORD = new CutsceneCommand(27, 53);

    public static final CutsceneCommand SET_VAR = new CutsceneCommand(16, 60);

    public static final CutsceneCommand SET_VARBIT = new CutsceneCommand(4, 61);

    public static final CutsceneCommand SUBTITLE = new CutsceneCommand(30, 70);

    public static final CutsceneCommand FINISH = new CutsceneCommand(2, 255);

    public final int scrambleId;

    public int id;

    public static CutsceneCommand[] values() {
		return new CutsceneCommand[] { SET_VAR, SUBTITLE, SOUND_JINGLE, SOUND_SONG, field9243, PROJANIM_ENTITY_ENTITY, ENTITY_DEL, CAM_MOVE, field9240, LOC_ANIM, LOC_CREATE, field9246, TEXT_COROD, PROJANIM_ENTITY_COORD, ENTITY_SAY, LOC_DEL, ENTITY_LOOK, ENTITY_MOVE, FADE, PROJANIM_COORD_ENTITY, FINISH, ENTITY_HITMARK, CAM_MOVEALONG, field9220, PROJANIM_COORD_COORD, ENTITY_ROUTE, ENTITY_ANIM, SET_VARBIT, ENTITY_SPOTANIM, SOUND_VORBIS, MAP_ANIM };
	}

	public CutsceneCommand(int arg0, int arg1) {
		this.scrambleId = arg0;
		this.id = arg1;
	}

    public static CutsceneCommand method3108(int id) {
		CutsceneCommand[] values = values();
		CutsceneCommand[] ref = values;

		for (int i = 0; i < ref.length; i++) {
			CutsceneCommand command = ref[i];
			if (command.id == id) {
				return command;
			}
		}

		return null;
	}
}
