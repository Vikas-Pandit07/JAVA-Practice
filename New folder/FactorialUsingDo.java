import java.util.Scanner;

public class FactorialUsingDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number(N): ");
        int N = scan.nextInt();

        System.out.println("Enter number(M): ");
        int M = scan.nextInt();

        int factorialN = 1;
        do {
            factorialN *= N;
            N--;
        }while (N > 0);
    
        int factorialM = 1;
            do {
                factorialM *= M;
                M--;
            }while (M > 0);

        System.out.println("Factorial of " + N + " is: " + factorialN);
        System.out.println("Factorial of " + M + " is: " + factorialM);
        
        scan.close();
    }
}
