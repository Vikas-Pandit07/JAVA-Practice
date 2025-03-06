package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

class ArrayManipulation {
    public int[] reveredArray(int[] arr) {
        int arr1[] = new int[arr.length];
        int j = arr1.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arr1[j] = arr[i];
            j--;
        }
        return arr1;
    }
}

public class ReveseArrayEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an no of array: ");
        int arr[] = new int[scan.nextInt()];

        System.out.println("Enter an " + arr.length + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before Reversing ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Reversing ");
        ArrayManipulation arrayManipulation = new ArrayManipulation();
        int[] arr1 = arrayManipulation.reveredArray(arr);

        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }
}


