package com.wipro.java.collection;

import java.util.LinkedList;  // Import LinkedList class
import java.util.List;

public class LinkedListTest {  

    public static void main(String[] args) {
        
        int size = 6;
        List<Integer> list = new LinkedList<Integer>();  
        
        // Adding elements to the list
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        
        System.out.println(list);  
        
        // Remove the element at index 4
        list.remove(4);  
        System.out.println(list);  
        
        // Iterate over the list and print each element
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");  // Print each element with a space
        }
    }
}
