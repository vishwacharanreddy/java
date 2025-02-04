package com.wipro.java.oops.polymorphism;

public class Animal {
	
	private String Name;
	private String Sound;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSound() {
		return Sound;
	}
	public void setSound(String sound) {
		Sound = sound;
	}
	public void AnimalDetails() {
		System.out.println("Name : "+Name);
		System.out.println("Sound : "+Sound);
	}	

}
