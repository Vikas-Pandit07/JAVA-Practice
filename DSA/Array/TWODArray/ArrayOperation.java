package com.kodnest.DSA.Arrays.TWODArray;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int arr[][] = new int[n][n];

        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("pde elements are: ");
        ArrayOperation arrayOperation = new ArrayOperation();
        int ra[]= arrayOperation.getPDE(arr);

        for (int i : ra) {
            System.out.println(i);
        }

    }
    int[] getPDE(int arr[][]) {
        int sda[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j)
                    sda[i]= arr[i][j];
            }
        }
        return sda;
    }

}