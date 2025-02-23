package com.kodnest.oops.Overriding;

class Shape {
    Shape draw() {
        System.out.println("Shape is drawing");
        return this;
    }
}
class Circle extends Shape {
    Circle draw() {
        System.out.println("Circle is drawing");
        return this;
    }
}
class Rectangle extends Shape {
    Rectangle draw() {
        System.out.println("Rectangle is drawing");
        return this;
    }
}

public class CoVaritentEx2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Shape drawShape = shape.draw();
        Circle drawCircle = circle.draw();
        Rectangle drawRectangle = rectangle.draw();

        System.out.println("Returned object is type of: " + drawShape.getClass().getSimpleName());
        System.out.println("Returned object is type of: " + drawCircle.getClass().getSimpleName());
        System.out.println("Returned object is type of: " + drawRectangle.getClass().getSimpleName());

    }
}

