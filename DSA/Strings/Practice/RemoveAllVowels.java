package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str =scan.nextLine();

        String result = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("String after removing vowels: " + result);
    }
}
