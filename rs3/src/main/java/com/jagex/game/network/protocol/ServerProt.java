package com.jagex.game.network.protocol;



public class ServerProt {

    public static final ServerProt TELEMETRY_GRID_ADD_GROUP = new ServerProt(0, 5);

    public static final ServerProt ENVIRONMENT_OVERRIDE = new ServerProt(1, -1);

    public static final ServerProt UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerProt(2, -1);

    public static final ServerProt CREATE_CHECK_EMAIL_REPLY = new ServerProt(3, 1);

    public static final ServerProt PROJANIM_SPECIFIC = new ServerProt(4, 23);

    public static final ServerProt CAM_LOOKAT = new ServerProt(5, 6);

    public static final ServerProt UPDATE_INV_FULL = new ServerProt(6, -2);

    public static final ServerProt MESSAGE_PRIVATE_ECHO = new ServerProt(7, -2);

    public static final ServerProt MESSAGE_PUBLIC = new ServerProt(8, -1);

    public static final ServerProt REBUILD_REGION = new ServerProt(9, -2);

    public static final ServerProt UPDATE_SITESETTINGS = new ServerProt(10, -1);

    public static final ServerProt NPC_ANIM_SPECIFIC = new ServerProt(11, 19);

    public static final ServerProt RESET_ANIMS = new ServerProt(12, 0);

    public static final ServerProt MAP_PROJANIM = new ServerProt(13, 18);

    public static final ServerProt SET_PLAYER_OP = new ServerProt(14, -1);

    public static final ServerProt TELEMETRY_GRID_VALUES_DELTA = new ServerProt(15, -2);

    public static final ServerProt UPDATE_INV_PARTIAL = new ServerProt(16, -2);

    public static final ServerProt MIDI_SONG = new ServerProt(17, 3);

    public static final ServerProt SET_MOVEACTION = new ServerProt(18, -1);

    public static final ServerProt CREATE_SUGGEST_NAME_ERROR = new ServerProt(19, 1);

    public static final ServerProt TELEMETRY_GRID_ADD_COLUMN = new ServerProt(20, 6);

    public static final ServerProt CLIENT_SETVARCSTR_LARGE = new ServerProt(21, -2);

    public static final ServerProt MESSAGE_CLANCHANNEL = new ServerProt(22, -1);

    public static final ServerProt UPDATE_FRIENDCHAT_CHANNEL_FULL = new ServerProt(23, -2);

    public static final ServerProt EXECUTE_CLIENT_CHEAT = new ServerProt(24, 2);

    public static final ServerProt FRIENDLIST_LOADED = new ServerProt(25, 0);

    public static final ServerProt IF_OPENSUB_ACTIVE_LOC = new ServerProt(26, 32);

    public static final ServerProt CLEAR_PLAYER_SNAPSHOT = new ServerProt(27, 1);

    public static final ServerProt UPDATE_STOCKMARKET_SLOT = new ServerProt(28, 21);

    public static final ServerProt SONG_PRELOAD = new ServerProt(29, 2);

    public static final ServerProt CLIENT_SETVARCSTR_SMALL = new ServerProt(30, -1);

    public static final ServerProt IF_SETTEXTFONT = new ServerProt(31, 8);

    public static final ServerProt TELEMETRY_GRID_REMOVE_COLUMN = new ServerProt(32, 2);

    public static final ServerProt UPDATE_STAT = new ServerProt(33, 6);

    public static final ServerProt LOC_CUSTOMISE = new ServerProt(34, -1);

    public static final ServerProt IF_OPENTOP = new ServerProt(35, 19);

    public static final ServerProt MESSAGE_FRIENDCHANNEL = new ServerProt(36, -1);

    public static final ServerProt VORBIS_SOUND = new ServerProt(37, 8);

    public static final ServerProt IF_OPENSUB = new ServerProt(38, 23);

    public static final ServerProt TELEMETRY_GRID_MOVE_COLUMN = new ServerProt(39, 3);

    public static final ServerProt PLAYER_GROUP_FULL = new ServerProt(40, -2);

    public static final ServerProt MESSAGE_PLAYER_GROUP = new ServerProt(41, -1);

    public static final ServerProt VORBIS_SOUND_GROUP = new ServerProt(42, 10);

    public static final ServerProt IF_SETPLAYERHEAD = new ServerProt(43, 4);

