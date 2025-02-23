package com.kodnest.oops.Inheritance;

public class Egle extends Bird{
    @Override
    public void fly() {
        System.out.println("Egle fly high...");
    }
    @Override
    public void eat() {
        System.out.println("Egle hunts and eats...");
    }
    @Override
    public void sleep() {
        System.out.println("Egle sleep on tall trees...");
    }
}
