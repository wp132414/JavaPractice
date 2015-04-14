package org.dimigo.oop;

public class Car3 {
	String company;
	String model;
	String color;
	int maxSpeed;
	int price;
	Car3(){
		
		
	}
	public Car3(String Company, String Model, String Color, int MaxSpeed, int Price) {
		this.company = Company;
		this.model = Model;
		this.color = Color;
		this.maxSpeed = MaxSpeed;
		this.price = Price;
	}
	public Car3(String Company, String Model, String Color, int MaxSpeed) {
		this(Company,Model,Color,MaxSpeed,0);
		
	}
	public Car3(String Company, String Model, String Color) {
		this(Company,Model,Color,0,0);
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
