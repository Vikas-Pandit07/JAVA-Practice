package com.kodnest.DSA.Strings.ImmutableStrings;

public class DEmo3 {
    public static void main(String[] args) {
        String s1 = "Rama";
        String s2 = "Sita";
        String s3 = s1 + s2;
        String s4 = s1 + s2;

        String s5 = "Rama" + "Sita";
        String s6 = "Rama" + "Sita";

        if (s3 == s4)
            System.out.println("Referances are equal");
        else
            System.out.println("Referances are uneual");

        if (s3.equals(s4))
            System.out.println("String are equal");
        else
            System.out.println("String are unequal");

        if (s5 == s6)
            System.out.println("Referances are equal");
        else
            System.out.println("Referances are uneual");

        if (s5.equals(s6))
            System.out.println("String are equal");
        else
            System.out.println("String are unequal");
    }
}
