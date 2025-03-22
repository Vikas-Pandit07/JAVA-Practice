package com.kodnest.DSA.Strings.MutableStrings;

public class Capacity {
    public static void main(String[] args) {
        StringBuffer sbu = new StringBuffer();
        System.out.println(sbu.capacity());
        sbu.append("Omkar is a cricketer");
        System.out.println(sbu.capacity());
        sbu.append("He leaves in bangalore");
        System.out.println(sbu.capacity());// concatination
        System.out.println(sbu);
        System.out.println("=================================");

        StringBuilder sbui = new StringBuilder();
        System.out.println(sbui.capacity());
        sbui.append("Omkar is a cricketer");
        System.out.println(sbui.capacity());
        sbui.append("He leaves in bangalore");
        System.out.println(sbui.capacity());// concatination
        System.out.println(sbui);
        System.out.println("==================================");

        StringBuffer sb3 = new StringBuffer();
        sb3.ensureCapacity(100);
        System.out.println(sb3.capacity());

        System.out.println("===================================");


    }
}
