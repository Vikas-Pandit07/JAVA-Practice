package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class ReverseWithoutInbuilt1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

       String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
}
