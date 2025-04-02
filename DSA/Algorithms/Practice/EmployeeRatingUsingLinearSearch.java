package com.kodnest.DSA.Algorithms.Practice;

import java.util.Scanner;

public class EmployeeRatingUsingLinearSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");

        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int current = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 6) {
                current++;
            }
            else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        max = Math.max(max, current);
            System.out.println(max);


    }
}