package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int arr[] = new int[scan.nextInt()];

        System.out.println("Enter " + arr.length + " number of Elements: ");
        for (int i = 0; i < arr.length; i++) {
           arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int res = FindSum.arrayManipulation(arr);
        System.out.println(" = " + res);
    }

    public static int arrayManipulation(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}