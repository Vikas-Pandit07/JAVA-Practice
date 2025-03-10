package com.kodnest.DSA.Arrays.TWODArray;

import java.util.Scanner;

public class SumOfMinimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int rows = scan.nextInt();
        System.out.println("Enter no of columns: ");
        int cols = scan.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element of row " + i + " & column " + j);
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int min = arr[i][0];
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
            System.out.println("Minimum of row " + (i+1) +": " + min);
            sum += min;
        }
        int minSum = sum;
        System.out.println("Sum of minimum elements: " + minSum);
    }
}
