package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.LocalInnerClass;

public class CounterManager {
    int countUp(int maxCount) {
        class Counter {
            int count() {
                for (int i = 1; i <= maxCount; i++) {
                    System.out.println("Count: " + i);
                }
                return 0;
            }
        }
        Counter counter = new Counter();
        return counter.count();
    }
}
