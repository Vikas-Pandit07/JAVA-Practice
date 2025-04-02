package com.kodnest.DSA.Algorithms.SearchingAlgorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the elements");
        String[] input = scan.nextLine().split("\\s+");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] =Integer.parseInt(input[i]);
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
            System.out.println(key + " is found at " + index);
        } else {
            System.out.println(key + "is not found....");
        }
    }
}
class SearchingApps {
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

