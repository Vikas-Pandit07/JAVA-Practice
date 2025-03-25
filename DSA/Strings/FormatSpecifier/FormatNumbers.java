package com.kodnest.DSA.Strings.FormatSpecifier;

public class FormatNumbers {
    public static void main(String[] args) {
        // common format specifiers
        // %d : format integer
        // %s : string
        // %f fomat float
        // %,d: integers with commas for thousands
        //%n : newline

        int number = 123456789;
        double pi =3.1415243533534;

        System.out.println(String.format("Integer with commas %,d", number));
       //Integer with commas 123,456,789
        //Formatted pi: 3.14
        System.out.println(String.format("Formatted pi: %.2f", pi));
    }
}
