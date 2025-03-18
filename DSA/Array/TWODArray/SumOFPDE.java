package com.kodnest.DSA.Arrays.TWODArray;
import java.util.Scanner;

// principle diagonal elements
public class SumOFPDE {

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
        SumOFPDE sumOFPDE = new SumOFPDE();
       int sum =  sumOFPDE.pde(arr);
        System.out.println(sum);
    }

    public static int pde(int[][] arr) {
        int sum = 0;
        System.out.println("Sum Of pde elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j)
                    sum += arr[i][j];
            }
        }
        return sum;
    }
}

