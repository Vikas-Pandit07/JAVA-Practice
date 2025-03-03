package com.kodnest.OopsConcepts.DesignPatterns;

public class CEO {
    private String name = "Swami";
    private long salary = 100000.00;

    private CEO() {

    }

    public static String bringBusiness(String name, long salary) {

        if (name == null) {
            System.out.println("name is: " + a + " having a " + b + " p.a. business doing.");
        }
        else {
            return name;
        }
        return name;
    }

    public static double take(String a) {
        if (a == null) {
            System.out.println("name is: " + a + " taking leave");
        }
        else {
            return a;
        }
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
