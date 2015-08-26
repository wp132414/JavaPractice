package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone phone[] = {
				new IPhone("iPhone 6","¾ÖÇÃ",700000),
				new Galaxy("°¶·°½Ã S6","»ï¼º",650000)
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
