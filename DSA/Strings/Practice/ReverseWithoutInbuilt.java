package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class ReverseWithoutInbuilt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scan.nextLine();

        System.out.println("Before Reversing");
        System.out.println(s);

        char arr[] = s.toCharArray();
        char arr2[] = new char[s.length()];
        int j = arr2.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arr2[j] = arr[i];
            j--;
        }

        String st = new String(arr2);
        System.out.println("After Reversing");
        System.out.println(arr2);
    }
}

