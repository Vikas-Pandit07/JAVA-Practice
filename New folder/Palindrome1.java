package com.kodnest.Practice;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String(scan.nextLine());

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("the string " + str + " is a palindrome.");
        }
        else
            System.out.println("not a palindrome.");
    }
}
