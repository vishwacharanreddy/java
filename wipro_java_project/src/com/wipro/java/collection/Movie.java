package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String n; // Movie Name
    private double r; // Movie Rating
    private int y;    // Release year of the movie

    // Constructor
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Implementation of the compareTo method
    // for sorting by rating in descending order
    public int compareTo(Movie m) {
        return Double.compare(m.r, this.r); // Descending order
    }

    // Getter methods
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }

    // Inner static class for the main method
    public static class MovieDriver {
        public static void main(String[] args) {
            ArrayList<Movie> movies = new ArrayList<>();
            movies.add(new Movie("End Game", 8.8, 2010));
            movies.add(new Movie("Tenet", 8.6, 2014));
            movies.add(new Movie("The Dark Knight", 9.0, 2008));

            // Sorting movies based on rating
            Collections.sort(movies);

            // Display sorted movies
            for (Movie m : movies) {
                System.out.println(m.getName() + " - Rating: " + m.getRating());
            }
        }
    }
}

