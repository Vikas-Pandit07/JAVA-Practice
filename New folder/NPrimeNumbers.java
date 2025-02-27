import java.util.Scanner;
public class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scan.nextInt();
        System.out.println("The first "+n+" prime numbers are:");

        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }

        scan.close();
    }
    static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
