package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class CountVowels2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.nextLine();

       //count vowels
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1)
                count++;
        }

        System.out.println("Original String: " +str);
        System.out.println("Number of vowels: " + count);
    }
}
