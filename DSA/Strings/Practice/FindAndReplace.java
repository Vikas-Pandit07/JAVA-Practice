package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        String find = scan.nextLine();
        String rep = scan.nextLine();

        int index = str.indexOf(find);

        if (index != -1)
            System.out.println("The word " +find+ " found at index: " + index);
        else
            System.out.println("Not found the word: " +find);

        String replaceChar = str.replace(find, rep);
        System.out.println("updated sentence: " + replaceChar);
    }
}
