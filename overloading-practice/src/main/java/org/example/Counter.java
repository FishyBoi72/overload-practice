package org.example;

public class Counter {
    private int count;

    // Constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.count = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this.count = 0;
    }

    // Method that returns the current value of the counter as an int
    public int value() {
        return this.count;
    }

    // Method that increases the value by 1
    public void increase() {
        this.count++;
    }

    // Overloaded method that increases the value by the value of increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.count += increaseBy;
        }
    }

    // Method that decreases the value by 1
    public void decrease() {
        this.count--;
    }

    // Overloaded method that decreases the value by the value of decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.count -= decreaseBy;
        }
    }
}