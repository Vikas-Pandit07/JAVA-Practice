package com.kodnest.DSA.Algorithms.SearchingAlgorithms.LinearSearch;

import java.util.Scanner;

public class MaxScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size:");
        int[] arr = new int[scan.nextInt()];
        ///new process
        scan.nextLine();

        System.out.println("Enter the scores: ");
        String input = scan.nextLine();
        String[] inputeString = input.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputeString[i]);
        }
        // till here //
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }

        int max = maxScores(arr);
        System.out.println("The highest score is: "+ max);
    }
    public static int maxScores(int[] arr) {
        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= max) {
//                max = arr[i];
//            }
        for (int j : arr) {
            if (j >= max) {
                max = j;
            }
        }
        return max;
    }
}
