package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;
public class CapatalizeFirstLetterOfEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str =scan.nextLine();
        String words[] = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char first = Character.toUpperCase(word.charAt(0));
                String rem = word.substring(1).toLowerCase();
                result.append(first).append(rem).append(" ");
            }
        }

            System.out.println(result.toString());
    }
}
