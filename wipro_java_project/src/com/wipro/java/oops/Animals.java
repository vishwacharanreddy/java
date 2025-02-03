/**

 // no constructors
 * getters have return value
 * setters have no return value
 * properties are determined using private fields
 * values are behaviors are determined through setters
 */
package com.wipro.java.oops;


public class Animals {
    //private properties
	private String animalname;
	private String animaltype;
	private String animalregion;
	
	public String getAnimalname() {
		return animalname;
	}

	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}

	public String getAnimaltype() {
		return animaltype;
	}

	public void setAnimaltype(String animaltype) {
		this.animaltype = animaltype;
	}

	public String getAnimalregion() {
		return animalregion;
	}

	public void setAnimalregion(String animalregion) {
		this.animalregion = animalregion;
	}

	@Override
	public String toString() {
		return "Animals [animalname=" + animalname + ", animaltype=" + animaltype + ", animalregion=" + animalregion
				+ "]";
	}

	
	

	}


