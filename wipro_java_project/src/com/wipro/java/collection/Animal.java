package com.wipro.java.collection;

import java.util.Comparator;
import java.util.Objects;

// POJO class implementing Comparable
class Animal implements Comparable<Animal> {
    private String name; // Animal Name Property
    private String species; // Animal Species Property
    private int age; // Animal Age Property

    // Constructor
    public Animal(String name, String species, int age) {
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

    // Sorting logic: Sort by age (lower to higher)
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age); // Ascending order of age
    }

    // Override toString method for printing
    @Override
    public String toString() {
        return name + " (" + species + ") - Age: " + age;
    }
}
