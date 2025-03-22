package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = new String(scan.nextLine());
        String str2 = new String(scan.nextLine());
        if (str1.contains(str2))
        System.out.println(str2 + "found");
        else
            System.out.println(str2 + " not found");
    }
}
