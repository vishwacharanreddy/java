package com.wipro.java.oops;

abstract class OOPS {
    private String name;
    private String author;
    private int id;

    public OOPS(String name, String author, int id) {
        this.name = name;
        this.author = author;
        this.id = id;
    }

    // Abstract method to be implemented in child classes
    public abstract void showDetails();

    // Encapsulation - Getter methods
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }
}

class Book extends OOPS {
    private int numberOfPages;

    public Book(String name, String author, int id, int numberOfPages) {
        super(name, author, id);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + getName() + " by " + getAuthor() + " | ID: " + getId() + " | Pages: " + numberOfPages);
    }
}

class Magazine extends OOPS {
    private int issueNumber;

    public Magazine(String name, String author, int id, int issueNumber) {
        super(name, author, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void showDetails() {
        System.out.println("Magazine: " + getName() + " by " + getAuthor() + " | ID: " + getId() + " | Issue: " + issueNumber);
    }
}

public class OopsMain {
    public static void main(String[] args) {
        OOPS book = new Book("Learn Java", "John Smith", 101, 300);
        OOPS magazine = new Magazine("Tech World", "Emily Brown", 102, 7);

        // Using polymorphism to call overridden methods
        book.showDetails();
        magazine.showDetails();
    }
}
