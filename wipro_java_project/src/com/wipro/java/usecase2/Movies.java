package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.Collectors;

// Abstract Class (Abstraction)
abstract class Film {
    protected String filmId;
    protected String name;
    protected int availableTickets;
    protected double price;

    public Film(String filmId, String name, int availableTickets, double price) {
        this.filmId = filmId;
        this.name = name;
        this.availableTickets = availableTickets;
        this.price = price;
    }

    public abstract String getCategory(); // Polymorphism

    // Getters
    public String getFilmId() { return filmId; }
    public String getName() { return name; }
    public int getAvailableTickets() { return availableTickets; }
    public double getPrice() { return price; }

    // Booking a Ticket (Reduce available tickets)
    public boolean reserveTickets(int tickets) {
        if (tickets <= availableTickets) {
            availableTickets -= tickets;
            return true;
        }
        return false;
    }

    // Display Film Details
    public void showDetails() {
        System.out.println("Film ID: " + filmId + ", Name: " + name + 
                ", Category: " + getCategory() + ", Price: " + price +
                ", Available Tickets: " + availableTickets);
    }
}

// Concrete Class (Inheritance)
class ThrillerFilm extends Film {
    public ThrillerFilm(String filmId, String name, int availableTickets, double price) {
        super(filmId, name, availableTickets, price);
    }

    @Override
    public String getCategory() {
        return "Thriller";
    }
}

// Concrete Class (Inheritance)
class RomanticFilm extends Film {
    public RomanticFilm(String filmId, String name, int availableTickets, double price) {
        super(filmId, name, availableTickets, price);
    }

    @Override
    public String getCategory() {
        return "Romantic";
    }
}

// Film Ticket Booking System
public class Movies {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();

        // Adding Films to the List
        films.add(new ThrillerFilm("F101", "Inception", 50, 300.00));
        films.add(new RomanticFilm("F102", "The Notebook", 30, 250.00));
        films.add(new ThrillerFilm("F103", "Interstellar", 40, 350.00));
        films.add(new RomanticFilm("F104", "La La Land", 25, 200.00));

        // Displaying all available films using Java 8 forEach
        System.out.println("Available Films:");
        films.forEach(Film::showDetails);

        // Using HashMap to store and retrieve films by ID
        Map<String, Film> filmMap = films.stream()
                .collect(Collectors.toMap(Film::getFilmId, film -> film));

        // Booking Tickets using Optional to avoid null checks
        String filmIdToReserve = "F103";
        int ticketsToReserve = 3;

        System.out.println("\nReserving " + ticketsToReserve + " tickets for Film ID: " + filmIdToReserve);
        Optional<Film> optionalFilm = Optional.ofNullable(filmMap.get(filmIdToReserve));

        optionalFilm.ifPresentOrElse(film -> {
            if (film.reserveTickets(ticketsToReserve)) {
                System.out.println("Reservation Successful!");
                film.showDetails();
            } else {
                System.out.println("Reservation Failed! Not enough tickets available.");
            }
        }, () -> System.out.println("Film not found!"));

        // Sorting Films by Price using Comparator and Streams
        System.out.println("\nFilms Sorted by Ticket Price:");
        films.stream()
                .sorted(Comparator.comparingDouble(Film::getPrice))
                .forEach(Film::showDetails);

        // Filtering Thriller Films using Java 8 Streams
        System.out.println("\nFiltered Thriller Films:");
        films.stream()
                .filter(film -> "Thriller".equals(film.getCategory()))
                .forEach(Film::showDetails);

        // Counting Available Tickets using Streams
        int totalTicketsAvailable = films.stream()
                .mapToInt(Film::getAvailableTickets)
                .sum();
        System.out.println("\nTotal Available Tickets Across All Films: " + totalTicketsAvailable);

        // Displaying updated film list
        System.out.println("\nUpdated Film List:");
        films.forEach(Film::showDetails);
    }
}