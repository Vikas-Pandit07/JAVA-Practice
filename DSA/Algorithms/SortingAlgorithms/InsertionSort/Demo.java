package com.kodnest.DSA.Algorithms.SortingAlgorithms.InsertionSort;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array: ");
        String input[] = scan.nextLine().split("\\s+");
        int arr[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        insertionSort(arr);
        System.out.println("After sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int item = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }
    }
}
