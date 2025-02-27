public class Calculator {
    public static void main(String[] args) {
        add();
        sub();
        System.out.println(mul(20, 05));
        System.out.println(div(20,5));
    }
    public static void add() {
        int a=10, b=20;
        int c=a+b;
        System.out.println(c);
    }
    public static void sub() {
        int a=10, b=20;
        int c=a-b;
        System.out.println(c);
    }
    public static int mul(int x, int y) {
        return x*y;
    }
    public static double div(int x, int y) {
        return x/y;
    }
}
