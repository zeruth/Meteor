package com.jagex.game.client;

import deob.ObfuscatedName;

public class JavConfigParameter {

    public static final JavConfigParameter JAVASCRIPT = new JavConfigParameter("31", "31");

    public static final JavConfigParameter MODE_WHERE = new JavConfigParameter("27", "27");

    public static final JavConfigParameter CONTENT_MODE = new JavConfigParameter("36", "36");

    public static final JavConfigParameter MODE_GAME = new JavConfigParameter("46", "46");

    public static final JavConfigParameter SITE_SETTINGS_MEMBER = new JavConfigParameter("52", "52");

    public static final JavConfigParameter WORLD_ID = new JavConfigParameter("50", "50");

    public static final JavConfigParameter COUNTRY = new JavConfigParameter("20", "20");

    public static final JavConfigParameter WORLD_HOST = new JavConfigParameter("38", "38");

    public static final JavConfigParameter field4128 = new JavConfigParameter("47", "47");

    public static final JavConfigParameter WORLD_PORT = new JavConfigParameter("8", "8");

    public static final JavConfigParameter WORLD_PORT2 = new JavConfigParameter("19", "19");

    public static final JavConfigParameter field4134 = new JavConfigParameter("34", "34");

    public static final JavConfigParameter LOBBY_ID = new JavConfigParameter("54", "54");

    public static final JavConfigParameter LOBBY_HOST = new JavConfigParameter("43", "43");

    public static final JavConfigParameter LOBBY_PORT = new JavConfigParameter("29", "29");

    public static final JavConfigParameter LOBBY_PORT2 = new JavConfigParameter("41", "41");

    public static final JavConfigParameter LANG = new JavConfigParameter("26", "26");

    public static final JavConfigParameter AFFILIATE_ID = new JavConfigParameter("24", "24");

    public static final JavConfigParameter ADVERT = new JavConfigParameter("2", "2");

    public static final JavConfigParameter field4119 = new JavConfigParameter("4", "4");

    public static final JavConfigParameter SITE_SETTINGS = new JavConfigParameter("35", "35");

    public static final JavConfigParameter field4110 = new JavConfigParameter("15", "15");

    public static final JavConfigParameter field4129 = new JavConfigParameter("5", "5");

    public static final JavConfigParameter RUN_INFRAME = new JavConfigParameter("33", "33");

    public static final JavConfigParameter field4122 = new JavConfigParameter("13", "13");

    public static final JavConfigParameter DOMAIN = new JavConfigParameter("10", "10");

    public static final JavConfigParameter FROM_BILLING = new JavConfigParameter("55", "55");

    public static final JavConfigParameter USER_FLOW1 = new JavConfigParameter("25", "25");

    public static final JavConfigParameter USER_FLOW2 = new JavConfigParameter("9", "9");

    public static final JavConfigParameter CREATE_ADDITIONAL_INFO = new JavConfigParameter("51", "51");

    public static final JavConfigParameter field4130 = new JavConfigParameter("49", "49");

    public static final JavConfigParameter LOADING_BAR_CONFIG = new JavConfigParameter("40", "40");

    public static final JavConfigParameter OWNER = new JavConfigParameter("16", "16");

    public static final JavConfigParameter HAVE_CHROME = new JavConfigParameter("42", "42");

    public static final JavConfigParameter field4131 = new JavConfigParameter("11", "11");

    public static final JavConfigParameter GAMEPACK = new JavConfigParameter("6", "6");

    public static final JavConfigParameter CREATE_EMAIL = new JavConfigParameter("21", "21");

    public static final JavConfigParameter CLIENTTYPE = new JavConfigParameter("17", "17");

    public static final JavConfigParameter field4157 = new JavConfigParameter("1", "1");

    public static final JavConfigParameter CLIENT_STATS = new JavConfigParameter("37", "37");

    public static final JavConfigParameter CONTENT_HOST = new JavConfigParameter("23", "23");

    public static final JavConfigParameter CONTENT_ID = new JavConfigParameter("32", "32");

    public static final JavConfigParameter CONTENT_PORT = new JavConfigParameter("12", "12");

    public static final JavConfigParameter CONTENT_PORT2 = new JavConfigParameter("30", "30");

    public static final JavConfigParameter HTTP_CONTENT_PORT = new JavConfigParameter("44", "44");

    public static final JavConfigParameter HTTP_CONTENT_PORT2 = new JavConfigParameter("53", "53");

    public static final JavConfigParameter HTTP_CONTENT_HOST = new JavConfigParameter("14", "14");

    public static final JavConfigParameter HTTP_CONTENT_ID = new JavConfigParameter("45", "45");

    public static final JavConfigParameter field4155 = new JavConfigParameter("7", "7");

    public static final JavConfigParameter PNG_HOST = new JavConfigParameter("28", "28");

    public static final JavConfigParameter field4145 = new JavConfigParameter("39", "39");

    public static final JavConfigParameter field4158 = new JavConfigParameter("3", "3");

    public static final JavConfigParameter AUTH_HOST = new JavConfigParameter("22", "22");

    public static final JavConfigParameter PAYMENTS_URL = new JavConfigParameter("18", "18");

    public static final JavConfigParameter GOOGLE_ADSENSE = new JavConfigParameter("48", "48");

    public final String key;

    public static JavConfigParameter[] values() {
		return new JavConfigParameter[] {HTTP_CONTENT_PORT, AUTH_HOST, OWNER, HTTP_CONTENT_ID, LOBBY_PORT2, ADVERT, DOMAIN, CONTENT_ID, LOBBY_HOST, field4128, CONTENT_PORT2, field4131, field4145, SITE_SETTINGS_MEMBER, CONTENT_MODE, JAVASCRIPT, field4119, field4130, SITE_SETTINGS, AFFILIATE_ID, WORLD_ID, HTTP_CONTENT_HOST, CREATE_ADDITIONAL_INFO, GOOGLE_ADSENSE, field4122, GAMEPACK, field4134, field4158, CLIENT_STATS, field4110, USER_FLOW1, MODE_GAME, CONTENT_HOST, HAVE_CHROME, PAYMENTS_URL, FROM_BILLING, CLIENTTYPE, MODE_WHERE, COUNTRY, WORLD_PORT, RUN_INFRAME, CREATE_EMAIL, field4155, field4157, USER_FLOW2, LANG, LOBBY_PORT, WORLD_PORT2, field4129, LOADING_BAR_CONFIG, LOBBY_ID, WORLD_HOST, CONTENT_PORT, PNG_HOST, HTTP_CONTENT_PORT2};
	}

	public JavConfigParameter(String arg0, String key) {
		this.key = key;
	}
}
