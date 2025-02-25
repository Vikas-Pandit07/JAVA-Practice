package OopsConcepts.Encapsulation.InnerClasses.MemberInnerClass;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        Car.Engine myEngine = myCar.new Engine(300);

        myEngine.start();
    }
}
