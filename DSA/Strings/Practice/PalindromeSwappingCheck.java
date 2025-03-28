package com.kodnest.DSA.Strings.Practice;
import java.util.Scanner;
public class PalindromeSwappingCheck {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = scanner.nextLine().toLowerCase();

            if (canFormPalindrome(str)) {
                System.out.println("The string '" + str + "' can be rearranged to form a palindrome.");
            } else {
                System.out.println("The string '" + str + "' cannot be rearranged to form a palindrome.");
            }
        }

        static boolean canFormPalindrome(String str) {
            int[] charCount = new int[128];
            for (char c : str.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                   charCount[c]++;
                }
            }

            int oddCount = 0;
            for (int count : charCount) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            }

            return oddCount <= 1;
        }
    }
