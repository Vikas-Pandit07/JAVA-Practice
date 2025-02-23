package OopsConcepts.Abstraction.PlaneEx;

public class Airport {
    public void acceptPlane(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }

    public void CastMethod() {
        System.out.println("hii hello");
    }

}
