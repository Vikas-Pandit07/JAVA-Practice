package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class ToggleEachWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder toggled = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    toggled.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    toggled.append(Character.toUpperCase(ch));
                } else {
                    toggled.append(ch);
                }
            }
            result.append(toggled.toString()).append(" ");
        }

        System.out.println("Toggled String: " + result.toString().trim());
        scan.close();
    }
}

