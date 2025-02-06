package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalSpeciesComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getSpecies().compareTo(a2.getSpecies()); // Ascending order
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", "Mammal", 10));
        animals.add(new Animal("Elephant", "Mammal", 25));
        animals.add(new Animal("Tiger", "Mammal", 8));
        animals.add(new Animal("Cheetah", "Mammal", 15));
        
        Collections.sort(animals, new AnimalSpeciesComparator());
        
        System.out.println("Animals sorted by Species (A-Z):");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " (" + animal.getSpecies() + ") - Age: " + animal.getAge());
        }
    }
}
