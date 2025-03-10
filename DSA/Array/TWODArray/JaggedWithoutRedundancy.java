package com.kodnest.DSA.Arrays.TWODArray;

import java.util.Scanner;

public class JaggedWithoutRedundancy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1D lenght");
        int arr[][] = new int[scanner.nextInt()][];

        System.out.println("Enter 2D length for each 1D");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the 2D length " + i);
            arr[i] = new int[scanner.nextInt()];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter the class " + i + " & student " + j);
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements are:....");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}