    public static final ServerProt VARBIT_SMALL = new ServerProt(44, 3);

    public static final ServerProt LOC_DEL = new ServerProt(45, 2);

    public static final ServerProt UPDATE_FRIENDLIST = new ServerProt(46, -2);

    public static final ServerProt SETDRAWORDER = new ServerProt(47, 1);

    public static final ServerProt SEND_PING = new ServerProt(48, 8);

    public static final ServerProt OBJ_DEL = new ServerProt(49, 3);

    public static final ServerProt VARP_LARGE = new ServerProt(50, 6);

    public static final ServerProt field3853 = new ServerProt(51, -2);

    public static final ServerProt DEBUG_SERVER_TRIGGERS = new ServerProt(52, -1);

    public static final ServerProt UPDATE_UID192 = new ServerProt(53, 28);

    public static final ServerProt CLIENT_SETVARCBIT_SMALL = new ServerProt(54, 3);

    public static final ServerProt MIDI_JINGLE = new ServerProt(55, 3);

    public static final ServerProt UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerProt(56, 3);

    public static final ServerProt LOGOUT_TRANSFER = new ServerProt(57, -1);

    public static final ServerProt UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerProt(58, -2);

    public static final ServerProt CLANCHANNEL_FULL = new ServerProt(59, -2);

    public static final ServerProt URL_OPEN = new ServerProt(60, -2);

    public static final ServerProt IF_OPENSUB_ACTIVE_PLAYER = new ServerProt(61, 25);

    public static final ServerProt IF_SETPLAYERHEAD_OTHER = new ServerProt(62, 10);

    public static final ServerProt IF_SETRECOL = new ServerProt(63, 9);

    public static final ServerProt CAM_REMOVEROOF = new ServerProt(64, 4);

    public static final ServerProt UPDATE_INV_STOP_TRANSMIT = new ServerProt(65, 3);

    public static final ServerProt CREATE_SUGGEST_NAME_REPLY = new ServerProt(66, -1);

    public static final ServerProt PLAYER_SNAPSHOT = new ServerProt(67, -2);

    public static final ServerProt TELEMETRY_GRID_REMOVE_GROUP = new ServerProt(68, 1);

    public static final ServerProt CLIENT_SETVARCBIT_LARGE = new ServerProt(69, 6);

    public static final ServerProt SOUND_AREA = new ServerProt(70, 6);

    public static final ServerProt MAP_PROJANIM_HALFSQ = new ServerProt(71, 21);

    public static final ServerProt IF_SETPOSITION = new ServerProt(72, 8);

    public static final ServerProt OBJ_COUNT = new ServerProt(73, 7);

    public static final ServerProt CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerProt(74, 1);

    public static final ServerProt TELEMETRY_GRID_FULL = new ServerProt(75, -2);

    public static final ServerProt SHOW_FACE_HERE = new ServerProt(76, 1);

    public static final ServerProt SOCIAL_NETWORK_LOGOUT = new ServerProt(77, -2);

    public static final ServerProt HINT_ARROW = new ServerProt(78, 14);

    public static final ServerProt IF_SETSCROLLPOS = new ServerProt(79, 6);

    public static final ServerProt MESSAGE_QUICKCHAT_PRIVATE = new ServerProt(80, -1);

    public static final ServerProt CAM2_ENABLE = new ServerProt(81, 1);

    public static final ServerProt MESSAGE_CLANCHANNEL_SYSTEM = new ServerProt(82, -1);

    public static final ServerProt NO_TIMEOUT = new ServerProt(83, 0);

    public static final ServerProt LOC_ANIM_SPECIFIC = new ServerProt(84, 10);

    public static final ServerProt OBJ_ADD = new ServerProt(85, 5);

    public static final ServerProt LOGOUT_FULL = new ServerProt(86, 1);

    public static final ServerProt CAM_SMOOTHRESET = new ServerProt(87, 0);

    public static final ServerProt REBUILD_NORMAL = new ServerProt(88, -2);

    public static final ServerProt MESSAGE_QUICKCHAT_CLANCHANNEL = new ServerProt(89, -1);

    public static final ServerProt MESSAGE_PRIVATE = new ServerProt(90, -2);

    public static final ServerProt VARCLAN_DISABLE = new ServerProt(91, 0);

