package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<TvShow> tvShows = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding objects using overloaded constructors
        animals.add(new Animal("Buddy", true));
        animals.add(new Animal("Whiskers", false));
        animals.add(new Animal());  // Using default constructor

        tvShows.add(new TvShow("Breaking Bad", 62, "Drama"));
        tvShows.add(new TvShow("Friends", 236, "Comedy"));
        tvShows.add(new TvShow());  // Using default constructor

        books.add(new Book("The Great Gatsby", 180, 1925));
        books.add(new Book("To Kill a Mockingbird", 281, 1960));
        books.add(new Book());  // Using default constructor

        // Print all animals
        System.out.println("Animal List:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Print all TV shows
        System.out.println("\nTV Show List:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        // Print all books
        System.out.println("\nBook List:");
        for (Book book : books) {
            System.out.println(book);
        }

        scanner.close();
    }
}
