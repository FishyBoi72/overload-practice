package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book() {
        this.title = "Unknown";
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Pages: " + getNumberOfPages() + ", Year: " + getPublicationYear();
    }
}
