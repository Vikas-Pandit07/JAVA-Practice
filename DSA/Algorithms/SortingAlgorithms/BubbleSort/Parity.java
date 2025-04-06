package com.kodnest.DSA.Algorithms.SortingAlgorithms.BubbleSort;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array: ");
        int arr[] = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        bubbleSort(arr);
        System.out.println("sorted by parity");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= (arr.length - 2 - i); j++) {
                if (arr[j] % 2 == 1 && arr[j + 1] % 2 == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
