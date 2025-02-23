package com.kodnest.oops.Interface;

public class EpsunCalculator implements Calculator {

    @Override
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition Result is: " + c);
    }

    @Override
    public void sub() {
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println("Substraction Result is: " + c);
    }

    @Override
    public void mul() {
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("Mul Result is: " + c);
    }

    @Override
    public void div() {
        int a = 10;
        int b = 20;
        int c = a / b;
        System.out.println("Division Result is: " + c);
    }
}
