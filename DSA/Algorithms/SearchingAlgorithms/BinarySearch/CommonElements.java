package com.kodnest.DSA.Algorithms.SearchingAlgorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of first array:");
        String[] input = scan.nextLine().split("\\s+");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Enter elements of second array:");
        String[] input1 = scan.nextLine().split("\\s+");
        int[] arr1 = new int[input1.length];

        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        // Sort both arrays for efficient comparison
        Arrays.sort(arr);
        Arrays.sort(arr1);

        System.out.println("Common elements in both arrays:");
        findCommonElements(arr, arr1);

        scan.close();
    }
    public static void findCommonElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}



