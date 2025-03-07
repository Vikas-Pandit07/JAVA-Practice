package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class SumOfEven {
    public int findEven (int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int arr[] = new int[scanner.nextInt()];

        System.out.println("Enter the " + arr.length + " Elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        SumOfEven sumOfEven = new SumOfEven();
        int evenSum = sumOfEven.findEven(arr);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
