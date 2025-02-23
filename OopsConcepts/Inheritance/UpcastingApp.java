package com.kodnest.oops.Inheritance;

public class UpcastingApp {
    public static void main(String[] args) {

        Upcasting ref;
        Upcasting1 upcasting1 = new Upcasting1();
        // UP-CASTING
        ref = upcasting1;
        ref.greet();
        ref.display();
        //parent type ref cannot access the specialized property of child
        //ref.sendMessage();

        //DOWN-CASTING
        ((Upcasting1)ref).sendMessage();
        System.out.println("=================");

        Upcasting ref2 = new Upcasting2();
        ref2.greet();
        ref.display();
        ((Upcasting2)ref2).sendLetter(); 
    }
}
