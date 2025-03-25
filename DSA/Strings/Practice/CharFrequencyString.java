package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class CharFrequencyString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();

        // if we want remove all spaces
//        str = str.replaceAll(" ", "");

        System.out.println("Character Frequencies: ");
        while(str.length() > 0) {
            char ch = str.charAt(0);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println(ch +": " +count);
            str = str.replaceAll(str.valueOf(ch), "");
        }

    }
}



