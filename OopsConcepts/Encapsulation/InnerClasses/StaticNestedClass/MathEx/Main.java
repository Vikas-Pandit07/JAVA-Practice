package OopsConcepts.Encapsulation.InnerClasses.StaticNestedClass.MathEx;

public class Main {
    public static void main(String[] args) {
        int addition = Calculator.MathOperations.add(10, 5);
        int subtract = Calculator.MathOperations.sub(14, 5);
        int multiply = Calculator.MathOperations.mul(10, 5);
        double divide = Calculator.MathOperations.div(100, 5);

        System.out.println("Add: " + addition);
        System.out.println("Sub: " + subtract);
        System.out.println("Mul: " + multiply);
        System.out.println("Div: " + divide);
    }
}
