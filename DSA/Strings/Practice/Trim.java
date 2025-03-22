package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        System.out.println("The trimmed string " + str.trim());
    }
}
