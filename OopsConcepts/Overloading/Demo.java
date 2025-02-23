package com.kodnest.oops.Overloading;

public class Demo {
    void add() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    void add(int a) {
        a = 30;
        System.out.println(a);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    float add(int b, float c) {
        return b + c;
    }

    float add(float b, float c) {
        return b + c;
    }

    float add(float b, float c, float d) {
        return b + c + d;
    }

    float add(int a, float b, float c) {
        return a + b + c;
    }

    double add(double x, double y) {
        return x + y;
    }

    double add(int a, float y, double x) {
        return x + y + a;
    }

    double add(int x, int y, float a, float b) {
        return x + y + a + b;
    }
}