    public static final ServerProt VORBIS_SOUND_GROUP_START = new ServerProt(92, 2);

    public static final ServerProt MESSAGE_QUICKCHAT_PRIVATE_ECHO = new ServerProt(93, -1);

    public static final ServerProt SET_MAP_FLAG = new ServerProt(94, 2);

    public static final ServerProt VORBIS_SOUND_GROUP_STOP = new ServerProt(95, 2);

    public static final ServerProt TELEMETRY_GRID_MOVE_ROW = new ServerProt(96, 3);

    public static final ServerProt VORBIS_PRELOAD_SOUNDS = new ServerProt(97, 2);

    public static final ServerProt CAM_MOVETO = new ServerProt(98, 6);

    public static final ServerProt RESET_CLIENT_VARCACHE = new ServerProt(99, 0);

    public static final ServerProt IF_SETPLAYERMODEL_OTHER = new ServerProt(100, 10);

    public static final ServerProt CLANSETTINGS_FULL = new ServerProt(101, -2);

    public static final ServerProt IF_OPENSUB_ACTIVE_NPC = new ServerProt(102, 25);

    public static final ServerProt IF_SETANIM = new ServerProt(103, 8);

    public static final ServerProt CAM_RESET = new ServerProt(104, 0);

    public static final ServerProt LOBBY_APPEARANCE = new ServerProt(105, -2);

    public static final ServerProt VARCLAN_ENABLE = new ServerProt(106, 0);

    public static final ServerProt POINTLIGHT_COLOUR = new ServerProt(107, 8);

    public static final ServerProt IF_SETRETEX = new ServerProt(108, 9);

    public static final ServerProt IF_SETHIDE = new ServerProt(109, 5);

    public static final ServerProt LAST_LOGIN_INFO = new ServerProt(110, 4);

    public static final ServerProt REFLECTION_CHECKER = new ServerProt(111, -2);

    public static final ServerProt IF_SETANGLE = new ServerProt(112, 10);

    public static final ServerProt TEXT_COORD = new ServerProt(113, -1);

    public static final ServerProt VORBIS_SPEECH_STOP = new ServerProt(114, 0);

    public static final ServerProt VORBIS_PRELOAD_SOUND_GROUP = new ServerProt(115, 2);

    public static final ServerProt IF_SETMODEL = new ServerProt(116, 8);

    public static final ServerProt DO_CHEAT = new ServerProt(117, -1);

    public static final ServerProt OBJ_REVEAL = new ServerProt(118, 7);

    public static final ServerProt HINT_TRAIL = new ServerProt(119, -2);

    public static final ServerProt MESSAGE_GAME = new ServerProt(120, -1);

    public static final ServerProt IF_OPENSUB_ACTIVE_OBJ = new ServerProt(121, 29);

    public static final ServerProt PLAYER_INFO = new ServerProt(122, -2);

    public static final ServerProt SOUND_MIXBUSS_ADD = new ServerProt(123, 6);

    public static final ServerProt LOC_PREFETCH = new ServerProt(124, 5);

    public static final ServerProt NPC_HEADICON_SPECIFIC = new ServerProt(125, 9);

    public static final ServerProt UPDATE_DOB = new ServerProt(126, 4);

    public static final ServerProt MIDI_SONG_LOCATION = new ServerProt(127, 11);

    public static final ServerProt CLIENT_SETVARC_LARGE = new ServerProt(128, 6);

    public static final ServerProt SERVER_TICK_END = new ServerProt(129, 0);

    public static final ServerProt IF_SETPLAYERHEAD_IGNOREWORN = new ServerProt(130, 10);

    public static final ServerProt CREATE_ACCOUNT_REPLY = new ServerProt(131, 1);

    public static final ServerProt CLANSETTINGS_DELTA = new ServerProt(132, -2);

    public static final ServerProt TRIGGER_ONDIALOGABORT = new ServerProt(133, 0);

    public static final ServerProt REDUCE_PLAYER_ATTACK_PRIORITY = new ServerProt(134, 1);

    public static final ServerProt IF_SET_HTTP_IMAGE = new ServerProt(135, 8);

    public static final ServerProt CUTSCENE = new ServerProt(136, -2);

    public static final ServerProt MINIMAP_TOGGLE = new ServerProt(137, 1);

