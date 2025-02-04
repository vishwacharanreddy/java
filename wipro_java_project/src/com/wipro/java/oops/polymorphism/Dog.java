package com.wipro.java.oops.polymorphism;

public class Dog extends Animal {
	public void AnimalDetails(){
	System.out.println("Name : "+getName());
	System.out.println("Sound : "+getSound());
}

public static void main(String[] args) {
	
	Animal animal=new Dog();
	
	animal.setName("Dog");
	animal.setSound("Bow Bow");
	animal.AnimalDetails();
}

}



