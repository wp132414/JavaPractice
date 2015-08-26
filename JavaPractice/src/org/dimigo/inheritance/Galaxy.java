package org.dimigo.inheritance;

public class Galaxy extends SmartPhone{
	
	public Galaxy(){
		
	}
	
	public Galaxy(String model , String company, int price){
		super(model,company,price);
	}
	
	public void pay(){
		System.out.print("�Ｚ ����");
		super.pay();
	}
	
	public void useWirelesscharging(){
		System.out.println("���� ���� ����� ����մϴ�.");
	}
}
