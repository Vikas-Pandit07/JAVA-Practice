package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = new String(scan.nextLine());
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start >= 0 && end <= s.length() && start < end )
            System.out.println(s.substring(start,end));
        else
            System.out.println("Invalid indices.");
    }
}
