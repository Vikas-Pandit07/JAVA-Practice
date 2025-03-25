package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Strings");
        String str = scan.nextLine();
        String str1 = scan.nextLine();

        boolean rotate = isRotated(str,str1);

        if (rotate)
        System.out.println("The string '" + str1+"; is a rotation of '" +str);
        else
        System.out.println("not");
    }

    public static boolean isRotated(String str, String str1) {
        if (str.length() != str1.length())
            return false;

        String con = str.concat(str);

        return boolean isRotate = con.contains(str1);
    }
}
