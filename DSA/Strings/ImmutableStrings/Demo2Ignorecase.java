package com.kodnest.DSA.Strings.ImmutableStrings;

public class Demo2Ignorecase {
    public static void main(String[] args) {
        String s = "Kodnest";
        String s1 = new String("Kodnest");
        String s2 = new String("KODNEST");

        if (s == s1)
            System.out.println("Referances are equal");
        else
            System.out.println("Referances are uneual");
        if (s.equals(s1))
            System.out.println("String are equal");
        else
            System.out.println("String are unequal");

        if (s1 == s2)
            System.out.println("Referances are equal");
        else
            System.out.println("Referances are uneual");
        if (s1.equals(s2))
            System.out.println("String are equal");
        else
            System.out.println("String are unequal");


        if (s1.equalsIgnoreCase(s2))
            System.out.println("String are equal");
        else
            System.out.println("String are unequal");

    }
}
