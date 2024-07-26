package org.example;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        System.out.println("Counter1 initial value: " + counter1.value()); 
        System.out.println("Counter2 initial value: " + counter2.value());

        counter1.increase();
        counter2.increase(5);

        System.out.println("Counter1 value after increase: " + counter1.value()); 
        System.out.println("Counter2 value after increasing by 5: " + counter2.value()); 

        counter1.decrease();
        counter2.decrease(3);

        System.out.println("Counter1 value after decrease: " + counter1.value()); 
        System.out.println("Counter2 value after decreasing by 3: " + counter2.value()); 

        counter1.increase(-5);
        counter2.decrease(-10);

        System.out.println("Counter1 value after attempting to increase by -5: " + counter1.value()); 
        System.out.println("Counter2 value after attempting to decrease by -10: " + counter2.value());
    }
}
