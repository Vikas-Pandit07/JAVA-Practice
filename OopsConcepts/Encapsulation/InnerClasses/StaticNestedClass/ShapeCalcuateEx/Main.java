package OopsConcepts.Encapsulation.InnerClasses.StaticNestedClass.ShapeCalcuateEx;

public class Main {
    public static void main(String[] args) {
    double circleArea = Calculator.Circle.calArea(5);
    double circlePeri = Calculator.Circle.calPerimeter(5);
        System.out.println("Area: " + circleArea);
        System.out.println("Perimeter: " + circlePeri);

        double rectArea = Calculator.Rectangle.calArea(10, 20);
        double rectPeri = Calculator.Rectangle.calPerimeter(10, 20);
        System.out.println("Area: " + rectArea);
        System.out.println("Perimeter: " + rectPeri);
    }
}
