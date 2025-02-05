package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
	
	public static void main(String[] args) {
		
		try {
			File file=new File("Wrong Path");  // Create a File object with an invalid file path "Wrong Path"
			 
			// Attempt to create a FileReader object with the invalid file
            // This will throw an IOException because the file doesn't exist
			FileReader reader=new FileReader(file);
			
		}
		 // Catch the IOException (or any subclass of IOException) that occurs
        // when the file is not found, and print the stack trace of the exception.
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
