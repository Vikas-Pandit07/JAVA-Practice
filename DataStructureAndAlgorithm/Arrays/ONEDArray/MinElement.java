package com.kodnest.DataStructureAndAlgorithm.Arrays.ONEDArray;

import java.util.Scanner;

public class MinElement {

    public int minNumber(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an array size: ");
        int arr[] = new int[scan.nextInt()];

        System.out.println("Enter an array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        MinElement findMin = new MinElement();
        System.out.print("Min Array is: " + findMin.minNumber(arr));
    }
}

