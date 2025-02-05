package com.wipro.java.interface1;

public class Document implements Showable,Printable{
	
	public void print() {
		System.out.println("print");
	}
	
	public void show() {
		
		System.out.println("show");
	}
	
	public static void main(String arg[]) {
		
		Document doc1= new Document();
		doc1.show();
		doc1.print();
	}

}
