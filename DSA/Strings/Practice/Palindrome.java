package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = new String(scan.nextLine());

        StringBuilder reversed = new StringBuilder(str);
//        StringBuffer reversed = new StringBuffer(str);
        String sb = reversed.reverse().toString();

        if (str.equals(sb)) {
            System.out.println("The string " + str + " is a palindrome.");
        }
        else {
            System.out.println("Not a palindrome.");
        }
    }
}
