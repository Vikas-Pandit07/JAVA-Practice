package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.AnonymousClasses;

abstract class Animal {
    abstract void makeSound();
}
class Zoo {
    void exhibitAnimal() {
        Animal animal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Roar! I'm mystery animal!..");
            }
        };
        animal.makeSound();
    }
}