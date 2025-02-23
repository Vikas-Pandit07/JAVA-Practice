package OopsConcepts.Abstraction.PlaneEx;

public class FighterPlane extends Plane{
    void takeOff() {
        System.out.println("FP is taking off an small runway...");
    }

    void fly() {
        System.out.println("FP is flying very fast...");
    }

    void land() {
        System.out.println("FP is landing on small runway...");
    }
}