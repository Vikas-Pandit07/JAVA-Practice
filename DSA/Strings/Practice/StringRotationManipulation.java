package com.kodnest.DSA.Strings.Practice;

import java.util.Scanner;

public class StringRotationManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        System.out.println("Enter a postion");
        int pos = scan.nextInt();

        System.out.println("Enter a direction left/right");
        String direction = scan.next();

        int len = str.length();
        pos = pos % len;

        String rotated = "";

        if (direction.equals("left")) {
            rotated = str.substring(pos) + str.substring(0, pos);
        } else if (direction.equals("right")) {
            rotated = str.substring(len - pos) + str.substring(0, len - pos);
        }
        else {
            System.out.println("Invalid direction use 'left' or 'right'");
        }

        System.out.println("Rotated String: " + rotated);

    }
}
