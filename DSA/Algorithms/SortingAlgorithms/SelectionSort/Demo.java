package com.kodnest.DSA.Algorithms.SortingAlgorithms.SelectionSort;

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

        selectionSort(arr);
        System.out.println("After sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int min;
        int pos;
        for (int i = 0; i <= arr.length - 2; i++) {
            min = arr[i];
            pos = i;
            for (int j = i + 1; j <= arr.length -1; j++) {
                if (arr[j] < min) {
                  min = arr[j];
                  pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }
}
