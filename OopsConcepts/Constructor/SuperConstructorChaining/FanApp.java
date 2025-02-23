package OopsConcepts.Constructor.SuperConstructorChaining;

class Obj {
    public Obj() {
        //initialzation logic
    }
}

class Fan extends Obj {
    int no_of_blades;
    String brand;
    int cost;

    public Fan(int no_of_blades,
               String brand,
               int cost) {
        //super constructor chaining
        super();
        this.no_of_blades = no_of_blades;
        this.brand = brand;
        this.cost = cost;
    }
}

public class FanApp extends Obj {
    public static void main(String[] args) {
        Fan fan = new Fan(5, "Crompton", 5000);
        System.out.println(fan.no_of_blades+" "+fan.brand+" "+ fan.cost);
    }
    //Default constructor
}

