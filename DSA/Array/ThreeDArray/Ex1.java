package com.kodnest.DSA.Arrays.ThreeDArray;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 3D array length");
        int arr[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the data to store in 1D "+i+ " 2D " +j+ " 3D "+k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
         }

        System.out.println("Array Elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
