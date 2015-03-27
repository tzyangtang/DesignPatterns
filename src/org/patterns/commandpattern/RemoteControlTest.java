package org.patterns.commandpattern;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl control = new SimpleRemoteControl();
		GarageDoor gd = new GarageDoor();
		control.setCommand(new GarageDoorOpenCommand(gd));
		control.buttonPressed();
	}

}
