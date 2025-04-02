package com.kodnest.DSA.Algorithms.SearchingAlgorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the elements:");
        String[] input = scan.nextLine().split("\\s+");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Array contents after sorting:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        SearchingAp search = new SearchingAp();  // Correct class name
        int minValue = search.findMinValue(arr);

        System.out.println("Minimum value in the array is: " + minValue);
    }
}

class SearchingAp {
    public int findMinValue(int[] arr) {
        int min = arr[0]; // Assume first element is the smallest

        for (int j : arr) {
            if (j < min) {
                min = j; // Update min if a smaller value is found
            }
        }
        return min;
    }
}