    public static final ServerProt CHAT_FILTER_SETTINGS = new ServerProt(138, 2);

    public static final ServerProt LOC_ADD_CHANGE = new ServerProt(139, -1);

    public static final ServerProt IF_SETCOLOUR = new ServerProt(140, 6);

    public static final ServerProt REDUCE_NPC_ATTACK_PRIORITY = new ServerProt(141, 1);

    public static final ServerProt VARBIT_LARGE = new ServerProt(142, 6);

    public static final ServerProt VORBIS_SPEECH_SOUND = new ServerProt(143, 6);

    public static final ServerProt POINTLIGHT_INTENSITY = new ServerProt(144, 5);

    public static final ServerProt MESSAGE_QUICKCHAT_FRIENDCHAT = new ServerProt(145, -1);

    public static final ServerProt CLANCHANNEL_DELTA = new ServerProt(146, -2);

    public static final ServerProt LOC_ANIM = new ServerProt(147, 7);

    public static final ServerProt STORE_SERVERPERM_VARCS_ACK = new ServerProt(148, 0);

    public static final ServerProt CLIENT_SETVARC_SMALL = new ServerProt(149, 3);

    public static final ServerProt SET_TARGET = new ServerProt(150, 2);

    public static final ServerProt IF_SETPLAYERMODEL_SELF = new ServerProt(151, 4);

    public static final ServerProt CAMERA_UPDATE = new ServerProt(152, -2);

    public static final ServerProt JS5_RELOAD = new ServerProt(153, 0);

    public static final ServerProt CHANGE_LOBBY = new ServerProt(154, -1);

    public static final ServerProt IF_SETEVENTS = new ServerProt(155, 12);

    public static final ServerProt RUNCLIENTSCRIPT = new ServerProt(156, -2);

    public static final ServerProt VARP_SMALL = new ServerProt(157, 3);

    public static final ServerProt IF_SETOBJECT = new ServerProt(158, 10);

    public static final ServerProt PLAYER_GROUP_VARPS = new ServerProt(159, -2);

    public static final ServerProt TELEMETRY_GRID_REMOVE_ROW = new ServerProt(160, 2);

    public static final ServerProt UPDATE_RUNENERGY = new ServerProt(161, 1);

    public static final ServerProt SOUND_MIXBUSS_SETLEVEL = new ServerProt(162, 4);

    public static final ServerProt CREATE_CHECK_NAME_REPLY = new ServerProt(163, 1);

    public static final ServerProt CAM_FORCEANGLE = new ServerProt(164, 4);

    public static final ServerProt IF_SETTEXTANTIMACRO = new ServerProt(165, 5);

    public static final ServerProt IF_CLOSESUB = new ServerProt(166, 4);

    public static final ServerProt WORLDLIST_FETCH_REPLY = new ServerProt(167, -2);

    public static final ServerProt LOGOUT = new ServerProt(168, 1);

    public static final ServerProt UPDATE_RUNWEIGHT = new ServerProt(169, 2);

    public static final ServerProt field3996 = new ServerProt(170, -2);

    public static final ServerProt CAM_SHAKE = new ServerProt(171, 6);

    public static final ServerProt VARCLAN = new ServerProt(172, -1);

    public static final ServerProt TELEMETRY_GRID_SET_ROW_PINNED = new ServerProt(173, 3);

    public static final ServerProt UPDATE_IGNORELIST = new ServerProt(174, -2);

    public static final ServerProt UPDATE_ZONE_FULL_FOLLOWS = new ServerProt(175, 3);

    public static final ServerProt MESSAGE_QUICKCHAT_PLAYER_GROUP = new ServerProt(176, -1);

    public static final ServerProt UPDATE_REBOOT_TIMER = new ServerProt(177, 2);

    public static final ServerProt SPOTANIM_SPECIFIC = new ServerProt(178, 12);

    public static final ServerProt IF_SETTARGETPARAM = new ServerProt(179, 10);

    public static final ServerProt IF_SETPLAYERMODEL_SNAPSHOT = new ServerProt(180, 5);

    public static final ServerProt IF_SETTEXT = new ServerProt(181, -2);

    public static final ServerProt SYNTH_SOUND = new ServerProt(182, 8);

    public static final ServerProt IF_SETGRAPHIC = new ServerProt(183, 8);

