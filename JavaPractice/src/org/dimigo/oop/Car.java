package org.dimigo.oop;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int price;
	
	String getCompany() {
		return company;
		
	}
	String getModel() {
		return model;
	}
	String getColor() {
		return color;
	}
	int getMaxSpeed() {
		return maxSpeed;
	}
	int getPrice() {
		return price;
	}
	void setCompany(String companya) {
		company = companya;
	}
	void setModel(String modela) {
		model = modela;
	}
	void setColor(String colora) {
		color = colora;
	}
	void setMaxSpeed(int maxSpeeda) {
		maxSpeed = maxSpeeda;
	}
	void setPrice(int pricea) {
		price = pricea;
	}
}
