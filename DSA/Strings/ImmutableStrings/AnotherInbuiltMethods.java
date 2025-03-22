package com.kodnest.DSA.Strings.ImmutableStrings;

import java.util.Scanner;

public class AnotherInbuiltMethods {
    public static void main(String[] args) {
        String s = new String("kodnest");
        String str = s.intern();
        String str1 = "kodnest";

        if (str == str1)
            System.out.println("str and str2 references are equal...");
        else
            System.out.println("str and str2 references are unequal...");
        System.out.println("==================================================================");
        String s1 = "Sachin";
        String s2 = "Sourav";

        if (s1.compareTo(s2) > 0)
            System.out.println("String 1 "+s1+" is greater");
        else if (s1.compareTo(s2) < 0) {
            System.out.println("String 2 "+s2+" is greater");
        }
        else
            System.out.println(s1 + " "+ s2 + " both are equal");
        System.out.println("========================================================");

        String name= "Omkar";
        char arr[] = name.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        for (char c : arr) {
            System.out.print(c+ " ");
        }

        System.out.println("=====================================");

        String org = "Kodnest Technologies pvt ltd";
        String strr[] = org.split(" ");
        for (String n : strr) {
            System.out.println(n);
        }

        System.out.println("=====================================");

        Scanner scan = new Scanner(System.in);
        String ss = scan.nextLine();

        String joined = String.join(ss, strr);
            System.out.println(joined);
        }
    }

