package com.kodnest.DSA.Arrays.TWODArray;

import java.util.Scanner;

// principle diagonal elements
public class PDE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int matrix[][] = new int[n][n];

        System.out.println("enter the elements");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("pde elements are: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j)
                System.out.println(matrix[i][j] + " ");
            }
        }

    }

}