    public static final ServerProt IF_SETCLICKMASK = new ServerProt(184, 5);

    public static final ServerProt TELEMETRY_GRID_ADD_ROW = new ServerProt(185, 6);

    public static final ServerProt NPC_INFO = new ServerProt(186, -2);

    public static final ServerProt PLAYER_GROUP_DELTA = new ServerProt(187, -2);

    public static final ServerProt LOYALTY_UPDATE = new ServerProt(188, 4);

    public static final ServerProt IF_SETNPCHEAD = new ServerProt(189, 8);

    public static final ServerProt MIDI_SONG_STOP = new ServerProt(190, 0);

    public static final ServerProt IF_MOVESUB = new ServerProt(191, 8);

    public static final ServerProt TELEMETRY_CLEAR_GRID_VALUE = new ServerProt(192, 3);

    public static final ServerProt MAP_ANIM = new ServerProt(193, 10);

    public static final ServerProt JCOINS_UPDATE = new ServerProt(194, 4);

    public final int id;

    public final int size;

	public ServerProt(int id, int size) {
		this.id = id;
		this.size = size;
	}

    public static ServerProt[] values() {
        return new ServerProt[] {TELEMETRY_GRID_ADD_GROUP, ENVIRONMENT_OVERRIDE, UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, CREATE_CHECK_EMAIL_REPLY, PROJANIM_SPECIFIC, CAM_LOOKAT, UPDATE_INV_FULL, MESSAGE_PRIVATE_ECHO, MESSAGE_PUBLIC, REBUILD_REGION, UPDATE_SITESETTINGS, NPC_ANIM_SPECIFIC, RESET_ANIMS, MAP_PROJANIM, SET_PLAYER_OP, TELEMETRY_GRID_VALUES_DELTA, UPDATE_INV_PARTIAL, MIDI_SONG, SET_MOVEACTION, CREATE_SUGGEST_NAME_ERROR, TELEMETRY_GRID_ADD_COLUMN, CLIENT_SETVARCSTR_LARGE, MESSAGE_CLANCHANNEL, UPDATE_FRIENDCHAT_CHANNEL_FULL, EXECUTE_CLIENT_CHEAT, FRIENDLIST_LOADED, IF_OPENSUB_ACTIVE_LOC, CLEAR_PLAYER_SNAPSHOT, UPDATE_STOCKMARKET_SLOT, SONG_PRELOAD, CLIENT_SETVARCSTR_SMALL, IF_SETTEXTFONT, TELEMETRY_GRID_REMOVE_COLUMN, UPDATE_STAT, LOC_CUSTOMISE, IF_OPENTOP, MESSAGE_FRIENDCHANNEL, VORBIS_SOUND, IF_OPENSUB, TELEMETRY_GRID_MOVE_COLUMN, PLAYER_GROUP_FULL, MESSAGE_PLAYER_GROUP, VORBIS_SOUND_GROUP, IF_SETPLAYERHEAD, VARBIT_SMALL, LOC_DEL, UPDATE_FRIENDLIST, SETDRAWORDER, SEND_PING, OBJ_DEL, VARP_LARGE, field3853, DEBUG_SERVER_TRIGGERS, UPDATE_UID192, CLIENT_SETVARCBIT_SMALL, MIDI_JINGLE, UPDATE_ZONE_PARTIAL_FOLLOWS, LOGOUT_TRANSFER, UPDATE_ZONE_PARTIAL_ENCLOSED, CLANCHANNEL_FULL, URL_OPEN, IF_OPENSUB_ACTIVE_PLAYER, IF_SETPLAYERHEAD_OTHER, IF_SETRECOL, CAM_REMOVEROOF, UPDATE_INV_STOP_TRANSMIT, CREATE_SUGGEST_NAME_REPLY, PLAYER_SNAPSHOT, TELEMETRY_GRID_REMOVE_GROUP, CLIENT_SETVARCBIT_LARGE, SOUND_AREA, MAP_PROJANIM_HALFSQ, IF_SETPOSITION, OBJ_COUNT, CHAT_FILTER_SETTINGS_PRIVATECHAT, TELEMETRY_GRID_FULL, SHOW_FACE_HERE, SOCIAL_NETWORK_LOGOUT, HINT_ARROW, IF_SETSCROLLPOS, MESSAGE_QUICKCHAT_PRIVATE, CAM2_ENABLE, MESSAGE_CLANCHANNEL_SYSTEM, NO_TIMEOUT, LOC_ANIM_SPECIFIC, OBJ_ADD, LOGOUT_FULL, CAM_SMOOTHRESET, REBUILD_NORMAL, MESSAGE_QUICKCHAT_CLANCHANNEL, MESSAGE_PRIVATE, VARCLAN_DISABLE, VORBIS_SOUND_GROUP_START, MESSAGE_QUICKCHAT_PRIVATE_ECHO, SET_MAP_FLAG, VORBIS_SOUND_GROUP_STOP, TELEMETRY_GRID_MOVE_ROW, VORBIS_PRELOAD_SOUNDS, CAM_MOVETO, RESET_CLIENT_VARCACHE, IF_SETPLAYERMODEL_OTHER, CLANSETTINGS_FULL, IF_OPENSUB_ACTIVE_NPC, IF_SETANIM, CAM_RESET, LOBBY_APPEARANCE, VARCLAN_ENABLE, POINTLIGHT_COLOUR, IF_SETRETEX, IF_SETHIDE, LAST_LOGIN_INFO, REFLECTION_CHECKER, IF_SETANGLE, TEXT_COORD, VORBIS_SPEECH_STOP, VORBIS_PRELOAD_SOUND_GROUP, IF_SETMODEL, DO_CHEAT, OBJ_REVEAL, HINT_TRAIL, MESSAGE_GAME, IF_OPENSUB_ACTIVE_OBJ, PLAYER_INFO, SOUND_MIXBUSS_ADD, LOC_PREFETCH, NPC_HEADICON_SPECIFIC, UPDATE_DOB, MIDI_SONG_LOCATION, CLIENT_SETVARC_LARGE, SERVER_TICK_END, IF_SETPLAYERHEAD_IGNOREWORN, CREATE_ACCOUNT_REPLY, CLANSETTINGS_DELTA, TRIGGER_ONDIALOGABORT, REDUCE_PLAYER_ATTACK_PRIORITY, IF_SET_HTTP_IMAGE, CUTSCENE, MINIMAP_TOGGLE, CHAT_FILTER_SETTINGS, LOC_ADD_CHANGE, IF_SETCOLOUR, REDUCE_NPC_ATTACK_PRIORITY, VARBIT_LARGE, VORBIS_SPEECH_SOUND, POINTLIGHT_INTENSITY, MESSAGE_QUICKCHAT_FRIENDCHAT, CLANCHANNEL_DELTA, LOC_ANIM, STORE_SERVERPERM_VARCS_ACK, CLIENT_SETVARC_SMALL, SET_TARGET, IF_SETPLAYERMODEL_SELF, CAMERA_UPDATE, JS5_RELOAD, CHANGE_LOBBY, IF_SETEVENTS, RUNCLIENTSCRIPT, VARP_SMALL, IF_SETOBJECT, PLAYER_GROUP_VARPS, TELEMETRY_GRID_REMOVE_ROW, UPDATE_RUNENERGY, SOUND_MIXBUSS_SETLEVEL, CREATE_CHECK_NAME_REPLY, CAM_FORCEANGLE, IF_SETTEXTANTIMACRO, IF_CLOSESUB, WORLDLIST_FETCH_REPLY, LOGOUT, UPDATE_RUNWEIGHT, field3996, CAM_SHAKE, VARCLAN, TELEMETRY_GRID_SET_ROW_PINNED, UPDATE_IGNORELIST, UPDATE_ZONE_FULL_FOLLOWS, MESSAGE_QUICKCHAT_PLAYER_GROUP, UPDATE_REBOOT_TIMER, SPOTANIM_SPECIFIC, IF_SETTARGETPARAM, IF_SETPLAYERMODEL_SNAPSHOT, IF_SETTEXT, SYNTH_SOUND, IF_SETGRAPHIC, IF_SETCLICKMASK, TELEMETRY_GRID_ADD_ROW, NPC_INFO, PLAYER_GROUP_DELTA, LOYALTY_UPDATE, IF_SETNPCHEAD, MIDI_SONG_STOP, IF_MOVESUB, TELEMETRY_CLEAR_GRID_VALUE, MAP_ANIM, JCOINS_UPDATE};
    }
}
