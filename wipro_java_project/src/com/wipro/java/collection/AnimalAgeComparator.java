package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Ascending order of age
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", "Mammal", 10));
        animals.add(new Animal("Elephant", "Mammal", 25));
        animals.add(new Animal("Tiger", "Mammal", 8));
        animals.add(new Animal("Cheetah", "Mammal", 15));
        
        Collections.sort(animals, new AnimalAgeComparator());
        
        System.out.println("Animals sorted by Age (low to high):");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " (" + animal.getSpecies() + ") - Age: " + animal.getAge());
        }
    }
}
