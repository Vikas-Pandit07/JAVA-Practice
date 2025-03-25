package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class CharFrequencyString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();

        System.out.println("Character Frequencies: ");
        while(str.length() > 0) {
            char ch = str.charAt(0);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println(ch + ": " + count);

            // ✅ Build new string without current character
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ch) {
                    temp.append(str.charAt(i));
                }
            }
            str = temp.toString();
        }

        scan.close();
    }
}

