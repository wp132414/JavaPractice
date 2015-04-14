package org.dimigo.oop;

public class Car2 {
	String company;
	String model;
	String color;
	int maxSpeed;
	int price;
	Car2(){
		
		
	}
	Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	public String getCompany() {
		return company;
		
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
}
