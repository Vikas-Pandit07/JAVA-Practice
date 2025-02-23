package OopsConcepts.Constructor.FanEx;

class Objects {
    public Objects() {
        //initialzation logic
    }
}

class Fann extends Objects {
    int no_of_blades;
    String brand;
    int cost;

    public Fann() {
        this("V-Guard");
    }

    public Fann(String brand) {
        this("Kodnest", 60000);
        this.brand = brand;
    }

    public Fann(String brand, int cost) {
        this(6, "Volvo");
        this.brand = "Usha";
        this.cost = 4000;
    }

    public Fann(int no_of_blades, String brand) {
        this(50000, 10);
        this.no_of_blades = no_of_blades;
        this.brand = brand;
    }

    public Fann(int no_of_blades, int cost) {
        this(5, "Croptom", 8000);
        this.no_of_blades = no_of_blades;
        this.cost = 9000;
        this.brand = "Bajaj";
    }

    public Fann(int no_of_blades, String brand, int cost) {
        super(); // if we not define then also by default it was defined.
        this.no_of_blades = no_of_blades;
        this.brand = brand;
        this.cost = cost;
    }
}

public class FanApp extends Objects {
    public static void main(String[] args) {

        Fann fan = new Fann();
        System.out.println(fan.no_of_blades+" "+fan.brand+" "+ fan.cost);
    }
    //Default constructor
}

