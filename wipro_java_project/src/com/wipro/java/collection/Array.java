/**
 * 
 */
package com.wipro.java.collection;


 class Array {
     public static void main(String[] args) {
		
		
		int[] arr;// Declaring an array of size 5
		
		arr = new int[5];// Initializing the array with 5 elements

		
		 // Assigning values to each element in the array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		// Iterating through the array using a for loop
		for(int i=0; i<arr.length; i++)
		   System.out.println(" Element at index " + i + " : " +arr[i]);

	}

}
