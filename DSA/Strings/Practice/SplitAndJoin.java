package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class SplitAndJoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        System.out.println("Enter delimiter");
        String dm = scan.nextLine();

        System.out.println("Split words:");
        String st[] = str.split(" ");
        for (String x:st) {
            System.out.println(x);
        }

        System.out.print("Joined sentence: ");
        String joined = String.join(dm, st);
        System.out.println(joined);
    }
}
