package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class PalindromeSwapping {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            generateSwaps(str, "");
        }

        static void generateSwaps(String str, String result) {
            if (str.isEmpty()) {
                if (isPalindrome(result)) {
                    System.out.println(result);
                }
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generateSwaps(remaining, result + ch);
            }
        }

        static boolean isPalindrome(String s) {
            return s.equals(new StringBuilder(s).reverse().toString());
        }
    }
