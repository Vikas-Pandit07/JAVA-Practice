package com.kodnest.DSA.Strings.FormatSpecifier;

import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();

        String formatingString = String.format("Hello, my name is %s, and i am %d years old", name, age);
        System.out.println(formatingString);

        // directly format by printf()
        System.out.printf("Hello, my name is %s, and i am %d years old", name, age);
    }
}
