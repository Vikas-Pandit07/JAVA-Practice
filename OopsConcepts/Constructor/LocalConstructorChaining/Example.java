package OopsConcepts.Constructor.LocalConstructorChaining;

class Objt {
    public Objt() {
        //initialzation logic
    }
}

class Fans extends Objt {
    int no_of_blades;
    String brand;
    int cost;

    public Fans() {
        super();
    }

    public Fans(int no_of_blades, String brand, int cost) {
        //LocalConstructorChaining
        this(); //super() constructor not added
        this.no_of_blades = no_of_blades;
        this.brand = brand;
        this.cost = cost;
    }

    public Fans(String brand) {
        super();
        this.brand = brand;
    }
}

public class Example extends Objt {
    public static void main(String[] args) {
        Fans fan = new Fans(5, "Crompton", 5000);
        System.out.println(fan.no_of_blades+" "+fan.brand+" "+ fan.cost);
    }
    //Default constructor
}
