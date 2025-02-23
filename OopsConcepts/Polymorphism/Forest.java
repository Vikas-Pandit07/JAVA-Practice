package com.kodnest.oops.Polymorphism;

public class Forest {
    //Flexible method....
    //make static method
    //public void acceptAnimal(Animal ref) {
    //make static method so one line as a forest object from 
    //AnimalApp will remove 
    public static void acceptAnimal(Animal ref) {
        //Polymorphic code....
        ref.eat();
        ref.sleep();
    }
}
