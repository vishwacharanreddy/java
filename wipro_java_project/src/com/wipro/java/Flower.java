/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {
	
	String namevalue;
	String colorvalue;
	
	Flower(String name, String color){
		this.namevalue=name;
		this.colorvalue=color;
	}
	
	void display() {
		System.out.println("Flower name:"+namevalue+"Flower color"+colorvalue);
	}
	
	public static void main(String args[]) {
		
		Flower flowerobject1=new Flower("rose","red");
		Flower flowerobject2=new Flower("lotus","pink");
		flowerobject1.display();
		flowerobject2.display();
	}
}

