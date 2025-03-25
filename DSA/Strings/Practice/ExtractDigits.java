package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = new String(scan.nextLine());

        String digit = str.replaceAll("[^0-9@]", "");
        System.out.println(digit);
    }
}
