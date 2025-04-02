package com.kodnest.DSA.Algorithms.SearchingAlgorithms.LinearSearch.Employee;

import java.util.Scanner;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}

public class EmaployeeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size");
        Employee empArray[] = new Employee[scan.nextInt()];

        System.out.println("Enter the elements");
        for (int i = 0; i < empArray.length; i++) {
            System.out.println("Enter name Of emp: " +(i+1));
            String name = scan.next();
            System.out.println("Enter age of emp "+(i+1));
            int age = scan.nextInt();

            empArray[i] = new Employee(name, age);
        }

        System.out.println("Enter the key name to search: ");
        String key = scan.next();

        SearchAlgo algo = new SearchAlgo();
        int index = algo.linear(empArray, key);

        if (index >= 0)
            System.out.println("key found...");
        else
            System.out.println("key not found...");
    }
}

