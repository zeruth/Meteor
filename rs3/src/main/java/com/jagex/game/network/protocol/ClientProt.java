package com.jagex.game.network.protocol;



public class ClientProt {

    public static final ClientProt MAP_BUILD_STUCK = new ClientProt(0, 15);

    public static final ClientProt RESUME_P_HSLDIALOG = new ClientProt(1, 2);

    public static final ClientProt OPNPC5 = new ClientProt(2, 3);

    public static final ClientProt RESUME_P_STRINGDIALOG = new ClientProt(3, -1);

    public static final ClientProt OPPLAYER6 = new ClientProt(4, 3);

    public static final ClientProt EVENT_NATIVE_MOUSE_MOVE = new ClientProt(5, -1);

    public static final ClientProt OPPLAYER9 = new ClientProt(6, 3);

    public static final ClientProt MESSAGE_PRIVATE = new ClientProt(7, -2);

    public static final ClientProt AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL = new ClientProt(8, -1);

    public static final ClientProt CLIENT_DETAILOPTIONS_STATUS = new ClientProt(9, -1);

    public static final ClientProt RESUME_P_COUNTDIALOG = new ClientProt(10, 4);

    public static final ClientProt SEND_SNAPSHOT = new ClientProt(11, -1);

    public static final ClientProt OPLOC1 = new ClientProt(12, 9);

    public static final ClientProt IGNORELIST_ADD = new ClientProt(13, -1);

    public static final ClientProt SOUND_SONGEND = new ClientProt(14, 4);

    public static final ClientProt field3697 = new ClientProt(15, 9);

    public static final ClientProt OPOBJ5 = new ClientProt(16, 7);

    public static final ClientProt MESSAGE_QUICKCHAT_PUBLIC = new ClientProt(17, -1);

    public static final ClientProt CLICKWORLDMAP = new ClientProt(18, 4);

    public static final ClientProt field3701 = new ClientProt(19, 1);

    public static final ClientProt CREATE_ACCOUNT = new ClientProt(20, -2);

    public static final ClientProt OPLOCT = new ClientProt(21, 17);

    public static final ClientProt TRANSMITVAR_VERIFYID = new ClientProt(22, 4);

    public static final ClientProt REFLECTION_CHECK_REPLY = new ClientProt(23, -1);

    public static final ClientProt NATIVE_LIBRARY_FAILURE = new ClientProt(24, -1);

    public static final ClientProt OPOBJ2 = new ClientProt(25, 7);

    public static final ClientProt OPOBJ3 = new ClientProt(26, 7);

    public static final ClientProt OPLOC3 = new ClientProt(27, 9);

    public static final ClientProt CREATE_CHECK_EMAIL = new ClientProt(28, -2);

    public static final ClientProt IF_BUTTON4 = new ClientProt(29, 8);

    public static final ClientProt SOUND_SONGPRELOADED = new ClientProt(30, 4);

    public static final ClientProt OPNPC4 = new ClientProt(31, 3);

    public static final ClientProt CLAN_KICKUSER = new ClientProt(32, -1);

    public static final ClientProt MOVE_GAMECLICK = new ClientProt(33, 5);

    public static final ClientProt CHANGE_EMAIL_ADDRESS = new ClientProt(34, -2);

    public static final ClientProt FRIENDLIST_DEL = new ClientProt(35, -1);

    public static final ClientProt OPNPC6 = new ClientProt(36, 3);

    public static final ClientProt EVENT_CAMERA_POSITION = new ClientProt(37, 4);

    public static final ClientProt field3797 = new ClientProt(38, -2);

    public static final ClientProt OPLOC6 = new ClientProt(39, 9);

    public static final ClientProt CUTSCENE_FINISHED = new ClientProt(40, 1);

    public static final ClientProt OPPLAYERT = new ClientProt(41, 11);

    public static final ClientProt IGNORE_SETNOTES = new ClientProt(42, -1);

    public static final ClientProt field3753 = new ClientProt(43, 1);

    public static final ClientProt CHAT_SETMODE = new ClientProt(44, 1);

    public static final ClientProt EVENT_MOUSE_CLICK = new ClientProt(45, 6);

    public static final ClientProt field3700 = new ClientProt(46, -2);

    public static final ClientProt IGNORELIST_DEL = new ClientProt(47, -1);

    public static final ClientProt OPPLAYER8 = new ClientProt(48, 3);

    public static final ClientProt OPPLAYER5 = new ClientProt(49, 3);

    public static final ClientProt IF_BUTTON8 = new ClientProt(50, 8);

    public static final ClientProt OPNPC1 = new ClientProt(51, 3);

    public static final ClientProt AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL = new ClientProt(52, -1);

    public static final ClientProt SIMPLE_TOOLKIT_CHANGE = new ClientProt(53, 1);

    public static final ClientProt OPPLAYER7 = new ClientProt(54, 3);

    public static final ClientProt DIRECTX_FAILURE = new ClientProt(55, 2);

    public static final ClientProt OPNPC2 = new ClientProt(56, 3);

    public static final ClientProt CLOSE_MODAL = new ClientProt(57, 0);

    public static final ClientProt IF_BUTTONT = new ClientProt(58, 16);

    public static final ClientProt APCOORDT = new ClientProt(59, 12);

    public static final ClientProt SEND_EMAIL_VALIDATION_CODE = new ClientProt(60, -1);

    public static final ClientProt OPLOC4 = new ClientProt(61, 9);

    public static final ClientProt OPPLAYER2 = new ClientProt(62, 3);

