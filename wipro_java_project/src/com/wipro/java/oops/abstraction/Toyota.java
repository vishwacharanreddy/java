package com.wipro.java.oops.abstraction;

public class Toyota extends Car {
	
	void model() {
		System.out.println("Fortuner");
	}
	
	void speed() {
		System.out.println("230km/hr");
	}

	
	public static void main(String[] args) {
		Car car= new Toyota();
		car.model();
		car.speed();
	
	}

}