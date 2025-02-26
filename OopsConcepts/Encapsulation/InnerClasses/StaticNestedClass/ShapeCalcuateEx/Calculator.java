package OopsConcepts.Encapsulation.InnerClasses.StaticNestedClass.ShapeCalcuateEx;

public class Calculator {
    static class Circle {
        public static double calArea(double radius) {
          return Math.PI * radius * radius;
        }
        public static double calPerimeter(double radius) {
            return 2 * Math.PI * radius;
        }
    }
    static class Rectangle {
        public static double calArea(double length, double width) {
            return length * width;
        }
        public static double calPerimeter(double length, double width) {
            return 2 * (length + width) ;
        }
    }
}
