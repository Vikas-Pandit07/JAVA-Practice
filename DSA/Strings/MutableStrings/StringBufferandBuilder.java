package com.kodnest.DSA.Strings.MutableStrings;

public class StringBufferandBuilder {
    public static void main(String[] args) {
        StringBuffer sbu = new StringBuffer("Kodnest");
        System.out.println(sbu);
        sbu.append("Technologies"); // concatination
        System.out.println(sbu);

        StringBuilder sbui = new StringBuilder("Omkar");
        System.out.println(sbui);
        sbui.append("Bhardwaj"); // concatination
        System.out.println(sbui);
    }
}
