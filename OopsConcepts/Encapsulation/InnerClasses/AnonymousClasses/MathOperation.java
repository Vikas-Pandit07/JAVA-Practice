package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.AnonymousClasses;

interface MathOp {
    int operate(int a, int b);
}

public class MathOperation {
    public static void main(String[] args) {
        MathOp addition = new MathOp() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result = addition.operate(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
