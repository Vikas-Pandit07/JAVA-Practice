package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class LongSubstringWithoutRepeatChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Strings");
        String str = scan.nextLine();
        int max = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String current = "";
            for (int j = i; j < str.length(); j++){
                char ch = str.charAt(j);
                if (current.contains(String.valueOf(ch)))
                    break;
                else
                    current += ch;
            }
            if (current.length() > max) {
                max = current.length();
                longest = current;
            }
        }

        System.out.println("the length: " +max);

    }
}
