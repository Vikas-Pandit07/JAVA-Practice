package com.kodnest.oops.Inheritance;

public class BirdApp {
    public static void main(String[] args) {
        Egle egle = new Egle();
        egle.fly();
        egle.eat();
        egle.sleep();
        System.out.println("====================");

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.eat();
        sparrow.sleep();
        System.out.println("===================");
    
        GoldenEgle goldenEgle = new GoldenEgle();
        goldenEgle.fly();
        goldenEgle.eat();
        goldenEgle.sleep();
        System.out.println("====================");

        SerpantEgle serpantEgle = new SerpantEgle();
        serpantEgle.fly();
        serpantEgle.eat();
        serpantEgle.sleep();
        System.out.println("====================");

        MountainEgl mopMountainEgl = new MountainEgl();
        mopMountainEgl.fly();
        mopMountainEgl.eat();
        mopMountainEgl.sleep();
        System.out.println("====================");

        VegSparrow vegSparrow = new VegSparrow();
        vegSparrow.fly();
        vegSparrow.eat();
        vegSparrow.sleep();
        System.out.println("====================");

        NonvegSparrow nonvegSparrow = new NonvegSparrow();
        nonvegSparrow.fly();
        nonvegSparrow.eat();
        nonvegSparrow.sleep();
        System.out.println("====================");


    }
}
