package com.jagex.game.client;

import com.jagex.core.io.SendablePacket;
import com.jagex.game.network.protocol.ClientProt;

import rs2.client.Client;

public class ClientAutoSetupResult extends AutoSetupResult implements SendablePacket {

    public void method9201() {
		ClientMessage var1 = ClientMessage.createMessage(ClientProt.AUTO_SETUP_RESULT, Client.gameConnection.randomOut);
		var1.buf.p2(this.field8904);
		var1.buf.p1_alt1(this.field8905);
		var1.buf.p3_alt3(this.field8900);
		var1.buf.p3_alt3(this.field8903);
		var1.buf.p2(this.field8899);
		var1.buf.p1_alt3(this.result);
		var1.buf.p3(this.field8902);
		var1.buf.p3_alt2(this.field8898);
		Client.gameConnection.queue(var1);
	}

    public void setResultId(int resultId) {
		this.result = resultId;
	}

    public void method18313(int arg0) {
		this.field8904 |= arg0;
	}

    public void method18314(int arg0) {
		this.field8905 = arg0;
	}

    public void method18318(int arg0, int profileTime) {
		if (arg0 == 0 && profileTime > 32767) {
			profileTime = 32767;
		} else if (profileTime > 8388607) {
			profileTime = 8388607;
		}
		switch(arg0) {
			case 0:
				this.field8899 = profileTime;
				break;
			case 1:
				this.field8898 = profileTime;
			case 2:
			case 4:
			default:
				break;
			case 3:
				this.field8902 = profileTime;
				break;
			case 5:
				this.field8903 = profileTime;
		}
	}
}
