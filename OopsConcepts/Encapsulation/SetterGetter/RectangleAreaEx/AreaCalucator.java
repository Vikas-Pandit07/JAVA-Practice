package OopsConcepts.Encapsulation.SetterGetter.RectangleAreaEx;

public class AreaCalucator {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);

        System.out.println("Initial Rectangle Details");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.area());

        rect1.setLength(7.0);
        rect1.setWidth(-2.0);

        System.out.println("Final Rectangle Details");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.area());
    }
}
