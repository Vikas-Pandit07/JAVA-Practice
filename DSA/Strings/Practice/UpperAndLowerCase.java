package com.kodnest.DSA.Strings.Practice;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = new String(scan.nextLine());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
