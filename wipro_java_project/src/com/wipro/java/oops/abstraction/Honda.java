package com.wipro.java.oops.abstraction;
// inheriting the abstract class
public class Honda extends Car {
	
	void model() {
		System.out.println("Honda City");
	}
	
	void speed() {
		System.out.println("202km/hr");
	}

	
	public static void main(String[] args) {
		Car car= new Honda();
		car.model();
		car.speed();
	
	}

}
