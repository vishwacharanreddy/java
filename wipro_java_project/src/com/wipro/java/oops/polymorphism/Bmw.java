package com.wipro.java.oops.polymorphism;

public class Bmw extends Car {
	public void CarDetails() {
		System.out.println("Company : "+getCompany());
		System.out.println("BodyType : "+getBodyType());
	}
	
	public static void main(String[] args) {
		
		Car car=new Bmw();
		
		car.setCompany("Bmw");
		car.setBodyType("Suv");
		car.CarDetails();
	}

}
