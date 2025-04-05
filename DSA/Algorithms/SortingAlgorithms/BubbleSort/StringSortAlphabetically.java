package com.kodnest.DSA.Algorithms.SortingAlgorithms.BubbleSort;

import java.util.Scanner;

public class StringSortAlphabetically {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        str = str.toLowerCase();

        char arr[] = str.toCharArray();
        bubbleSort1(arr);

        System.out.print(new String(arr));
    }
    static void bubbleSort1(char[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
