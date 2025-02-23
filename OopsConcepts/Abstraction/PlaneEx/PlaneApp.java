package OopsConcepts.Abstraction.PlaneEx;

public class PlaneApp {
    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.acceptPlane(new CargoPlane());
        airport.acceptPlane(new PassengerPlane());
        airport.acceptPlane(new FighterPlane());

        //check and cast to access the subclass specific method
        ((Airport) airport).CastMethod();
    }
}
