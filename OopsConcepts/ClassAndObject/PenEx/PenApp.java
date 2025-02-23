package OopsConcepts.ClassAndObject.PenEx;

public class PenApp {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "Red";
        pen1.brand = "cello";
        pen1.cost = 10;

        pen1.write();

        System.out.println(pen1.brand+" "+pen1.color+" "+pen1.cost);

        System.out.println("=============================");

        Pen pen2 = new Pen();

        pen2.color = "Green";
        pen2.brand = "Camlin";
        pen2.cost = 20;

        pen2.write();

        System.out.println(pen2.brand+" "+pen2.color+" "+(pen2.cost+5));
    }
}