package com.kodnest.DSA.Strings.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        int arr[] = {34, 38, 59, 12, 40, 89, 44};
     for (int n : arr) {
         System.out.print(n + " ");
     }
        System.out.println();
        Arrays.sort(arr);
     for (int i : arr) {
         System.out.print(i+" ");
     }
    }

}
