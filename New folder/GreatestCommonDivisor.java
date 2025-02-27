import java.util.Scanner;
public class GreatestCommonDivisor {

public static void main(String[] ignoredArgs) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number n");
    int num1 = scan.nextInt();

    System.out.println("Enter number m");
    int num2 = scan.nextInt();

    int temp = gcd(num1, num2);

    System.out.println("The GCD of "+num1+" and "+num2+" is "+ temp);
    scan.close();
}
    public static int gcd(int n, int m) {
        while (m != 0){
        int rem = m;
        m = n % m;
        n = rem;
        }
        return n;
    }
}