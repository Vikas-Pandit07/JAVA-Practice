package OopsConcepts.Abstraction.PlaneEx;

public class CargoPlane extends Plane {
    void takeOff() {
        System.out.println("CP is taking off an huge runway...");
    }

    void fly() {
        System.out.println("Cp is flying very slow...");
    }

    void land() {
        System.out.println("CP is landing on huge runway...");
    }
}