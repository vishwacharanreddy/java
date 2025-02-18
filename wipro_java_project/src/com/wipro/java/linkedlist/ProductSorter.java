package com.wipro.java.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSorter {
	 public static void main(String[] args) {
	     List<Product> products = new ArrayList<>();
	     products.add(new Product("Laptop", 999.99, 5));
	     products.add(new Product("Smartphone", 699.99, 4));
	     products.add(new Product("Tablet", 299.99, 3));

	     System.out.println("Original List:");
	     for (Product product : products) {
	         System.out.println(product);
	     }

	     // Sort by price
	     Collections.sort(products, new PriceComparator());
	     System.out.println("\nSorted by Price:");
	     for (Product product : products) {
	         System.out.println(product);
	     }

	     // Sort by rating (descending)
	     Collections.sort(products, new RatingComparator());
	     System.out.println("\nSorted by Rating (Descending):");
	     for (Product product : products) {
	         System.out.println(product);
	     }

	     // Sort by name
	     Collections.sort(products, new ProductNameComparator());
	     System.out.println("\nSorted by Name:");
	     for (Product product : products) {
	         System.out.println(product);
	     }
	 }
	}
