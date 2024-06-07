package com.jagex.game.shared.framework.gwc;



public class GWCWorld extends GWCBasicWorld {

    public int field11705;

    public String field11703;

    public String field11704;

    public int field11707 = -1;

    public int field11702;

    public String field11706;

    public GWCLocation method18342() {
		return GWC.field7647[this.field7640];
	}

    public int method18330() {
		return this.field11702 == 0 ? this.method18342().field7634 : this.field11702;
	}

    public String method18336() {
		return this.field11702 == 0 ? this.method18342().field7633 : this.field11706;
	}
}
