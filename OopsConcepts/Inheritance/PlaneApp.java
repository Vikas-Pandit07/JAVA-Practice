package com.kodnest.oops.Inheritance;

public class PlaneApp {
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
        cargoPlane.takeOff();
        cargoPlane.fly();
        cargoPlane.carryCargo();

        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.takeOff();
        passengerPlane.fly();
        passengerPlane.carryPassenger();
    }
}
