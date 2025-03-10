package com.kodnest.DataStructureAndAlgorithm.Arrays.ONEDArray;

import java.util.Scanner;

public class AvgArray {
    public int findAvg(int arr[]) {
        // Find avg
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int arr[] = new int[scanner.nextInt()];

        System.out.println("Enter " + arr.length + " Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        AvgArray avgArray = new AvgArray();
        double avg = avgArray.findAvg(arr);
        System.out.println("Average: " + avg);
    }
}
