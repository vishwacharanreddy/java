/**
 * 
 */
package com.wipro.java.oops;


public class Employee {
	//private members variables
	private int account_no;
	private String name;
	private String emailid;
	   
	    // Getters and Setters for all the members
	
	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Employee [account_no=" + account_no + ", name=" + name + ", emailid=" + emailid + "]";
	}

	
	

	}


