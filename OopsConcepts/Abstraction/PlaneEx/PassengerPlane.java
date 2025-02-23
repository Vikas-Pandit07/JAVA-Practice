package OopsConcepts.Abstraction.PlaneEx;

public class PassengerPlane extends Plane {
    void takeOff() {
        System.out.println("PP is taking off an medium sized runway...");
    }

    void fly() {
        System.out.println("PP is flying medium speed...");
    }

    void land() {
        System.out.println("PP is landing on medium sized runway...");
    }
}
