package com.kodnest.DSA.Strings.ImmutableStrings;

public class InbuiltMethods {
    public static void main(String[] args) {
        String str = "Raja Ram Mohan Roy";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(5));
        System.out.println(str.startsWith("M"));
        System.out.println(str.endsWith("m"));
        System.out.println(str.contains("j"));
        System.out.println(str.indexOf("R"));
        System.out.println(str.isEmpty());
        String str2 = new String();
        System.out.println(str2.concat(str2));
        System.out.println(str2.isEmpty());
        System.out.println(str.replace("R", "A"));
        System.out.println(str.length());
        System.out.println(str.replaceAll("Raja", "Baja"));
        System.out.println(str.substring(14));
        System.out.println(str.substring(3, 8));
        System.out.println(str.trim());

    }
}
