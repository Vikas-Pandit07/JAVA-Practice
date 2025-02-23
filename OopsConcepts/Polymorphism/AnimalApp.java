package com.kodnest.oops.Polymorphism;

public class AnimalApp {
    public static void main(String[] args) {
        //method 1
    //    Deer d = new Deer();
    //    Tiger t = new Tiger();
    //    Monkey m = new Monkey();

    //    Forest forest = new Forest();
    //    forest.acceptAnimal(d);
    //    forest.acceptAnimal(t);
    //    forest.acceptAnimal(m);

    //Method 2
    //Code Compactness....
        // Forest forest = new Forest();
        // forest.acceptAnimal(new Deer());
        // forest.acceptAnimal(new Tiger());
        // forest.acceptAnimal(new Monkey());

    //make acceptAnimal class as a Static 
            Forest.acceptAnimal(new Deer());
            Forest.acceptAnimal(new Tiger());
            Forest.acceptAnimal(new Monkey());
    }
}
