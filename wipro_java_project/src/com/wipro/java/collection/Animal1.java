package com.wipro.java.collection;

public class Animal1 {

    private String name; // Animal Name Property
    private String species; // Animal Species Property
    private int age; // Animal Age Property

    // Constructor
    public Animal1(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}
