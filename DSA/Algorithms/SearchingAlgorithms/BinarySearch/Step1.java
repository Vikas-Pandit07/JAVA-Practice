package com.kodnest.DSA.Algorithms.SearchingAlgorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size");
        int[] arr = new int[scan.nextInt()];

        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the key which find");
        int key = scan.nextInt();

        // sort the array
        Arrays.sort(arr);
        System.out.println("Array contents after sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        SearchingApp search = new SearchingApp();
        int index = search.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Key found at " + index);
        } else {
            System.out.println("key not found....");
        }
    }
}
    class SearchingApp {
    public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // find mid
            if (key == arr[mid]) {
                return mid;
            }
            //find greater than mid
            else if (key > arr[mid]) {
                low = mid + 1;
            }
            // find less than mid
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

