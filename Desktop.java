package org.system;

public class Desktop {
	public void desktopSize() {
		System.out.println("My desktop size is 15.6' Full HD Display");
	}
	public static void main(String[] args) {
		Computer com = new Computer();
		Desktop des = new Desktop();
		com.computerModel();
		des.desktopSize();
	}
}
