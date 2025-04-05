package com.kodnest.DSA.Algorithms.SortingAlgorithms.SelectionSort;

import java.util.Scanner;

public class ThirdMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input
        System.out.println("Enter the array size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // Before sorting
        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sort in Descending Order
        selectionSortDescending(arr);

        // After sorting
        System.out.println("After descending sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Find the third distinct maximum
        int distinctCount = 0;
        int thirdMax = arr[0]; // Start with the maximum

        for (int i = 0; i < arr.length; i++) {
            // Count only distinct values
            if (i == 0 || arr[i] != arr[i - 1]) {
                distinctCount++;
            }
            if (distinctCount == 3) {
                thirdMax = arr[i];
                break;
            }
        }

        // If less than 3 distinct numbers, return max
        System.out.println("Third Maximum: " + thirdMax);
        scan.close();
    }

    // Corrected Selection Sort for Descending Order
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;  // Find the max element
                }
            }
            // Swap max element with current position
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
