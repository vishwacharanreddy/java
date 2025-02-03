package com.wipro.java.oops.polymorphism;

public class Car {
	
	private String Company;
	private String BodyType;
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getBodyType() {
		return BodyType;
	}
	public void setBodyType(String bodyType) {
		BodyType = bodyType;
	}
	public void CarDetails() {
		System.out.println("Company : "+Company);
		System.out.println("BodyType : "+BodyType);
		
	}

}
