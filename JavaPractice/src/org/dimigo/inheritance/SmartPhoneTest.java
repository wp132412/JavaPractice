package org.dimigo.inheritance;

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] sp = {
			new IPhone("아이폰 6", "애플", 700000), 
			new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for (SmartPhone smartphone : sp) {
			System.out.println(smartphone);
			smartphone.turnOn();
			smartphone.pay();
			smartphone.useSpecialFunction();
			smartphone.turnOff();
		}
	}
}
