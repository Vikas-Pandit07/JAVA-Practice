import java.util.Scanner;

public class FibonacciNthNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scan.nextInt();

        if (n == 0) {
            System.out.println("the"+n+" the fibonacci number is"+n);
        }
        else if(n == 1) {
            System.out.println("the"+n+" the fibonacci number is"+n);
        }
        else {
            int a = 0; int b = 1; int fib = 0;
            for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
            System.out.println("the"+n+" the fibonacci number is "+ fib);
        }
        scan.close();
    }
}