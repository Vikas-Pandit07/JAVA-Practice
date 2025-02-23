package com.kodnest.oops.Polymorphism;

public class Monkey extends Animal{
    @Override
    void eat() {
        System.out.println("Monkey still and eats...");
    }
    @Override
    void sleep() {
        System.out.println("MOney will slip on tree...");
    }
}
