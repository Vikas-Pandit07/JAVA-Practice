package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class CountACharOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = new String(scan.nextLine());

        System.out.println("Enter a char: ");
        char ch = scan.next().charAt(0);

        System.out.println("Original String: " + str);
        System.out.println("Character: " + ch);

        int count = 0;

        for (char x : str.toCharArray()) {
            if (ch == x)
                count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
