package com.wipro.java.interface1;

public class Duck implements Animal {
	
	public void makeSound() {
		
		System.out.println("Quack Quack");
		
	}
	
	public static void main(String arg[]) {
		Animal duck1=new Duck();
		duck1.makeSound();
	}

}
