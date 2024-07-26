package org.example;

public class Main {
    public static void main(String[] args) {
        // Create counters using different constructors
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        // Display initial values
        System.out.println("Counter1 initial value: " + counter1.value()); // Should print 0
        System.out.println("Counter2 initial value: " + counter2.value()); // Should print 10

        // Increase the counters
        counter1.increase();
        counter2.increase(5);

        // Display values after increasing
        System.out.println("Counter1 value after increase: " + counter1.value()); // Should print 1
        System.out.println("Counter2 value after increasing by 5: " + counter2.value()); // Should print 15

        // Decrease the counters
        counter1.decrease();
        counter2.decrease(3);

        // Display values after decreasing
        System.out.println("Counter1 value after decrease: " + counter1.value()); // Should print 0
        System.out.println("Counter2 value after decreasing by 3: " + counter2.value()); // Should print 12

        // Attempt to increase/decrease by negative values (should have no effect)
        counter1.increase(-5);
        counter2.decrease(-10);

        // Display values to confirm no changes from negative values
        System.out.println("Counter1 value after attempting to increase by -5: " + counter1.value()); // Should print 0
        System.out.println("Counter2 value after attempting to decrease by -10: " + counter2.value()); // Should print 12
    }
}
