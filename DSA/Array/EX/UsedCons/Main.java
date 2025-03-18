package com.kodnest.DSA.Arrays.EX.UsedCons;

import com.kodnest.DSA.Arrays.EX.withredundancy.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        Employee1 arr[] = new Employee1[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name, ssn, gender and salary.." +i);
            arr[i] = new Employee1(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
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
