package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class FindMax {

public int maxNumber(int arr[]) {
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an array size: ");
        int arr[] = new int[scan.nextInt()];

        System.out.println("Enter an array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        FindMax findMax = new FindMax();
        System.out.print("Max Array Is: " + findMax.maxNumber(arr));
    }
}
