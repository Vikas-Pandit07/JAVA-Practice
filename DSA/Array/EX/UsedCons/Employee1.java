package com.kodnest.DSA.Arrays.EX.UsedCons;

public class Employee1 {
    String name;
    int ssn;
    String gender;
    double salary;

    public Employee1(String name, int ssn, String gender, double salary) {
        this.name = name;
        this.ssn = ssn;
        this.gender = gender;
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is Working...");
    }
}
