package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String mod = str.replaceAll("\\s+", "");

        System.out.println("orignal: " +str);
        System.out.println("Modified: " +mod);
    }
}
