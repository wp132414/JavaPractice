package org.dimigo.inheritance;

public class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	public SmartPhone(){
		
	}
	public SmartPhone(String model,String company,int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "�� ������ �մϴ�");
	}
	
	public void turnOff(){
		System.out.println(model + "�� ������ ���ϴ�");
	}
	
	public void pay() {
		System.out.println("�����մϴ�.");
	}
	
	public void useSpecialFunction(){
		if (this instanceof IPhone) {
			((IPhone)this).useAirDrop();
		}
		else {
			((Galaxy)this).useWirelesscharging();
		}
	} 
	
	public String toString(){
		return "�𵨸� : " + model + "������ : " + company + "���� : " + price;
	}
}
