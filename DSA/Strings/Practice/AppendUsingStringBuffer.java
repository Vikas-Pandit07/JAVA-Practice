package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class AppendUsingStringBuffer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = new String(scan.nextLine());
        String str1 = new String(scan.nextLine());
        String str2 = new String(scan.nextLine());

        StringBuffer sbu = new StringBuffer();
        sbu.append(str).append(str1).append(str2);
        System.out.println("The concatenated string is '" + sbu + "'.");
    }
}
