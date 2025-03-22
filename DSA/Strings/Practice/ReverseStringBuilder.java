package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = new String(scan.nextLine());

       StringBuilder build = new StringBuilder(str1);
            System.out.println(build.reverse());

    }
}
