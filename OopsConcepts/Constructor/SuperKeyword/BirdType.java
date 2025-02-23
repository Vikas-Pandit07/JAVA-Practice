package OopsConcepts.Constructor.SuperKeyword;

public class BirdType extends Bird {
    String name = "Veg Sparrow";

    public void display() {
        System.out.println("Name from bird type " + name);

        // super for access parent class variable
        System.out.println("Name from parent bird class " + super.name);
    }

    @Override
    public void eat() {
        //super.eat(); ---access parent class statments
        super.eat();
        System.out.println("Insects");
    }
}

