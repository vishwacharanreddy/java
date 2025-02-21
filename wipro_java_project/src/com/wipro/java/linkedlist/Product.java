package com.wipro.java.linkedlist;

import java.util.*;

//Product class
class Product {
 String name;
 double price;
 int rating;

 public Product(String name, double price, int rating) {
     this.name = name;
     this.price = price;
     this.rating = rating;
 }

 @Override
 public String toString() {
     return name + " - $" + price + " - " + rating + " stars";
 }
}

//Comparator to sort by price
class PriceComparator implements Comparator<Product> {
 @Override
 public int compare(Product p1, Product p2) {
     return Double.compare(p1.price, p2.price);
 }
}

//Comparator to sort by rating
class RatingComparator implements Comparator<Product> {
 @Override
 public int compare(Product p1, Product p2) {
     return Integer.compare(p2.rating, p1.rating); // Descending order
 }
}

//Comparator to sort by name
class ProductNameComparator implements Comparator<Product> {
 @Override
 public int compare(Product p1, Product p2) {
     return p1.name.compareTo(p2.name);
 }
}

