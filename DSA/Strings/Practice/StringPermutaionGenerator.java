package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class StringPermutaionGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        permute(str, "");
    }
    public static void permute(String str, String result) {
        if (str.isEmpty()) { // if(str.length() ==0)
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result+ch);
        }
    }
}
