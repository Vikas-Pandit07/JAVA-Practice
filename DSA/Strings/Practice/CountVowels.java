package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.nextLine();

        //count vowels
        int count = 0;
        for (char ch : str.toCharArray()) {
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                count++;
        }

        System.out.println("Original String: " +str);
        System.out.println("Number of vowels: " + count);
    }
}
