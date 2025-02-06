package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalSort {
    public static void main(String[] args) {
        // Creating a list of animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", "Mammal", 10));
        animals.add(new Animal("Elephant", "Mammal", 25));
        animals.add(new Animal("Tiger", "Mammal", 8));
        animals.add(new Animal("Cheetah", "Mammal", 15));

        // Sorting animals based on age (low to high)
        Collections.sort(animals);

        // Printing sorted animals
        System.out.println("Animals sorted by age (low to high):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

