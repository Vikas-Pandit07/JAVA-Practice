package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        int ascii = (int) ch;
        System.out.println(ascii);
    }

}
