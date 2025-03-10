package com.kodnest.DataStructureAndAlgorithm.Arrays.TWODArray;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[3][4];

        for (int i = 0; i <= arr.length - 1; i++ ) {
            for (int j = 0; j <= arr[i].length -1; j++) {
                System.out.println("enter marks of class " + i + " & student of " + j);
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array elements are:....");
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
