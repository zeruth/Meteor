package com.jagex.game.config;



public class Js5ConfigGroup {

    public static final Js5ConfigGroup FLUTYPE = new Js5ConfigGroup(1);

    public static final Js5ConfigGroup HUNTTYPE = new Js5ConfigGroup(2);

    public static final Js5ConfigGroup IDKTYPE = new Js5ConfigGroup(3);

    public static final Js5ConfigGroup FLOTYPE = new Js5ConfigGroup(4);

    public static final Js5ConfigGroup INVTYPE = new Js5ConfigGroup(5);

    public static final Js5ConfigGroup LOCTYPE = new Js5ConfigGroup(6, 8);

    public static final Js5ConfigGroup MESANIMTYPE = new Js5ConfigGroup(7);

    public static final Js5ConfigGroup ENUMTYPE = new Js5ConfigGroup(8, 8);

    public static final Js5ConfigGroup NPCTYPE = new Js5ConfigGroup(9, 7);

    public static final Js5ConfigGroup OBJTYPE = new Js5ConfigGroup(10, 8);

    public static final Js5ConfigGroup PARAMTYPE = new Js5ConfigGroup(11);

    public static final Js5ConfigGroup SEQTYPE = new Js5ConfigGroup(12, 7);

    public static final Js5ConfigGroup SPOTTYPE = new Js5ConfigGroup(13, 8);

    public static final Js5ConfigGroup field8001 = new Js5ConfigGroup(14, 10);

    public static final Js5ConfigGroup field7987 = new Js5ConfigGroup(15);

    public static final Js5ConfigGroup field7988 = new Js5ConfigGroup(16);

    public static final Js5ConfigGroup field7978 = new Js5ConfigGroup(17);

    public static final Js5ConfigGroup AREATYPE = new Js5ConfigGroup(18);

    public static final Js5ConfigGroup field7991 = new Js5ConfigGroup(19);

    public static final Js5ConfigGroup field7973 = new Js5ConfigGroup(20);

    public static final Js5ConfigGroup field7993 = new Js5ConfigGroup(21);

    public static final Js5ConfigGroup field8025 = new Js5ConfigGroup(22);

    public static final Js5ConfigGroup field7995 = new Js5ConfigGroup(23);

    public static final Js5ConfigGroup field8003 = new Js5ConfigGroup(24);

    public static final Js5ConfigGroup field7996 = new Js5ConfigGroup(25);

    public static final Js5ConfigGroup STRUCTTYPE = new Js5ConfigGroup(26, 5);

    public static final Js5ConfigGroup CHATPHRASETYPE = new Js5ConfigGroup(27);

    public static final Js5ConfigGroup CHATCATTYPE = new Js5ConfigGroup(28);

    public static final Js5ConfigGroup SKYBOXTYPE = new Js5ConfigGroup(29);

    public static final Js5ConfigGroup SKYDECORTYPE = new Js5ConfigGroup(30);

    public static final Js5ConfigGroup LIGHTTYPE = new Js5ConfigGroup(31);

    public static final Js5ConfigGroup BASTYPE = new Js5ConfigGroup(32);

    public static final Js5ConfigGroup CURSORTYPE = new Js5ConfigGroup(33);

    public static final Js5ConfigGroup MSITYPE = new Js5ConfigGroup(34);

    public static final Js5ConfigGroup QUESTTYPE = new Js5ConfigGroup(35);

    public static final Js5ConfigGroup MELTYPE = new Js5ConfigGroup(36);

    public static final Js5ConfigGroup field8041 = new Js5ConfigGroup(37);

    public static final Js5ConfigGroup field8010 = new Js5ConfigGroup(38);

    public static final Js5ConfigGroup field8011 = new Js5ConfigGroup(39);

    public static final Js5ConfigGroup DBTABLETYPE = new Js5ConfigGroup(40);

    public static final Js5ConfigGroup DBROWTYPE = new Js5ConfigGroup(41);

