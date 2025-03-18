package com.kodnest.DSA.Arrays.EX.withoutredundancy;

import com.kodnest.DSA.Arrays.EX.withredundancy.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        Employee arr[] = new Employee[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name, ssn, gender and salary..");
            String n = sc.next();
            int ssn = sc.nextInt();
            String g = sc.next();
            int sa = sc.nextInt();

            arr[i] = new Employee();

            arr[i].name = n;
            arr[i].ssn = ssn;
            arr[i].gender = g;
            arr[i].salary = sa;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name+ " " + arr[i].ssn+ " " + arr[i].gender+ " " + arr[i].salary);
            if (i != arr.length-1)
                System.out.print(" || ");
        }
        System.out.println("]");
    }
}
