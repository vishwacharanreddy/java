package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperators {
	
	public static void main(String[] args) {
		
		// Create the first list l1
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1);  // Adds 1 at index 0
		l1.add(1, 2);  // Adds 2 at index 1
		l1.add(2, 2);  // Adds another 2 at index 2
		System.out.println(l1);  
		
		// Create the second list l2
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);  // Adds 1 to l2
		l2.add(2);  // Adds 2 to l2
		l2.add(3);  // Adds 3 to l2
		
		// Add all elements from l2 into l1 starting at index 1
		l1.addAll(1, l2);
		System.out.println(l1);  
		
		// Remove element at index 1 (which is 1)
		l1.remove(1);
		System.out.println(l1); 
		
		// Get the element at index 3 (which is 2)
		System.out.println(l1.get(3));  
		
		// Set the value at index 0 to 5
		l1.set(0, 5);
		System.out.println(l1);  
	}
}
