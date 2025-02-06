package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class Collections {

    public static void main(String[] args) {
        
        // LinkedList operations
        System.out.println("LinkedList :");
        LinkedList<String> fruitLinkedList = new LinkedList<String>();  // List of fruits
        
        // Adding elements to the LinkedList
        fruitLinkedList.add("Apple");
        fruitLinkedList.add("Banana");
        fruitLinkedList.add("Cherry");
        fruitLinkedList.add("Date");
        
        // Printing the LinkedList
        System.out.println("Original LinkedList: " + fruitLinkedList);
        
        // Removing an element from the LinkedList (removing "Cherry")
        fruitLinkedList.remove("Cherry");
        System.out.println("LinkedList after removal: " + fruitLinkedList);
        
        // Iterating through the LinkedList and printing each element
        System.out.print("Fruits in LinkedList: ");
        for (String fruit : fruitLinkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // ArrayList operations
        System.out.println("ArrayList :");
        List<Integer> numbersList = new ArrayList<Integer>();  // List of numbers
        
        // Adding elements to the ArrayList
        numbersList.add(101);
        numbersList.add(202);
        numbersList.add(303);
        numbersList.add(404);
        
        // Printing the ArrayList
        System.out.println("Original ArrayList: " + numbersList);
        
        // Removing an element from the ArrayList (removing number 202)
        numbersList.remove(Integer.valueOf(202));
        System.out.println("ArrayList after removal: " + numbersList);
        
        // Iterating through the ArrayList and printing each element
        System.out.print("Numbers in ArrayList: ");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }
        System.out.println();
        
        // HashMap operations
        System.out.println("HashMap :");
        Map<Integer, String> countryMap = new HashMap<Integer, String>();  // Map of country codes to country names
        
        // Adding key-value pairs to the HashMap
        countryMap.put(1, "USA");
        countryMap.put(2, "Canada");
        countryMap.put(3, "Germany");
        countryMap.put(4, "Australia");
        
        // Checking if the map contains a specific key
        if (countryMap.containsKey(4)) {
            System.out.println("Country with code 4: " + countryMap.get(4));
        }
        
        // Iterating through the HashMap and printing the key-value pairs
        System.out.println("Country Map:");
        for (Map.Entry<Integer, String> entry : countryMap.entrySet()) {
            System.out.println("Code " + entry.getKey() + ": " + entry.getValue());
        }
        
        // Removing a key-value pair from the HashMap (removing Germany)
        countryMap.remove(3);  // Removing the key 3 (Germany)
        System.out.println("Country Map after removal:");
        for (Map.Entry<Integer, String> entry : countryMap.entrySet()) {
            System.out.println("Code " + entry.getKey() + ": " + entry.getValue());
        }
    }

	public static void sort(List<Movie> movieList, Name name) {
		// TODO Auto-generated method stub
		
	}
}
