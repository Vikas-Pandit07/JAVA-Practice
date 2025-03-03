package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.AnonymousClasses;

interface Greeter {
    String greet();
}

public class SimpleGreeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter() {
            @Override
            public String greet() {
                return "Hello from Anonymous Inner Class!...";
            }
        };
        System.out.println(greeter.greet());
    }
}
