package com.kodnest.DSA.Algorithms.SearchingAlgorithms.BinarySearch;

import java.util.Scanner;

public class MinValue1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the elements:");
        String[] input = scan.nextLine().split("\\s+");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Searching search = new Searching();  // Corrected class name
        int minValue = search.findMinValue(arr);

        System.out.println("Minimum value in the array is: " + minValue);
        scan.close();
    }
}

class Searching {
    public int findMinValue(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than high, min must be in the right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                // Min is in the left half (including mid)
                high = mid;
            }
        }
        return arr[low];  // `low` points to the minimum element
    }
}
