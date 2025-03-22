package com.kodnest.DSA.Strings.MutableStrings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scan.nextLine();
        System.out.println("Befor Reversing");
        System.out.println(s);

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("After Reversing");
        System.out.println(sb);
    }
}
