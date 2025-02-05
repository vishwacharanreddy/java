package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {
        
        // Create a map with Integer keys and String values
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        // Add new keyvalue pairs to the map
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Cherry");
        map.put(104, "Date");
        
        // Check if the map contains a specific key and retrieve the value
        if(map.containsKey(104)) {
            System.out.println("Key 104 : " + map.get(104));
        }
        
        System.out.println();
        
        // Iterate over the map and print all key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        System.out.println();
        
        // Remove a keyvalue pair from the map
        map.remove(103);
        
        // Iterate over the map again to print the updated map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
