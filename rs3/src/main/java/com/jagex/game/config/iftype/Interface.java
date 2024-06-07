package com.jagex.game.config.iftype;



public class Interface {

    public Component[] components;

    public Component[] field2152;

    public boolean field2150;

	public Interface(boolean arg0, Component[] arg1) {
		this.components = arg1;
		this.field2150 = arg0;
	}

    public Component[] method3923() {
		return this.field2152 == null ? this.components : this.field2152;
	}

    public Component[] initSortedComponents() {
		if (this.field2152 == null) {
			int var1 = this.components.length;
			this.field2152 = new Component[var1];
			System.arraycopy(this.components, 0, this.field2152, 0, this.components.length);
		}
		return this.field2152;
	}

    public Component getComponent(int arg0) {
		if (this.components[0].parentlayer >>> 16 != arg0 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.components[arg0 & 0xFFFF];
	}
}
