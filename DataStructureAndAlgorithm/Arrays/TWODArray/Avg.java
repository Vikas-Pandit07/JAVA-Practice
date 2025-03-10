package com.kodnest.DataStructureAndAlgorithm.Arrays.TWODArray;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row length: ");
        int arr[][] = new int[scan.nextInt()][];

        System.out.println("Enter column for each row: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the column length of " + i);
            arr[i] = new int[scan.nextInt()];
        }

        System.out.println("Enter the elements to column array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter of row " + i + " & columns " + j + ": ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            double avg = sum / arr[i].length;
            System.out.println("Average of row " + (i + 1) + ": " + avg);
        }
        }
    }

