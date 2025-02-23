package com.kodnest.oops.Polymorphism;

public class Deer extends Animal{
    @Override
    public void eat() {
        System.out.println("Deer Grazes and eats...");
    }
    @Override
    public void sleep() {
        System.out.println("Deer will slip on barren land...");
    }
}