    public static final ClientProt IF_BUTTON7 = new ClientProt(63, 8);

    public static final ClientProt ADD_NEW_EMAIL_ADDRESS = new ClientProt(64, -2);

    public static final ClientProt CREATE_CHECK_NAME = new ClientProt(65, -1);

    public static final ClientProt IF_BUTTON9 = new ClientProt(66, 8);

    public static final ClientProt IF_BUTTON10 = new ClientProt(67, 8);

    public static final ClientProt IF_BUTTON2 = new ClientProt(68, 8);

    public static final ClientProt CREATE_SUGGEST_NAMES = new ClientProt(69, 0);

    public static final ClientProt IF_BUTTON5 = new ClientProt(70, 8);

    public static final ClientProt STORE_SERVERPERM_VARCS = new ClientProt(71, -2);

    public static final ClientProt EVENT_NATIVE_MOUSE_CLICK = new ClientProt(72, 7);

    public static final ClientProt FRIEND_SETRANK = new ClientProt(73, -1);

    public static final ClientProt PING_STATISTICS = new ClientProt(74, 4);

    public static final ClientProt FRIEND_SETNOTES = new ClientProt(75, -1);

    public static final ClientProt OPPLAYER3 = new ClientProt(76, 3);

    public static final ClientProt WORLDLIST_FETCH = new ClientProt(77, 4);

    public static final ClientProt MOVE_MINIMAPCLICK = new ClientProt(78, 18);

    public static final ClientProt MAP_BUILD_COMPLETE = new ClientProt(79, 4);

    public static final ClientProt TELEMETRY_ERROR = new ClientProt(80, 0);

    public static final ClientProt OPOBJ1 = new ClientProt(81, 7);

    public static final ClientProt UID_PASSPORT_RESEND_REQUEST = new ClientProt(82, 0);

    public static final ClientProt IF_BUTTON6 = new ClientProt(83, 8);

    public static final ClientProt CLIENT_CHEAT = new ClientProt(84, -1);

    public static final ClientProt FRIENDLIST_ADD = new ClientProt(85, -1);

    public static final ClientProt IF_BUTTON3 = new ClientProt(86, 8);

    public static final ClientProt EVENT_KEYBOARD = new ClientProt(87, -2);

    public static final ClientProt SET_CHATFILTERSETTINGS = new ClientProt(88, 3);

    public static final ClientProt MOVE_SCRIPTED = new ClientProt(89, 5);

    public static final ClientProt DETECT_MODIFIED_CLIENT = new ClientProt(90, 4);

    public static final ClientProt OPPLAYER10 = new ClientProt(91, 3);

    public static final ClientProt CLAN_JOINCHAT_LEAVECHAT = new ClientProt(92, -1);

    public static final ClientProt EVENT_APPLET_FOCUS = new ClientProt(93, 1);

    public static final ClientProt CLANCHANNEL_KICKUSER = new ClientProt(94, -1);

    public static final ClientProt MESSAGE_PUBLIC = new ClientProt(95, -1);

    public static final ClientProt OPLOC2 = new ClientProt(96, 9);

    public static final ClientProt EVENT_MOUSE_MOVE = new ClientProt(97, -1);

    public static final ClientProt RESUME_PAUSEBUTTON = new ClientProt(98, 6);

    public static final ClientProt RESUME_P_OBJDIALOG = new ClientProt(99, 2);

    public static final ClientProt SEND_PING_REPLY = new ClientProt(100, 9);

    public static final ClientProt RESUME_P_NAMEDIALOG = new ClientProt(101, -1);

    public static final ClientProt OPPLAYER4 = new ClientProt(102, 3);

    public static final ClientProt NO_TIMEOUT = new ClientProt(103, 0);

    public static final ClientProt IF_PLAYER = new ClientProt(104, -1);

    public static final ClientProt OPOBJ6 = new ClientProt(105, 7);

    public static final ClientProt ABORT_P_DIALOG = new ClientProt(106, 0);

    public static final ClientProt FACE_SQUARE = new ClientProt(107, 4);

    public static final ClientProt BUG_REPORT = new ClientProt(108, -2);

    public static final ClientProt CLIENT_COMPRESSEDTEXTUREFORMAT_SUPPORT = new ClientProt(109, -2);

    public static final ClientProt RESUME_P_CLANFORUMQFCDIALOG = new ClientProt(110, -1);

    public static final ClientProt IF_BUTTON1 = new ClientProt(111, 8);

    public static final ClientProt AUTO_SETUP_RESULT = new ClientProt(112, 18);

    public static final ClientProt OPNPCT = new ClientProt(113, 11);

    public static final ClientProt OPOBJT = new ClientProt(114, 15);

    public static final ClientProt MESSAGE_QUICKCHAT_PRIVATE = new ClientProt(115, -1);

    public static final ClientProt OPNPC3 = new ClientProt(116, 3);

    public static final ClientProt OPPLAYER1 = new ClientProt(117, 3);

    public static final ClientProt CREATE_LOG_PROGRESS = new ClientProt(118, 1);

    public static final ClientProt OPLOC5 = new ClientProt(119, 9);

    public static final ClientProt URL_REQUEST = new ClientProt(120, -2);

    public static final ClientProt OPOBJ4 = new ClientProt(121, 7);

    public static final ClientProt IF_BUTTOND = new ClientProt(122, 16);

    public static final ClientProt WINDOW_STATUS = new ClientProt(123, 6);

    public final int id;

    public final int size;

	public ClientProt(int id, int size) {
		this.id = id;
		this.size = size;
	}
}
