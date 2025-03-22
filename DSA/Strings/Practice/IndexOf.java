package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = new String(scan.nextLine());
        String s1 = new String(scan.next());

        if (s.indexOf(s1) >= 0)
        System.out.println(s.indexOf(s1));
        else
            System.out.println("Char not found");
    }
}
