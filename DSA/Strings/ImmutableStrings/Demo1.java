package com.kodnest.DSA.Strings.ImmutableStrings;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = new String("kodnest");
        String s2 = new String("kodnest");

    if (s1 == s2)
        System.out.println("Referances are equal");
    else
        System.out.println("Referances are uneual");

        if (s1.equals(s2))
            System.out.println("String are equal");
        else
            System.out.println("String are uneual");
}
}
