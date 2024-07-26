package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    // Constructor with parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return "Animal Name: " + getName() + " | Is it a dog: " + (getIsDog() ? "True" : "False");
    }
}