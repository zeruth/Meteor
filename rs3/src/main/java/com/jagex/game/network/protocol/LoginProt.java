package com.jagex.game.network.protocol;



public class LoginProt {

    public static final LoginProt INIT_GAME_CONNECTION = new LoginProt(14, 0);

    public static final LoginProt INIT_JS5REMOTE_CONNECTION = new LoginProt(15, -1);

    public static final LoginProt GAMELOGIN = new LoginProt(16, -2);

    public static final LoginProt LOBBYLOGIN = new LoginProt(19, -2);

    public static final LoginProt REQUEST_WORLDLIST = new LoginProt(23, 4);

    public static final LoginProt CHECK_WORLD_SUITABILITY = new LoginProt(24, -1);

    public static final LoginProt GAMELOGIN_CONTINUE = new LoginProt(26, 0);

    public static final LoginProt SSL_WEBCONNECTION = new LoginProt(27, 0);

    public static final LoginProt CREATE_ACCOUNT_CONNECT = new LoginProt(28, -2);

    public static final LoginProt INIT_SOCIAL_NETWORK_CONNECTION = new LoginProt(29, -2);

    public static final LoginProt SOCIAL_NETWORK_LOGIN = new LoginProt(30, -2);

    public static final LoginProt INIT_DEBUG_CONNECTION = new LoginProt(31, 4);

    public final int id;

    public static final LoginProt[] BY_ID = new LoginProt[32];

	static {
		LoginProt[] all = values();
		for (int i = 0; i < all.length; i++) {
			BY_ID[all[i].id] = all[i];
		}
	}

    public static LoginProt[] values() {
		return new LoginProt[] { SSL_WEBCONNECTION, INIT_DEBUG_CONNECTION, INIT_JS5REMOTE_CONNECTION, LOBBYLOGIN, SOCIAL_NETWORK_LOGIN, CHECK_WORLD_SUITABILITY, INIT_SOCIAL_NETWORK_CONNECTION, GAMELOGIN_CONTINUE, REQUEST_WORLDLIST, CREATE_ACCOUNT_CONNECT, GAMELOGIN, INIT_GAME_CONNECTION };
	}

	public LoginProt(int id, int size) {
		this.id = id;
	}
}
