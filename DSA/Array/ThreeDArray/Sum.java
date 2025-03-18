package com.kodnest.DSA.Arrays.ThreeDArray;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layer = scanner.nextInt();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int arr[][][] = new int[layer][rows][cols];

        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("3D Array:");

        for (int i = 0; i < layer; i++) {
            System.out.println("Layer "+(i+1)+":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        for (int i = 0; i < layer; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    sum += arr[i][j][k];
                }
            }
            System.out.println("Sum of layer " + (i+1) + ": " + sum);
        }
    }
}