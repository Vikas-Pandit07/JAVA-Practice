package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class SumEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

            int sum = 0;
            for (int x : arr) {
                sum += x;
            }

        System.out.print("Array: [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1)
                    System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Sum: " + sum);
    }
}
