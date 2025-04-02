package com.kodnest.DSA.Algorithms.SearchingAlgorithms.LinearSearch.Ex1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");

        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key search:");
        int key = sc.nextInt();

        SearchingAlgo algo = new SearchingAlgo();

        int index = algo.linearSearch(arr, key);
        if (index > 0)
        System.out.println("Key is found....");
        else
        System.out.println("key is not found...");
    }
}
