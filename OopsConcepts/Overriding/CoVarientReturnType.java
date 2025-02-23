package com.kodnest.oops.Overriding;

class Vehicle {
    Vehicle start() {
        System.out.println("Vehicle is starting");
        return this;
    }
}
class Car extends Vehicle {
    Car start() {
        System.out.println("Car is starting");
        return this;
    }
}
class Bike extends Vehicle {
    Bike start() {
        System.out.println("Bike is starting");
        return this;
    }
}

public class CoVarientReturnType {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle1 = car.start();
        System.out.println("Returned object is type of: " + vehicle1.getClass().getSimpleName());

        Bike bike = new Bike();
        Vehicle vehicle2 = bike.start();
        System.out.println("Returned object is type of: " + vehicle2.getClass().getSimpleName());
    }
}
