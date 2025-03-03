package com.kodnest.OopsConcepts.LambdaExpressions;

interface StringTransform {
    public String transform(String name);
}
public class Ex2 {
    public static void main(String[] args) {
 //  Traditional way
        StringTransform st = new StringTransform() {
            @Override
            public String transform(String s) {
                return s.toUpperCase();
            }
        };

        // Lambda Way
        StringTransform trans = (s) -> s.toUpperCase();


        String name = "Lakshya";
        System.out.println("Taditional way: " + st.transform(name));
        System.out.println("Lambda way: " + trans.transform(name));
    }
}
