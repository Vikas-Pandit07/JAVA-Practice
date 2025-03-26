package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatternValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a regex pattern:");

        String pattern = scanner.nextLine();

        try {
            Pattern.compile(pattern);
            System.out.println("The pattern '" + pattern + "' is valid.");
        } catch (PatternSyntaxException e) {
            System.out.println("The pattern '" + pattern + "' is invalid.");
        }

        scanner.close();
    }
}

