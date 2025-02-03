package com.wipro.java.oops.polymorphism;

public class Mercedes extends Car {
	public void CarDetails() {
		System.out.println("Company : "+getCompany());
		System.out.println("BodyType : "+getBodyType());
	}
	
	public static void main(String[] args) {
		
		Car car=new Mercedes();
		
		car.setCompany("Mercedes");
		car.setBodyType("Sedan");
		car.CarDetails();
	}

}
