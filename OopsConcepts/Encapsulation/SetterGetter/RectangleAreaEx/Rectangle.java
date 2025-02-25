package OopsConcepts.Encapsulation.SetterGetter.RectangleAreaEx;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = (length >= 0) ? length: 0.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width >= 0) ? width: 0.0;
    }

    public double area() {
        return length * width;
    }
}
