package com.kodnest.DSA.Algorithms.SearchingAlgorithms.LinearSearch.Ex1;

public class SearchingAlgo {
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("key foind at " + i);
                return i;
            }
        }
            return -1;
    }
}
