package com.kodnest.oops.Overloading;

public class DemoApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        float x = 40.0f;
        float y = 50.0f;
        double z = 45.768;
        double o = 3.14789;

        Demo d = new Demo();

        d.add(a, b);
        d.add(a, x);
        d.add(y, b);
        d.add(b);
    }
}
