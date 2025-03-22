package com.kodnest.Practice;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String(scan.nextLine());

        if (isPalindrome(str)) {
            System.out.println("the string " + str + " is a palindrome.");
        }
        else
            System.out.println("not a palindrome.");
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
