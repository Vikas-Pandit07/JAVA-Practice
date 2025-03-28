package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class TripleStringTansformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Strings");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();

        str1 = str1.replaceAll("(?i)[aeiou]", "%");

        // Step 2: Replace consonants in str2 with #
        str2 = str2.replaceAll("(?i)[b-df-hj-np-tv-z]", "#");

        str3 = str3.toUpperCase(); // Convert to uppercase

        System.out.println(str1+str2+str3);
    }
}
