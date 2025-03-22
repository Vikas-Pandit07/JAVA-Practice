package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = new String(scan.nextLine());
        String s1 = new String(scan.nextLine());
        System.out.println(s.concat(s1));
    }
}
