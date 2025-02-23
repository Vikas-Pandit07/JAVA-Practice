package com.kodnest.oops.Polymorphism;

public class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger hunts and eats...");
    }
    @Override
    void sleep() {
        System.out.println("Tiger will slip in Den...");
    }
}
