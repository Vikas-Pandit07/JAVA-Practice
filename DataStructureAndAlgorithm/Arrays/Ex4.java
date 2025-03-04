package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Employee:");

//        int size = scan.nextInt();
//        String[] arr = new String[size];

        //directly can
        String arr[] = new String[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the name of emp : " + i);
            arr[i] = scan.next();
        }

        System.out.println("Employees are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
