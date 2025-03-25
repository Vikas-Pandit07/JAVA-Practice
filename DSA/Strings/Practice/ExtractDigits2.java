package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class ExtractDigits2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = new String(scan.nextLine());

        StringBuilder digit = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                digit.append(ch);
        }
        System.out.println(digit);
    }
}
