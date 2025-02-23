package com.kodnest.oops.Interface;

import java.util.Scanner;

public class CitizenCalcuator implements Calculator {
    Scanner scan = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter 2 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("for this do you need calculator.");
        }
        else {
            int c = a + b;
            System.out.println("Addition Result is: " + c);
        }
    }

    @Override
    public void sub() {
        System.out.println("Enter 2 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("for this do you need calculator.");
        }
        else {
            int c = a - b;
            System.out.println("Substraction Result is: " + c);
        }
    }

    @Override
    public void mul() {
        System.out.println("Enter 2 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("for this do you need calculator.");
        }
        else {
            int c = a * b;
            System.out.println("Mul Result is: " + c);
        }
    }

    @Override
    public void div() {
        System.out.println("Enter 2 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("for this do you need calculator? go meet math");
        }
        else {
        int c = a / b;
        System.out.println("Division Result is: " + c);
        }
    }
}
