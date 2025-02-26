package OopsConcepts.Encapsulation.InnerClasses.StaticNestedClass.MathEx;

public class Calculator {
    static class MathOperations {
        public static int add(int a, int b) {
            return a + b;
        }
        public static int sub(int a, int b) {
            return a - b;
        }
        public static int mul(int a, int b) {
            return a * b;
        }
        public static int div(int a, int b) {
            return a / b;
        }
    }
}