    public static final Js5ConfigGroup CONTROLLERTYPE = new Js5ConfigGroup(42);

    public static final Js5ConfigGroup field8015 = new Js5ConfigGroup(43);

    public static final Js5ConfigGroup field8016 = new Js5ConfigGroup(44);

    public static final Js5ConfigGroup field8017 = new Js5ConfigGroup(45);

    public static final Js5ConfigGroup HITMARKTYPE = new Js5ConfigGroup(46);

    public static final Js5ConfigGroup VARCLAN = new Js5ConfigGroup(47);

    public static final Js5ConfigGroup ITEMCODETYPE = new Js5ConfigGroup(48);

    public static final Js5ConfigGroup CATEGORYTYPE = new Js5ConfigGroup(49);

    public static final Js5ConfigGroup field8022 = new Js5ConfigGroup(50);

    public static final Js5ConfigGroup field8023 = new Js5ConfigGroup(51);

    public static final Js5ConfigGroup field8024 = new Js5ConfigGroup(53);

    public static final Js5ConfigGroup field8032 = new Js5ConfigGroup(54);

    public static final Js5ConfigGroup VAR_PLAYER = new Js5ConfigGroup(60);

    public static final Js5ConfigGroup VAR_NPC = new Js5ConfigGroup(61);

    public static final Js5ConfigGroup VAR_CLIENT = new Js5ConfigGroup(62);

    public static final Js5ConfigGroup VAR_WORLD = new Js5ConfigGroup(63);

    public static final Js5ConfigGroup VAR_REGION = new Js5ConfigGroup(64);

    public static final Js5ConfigGroup VAR_OBJECT = new Js5ConfigGroup(65);

    public static final Js5ConfigGroup VAR_CLAN = new Js5ConfigGroup(66);

    public static final Js5ConfigGroup VAR_CLAN_SETTING = new Js5ConfigGroup(67);

    public static final Js5ConfigGroup VAR_CONTROLLER = new Js5ConfigGroup(68);

    public static final Js5ConfigGroup VAR_BIT = new Js5ConfigGroup(69);

    public static final Js5ConfigGroup GAMELOGEVENT = new Js5ConfigGroup(70);

    public static final Js5ConfigGroup HEADBARTYPE = new Js5ConfigGroup(72);

    public static final Js5ConfigGroup field8045 = new Js5ConfigGroup(73);

    public static final Js5ConfigGroup field8039 = new Js5ConfigGroup(74);

    public static final Js5ConfigGroup VAR_GLOBAL = new Js5ConfigGroup(75);

    public static final Js5ConfigGroup WATERTYPE = new Js5ConfigGroup(76);

    public static final Js5ConfigGroup SEQGROUPTYPE = new Js5ConfigGroup(77);

    public static final Js5ConfigGroup field8009 = new Js5ConfigGroup(78);

    public static final Js5ConfigGroup field8044 = new Js5ConfigGroup(79);

    public static final Js5ConfigGroup VAR_PLAYER_GROUP = new Js5ConfigGroup(80);

    public static final Js5ConfigGroup field8004 = new Js5ConfigGroup(81);

    public static final Js5ConfigGroup field8047 = new Js5ConfigGroup(82);

    public static final Js5ConfigGroup WORLDAREATYPE = new Js5ConfigGroup(83);

    public static final Js5ConfigGroup field7997 = new Js5ConfigGroup(84);

    public final int id;

    public final int groupSizeInBits;

	public Js5ConfigGroup(int arg0) {
		this(arg0, 0);
	}

	public Js5ConfigGroup(int arg0, int arg1) {
		this.id = arg0;
		this.groupSizeInBits = arg1;
	}

    public int getGroupSize() {
		return 0x1 << this.groupSizeInBits;
	}

    public int getClientGroupId(int arg0) {
		return arg0 >>> this.groupSizeInBits;
	}

    public int getClientFileId(int arg0) {
		return arg0 & (0x1 << this.groupSizeInBits) - 1;
	}
}
