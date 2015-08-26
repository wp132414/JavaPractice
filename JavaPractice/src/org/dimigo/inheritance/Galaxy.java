package org.dimigo.inheritance;

public class Galaxy extends SmartPhone{
	
	public Galaxy(){
		
	}
	
	public Galaxy(String model , String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.print("삼성 페이");
		super.pay();
	}
	
	public void useWirelesscharging(){
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
