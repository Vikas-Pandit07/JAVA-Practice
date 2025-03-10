package com.kodnest.DataStructureAndAlgorithm.Arrays.TWODArray;

import java.util.Scanner;

public class Transport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int rows = scan.nextInt();
        System.out.println("Enter no of columns: ");
        int cols = scan.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element of row " + i + " & column " + j);
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        System.out.println();
            int arr2[][] = new int[cols][rows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j][i]=arr[i][j];
            }
        }

        System.out.println("Array 2 elements are");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
