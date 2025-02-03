/**
 * 
 */
package com.wipro.java.oops;

/** parent class is employee
 * child class is projectlead
 * extends is the keyword
 * 
 */
public class ProjectLead extends Employee{

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// Child object is instantiated from child constructor
		// Parent class takes the properties of child class
		Employee employee = new ProjectLead();
		employee.setAccount_no(234);
		employee.setName("Vishwa");
		employee.setEmailid("vishwacharank@gamail.com");
		
		System.out.println(employee.getAccount_no());
		System.out.println(employee.getName());
		System.out.println(employee.getEmailid());
		

	}

}
