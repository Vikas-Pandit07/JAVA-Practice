package OopsConcepts.Constructor.ChainingUsingSuper;

class Vehicle {
    int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Vehicle with " + wheels + " wheels create.");
    }
}

class Car extends Vehicle {
    String model;

    public Car(String model) {
        // Explicit call to the superclass Constructor.
        // created super by programmer means explicitly insert
        super(4);
        this.model = model;
        System.out.println("Car model " + model + " created.");
    }
}

public class Example {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S");
    }
}

