package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = new String(scan.nextLine());
        int index = scan.nextInt();

        if (index >= 0 && index < s.length())
            System.out.println(s.charAt(index-1));
        else
            System.out.println("Invalid index.");
    }
}
