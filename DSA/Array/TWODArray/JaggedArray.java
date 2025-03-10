package com.kodnest.DSA.Arrays.TWODArray;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array");
        int arr[][] = new int[3][];
        // Redundancy
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter the class " +i+ " & student " +j);
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
