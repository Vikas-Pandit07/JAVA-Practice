package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int arr[] = new int[scan.nextInt()];

        System.out.println("Enter the " + arr.length + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The Sum of Array is: " + sumFind(arr));
    }

    public static int sumFind(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}