package com.kodnest.DSA.Strings.MutableStrings;

public class ReverseAndDelete {
    public static void main(String[] args) {
        StringBuffer sb4 = new StringBuffer("kodnest");
        sb4.delete(2,6);
        System.out.println(sb4);

        System.out.println("===================================");
        StringBuffer sb5 = new StringBuffer("kodnest");
        sb5.reverse();
        System.out.println(sb5);
    }
}
