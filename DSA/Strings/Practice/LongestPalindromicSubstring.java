package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.nextLine();
        scan.close();

        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            // Odd length
            String oddPal = expandFromCenter(str, i, i);
            if (oddPal.length() > longest.length()) {
                longest = oddPal;
            }

            // Even length
            String evenPal = expandFromCenter(str, i, i + 1);
            if (evenPal.length() > longest.length()) {
                longest = evenPal;
            }
        }

        System.out.println("Longest Palindromic Substring: " + longest);
    }

    public static String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
