package com.wipro.java.oops.polymorphism;

public class Cat extends Animal {
	public void AnimalDetails() {
		System.out.println("Name : "+getName());
		System.out.println("Sound : "+getSound());
	}
	public static void main(String[] args) {
		
		Animal animal=new Cat();
		
		animal.setName("Cat");
		animal.setSound("Meow Meow");
		animal.AnimalDetails();
		
	}
}

	
