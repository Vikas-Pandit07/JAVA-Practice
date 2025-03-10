package com.kodnest.DataStructureAndAlgorithm.Arrays.TWODArray;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[][] = new String[3][4];

        for (int i = 0; i <= arr.length - 1; i++ ) {
            for (int j = 0; j <= arr[i].length -1; j++) {
                System.out.println("enter names of company " + i + " & emp " + j);
                 arr[i][j] = scanner.next();
            }
        }

        System.out.println("emp names are:....");
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
