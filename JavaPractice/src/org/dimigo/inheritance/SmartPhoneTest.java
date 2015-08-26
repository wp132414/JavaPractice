package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone phone[] = {
				new IPhone("iPhone 6","����",700000),
				new Galaxy("������ S6","�Ｚ",650000)
		};
		
		for(SmartPhone i : phone) {
			System.out.println(i.toString());
			i.turnOn();
			i.pay();
			i.useSpecialFunction();
			i.turnOff();
		}	
	}

}
